package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class rja extends ijo implements rjb {
    public rja() {
        super("com.google.android.gms.car.diagnostics.ICarDiagnostics");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rje rjcVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                rjcVar = iInterfaceQueryLocalInterface instanceof rje ? (rje) iInterfaceQueryLocalInterface : new rjc(strongBinder);
            }
            ijp.d(parcel);
            b(rjcVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                rjcVar = iInterfaceQueryLocalInterface2 instanceof rje ? (rje) iInterfaceQueryLocalInterface2 : new rjc(strongBinder2);
            }
            ijp.d(parcel);
            c(rjcVar);
            parcel2.writeNoException();
        } else if (i == 3) {
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
                if (iInterfaceQueryLocalInterface3 instanceof rje) {
                }
            }
            ijp.d(parcel);
            parcel2.writeNoException();
            parcel2.writeInt(0);
        } else {
            if (i != 4) {
                return false;
            }
            List listA = a();
            parcel2.writeNoException();
            parcel2.writeTypedList(listA);
        }
        return true;
    }
}
