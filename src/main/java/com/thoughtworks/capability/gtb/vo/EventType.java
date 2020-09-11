package com.thoughtworks.capability.gtb.vo;


import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  private String code;

  EventType(String code) {
    this.code = code;
  }

  @JsonValue
  final String value() {
    return this.code;
  }
}
