package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrg extends defpackage.ijv implements defpackage.xri {
    public xrg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.projection.sdk.demand.IDemandSpace");
    }

    @Override // defpackage.xri
    public final void e(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, bundle);
        fr(5, parcelFp);
    }

    @Override // defpackage.xri
    public final void f(defpackage.xrf xrfVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, xrfVar);
        fr(1, parcelFp);
    }

    @Override // defpackage.xri
    public final void g(defpackage.xrf xrfVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, xrfVar);
        fr(2, parcelFp);
    }
}
