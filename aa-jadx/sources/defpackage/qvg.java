package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvg extends defpackage.ijv implements defpackage.qvi {
    public qvg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAudioRecord");
    }

    @Override // defpackage.qvi
    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qvi
    public final android.os.ParcelFileDescriptor f(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(2048);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcelFq, android.os.ParcelFileDescriptor.CREATOR);
        parcelFq.recycle();
        return parcelFileDescriptor;
    }

    @Override // defpackage.qvi
    public final void g() throws android.os.RemoteException {
        fr(3, fp());
    }
}
