package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;

/* loaded from: classes3.dex */
final class aadz extends aady {
    private final double d;

    public aadz(CameraPosition cameraPosition, CameraPosition cameraPosition2, long j) {
        super(cameraPosition, cameraPosition2, j);
        zkt.n(cameraPosition2, "b");
        double dPow = 0.0d;
        if (!a.C(cameraPosition.target, cameraPosition2.target)) {
            LatLng latLng = cameraPosition.target;
            LatLng latLng2 = cameraPosition2.target;
            zkt.n(latLng, "a");
            zkt.n(latLng2, "b");
            int iE = e(latLng.longitude);
            int iD = d(latLng.latitude);
            int iE2 = e(latLng2.longitude);
            int iD2 = d(latLng2.latitude);
            int i = iE2 - iE;
            if (i > 536870912) {
                iE2 -= 1073741824;
            } else if (i < -536870912) {
                iE2 += 1073741824;
            }
            if (Math.hypot(iE - iE2, iD - iD2) / (1073741824 >> Math.min(30, Math.round((cameraPosition.zoom + cameraPosition2.zoom) * 0.5f))) > 6.0d) {
                dPow = Math.pow(2.0d, ((Math.log(r10) * aaeb.c) * 2.39d) - 58.71d);
            }
        }
        this.d = dPow;
    }

    private static double c(double d) {
        return Math.exp((4.0d - d) / aaeb.c) * 10.0d;
    }

    private static int d(double d) {
        aclh.o(d >= -90.0d && d <= 90.0d, "latitude: %s", new Object[]{Double.valueOf(d)});
        return (int) Math.round(Math.log(Math.max(0.0d, Math.tan((d * 0.5d * 0.017453292519943295d) + 0.7853981633974483d))) * 1.708913188941079E8d);
    }

    private static int e(double d) {
        return (int) Math.round(d * 0.017453292519943295d * 1.708913188941079E8d);
    }

    @Override // defpackage.aady
    protected final double a(double d) {
        return 1.0d - ((Math.cos(d * 3.141592653589793d) + 1.0d) * 0.5d);
    }

    @Override // defpackage.aady
    protected final double b(double d, double d2, double d3) {
        double dB = aaeb.b(c(d), c(d2), null, d3) + (Math.pow((float) Math.sin(3.1415927410125732d * d3), 1.2d) * 0.5d * Math.pow(this.d, 0.4d));
        if (dB > 0.0d) {
            return ((-Math.log(dB * 0.1d)) * aaeb.c) + 4.0d;
        }
        return 32.0d;
    }
}
