package ib;

import hb.P;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes4.dex */
public final class e implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f36937a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f36938b;

    public e(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            f.b(typeArr[0]);
            this.f36938b = null;
            this.f36937a = f.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        f.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f36938b = f.a(typeArr2[0]);
        this.f36937a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && P.b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f36938b;
        return type != null ? new Type[]{type} : f.f36940b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f36937a};
    }

    public final int hashCode() {
        Type type = this.f36938b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f36937a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f36938b;
        if (type != null) {
            return "? super " + f.k(type);
        }
        Type type2 = this.f36937a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f.k(type2);
    }
}
