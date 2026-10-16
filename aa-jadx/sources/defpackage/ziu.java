package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ziu {
    public final boolean a;
    public final int b;
    public final float c;
    public final float d;
    public final double e;
    public final defpackage.ygw f;

    public ziu(boolean z, int i, float f, float f2, double d, defpackage.ygw ygwVar) {
        this.a = z;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = d;
        this.f = ygwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ziu) {
            defpackage.ziu ziuVar = (defpackage.ziu) obj;
            if (this.a == ziuVar.a && this.b == ziuVar.b) {
                if (java.lang.Float.floatToIntBits(this.c) == java.lang.Float.floatToIntBits(ziuVar.c)) {
                    if (java.lang.Float.floatToIntBits(this.d) == java.lang.Float.floatToIntBits(ziuVar.d)) {
                        if (java.lang.Double.doubleToLongBits(this.e) == java.lang.Double.doubleToLongBits(ziuVar.e) && defpackage.ysr.W(this.f, ziuVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ java.lang.Float.floatToIntBits(this.c)) * 1000003) ^ java.lang.Float.floatToIntBits(this.d);
        double d = this.e;
        return this.f.hashCode() ^ (((iFloatToIntBits * 1000003) ^ ((int) (java.lang.Double.doubleToLongBits(d) ^ (java.lang.Double.doubleToLongBits(d) >>> 32)))) * 1000003);
    }

    public final java.lang.String toString() {
        return "GrpcRetryConfig{enabled=" + this.a + ", maxAttempts=" + this.b + ", initialBackoffSeconds=" + this.c + ", maxBackoffSeconds=" + this.d + ", backoffMultiplier=" + this.e + ", retryableStatusCodes=" + java.lang.String.valueOf(this.f) + "}";
    }

    public ziu() {
        throw null;
    }
}
