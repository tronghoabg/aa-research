package defpackage;

import com.google.android.libraries.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public final class aads {
    public static final aads a = new aads();
    private static final double b = 1.0d / Math.log(2.0d);

    private aads() {
    }

    public static double a(int i, double d, double d2) {
        return Math.log(((d / (d2 * 256.0d)) / i) * 1.073741824E9d) * b;
    }

    public static final zzq b(LatLngBounds latLngBounds) {
        zkt.n(latLngBounds, "LatLngBounds");
        zzq zzqVar = new zzq(latLngBounds.northeast);
        zzq zzqVar2 = new zzq(latLngBounds.southwest);
        int iE = e(zzqVar, zzqVar2);
        int iD = d(zzqVar, zzqVar2);
        int i = zzqVar2.a + (iE / 2);
        return new zzq(a.H(i), zzqVar2.b + (iD / 2));
    }

    public static final double c(LatLngBounds latLngBounds, double d, double d2, double d3) {
        zkt.n(latLngBounds, "LatLngBounds");
        boolean z = true;
        if (d <= 0.0d && d2 <= 0.0d) {
            z = false;
        }
        zkt.g(z, "screenWidthPx and screenHeight are both <= 0");
        zkt.o(d3, "screenDensity is 0");
        zzq zzqVar = new zzq(latLngBounds.northeast);
        zzq zzqVar2 = new zzq(latLngBounds.southwest);
        int iE = e(zzqVar, zzqVar2);
        int iD = d(zzqVar, zzqVar2);
        double dA = d > 0.0d ? a(iE, d, d3) : -1.0d;
        double dA2 = d2 > 0.0d ? a(iD, d2, d3) : -1.0d;
        return dA < 0.0d ? dA2 : dA2 < 0.0d ? dA : Math.min(dA, dA2);
    }

    private static int d(zzq zzqVar, zzq zzqVar2) {
        return zzqVar.b - zzqVar2.b;
    }

    private static int e(zzq zzqVar, zzq zzqVar2) {
        int i = zzqVar.a;
        int i2 = zzqVar2.a;
        return i < i2 ? (1073741824 - i2) + i : i - i2;
    }
}
