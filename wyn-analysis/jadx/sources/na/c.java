package na;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes4.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f40960a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f40961b;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.f40961b = null;
            this.f40960a = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.f40961b = d.a(typeArr2[0]);
        this.f40960a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f40961b;
        return type != null ? new Type[]{type} : d.f40962a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f40960a};
    }

    public final int hashCode() {
        Type type = this.f40961b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f40960a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f40961b;
        if (type != null) {
            return "? super " + d.l(type);
        }
        Type type2 = this.f40960a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.l(type2);
    }
}
