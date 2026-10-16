package defpackage;

import j$.time.Instant;

/* loaded from: classes2.dex */
public final class ony {
    public final double a;
    public final double b;
    public final onv c;
    public final Instant d;
    public final String e;

    public ony(double d, double d2, onv onvVar, Instant instant, String str) {
        this.a = d;
        this.b = d2;
        this.c = onvVar;
        if (instant == null) {
            throw new NullPointerException("Null requestTime");
        }
        this.d = instant;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        onv onvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ony) {
            ony onyVar = (ony) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(onyVar.a)) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(onyVar.b) && ((onvVar = this.c) != null ? onvVar.equals(onyVar.c) : onyVar.c == null) && this.d.equals(onyVar.d) && this.e.equals(onyVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.a;
        long jDoubleToLongBits = Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32);
        double d2 = this.b;
        long jDoubleToLongBits2 = Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32);
        onv onvVar = this.c;
        return this.e.hashCode() ^ ((((((((((int) jDoubleToLongBits) ^ 1000003) * 1000003) ^ ((int) jDoubleToLongBits2)) * 1000003) ^ (onvVar == null ? 0 : onvVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        Instant instant = this.d;
        return "WeatherFetcherInfo{latitude=" + this.a + ", longitude=" + this.b + ", weatherDisplayData=" + String.valueOf(this.c) + ", requestTime=" + instant.toString() + ", status=" + this.e + "}";
    }

    protected ony() {
        throw null;
    }
}
