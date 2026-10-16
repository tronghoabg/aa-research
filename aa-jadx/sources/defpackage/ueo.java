package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ueo {
    public final defpackage.tpm a;
    public final float b;
    public final j$.util.Optional c;
    public final long d;
    public final long e;

    public ueo(defpackage.tpm tpmVar, float f, j$.util.Optional optional, long j, long j2) {
        this.a = tpmVar;
        this.b = f;
        this.c = optional;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ueo) {
            defpackage.ueo ueoVar = (defpackage.ueo) obj;
            defpackage.tpm tpmVar = this.a;
            if (tpmVar != null ? tpmVar.equals(ueoVar.a) : ueoVar.a == null) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(ueoVar.b) && this.c.equals(ueoVar.c) && this.d == ueoVar.d && this.e == ueoVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.tpm tpmVar = this.a;
        int iHashCode = (((((tpmVar == null ? 0 : tpmVar.hashCode()) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.c;
        return "{" + java.lang.String.valueOf(this.a) + ", " + this.b + ", " + java.lang.String.valueOf(optional) + ", " + this.d + ", " + this.e + "}";
    }

    public ueo() {
        throw null;
    }
}
