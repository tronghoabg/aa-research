package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ovv extends defpackage.ijw implements defpackage.ovw {
    public ovv() {
        super("com.google.android.apps.auto.sdk.ICapabilityController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.util.List<java.lang.String> listE = e();
        parcel2.writeNoException();
        parcel2.writeStringList(listE);
        return true;
    }
}
