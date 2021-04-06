package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BasicPersonData;
import io.swagger.model.Documents;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-06T17:30:10.835Z")


public class Person   {
  @JsonProperty("basicPersonData")
  private BasicPersonData basicPersonData = null;

  @JsonProperty("documents")
  private Documents documents = null;

  public Person basicPersonData(BasicPersonData basicPersonData) {
    this.basicPersonData = basicPersonData;
    return this;
  }

  /**
   * Get basicPersonData
   * @return basicPersonData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BasicPersonData getBasicPersonData() {
    return basicPersonData;
  }

  public void setBasicPersonData(BasicPersonData basicPersonData) {
    this.basicPersonData = basicPersonData;
  }

  public Person documents(Documents documents) {
    this.documents = documents;
    return this;
  }

  /**
   * Get documents
   * @return documents
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Documents getDocuments() {
    return documents;
  }

  public void setDocuments(Documents documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.basicPersonData, person.basicPersonData) &&
        Objects.equals(this.documents, person.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicPersonData, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    basicPersonData: ").append(toIndentedString(basicPersonData)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

