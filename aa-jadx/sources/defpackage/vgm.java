package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vgm extends defpackage.ijv implements defpackage.vgo {
    public vgm(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // defpackage.vgo
    public final void e(com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate iGroundOverlayDelegate) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, iGroundOverlayDelegate);
        fr(1, parcelFp);
    }
}
