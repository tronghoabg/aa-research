package defpackage;

/* loaded from: classes.dex */
public final class zhs {
    public final boolean a;
    public final int b;
    public final float c;
    public final float d;
    public final double e;
    public final yfq f;

    public zhs(boolean z, int i, float f, float f2, double d, yfq yfqVar) {
        this.a = z;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = d;
        this.f = yfqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zhs) {
            zhs zhsVar = (zhs) obj;
            if (this.a == zhsVar.a && this.b == zhsVar.b) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(zhsVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(zhsVar.d)) {
                        if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(zhsVar.e) && yrm.W(this.f, zhsVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
        double d = this.e;
        return this.f.hashCode() ^ (((iFloatToIntBits * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "GrpcRetryConfig{enabled=" + this.a + ", maxAttempts=" + this.b + ", initialBackoffSeconds=" + this.c + ", maxBackoffSeconds=" + this.d + ", backoffMultiplier=" + this.e + ", retryableStatusCodes=" + String.valueOf(this.f) + "}";
    }

    public zhs() {
        throw null;
    }
}
