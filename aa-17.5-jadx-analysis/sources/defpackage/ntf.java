package defpackage;

/* loaded from: classes2.dex */
final class ntf {
    public final boolean a;
    public final boolean b;

    public ntf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntf) {
            ntf ntfVar = (ntf) obj;
            if (this.a == ntfVar.a && this.b == ntfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "CarrierConfig{show4gForLte=" + this.a + ", hideLtePlus=" + this.b + "}";
    }

    public ntf() {
        throw null;
    }
}
