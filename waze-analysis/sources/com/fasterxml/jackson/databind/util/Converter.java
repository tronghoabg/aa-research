package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface Converter<IN, OUT> {
    OUT convert(DeserializationContext deserializationContext, IN in);

    OUT convert(SerializerProvider serializerProvider, IN in);

    OUT convert(IN in);

    JavaType getInputType(TypeFactory typeFactory);

    JavaType getOutputType(TypeFactory typeFactory);

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.Converter$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$convert(Converter converter, DeserializationContext deserializationContext, Object obj) {
            return converter.convert(obj);
        }

        public static Object $default$convert(Converter converter, SerializerProvider serializerProvider, Object obj) {
            return converter.convert(obj);
        }
    }

    /* compiled from: WazeSource */
    public abstract class None implements Converter<Object, Object> {
        private None() {
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public /* synthetic */ Object convert(DeserializationContext deserializationContext, Object obj) {
            return CC.$default$convert(this, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public /* synthetic */ Object convert(SerializerProvider serializerProvider, Object obj) {
            return CC.$default$convert(this, serializerProvider, obj);
        }
    }
}
