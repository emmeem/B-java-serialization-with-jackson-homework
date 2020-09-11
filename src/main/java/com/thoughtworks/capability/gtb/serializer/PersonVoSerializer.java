package com.thoughtworks.capability.gtb.serializer;


import com.fasterxml.jackson.core.JsonGenerator;

import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;


public class PersonVoSerializer extends StdSerializer<PersonVo> {
    protected PersonVoSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo person, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();

        gen.writeStringField("id", person.getId());
        if(person.getAge() == null) {
            gen.writeNumberField("age",0);
        }else {
            gen.writeNumberField("age",person.getAge());
        }
        gen.writeStringField("name", person.getName());
        if(person.getHobby() != null) {
            gen.writeStringField("hobby", person.getHobby());
        }
        gen.writeEndObject();
    }
}
