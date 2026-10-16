package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vhl extends defpackage.ijw implements defpackage.vhm {
    public vhl() {
        super("com.google.android.libraries.maps.internal.IOnMapLoadedCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }
}
