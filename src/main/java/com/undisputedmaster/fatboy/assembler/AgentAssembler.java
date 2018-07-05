package com.undisputedmaster.fatboy.assembler;

import com.undisputedmaster.fatboy.entity.AgentEntity;
import com.undisputedmaster.fatboy.model.AgentModel;

/**
 * Created by Swapnil.Khandizod on 05-07-2018.
 */
public class AgentAssembler {
    public static AgentEntity getAgentEntityFromModel(AgentModel model){
    if(null== model)
        return null;
        AgentEntity entity = new AgentEntity();
        entity.setEmail(model.getEmail());
        entity.setPassword(model.getPassword());
        entity.setFirstName(model.getFirstName());
        entity.setMiddleName(model.getMiddleName());
        entity.setLastName(model.getLastName());
        entity.setGender(model.getGender());
        entity.setDateOfBirth(model.getDateOfBirth());
        entity.setCurrentAddress(model.getCurrentAddress());
        entity.setCity(model.getCity());
        entity.setCountry(model.getCountry());
        entity.setState(model.getState());
        entity.setAadharId(model.getAadharId());
        entity.setPanId(model.getPanId());
        entity.setContactNumber(model.getContactNumber());
        entity.setReferredBy(model.getReferredBy());
        entity.setPaymentProvider(model.getPaymentProvider());
        entity.setCountryCode(model.getCountryCode());
        entity.setRating(model.getRating());
        entity.setBalance(model.getBalance());
        entity.setProfileCount(model.getProfileCount());
        return entity;
    }

    public static AgentModel getAgentModelFromEntity(AgentEntity entity){
        if(null==entity)return null;
        AgentModel model = new AgentModel();
        model.setEmail(entity.getEmail());
        model.setPassword(entity.getPassword());
        model.setFirstName(entity.getFirstName());
        model.setMiddleName(entity.getMiddleName());
        model.setLastName(entity.getLastName());
        model.setGender(entity.getGender());
        model.setDateOfBirth(entity.getDateOfBirth());
        model.setCurrentAddress(entity.getCurrentAddress());
        model.setCity(entity.getCity());
        model.setCountry(entity.getCountry());
        model.setState(entity.getState());
        model.setAadharId(entity.getAadharId());
        model.setPanId(entity.getPanId());
        model.setContactNumber(entity.getContactNumber());
        model.setReferredBy(entity.getReferredBy());
        model.setPaymentProvider(entity.getPaymentProvider());
        model.setCountryCode(entity.getCountryCode());
        model.setBalance(entity.getBalance());
        model.setRating(entity.getRating());
        model.setProfileCount(entity.getProfileCount());
        return model;
    }
}
