package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qjw extends defpackage.ijw implements defpackage.qjx {
    public qjw() {
        super("com.google.android.gearhead.sdk.assistant.IActionPlate");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            defpackage.ijx.d(parcel);
            b();
        } else if (i == 2) {
            defpackage.ijx.d(parcel);
            c();
        } else {
            if (i != 3) {
                return false;
            }
            parcel.readString();
            defpackage.ijx.d(parcel);
            a();
        }
        return true;
    }
}
