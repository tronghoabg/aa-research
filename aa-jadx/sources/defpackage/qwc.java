package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qwc extends defpackage.ijw implements defpackage.qwd {
    public qwc() {
        super("com.google.android.gms.car.ICarAudioRecord");
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        defpackage.qwg qweVar = null;
        switch (i) {
            case 1:
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface : new defpackage.qwe(strongBinder);
                }
                defpackage.ijx.d(parcel);
                h(qweVar);
                parcel2.writeNoException();
                return true;
            case 2:
                android.os.IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface2 instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface2 : new defpackage.qwe(strongBinder2);
                }
                defpackage.ijx.d(parcel);
                i(qweVar);
                parcel2.writeNoException();
                return true;
            case 3:
                android.os.IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface3 instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface3 : new defpackage.qwe(strongBinder3);
                }
                defpackage.ijx.d(parcel);
                f(qweVar);
                parcel2.writeNoException();
                return true;
            case 4:
                android.os.IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface4 instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface4 : new defpackage.qwe(strongBinder4);
                }
                defpackage.ijx.d(parcel);
                android.os.ParcelFileDescriptor parcelFileDescriptorA = a(qweVar);
                parcel2.writeNoException();
                defpackage.ijx.h(parcel2, parcelFileDescriptorA);
                return true;
            case 5:
                android.os.IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface5 instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface5 : new defpackage.qwe(strongBinder5);
                }
                defpackage.ijx.d(parcel);
                g(qweVar);
                parcel2.writeNoException();
                return true;
            case 6:
                android.os.IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface6 instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface6 : new defpackage.qwe(strongBinder6);
                }
                int i2 = parcel.readInt();
                defpackage.ijx.d(parcel);
                d(qweVar, i2);
                parcel2.writeNoException();
                return true;
            case 7:
                android.os.IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qweVar = iInterfaceQueryLocalInterface7 instanceof defpackage.qwg ? (defpackage.qwg) iInterfaceQueryLocalInterface7 : new defpackage.qwe(strongBinder7);
                }
                int i3 = parcel.readInt();
                defpackage.ijx.d(parcel);
                boolean zK = k(qweVar, i3);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
