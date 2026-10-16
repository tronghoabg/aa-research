package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nts {
    public final boolean a;
    public final boolean b;

    public nts(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.nts) {
            defpackage.nts ntsVar = (defpackage.nts) obj;
            if (this.a == ntsVar.a && this.b == ntsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "CarrierConfig{show4gForLte=" + this.a + ", hideLtePlus=" + this.b + "}";
    }

    public nts() {
        throw null;
    }
}
