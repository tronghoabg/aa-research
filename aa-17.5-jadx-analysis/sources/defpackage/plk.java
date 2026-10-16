package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class plk implements uyl, pli {
    private static final yob a = yob.c("com/google/android/apps/gmm/shared/devicestate/NetworkInfoBasedDeviceNetworkStatus");
    private final Context b;
    private plh c;
    private final ajab d;

    public plk(Context context, lws lwsVar) {
        context.getClass();
        lwsVar.getClass();
        this.b = context;
        this.d = ajac.a(new plh(false, aaok.DISCONNECTED, null));
    }

    @Override // defpackage.pli
    public final boolean a() {
        return this.b.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[Catch: SecurityException -> 0x00e6, TryCatch #1 {SecurityException -> 0x00e6, blocks: (B:3:0x000d, B:5:0x0019, B:9:0x0024, B:11:0x002d, B:35:0x007a, B:63:0x00dc, B:64:0x00dd, B:66:0x00e4, B:67:0x00e5, B:15:0x003a, B:28:0x0059, B:33:0x0067, B:29:0x005c, B:30:0x005f, B:31:0x0062, B:32:0x0065, B:34:0x0073, B:36:0x007b, B:52:0x0098, B:54:0x009c, B:56:0x00a6, B:58:0x00b5, B:60:0x00c2, B:62:0x00d1, B:61:0x00ca, B:57:0x00ae, B:39:0x0081, B:43:0x008a), top: B:74:0x000d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[Catch: all -> 0x00e3, TryCatch #0 {, blocks: (B:36:0x007b, B:52:0x0098, B:54:0x009c, B:56:0x00a6, B:58:0x00b5, B:60:0x00c2, B:62:0x00d1, B:61:0x00ca, B:57:0x00ae, B:39:0x0081, B:43:0x008a), top: B:72:0x007b, outer: #1 }] */
    @Override // defpackage.pli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plk.c():boolean");
    }

    @Override // defpackage.pli
    public final boolean d() {
        aaok aaokVar = aaok.WIFI;
        plh plhVar = (plh) this.d.b();
        return plhVar.a && plhVar.b == aaokVar;
    }

    @Override // defpackage.pli
    public final boolean e() {
        Object objDE;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            method.getClass();
            objDE = Boolean.valueOf(affa.f("wifi-only", method.invoke(null, "ro.carrier")));
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
        if (aezw.a(objDE) != null) {
            objDE = false;
        }
        return ((Boolean) objDE).booleanValue();
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }
}
