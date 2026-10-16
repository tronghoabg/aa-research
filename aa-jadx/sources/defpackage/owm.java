package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owm extends defpackage.ijw implements defpackage.own {
    public owm() {
        super("com.google.android.apps.auto.sdk.IImeController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.owk owiVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            owiVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.auto.sdk.IImeCallback");
            owiVar = iInterfaceQueryLocalInterface instanceof defpackage.owk ? (defpackage.owk) iInterfaceQueryLocalInterface : new defpackage.owi(strongBinder);
        }
        defpackage.ijx.d(parcel);
        e(owiVar);
        parcel2.writeNoException();
        return true;
    }
}
