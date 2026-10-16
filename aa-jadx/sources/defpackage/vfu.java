package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfu extends defpackage.ijv implements defpackage.vfw {
    public vfu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraChangeListener");
    }

    @Override // defpackage.vfw
    public final void a(com.google.android.libraries.maps.model.CameraPosition cameraPosition) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, cameraPosition);
        fr(1, parcelFp);
    }
}
