package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rkh extends ijn implements rkj {
    public rkh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayManager");
    }

    @Override // defpackage.rkj
    public final rjx e(CarDisplayId carDisplayId) throws RemoteException {
        rjx rjvVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        Parcel parcelGi = gi(3, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            rjvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.display.manager.ICarDisplay");
            rjvVar = iInterfaceQueryLocalInterface instanceof rjx ? (rjx) iInterfaceQueryLocalInterface : new rjv(strongBinder);
        }
        parcelGi.recycle();
        return rjvVar;
    }

    @Override // defpackage.rkj
    public final List f() throws RemoteException {
        Parcel parcelGi = gi(2, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarDisplay.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.rkj
    public final boolean g() throws RemoteException {
        Parcel parcelGi = gi(4, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
