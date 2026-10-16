package com.google.android.gearhead.service;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class SharedService extends android.app.Service {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SharedService");
    public defpackage.qkk b;
    public final java.util.Set c = new java.util.concurrent.ConcurrentSkipListSet();
    public java.lang.String d = "UNINITIALIZED_BLUETOOTH_ADDRESS";
    public java.lang.String e = "UNINITIALIZED_BLUETOOTH_ADDRESS";
    defpackage.mkg f;

    @Override // android.app.Service
    protected final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        if (defpackage.acrc.c()) {
            printWriter.println("Dumping BuildConfig flags for the SHARED process");
            defpackage.ebo.t(printWriter);
        }
        defpackage.mbt.c(printWriter, new defpackage.oyx(this, 13));
        defpackage.tfv.c(printWriter);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f = new defpackage.mkg(this);
        this.b = new defpackage.qkk(this);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            defpackage.yqm yqmVar = defpackage.kit.a;
            ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).eQ();
        }
        defpackage.yqm yqmVar2 = defpackage.tgi.a;
        defpackage.vlw.a().h();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 7432)).u("Shared Service created");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        com.google.android.apps.auto.components.firstdrive.FirstDriveNotificationManager.a().d();
        defpackage.kzi.n().d();
        defpackage.jzl.m().d();
        defpackage.lcv.a().d();
        defpackage.jzb.r().d();
        if (android.os.Build.VERSION.SDK_INT < 30) {
            defpackage.kit.b().d();
        }
        defpackage.omf.t().b();
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 7433)).u("Shared Service destroyed");
    }
}
