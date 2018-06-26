package com.undisputedmaster.fatboy.assembler;

import com.undisputedmaster.fatboy.entity.UserEntity;
import com.undisputedmaster.fatboy.model.UserModel;

/**
 * Created by Swapnil.Khandizod on 26-06-2018.
 */
public class UserAssembler {

    public static UserEntity getUserEntityFromModel(UserModel model){
        if(model==null)
            return null;
        UserEntity entity = new UserEntity();
        entity.setEmail(model.getEmail());
        entity.setPassword(model.getPassword());
        entity.setFirstName(model.getFirstName());
        entity.setMiddleName(model.getMiddleName());
        entity.setLastName(model.getLastName());
        entity.setDateOfBirth(model.getDateOfBirth());
        entity.setCurrentAddress(model.getCurrentAddress());
        entity.setCity(model.getCity());
        entity.setCountry(model.getCountry());
        entity.setState(model.getState());
        entity.setReligion(model.getReligion());
        entity.setMotherTongue(model.getMotherTongue());
        entity.setAadharId(model.getAadharId());
        entity.setPanId(model.getPanId());
        entity.setContactNumber(model.getContactNumber());
        entity.setReferredBy(model.getReferredBy());
        entity.setPaymentProvider(model.getPaymentProvider());
        return entity;
    }

    public static UserModel getUserModelFromEntity(UserEntity entity){
        if(entity==null)
            return null;
        UserModel model = new UserModel();
        model.setEmail(entity.getEmail());
        model.setPassword(entity.getPassword());
        model.setFirstName(entity.getFirstName());
        model.setMiddleName(entity.getMiddleName());
        model.setLastName(entity.getLastName());
        model.setDateOfBirth(entity.getDateOfBirth());
        model.setCurrentAddress(entity.getCurrentAddress());
        model.setCity(entity.getCity());
        model.setCountry(entity.getCountry());
        model.setState(entity.getState());
        model.setReligion(entity.getReligion());
        model.setMotherTongue(entity.getMotherTongue());
        model.setAadharId(entity.getAadharId());
        model.setPanId(entity.getPanId());
        model.setContactNumber(entity.getContactNumber());
        model.setReferredBy(entity.getReferredBy());
        model.setPaymentProvider(entity.getPaymentProvider());
        return model;
    }
}
