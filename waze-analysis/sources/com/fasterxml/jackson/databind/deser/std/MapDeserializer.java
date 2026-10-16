package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
@JacksonStdImpl
/* loaded from: classes4.dex */
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    protected boolean _checkDupSquash;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected Set<String> _includableProperties;
    protected IgnorePropertiesUtil.Checker _inclusionChecker;
    protected final KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    /* compiled from: WazeSource */
    class MapReferring extends ReadableObjectId.Referring {
        private final MapReferringAccumulator _parent;
        public final Object key;
        public final Map<Object, Object> next;

        MapReferring(MapReferringAccumulator mapReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.next = new LinkedHashMap();
            this._parent = mapReferringAccumulator;
            this.key = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) {
            this._parent.resolveForwardReference(obj, obj2);
        }
    }

    /* compiled from: WazeSource */
    final class MapReferringAccumulator {
        private final List<MapReferring> _accumulator = new ArrayList();
        private final Map<Object, Object> _result;
        private final Class<?> _valueType;

        public MapReferringAccumulator(Class<?> cls, Map<Object, Object> map) {
            this._valueType = cls;
            this._result = map;
        }

        public ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            MapReferring mapReferring = new MapReferring(this, unresolvedForwardReference, this._valueType, obj);
            this._accumulator.add(mapReferring);
            return mapReferring;
        }

        public void put(Object obj, Object obj2) {
            if (this._accumulator.isEmpty()) {
                this._result.put(obj, obj2);
            } else {
                this._accumulator.get(r1.size() - 1).next.put(obj, obj2);
            }
        }

        public void resolveForwardReference(Object obj, Object obj2) {
            Map<Object, Object> map = this._result;
            Iterator<MapReferring> it = this._accumulator.iterator();
            while (it.hasNext()) {
                MapReferring next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    map.put(next.key, obj2);
                    map.putAll(next.next);
                    return;
                }
                map = next.next;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + String.valueOf(obj) + "] that wasn't previously seen as unresolved.");
        }
    }

    protected MapDeserializer(MapDeserializer mapDeserializer) {
        super(mapDeserializer);
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._includableProperties = mapDeserializer._includableProperties;
        this._inclusionChecker = mapDeserializer._inclusionChecker;
        this._standardStringKey = mapDeserializer._standardStringKey;
        this._checkDupSquash = mapDeserializer._checkDupSquash;
    }

    private void handleUnresolvedReference(DeserializationContext deserializationContext, MapReferringAccumulator mapReferringAccumulator, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws MismatchedInputException {
        if (mapReferringAccumulator == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: ".concat(String.valueOf(String.valueOf(unresolvedForwardReference))), new Object[0]);
        }
        unresolvedForwardReference.getRoid().appendReferring(mapReferringAccumulator.handleUnresolvedReference(unresolvedForwardReference, obj));
    }

    protected Object _deserializeNoNullChecks(JsonParser jsonParser, DeserializationContext deserializationContext) {
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        return typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj_deserializeNoNullChecks;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBufferStartBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        String strNextFieldName = jsonParser.isExpectedStartObjectToken() ? jsonParser.nextFieldName() : jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.currentName() : null;
        while (strNextFieldName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strNextFieldName)) {
                SettableBeanProperty settableBeanPropertyFindCreatorProperty = propertyBasedCreator.findCreatorProperty(strNextFieldName);
                if (settableBeanPropertyFindCreatorProperty == null) {
                    Object objDeserializeKey = this._keyDeserializer.deserializeKey(strNextFieldName, deserializationContext);
                    try {
                        if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                            obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
                        } else if (!this._skipNullValues) {
                            obj_deserializeNoNullChecks = null;
                        }
                        if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) {
                            propertyValueBufferStartBuilding.bufferMapProperty(objDeserializeKey, obj_deserializeNoNullChecks);
                        }
                    } catch (Exception e2) {
                        wrapAndThrow(deserializationContext, e2, this._containerType.getRawClass(), strNextFieldName);
                        return null;
                    }
                } else if (propertyValueBufferStartBuilding.assignParameter(settableBeanPropertyFindCreatorProperty, settableBeanPropertyFindCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.nextToken();
                    try {
                        Map<Object, Object> map = (Map) propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e3) {
                        return (Map) wrapAndThrow(deserializationContext, e3, this._containerType.getRawClass(), strNextFieldName);
                    }
                }
            } else {
                jsonParser.skipChildren();
            }
            strNextFieldName = jsonParser.nextFieldName();
        }
        try {
            return (Map) propertyBasedCreator.build(deserializationContext, propertyValueBufferStartBuilding);
        } catch (Exception e4) {
            wrapAndThrow(deserializationContext, e4, this._containerType.getRawClass(), null);
            return null;
        }
    }

    protected final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType keyType;
        if (keyDeserializer == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer);
    }

    protected final Map<Object, Object> _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        MapDeserializer mapDeserializer;
        DeserializationContext deserializationContext2;
        Map<Object, Object> map2;
        Object obj_deserializeNoNullChecks;
        boolean z = this._valueDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenCurrentToken != jsonToken) {
                if (jsonTokenCurrentToken != JsonToken.END_OBJECT) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
                return map;
            }
            strCurrentName = jsonParser.currentName();
        }
        String strNextFieldName = strCurrentName;
        while (strNextFieldName != null) {
            Object objDeserializeKey = this._keyDeserializer.deserializeKey(strNextFieldName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strNextFieldName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        obj_deserializeNoNullChecks = this._deserializeNoNullChecks(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        obj_deserializeNoNullChecks = null;
                    }
                    if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) {
                        Object obj = obj_deserializeNoNullChecks;
                        if (z) {
                            mapReferringAccumulator.put(objDeserializeKey, obj);
                        } else {
                            Object objPut = map.put(objDeserializeKey, obj);
                            if (objPut != null) {
                                mapDeserializer = this;
                                deserializationContext2 = deserializationContext;
                                map2 = map;
                                try {
                                    mapDeserializer._squashDups(deserializationContext2, map2, objDeserializeKey, objPut, obj);
                                } catch (UnresolvedForwardReference e2) {
                                    e = e2;
                                    mapDeserializer.handleUnresolvedReference(deserializationContext2, mapReferringAccumulator, objDeserializeKey, e);
                                    strNextFieldName = jsonParser.nextFieldName();
                                    this = mapDeserializer;
                                    deserializationContext = deserializationContext2;
                                    map = map2;
                                } catch (Exception e3) {
                                    e = e3;
                                    mapDeserializer.wrapAndThrow(deserializationContext2, e, map2, strNextFieldName);
                                    strNextFieldName = jsonParser.nextFieldName();
                                    this = mapDeserializer;
                                    deserializationContext = deserializationContext2;
                                    map = map2;
                                }
                            }
                        }
                    }
                } catch (UnresolvedForwardReference e4) {
                    e = e4;
                    mapDeserializer = this;
                    deserializationContext2 = deserializationContext;
                    map2 = map;
                } catch (Exception e5) {
                    e = e5;
                    mapDeserializer = this;
                    deserializationContext2 = deserializationContext;
                    map2 = map;
                }
                strNextFieldName = jsonParser.nextFieldName();
                this = mapDeserializer;
                deserializationContext = deserializationContext2;
                map = map2;
            } else {
                jsonParser.skipChildren();
            }
            mapDeserializer = this;
            deserializationContext2 = deserializationContext;
            map2 = map;
            strNextFieldName = jsonParser.nextFieldName();
            this = mapDeserializer;
            deserializationContext = deserializationContext2;
            map = map2;
        }
        return map;
    }

    protected final Map<Object, Object> _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        MapDeserializer mapDeserializer;
        DeserializationContext deserializationContext2;
        Map<Object, Object> map2;
        Object obj_deserializeNoNullChecks;
        boolean z = this._valueDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._containerType.getContentType().getRawClass(), map) : null;
        if (!jsonParser.isExpectedStartObjectToken()) {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken != JsonToken.END_OBJECT) {
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenCurrentToken != jsonToken) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
                strCurrentName = jsonParser.currentName();
            }
            return map;
        }
        strCurrentName = jsonParser.nextFieldName();
        String strNextFieldName = strCurrentName;
        while (strNextFieldName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strNextFieldName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        obj_deserializeNoNullChecks = this._deserializeNoNullChecks(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        obj_deserializeNoNullChecks = null;
                    }
                    if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) {
                        Object obj = obj_deserializeNoNullChecks;
                        if (z) {
                            mapReferringAccumulator.put(strNextFieldName, obj);
                        } else {
                            Object objPut = map.put(strNextFieldName, obj);
                            if (objPut != null) {
                                mapDeserializer = this;
                                deserializationContext2 = deserializationContext;
                                map2 = map;
                                try {
                                    mapDeserializer._squashDups(deserializationContext2, map2, strNextFieldName, objPut, obj);
                                } catch (UnresolvedForwardReference e2) {
                                    e = e2;
                                    mapDeserializer.handleUnresolvedReference(deserializationContext2, mapReferringAccumulator, strNextFieldName, e);
                                    strNextFieldName = jsonParser.nextFieldName();
                                    this = mapDeserializer;
                                    deserializationContext = deserializationContext2;
                                    map = map2;
                                } catch (Exception e3) {
                                    e = e3;
                                    mapDeserializer.wrapAndThrow(deserializationContext2, e, map2, strNextFieldName);
                                    strNextFieldName = jsonParser.nextFieldName();
                                    this = mapDeserializer;
                                    deserializationContext = deserializationContext2;
                                    map = map2;
                                }
                            }
                        }
                    }
                } catch (UnresolvedForwardReference e4) {
                    e = e4;
                    mapDeserializer = this;
                    deserializationContext2 = deserializationContext;
                    map2 = map;
                } catch (Exception e5) {
                    e = e5;
                    mapDeserializer = this;
                    deserializationContext2 = deserializationContext;
                    map2 = map;
                }
                strNextFieldName = jsonParser.nextFieldName();
                this = mapDeserializer;
                deserializationContext = deserializationContext2;
                map = map2;
            } else {
                jsonParser.skipChildren();
            }
            mapDeserializer = this;
            deserializationContext2 = deserializationContext;
            map2 = map;
            strNextFieldName = jsonParser.nextFieldName();
            this = mapDeserializer;
            deserializationContext = deserializationContext2;
            map = map2;
        }
        return map;
    }

    protected final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object obj_deserializeNoNullChecks;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenCurrentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            Object objDeserializeKey = this._keyDeserializer.deserializeKey(strCurrentName, deserializationContext);
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strCurrentName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        Object obj = map.get(objDeserializeKey);
                        if (obj != null) {
                            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
                            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
                            obj_deserializeNoNullChecks = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext, obj) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer, obj);
                        } else {
                            obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
                        }
                        if ((obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) && obj_deserializeNoNullChecks != obj) {
                            map.put(objDeserializeKey, obj_deserializeNoNullChecks);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(objDeserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, strCurrentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            strCurrentName = jsonParser.nextFieldName();
        }
    }

    protected final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strCurrentName;
        Object obj_deserializeNoNullChecks;
        if (jsonParser.isExpectedStartObjectToken()) {
            strCurrentName = jsonParser.nextFieldName();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenCurrentToken != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strCurrentName = jsonParser.currentName();
        }
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strCurrentName)) {
                try {
                    if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                        Object obj = map.get(strCurrentName);
                        if (obj != null) {
                            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
                            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
                            obj_deserializeNoNullChecks = typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext, obj) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer, obj);
                        } else {
                            obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
                        }
                        if ((obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) && obj_deserializeNoNullChecks != obj) {
                            map.put(strCurrentName, obj_deserializeNoNullChecks);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(strCurrentName, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e2) {
                    wrapAndThrow(deserializationContext, e2, map, strCurrentName);
                }
            } else {
                jsonParser.skipChildren();
            }
            strCurrentName = jsonParser.nextFieldName();
        }
    }

    protected void _squashDups(DeserializationContext deserializationContext, Map<Object, Object> map, Object obj, Object obj2, Object obj3) {
        if (this._checkDupSquash && deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (obj2 instanceof List) {
                ((List) obj2).add(obj3);
                map.put(obj, obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj2);
                arrayList.add(obj3);
                map.put(obj, arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[PHI: r0 r1
  0x00ac: PHI (r0v11 java.util.Set<java.lang.String>) = 
  (r0v10 java.util.Set<java.lang.String>)
  (r0v10 java.util.Set<java.lang.String>)
  (r0v12 java.util.Set<java.lang.String>)
  (r0v12 java.util.Set<java.lang.String>)
  (r0v12 java.util.Set<java.lang.String>)
 binds: [B:19:0x0049, B:21:0x004f, B:30:0x007a, B:32:0x0080, B:35:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x00ac: PHI (r1v4 java.util.Set<java.lang.String>) = 
  (r1v3 java.util.Set<java.lang.String>)
  (r1v3 java.util.Set<java.lang.String>)
  (r1v3 java.util.Set<java.lang.String>)
  (r1v3 java.util.Set<java.lang.String>)
  (r1v6 java.util.Set<java.lang.String>)
 binds: [B:19:0x0049, B:21:0x004f, B:30:0x007a, B:32:0x0080, B:35:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createContextual(com.fasterxml.jackson.databind.DeserializationContext r11, com.fasterxml.jackson.databind.BeanProperty r12) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r10 = this;
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r10._keyDeserializer
            if (r0 != 0) goto Lf
            com.fasterxml.jackson.databind.JavaType r0 = r10._containerType
            com.fasterxml.jackson.databind.JavaType r0 = r0.getKeyType()
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r11.findKeyDeserializer(r0, r12)
            goto L19
        Lf:
            boolean r1 = r0 instanceof com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer
            if (r1 == 0) goto L19
            com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer r0 = (com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer) r0
            com.fasterxml.jackson.databind.KeyDeserializer r0 = r0.createContextual(r11, r12)
        L19:
            r2 = r0
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r0 = r10._valueDeserializer
            if (r12 == 0) goto L22
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.findConvertingContentDeserializer(r11, r12, r0)
        L22:
            com.fasterxml.jackson.databind.JavaType r1 = r10._containerType
            com.fasterxml.jackson.databind.JavaType r1 = r1.getContentType()
            if (r0 != 0) goto L2f
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r11.findContextualValueDeserializer(r1, r12)
            goto L33
        L2f:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r11.handleSecondaryContextualization(r0, r12, r1)
        L33:
            r4 = r0
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r10._valueTypeDeserializer
            if (r0 == 0) goto L3c
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r0 = r0.forProperty(r12)
        L3c:
            r3 = r0
            java.util.Set<java.lang.String> r0 = r10._ignorableProperties
            java.util.Set<java.lang.String> r1 = r10._includableProperties
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r11.getAnnotationIntrospector()
            boolean r6 = _neitherNull(r5, r12)
            if (r6 == 0) goto Lac
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r6 = r12.getMember()
            if (r6 == 0) goto Lac
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r11.getConfig()
            com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value r8 = r5.findPropertyIgnoralByName(r7, r6)
            if (r8 == 0) goto L76
            java.util.Set r8 = r8.findIgnoredForDeserialization()
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L76
            if (r0 != 0) goto L6d
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r8)
            goto L76
        L6d:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0)
            r9.addAll(r8)
            r0 = r9
        L76:
            com.fasterxml.jackson.annotation.JsonIncludeProperties$Value r5 = r5.findPropertyInclusionByName(r7, r6)
            if (r5 == 0) goto Lac
            java.util.Set r5 = r5.getIncluded()
            if (r5 == 0) goto Lac
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            if (r1 != 0) goto L8f
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r5)
            goto Lac
        L8f:
            java.util.Iterator r5 = r5.iterator()
        L93:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto La9
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = r1.contains(r7)
            if (r8 == 0) goto L93
            r6.add(r7)
            goto L93
        La9:
            r7 = r6
            r6 = r0
            goto Lae
        Lac:
            r6 = r0
            r7 = r1
        Lae:
            com.fasterxml.jackson.databind.deser.NullValueProvider r5 = r10.findContentNullProvider(r11, r12, r4)
            r1 = r10
            com.fasterxml.jackson.databind.deser.std.MapDeserializer r10 = r1.withResolved(r2, r3, r4, r5, r6, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId != 1 && iCurrentTokenId != 2) {
            if (iCurrentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iCurrentTokenId != 5) {
                return iCurrentTokenId != 6 ? (Map) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser) : _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null && this._includableProperties == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws InvalidDefinitionException {
        boolean zCanCreateUsingDelegate = this._valueInstantiator.canCreateUsingDelegate();
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (zCanCreateUsingDelegate) {
            JavaType delegateType = valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
        } else if (valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    @Deprecated
    public void setIgnorableProperties(String[] strArr) {
        HashSet hashSetArrayToSet = null;
        if (strArr != null && strArr.length != 0) {
            hashSetArrayToSet = ArrayBuilders.arrayToSet(strArr);
        }
        this._ignorableProperties = hashSetArrayToSet;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(hashSetArrayToSet, this._includableProperties);
    }

    public void setIncludableProperties(Set<String> set) {
        this._includableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(this._ignorableProperties, set);
    }

    protected MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Set<String> set, Set<String> set2) {
        return (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer && this._nullProvider == nullValueProvider && this._ignorableProperties == set && this._includableProperties == set2) ? this : new MapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider, set, set2);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.isEmpty()) {
            set = null;
        }
        this._ignorableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(set, this._includableProperties);
    }

    protected MapDeserializer withResolved(KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        return withResolved(keyDeserializer, typeDeserializer, jsonDeserializer, nullValueProvider, set, this._includableProperties);
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
        this._inclusionChecker = null;
        this._checkDupSquash = javaType.getContentType().hasRawClass(Object.class);
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        this(mapDeserializer, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider, set, null);
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set, Set<String> set2) {
        super(mapDeserializer, nullValueProvider, mapDeserializer._unwrapSingle);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(set, set2);
        this._standardStringKey = _isStdKeyDeser(this._containerType, keyDeserializer);
        this._checkDupSquash = mapDeserializer._checkDupSquash;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.assignCurrentValue(map);
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != JsonToken.START_OBJECT && jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }
}
