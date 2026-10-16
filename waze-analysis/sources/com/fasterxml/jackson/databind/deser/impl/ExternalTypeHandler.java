package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    /* compiled from: WazeSource */
    public class Builder {
        private final JavaType _beanType;
        private final List<ExtTypedProperty> _properties = new ArrayList();
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();

        protected Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this._nameToPropertyIndex.put(str, linkedList);
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer numValueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), numValueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), numValueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i2 = 0; i2 < size; i2++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i2);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (settableBeanPropertyFind != null) {
                    extTypedProperty.linkTypeProperty(settableBeanPropertyFind);
                }
                extTypedPropertyArr[i2] = extTypedProperty;
            }
            return new ExternalTypeHandler(this._beanType, extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    /* compiled from: WazeSource */
    final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.hasDefaultImpl();
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    protected ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i2) throws StreamWriteException, MismatchedInputException {
        if (!this._properties[i2].hasTypePropertyName(str)) {
            return false;
        }
        if (obj == null || this._tokens[i2] == null) {
            this._typeIds[i2] = str2;
            return true;
        }
        _deserializeAndSet(jsonParser, deserializationContext, obj, i2, str2);
        this._tokens[i2] = null;
        return true;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    protected final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i2, String str) throws StreamWriteException {
        JsonParser jsonParserAsParser = this._tokens[i2].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParserAsParser);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        return this._properties[i2].getProperty().deserialize(jsonParserAsParser2, deserializationContext);
    }

    protected final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i2, String str) throws StreamWriteException, MismatchedInputException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this._beanType, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser jsonParserAsParser = this._tokens[i2].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i2].getProperty().set(obj, null);
            return;
        }
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParserAsParser);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        this._properties[i2].getProperty().deserializeAndSet(jsonParserAsParser2, deserializationContext, obj);
    }

    protected final Object _deserializeMissingToken(JsonParser jsonParser, DeserializationContext deserializationContext, int i2, String str) {
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser.nextToken();
        return this._properties[i2].getProperty().deserialize(jsonParserAsParser, deserializationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r17, com.fasterxml.jackson.databind.DeserializationContext r18, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r19, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r4 = r0._properties
            int r4 = r4.length
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r7 = r6
        Lf:
            if (r7 >= r4) goto Lcf
            java.lang.String[] r8 = r0._typeIds
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r9 = r0._properties
            r8 = r8[r7]
            r9 = r9[r7]
            r10 = 1
            if (r8 != 0) goto L4e
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r0._tokens
            r11 = r11[r7]
            if (r11 == 0) goto Lcb
            com.fasterxml.jackson.core.JsonToken r11 = r11.firstToken()
            com.fasterxml.jackson.core.JsonToken r12 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r11 != r12) goto L2c
            goto Lcb
        L2c:
            boolean r11 = r9.hasDefaultType()
            if (r11 != 0) goto L4a
            com.fasterxml.jackson.databind.JavaType r11 = r0._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r12 = r9.getProperty()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = r9.getTypePropertyName()
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r6] = r13
            java.lang.String r13 = "Missing external type id property '%s'"
            r2.reportPropertyInputMismatch(r11, r12, r13, r14)
            goto L4e
        L4a:
            java.lang.String r8 = r9.getDefaultTypeId()
        L4e:
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r0._tokens
            r11 = r11[r7]
            if (r11 == 0) goto L5b
            java.lang.Object r10 = r0._deserialize(r1, r2, r7, r8)
            r5[r7] = r10
            goto L8b
        L5b:
            com.fasterxml.jackson.databind.DeserializationFeature r11 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r11 = r2.isEnabled(r11)
            if (r11 == 0) goto L85
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r11 = r9.getProperty()
            com.fasterxml.jackson.databind.JavaType r12 = r0._beanType
            java.lang.String r13 = r11.getName()
            java.lang.String r11 = r11.getName()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r14 = r0._properties
            r14 = r14[r7]
            java.lang.String r14 = r14.getTypePropertyName()
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r6] = r11
            r15[r10] = r14
            java.lang.String r10 = "Missing property '%s' for external type id '%s'"
            r2.reportPropertyInputMismatch(r12, r13, r10, r15)
        L85:
            java.lang.Object r10 = r0._deserializeMissingToken(r1, r2, r7, r8)
            r5[r7] = r10
        L8b:
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r10 = r9.getProperty()
            int r11 = r10.getCreatorIndex()
            if (r11 < 0) goto Lcb
            r11 = r5[r7]
            r3.assignParameter(r10, r11)
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r9 = r9.getTypeProperty()
            if (r9 == 0) goto Lcb
            int r10 = r9.getCreatorIndex()
            if (r10 < 0) goto Lcb
            com.fasterxml.jackson.databind.JavaType r10 = r9.getType()
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r10 = r10.hasRawClass(r11)
            if (r10 != 0) goto Lc8
            com.fasterxml.jackson.databind.util.TokenBuffer r10 = r2.bufferForInputBuffering(r1)
            r10.writeString(r8)
            com.fasterxml.jackson.databind.JsonDeserializer r8 = r9.getValueDeserializer()
            com.fasterxml.jackson.core.JsonParser r11 = r10.asParserOnFirstToken()
            java.lang.Object r8 = r8.deserialize(r11, r2)
            r10.close()
        Lc8:
            r3.assignParameter(r9, r8)
        Lcb:
            int r7 = r7 + 1
            goto Lf
        Lcf:
            r7 = r20
            java.lang.Object r1 = r7.build(r2, r3)
        Ld5:
            if (r6 >= r4) goto Led
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r2 = r0._properties
            r2 = r2[r6]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r2 = r2.getProperty()
            int r3 = r2.getCreatorIndex()
            if (r3 >= 0) goto Lea
            r3 = r5[r6]
            r2.set(r1, r3)
        Lea:
            int r6 = r6 + 1
            goto Ld5
        Led:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.lang.String r13, java.lang.Object r14) throws com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L6f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r10._properties
            int r2 = r0.intValue()
            r1 = r1[r2]
            boolean r13 = r1.hasTypePropertyName(r13)
            if (r13 == 0) goto L4d
            java.lang.String r12 = r11.getText()
            r11.skipChildren()
            java.lang.String[] r11 = r10._typeIds
            int r13 = r0.intValue()
            r11[r13] = r12
        L38:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L6e
            java.lang.String[] r11 = r10._typeIds
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L38
        L4d:
            com.fasterxml.jackson.databind.util.TokenBuffer r11 = r12.bufferAsCopyOfValue(r11)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r10._tokens
            int r13 = r0.intValue()
            r12[r13] = r11
        L59:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L6e
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r10._tokens
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12[r13] = r11
            goto L59
        L6e:
            return r3
        L6f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r10._properties
            r0 = r0[r8]
            boolean r13 = r0.hasTypePropertyName(r13)
            r0 = 0
            if (r13 == 0) goto L94
            java.lang.String[] r13 = r10._typeIds
            java.lang.String r2 = r11.getValueAsString()
            r13[r8] = r2
            r11.skipChildren()
            if (r14 == 0) goto La9
            com.fasterxml.jackson.databind.util.TokenBuffer[] r13 = r10._tokens
            r13 = r13[r8]
            if (r13 == 0) goto La7
            goto La4
        L94:
            com.fasterxml.jackson.databind.util.TokenBuffer r13 = r12.bufferAsCopyOfValue(r11)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r2 = r10._tokens
            r2[r8] = r13
            if (r14 == 0) goto La9
            java.lang.String[] r13 = r10._typeIds
            r13 = r13[r8]
            if (r13 == 0) goto La7
        La4:
            r7 = r14
            r1 = r3
            goto Laa
        La7:
            r7 = r14
            goto Laa
        La9:
            r7 = r0
        Laa:
            if (r1 == 0) goto Lbc
            java.lang.String[] r13 = r10._typeIds
            r9 = r13[r8]
            r13[r8] = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r4._deserializeAndSet(r5, r6, r7, r8, r9)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r10 = r4._tokens
            r10[r8] = r0
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z_handleTypePropertyValue = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (!(obj2 instanceof List)) {
            return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            ExternalTypeHandler externalTypeHandler = this;
            z_handleTypePropertyValue |= externalTypeHandler._handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) it.next()).intValue());
            this = externalTypeHandler;
        }
        return z_handleTypePropertyValue;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    protected ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = map;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.Object r12) throws com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r9._properties
            int r0 = r0.length
            r1 = 0
            r6 = r1
        L5:
            if (r6 >= r0) goto Lc0
            java.lang.String[] r2 = r9._typeIds
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r3 = r9._properties
            r2 = r2[r6]
            r3 = r3[r6]
            com.fasterxml.jackson.databind.util.TokenBuffer[] r4 = r9._tokens
            r5 = 1
            if (r2 != 0) goto L7d
            r4 = r4[r6]
            if (r4 != 0) goto L1e
        L18:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            goto Lb8
        L1e:
            com.fasterxml.jackson.core.JsonToken r7 = r4.firstToken()
            boolean r7 = r7.isScalarValue()
            if (r7 == 0) goto L41
            com.fasterxml.jackson.core.JsonParser r4 = r4.asParser(r10)
            r4.nextToken()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r3.getProperty()
            com.fasterxml.jackson.databind.JavaType r8 = r7.getType()
            java.lang.Object r4 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(r4, r11, r8)
            if (r4 == 0) goto L41
            r7.set(r12, r4)
            goto L18
        L41:
            boolean r4 = r3.hasDefaultType()
            if (r4 != 0) goto L5f
            com.fasterxml.jackson.databind.JavaType r4 = r9._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r3.getProperty()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r3.getTypePropertyName()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            java.lang.String r3 = "Missing external type id property '%s' (and no 'defaultImpl' specified)"
            r11.reportPropertyInputMismatch(r4, r7, r3, r5)
            goto Lb0
        L5f:
            java.lang.String r2 = r3.getDefaultTypeId()
            if (r2 != 0) goto Lb0
            com.fasterxml.jackson.databind.JavaType r4 = r9._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r7 = r3.getProperty()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = r3.getTypePropertyName()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r3
            java.lang.String r3 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver"
            r11.reportPropertyInputMismatch(r4, r7, r3, r5)
            goto Lb0
        L7d:
            r4 = r4[r6]
            if (r4 != 0) goto Lb0
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r9 = r3.getProperty()
            boolean r10 = r9.isRequired()
            if (r10 != 0) goto L93
            com.fasterxml.jackson.databind.DeserializationFeature r10 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r10 = r11.isEnabled(r10)
            if (r10 == 0) goto Lc0
        L93:
            java.lang.Class r10 = r12.getClass()
            java.lang.String r0 = r9.getName()
            java.lang.String r9 = r9.getName()
            java.lang.String r2 = r3.getTypePropertyName()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r9
            r3[r5] = r2
            java.lang.String r9 = "Missing property '%s' for external type id '%s'"
            r11.reportPropertyInputMismatch(r10, r0, r9, r3)
            return r12
        Lb0:
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r2
            r2 = r9
            r2._deserializeAndSet(r3, r4, r5, r6, r7)
        Lb8:
            int r6 = r6 + 1
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            goto L5
        Lc0:
            r5 = r12
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }
}
