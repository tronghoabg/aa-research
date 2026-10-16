package com.google.android.projection.gearhead.service;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GearheadService extends android.app.Service {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.GearheadService");
    boolean a = false;

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    protected final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        if (defpackage.acrc.c()) {
            printWriter.println("Dumping BuildConfig flags for the PROJECTION process");
            defpackage.ebo.t(printWriter);
        }
        defpackage.mbt.c(printWriter, new uyq(this, 3));
        printWriter.println("Dumping logs for the PROJECTION process");
        defpackage.tfv.c(printWriter);
        printWriter.println("============");
        defpackage.mni.a().h(printWriter);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        ((defpackage.yqj) b.l().ai((char) 10211)).u("onBind");
        return new android.os.Binder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 10212)).u("onCreate");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            int i = com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity.a;
            android.content.Intent flags = new android.content.Intent(defpackage.mkp.a.c, (java.lang.Class<?>) com.google.android.projection.gearhead.companion.settings.DefaultSettingsActivity.class).setFlags(335544320);
            android.content.ClipData clipData = wer.a;
            android.app.PendingIntent pendingIntentB = wer.b(this, 2131429146, flags, 201326592);
            defpackage.maz.c();
            defpackage.dte dteVar = new defpackage.dte(this, "gearhead_connection_status");
            dteVar.e(2, true);
            dteVar.l();
            dteVar.u = 1;
            dteVar.n(2131231572);
            dteVar.r = "service";
            dteVar.i = 1;
            dteVar.h(getString(2132085375));
            dteVar.t = getColor(2131100590);
            dteVar.g = pendingIntentB;
            startForeground(2131428229, dteVar.a());
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10214)).u("started foreground service");
            this.a = true;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        defpackage.yqm yqmVar = b;
        ((defpackage.yqj) yqmVar.l().ai((char) 10213)).u("onDestroy");
        if (this.a) {
            this.a = false;
            stopForeground(true);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10215)).u("stopped foreground service");
        }
    }
}
