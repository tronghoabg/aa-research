package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class StdConverter<IN, OUT> implements Converter<IN, OUT> {
    protected JavaType _findConverterType(TypeFactory typeFactory) {
        JavaType javaTypeFindSuperType = typeFactory.constructType(getClass()).findSuperType(Converter.class);
        if (javaTypeFindSuperType == null || javaTypeFindSuperType.containedTypeCount() < 2) {
            throw new IllegalStateException("Cannot find OUT type parameter for Converter of type ".concat(String.valueOf(getClass().getName())));
        }
        return javaTypeFindSuperType;
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public /* synthetic */ Object convert(DeserializationContext deserializationContext, Object obj) {
        return Converter.CC.$default$convert(this, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public abstract OUT convert(IN in);

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getInputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(0);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public JavaType getOutputType(TypeFactory typeFactory) {
        return _findConverterType(typeFactory).containedType(1);
    }

    @Override // com.fasterxml.jackson.databind.util.Converter
    public /* synthetic */ Object convert(SerializerProvider serializerProvider, Object obj) {
        return Converter.CC.$default$convert(this, serializerProvider, obj);
    }
}
