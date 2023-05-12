package com.makuska.demo.controller;

import com.makuska.demo.entity.Lemmikloom;
import com.makuska.demo.entity.Omanik;
import com.makuska.demo.service.serviceImpl.Omanikservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/omanik")
public class OmanikController {

    private final Omanikservice omanikservice;

    public OmanikController(Omanikservice omanikservice) {
        this.omanikservice = omanikservice;
    }

    @PostMapping("/uusLoom")
    public ResponseEntity<Omanik> lisaUusLoom(@RequestBody Lemmikloom lemmikloom){
        return new ResponseEntity<>(this.omanikservice.lisaUusLoom(lemmikloom), HttpStatus.CREATED);
    }

}

//Tee klass Lemmikloom (nimetus, kaal) ning võimalda teda andmebaasi lisada. Lisa klass Omanik,
// kes seo Lemmikloomaga üks-mitmele seose kaudu. Võimalda Omanikule juurde lisada lemmikloomi.