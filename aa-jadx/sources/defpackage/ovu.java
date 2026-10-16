package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ovu extends defpackage.ijv implements defpackage.ovw {
    public ovu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.ICapabilityController");
    }

    @Override // defpackage.ovw
    public final java.util.List e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        java.util.ArrayList<java.lang.String> arrayListCreateStringArrayList = parcelFq.createStringArrayList();
        parcelFq.recycle();
        return arrayListCreateStringArrayList;
    }
}
