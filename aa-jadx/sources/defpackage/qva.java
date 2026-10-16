package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qva extends defpackage.ijv implements defpackage.qvc {
    public qva(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAudioPolicy");
    }

    @Override // defpackage.qvc
    public final int e() throws android.os.RemoteException {
        android.os.Parcel parcelFq = fq(3, fp());
        int i = parcelFq.readInt();
        parcelFq.recycle();
        return i;
    }

    @Override // defpackage.qvc
    public final defpackage.qvi f(int i) throws android.os.RemoteException {
        defpackage.qvi qvgVar;
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        android.os.Parcel parcelFq = fq(1, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qvgVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioRecord");
            qvgVar = iInterfaceQueryLocalInterface instanceof defpackage.qvi ? (defpackage.qvi) iInterfaceQueryLocalInterface : new defpackage.qvg(strongBinder);
        }
        parcelFq.recycle();
        return qvgVar;
    }

    @Override // defpackage.qvc
    public final defpackage.qvi g(int i, int[] iArr) throws android.os.RemoteException {
        defpackage.qvi qvgVar;
        android.os.Parcel parcelFp = fp();
        parcelFp.writeInt(i);
        parcelFp.writeIntArray(iArr);
        android.os.Parcel parcelFq = fq(2, parcelFp);
        android.os.IBinder strongBinder = parcelFq.readStrongBinder();
        if (strongBinder == null) {
            qvgVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.IAudioRecord");
            qvgVar = iInterfaceQueryLocalInterface instanceof defpackage.qvi ? (defpackage.qvi) iInterfaceQueryLocalInterface : new defpackage.qvg(strongBinder);
        }
        parcelFq.recycle();
        return qvgVar;
    }

    @Override // defpackage.qvc
    public final void h() throws android.os.RemoteException {
        fr(4, fp());
    }
}
