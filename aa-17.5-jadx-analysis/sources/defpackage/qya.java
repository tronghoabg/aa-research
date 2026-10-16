package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioProgramSelector;

/* loaded from: classes.dex */
public abstract class qya extends ijo implements qyb {
    public qya() {
        super("com.google.android.gms.car.ICarRadio");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qye qycVar = null;
        switch (i) {
            case 1:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qycVar = iInterfaceQueryLocalInterface instanceof qye ? (qye) iInterfaceQueryLocalInterface : new qyc(strongBinder);
                }
                ijp.d(parcel);
                s(qycVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qycVar = iInterfaceQueryLocalInterface2 instanceof qye ? (qye) iInterfaceQueryLocalInterface2 : new qyc(strongBinder2);
                }
                ijp.d(parcel);
                x(qycVar);
                parcel2.writeNoException();
                return true;
            case 3:
                RadioProgramSelector radioProgramSelector = (RadioProgramSelector) ijp.a(parcel, RadioProgramSelector.CREATOR);
                ijp.d(parcel);
                w(radioProgramSelector);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zJ = ijp.j(parcel);
                ijp.d(parcel);
                n(zJ);
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    qycVar = iInterfaceQueryLocalInterface3 instanceof qye ? (qye) iInterfaceQueryLocalInterface3 : new qyc(strongBinder3);
                }
                ijp.d(parcel);
                t(qycVar);
                parcel2.writeNoException();
                return true;
            case 6:
                boolean zJ2 = ijp.j(parcel);
                ijp.d(parcel);
                u(zJ2);
                parcel2.writeNoException();
                return true;
            case 7:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                v(i2);
                parcel2.writeNoException();
                return true;
            case 8:
                String string = parcel.readString();
                ijp.d(parcel);
                o(string);
                parcel2.writeNoException();
                return true;
            case 9:
                RadioConfiguration radioConfigurationF = f();
                parcel2.writeNoException();
                ijp.h(parcel2, radioConfigurationF);
                return true;
            default:
                return false;
        }
    }
}
