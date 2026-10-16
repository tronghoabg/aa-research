package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class rxn extends defpackage.ijw implements defpackage.rxo {
    public rxn() {
        super("com.google.android.gms.car.startup.IStartup");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            long j = parcel.readLong();
            defpackage.ijx.d(parcel);
            r(j);
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i == 8) {
            long j2 = parcel.readLong();
            defpackage.ijx.d(parcel);
            m(j2);
            parcel2.writeNoException();
        } else if (i != 13) {
            rxp rxpVar = null;
            if (i == 4) {
                long j3 = parcel.readLong();
                android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    rxp rxpVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.startup.IStartupServiceCallback");
                    rxpVar = rxpVarQueryLocalInterface instanceof defpackage.rxr ? (defpackage.rxr) rxpVarQueryLocalInterface : new rxp(strongBinder);
                }
                defpackage.ijx.d(parcel);
                g(j3, parcelFileDescriptor, rxpVar);
                parcel2.writeNoException();
            } else if (i == 5) {
                long j4 = parcel.readLong();
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    rxp rxpVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.startup.IStartupServiceCallback");
                    rxpVar = rxpVarQueryLocalInterface2 instanceof defpackage.rxr ? (defpackage.rxr) rxpVarQueryLocalInterface2 : new rxp(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                h(j4, rxpVar);
                parcel2.writeNoException();
            } else if (i != 6) {
                switch (i) {
                    case 15:
                        f();
                        parcel2.writeNoException();
                        break;
                    case 16:
                        android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                        if (strongBinder3 != null) {
                            rxp rxpVarQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                            rxpVar = rxpVarQueryLocalInterface3 instanceof defpackage.rxl ? (defpackage.rxl) rxpVarQueryLocalInterface3 : new rxj(strongBinder3);
                        }
                        defpackage.ijx.d(parcel);
                        defpackage.rxi rxiVarC = c(rxpVar);
                        parcel2.writeNoException();
                        defpackage.ijx.i(parcel2, rxiVarC);
                        break;
                    case 17:
                        long j5 = parcel.readLong();
                        java.util.List listC = defpackage.ijx.c(parcel);
                        java.util.List listC2 = defpackage.ijx.c(parcel);
                        android.os.ParcelFileDescriptor parcelFileDescriptor2 = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
                        android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                        if (strongBinder4 != null) {
                            rxp rxpVarQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.startup.ICarServiceCallback");
                            rxpVar = rxpVarQueryLocalInterface4 instanceof defpackage.rxf ? (defpackage.rxf) rxpVarQueryLocalInterface4 : new rxd(strongBinder4);
                        }
                        rxp rxpVar2 = rxpVar;
                        defpackage.ijx.d(parcel);
                        l(j5, listC, listC2, parcelFileDescriptor2, rxpVar2);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        long j6 = parcel.readLong();
                        java.util.List listC3 = defpackage.ijx.c(parcel);
                        java.util.List listC4 = defpackage.ijx.c(parcel);
                        android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                        if (strongBinder5 != null) {
                            rxp rxpVarQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.startup.ICarServiceCallback");
                            rxpVar = rxpVarQueryLocalInterface5 instanceof defpackage.rxf ? (defpackage.rxf) rxpVarQueryLocalInterface5 : new rxd(strongBinder5);
                        }
                        defpackage.ijx.d(parcel);
                        j(j6, listC3, listC4, rxpVar);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        long j7 = parcel.readLong();
                        int i2 = parcel.readInt();
                        defpackage.ijx.d(parcel);
                        i(j7, i2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        long j8 = parcel.readLong();
                        int i3 = parcel.readInt();
                        android.os.Bundle bundle = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                        android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                        if (strongBinder6 != null) {
                            rxp rxpVarQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.startup.IStartupServiceCallback");
                            rxpVar = rxpVarQueryLocalInterface6 instanceof defpackage.rxr ? (defpackage.rxr) rxpVarQueryLocalInterface6 : new rxp(strongBinder6);
                        }
                        defpackage.ijx.d(parcel);
                        d(j8, i3, bundle, rxpVar);
                        parcel2.writeNoException();
                        break;
                    case 21:
                        t();
                        parcel2.writeNoException();
                        java.lang.ClassLoader classLoader = defpackage.ijx.a;
                        parcel2.writeInt(1);
                        break;
                    case 22:
                        java.lang.ClassLoader classLoader2 = defpackage.ijx.a;
                        boolean z = parcel.readInt() != 0;
                        boolean z2 = parcel.readInt() != 0;
                        defpackage.ijx.d(parcel);
                        o(z, z2);
                        parcel2.writeNoException();
                        break;
                    case 23:
                        long j9 = parcel.readLong();
                        android.os.Bundle bundle2 = (android.os.Bundle) defpackage.ijx.a(parcel, android.os.Bundle.CREATOR);
                        defpackage.ijx.d(parcel);
                        n(j9, bundle2);
                        parcel2.writeNoException();
                        break;
                    case 24:
                        parcel.readInt();
                        parcel.readInt();
                        defpackage.ijx.d(parcel);
                        u();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        break;
                    case 25:
                        int i4 = parcel.readInt();
                        int i5 = parcel.readInt();
                        android.os.ParcelFileDescriptor parcelFileDescriptor3 = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
                        byte[] bArrCreateByteArray = parcel.createByteArray();
                        defpackage.ijx.d(parcel);
                        boolean zS = s(i4, i5, parcelFileDescriptor3, bArrCreateByteArray);
                        parcel2.writeNoException();
                        parcel2.writeInt(zS ? 1 : 0);
                        break;
                    default:
                        return false;
                }
            } else {
                long j10 = parcel.readLong();
                java.util.List listC5 = defpackage.ijx.c(parcel);
                android.os.ParcelFileDescriptor parcelFileDescriptor4 = (android.os.ParcelFileDescriptor) defpackage.ijx.a(parcel, android.os.ParcelFileDescriptor.CREATOR);
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    rxp rxpVarQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.startup.ICarServiceCallback");
                    rxpVar = rxpVarQueryLocalInterface7 instanceof defpackage.rxf ? (defpackage.rxf) rxpVarQueryLocalInterface7 : new rxd(strongBinder7);
                }
                defpackage.ijx.d(parcel);
                k(j10, listC5, parcelFileDescriptor4, rxpVar);
                parcel2.writeNoException();
            }
        } else {
            defpackage.qvl qvlVarB = b();
            parcel2.writeNoException();
            defpackage.ijx.i(parcel2, qvlVarB);
        }
        return true;
    }
}
