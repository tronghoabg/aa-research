package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class quo extends defpackage.ijv implements defpackage.quq {
    public quo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAppDecorService");
    }

    @Override // defpackage.quq
    public final android.os.Bundle e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(7, fp());
        android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcelFq, android.os.Bundle.CREATOR);
        parcelFq.recycle();
        return bundle;
    }

    @Override // defpackage.quq
    public final android.os.Bundle f() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(6, fp());
        android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcelFq, android.os.Bundle.CREATOR);
        parcelFq.recycle();
        return bundle;
    }

    @Override // defpackage.quq
    public final defpackage.rax g(int i, int i2) throws android.os.RemoteException {
        defpackage.rax ravVar;
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeInt(i2);
        android.os.Parcel parcelFq = fq(11, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            ravVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ISystemUiService");
            ravVar = iInterfaceQueryLocalInterface instanceof defpackage.rax ? (defpackage.rax) iInterfaceQueryLocalInterface : new defpackage.rav(strongBinder);
        }
        parcelFq.recycle();
        return ravVar;
    }

    @Override // defpackage.quq
    public final void h(defpackage.rai raiVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, raiVar);
        fr(3, parcelFp);
    }

    @Override // defpackage.quq
    public final void i(boolean z, boolean z2) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        java.lang.ClassLoader classLoader = defpackage.ijx.a;
        parcelFp.writeInt(z ? 1 : 0);
        parcelFp.writeInt(z2 ? 1 : 0);
        fr(9, parcelFp);
    }

    @Override // defpackage.quq
    public final void j(defpackage.rai raiVar) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.i(parcelFp, raiVar);
        fr(4, parcelFp);
    }
}
