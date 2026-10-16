package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class soi extends defpackage.soc {
    public final android.os.IBinder g;
    final /* synthetic */ defpackage.sok h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soi(defpackage.sok sokVar, int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        super(sokVar, i, bundle);
        this.h = sokVar;
        this.g = iBinder;
    }

    @Override // defpackage.soc
    protected final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.wyz wyzVar = this.h.s;
        if (wyzVar != null) {
            wyzVar.b(connectionResult);
        }
        java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, smx] */
    @Override // defpackage.soc
    protected final boolean b() {
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo;
        try {
            android.os.IBinder iBinder = this.g;
            if (iBinder == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            defpackage.sok sokVar = this.h;
            if (!sokVar.c().equals(interfaceDescriptor)) {
                android.util.Log.w("GmsClient", "service descriptor mismatch: " + sokVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            android.os.IInterface iInterfaceB = sokVar.b(iBinder);
            if (iInterfaceB == null || !(sokVar.F(2, 4, iInterfaceB) || sokVar.F(3, 4, iInterfaceB))) {
                return false;
            }
            android.os.Bundle bundle = null;
            sokVar.l = null;
            com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig = (!sokVar.C() || (connectionInfo = sokVar.n) == null) ? null : connectionInfo.e;
            if (connectionThrottlingConfig != null) {
                bundle = new android.os.Bundle();
                bundle.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", defpackage.sqs.o(connectionThrottlingConfig));
            }
            defpackage.wyz wyzVar = sokVar.t;
            if (wyzVar == null) {
                return true;
            }
            wyzVar.a.a(bundle);
            return true;
        } catch (android.os.RemoteException unused) {
            android.util.Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
