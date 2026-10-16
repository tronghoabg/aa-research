package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rxq extends defpackage.ijw implements defpackage.rxr {
    public rxq() {
        super("com.google.android.gms.car.startup.IStartupServiceCallback");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                boolean zJ = defpackage.ijx.j(parcel);
                defpackage.ijx.d(parcel);
                c(zJ);
                break;
            case 2:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                java.lang.String string = parcel.readString();
                defpackage.ijx.d(parcel);
                g(i2, i3, string);
                break;
            case 3:
                j();
                break;
            case 4:
                break;
            case 5:
                java.util.ArrayList arrayListC = defpackage.ijx.c(parcel);
                parcel.readInt();
                parcel.readInt();
                byte[] bArrCreateByteArray = parcel.createByteArray();
                defpackage.ijx.d(parcel);
                k(arrayListC, bArrCreateByteArray);
                break;
            case 6:
                boolean zJ2 = defpackage.ijx.j(parcel);
                java.util.ArrayList arrayListC2 = defpackage.ijx.c(parcel);
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                defpackage.ijx.d(parcel);
                h(zJ2, arrayListC2, i4, i5, bArrCreateByteArray2);
                break;
            case 7:
                java.util.ArrayList arrayListC3 = defpackage.ijx.c(parcel);
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                defpackage.ijx.d(parcel);
                i(arrayListC3, bArrCreateByteArray3, bundle);
                break;
            case 8:
                f();
                break;
            case 9:
                int i6 = parcel.readInt();
                defpackage.ijx.d(parcel);
                b(i6);
                break;
            case 10:
                int i7 = parcel.readInt();
                defpackage.ijx.d(parcel);
                d(i7);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
