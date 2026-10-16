package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import j$.util.Map;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class EnumResolver implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Enum<?> _defaultValue;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;
    protected final boolean _isFromIntValue;
    protected final boolean _isIgnoreCase;

    protected EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> map, Enum<?> r4, boolean z, boolean z2) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = map;
        this._defaultValue = r4;
        this._isIgnoreCase = z;
        this._isFromIntValue = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static Class<Enum<?>> _enumClass(Class<?> cls) {
        return cls;
    }

    protected static Enum<?>[] _enumConstants(Class<?> cls) {
        Enum<?>[] enumArr = (Enum[]) cls.getEnumConstants();
        if (enumArr != null) {
            return enumArr;
        }
        throw new IllegalArgumentException("No enum constants for class ".concat(String.valueOf(cls.getName())));
    }

    protected static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, AnnotatedClass annotatedClass, Enum<?>[] enumArr) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(annotatedClass, enumArr);
        }
        return null;
    }

    protected static boolean _isIntType(Class<?> cls) {
        if (cls.isPrimitive()) {
            cls = ClassUtil.wrapperType(cls);
        }
        return cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class;
    }

    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        int length = enumArr_enumConstants.length;
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(deserializationConfig, annotatedClass, enumArr_enumConstants, new String[length]);
        String[][] strArr = new String[strArrFindEnumValues.length][];
        annotationIntrospector.findEnumAliases(deserializationConfig, annotatedClass, enumArr_enumConstants, strArr);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < length; i2++) {
            Enum<?> r9 = enumArr_enumConstants[i2];
            String strName = strArrFindEnumValues[i2];
            if (strName == null) {
                strName = r9.name();
            }
            map.put(strName, r9);
            String[] strArr2 = strArr[i2];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    Map.EL.putIfAbsent(map, str, r9);
                }
            }
        }
        return new EnumResolver(rawType, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, annotatedClass, enumArr_enumConstants), zIsEnabled, false);
    }

    public static EnumResolver constructUsingEnumNamingStrategy(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        int length = enumArr_enumConstants.length;
        String[] strArr = new String[length];
        String[][] strArr2 = new String[length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(deserializationConfig, annotatedClass, enumArr_enumConstants, strArr);
            annotationIntrospector.findEnumAliases(deserializationConfig, annotatedClass, enumArr_enumConstants, strArr2);
        }
        HashMap map = new HashMap();
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(rawType, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, annotatedClass, enumArr_enumConstants), zIsEnabled, false);
            }
            Enum<?> r6 = enumArr_enumConstants[length];
            String strConvertEnumToExternalName = strArr[length];
            if (strConvertEnumToExternalName == null) {
                strConvertEnumToExternalName = enumNamingStrategy.convertEnumToExternalName(r6.name());
            }
            map.put(strConvertEnumToExternalName, r6);
            String[] strArr3 = strArr2[length];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    Map.EL.putIfAbsent(map, str, r6);
                }
            }
        }
    }

    public static EnumResolver constructUsingIndex(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(rawType, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, annotatedClass, enumArr_enumConstants), zIsEnabled, false);
            }
            map.put(String.valueOf(length), enumArr_enumConstants[length]);
        }
    }

    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(rawType, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, annotatedClass, enumArr_enumConstants), zIsEnabled, _isIntType(annotatedMember.getRawType()));
            }
            Enum<?> r1 = enumArr_enumConstants[length];
            try {
                Object value = annotatedMember.getValue(r1);
                if (value != null) {
                    map.put(value.toString(), r1);
                }
            } catch (Exception e2) {
                throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + String.valueOf(r1) + ": " + e2.getMessage());
            }
        }
    }

    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Class<?> rawType = annotatedClass.getRawType();
        Enum<?>[] enumArr_enumConstants = _enumConstants(rawType);
        int length = enumArr_enumConstants.length;
        String[] strArr = new String[length];
        String[][] strArr2 = new String[length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(deserializationConfig, annotatedClass, enumArr_enumConstants, strArr);
            annotationIntrospector.findEnumAliases(deserializationConfig, annotatedClass, enumArr_enumConstants, strArr2);
        }
        HashMap map = new HashMap();
        while (true) {
            length--;
            if (length < 0) {
                return new EnumResolver(rawType, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, annotatedClass, enumArr_enumConstants), zIsEnabled, false);
            }
            Enum<?> r6 = enumArr_enumConstants[length];
            String string = strArr[length];
            if (string == null) {
                string = r6.toString();
            }
            map.put(string, r6);
            String[] strArr3 = strArr2[length];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    Map.EL.putIfAbsent(map, str, r6);
                }
            }
        }
    }

    protected Enum<?> _findEnumCaseInsensitive(String str) {
        for (Map.Entry<String, Enum<?>> entry : this._enumsById.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    public Enum<?> findEnum(String str) {
        Enum<?> r0 = this._enumsById.get(str);
        return (r0 == null && this._isIgnoreCase) ? _findEnumCaseInsensitive(str) : r0;
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Enum<?> getEnum(int i2) {
        if (i2 < 0) {
            return null;
        }
        Enum<?>[] enumArr = this._enums;
        if (i2 >= enumArr.length) {
            return null;
        }
        return enumArr[i2];
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public List<Enum<?>> getEnums() {
        ArrayList arrayList = new ArrayList(this._enums.length);
        for (Enum<?> r0 : this._enums) {
            arrayList.add(r0);
        }
        return arrayList;
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public boolean isFromIntValue() {
        return this._isFromIntValue;
    }

    public int lastValidIndex() {
        return this._enums.length - 1;
    }

    @Deprecated
    protected static Enum<?> _enumDefault(AnnotationIntrospector annotationIntrospector, Class<?> cls) {
        if (annotationIntrospector != null) {
            return annotationIntrospector.findDefaultEnumValue(cls);
        }
        return null;
    }

    @Deprecated
    public static EnumResolver constructUsingIndex(DeserializationConfig deserializationConfig, Class<Enum<?>> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                map.put(String.valueOf(length), enumArr_enumConstants[length]);
            } else {
                return new EnumResolver(cls, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls), zIsEnabled, false);
            }
        }
    }

    @Deprecated
    public static EnumResolver constructUsingToString(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        String[][] strArr = new String[length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumAliases(cls, enumArr_enumConstants, strArr);
        }
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r2 = enumArr_enumConstants[length];
                map.put(r2.toString(), r2);
                String[] strArr2 = strArr[length];
                if (strArr2 != null) {
                    for (String str : strArr2) {
                        Map.EL.putIfAbsent(map, str, r2);
                    }
                }
            } else {
                return new EnumResolver(cls, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls), zIsEnabled, false);
            }
        }
    }

    @Deprecated
    public static EnumResolver constructFor(DeserializationConfig deserializationConfig, Class<?> cls) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        int length = enumArr_enumConstants.length;
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(cls, enumArr_enumConstants, new String[length]);
        String[][] strArr = new String[strArrFindEnumValues.length][];
        annotationIntrospector.findEnumAliases(cls, enumArr_enumConstants, strArr);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < length; i2++) {
            Enum<?> r8 = enumArr_enumConstants[i2];
            String strName = strArrFindEnumValues[i2];
            if (strName == null) {
                strName = r8.name();
            }
            map.put(strName, r8);
            String[] strArr2 = strArr[i2];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    Map.EL.putIfAbsent(map, str, r8);
                }
            }
        }
        return new EnumResolver(cls, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls), zIsEnabled, false);
    }

    @Deprecated
    public static EnumResolver constructUsingEnumNamingStrategy(DeserializationConfig deserializationConfig, Class<?> cls, EnumNamingStrategy enumNamingStrategy) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        String[] strArr = new String[length];
        String[][] strArr2 = new String[length][];
        if (annotationIntrospector != null) {
            annotationIntrospector.findEnumValues(cls, enumArr_enumConstants, strArr);
            annotationIntrospector.findEnumAliases(cls, enumArr_enumConstants, strArr2);
        }
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r3 = enumArr_enumConstants[length];
                String strConvertEnumToExternalName = strArr[length];
                if (strConvertEnumToExternalName == null) {
                    strConvertEnumToExternalName = enumNamingStrategy.convertEnumToExternalName(r3.name());
                }
                map.put(strConvertEnumToExternalName, r3);
                String[] strArr3 = strArr2[length];
                if (strArr3 != null) {
                    for (String str : strArr3) {
                        Map.EL.putIfAbsent(map, str, r3);
                    }
                }
            } else {
                return new EnumResolver(cls, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls), zIsEnabled, false);
            }
        }
    }

    @Deprecated
    public static EnumResolver constructUsingMethod(DeserializationConfig deserializationConfig, Class<?> cls, AnnotatedMember annotatedMember) {
        AnnotationIntrospector annotationIntrospector = deserializationConfig.getAnnotationIntrospector();
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS);
        Enum<?>[] enumArr_enumConstants = _enumConstants(cls);
        HashMap map = new HashMap();
        int length = enumArr_enumConstants.length;
        while (true) {
            length--;
            if (length >= 0) {
                Enum<?> r1 = enumArr_enumConstants[length];
                try {
                    Object value = annotatedMember.getValue(r1);
                    if (value != null) {
                        map.put(value.toString(), r1);
                    }
                } catch (Exception e2) {
                    throw new IllegalArgumentException("Failed to access @JsonValue of Enum value " + String.valueOf(r1) + ": " + e2.getMessage());
                }
            } else {
                return new EnumResolver(cls, enumArr_enumConstants, map, _enumDefault(annotationIntrospector, cls), zIsEnabled, _isIntType(annotatedMember.getRawType()));
            }
        }
    }
}
