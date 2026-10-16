package ib;

import hb.P;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes4.dex */
public final class d implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f36934a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f36935b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f36936c;

    public d(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || P.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f36934a = type == null ? null : f.a(type);
        this.f36935b = f.a(type2);
        this.f36936c = (Type[]) typeArr.clone();
        int i5 = 0;
        while (true) {
            Type[] typeArr2 = this.f36936c;
            if (i5 >= typeArr2.length) {
                return;
            }
            typeArr2[i5].getClass();
            f.b(this.f36936c[i5]);
            Type[] typeArr3 = this.f36936c;
            typeArr3[i5] = f.a(typeArr3[i5]);
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && P.b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f36936c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f36934a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f36935b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f36936c) ^ this.f36935b.hashCode();
        Set set = f.f36939a;
        Type type = this.f36934a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f36936c;
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(f.k(this.f36935b));
        if (typeArr.length == 0) {
            return sb2.toString();
        }
        sb2.append("<");
        sb2.append(f.k(typeArr[0]));
        for (int i5 = 1; i5 < typeArr.length; i5++) {
            sb2.append(", ");
            sb2.append(f.k(typeArr[i5]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
