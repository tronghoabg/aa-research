package na;

import Va.M6;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f40957a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f40958b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f40959c;

    public b(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(M6.n(cls, "Must specify owner type for "));
        }
        this.f40957a = type == null ? null : d.a(type);
        this.f40958b = d.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f40959c = typeArr2;
        int length = typeArr2.length;
        for (int i5 = 0; i5 < length; i5++) {
            Objects.requireNonNull(this.f40959c[i5]);
            d.c(this.f40959c[i5]);
            Type[] typeArr3 = this.f40959c;
            typeArr3[i5] = d.a(typeArr3[i5]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f40959c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f40957a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f40958b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f40959c) ^ this.f40958b.hashCode();
        Type type = this.f40957a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f40959c;
        int length = typeArr.length;
        Type type = this.f40958b;
        if (length == 0) {
            return d.l(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(d.l(type));
        sb2.append("<");
        sb2.append(d.l(typeArr[0]));
        for (int i5 = 1; i5 < length; i5++) {
            sb2.append(", ");
            sb2.append(d.l(typeArr[i5]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
