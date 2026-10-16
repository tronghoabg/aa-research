package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvd extends defpackage.ijv implements defpackage.qvf {
    public qvd(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.IAudioPolicyFocusListener");
    }

    @Override // defpackage.qvf
    public final void e(com.google.android.gms.car.AudioFocusInfo audioFocusInfo) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, audioFocusInfo);
        fs(4, parcelFp);
    }

    @Override // defpackage.qvf
    public final void f(com.google.android.gms.car.AudioFocusInfo audioFocusInfo, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, audioFocusInfo);
        parcelFp.writeInt(i);
        fs(1, parcelFp);
    }

    @Override // defpackage.qvf
    public final void g(com.google.android.gms.car.AudioFocusInfo audioFocusInfo, boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, audioFocusInfo);
        parcelFp.writeInt(z ? 1 : 0);
        fs(2, parcelFp);
    }

    @Override // defpackage.qvf
    public final void h(com.google.android.gms.car.AudioFocusInfo audioFocusInfo, int i) throws android.os.RemoteException {
        android.os.Parcel parcelFp = fp();
        defpackage.ijx.g(parcelFp, audioFocusInfo);
        parcelFp.writeInt(i);
        fs(3, parcelFp);
    }
}
