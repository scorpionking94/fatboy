package com.undisputedmaster.fatboy.controller;

import com.undisputedmaster.fatboy.assembler.AgentAssembler;
import com.undisputedmaster.fatboy.entity.AgentEntity;
import com.undisputedmaster.fatboy.model.AgentModel;
import com.undisputedmaster.fatboy.service.AgentService;
import com.undisputedmaster.fatboy.util.Helper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by Swapnil.Khandizod on 05-07-2018.
 */
@RestController
public class AgentController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AgentService agentService;

    @ApiOperation(value = "Add a new Agent", notes = "Add Agent to DB",
            response = AgentModel.class)
    @PostMapping("/agent/addAgent")
    public ModelMap registerUserToDb(@RequestBody AgentModel model) {
        if(null!=agentService.findOneByEmail(model.getEmail()))
            return new ModelMap("Error","Email Already Present");
        logger.info("Saving Agent To Db");
        AgentEntity entity = AgentAssembler.getAgentEntityFromModel(model);
        entity.setAgentId(Helper.getRandomUUID());
        entity.setCreatedDate(Helper.getCurrentTime());
        return new ModelMap("AgentModel",agentService.save(entity));

    }
    @ApiOperation(value = "Get List of All Agents", notes = "Provide Criteria For Agent",
            response = AgentEntity.class,responseContainer = "List")
    @GetMapping("/rest/agent/getAllAgents")
    public List<AgentEntity> getAllUsers(){
        return agentService.findAll();
    }

}
