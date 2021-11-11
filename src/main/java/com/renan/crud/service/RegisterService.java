package com.renan.crud.service;

import com.renan.crud.model.Register;

import java.util.List;

public interface RegisterService {
    List<Register> getAllRegisters();
    void saveRegister(Register register);
    Register getRegisterById(long id);
    void deleteById(long id);
}
