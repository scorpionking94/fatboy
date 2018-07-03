package com.undisputedmaster.fatboy.repository;

import com.undisputedmaster.fatboy.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Swapnil.Khandizod on 26-06-2018.
 */
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    public UserEntity findOneByEmailAndPassword(String email , String password);
    public UserEntity findOneByEmail(String email);
}