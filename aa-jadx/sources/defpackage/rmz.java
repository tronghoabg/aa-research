package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rmz extends defpackage.ijv implements defpackage.rnb {
    public rmz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarProjectionInputService");
    }

    @Override // defpackage.rnb
    public final void e() throws android.os.RemoteException {
        fs(2, fp());
    }

    @Override // defpackage.rnb
    public final void f(defpackage.rne rneVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rneVar);
        fs(3, parcelFp);
    }

    @Override // defpackage.rnb
    public final void g(defpackage.rnh rnhVar, android.view.inputmethod.EditorInfo editorInfo, com.google.android.gms.car.display.CarRegionId carRegionId) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, rnhVar);
        defpackage.ijx.g(parcelFp, editorInfo);
        parcelFp.writeInt(0);
        defpackage.ijx.g(parcelFp, carRegionId);
        fs(4, parcelFp);
    }
}
