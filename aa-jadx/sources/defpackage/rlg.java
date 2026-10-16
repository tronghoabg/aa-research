package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rlg extends defpackage.ijv implements defpackage.rli {
    public rlg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayThemingManager");
    }

    @Override // defpackage.rli
    public final int a() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(3, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.rli
    public final void b(boolean z) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.rli
    public final void c(com.google.android.gms.car.display.UiStyle uiStyle) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, uiStyle);
        fr(2, parcelFp);
    }
}
