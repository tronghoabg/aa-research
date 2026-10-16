package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rxk extends defpackage.ijw implements defpackage.rxl {
    public rxk() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            defpackage.ijx.d(parcel);
            a(i2, bArrCreateByteArray);
        } else if (i == 2) {
            b();
        } else {
            if (i != 3) {
                return false;
            }
            c();
        }
        parcel2.writeNoException();
        return true;
    }
}
