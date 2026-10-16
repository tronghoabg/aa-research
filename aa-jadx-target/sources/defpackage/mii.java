package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class mii implements android.content.ServiceConnection {
    final /* synthetic */ defpackage.mij a;

    public mii(defpackage.mij mijVar) {
        this.a = mijVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.mih mifVar;
        if (iBinder == null) {
            mifVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.auto.components.projectionstate.IProjectionStateService");
            mifVar = iInterfaceQueryLocalInterface instanceof defpackage.mih ? (defpackage.mih) iInterfaceQueryLocalInterface : new defpackage.mif(iBinder);
        }
        defpackage.mij mijVar = this.a;
        mijVar.d = mifVar;
        defpackage.mih mihVar = mijVar.d;
        if (mihVar == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mij.a.g()).ai((char) 4976)).u("Bound to car connection checker service but received null binder");
            return;
        }
        try {
            mihVar.e(mijVar.b);
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mij.a.h()).p(e)).ai((char) 4975)).u("ProjectionStateService is dead during onServiceConnected");
        }
        this.a.c.sendBroadcast(new android.content.Intent("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED").addFlags(268435456));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.a.c.sendBroadcast(new android.content.Intent("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED").addFlags(268435456));
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
    }
}
