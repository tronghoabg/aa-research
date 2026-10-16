package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class aezu<A, B> implements Serializable {
    public final Object a;
    public final Object b;

    public aezu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezu)) {
            return false;
        }
        aezu aezuVar = (aezu) obj;
        return affa.f(this.a, aezuVar.a) && affa.f(this.b, aezuVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}
