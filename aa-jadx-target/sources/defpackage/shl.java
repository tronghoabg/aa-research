package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class shl implements defpackage.shj {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.AUTH");
    public final defpackage.xzi b = defpackage.ysr.aQ(new defpackage.riu(8));

    @Override // defpackage.shj
    public final void a(android.content.Intent intent) {
        intent.putExtra("service_handshake", new com.google.android.gms.carsetup.BinderParcel(new defpackage.shk()));
    }

    @Override // defpackage.shj
    public final boolean b(android.content.Context context, android.content.Intent intent) {
        defpackage.scy scwVar;
        com.google.android.gms.carsetup.BinderParcel binderParcel = (com.google.android.gms.carsetup.BinderParcel) intent.getParcelableExtra("service_handshake");
        if (binderParcel != null) {
            android.os.IBinder iBinder = binderParcel.a;
            if (iBinder == null) {
                scwVar = null;
            } else {
                scw scwVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IServiceHandshake");
                scwVar = scwVarQueryLocalInterface instanceof defpackage.scy ? (defpackage.scy) scwVarQueryLocalInterface : new scw(iBinder);
            }
            if (scwVar != null) {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                try {
                    scwVar.a(new defpackage.sda(this, context, atomicBoolean));
                    return atomicBoolean.get();
                } catch (android.os.RemoteException e) {
                    a.g().p(e).ai(8946).u("Not completing service handshake due to error.");
                }
            }
        }
        return false;
    }
}
