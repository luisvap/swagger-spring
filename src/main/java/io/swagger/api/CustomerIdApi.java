/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Person;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-06T17:30:10.835Z")

@Validated
@Api(value = "{customerId}", description = "the {customerId} API")
@RequestMapping(value = "/cadatral")
public interface CustomerIdApi {

    @ApiOperation(value = "Search information about Cadastral information from the customers", nickname = "searchCustomer", notes = "Search of Cadastral through the customerId", response = Person.class, authorizations = {
        @Authorization(value = "token-header")
    }, tags={ "Cadastral", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The Cadastral object", response = Person.class),
        @ApiResponse(code = 401, message = "User is not authorized to exectute this operation"),
        @ApiResponse(code = 403, message = "User doesn´t have permission to execute this operation"),
        @ApiResponse(code = 404, message = "Register not found"),
        @ApiResponse(code = 500, message = "Error: Internal Server Error. Please verify system logs") })
    @RequestMapping(value = "/{customerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Person> searchCustomer(@ApiParam(value = "CustomerId can be a CPF number",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "API version" , defaultValue="1.1") @RequestHeader(value="x-api-version", required=false) String xApiVersion);

}