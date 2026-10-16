package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;
import com.fasterxml.jackson.databind.util.EnumResolver;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: WazeSource */
@JacksonStdImpl
/* loaded from: classes4.dex */
public class EnumDeserializer extends StdScalarDeserializer<Object> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final Boolean _caseInsensitive;
    private final Enum<?> _enumDefaultValue;
    protected Object[] _enumsByIndex;
    protected final boolean _isFromIntValue;
    protected final CompactStringObjectMap _lookupByEnumNaming;
    protected final CompactStringObjectMap _lookupByName;
    protected volatile CompactStringObjectMap _lookupByToString;
    private Boolean _useDefaultValueForUnknownEnum;
    private Boolean _useNullForUnknownEnum;

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.deser.std.EnumDeserializer$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction = iArr;
            try {
                iArr[CoercionAction.AsNull.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.AsEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionAction[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public EnumDeserializer(EnumResolver enumResolver, boolean z, EnumResolver enumResolver2, EnumResolver enumResolver3) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = Boolean.valueOf(z);
        this._isFromIntValue = enumResolver.isFromIntValue();
        this._lookupByEnumNaming = enumResolver2 == null ? null : enumResolver2.constructLookup();
        this._lookupByToString = enumResolver3 != null ? enumResolver3.constructLookup() : null;
    }

    private final Object _deserializeAltString(JsonParser jsonParser, DeserializationContext deserializationContext, CompactStringObjectMap compactStringObjectMap, String str) throws InvalidFormatException, NumberFormatException {
        EnumDeserializer enumDeserializer;
        char cCharAt;
        Object objFindCaseInsensitive;
        EnumDeserializer enumDeserializer2;
        DeserializationContext deserializationContext2;
        CoercionAction coercionAction_checkCoercionFail;
        String strTrim = str.trim();
        if (!strTrim.isEmpty()) {
            enumDeserializer = this;
            if (Boolean.TRUE.equals(enumDeserializer._caseInsensitive) && (objFindCaseInsensitive = compactStringObjectMap.findCaseInsensitive(strTrim)) != null) {
                return objFindCaseInsensitive;
            }
            if (!deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS) && !enumDeserializer._isFromIntValue && (cCharAt = strTrim.charAt(0)) >= '0' && cCharAt <= '9' && (cCharAt != '0' || strTrim.length() <= 1)) {
                try {
                    int i2 = Integer.parseInt(strTrim);
                    if (!deserializationContext.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                        return deserializationContext.handleWeirdStringValue(enumDeserializer._enumClass(), strTrim, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                    }
                    if (i2 >= 0) {
                        Object[] objArr = enumDeserializer._enumsByIndex;
                        if (i2 < objArr.length) {
                            return objArr[i2];
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (!enumDeserializer.useDefaultValueForUnknownEnum(deserializationContext)) {
                if (enumDeserializer.useNullForUnknownEnum(deserializationContext)) {
                    return null;
                }
                return deserializationContext.handleWeirdStringValue(enumDeserializer._enumClass(), strTrim, "not one of the values accepted for Enum class: %s", compactStringObjectMap.keys());
            }
        } else {
            if (!useDefaultValueForUnknownEnum(deserializationContext)) {
                if (useNullForUnknownEnum(deserializationContext)) {
                    return null;
                }
                if (str.isEmpty()) {
                    enumDeserializer2 = this;
                    deserializationContext2 = deserializationContext;
                    coercionAction_checkCoercionFail = enumDeserializer2._checkCoercionFail(deserializationContext2, _findCoercionFromEmptyString(deserializationContext), handledType(), str, "empty String (\"\")");
                } else {
                    enumDeserializer2 = this;
                    deserializationContext2 = deserializationContext;
                    coercionAction_checkCoercionFail = enumDeserializer2._checkCoercionFail(deserializationContext2, enumDeserializer2._findCoercionFromBlankString(deserializationContext2), enumDeserializer2.handledType(), str, "blank String (all whitespace)");
                }
                CoercionAction coercionAction = CoercionAction.Fail;
                int iOrdinal = coercionAction_checkCoercionFail.ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    return enumDeserializer2.getEmptyValue(deserializationContext2);
                }
                return null;
            }
            enumDeserializer = this;
        }
        return enumDeserializer._enumDefaultValue;
    }

    private CompactStringObjectMap _resolveCurrentLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMap = this._lookupByEnumNaming;
        return compactStringObjectMap != null ? compactStringObjectMap : deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? _getToStringLookup(deserializationContext) : this._lookupByName;
    }

    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, EnumResolver enumResolver) throws SecurityException {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod, annotatedMethod.getParameterType(0), valueInstantiator, settableBeanPropertyArr, enumResolver);
    }

    public static JsonDeserializer<?> deserializerForNoArgsCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod) throws SecurityException {
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new FactoryBasedEnumDeserializer(cls, annotatedMethod);
    }

    protected Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return jsonParser.hasToken(JsonToken.START_ARRAY) ? _deserializeFromArray(jsonParser, deserializationContext) : deserializationContext.handleUnexpectedToken(_enumClass(), jsonParser);
    }

    protected Class<?> _enumClass() {
        return handledType();
    }

    protected Object _fromInteger(JsonParser jsonParser, DeserializationContext deserializationContext, int i2) throws InvalidFormatException {
        EnumDeserializer enumDeserializer;
        DeserializationContext deserializationContext2;
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), handledType(), CoercionInputShape.Integer);
        if (coercionActionFindCoercionAction != CoercionAction.Fail) {
            enumDeserializer = this;
            deserializationContext2 = deserializationContext;
        } else {
            if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return deserializationContext.handleWeirdNumberValue(_enumClass(), Integer.valueOf(i2), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            enumDeserializer = this;
            deserializationContext2 = deserializationContext;
            enumDeserializer._checkCoercionFail(deserializationContext2, coercionActionFindCoercionAction, handledType(), Integer.valueOf(i2), "Integer value (" + i2 + ")");
        }
        int iOrdinal = coercionActionFindCoercionAction.ordinal();
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 3) {
            return enumDeserializer.getEmptyValue(deserializationContext2);
        }
        if (i2 >= 0) {
            Object[] objArr = enumDeserializer._enumsByIndex;
            if (i2 < objArr.length) {
                return objArr[i2];
            }
        }
        if (enumDeserializer.useDefaultValueForUnknownEnum(deserializationContext2)) {
            return enumDeserializer._enumDefaultValue;
        }
        if (enumDeserializer.useNullForUnknownEnum(deserializationContext2)) {
            return null;
        }
        return deserializationContext2.handleWeirdNumberValue(enumDeserializer._enumClass(), Integer.valueOf(i2), "index value outside legal index range [0..%s]", Integer.valueOf(enumDeserializer._enumsByIndex.length - 1));
    }

    protected Object _fromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        Object objFind;
        CompactStringObjectMap compactStringObjectMap_resolveCurrentLookup = _resolveCurrentLookup(deserializationContext);
        Object objFind2 = compactStringObjectMap_resolveCurrentLookup.find(str);
        if (objFind2 != null) {
            return objFind2;
        }
        String strTrim = str.trim();
        return (strTrim == str || (objFind = compactStringObjectMap_resolveCurrentLookup.find(strTrim)) == null) ? _deserializeAltString(jsonParser, deserializationContext, compactStringObjectMap_resolveCurrentLookup, strTrim) : objFind;
    }

    @Deprecated
    protected CompactStringObjectMap _getToStringLookup(DeserializationContext deserializationContext) {
        CompactStringObjectMap compactStringObjectMapConstructLookup;
        CompactStringObjectMap compactStringObjectMap = this._lookupByToString;
        if (compactStringObjectMap != null) {
            return compactStringObjectMap;
        }
        synchronized (this) {
            compactStringObjectMapConstructLookup = this._lookupByToString;
            if (compactStringObjectMapConstructLookup == null) {
                compactStringObjectMapConstructLookup = EnumResolver.constructUsingToString(deserializationContext.getConfig(), _enumClass()).constructLookup();
                this._lookupByToString = compactStringObjectMapConstructLookup;
            }
        }
        return compactStringObjectMapConstructLookup;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        return withResolved((Boolean) Optional.ofNullable(findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)).orElse(this._caseInsensitive), (Boolean) Optional.ofNullable(findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)).orElse(this._useDefaultValueForUnknownEnum), (Boolean) Optional.ofNullable(findFormatFeature(deserializationContext, beanProperty, handledType(), JsonFormat.Feature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)).orElse(this._useNullForUnknownEnum));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return jsonParser.hasToken(JsonToken.VALUE_STRING) ? _fromString(jsonParser, deserializationContext, jsonParser.getText()) : jsonParser.hasToken(JsonToken.VALUE_NUMBER_INT) ? this._isFromIntValue ? _fromString(jsonParser, deserializationContext, jsonParser.getText()) : _fromInteger(jsonParser, deserializationContext, jsonParser.getIntValue()) : jsonParser.isExpectedStartObjectToken() ? _fromString(jsonParser, deserializationContext, deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass)) : _deserializeOther(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return this._enumDefaultValue;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    protected boolean useDefaultValueForUnknownEnum(DeserializationContext deserializationContext) {
        if (this._enumDefaultValue == null) {
            return false;
        }
        Boolean bool = this._useDefaultValueForUnknownEnum;
        return bool != null ? bool.booleanValue() : deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
    }

    protected boolean useNullForUnknownEnum(DeserializationContext deserializationContext) {
        Boolean bool = this._useNullForUnknownEnum;
        return bool != null ? bool.booleanValue() : deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL);
    }

    public EnumDeserializer withResolved(Boolean bool, Boolean bool2, Boolean bool3) {
        return (Objects.equals(this._caseInsensitive, bool) && Objects.equals(this._useDefaultValueForUnknownEnum, bool2) && Objects.equals(this._useNullForUnknownEnum, bool3)) ? this : new EnumDeserializer(this, bool, bool2, bool3);
    }

    @Deprecated
    public EnumDeserializer withResolved(Boolean bool) {
        return withResolved(bool, this._useDefaultValueForUnknownEnum, this._useNullForUnknownEnum);
    }

    @Deprecated
    public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMethod annotatedMethod, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        return deserializerForCreator(deserializationConfig, cls, annotatedMethod, valueInstantiator, settableBeanPropertyArr, null);
    }

    protected EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool, Boolean bool2, Boolean bool3) {
        super(enumDeserializer);
        this._lookupByName = enumDeserializer._lookupByName;
        this._enumsByIndex = enumDeserializer._enumsByIndex;
        this._enumDefaultValue = enumDeserializer._enumDefaultValue;
        this._caseInsensitive = Boolean.valueOf(Boolean.TRUE.equals(bool));
        this._isFromIntValue = enumDeserializer._isFromIntValue;
        this._useDefaultValueForUnknownEnum = bool2;
        this._useNullForUnknownEnum = bool3;
        this._lookupByEnumNaming = enumDeserializer._lookupByEnumNaming;
        this._lookupByToString = enumDeserializer._lookupByToString;
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver, Boolean bool) {
        this(enumResolver, Boolean.TRUE.equals(bool), null);
    }

    @Deprecated
    public EnumDeserializer(EnumResolver enumResolver, boolean z, EnumResolver enumResolver2) {
        super(enumResolver.getEnumClass());
        this._lookupByName = enumResolver.constructLookup();
        this._enumsByIndex = enumResolver.getRawEnums();
        this._enumDefaultValue = enumResolver.getDefaultValue();
        this._caseInsensitive = Boolean.valueOf(z);
        this._isFromIntValue = enumResolver.isFromIntValue();
        this._lookupByEnumNaming = enumResolver2 == null ? null : enumResolver2.constructLookup();
        this._lookupByToString = null;
    }

    @Deprecated
    protected EnumDeserializer(EnumDeserializer enumDeserializer, Boolean bool) {
        this(enumDeserializer, bool, (Boolean) null, (Boolean) null);
    }
}
