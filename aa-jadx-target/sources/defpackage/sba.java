package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sba implements android.content.ServiceConnection {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public sba(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.scm scmVar = null;
        defpackage.mkh mkfVar = null;
        if (this.b == 0) {
            if (defpackage.omv.c("CAR.DATA.SERVICE", 3)) {
                android.util.Log.d("CAR.DATA.SERVICE", "connected");
            }
            java.lang.Object obj = this.a;
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ICarData");
                scmVar = iInterfaceQueryLocalInterface instanceof defpackage.scm ? (defpackage.scm) iInterfaceQueryLocalInterface : new defpackage.scm(iBinder);
            }
            defpackage.sbb sbbVar = (defpackage.sbb) obj;
            sbbVar.b = scmVar;
            sbbVar.a.release();
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) defpackage.qkp.a.f()).ai(7441)).M("onServiceConnected(ComponentName:%s, service:%s)", componentName, iBinder);
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.auto.components.service.ICarModeSharedService");
            mkfVar = iInterfaceQueryLocalInterface2 instanceof defpackage.mkh ? (defpackage.mkh) iInterfaceQueryLocalInterface2 : new defpackage.mkf(iBinder);
        }
        defpackage.qkp qkpVar = (defpackage.qkp) this.a;
        qkpVar.d = mkfVar;
        defpackage.mkh mkhVar = qkpVar.d;
        if (mkhVar != null) {
            qkpVar.c.a(mkhVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (this.b == 0) {
            if (defpackage.omv.c("CAR.DATA.SERVICE", 3)) {
                android.util.Log.d("CAR.DATA.SERVICE", "CarDataService disconnected");
            }
            ((defpackage.sbb) this.a).b = null;
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qkp.a.f()).ai((char) 7442)).y("onServiceDisconnected(ComponentName:%s)", componentName);
            defpackage.qkp qkpVar = (defpackage.qkp) this.a;
            if (qkpVar.d != null) {
                qkpVar.c.b();
            }
        }
    }
}
