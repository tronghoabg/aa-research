package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ovy extends defpackage.ijw implements defpackage.ovz {
    public ovy() {
        super("com.google.android.apps.auto.sdk.ICarRegionController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            e();
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            boolean zF = f();
            parcel2.writeNoException();
            java.lang.ClassLoader classLoader = defpackage.ijx.a;
            parcel2.writeInt(zF ? 1 : 0);
        }
        return true;
    }
}
