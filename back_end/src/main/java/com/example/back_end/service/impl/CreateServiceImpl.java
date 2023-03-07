package com.example.back_end.service.impl;

import com.example.back_end.entity.CreateForm;
import com.example.back_end.mapper.CreateMapper;
import com.example.back_end.service.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateServiceImpl implements CreateService {

    @Autowired
    private CreateMapper createMapper;

    @Override
    public void createNFT(CreateForm createForm) {
        int success = createMapper.createNFT(createForm.getName(), createForm.getExternalLink(), createForm.getDescription(),
                createForm.getUrl(), createForm.getType(), createForm.getSize(), createForm.getCreateUser());
    }
}
