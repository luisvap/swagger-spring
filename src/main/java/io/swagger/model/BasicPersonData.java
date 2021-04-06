package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicPersonData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-06T17:30:10.835Z")


public class BasicPersonData   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("motherName")
  private String motherName = null;

  @JsonProperty("personType")
  private String personType = null;

  @JsonProperty("documentNumber")
  private String documentNumber = null;

  @JsonProperty("birthday")
  private LocalDate birthday = null;

  @JsonProperty("age")
  private String age = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("maritalStatus")
  private String maritalStatus = null;

  @JsonProperty("numberDependents")
  private BigDecimal numberDependents = null;

  @JsonProperty("educationalLevel")
  private String educationalLevel = null;

  @JsonProperty("cityOfBirth")
  private String cityOfBirth = null;

  @JsonProperty("nationality")
  private String nationality = null;

  @JsonProperty("publiclyExposed")
  private Boolean publiclyExposed = null;

  @JsonProperty("deceased")
  private Boolean deceased = null;

  @JsonProperty("updateDate")
  private LocalDate updateDate = null;

  public BasicPersonData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Cliente da Silva", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BasicPersonData motherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  /**
   * Get motherName
   * @return motherName
  **/
  @ApiModelProperty(example = "Mãe do Cliente da Silva", value = "")


  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  public BasicPersonData personType(String personType) {
    this.personType = personType;
    return this;
  }

  /**
   * Get personType
   * @return personType
  **/
  @ApiModelProperty(value = "")


  public String getPersonType() {
    return personType;
  }

  public void setPersonType(String personType) {
    this.personType = personType;
  }

  public BasicPersonData documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  **/
  @ApiModelProperty(example = "00664680275", value = "")


  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public BasicPersonData birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  **/
  @ApiModelProperty(example = "2020-07-15", value = "")

  @Valid

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public BasicPersonData age(String age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(example = "21", value = "")


  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public BasicPersonData gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "M", value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public BasicPersonData maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @ApiModelProperty(example = "casado", value = "")


  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public BasicPersonData numberDependents(BigDecimal numberDependents) {
    this.numberDependents = numberDependents;
    return this;
  }

  /**
   * Get numberDependents
   * @return numberDependents
  **/
  @ApiModelProperty(example = "2.0", value = "")

  @Valid

  public BigDecimal getNumberDependents() {
    return numberDependents;
  }

  public void setNumberDependents(BigDecimal numberDependents) {
    this.numberDependents = numberDependents;
  }

  public BasicPersonData educationalLevel(String educationalLevel) {
    this.educationalLevel = educationalLevel;
    return this;
  }

  /**
   * Get educationalLevel
   * @return educationalLevel
  **/
  @ApiModelProperty(example = "Superior Completo", value = "")


  public String getEducationalLevel() {
    return educationalLevel;
  }

  public void setEducationalLevel(String educationalLevel) {
    this.educationalLevel = educationalLevel;
  }

  public BasicPersonData cityOfBirth(String cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
    return this;
  }

  /**
   * Get cityOfBirth
   * @return cityOfBirth
  **/
  @ApiModelProperty(example = "SP", value = "")


  public String getCityOfBirth() {
    return cityOfBirth;
  }

  public void setCityOfBirth(String cityOfBirth) {
    this.cityOfBirth = cityOfBirth;
  }

  public BasicPersonData nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  **/
  @ApiModelProperty(value = "")


  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public BasicPersonData publiclyExposed(Boolean publiclyExposed) {
    this.publiclyExposed = publiclyExposed;
    return this;
  }

  /**
   * Get publiclyExposed
   * @return publiclyExposed
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isPubliclyExposed() {
    return publiclyExposed;
  }

  public void setPubliclyExposed(Boolean publiclyExposed) {
    this.publiclyExposed = publiclyExposed;
  }

  public BasicPersonData deceased(Boolean deceased) {
    this.deceased = deceased;
    return this;
  }

  /**
   * Get deceased
   * @return deceased
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isDeceased() {
    return deceased;
  }

  public void setDeceased(Boolean deceased) {
    this.deceased = deceased;
  }

  public BasicPersonData updateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(example = "2020-07-15", value = "")

  @Valid

  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(LocalDate updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicPersonData basicPersonData = (BasicPersonData) o;
    return Objects.equals(this.name, basicPersonData.name) &&
        Objects.equals(this.motherName, basicPersonData.motherName) &&
        Objects.equals(this.personType, basicPersonData.personType) &&
        Objects.equals(this.documentNumber, basicPersonData.documentNumber) &&
        Objects.equals(this.birthday, basicPersonData.birthday) &&
        Objects.equals(this.age, basicPersonData.age) &&
        Objects.equals(this.gender, basicPersonData.gender) &&
        Objects.equals(this.maritalStatus, basicPersonData.maritalStatus) &&
        Objects.equals(this.numberDependents, basicPersonData.numberDependents) &&
        Objects.equals(this.educationalLevel, basicPersonData.educationalLevel) &&
        Objects.equals(this.cityOfBirth, basicPersonData.cityOfBirth) &&
        Objects.equals(this.nationality, basicPersonData.nationality) &&
        Objects.equals(this.publiclyExposed, basicPersonData.publiclyExposed) &&
        Objects.equals(this.deceased, basicPersonData.deceased) &&
        Objects.equals(this.updateDate, basicPersonData.updateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, motherName, personType, documentNumber, birthday, age, gender, maritalStatus, numberDependents, educationalLevel, cityOfBirth, nationality, publiclyExposed, deceased, updateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicPersonData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    motherName: ").append(toIndentedString(motherName)).append("\n");
    sb.append("    personType: ").append(toIndentedString(personType)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    numberDependents: ").append(toIndentedString(numberDependents)).append("\n");
    sb.append("    educationalLevel: ").append(toIndentedString(educationalLevel)).append("\n");
    sb.append("    cityOfBirth: ").append(toIndentedString(cityOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    publiclyExposed: ").append(toIndentedString(publiclyExposed)).append("\n");
    sb.append("    deceased: ").append(toIndentedString(deceased)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

