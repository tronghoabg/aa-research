package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xrd extends defpackage.ijv implements defpackage.xrf {
    public xrd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.projection.sdk.demand.ICallbacks");
    }

    @Override // defpackage.xrf
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fs(3, parcelFp);
    }
}
