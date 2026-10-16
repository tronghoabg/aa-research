package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarAudioConfiguration;

/* loaded from: classes.dex */
public abstract class qva extends ijo implements qvb {
    public qva() {
        super("com.google.android.gms.car.ICarAudio");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qve qvcVar = null;
        qxg qxeVar = null;
        qxg qxeVar2 = null;
        qvn qvlVar = null;
        qvn qvlVar2 = null;
        switch (i) {
            case 1:
                int[] iArrP = p();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrP);
                return true;
            case 2:
                int[] iArrO = o();
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO);
                return true;
            case 3:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                CarAudioConfiguration[] carAudioConfigurationArrR = r(i2);
                parcel2.writeNoException();
                parcel2.writeTypedArray(carAudioConfigurationArrR, 1);
                return true;
            case 4:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                ijp.d(parcel);
                CarAudioConfiguration carAudioConfigurationF = f(i3, i4);
                parcel2.writeNoException();
                ijp.h(parcel2, carAudioConfigurationF);
                return true;
            case 5:
                int i5 = parcel.readInt();
                ijp.d(parcel);
                CarAudioConfiguration[] carAudioConfigurationArrQ = q(i5);
                parcel2.writeNoException();
                parcel2.writeTypedArray(carAudioConfigurationArrQ, 1);
                return true;
            case 6:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                ijp.d(parcel);
                CarAudioConfiguration carAudioConfigurationD = d(i6, i7);
                parcel2.writeNoException();
                ijp.h(parcel2, carAudioConfigurationD);
                return true;
            case 7:
                int i8 = parcel.readInt();
                int i9 = parcel.readInt();
                ijp.d(parcel);
                int iC = c(i8, i9);
                parcel2.writeNoException();
                parcel2.writeInt(iC);
                return true;
            case 8:
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                ijp.d(parcel);
                int iB = b(i10, i11);
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    if (iInterfaceQueryLocalInterface instanceof qve) {
                    }
                }
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                ijp.d(parcel);
                qvo qvoVarT = t();
                parcel2.writeNoException();
                ijp.i(parcel2, qvoVarT);
                return true;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    qvcVar = iInterfaceQueryLocalInterface2 instanceof qve ? (qve) iInterfaceQueryLocalInterface2 : new qvc(strongBinder2);
                }
                int i12 = parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                ijp.d(parcel);
                qvh qvhVarS = s(qvcVar, i12);
                parcel2.writeNoException();
                ijp.i(parcel2, qvhVarS);
                return true;
            case 11:
                long j = parcel.readLong();
                ijp.d(parcel);
                boolean zN = n(j);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 12:
                long j2 = parcel.readLong();
                ijp.d(parcel);
                boolean zM = m(j2);
                parcel2.writeNoException();
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 13:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
                    qvlVar2 = iInterfaceQueryLocalInterface3 instanceof qvn ? (qvn) iInterfaceQueryLocalInterface3 : new qvl(strongBinder3);
                }
                ijp.d(parcel);
                g(qvlVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.ICarAudioStreamDiagnosticsListener");
                    qvlVar = iInterfaceQueryLocalInterface4 instanceof qvn ? (qvn) iInterfaceQueryLocalInterface4 : new qvl(strongBinder4);
                }
                ijp.d(parcel);
                k(qvlVar);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
                    qxeVar2 = iInterfaceQueryLocalInterface5 instanceof qxg ? (qxg) iInterfaceQueryLocalInterface5 : new qxe(strongBinder5);
                }
                ijp.d(parcel);
                h(qxeVar2);
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.car.ICarMicrophoneDiagnosticsListener");
                    qxeVar = iInterfaceQueryLocalInterface6 instanceof qxg ? (qxg) iInterfaceQueryLocalInterface6 : new qxe(strongBinder6);
                }
                ijp.d(parcel);
                l(qxeVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
