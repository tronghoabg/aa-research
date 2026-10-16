package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mif extends defpackage.ijv implements defpackage.mih {
    public mif(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.projectionstate.IProjectionStateService");
    }

    @Override // defpackage.mih
    public final void e(defpackage.mie mieVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, mieVar);
        fs(2, parcelFp);
    }
}
