package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class raj extends defpackage.ijv implements defpackage.ral {
    public raj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IFdBinder");
    }

    @Override // defpackage.ral
    public final android.os.ParcelFileDescriptor e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcelFq, android.os.ParcelFileDescriptor.CREATOR);
        parcelFq.recycle();
        return parcelFileDescriptor;
    }
}
