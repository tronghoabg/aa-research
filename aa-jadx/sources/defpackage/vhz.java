package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vhz extends defpackage.ijv implements defpackage.vib {
    public vhz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // defpackage.vib
    public final boolean e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
