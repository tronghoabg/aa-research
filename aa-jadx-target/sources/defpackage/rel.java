package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rel implements android.content.ServiceConnection {
    public defpackage.doe a;
    final /* synthetic */ defpackage.rem b;

    public rel(defpackage.rem remVar) {
        this.b = remVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.rem remVar = this.b;
        defpackage.doe doeVar = this.a;
        if (iBinder == null) {
            remVar.g(new rdc("Gearhead Car Startup Service returned null binding."), doeVar);
        } else {
            java.util.concurrent.Executors.newSingleThreadExecutor().execute(new defpackage.imx((java.lang.Object) remVar, (java.lang.Object) iBinder, (java.lang.Object) doeVar, 6, (byte[]) null));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        defpackage.rem remVar = this.b;
        defpackage.sqf.a().c(remVar.a, this);
        defpackage.rde rdeVar = new defpackage.rde("Gearhead Car Startup Service unexpectedly disconnected.");
        remVar.f(rdeVar, this.a);
        if (defpackage.rrx.e("GH.GhCarClientCtor", 4)) {
            defpackage.rrx.d(4, "GH.GhCarClientCtor", rdeVar, "onConnectionLost: %s", new defpackage.zkf(defpackage.zke.a, rdeVar.getMessage()));
        }
        defpackage.rem.e(remVar.c, new defpackage.qth(remVar, 9));
    }
}
