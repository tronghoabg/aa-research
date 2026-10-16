package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.EnumFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EnumValues implements Serializable {
    private static final long serialVersionUID = 1;
    private transient EnumMap<?, SerializableString> _asMap;
    private final Class<Enum<?>> _enumClass;
    private final SerializableString[] _textual;
    private final Enum<?>[] _values;

    private EnumValues(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = serializableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    protected static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(String.valueOf(cls.getName())));
    }

    protected static String _findNameToUse(String str, String str2, boolean z) {
        return str != null ? str : z ? str2.toLowerCase() : str2;
    }

    public static EnumValues construct(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, List<String> list) {
        int size = list.size();
        SerializableString[] serializableStringArr = new SerializableString[size];
        for (int i2 = 0; i2 < size; i2++) {
            serializableStringArr[i2] = mapperConfig.compileString(list.get(i2));
        }
        return construct(cls, serializableStringArr);
    }

    @Deprecated
    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsFindEnumType = ClassUtil.findEnumType(cls);
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Enum<?>[] enumArr = (Enum[]) clsFindEnumType.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(String.valueOf(cls.getName())));
        }
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        int length = enumArr.length;
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(clsFindEnumType, enumArr, new String[length]);
        SerializableString[] serializableStringArr = new SerializableString[length];
        for (int i2 = 0; i2 < enumArr.length; i2++) {
            Enum<?> r5 = enumArr[i2];
            serializableStringArr[r5.ordinal()] = mapperConfig.compileString(_findNameToUse(strArrFindEnumValues[i2], r5.name(), zIsEnabled));
        }
        return construct(cls, serializableStringArr);
    }

    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        int length = enumArr_enumConstants.length;
        String[] strArr = new String[length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, enumArr_enumConstants, strArr);
        }
        SerializableString[] serializableStringArr = new SerializableString[length];
        for (int i2 = 0; i2 < enumArr_enumConstants.length; i2++) {
            String string = enumArr_enumConstants[i2].toString();
            if (string == null) {
                string = "";
            }
            serializableStringArr[i2] = mapperConfig.compileString(_findNameToUse(strArr[i2], string, zIsEnabled));
        }
        return construct((Class<Enum<?>>) rawType, serializableStringArr);
    }

    @Deprecated
    public static EnumValues constructUsingEnumNamingStrategy(MapperConfig<?> mapperConfig, Class<Enum<?>> cls, EnumNamingStrategy enumNamingStrategy) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(String.valueOf(cls.getName())));
        }
        ArrayList arrayList = new ArrayList(enumArr.length);
        for (Enum r0 : enumArr) {
            arrayList.add(enumNamingStrategy.convertEnumToExternalName(r0.name()));
        }
        return construct(mapperConfig, cls, arrayList);
    }

    public List<Enum<?>> enums() {
        return Arrays.asList(this._values);
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public EnumMap<?, SerializableString> internalMap() {
        EnumMap<?, SerializableString> enumMap = this._asMap;
        if (enumMap != null) {
            return enumMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Enum<?> r4 : this._values) {
            linkedHashMap.put(r4, this._textual[r4.ordinal()]);
        }
        EnumMap<?, SerializableString> enumMap2 = new EnumMap<>(linkedHashMap);
        this._asMap = enumMap2;
        return enumMap2;
    }

    public SerializableString serializedValueFor(Enum<?> r1) {
        return this._textual[r1.ordinal()];
    }

    public Collection<SerializableString> values() {
        return Arrays.asList(this._textual);
    }

    public static EnumValues construct(SerializationConfig serializationConfig, AnnotatedClass annotatedClass) {
        if (serializationConfig.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            return constructFromToString(serializationConfig, annotatedClass);
        }
        return constructFromName(serializationConfig, annotatedClass);
    }

    public static EnumValues construct(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        return new EnumValues(cls, serializableStringArr);
    }

    @Deprecated
    public static EnumValues constructFromToString(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Enum[] enumArr = (Enum[]) ClassUtil.findEnumType(cls).getEnumConstants();
        if (enumArr != null) {
            ArrayList arrayList = new ArrayList(enumArr.length);
            for (Enum r0 : enumArr) {
                arrayList.add(r0.toString());
            }
            return construct(mapperConfig, cls, arrayList);
        }
        throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(String.valueOf(cls.getName())));
    }

    public static EnumValues constructUsingEnumNamingStrategy(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        int length = enumArr_enumConstants.length;
        String[] strArr = new String[length];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, enumArr_enumConstants, strArr);
        }
        SerializableString[] serializableStringArr = new SerializableString[length];
        for (int i2 = 0; i2 < length; i2++) {
            serializableStringArr[i2] = mapperConfig.compileString(_findNameToUse(strArr[i2], enumNamingStrategy.convertEnumToExternalName(enumArr_enumConstants[i2].name()), zIsEnabled));
        }
        return construct((Class<Enum<?>>) rawType, serializableStringArr);
    }

    public static EnumValues constructFromName(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        boolean zIsEnabled = mapperConfig.isEnabled(EnumFeature.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        int length = enumArr_enumConstants.length;
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(mapperConfig, annotatedClass, enumArr_enumConstants, new String[length]);
        SerializableString[] serializableStringArr = new SerializableString[length];
        for (int i2 = 0; i2 < length; i2++) {
            Enum<?> r6 = enumArr_enumConstants[i2];
            serializableStringArr[r6.ordinal()] = mapperConfig.compileString(_findNameToUse(strArrFindEnumValues[i2], r6.name(), zIsEnabled));
        }
        return construct((Class<Enum<?>>) rawType, serializableStringArr);
    }
}
