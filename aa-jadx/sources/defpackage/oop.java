package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oop {
    public final double a;
    public final double b;
    public final defpackage.oom c;
    public final j$.time.Instant d;
    public final java.lang.String e;

    public oop(double d, double d2, defpackage.oom oomVar, j$.time.Instant instant, java.lang.String str) {
        this.a = d;
        this.b = d2;
        this.c = oomVar;
        if (instant == null) {
            throw new java.lang.NullPointerException("Null requestTime");
        }
        this.d = instant;
        this.e = str;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.oom oomVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oop) {
            defpackage.oop oopVar = (defpackage.oop) obj;
            if (java.lang.Double.doubleToLongBits(this.a) == java.lang.Double.doubleToLongBits(oopVar.a)) {
                if (java.lang.Double.doubleToLongBits(this.b) == java.lang.Double.doubleToLongBits(oopVar.b) && ((oomVar = this.c) != null ? oomVar.equals(oopVar.c) : oopVar.c == null) && this.d.equals(oopVar.d) && this.e.equals(oopVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.a;
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(d) ^ (java.lang.Double.doubleToLongBits(d) >>> 32);
        double d2 = this.b;
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(d2) ^ (java.lang.Double.doubleToLongBits(d2) >>> 32);
        defpackage.oom oomVar = this.c;
        return this.e.hashCode() ^ ((((((((((int) jDoubleToLongBits) ^ 1000003) * 1000003) ^ ((int) jDoubleToLongBits2)) * 1000003) ^ (oomVar == null ? 0 : oomVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final java.lang.String toString() {
        j$.time.Instant instant = this.d;
        return "WeatherFetcherInfo{latitude=" + this.a + ", longitude=" + this.b + ", weatherDisplayData=" + java.lang.String.valueOf(this.c) + ", requestTime=" + instant.toString() + ", status=" + this.e + "}";
    }

    protected oop() {
        throw null;
    }
}
