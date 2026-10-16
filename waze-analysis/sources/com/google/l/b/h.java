package com.google.l.b;

import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    private final Type f12374a;

    h(Type type) {
        Objects.requireNonNull(type);
        this.f12374a = k.c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && k.g(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f12374a;
    }

    public final int hashCode() {
        return this.f12374a.hashCode();
    }

    public final String toString() {
        return String.valueOf(k.b(this.f12374a)).concat("[]");
    }
}
