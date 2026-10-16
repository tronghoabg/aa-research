package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jnx {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CarChiSvcCtor");
    public final android.content.Context b;
    public final defpackage.zhs c;
    public final android.content.ServiceConnection d;

    public jnx(android.content.Context context, android.os.Handler handler) {
        defpackage.ysr.bk(handler.getLooper() != android.os.Looper.getMainLooper(), "Provided handler is the main thread. Chimera connector requires a background thread.");
        this.b = context;
        defpackage.zif zifVar = new defpackage.zif();
        android.content.Intent action = new android.content.Intent().setComponent((android.content.ComponentName) defpackage.iuf.a.fF()).setAction("com.google.android.gms.car.service.START");
        this.d = new defpackage.jnv(handler, zifVar);
        handler.post(new defpackage.jnw(this, context, action, zifVar));
        this.c = zifVar;
    }

    public static void a(defpackage.zif zifVar, java.lang.String str) {
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 2416)).y("Connection failure: %s", new defpackage.zkf(defpackage.zke.a, str));
        zifVar.p(new java.lang.IllegalStateException(str));
    }

    public static void b(defpackage.zif zifVar, java.lang.String str, java.lang.Throwable th) {
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(th)).ai((char) 2417)).y("Connection failure: %s", new defpackage.zkf(defpackage.zke.a, str));
        zifVar.p(new java.lang.IllegalStateException(str, th));
    }

    public static boolean c(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return true;
        } catch (java.lang.Exception e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 2418)).u("Exception unbinding service connection.");
            return false;
        }
    }
}
