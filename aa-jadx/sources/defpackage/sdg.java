package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sdg extends defpackage.ijw implements defpackage.sdh {
    public sdg() {
        super("com.google.android.gms.carsetup.IZeroPartyChecker");
    }

    @Override // defpackage.sdh
    public final void e(defpackage.sdk sdkVar) {
        try {
            sdkVar.e();
        } catch (android.os.RemoteException unused) {
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.sdk sdiVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            sdiVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
            sdiVar = iInterfaceQueryLocalInterface instanceof defpackage.sdk ? (defpackage.sdk) iInterfaceQueryLocalInterface : new defpackage.sdi(strongBinder);
        }
        defpackage.ijx.d(parcel);
        e(sdiVar);
        return true;
    }
}
