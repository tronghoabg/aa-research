package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rah extends defpackage.ijw implements defpackage.rai {
    public rah() {
        super("com.google.android.gms.car.IDrivingStatusCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            a(i2);
        } else if (i == 2) {
            parcel.readString();
            defpackage.ijx.d(parcel);
        } else if (i == 3) {
            boolean zJ = defpackage.ijx.j(parcel);
            defpackage.ijx.d(parcel);
            c(zJ);
        } else {
            if (i != 4) {
                return false;
            }
            defpackage.ijx.j(parcel);
            defpackage.ijx.d(parcel);
        }
        return true;
    }
}
