package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rjy extends defpackage.ijv implements defpackage.rka {
    public rjy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.diagnostics.IDataCollectedCallback");
    }

    @Override // defpackage.rka
    public final void e(android.os.ParcelFileDescriptor parcelFileDescriptor) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, parcelFileDescriptor);
        fs(1, parcelFp);
    }
}
