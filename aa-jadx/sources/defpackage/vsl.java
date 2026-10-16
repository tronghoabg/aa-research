package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vsl {
    private static defpackage.vsl b;
    public final java.lang.Object a;

    public vsl(android.content.Context context, defpackage.vri vriVar) {
        this.a = vriVar;
        android.app.Application application = (android.app.Application) context;
        application.registerActivityLifecycleCallbacks(vriVar.a);
        application.registerComponentCallbacks(vriVar.a);
        if (android.os.Build.VERSION.SDK_INT < 37 || vriVar.b != null) {
            return;
        }
        vriVar.b = new defpackage.vrg();
        android.view.View.registerCalledFromWrongThreadListener(vriVar.b);
    }

    public static synchronized void c(defpackage.wyz wyzVar) {
        defpackage.ysr.bk(b == null, "Delegate already set");
        b = new defpackage.vsl(wyzVar);
    }

    public static synchronized defpackage.vsl g() {
        defpackage.vsl vslVar;
        vslVar = b;
        if (vslVar == null) {
            throw new java.lang.IllegalStateException("ProtoDataStoreFactoryProvider not initialized");
        }
        return vslVar;
    }

    public static defpackage.vsl h(android.content.Context context) {
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return null;
        }
        return new defpackage.vsl(notificationManager);
    }

    public final void a(defpackage.vrf vrfVar) {
        vrfVar.getClass();
        defpackage.vrh vrhVar = ((defpackage.vri) this.a).a;
        int i = defpackage.vrh.c;
        vrhVar.a.add(vrfVar);
    }

    public final void b(defpackage.vrf vrfVar) {
        defpackage.vrh vrhVar = ((defpackage.vri) this.a).a;
        int i = defpackage.vrh.c;
        vrhVar.a.remove(vrfVar);
    }

    public final defpackage.whw d(defpackage.whg whgVar) {
        return ((defpackage.mik) ((defpackage.wyz) this.a).a).a(whgVar);
    }

    public final android.app.NotificationChannel e(java.lang.String str) {
        return ((android.app.NotificationManager) this.a).getNotificationChannel(str);
    }

    public final void f(android.app.NotificationChannel notificationChannel) {
        ((android.app.NotificationManager) this.a).createNotificationChannel(notificationChannel);
    }

    private vsl(java.lang.Object obj) {
        this.a = obj;
    }

    public vsl(android.content.Context context) {
        this.a = defpackage.ysr.aQ(new defpackage.ryo(context, 5));
    }
}
