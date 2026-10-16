package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class dzi {
    public final Object a;
    public final Object b;

    public dzi(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dzi)) {
            return false;
        }
        dzi dziVar = (dzi) obj;
        return Objects.equals(dziVar.a, this.a) && Objects.equals(dziVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
