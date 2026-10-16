package com.google.l.b;

import j$.util.Objects;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    private final Type f12378a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f12379b;

    j(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        if (length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (length != 1) {
            Objects.requireNonNull(typeArr[0]);
            k.f(typeArr[0]);
            this.f12379b = null;
            this.f12378a = k.c(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        k.f(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.f12379b = k.c(typeArr2[0]);
        this.f12378a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && k.g(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f12379b;
        return type != null ? new Type[]{type} : k.f12380a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f12378a};
    }

    public final int hashCode() {
        Type type = this.f12379b;
        return (this.f12378a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.f12379b;
        if (type != null) {
            return "? super ".concat(String.valueOf(k.b(type)));
        }
        Type type2 = this.f12378a;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(k.b(type2)));
    }
}
