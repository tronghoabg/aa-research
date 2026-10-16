package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: WazeSource */
@JacksonStdImpl
/* loaded from: classes4.dex */
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final Class<?> _elementClass;
    protected JsonDeserializer<Object> _elementDeserializer;
    protected final TypeDeserializer _elementTypeDeserializer;
    protected final Object[] _emptyValue;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class<?> rawClass = arrayType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
        this._emptyValue = arrayType.getEmptyArray();
    }

    protected Object _deserializeNoNullChecks(JsonParser jsonParser, DeserializationContext deserializationContext) {
        TypeDeserializer typeDeserializer = this._elementTypeDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._elementDeserializer;
        return typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JavaType javaType = this._containerType;
        JsonDeserializer<?> jsonDeserializer = this._elementDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, javaType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializerFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializerForProperty = this._elementTypeDeserializer;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        return withResolved(typeDeserializerForProperty, jsonDeserializerFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerFindContextualValueDeserializer), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        Object obj_deserializeNoNullChecks;
        Object[] objArr = (Object[]) obj;
        if (!jsonParser.isExpectedStartArrayToken()) {
            Object[] objArr2 = (Object[]) handleNonArray(jsonParser, deserializationContext);
            if (objArr2 == null) {
                return objArr;
            }
            int length = objArr.length;
            int length2 = objArr2.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
            System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
            return objArrCopyOf;
        }
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length3 = objArr.length;
        Object[] objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart(objArr, length3);
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    break;
                }
                if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                    obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
                } else if (this._skipNullValues) {
                    continue;
                } else {
                    obj_deserializeNoNullChecks = null;
                }
                if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) {
                    if (length3 >= objArrResetAndStart.length) {
                        objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                        length3 = 0;
                    }
                    int i2 = length3 + 1;
                    try {
                        objArrResetAndStart[length3] = obj_deserializeNoNullChecks;
                        length3 = i2;
                    } catch (Exception e2) {
                        e = e2;
                        length3 = i2;
                        throw JsonMappingException.wrapWithPath(e, objArrResetAndStart, objectBufferLeaseObjectBuffer.bufferedSize() + length3);
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        Object[] objArrCompleteAndClearBuffer = this._untyped ? objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length3) : objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, length3, this._elementClass);
        deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
        return objArrCompleteAndClearBuffer;
    }

    protected Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) {
        byte[] binaryValue = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        int length = binaryValue.length;
        Byte[] bArr = new Byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = Byte.valueOf(binaryValue[i2]);
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return this._emptyValue;
    }

    protected Object handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        ObjectArrayDeserializer objectArrayDeserializer;
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        Object obj_deserializeNoNullChecks;
        CoercionAction coercionActionFindCoercionFromBlankString;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return jsonParser.hasToken(JsonToken.VALUE_STRING) ? this._elementClass == Byte.class ? deserializeFromBase64(jsonParser, deserializationContext) : _deserializeFromString(jsonParser, deserializationContext) : deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                String text = jsonParser.getText();
                if (text.isEmpty()) {
                    CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.EmptyString);
                    if (coercionActionFindCoercionAction != CoercionAction.Fail) {
                        return (Object[]) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionAction, handledType(), "empty String (\"\")");
                    }
                    objectArrayDeserializer = this;
                    jsonParser2 = jsonParser;
                    deserializationContext2 = deserializationContext;
                    obj_deserializeNoNullChecks = objectArrayDeserializer._deserializeNoNullChecks(jsonParser2, deserializationContext2);
                } else {
                    objectArrayDeserializer = this;
                    jsonParser2 = jsonParser;
                    deserializationContext2 = deserializationContext;
                    if (_isBlank(text) && (coercionActionFindCoercionFromBlankString = deserializationContext2.findCoercionFromBlankString(objectArrayDeserializer.logicalType(), objectArrayDeserializer.handledType(), CoercionAction.Fail)) != CoercionAction.Fail) {
                        return (Object[]) objectArrayDeserializer._deserializeFromEmptyString(jsonParser2, deserializationContext2, coercionActionFindCoercionFromBlankString, objectArrayDeserializer.handledType(), "blank String (all whitespace)");
                    }
                    obj_deserializeNoNullChecks = objectArrayDeserializer._deserializeNoNullChecks(jsonParser2, deserializationContext2);
                }
            } else {
                objectArrayDeserializer = this;
                jsonParser2 = jsonParser;
                deserializationContext2 = deserializationContext;
                obj_deserializeNoNullChecks = objectArrayDeserializer._deserializeNoNullChecks(jsonParser2, deserializationContext2);
            }
            return objectArrayDeserializer._emptyValue;
        }
        if (this._skipNullValues) {
            objectArrayDeserializer = this;
            return objectArrayDeserializer._emptyValue;
        }
        obj_deserializeNoNullChecks = null;
        objectArrayDeserializer = this;
        deserializationContext2 = deserializationContext;
        if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = objectArrayDeserializer._nullProvider.getNullValue(deserializationContext2)) != null || !objectArrayDeserializer._skipNullValues) {
            Object[] objArr = objectArrayDeserializer._untyped ? new Object[1] : (Object[]) Array.newInstance(objectArrayDeserializer._elementClass, 1);
            objArr[0] = obj_deserializeNoNullChecks;
            return objArr;
        }
        return objectArrayDeserializer._emptyValue;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    public ObjectArrayDeserializer withDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        return withResolved(typeDeserializer, jsonDeserializer, this._nullProvider, this._unwrapSingle);
    }

    public ObjectArrayDeserializer withResolved(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(bool, this._unwrapSingle) && nullValueProvider == this._nullProvider && jsonDeserializer == this._elementDeserializer && typeDeserializer == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(this, jsonDeserializer, typeDeserializer, nullValueProvider, bool);
    }

    protected ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(objectArrayDeserializer, nullValueProvider, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._emptyValue = objectArrayDeserializer._emptyValue;
        this._elementDeserializer = jsonDeserializer;
        this._elementTypeDeserializer = typeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws JsonMappingException {
        Object[] objArrCompleteAndClearBuffer;
        Object obj_deserializeNoNullChecks;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        ObjectBuffer objectBufferLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrResetAndStart = objectBufferLeaseObjectBuffer.resetAndStart();
        int i2 = 0;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    break;
                }
                if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                    obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
                } else if (this._skipNullValues) {
                    continue;
                } else {
                    obj_deserializeNoNullChecks = null;
                }
                if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) {
                    if (i2 >= objArrResetAndStart.length) {
                        objArrResetAndStart = objectBufferLeaseObjectBuffer.appendCompletedChunk(objArrResetAndStart);
                        i2 = 0;
                    }
                    int i3 = i2 + 1;
                    try {
                        objArrResetAndStart[i2] = obj_deserializeNoNullChecks;
                        i2 = i3;
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i3;
                        throw JsonMappingException.wrapWithPath(e, objArrResetAndStart, objectBufferLeaseObjectBuffer.bufferedSize() + i2);
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (this._untyped) {
            objArrCompleteAndClearBuffer = objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i2);
        } else {
            objArrCompleteAndClearBuffer = objectBufferLeaseObjectBuffer.completeAndClearBuffer(objArrResetAndStart, i2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(objectBufferLeaseObjectBuffer);
        return objArrCompleteAndClearBuffer;
    }
}
