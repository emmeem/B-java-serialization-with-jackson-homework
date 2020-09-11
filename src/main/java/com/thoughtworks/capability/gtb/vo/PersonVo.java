package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import com.thoughtworks.capability.gtb.serializer.PersonVoSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = PersonVoSerializer.class)
public class PersonVo {

  private String id;

  private Integer age;

  private String name;

  //@JsonInclude(JsonInclude.Include.NON_NULL)
  private String hobby;
}
