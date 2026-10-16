package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qym extends defpackage.ijv implements defpackage.qyo {
    public qym(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarPhoneStatusEventListener");
    }

    @Override // defpackage.qyo
    public final void e(android.view.KeyEvent keyEvent) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, keyEvent);
        fs(3, parcelFp);
    }

    @Override // defpackage.qyo
    public final void f(java.lang.String str, java.lang.String str2, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        parcelFp.writeString(str);
        parcelFp.writeString(str2);
        parcelFp.writeInt(i);
        fs(2, parcelFp);
    }
}
