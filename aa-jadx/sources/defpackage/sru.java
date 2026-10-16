package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sru extends defpackage.ijv implements android.os.IInterface {
    public sru(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(6, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }
}
