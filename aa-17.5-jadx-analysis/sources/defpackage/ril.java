package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyState;
import com.google.android.gms.car.control.CarPropertyValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ril extends ijo implements rim {
    public ril() {
        super("com.google.android.gms.car.control.ICarControl");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        ris riqVar = null;
        rip rinVar = null;
        rip rinVar2 = null;
        riv ritVar = null;
        riv ritVar2 = null;
        switch (i) {
            case 2:
                CarProperty carProperty = (CarProperty) ijp.a(parcel, CarProperty.CREATOR);
                CarPropertyValue carPropertyValue = (CarPropertyValue) ijp.a(parcel, CarPropertyValue.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.control.ICarPropertySetResultCallback");
                    riqVar = iInterfaceQueryLocalInterface instanceof ris ? (ris) iInterfaceQueryLocalInterface : new riq(strongBinder);
                }
                ijp.d(parcel);
                v(carProperty, carPropertyValue, riqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.control.ICarPropertyUpdateListener");
                    ritVar2 = iInterfaceQueryLocalInterface2 instanceof riv ? (riv) iInterfaceQueryLocalInterface2 : new rit(strongBinder2);
                }
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(CarProperty.CREATOR);
                ijp.d(parcel);
                u(ritVar2, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.control.ICarPropertyUpdateListener");
                    ritVar = iInterfaceQueryLocalInterface3 instanceof riv ? (riv) iInterfaceQueryLocalInterface3 : new rit(strongBinder3);
                }
                ijp.d(parcel);
                x(ritVar);
                parcel2.writeNoException();
                return true;
            case 5:
                List listK = k();
                parcel2.writeNoException();
                parcel2.writeTypedList(listK);
                return true;
            case 6:
                List listI = i();
                parcel2.writeNoException();
                parcel2.writeList(listI);
                return true;
            case 7:
                CarAction carAction = (CarAction) ijp.a(parcel, CarAction.CREATOR);
                ijp.d(parcel);
                n(carAction);
                parcel2.writeNoException();
                return true;
            case 8:
                int i2 = parcel.readInt();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.car.control.ICarControlGroupUpdateListener");
                    rinVar2 = iInterfaceQueryLocalInterface4 instanceof rip ? (rip) iInterfaceQueryLocalInterface4 : new rin(strongBinder4);
                }
                ijp.d(parcel);
                t(i2, rinVar2);
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.car.control.ICarControlGroupUpdateListener");
                    rinVar = iInterfaceQueryLocalInterface5 instanceof rip ? (rip) iInterfaceQueryLocalInterface5 : new rin(strongBinder5);
                }
                ijp.d(parcel);
                w(rinVar);
                parcel2.writeNoException();
                return true;
            case 10:
                List listJ = j();
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 11:
                l();
                parcel2.writeNoException();
                return true;
            case 12:
                CarProperty carProperty2 = (CarProperty) ijp.a(parcel, CarProperty.CREATOR);
                ijp.d(parcel);
                CarPropertyState carPropertyStateF = f(carProperty2);
                parcel2.writeNoException();
                ijp.h(parcel2, carPropertyStateF);
                return true;
            default:
                return false;
        }
    }
}
