package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class owx extends defpackage.ijv implements defpackage.owz {
    public owx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.IToastController");
    }

    @Override // defpackage.owz
    public final void e(java.lang.CharSequence charSequence, int i) throws android.os.RemoteException {
        throw null;
    }

    @Override // defpackage.owz
    public final void f(java.lang.CharSequence charSequence, int i, android.content.ComponentName componentName) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.e(parcelFp, charSequence);
        parcelFp.writeInt(i);
        defpackage.ijx.g(parcelFp, componentName);
        fr(2, parcelFp);
    }
}
