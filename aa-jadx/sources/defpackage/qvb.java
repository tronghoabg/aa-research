package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qvb extends defpackage.ijw implements defpackage.qvc {
    public qvb() {
        super("com.google.android.gms.car.IAudioPolicy");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            defpackage.qvi qviVarF = f(i2);
            parcel2.writeNoException();
            defpackage.ijx.i(parcel2, qviVarF);
        } else if (i == 2) {
            int i3 = parcel.readInt();
            int[] iArrCreateIntArray = parcel.createIntArray();
            defpackage.ijx.d(parcel);
            defpackage.qvi qviVarG = g(i3, iArrCreateIntArray);
            parcel2.writeNoException();
            defpackage.ijx.i(parcel2, qviVarG);
        } else if (i == 3) {
            int iE = e();
            parcel2.writeNoException();
            parcel2.writeInt(iE);
        } else {
            if (i != 4) {
                return false;
            }
            h();
            parcel2.writeNoException();
        }
        return true;
    }
}
