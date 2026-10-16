package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfo extends defpackage.ijv implements defpackage.vfq {
    public vfo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IMapsAppCheckTokenCallback");
    }

    @Override // defpackage.vfq
    public final void e() throws android.os.RemoteException {
        fs(3, fp());
    }

    @Override // defpackage.vfq
    public final void f(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        fs(2, parcelFp);
    }
}
