package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class qvg extends ijo implements qvh {
    public qvg() {
        super("com.google.android.gms.car.ICarAudioRecord");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qvk qviVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface instanceof qvk ? (qvk) iInterfaceQueryLocalInterface : new qvi(strongBinder);
                }
                ijp.d(parcel);
                h(qviVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface2 instanceof qvk ? (qvk) iInterfaceQueryLocalInterface2 : new qvi(strongBinder2);
                }
                ijp.d(parcel);
                i(qviVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface3 instanceof qvk ? (qvk) iInterfaceQueryLocalInterface3 : new qvi(strongBinder3);
                }
                ijp.d(parcel);
                f(qviVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface4 instanceof qvk ? (qvk) iInterfaceQueryLocalInterface4 : new qvi(strongBinder4);
                }
                ijp.d(parcel);
                ParcelFileDescriptor parcelFileDescriptorA = a(qviVar);
                parcel2.writeNoException();
                ijp.h(parcel2, parcelFileDescriptorA);
                return true;
            case 5:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface5 instanceof qvk ? (qvk) iInterfaceQueryLocalInterface5 : new qvi(strongBinder5);
                }
                ijp.d(parcel);
                g(qviVar);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface6 instanceof qvk ? (qvk) iInterfaceQueryLocalInterface6 : new qvi(strongBinder6);
                }
                int i2 = parcel.readInt();
                ijp.d(parcel);
                d(qviVar, i2);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.car.ICarAudioRecordCallback");
                    qviVar = iInterfaceQueryLocalInterface7 instanceof qvk ? (qvk) iInterfaceQueryLocalInterface7 : new qvi(strongBinder7);
                }
                int i3 = parcel.readInt();
                ijp.d(parcel);
                boolean zK = k(qviVar, i3);
                parcel2.writeNoException();
                parcel2.writeInt(zK ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
