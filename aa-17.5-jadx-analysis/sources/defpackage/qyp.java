package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qyp extends ijo implements qyq {
    public qyp() {
        super("com.google.android.gms.car.ICarVendorExtension");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qyt qyrVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface instanceof qyt ? (qyt) iInterfaceQueryLocalInterface : new qyr(strongBinder);
                }
                ijp.d(parcel);
                boolean zS = s(qyrVar);
                parcel2.writeNoException();
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface2 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface2 : new qyr(strongBinder2);
                }
                ijp.d(parcel);
                o(qyrVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface3 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface3 : new qyr(strongBinder3);
                }
                ijp.d(parcel);
                String strG = g(qyrVar);
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 4:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface4 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface4 : new qyr(strongBinder4);
                }
                ijp.d(parcel);
                byte[] bArrT = t(qyrVar);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrT);
                return true;
            case 5:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface5 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface5 : new qyr(strongBinder5);
                }
                ijp.d(parcel);
                ParcelFileDescriptor parcelFileDescriptorF = f(qyrVar);
                parcel2.writeNoException();
                ijp.h(parcel2, parcelFileDescriptorF);
                return true;
            case 6:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface6 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface6 : new qyr(strongBinder6);
                }
                int i2 = parcel.readInt();
                ijp.d(parcel);
                l(qyrVar, i2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface7 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface7 : new qyr(strongBinder7);
                }
                int i3 = parcel.readInt();
                ijp.d(parcel);
                j(qyrVar, i3);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface8 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface8 : new qyr(strongBinder8);
                }
                ijp.d(parcel);
                ParcelFileDescriptor parcelFileDescriptorA = a(qyrVar);
                parcel2.writeNoException();
                ijp.h(parcel2, parcelFileDescriptorA);
                return true;
            case 9:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.car.ICarVendorExtensionClient");
                    qyrVar = iInterfaceQueryLocalInterface9 instanceof qyt ? (qyt) iInterfaceQueryLocalInterface9 : new qyr(strongBinder9);
                }
                int i4 = parcel.readInt();
                ijp.d(parcel);
                k(qyrVar, i4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
