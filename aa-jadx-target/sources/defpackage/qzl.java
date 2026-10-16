package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class qzl extends defpackage.ijw implements defpackage.qzm {
    public qzl() {
        super("com.google.android.gms.car.ICarVendorExtension");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        qzp qznVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    qzp qzpVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface instanceof qzp ? qzpVarQueryLocalInterface : new qzn(strongBinder);
                }
                defpackage.ijx.d(parcel);
                boolean zS = s(qznVar);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    qzp qzpVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface2 instanceof qzp ? qzpVarQueryLocalInterface2 : new qzn(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                o(qznVar);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    qzp qzpVarQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface3 instanceof qzp ? qzpVarQueryLocalInterface3 : new qzn(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                java.lang.String strG = g(qznVar);
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    qzp qzpVarQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface4 instanceof qzp ? qzpVarQueryLocalInterface4 : new qzn(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                byte[] bArrT = t(qznVar);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT);
                return true;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    qzp qzpVarQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface5 instanceof qzp ? qzpVarQueryLocalInterface5 : new qzn(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                android.os.ParcelFileDescriptor parcelFileDescriptorF = f(qznVar);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, parcelFileDescriptorF);
                return true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    qzp qzpVarQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface6 instanceof qzp ? qzpVarQueryLocalInterface6 : new qzn(strongBinder6);
                }
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                l(qznVar, i2);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    qzp qzpVarQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface7 instanceof qzp ? qzpVarQueryLocalInterface7 : new qzn(strongBinder7);
                }
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                j(qznVar, i3);
                parcel2.writeNoException();
                return true;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.os.IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    qzp qzpVarQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface8 instanceof qzp ? qzpVarQueryLocalInterface8 : new qzn(strongBinder8);
                }
                defpackage.ijx.d(parcel);
                android.os.ParcelFileDescriptor parcelFileDescriptorA = a(qznVar);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, parcelFileDescriptorA);
                return true;
            case 9:
                android.os.IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    qzp qzpVarQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qznVar = qzpVarQueryLocalInterface9 instanceof qzp ? qzpVarQueryLocalInterface9 : new qzn(strongBinder9);
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
