/*
 * Result Copy Reactor Web Server.
 * This server contains services like getting the patient details, child details, category details of result, copy the results from mother to the child.
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.resultcopy.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** Baby result information that is to be copied and be linked to the baby. */
@Schema(description = "Baby result information that is to be copied and be linked to the baby.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen",
    date = "2021-06-10T12:22:56.778Z[GMT]")
public class BabyResult {
  @JsonProperty("childId")
  private Integer childId = null;

  @JsonProperty("categoryName")
  private String categoryName = null;

  @JsonProperty("resultName")
  private String resultName = null;

  @JsonProperty("value")
  private String value = null;

  public BabyResult childId(Integer childId) {
    this.childId = childId;
    return this;
  }

  /**
   * Identifier for a child.
   *
   * @return childId
   */
  @JsonProperty("childId")
  @Schema(example = "35", description = "Identifier for a child.")
  public Integer getChildId() {
    return childId;
  }

  public void setChildId(Integer childId) {
    this.childId = childId;
  }

  public BabyResult categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Name of the category.
   *
   * @return categoryName
   */
  @JsonProperty("categoryName")
  @Schema(example = "DELIVERY_INFORMATION", description = "Name of the category.")
  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public BabyResult resultName(String resultName) {
    this.resultName = resultName;
    return this;
  }

  /**
   * The result name for a particular category.
   *
   * @return resultName
   */
  @JsonProperty("resultName")
  @Schema(example = "PREGNANCY_OUTCOME", description = "The result name for a particular category.")
  public String getResultName() {
    return resultName;
  }

  public void setResultName(String resultName) {
    this.resultName = resultName;
  }

  public BabyResult value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value associated with the result for the patient.
   *
   * @return value
   */
  @JsonProperty("value")
  @Schema(
      example = "VAGINAL_BIRTH",
      description = "The value associated with the result for the patient.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BabyResult babyResult = (BabyResult) o;
    return Objects.equals(this.childId, babyResult.childId)
        && Objects.equals(this.categoryName, babyResult.categoryName)
        && Objects.equals(this.resultName, babyResult.resultName)
        && Objects.equals(this.value, babyResult.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childId, categoryName, resultName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabyResult {\n");

    sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    resultName: ").append(toIndentedString(resultName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
