package defpackage;

/* loaded from: classes.dex */
public final class siu {
    public static final siu a = c(1, Double.valueOf(0.0d));
    public static final siu b = c(3, null);
    public static final siu c;
    public static final siu d;
    public final double e;
    private final int f;

    static {
        c(4, null);
        c = c(5, null);
        d = c(2, Double.valueOf(1.0d));
    }

    public siu(int i, double d2) {
        this.f = i;
        this.e = d2;
    }

    public static siu a(boolean z, double d2) {
        return c(true == z ? 2 : 1, Double.valueOf(d2));
    }

    static siu c(int i, Double d2) {
        if (d2 == null) {
            d2 = Double.valueOf(0.0d);
        }
        return new siu(i, d2.doubleValue());
    }

    public final boolean b() {
        return this.f != 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof siu) {
            siu siuVar = (siu) obj;
            if (this.f == siuVar.f) {
                if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(siuVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.e;
        return ((this.f ^ 1000003) * 1000003) ^ ((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32)));
    }

    public final String toString() {
        int i = this.f;
        return "LogSamplerResult{samplingDecision=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", overallEffectiveSamplingRate=" + this.e + "}";
    }

    public siu() {
        throw null;
    }
}
