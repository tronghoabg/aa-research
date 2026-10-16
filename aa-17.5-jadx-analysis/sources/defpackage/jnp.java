package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class jnp {
    public static final yph a = yph.c("GH.CarChiSvcCtor");
    public final Context b;
    public final zgp c;
    public final ServiceConnection d;

    public jnp(Context context, Handler handler) {
        woy.aa(handler.getLooper() != Looper.getMainLooper(), "Provided handler is the main thread. Chimera connector requires a background thread.");
        this.b = context;
        zhc zhcVar = new zhc();
        Intent action = new Intent().setComponent((ComponentName) itx.a.gu()).setAction("com.google.android.gms.car.service.START");
        this.d = new jnn(handler, zhcVar);
        handler.post(new jno(this, context, action, zhcVar));
        this.c = zhcVar;
    }

    public static void a(zhc zhcVar, String str) {
        ((ype) ((ype) a.g()).ai((char) 2415)).y("Connection failure: %s", new zjd(zjc.a, str));
        zhcVar.p(new IllegalStateException(str));
    }

    public static void b(zhc zhcVar, String str, Throwable th) {
        ((ype) ((ype) ((ype) a.g()).p(th)).ai((char) 2416)).y("Connection failure: %s", new zjd(zjc.a, str));
        zhcVar.p(new IllegalStateException(str, th));
    }

    public static boolean c(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return true;
        } catch (Exception e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 2417)).u("Exception unbinding service connection.");
            return false;
        }
    }
}
