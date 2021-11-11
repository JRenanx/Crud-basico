package com.renan.crud.service;

import com.renan.crud.model.Register;
import com.renan.crud.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public List<Register> getAllRegisters() {
        return registerRepository.findAll();
    }

    @Override
    public void saveRegister(Register register) {
        this.registerRepository.save(register);
    }

    @Override
    public Register getRegisterById(long id) {
        Optional<Register> optional = registerRepository.findById(id);
        Register register = null;
        if (optional.isPresent()){
            register = optional.get();
        }else {
            throw new RuntimeException("Register not found fot id :: " + id);
        }
        return register;
    }

    @Override
    public void deleteById(long id) {
        this.registerRepository.deleteById(id);
    }
}
