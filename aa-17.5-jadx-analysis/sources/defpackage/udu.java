package defpackage;

/* loaded from: classes3.dex */
public final class udu {
    public final udo a;
    public final udo b;

    public udu(udo udoVar, udo udoVar2) {
        udoVar.getClass();
        this.a = udoVar;
        this.b = udoVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udu) {
            udu uduVar = (udu) obj;
            if (this.a.equals(uduVar.a) && this.b.equals(uduVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        udo udoVar = this.b;
        return "{" + this.a.toString() + ", " + udoVar.toString() + "}";
    }

    public udu() {
        throw null;
    }
}
