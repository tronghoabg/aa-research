package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uzq {
    public final boolean a;

    public uzq(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof defpackage.uzq) && this.a == ((defpackage.uzq) obj).a;
    }

    public final int hashCode() {
        return ((((((((true != this.a ? 1237 : 1231) ^ 385623362) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003;
    }

    public final java.lang.String toString() {
        return "{false, " + this.a + ", false, false, false, null}";
    }

    public uzq() {
        throw null;
    }
}
