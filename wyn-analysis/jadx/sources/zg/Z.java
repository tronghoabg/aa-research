package zg;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes5.dex */
public final class Z implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f48612a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f48613b;

    public Z(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            a0.b(typeArr[0]);
            this.f48613b = null;
            this.f48612a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        a0.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f48613b = typeArr2[0];
        this.f48612a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && a0.c(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f48613b;
        return type != null ? new Type[]{type} : a0.f48621a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f48612a};
    }

    public final int hashCode() {
        Type type = this.f48613b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f48612a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f48613b;
        if (type != null) {
            return "? super " + a0.p(type);
        }
        Type type2 = this.f48612a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + a0.p(type2);
    }
}
