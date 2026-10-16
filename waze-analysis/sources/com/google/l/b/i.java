package com.google.l.b;

import j$.util.Objects;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    private final Type f12375a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f12376b;

    /* renamed from: c, reason: collision with root package name */
    private final Type[] f12377c;

    i(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && (cls instanceof Class) && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for ".concat(String.valueOf(String.valueOf(cls))));
        }
        this.f12375a = type == null ? null : k.c(type);
        this.f12376b = k.c(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f12377c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Objects.requireNonNull(this.f12377c[i2]);
            k.f(this.f12377c[i2]);
            Type[] typeArr3 = this.f12377c;
            typeArr3[i2] = k.c(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && k.g(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f12377c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f12375a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f12376b;
    }

    public final int hashCode() {
        int iHashCode = this.f12376b.hashCode() ^ Arrays.hashCode(this.f12377c);
        Type type = this.f12375a;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.f12377c;
        int length = typeArr.length;
        if (length == 0) {
            return k.b(this.f12376b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(k.b(this.f12376b));
        sb.append("<");
        sb.append(k.b(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(k.b(typeArr[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
