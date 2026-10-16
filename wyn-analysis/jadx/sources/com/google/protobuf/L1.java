package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public final class L1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f27588a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F1 f27590c;

    public L1(F1 f1, Comparable comparable, Object obj) {
        this.f27590c = f1;
        this.f27588a = comparable;
        this.f27589b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27588a.compareTo(((L1) obj).f27588a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f27588a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f27589b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f27588a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f27589b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f27588a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f27589b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f27590c.c();
        Object obj2 = this.f27589b;
        this.f27589b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f27588a + "=" + this.f27589b;
    }
}
