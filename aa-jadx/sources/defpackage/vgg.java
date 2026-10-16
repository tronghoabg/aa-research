package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vgg extends defpackage.ijv implements defpackage.vgi {
    public vgg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // defpackage.vgi
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(1, parcelFp);
    }
}
