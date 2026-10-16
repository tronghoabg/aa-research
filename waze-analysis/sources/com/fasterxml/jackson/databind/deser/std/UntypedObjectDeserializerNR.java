package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
@JacksonStdImpl
/* loaded from: classes4.dex */
final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    protected final boolean _nonMerging;
    protected static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializerNR std = new UntypedObjectDeserializerNR();

    protected UntypedObjectDeserializerNR(boolean z) {
        super((Class<?>) Object.class);
        this._nonMerging = z;
    }

    private Object _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext, int i2) {
        switch (i2) {
            case 6:
                return jsonParser.getText();
            case 7:
                return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS) ? jsonParser.getBigIntegerValue() : jsonParser.getNumberValue();
            case 8:
                return _deserializeFP(jsonParser, deserializationContext);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
    }

    private Object _deserializeNR(JsonParser jsonParser, DeserializationContext deserializationContext, Scope scope) {
        Object text;
        Object text2;
        boolean zHasSomeOfFeatures = deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Scope scopeFinishBranchArray = scope;
        while (true) {
            if (scopeFinishBranchArray.isObject()) {
                String strNextFieldName = jsonParser.nextFieldName();
                while (true) {
                    if (strNextFieldName != null) {
                        JsonToken jsonTokenNextToken = jsonParser.nextToken();
                        if (jsonTokenNextToken == null) {
                            jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
                        }
                        int iId = jsonTokenNextToken.id();
                        if (iId == 1) {
                            scopeFinishBranchArray = scopeFinishBranchArray.childObject(strNextFieldName);
                        } else if (iId != 3) {
                            switch (iId) {
                                case 6:
                                    text2 = jsonParser.getText();
                                    break;
                                case 7:
                                    if (!zHasSomeOfFeatures) {
                                        text2 = jsonParser.getNumberValue();
                                        break;
                                    } else {
                                        text2 = _coerceIntegral(jsonParser, deserializationContext);
                                        break;
                                    }
                                case 8:
                                    text2 = _deserializeFP(jsonParser, deserializationContext);
                                    break;
                                case 9:
                                    text2 = Boolean.TRUE;
                                    break;
                                case 10:
                                    text2 = Boolean.FALSE;
                                    break;
                                case 11:
                                    text2 = null;
                                    break;
                                case 12:
                                    text2 = jsonParser.getEmbeddedObject();
                                    break;
                                default:
                                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            scopeFinishBranchArray.putValue(strNextFieldName, text2);
                        } else {
                            scopeFinishBranchArray = scopeFinishBranchArray.childArray(strNextFieldName);
                        }
                        strNextFieldName = jsonParser.nextFieldName();
                    } else {
                        if (scopeFinishBranchArray == scope) {
                            return scopeFinishBranchArray.finishRootObject();
                        }
                        scopeFinishBranchArray = scopeFinishBranchArray.finishBranchObject();
                    }
                }
            } else {
                while (true) {
                    JsonToken jsonTokenNextToken2 = jsonParser.nextToken();
                    if (jsonTokenNextToken2 == null) {
                        jsonTokenNextToken2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenNextToken2.id()) {
                        case 1:
                            scopeFinishBranchArray = scopeFinishBranchArray.childObject();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                        case 3:
                            scopeFinishBranchArray = scopeFinishBranchArray.childArray();
                            continue;
                        case 4:
                            if (scopeFinishBranchArray == scope) {
                                return scopeFinishBranchArray.finishRootArray(zIsEnabled);
                            }
                            scopeFinishBranchArray = scopeFinishBranchArray.finishBranchArray(zIsEnabled);
                            continue;
                        case 6:
                            text = jsonParser.getText();
                            break;
                        case 7:
                            if (!zHasSomeOfFeatures) {
                                text = jsonParser.getNumberValue();
                                break;
                            } else {
                                text = _coerceIntegral(jsonParser, deserializationContext);
                                break;
                            }
                        case 8:
                            text = _deserializeFP(jsonParser, deserializationContext);
                            break;
                        case 9:
                            text = Boolean.TRUE;
                            break;
                        case 10:
                            text = Boolean.FALSE;
                            break;
                        case 11:
                            text = null;
                            break;
                        case 12:
                            text = jsonParser.getEmbeddedObject();
                            break;
                    }
                    scopeFinishBranchArray.addValue(text);
                }
            }
        }
    }

    private Object _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj_deserializeNR;
        Scope scopeRootObjectScope = Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES));
        String strCurrentName = jsonParser.currentName();
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            if (iId == 1) {
                obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, scopeRootObjectScope.childObject());
            } else {
                if (iId == 2) {
                    return scopeRootObjectScope.finishRootObject();
                }
                obj_deserializeNR = iId != 3 ? _deserializeAnyScalar(jsonParser, deserializationContext, jsonTokenNextToken.id()) : _deserializeNR(jsonParser, deserializationContext, scopeRootObjectScope.childArray());
            }
            scopeRootObjectScope.putValue(strCurrentName, obj_deserializeNR);
            strCurrentName = jsonParser.nextFieldName();
        }
        return scopeRootObjectScope.finishRootObject();
    }

    private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    public static UntypedObjectDeserializerNR instance(boolean z) {
        return z ? new UntypedObjectDeserializerNR(true) : std;
    }

    protected Object _deserializeFP(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonParser.NumberTypeFP numberTypeFP = jsonParser.getNumberTypeFP();
        return numberTypeFP == JsonParser.NumberTypeFP.BIG_DECIMAL ? jsonParser.getDecimalValue() : (jsonParser.isNaN() || !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) ? numberTypeFP == JsonParser.NumberTypeFP.FLOAT32 ? Float.valueOf(jsonParser.getFloatValue()) : Double.valueOf(jsonParser.getDoubleValue()) : jsonParser.getDecimalValue();
    }

    protected Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) {
        boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zIsEnabled) {
            _squashDups(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.nextToken();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            Object objPut = map.put(str2, objDeserialize);
            if (objPut != null && zIsEnabled) {
                _squashDups(map, str2, objPut, objDeserialize);
            }
            str2 = jsonParser.nextFieldName();
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (jsonParser.currentTokenId()) {
            case 1:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootObjectScope(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return Scope.emptyMap();
            case 3:
                return _deserializeNR(jsonParser, deserializationContext, Scope.rootArrayScope());
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext);
            case 6:
                return jsonParser.getText();
            case 7:
                return deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.getNumberValue();
            case 8:
                return _deserializeFP(jsonParser, deserializationContext);
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.getEmbeddedObject();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        int iCurrentTokenId = jsonParser.currentTokenId();
        return (iCurrentTokenId == 1 || iCurrentTokenId == 3 || iCurrentTokenId == 5) ? typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext) : _deserializeAnyScalar(jsonParser, deserializationContext, jsonParser.currentTokenId());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        if (this._nonMerging) {
            return Boolean.FALSE;
        }
        return null;
    }

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    /* compiled from: WazeSource */
    final class Scope {
        private Scope _child;
        private String _deferredKey;
        private boolean _isObject;
        private List<Object> _list;
        private Map<String, Object> _map;
        private final Scope _parent;
        private boolean _squashDups;

        private Scope(Scope scope) {
            this._parent = scope;
            this._isObject = false;
            this._squashDups = false;
        }

        private void _putValueHandleDups(String str, Object obj) {
            Map<String, Object> map = this._map;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this._map = linkedHashMap;
                linkedHashMap.put(str, obj);
                return;
            }
            Object objPut = map.put(str, obj);
            if (objPut != null) {
                if (objPut instanceof List) {
                    ((List) objPut).add(obj);
                    this._map.put(str, objPut);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objPut);
                    arrayList.add(obj);
                    this._map.put(str, arrayList);
                }
            }
        }

        public static List<Object> emptyList() {
            return new ArrayList(2);
        }

        public static Map<String, Object> emptyMap() {
            return new LinkedHashMap(2);
        }

        private Scope resetAsArray() {
            this._isObject = false;
            return this;
        }

        private Scope resetAsObject(boolean z) {
            this._isObject = true;
            this._squashDups = z;
            return this;
        }

        public static Scope rootArrayScope() {
            return new Scope(null);
        }

        public static Scope rootObjectScope(boolean z) {
            return new Scope(null, true, z);
        }

        public void addValue(Object obj) {
            if (this._list == null) {
                this._list = new ArrayList();
            }
            this._list.add(obj);
        }

        public Scope childArray(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            scope.resetAsArray();
            return scope;
        }

        public Scope childObject(String str) {
            this._deferredKey = str;
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            scope.resetAsObject(this._squashDups);
            return scope;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Scope finishBranchArray(boolean z) {
            Object objEmptyList;
            List<Object> list = this._list;
            List<Object> array = list;
            if (list == null) {
                objEmptyList = z ? UntypedObjectDeserializerNR.NO_OBJECTS : emptyList();
            } else {
                if (z) {
                    array = list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS);
                }
                this._list = null;
                objEmptyList = array;
            }
            boolean zIsObject = this._parent.isObject();
            Scope scope = this._parent;
            if (zIsObject) {
                scope.putDeferredValue(objEmptyList);
                return scope;
            }
            scope.addValue(objEmptyList);
            return this._parent;
        }

        public Scope finishBranchObject() {
            Object linkedHashMap = this._map;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                this._map = null;
            }
            boolean zIsObject = this._parent.isObject();
            Scope scope = this._parent;
            if (zIsObject) {
                scope.putDeferredValue(linkedHashMap);
                return scope;
            }
            scope.addValue(linkedHashMap);
            return this._parent;
        }

        public Object finishRootArray(boolean z) {
            List<Object> list = this._list;
            return list == null ? z ? UntypedObjectDeserializerNR.NO_OBJECTS : emptyList() : z ? list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : list;
        }

        public Object finishRootObject() {
            Map<String, Object> map = this._map;
            return map == null ? emptyMap() : map;
        }

        public boolean isObject() {
            return this._isObject;
        }

        public Scope putDeferredValue(Object obj) {
            String str = (String) Objects.requireNonNull(this._deferredKey);
            this._deferredKey = null;
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return this;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
            return this;
        }

        public void putValue(String str, Object obj) {
            if (this._squashDups) {
                _putValueHandleDups(str, obj);
                return;
            }
            if (this._map == null) {
                this._map = new LinkedHashMap();
            }
            this._map.put(str, obj);
        }

        private Scope(Scope scope, boolean z, boolean z2) {
            this._parent = scope;
            this._isObject = z;
            this._squashDups = z2;
        }

        public Scope childArray() {
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this);
            }
            scope.resetAsArray();
            return scope;
        }

        public Scope childObject() {
            Scope scope = this._child;
            if (scope == null) {
                return new Scope(this, true, this._squashDups);
            }
            scope.resetAsObject(this._squashDups);
            return scope;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deserialize(com.fasterxml.jackson.core.JsonParser r5, com.fasterxml.jackson.databind.DeserializationContext r6, java.lang.Object r7) {
        /*
            r4 = this;
            boolean r0 = r4._nonMerging
            if (r0 == 0) goto L9
            java.lang.Object r4 = r4.deserialize(r5, r6)
            return r4
        L9:
            int r0 = r5.currentTokenId()
            r1 = 1
            if (r0 == r1) goto L3d
            r1 = 2
            if (r0 == r1) goto L6e
            r1 = 3
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 == r1) goto L6e
            r1 = 5
            if (r0 == r1) goto L46
            goto L6f
        L1d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r0 != r1) goto L26
            goto L6e
        L26:
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
        L2d:
            java.lang.Object r1 = r4.deserialize(r5, r6)
            r0.add(r1)
            com.fasterxml.jackson.core.JsonToken r1 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            if (r1 != r2) goto L2d
            goto L6e
        L3d:
            com.fasterxml.jackson.core.JsonToken r0 = r5.nextToken()
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            if (r0 != r1) goto L46
            goto L6e
        L46:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L6f
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = r5.currentName()
        L51:
            r5.nextToken()
            java.lang.Object r2 = r0.get(r1)
            if (r2 == 0) goto L5f
            java.lang.Object r3 = r4.deserialize(r5, r6, r2)
            goto L63
        L5f:
            java.lang.Object r3 = r4.deserialize(r5, r6)
        L63:
            if (r3 == r2) goto L68
            r0.put(r1, r3)
        L68:
            java.lang.String r1 = r5.nextFieldName()
            if (r1 != 0) goto L51
        L6e:
            return r7
        L6f:
            java.lang.Object r4 = r4.deserialize(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializerNR.deserialize(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }
}
