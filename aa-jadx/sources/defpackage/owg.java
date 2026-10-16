package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owg extends defpackage.ijw implements defpackage.owh {
    public owg() {
        super("com.google.android.apps.auto.sdk.IFacetBarController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zJ = defpackage.ijx.j(parcel);
        defpackage.ijx.d(parcel);
        a(zJ);
        parcel2.writeNoException();
        return true;
    }
}
