package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rkj extends defpackage.ijv implements defpackage.rkl {
    public rkj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
    }

    @Override // defpackage.rkl
    public final void e(int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        fr(2, parcelFp);
    }

    @Override // defpackage.rkl
    public final void f() throws android.os.RemoteException {
        fr(3, fp());
    }
}
