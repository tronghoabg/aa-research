package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qzz extends defpackage.ijv implements defpackage.rab {
    public qzz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarWindowManager");
    }

    @Override // defpackage.rab
    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(10, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.rab
    public final android.graphics.Point f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(9, fp());
        android.graphics.Point point = (android.graphics.Point) defpackage.ijx.a(parcelFq, android.graphics.Point.CREATOR);
        parcelFq.recycle();
        return point;
    }

    @Override // defpackage.rab
    public final defpackage.qzv g(com.google.android.gms.car.CarWindowSpec carWindowSpec, defpackage.qzy qzyVar) throws android.os.RemoteException {
        defpackage.qzv qztVar;
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carWindowSpec);
        defpackage.ijx.i(parcelFp, qzyVar);
        android.os.Parcel parcelFq = fq(11, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qztVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarWindow");
            qztVar = iInterfaceQueryLocalInterface instanceof defpackage.qzv ? (defpackage.qzv) iInterfaceQueryLocalInterface : new defpackage.qzt(strongBinder);
        }
        parcelFq.recycle();
        return qztVar;
    }

    @Override // defpackage.rab
    public final void h(defpackage.qzs qzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzsVar);
        fr(2, parcelFp);
    }

    @Override // defpackage.rab
    public final void i(com.google.android.gms.car.display.CarRegionId carRegionId, android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, carRegionId);
        defpackage.ijx.g(parcelFp, keyEvent);
        fr(15, parcelFp);
    }

    @Override // defpackage.rab
    public final void j(defpackage.qxk qxkVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxkVar);
        fr(16, parcelFp);
    }

    @Override // defpackage.rab
    public final void k(defpackage.qzs qzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qzsVar);
        fr(3, parcelFp);
    }

    @Override // defpackage.rab
    public final void l() throws android.os.RemoteException {
        fr(7, fp());
    }

    @Override // defpackage.rab
    public final void m(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        fr(14, parcelFp);
    }

    @Override // defpackage.rab
    public final void n(int i, int i2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(0);
        parcelFp.writeInt(i2);
        fr(18, parcelFp);
    }

    @Override // defpackage.rab
    public final void o(defpackage.qxk qxkVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, qxkVar);
        fr(17, parcelFp);
    }

    @Override // defpackage.rab
    public final boolean p() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(1, fp());
        boolean zJ = defpackage.ijx.j(parcelFq);
        parcelFq.recycle();
        return zJ;
    }
}
