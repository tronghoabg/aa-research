package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vgj extends defpackage.ijv implements defpackage.vgl {
    public vgj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCircleClickListener");
    }

    @Override // defpackage.vgl
    public final void e(com.google.android.libraries.maps.model.internal.ICircleDelegate iCircleDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iCircleDelegate);
        fr(1, parcelFp);
    }
}
