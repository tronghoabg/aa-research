package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class aezz<A, B, C> implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public aezz(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezz)) {
            return false;
        }
        aezz aezzVar = (aezz) obj;
        return affa.f(this.a, aezzVar.a) && affa.f(this.b, aezzVar.b) && affa.f(this.c, aezzVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }
}
