package com.egnosistek.compmodservice.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// import java.sql.Date;

@RestController
//@MapperScan({"com.egnosistek.compmodservice.dao", "com.egnosistek.compmodservice.mappers"})
@RequestMapping("compmodservice")
public class CompModController {


    @RequestMapping(value = "/helloCheck", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> getUserInfo() {
        try {
            return new ResponseEntity<>(new String("This is response from the helloCheck endpoint "), HttpStatus.OK);

        } catch (Exception ex) {
            ex.printStackTrace();
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }


}