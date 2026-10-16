package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.integratedoverlay.OverlayParameters;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class rjl extends ijo implements rjm {
    public rjl() {
        super("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayManager");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rjp rjnVar = null;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
                rjnVar = iInterfaceQueryLocalInterface instanceof rjp ? (rjp) iInterfaceQueryLocalInterface : new rjn(strongBinder);
            }
            ijp.d(parcel);
            a(rjnVar);
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(OverlayParameters.CREATOR);
            ijp.d(parcel);
            b(arrayListCreateTypedArrayList);
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.display.integratedoverlay.IIntegratedOverlayStateCallbacks");
            rjnVar = iInterfaceQueryLocalInterface2 instanceof rjp ? (rjp) iInterfaceQueryLocalInterface2 : new rjn(strongBinder2);
        }
        ijp.d(parcel);
        c(rjnVar);
        return true;
    }
}
