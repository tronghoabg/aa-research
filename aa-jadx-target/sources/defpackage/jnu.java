package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jnu implements java.lang.Runnable {
    final /* synthetic */ android.os.IBinder a;
    final /* synthetic */ defpackage.zif b;

    public jnu(android.os.IBinder iBinder, defpackage.zif zifVar) {
        this.a = iBinder;
        this.b = zifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.yqm yqmVar = defpackage.jnx.a;
        android.os.IBinder iBinder = this.a;
        defpackage.zif zifVar = this.b;
        try {
            if (iBinder == null) {
                defpackage.jnx.a(zifVar, "CarChimeraService in Gearhead returned null binder.");
                return;
            }
            rxa rxaVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.servicebroker.ICarServiceBroker");
            defpackage.rxc rxaVar = rxaVarQueryLocalInterface instanceof defpackage.rxc ? (defpackage.rxc) rxaVarQueryLocalInterface : new rxa(iBinder);
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("client_name", "car-1-0");
                defpackage.qvl qvlVarA = rxaVar.a(bundle);
                if (qvlVarA == null) {
                    defpackage.jnx.a(zifVar, "CarChimeraService in Gearhead returned null iCar.");
                } else {
                    ((defpackage.yqj) defpackage.jnx.a.l().ai(2415)).u("Successfully connected to CarChimeraService in Gearhead");
                    zifVar.o(qvlVarA);
                }
            } catch (android.os.RemoteException e) {
                defpackage.jnx.b(zifVar, "Failed to fetch ICar from CarServiceBroker", e);
            }
        } catch (java.lang.Exception e2) {
            defpackage.jnx.b(zifVar, "onServiceConnected failure", e2);
        } finally {
            if (!zifVar.isDone()) {
                defpackage.jnx.a(zifVar, "Failed to successfully complete connection future.");
            }
        }
    }
}
