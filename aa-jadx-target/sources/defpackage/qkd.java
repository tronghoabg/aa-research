package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qkd extends defpackage.ijw implements defpackage.qke {
    public qkd() {
        super("com.google.android.gearhead.sdk.assistant.IVoicePlate");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            a(i2);
        } else if (i == 2) {
            int i3 = parcel.readInt();
            defpackage.ijx.d(parcel);
            c(i3);
        } else if (i == 3) {
            parcel.readString();
            parcel.readString();
            defpackage.ijx.d(parcel);
            d();
        } else {
            if (i != 4) {
                return false;
            }
            int i4 = parcel.readInt();
            parcel.readString();
            defpackage.ijx.d(parcel);
            f(i4);
        }
        return true;
    }
}
