package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qxb extends defpackage.ijw implements defpackage.qxc {
    public qxb() {
        super("com.google.android.gms.car.ICarConnectionListener");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            b(i2);
        } else if (i == 2) {
            c();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            defpackage.ijx.d(parcel);
            a(i3);
        }
        return true;
    }
}
