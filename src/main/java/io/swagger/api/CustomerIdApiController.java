package io.swagger.api;

import io.swagger.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-06T17:30:10.835Z")

@Controller
public class CustomerIdApiController implements CustomerIdApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerIdApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerIdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Person> searchCustomer(@ApiParam(value = "CustomerId can be a CPF number",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "API version" , defaultValue="1.1") @RequestHeader(value="x-api-version", required=false) String xApiVersion) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Person>(objectMapper.readValue("{  \"documents\" : \"\",  \"basicPersonData\" : {    \"birthday\" : \"2020-07-15\",    \"publiclyExposed\" : true,    \"updateDate\" : \"2020-07-15\",    \"deceased\" : true,    \"gender\" : \"M\",    \"documentNumber\" : \"00664680275\",    \"numberDependents\" : 2.0,    \"motherName\" : \"Mãe do Cliente da Silva\",    \"cityOfBirth\" : \"SP\",    \"nationality\" : \"nationality\",    \"name\" : \"Cliente da Silva\",    \"personType\" : \"personType\",    \"age\" : \"21\",    \"maritalStatus\" : \"casado\",    \"educationalLevel\" : \"Superior Completo\"  }}", Person.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Person>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Person>(HttpStatus.NOT_IMPLEMENTED);
    }

}
