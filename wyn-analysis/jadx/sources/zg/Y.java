package zg;

import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Y implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f48609a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f48610b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f48611c;

    public Y(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            a0.b(type3);
        }
        this.f48609a = type;
        this.f48610b = type2;
        this.f48611c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && a0.c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f48611c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f48609a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f48610b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f48611c) ^ this.f48610b.hashCode();
        Type type = this.f48609a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f48611c;
        int length = typeArr.length;
        Type type = this.f48610b;
        if (length == 0) {
            return a0.p(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(a0.p(type));
        sb2.append("<");
        sb2.append(a0.p(typeArr[0]));
        for (int i5 = 1; i5 < typeArr.length; i5++) {
            sb2.append(", ");
            sb2.append(a0.p(typeArr[i5]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
