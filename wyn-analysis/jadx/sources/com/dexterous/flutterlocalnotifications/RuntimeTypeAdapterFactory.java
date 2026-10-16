package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import la.InterfaceC3449A;
import la.l;
import la.z;
import qa.C3883a;

@Keep
/* loaded from: classes3.dex */
public final class RuntimeTypeAdapterFactory<T> implements InterfaceC3449A {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // la.InterfaceC3449A
    public <R> z create(l lVar, C3883a<R> c3883a) {
        if (c3883a.f44183a != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            z zVarD = lVar.d(this, new C3883a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), zVarD);
            linkedHashMap2.put(entry.getValue(), zVarD);
        }
        return new j(this, linkedHashMap, linkedHashMap2).a();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
