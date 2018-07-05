package com.undisputedmaster.fatboy.repository;

import com.undisputedmaster.fatboy.entity.AgentEntity;
import com.undisputedmaster.fatboy.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Swapnil.Khandizod on 05-07-2018.
 */
public interface AgentRepository extends MongoRepository<AgentEntity, String> {
    public AgentEntity findOneByEmail(String email);
    public AgentEntity findOneByEmailAndPassword(String email , String password);
}
