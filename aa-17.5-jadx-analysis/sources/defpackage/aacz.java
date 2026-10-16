package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class aacz {
    private static final String a = "aacz";
    private LatLngBounds b;
    private float c;
    private float d;

    public aacz() {
        zkt.n(aads.a, "cameraUtils");
        this.b = null;
        this.c = 2.0f;
        this.d = 21.0f;
    }

    private static double h(double d, double d2, double d3) {
        return Math.max(Math.min(d, d3), d2);
    }

    private static double i(double d, double d2) {
        double dAbs = Math.abs(d - d2);
        return dAbs < 180.0d ? dAbs : 360.0d - dAbs;
    }

    private static float j(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    private final float k(float f, LatLng latLng, boolean z, zsb zsbVar, double d) {
        float fN = n(l(f), z, zsbVar, d);
        zkt.n(latLng, "latLng");
        return j(fN, 2.0f, 21.0f);
    }

    private final synchronized float l(float f) {
        return j(f, this.c, this.d);
    }

    private static synchronized boolean m(LatLngBounds latLngBounds, double d) {
        double d2 = latLngBounds.southwest.longitude;
        double d3 = latLngBounds.northeast.longitude;
        return d2 <= d3 ? d2 <= d && d <= d3 : d2 <= d || d <= d3;
    }

    private static float n(float f, boolean z, zsb zsbVar, double d) {
        if (!z) {
            return f;
        }
        zrq zrqVar = (zrq) zsbVar;
        double d2 = zrqVar.a;
        double d3 = zrqVar.b;
        zkt.o(d2, "screenWidthPx is 0");
        zkt.o(d3, "screenHeightPx is 0");
        zkt.o(d, "screenDensity is 0");
        return Math.max(f, (float) Math.ceil(aads.a(1073741824, (int) (((int) Math.ceil(Math.hypot(d2, d3))) + (256.0d * d)), d)));
    }

    public final synchronized float a(float f, LatLng latLng, aaet aaetVar) throws Throwable {
        try {
            try {
                return k(f, latLng, aaetVar.x(), aaetVar.k(), aaetVar.a);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @ResultIgnorabilityUnspecified
    public final CameraPosition b(CameraPosition cameraPosition, aaet aaetVar) {
        zkt.n(aaetVar, "worldModelState");
        return c(cameraPosition, aaetVar.a(), aaetVar.k(), aaetVar.x(), aaetVar.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7 A[Catch: all -> 0x0262, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x001e, B:8:0x0036, B:10:0x0046, B:11:0x0049, B:12:0x004b, B:14:0x0075, B:23:0x00a4, B:25:0x00b9, B:30:0x00cb, B:32:0x00f7, B:37:0x0115, B:43:0x0124, B:49:0x0156, B:53:0x01b0, B:55:0x01c0, B:65:0x0233, B:67:0x0240, B:69:0x0246, B:74:0x024e, B:60:0x01d7, B:62:0x01e5, B:52:0x019c, B:35:0x00fd, B:36:0x0104, B:17:0x007d, B:21:0x009f, B:20:0x0095, B:22:0x00a2), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c A[Catch: all -> 0x0262, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x001e, B:8:0x0036, B:10:0x0046, B:11:0x0049, B:12:0x004b, B:14:0x0075, B:23:0x00a4, B:25:0x00b9, B:30:0x00cb, B:32:0x00f7, B:37:0x0115, B:43:0x0124, B:49:0x0156, B:53:0x01b0, B:55:0x01c0, B:65:0x0233, B:67:0x0240, B:69:0x0246, B:74:0x024e, B:60:0x01d7, B:62:0x01e5, B:52:0x019c, B:35:0x00fd, B:36:0x0104, B:17:0x007d, B:21:0x009f, B:20:0x0095, B:22:0x00a2), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7 A[Catch: all -> 0x0262, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x001e, B:8:0x0036, B:10:0x0046, B:11:0x0049, B:12:0x004b, B:14:0x0075, B:23:0x00a4, B:25:0x00b9, B:30:0x00cb, B:32:0x00f7, B:37:0x0115, B:43:0x0124, B:49:0x0156, B:53:0x01b0, B:55:0x01c0, B:65:0x0233, B:67:0x0240, B:69:0x0246, B:74:0x024e, B:60:0x01d7, B:62:0x01e5, B:52:0x019c, B:35:0x00fd, B:36:0x0104, B:17:0x007d, B:21:0x009f, B:20:0x0095, B:22:0x00a2), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e5 A[Catch: all -> 0x0262, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x001e, B:8:0x0036, B:10:0x0046, B:11:0x0049, B:12:0x004b, B:14:0x0075, B:23:0x00a4, B:25:0x00b9, B:30:0x00cb, B:32:0x00f7, B:37:0x0115, B:43:0x0124, B:49:0x0156, B:53:0x01b0, B:55:0x01c0, B:65:0x0233, B:67:0x0240, B:69:0x0246, B:74:0x024e, B:60:0x01d7, B:62:0x01e5, B:52:0x019c, B:35:0x00fd, B:36:0x0104, B:17:0x007d, B:21:0x009f, B:20:0x0095, B:22:0x00a2), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022c  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.libraries.maps.model.CameraPosition c(com.google.android.libraries.maps.model.CameraPosition r30, double r31, defpackage.zsb r33, boolean r34, double r35) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aacz.c(com.google.android.libraries.maps.model.CameraPosition, double, zsb, boolean, double):com.google.android.libraries.maps.model.CameraPosition");
    }

    public final synchronized void d() {
        this.c = 2.0f;
        this.d = 21.0f;
    }

    public final synchronized void e(LatLngBounds latLngBounds) {
        this.b = latLngBounds;
    }

    public final synchronized void f(float f) {
        float fJ = j(f, 2.0f, 21.0f);
        this.d = fJ;
        this.c = Math.min(fJ, this.c);
    }

    public final synchronized void g(float f) {
        float fJ = j(f, 2.0f, 21.0f);
        this.c = fJ;
        this.d = Math.max(fJ, this.d);
    }
}
