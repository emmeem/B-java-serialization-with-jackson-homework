package com.thoughtworks.capability.gtb.serializer;


import com.fasterxml.jackson.core.JsonGenerator;

import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;


public class AgeSerializer extends StdSerializer<PersonVo> {
    protected AgeSerializer() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo person, JsonGenerator gen, SerializerProvider provider) throws IOException {

        if(person.getAge() == null) {
            person.setAge(0);
        }
    }
}
