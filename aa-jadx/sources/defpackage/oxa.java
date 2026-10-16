package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oxa extends defpackage.ijw implements defpackage.oxb {
    public oxa() {
        super("com.google.android.apps.auto.sdk.IVoiceSearchController");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
        defpackage.ijx.d(parcel);
        a(bundle);
        parcel2.writeNoException();
        return true;
    }
}
