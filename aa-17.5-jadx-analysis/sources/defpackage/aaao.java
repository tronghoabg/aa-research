package defpackage;

import android.graphics.Point;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.VisibleRegion;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaao implements zxm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final CameraPosition e;
    public final int f;
    public final int g;
    public final double h;
    private final double i;
    private final Point j;

    public aaao(CameraPosition cameraPosition, int i, int i2, double d, int i3, int i4, int i5, int i6) {
        zkt.m(cameraPosition);
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = i6;
        this.e = cameraPosition;
        this.f = i;
        this.g = i2;
        this.h = d;
        this.i = cameraPosition.zoom;
        this.j = new Point(i3 + (((i - i3) - i5) / 2), i4 + (((i2 - i4) - i6) / 2));
    }

    public static aaan e(LatLng latLng, double d, double d2) {
        zkt.d(d >= 0.0d);
        zkt.m(latLng);
        double d3 = latLng.longitude;
        double dPow = Math.pow(2.0d, d) * 256.0d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        double d4 = dPow * d2;
        double d5 = d4 / 2.0d;
        return new aaan((long) (d5 + ((d3 / 360.0d) * d4)), (long) (d5 - (((Math.log((dSin + 1.0d) / (1.0d - dSin)) / 4.0d) / 3.141592653589793d) * d4)));
    }

    @Override // defpackage.zxm
    public final Point a(LatLng latLng) {
        CameraPosition cameraPosition = this.e;
        double d = this.i;
        double d2 = this.h;
        aaan aaanVarE = e(latLng, d, d2);
        aaan aaanVarE2 = e(cameraPosition.target, d, d2);
        long j = aaanVarE.a;
        long j2 = aaanVarE2.a;
        long jD = d();
        long j3 = j - j2;
        if (j3 > jD / 2) {
            j3 -= jD;
        }
        if (j3 < (-jD) / 2) {
            j3 += jD;
        }
        Point point = this.j;
        return new Point((int) (point.x + j3), (int) (point.y + (aaanVarE.b - aaanVarE2.b)));
    }

    @Override // defpackage.zxm
    public final LatLng b(Point point) {
        LatLng latLng = this.e.target;
        double d = this.i;
        double d2 = this.h;
        aaan aaanVarE = e(latLng, d, d2);
        aaan aaanVar = new aaan((aaanVarE.a - this.j.x) + point.x, (aaanVarE.b - r0.y) + point.y);
        double dPow = Math.pow(2.0d, d) * 256.0d;
        long j = aaanVar.a;
        double dAtan = Math.atan(Math.exp((((-aaanVar.b) / (dPow * d2)) + 0.5d) * 6.283185307179586d));
        return new LatLng(Math.toDegrees((dAtan + dAtan) - 1.5707963267948966d), Math.toDegrees(((j / r0) - 0.5d) * 6.283185307179586d));
    }

    @Override // defpackage.zxm
    public final VisibleRegion c() {
        LatLngBounds latLngBounds;
        int i = this.a;
        int i2 = this.b;
        LatLng latLngB = b(new Point(i, i2));
        int i3 = this.f - this.c;
        LatLng latLngB2 = b(new Point(i3, i2));
        int i4 = this.g - this.d;
        LatLng latLngB3 = b(new Point(i, i4));
        LatLng latLngB4 = b(new Point(i3, i4));
        if (addm.a.gu().j()) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            builder.include(latLngB3);
            builder.include(latLngB2);
            builder.include(latLngB);
            builder.include(latLngB4);
            latLngBounds = builder.build();
        } else {
            latLngBounds = new LatLngBounds(latLngB3, latLngB2);
        }
        return new VisibleRegion(latLngB3, latLngB4, latLngB, latLngB2, latLngBounds);
    }

    public final long d() {
        return (long) (Math.pow(2.0d, this.i) * 256.0d * this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aaao)) {
            return false;
        }
        aaao aaaoVar = (aaao) obj;
        if (a.C(this.e, aaaoVar.e)) {
            if (a.C(Integer.valueOf(this.f), Integer.valueOf(aaaoVar.f))) {
                if (a.C(Integer.valueOf(this.g), Integer.valueOf(aaaoVar.g))) {
                    if (a.C(Double.valueOf(this.h), Double.valueOf(aaaoVar.h))) {
                        if (a.C(Integer.valueOf(this.a), Integer.valueOf(aaaoVar.a))) {
                            if (a.C(Integer.valueOf(this.b), Integer.valueOf(aaaoVar.b))) {
                                if (a.C(Integer.valueOf(this.c), Integer.valueOf(aaaoVar.c))) {
                                    if (a.C(Integer.valueOf(this.d), Integer.valueOf(aaaoVar.d))) {
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
        return Arrays.hashCode(new Object[]{this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), Double.valueOf(this.h), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
