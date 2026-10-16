package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sjo {
    public static final defpackage.sjo a = c(1, java.lang.Double.valueOf(0.0d));
    public static final defpackage.sjo b = c(3, null);
    public static final defpackage.sjo c;
    public static final defpackage.sjo d;
    public final double e;
    private final int f;

    static {
        c(4, null);
        c = c(5, null);
        d = c(2, java.lang.Double.valueOf(1.0d));
    }

    public sjo(int i, double d2) {
        this.f = i;
        this.e = d2;
    }

    public static defpackage.sjo a(boolean z, double d2) {
        return c(true == z ? 2 : 1, java.lang.Double.valueOf(d2));
    }

    static defpackage.sjo c(int i, java.lang.Double d2) {
        if (d2 == null) {
            d2 = java.lang.Double.valueOf(0.0d);
        }
        return new defpackage.sjo(i, d2.doubleValue());
    }

    public final boolean b() {
        return this.f != 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.sjo) {
            defpackage.sjo sjoVar = (defpackage.sjo) obj;
            if (this.f == sjoVar.f) {
                if (java.lang.Double.doubleToLongBits(this.e) == java.lang.Double.doubleToLongBits(sjoVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.e;
        return ((this.f ^ 1000003) * 1000003) ^ ((int) (java.lang.Double.doubleToLongBits(d2) ^ (java.lang.Double.doubleToLongBits(d2) >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        if (i == 1) {
            str = "NO_UPLOAD";
        } else if (i == 2) {
            str = "UPLOAD";
        } else if (i != 3) {
            str = i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT";
        } else {
            str = "ALWAYS_UPLOAD_DUE_TO_ERROR";
        }
        return "LogSamplerResult{samplingDecision=" + str + ", overallEffectiveSamplingRate=" + this.e + "}";
    }

    public sjo() {
        throw null;
    }
}
