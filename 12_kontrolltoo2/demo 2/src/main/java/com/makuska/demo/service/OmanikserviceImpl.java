package com.makuska.demo.service;

import com.makuska.demo.entity.Lemmikloom;
import com.makuska.demo.entity.Omanik;
import com.makuska.demo.repository.OmanikRepository;
import com.makuska.demo.service.serviceImpl.Omanikservice;
import org.springframework.stereotype.Service;

@Service
public class OmanikserviceImpl implements Omanikservice {

    private final OmanikRepository omanikRepository;

    public OmanikserviceImpl(OmanikRepository omanikRepository) {
        this.omanikRepository = omanikRepository;
    }

    @Override
    public Omanik lisaUusLoom(Lemmikloom lemmikloom) {
        Omanik omanik = new Omanik();
        omanik.getLemmikloomad().add(lemmikloom);
        return this.omanikRepository.save(omanik);
    }
}
