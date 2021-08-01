package com.epam.digital.data.platform.excerpt.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Request<T> {

  @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
  private T payload;

  public Request() {
  }

  public Request(T payload) {
    this.payload = payload;
  }

  public T getPayload() {
    return payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }
}
