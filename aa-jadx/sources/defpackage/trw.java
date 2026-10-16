package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class trw {
    public final float a;
    private final boolean b;

    public trw(byte[] bArr) {
        this.a = 65.0f;
        this.b = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.trw) {
            defpackage.trw trwVar = (defpackage.trw) obj;
            if (java.lang.Float.floatToIntBits(this.a) == java.lang.Float.floatToIntBits(trwVar.a) && this.b == trwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((java.lang.Float.floatToIntBits(this.a) ^ 1000003) * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.a + ", " + this.b + "}";
    }

    public trw() {
        throw null;
    }
}
