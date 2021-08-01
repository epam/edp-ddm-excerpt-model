package com.epam.digital.data.platform.excerpt.dao;

import com.epam.digital.data.platform.excerpt.model.ExcerptProcessingStatus;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExcerptRecord {

  @Id
  @GeneratedValue
  private UUID id;

  private ExcerptProcessingStatus status;
  private String statusDetails;
  private String keycloakId;
  private String checksum;
  private String excerptKey;
  private Boolean signatureRequired;
  private String xSourceSystem;
  private String xSourceApplication;
  private String xSourceBusinessProcess;
  private String xSourceBusinessActivity;

  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExcerptProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(ExcerptProcessingStatus status) {
    this.status = status;
  }

  public String getStatusDetails() {
    return statusDetails;
  }

  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }

  public String getKeycloakId() {
    return keycloakId;
  }

  public void setKeycloakId(String keycloakId) {
    this.keycloakId = keycloakId;
  }

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public String getExcerptKey() {
    return excerptKey;
  }

  public void setExcerptKey(String excerptKey) {
    this.excerptKey = excerptKey;
  }

  public Boolean getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }

  public String getxSourceSystem() {
    return xSourceSystem;
  }

  public void setxSourceSystem(String xSourceSystem) {
    this.xSourceSystem = xSourceSystem;
  }

  public String getxSourceApplication() {
    return xSourceApplication;
  }

  public void setxSourceApplication(String xSourceApplication) {
    this.xSourceApplication = xSourceApplication;
  }

  public String getxSourceBusinessProcess() {
    return xSourceBusinessProcess;
  }

  public void setxSourceBusinessProcess(String xSourceBusinessProcess) {
    this.xSourceBusinessProcess = xSourceBusinessProcess;
  }

  public String getxSourceBusinessActivity() {
    return xSourceBusinessActivity;
  }

  public void setxSourceBusinessActivity(String xSourceBusinessActivity) {
    this.xSourceBusinessActivity = xSourceBusinessActivity;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExcerptRecord that = (ExcerptRecord) o;
    return Objects.equals(id, that.id) && Objects.equals(status, that.status)
        && Objects.equals(statusDetails, that.statusDetails) && Objects
        .equals(keycloakId, that.keycloakId) && Objects.equals(checksum, that.checksum)
        && Objects.equals(excerptKey, that.excerptKey) && Objects
        .equals(signatureRequired, that.signatureRequired) && Objects
        .equals(xSourceSystem, that.xSourceSystem) && Objects
        .equals(xSourceApplication, that.xSourceApplication) && Objects
        .equals(xSourceBusinessProcess, that.xSourceBusinessProcess) && Objects
        .equals(xSourceBusinessActivity, that.xSourceBusinessActivity) && Objects
        .equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(id, status, statusDetails, keycloakId, checksum, excerptKey, signatureRequired,
            xSourceSystem, xSourceApplication, xSourceBusinessProcess, xSourceBusinessActivity,
            createdAt, updatedAt);
  }
}
