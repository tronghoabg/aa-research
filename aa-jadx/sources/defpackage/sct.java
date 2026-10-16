package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sct extends defpackage.ijv implements defpackage.scv {
    public sct(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ILocalBinderTransport");
    }

    @Override // defpackage.scv
    public final android.os.IBinder e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        parcelFq.recycle();
        return strongBinder;
    }
}
