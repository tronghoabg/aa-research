package com.google.android.apps.auto.carservice.gmscorecompat;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class CarChimeraService extends defpackage.qsg {
    private android.content.BroadcastReceiver c;

    @Override // defpackage.qsg
    protected final defpackage.ryi a() {
        return new defpackage.jnf(1);
    }

    @Override // defpackage.qsg
    protected final defpackage.xyn b() {
        return new defpackage.xys(new defpackage.jne(1));
    }

    @Override // defpackage.qsg
    protected final void c(android.content.Context context, defpackage.dte dteVar) {
        if (defpackage.kgl.i()) {
            dteVar.f(0, context.getText(2132083121), wer.c(context, 0, com.google.android.apps.auto.components.bugreport.BugreporterReceiver.c("ORIGIN_NOTIFICATION", (java.lang.String) null), 201326592));
            dteVar.f(0, context.getText(2132083127), wer.c(context, 0, com.google.android.apps.auto.components.bugreport.BugreporterReceiver.d(), 201326592));
        }
    }

    @Override // defpackage.qsg
    protected final boolean d() {
        if (android.os.Binder.getCallingPid() == android.os.Process.myPid() && android.os.Binder.getCallingUid() == android.os.Process.myUid()) {
            return true;
        }
        return super.d();
    }

    @Override // defpackage.qsg, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (defpackage.acwj.a.fF().x()) {
            this.c = new defpackage.jnd(this);
            defpackage.duw.e(this.b, this.c, new android.content.IntentFilter("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION"), null, 2);
        }
    }

    @Override // defpackage.qsg, android.app.Service
    public final void onDestroy() {
        android.content.BroadcastReceiver broadcastReceiver = this.c;
        if (broadcastReceiver != null) {
            this.b.unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }
}
