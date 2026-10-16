package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sdj extends defpackage.ijw implements defpackage.sdk {
    public sdj() {
        super("com.google.android.gms.carsetup.IZeroPartyCheckerCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
