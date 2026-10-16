package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vex extends defpackage.ijw implements defpackage.vey {
    public vex() {
        super("com.google.android.libraries.maps.internal.ICancelableCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            b();
        } else {
            if (i != 2) {
                return false;
            }
            a();
        }
        parcel2.writeNoException();
        return true;
    }
}
