package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class spg extends defpackage.ijw implements android.os.IInterface {
    private defpackage.sok a;
    private final int b;

    public spg(defpackage.sok sokVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = sokVar;
        this.b = i;
    }

    public final void a(int i, android.os.IBinder iBinder, android.os.Bundle bundle) {
        defpackage.sok sokVar = this.a;
        if (sokVar == null) {
            throw new java.lang.NullPointerException("onPostInitComplete can be called only once per call to getRemoteService");
        }
        sokVar.z(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
            defpackage.ijx.d(parcel);
            a(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            defpackage.ijx.d(parcel);
            android.util.Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new java.lang.Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            com.google.android.gms.common.internal.ConnectionInfo connectionInfo = (com.google.android.gms.common.internal.ConnectionInfo) defpackage.ijx.a(parcel, com.google.android.gms.common.internal.ConnectionInfo.CREATOR);
            defpackage.ijx.d(parcel);
            defpackage.sok sokVar = this.a;
            if (sokVar == null) {
                throw new java.lang.NullPointerException("onPostInitCompleteWithConnectionInfo can be called only once per call to getRemoteService");
            }
            if (connectionInfo == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            sokVar.n = connectionInfo;
            if (sokVar.f()) {
                com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                defpackage.spn.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            a(i3, strongBinder2, connectionInfo.a);
        }
        parcel2.writeNoException();
        return true;
    }
}
