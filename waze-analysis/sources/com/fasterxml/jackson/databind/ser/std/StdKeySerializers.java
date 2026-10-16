package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.util.Calendar;
import java.util.Date;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class StdKeySerializers {
    protected static final JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
    protected static final JsonSerializer<Object> DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

    /* compiled from: WazeSource */
    public class Default extends StdSerializer<Object> {
        static final int TYPE_BYTE_ARRAY = 7;
        static final int TYPE_CALENDAR = 2;
        static final int TYPE_CLASS = 3;
        static final int TYPE_DATE = 1;
        static final int TYPE_ENUM = 4;
        static final int TYPE_INTEGER = 5;
        static final int TYPE_LONG = 6;
        static final int TYPE_TO_STRING = 8;
        protected final int _typeId;

        public Default(int i2, Class<?> cls) {
            super(cls, false);
            this._typeId = i2;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            String strValueOf;
            switch (this._typeId) {
                case 1:
                    serializerProvider.defaultSerializeDateKey((Date) obj, jsonGenerator);
                    break;
                case 2:
                    serializerProvider.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    break;
                case 3:
                    jsonGenerator.writeFieldName(((Class) obj).getName());
                    break;
                case 4:
                    if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r1 = (Enum) obj;
                        strValueOf = serializerProvider.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r1.ordinal()) : r1.name();
                    }
                    jsonGenerator.writeFieldName(strValueOf);
                    break;
                case 5:
                case 6:
                    jsonGenerator.writeFieldId(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.writeFieldName(serializerProvider.getConfig().getBase64Variant().encode((byte[]) obj));
                    break;
                default:
                    jsonGenerator.writeFieldName(obj.toString());
                    break;
            }
        }
    }

    /* compiled from: WazeSource */
    public class Dynamic extends StdSerializer<Object> {
        protected transient PropertySerializerMap _dynamicSerializers;

        public Dynamic() {
            super(String.class, false);
            this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        }

        protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) {
            if (cls == Object.class) {
                Default r4 = new Default(8, cls);
                this._dynamicSerializers = propertySerializerMap.newWith(cls, r4);
                return r4;
            }
            PropertySerializerMap.SerializerAndMapResult serializerAndMapResultFindAndAddKeySerializer = propertySerializerMap.findAndAddKeySerializer(cls, serializerProvider, null);
            PropertySerializerMap propertySerializerMap2 = serializerAndMapResultFindAndAddKeySerializer.map;
            if (propertySerializerMap != propertySerializerMap2) {
                this._dynamicSerializers = propertySerializerMap2;
            }
            return serializerAndMapResultFindAndAddKeySerializer.serializer;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
            visitStringFormat(jsonFormatVisitorWrapper, javaType);
        }

        Object readResolve() {
            this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            Class<?> cls = obj.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
            if (jsonSerializerSerializerFor == null) {
                jsonSerializerSerializerFor = _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
            }
            jsonSerializerSerializerFor.serialize(obj, jsonGenerator, serializerProvider);
        }
    }

    /* compiled from: WazeSource */
    public class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            jsonGenerator.writeFieldName((String) obj);
        }
    }

    @Deprecated
    public static JsonSerializer<Object> getDefault() {
        return DEFAULT_KEY_SERIALIZER;
    }

    public static JsonSerializer<Object> getFallbackKeySerializer(SerializationConfig serializationConfig, Class<?> cls, AnnotatedClass annotatedClass) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (ClassUtil.isEnumType(cls)) {
                return EnumKeySerializer.construct(cls, EnumValues.constructFromName(serializationConfig, annotatedClass), EnumSerializer.constructEnumNamingStrategyValues(serializationConfig, cls, annotatedClass));
            }
        }
        return new Default(8, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> getStdKeySerializer(com.fasterxml.jackson.databind.SerializationConfig r1, java.lang.Class<?> r2, boolean r3) {
        /*
            if (r2 == 0) goto L67
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r2 != r1) goto L8
            goto L67
        L8:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r2 != r1) goto Lf
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r1 = com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DEFAULT_STRING_SERIALIZER
            return r1
        Lf:
            boolean r1 = r2.isPrimitive()
            if (r1 == 0) goto L19
            java.lang.Class r2 = com.fasterxml.jackson.databind.util.ClassUtil.wrapperType(r2)
        L19:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r2 != r1) goto L1f
            r1 = 5
            goto L61
        L1f:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r2 != r1) goto L25
            r1 = 6
            goto L61
        L25:
            boolean r1 = r2.isPrimitive()
            r0 = 8
            if (r1 != 0) goto L60
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L36
            goto L60
        L36:
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            if (r2 != r1) goto L3c
            r1 = 3
            goto L61
        L3c:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L46
            r1 = 1
            goto L61
        L46:
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L50
            r1 = 2
            goto L61
        L50:
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            if (r2 != r1) goto L55
            goto L60
        L55:
            java.lang.Class<byte[]> r1 = byte[].class
            if (r2 != r1) goto L5b
            r1 = 7
            goto L61
        L5b:
            if (r3 == 0) goto L5e
            goto L60
        L5e:
            r1 = 0
            return r1
        L60:
            r1 = r0
        L61:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default r3 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default
            r3.<init>(r1, r2)
            return r3
        L67:
            com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic r1 = new com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getStdKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, java.lang.Class, boolean):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* compiled from: WazeSource */
    public class EnumKeySerializer extends StdSerializer<Object> {
        protected final EnumValues _values;
        protected final EnumValues _valuesByEnumNaming;

        protected EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this._values = enumValues;
            this._valuesByEnumNaming = null;
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.writeFieldName(obj.toString());
                return;
            }
            Enum<?> r2 = (Enum) obj;
            EnumValues enumValues = this._valuesByEnumNaming;
            if (enumValues != null) {
                jsonGenerator.writeFieldName(enumValues.serializedValueFor(r2));
            } else if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.writeFieldName(String.valueOf(r2.ordinal()));
            } else {
                jsonGenerator.writeFieldName(this._values.serializedValueFor(r2));
            }
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues, EnumValues enumValues2) {
            return new EnumKeySerializer(cls, enumValues, enumValues2);
        }

        protected EnumKeySerializer(Class<?> cls, EnumValues enumValues, EnumValues enumValues2) {
            super(cls, false);
            this._values = enumValues;
            this._valuesByEnumNaming = enumValues2;
        }
    }
}
