package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zyw {
    public final double a;
    public final double b;
    public final double c;

    public zyw(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public static defpackage.zyw b(com.google.android.libraries.maps.model.LatLng latLng) {
        double radians = java.lang.Math.toRadians(latLng.latitude);
        double radians2 = java.lang.Math.toRadians(latLng.longitude);
        double dCos = java.lang.Math.cos(radians);
        return new defpackage.zyw(java.lang.Math.cos(radians2) * dCos, java.lang.Math.sin(radians2) * dCos, java.lang.Math.sin(radians));
    }

    public final com.google.android.libraries.maps.model.LatLng a() {
        double d = this.a;
        if (d == 0.0d && this.b == 0.0d && this.c == 0.0d) {
            throw new java.lang.ArithmeticException();
        }
        double d2 = this.c;
        double d3 = this.b;
        return new com.google.android.libraries.maps.model.LatLng(java.lang.Math.toDegrees(java.lang.Math.atan2(d2, java.lang.Math.sqrt((d * d) + (d3 * d3)))), java.lang.Math.toDegrees((d3 == 0.0d && d == 0.0d) ? 0.0d : java.lang.Math.atan2(d3, d)));
    }

    public final defpackage.zyw c(double d) {
        double d2 = this.c;
        return new defpackage.zyw(d * this.a, d * this.b, d * d2);
    }

    public final java.lang.String toString() {
        defpackage.zte zteVarA = defpackage.zte.a(this);
        zteVarA.c("x", this.a);
        zteVarA.c("y", this.b);
        zteVarA.c("z", this.c);
        return zteVarA.toString();
    }
}
