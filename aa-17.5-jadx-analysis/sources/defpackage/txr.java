package defpackage;

/* loaded from: classes3.dex */
public final class txr {
    public final uly a;
    public final int b;

    public txr(uly ulyVar, int i) {
        this.a = ulyVar;
        this.b = i;
    }

    public final ujk a() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof txr) {
            txr txrVar = (txr) obj;
            if (this.a.equals(txrVar.a) && this.b == txrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", " + this.b + "}";
    }

    public txr() {
        throw null;
    }
}
