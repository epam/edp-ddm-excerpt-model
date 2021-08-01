package com.epam.digital.data.platform.excerpt.model;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class ExcerptEventDto {

  private UUID recordId;
  private String excerptType;
  private Map<String, Object> excerptInputData;
  private boolean requiresSystemSignature;

  public ExcerptEventDto() {
  }

  public ExcerptEventDto(UUID recordId, String excerptType, Map<String, Object> excerptInputData,
      boolean requiresSystemSignature) {
    this.recordId = recordId;
    this.excerptType = excerptType;
    this.excerptInputData = excerptInputData;
    this.requiresSystemSignature = requiresSystemSignature;
  }

  public UUID getRecordId() {
    return recordId;
  }

  public void setRecordId(UUID recordId) {
    this.recordId = recordId;
  }

  public String getExcerptType() {
    return excerptType;
  }

  public void setExcerptType(String excerptType) {
    this.excerptType = excerptType;
  }

  public Map<String, Object> getExcerptInputData() {
    return excerptInputData;
  }

  public void setExcerptInputData(Map<String, Object> excerptInputData) {
    this.excerptInputData = excerptInputData;
  }

  public boolean isRequiresSystemSignature() {
    return requiresSystemSignature;
  }

  public void setRequiresSystemSignature(boolean requiresSystemSignature) {
    this.requiresSystemSignature = requiresSystemSignature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcerptEventDto that = (ExcerptEventDto) o;
    return requiresSystemSignature == that.requiresSystemSignature && Objects
        .equals(recordId, that.recordId) && Objects.equals(excerptType, that.excerptType)
        && Objects.equals(excerptInputData, that.excerptInputData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordId, excerptType, excerptInputData, requiresSystemSignature);
  }
}
