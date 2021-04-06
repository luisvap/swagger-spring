package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Document
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-04-06T17:30:10.835Z")


public class Document   {
  @JsonProperty("documentType")
  private String documentType = null;

  @JsonProperty("documentNumber")
  private String documentNumber = null;

  @JsonProperty("documentNumberStatus")
  private String documentNumberStatus = null;

  @JsonProperty("issuingAgency")
  private String issuingAgency = null;

  @JsonProperty("expiryDate")
  private LocalDate expiryDate = null;

  @JsonProperty("issueDate")
  private LocalDate issueDate = null;

  @JsonProperty("issuingState")
  private String issuingState = null;

  @JsonProperty("issuingCountry")
  private String issuingCountry = null;

  public Document documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")


  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Document documentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
    return this;
  }

  /**
   * Get documentNumber
   * @return documentNumber
  **/
  @ApiModelProperty(value = "")


  public String getDocumentNumber() {
    return documentNumber;
  }

  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }

  public Document documentNumberStatus(String documentNumberStatus) {
    this.documentNumberStatus = documentNumberStatus;
    return this;
  }

  /**
   * Get documentNumberStatus
   * @return documentNumberStatus
  **/
  @ApiModelProperty(example = "Ativo", value = "")


  public String getDocumentNumberStatus() {
    return documentNumberStatus;
  }

  public void setDocumentNumberStatus(String documentNumberStatus) {
    this.documentNumberStatus = documentNumberStatus;
  }

  public Document issuingAgency(String issuingAgency) {
    this.issuingAgency = issuingAgency;
    return this;
  }

  /**
   * Get issuingAgency
   * @return issuingAgency
  **/
  @ApiModelProperty(value = "")


  public String getIssuingAgency() {
    return issuingAgency;
  }

  public void setIssuingAgency(String issuingAgency) {
    this.issuingAgency = issuingAgency;
  }

  public Document expiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(LocalDate expiryDate) {
    this.expiryDate = expiryDate;
  }

  public Document issueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getIssueDate() {
    return issueDate;
  }

  public void setIssueDate(LocalDate issueDate) {
    this.issueDate = issueDate;
  }

  public Document issuingState(String issuingState) {
    this.issuingState = issuingState;
    return this;
  }

  /**
   * Get issuingState
   * @return issuingState
  **/
  @ApiModelProperty(example = "SP", value = "")


  public String getIssuingState() {
    return issuingState;
  }

  public void setIssuingState(String issuingState) {
    this.issuingState = issuingState;
  }

  public Document issuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

  /**
   * Get issuingCountry
   * @return issuingCountry
  **/
  @ApiModelProperty(example = "Brasil", value = "")


  public String getIssuingCountry() {
    return issuingCountry;
  }

  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.documentNumber, document.documentNumber) &&
        Objects.equals(this.documentNumberStatus, document.documentNumberStatus) &&
        Objects.equals(this.issuingAgency, document.issuingAgency) &&
        Objects.equals(this.expiryDate, document.expiryDate) &&
        Objects.equals(this.issueDate, document.issueDate) &&
        Objects.equals(this.issuingState, document.issuingState) &&
        Objects.equals(this.issuingCountry, document.issuingCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentType, documentNumber, documentNumberStatus, issuingAgency, expiryDate, issueDate, issuingState, issuingCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    documentNumberStatus: ").append(toIndentedString(documentNumberStatus)).append("\n");
    sb.append("    issuingAgency: ").append(toIndentedString(issuingAgency)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    issuingState: ").append(toIndentedString(issuingState)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
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

