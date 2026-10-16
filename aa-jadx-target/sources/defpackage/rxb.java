package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rxb extends defpackage.ijw implements defpackage.rxc {
    public rxb() {
        super("com.google.android.gms.car.servicebroker.ICarServiceBroker");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
        defpackage.ijx.d(parcel);
        defpackage.qvl qvlVarA = a(bundle);
        parcel2.writeNoException();
        defpackage.ijx.i(parcel2, qvlVarA);
        return true;
    }
}
