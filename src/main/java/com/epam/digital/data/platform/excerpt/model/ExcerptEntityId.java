package com.epam.digital.data.platform.excerpt.model;

import java.util.UUID;

public class ExcerptEntityId {

  private UUID excerptIdentifier;

  public ExcerptEntityId(UUID excerptIdentifier) {
    this.excerptIdentifier = excerptIdentifier;
  }

  public UUID getExcerptIdentifier() {
    return excerptIdentifier;
  }

  public void setExcerptIdentifier(UUID excerptIdentifier) {
    this.excerptIdentifier = excerptIdentifier;
  }

  @Override
  public String toString() {
    return "ExcerptEntityId{" +
        "excerptIdentifier=" + excerptIdentifier +
        '}';
  }
}
