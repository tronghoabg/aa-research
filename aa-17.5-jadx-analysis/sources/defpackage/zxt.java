package defpackage;

import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
public final class zxt {
    public final double a;
    public final double b;
    public final double c;

    public zxt(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public static zxt b(LatLng latLng) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double dCos = Math.cos(radians);
        return new zxt(Math.cos(radians2) * dCos, Math.sin(radians2) * dCos, Math.sin(radians));
    }

    public final LatLng a() {
        double d = this.a;
        if (d == 0.0d && this.b == 0.0d && this.c == 0.0d) {
            throw new ArithmeticException();
        }
        double d2 = this.c;
        double d3 = this.b;
        return new LatLng(Math.toDegrees(Math.atan2(d2, Math.sqrt((d * d) + (d3 * d3)))), Math.toDegrees((d3 == 0.0d && d == 0.0d) ? 0.0d : Math.atan2(d3, d)));
    }

    public final zxt c(double d) {
        double d2 = this.c;
        return new zxt(d * this.a, d * this.b, d * d2);
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.c("x", this.a);
        zsaVarA.c("y", this.b);
        zsaVarA.c("z", this.c);
        return zsaVarA.toString();
    }
}
