package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qzl extends defpackage.ijw implements defpackage.qzm {
    public qzl() {
        super("com.google.android.gms.car.ICarVendorExtension");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qzp qznVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface : new defpackage.qzn(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zS = s(qznVar);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface2 : new defpackage.qzn(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                o(qznVar);
                parcel2.writeNoException();
                return true;
            case 3:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface3 : new defpackage.qzn(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                java.lang.String strG = g(qznVar);
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 4:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface4 : new defpackage.qzn(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                byte[] bArrT = t(qznVar);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT);
                return true;
            case 5:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface5 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface5 : new defpackage.qzn(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                android.os.ParcelFileDescriptor parcelFileDescriptorF = f(qznVar);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, parcelFileDescriptorF);
                return true;
            case 6:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface6 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface6 : new defpackage.qzn(strongBinder6);
                }
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                l(qznVar, i2);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface7 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface7 : new defpackage.qzn(strongBinder7);
                }
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                j(qznVar, i3);
                parcel2.writeNoException();
                return true;
            case 8:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface8 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface8 : new defpackage.qzn(strongBinder8);
                }
                defpackage.ijx.d(parcel);
                android.os.ParcelFileDescriptor parcelFileDescriptorA = a(qznVar);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, parcelFileDescriptorA);
                return true;
            case 9:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = iInterfaceQueryLocalInterface9 instanceof defpackage.qzp ? (defpackage.qzp) iInterfaceQueryLocalInterface9 : new defpackage.qzn(strongBinder9);
                }
                int i4 = parcel.readInt();
                defpackage.ijx.d(parcel);
                k(qznVar, i4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
