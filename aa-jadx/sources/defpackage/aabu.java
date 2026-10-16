package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aabu implements defpackage.zyp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final com.google.android.libraries.maps.model.CameraPosition e;
    public final int f;
    public final int g;
    public final double h;
    private final double i;
    private final android.graphics.Point j;

    public aabu(com.google.android.libraries.maps.model.CameraPosition cameraPosition, int i, int i2, double d, int i3, int i4, int i5, int i6) {
        defpackage.zlv.m(cameraPosition);
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = i6;
        this.e = cameraPosition;
        this.f = i;
        this.g = i2;
        this.h = d;
        this.i = cameraPosition.zoom;
        this.j = new android.graphics.Point(i3 + (((i - i3) - i5) / 2), i4 + (((i2 - i4) - i6) / 2));
    }

    public static defpackage.aabt e(com.google.android.libraries.maps.model.LatLng latLng, double d, double d2) {
        defpackage.zlv.d(d >= 0.0d);
        defpackage.zlv.m(latLng);
        double d3 = latLng.longitude;
        double dPow = java.lang.Math.pow(2.0d, d) * 256.0d;
        double dSin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.latitude));
        double d4 = dPow * d2;
        double d5 = d4 / 2.0d;
        return new defpackage.aabt((long) (d5 + ((d3 / 360.0d) * d4)), (long) (d5 - (((java.lang.Math.log((dSin + 1.0d) / (1.0d - dSin)) / 4.0d) / 3.141592653589793d) * d4)));
    }

    @Override // defpackage.zyp
    public final android.graphics.Point a(com.google.android.libraries.maps.model.LatLng latLng) {
        com.google.android.libraries.maps.model.CameraPosition cameraPosition = this.e;
        double d = this.i;
        double d2 = this.h;
        defpackage.aabt aabtVarE = e(latLng, d, d2);
        defpackage.aabt aabtVarE2 = e(cameraPosition.target, d, d2);
        long j = aabtVarE.a;
        long j2 = aabtVarE2.a;
        long jD = d();
        long j3 = j - j2;
        if (j3 > jD / 2) {
            j3 -= jD;
        }
        if (j3 < (-jD) / 2) {
            j3 += jD;
        }
        android.graphics.Point point = this.j;
        return new android.graphics.Point((int) (((long) point.x) + j3), (int) (((long) point.y) + (aabtVarE.b - aabtVarE2.b)));
    }

    @Override // defpackage.zyp
    public final com.google.android.libraries.maps.model.LatLng b(android.graphics.Point point) {
        com.google.android.libraries.maps.model.LatLng latLng = this.e.target;
        double d = this.i;
        double d2 = this.h;
        defpackage.aabt aabtVarE = e(latLng, d, d2);
        long j = aabtVarE.a;
        android.graphics.Point point2 = this.j;
        defpackage.aabt aabtVar = new defpackage.aabt((j - point2.x) + ((long) point.x), (aabtVarE.b - ((long) point2.y)) + ((long) point.y));
        double dPow = java.lang.Math.pow(2.0d, d) * 256.0d;
        long j2 = aabtVar.a;
        double d3 = dPow * d2;
        double dAtan = java.lang.Math.atan(java.lang.Math.exp((((-aabtVar.b) / d3) + 0.5d) * 6.283185307179586d));
        return new com.google.android.libraries.maps.model.LatLng(java.lang.Math.toDegrees((dAtan + dAtan) - 1.5707963267948966d), java.lang.Math.toDegrees(((j2 / d3) - 0.5d) * 6.283185307179586d));
    }

    @Override // defpackage.zyp
    public final com.google.android.libraries.maps.model.VisibleRegion c() {
        com.google.android.libraries.maps.model.LatLngBounds latLngBounds;
        int i = this.a;
        int i2 = this.b;
        com.google.android.libraries.maps.model.LatLng latLngB = b(new android.graphics.Point(i, i2));
        int i3 = this.f - this.c;
        com.google.android.libraries.maps.model.LatLng latLngB2 = b(new android.graphics.Point(i3, i2));
        int i4 = this.g - this.d;
        com.google.android.libraries.maps.model.LatLng latLngB3 = b(new android.graphics.Point(i, i4));
        com.google.android.libraries.maps.model.LatLng latLngB4 = b(new android.graphics.Point(i3, i4));
        if (defpackage.adel.a.fF().i()) {
            com.google.android.libraries.maps.model.LatLngBounds.Builder builder = new com.google.android.libraries.maps.model.LatLngBounds.Builder();
            builder.include(latLngB3);
            builder.include(latLngB2);
            builder.include(latLngB);
            builder.include(latLngB4);
            latLngBounds = builder.build();
        } else {
            latLngBounds = new com.google.android.libraries.maps.model.LatLngBounds(latLngB3, latLngB2);
        }
        return new com.google.android.libraries.maps.model.VisibleRegion(latLngB3, latLngB4, latLngB, latLngB2, latLngBounds);
    }

    public final long d() {
        return (long) (java.lang.Math.pow(2.0d, this.i) * 256.0d * this.h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.aabu)) {
            return false;
        }
        defpackage.aabu aabuVar = (defpackage.aabu) obj;
        if (defpackage.a.B(this.e, aabuVar.e)) {
            if (defpackage.a.B(java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(aabuVar.f))) {
                if (defpackage.a.B(java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(aabuVar.g))) {
                    if (defpackage.a.B(java.lang.Double.valueOf(this.h), java.lang.Double.valueOf(aabuVar.h))) {
                        if (defpackage.a.B(java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(aabuVar.a))) {
                            if (defpackage.a.B(java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(aabuVar.b))) {
                                if (defpackage.a.B(java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(aabuVar.c))) {
                                    if (defpackage.a.B(java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(aabuVar.d))) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.e, java.lang.Integer.valueOf(this.f), java.lang.Integer.valueOf(this.g), java.lang.Double.valueOf(this.h), java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }
}
