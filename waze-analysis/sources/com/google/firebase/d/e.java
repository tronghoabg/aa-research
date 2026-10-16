package com.google.firebase.d;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f9869a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9870b;

    private e(String str, Map map) {
        this.f9869a = str;
        this.f9870b = map;
    }

    public static d a(String str) {
        return new d(str);
    }

    public static e b(String str) {
        return new e(str, Collections.EMPTY_MAP);
    }

    public final String c() {
        return this.f9869a;
    }

    public final Annotation d(Class cls) {
        return (Annotation) this.f9870b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9869a.equals(eVar.f9869a) && this.f9870b.equals(eVar.f9870b);
    }

    public final int hashCode() {
        return (this.f9869a.hashCode() * 31) + this.f9870b.hashCode();
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f9869a + ", properties=" + String.valueOf(this.f9870b.values()) + "}";
    }

    /* synthetic */ e(String str, Map map, byte[] bArr) {
        this(str, map);
    }
}
