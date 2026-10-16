package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyConfig;
import com.google.android.gms.car.control.CarPropertyState;
import com.google.android.gms.car.control.CarPropertyValue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class rik extends ijn implements rim {
    public rik(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarControl");
    }

    @Override // defpackage.rim
    public final CarPropertyState f(CarProperty carProperty) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carProperty);
        Parcel parcelGi = gi(12, parcelGh);
        CarPropertyState carPropertyState = (CarPropertyState) ijp.a(parcelGi, CarPropertyState.CREATOR);
        parcelGi.recycle();
        return carPropertyState;
    }

    @Override // defpackage.rim
    public final List i() throws RemoteException {
        Parcel parcelGi = gi(6, gh());
        ArrayList arrayListC = ijp.c(parcelGi);
        parcelGi.recycle();
        return arrayListC;
    }

    @Override // defpackage.rim
    public final List j() throws RemoteException {
        Parcel parcelGi = gi(10, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarAction.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.rim
    public final List k() throws RemoteException {
        Parcel parcelGi = gi(5, gh());
        ArrayList arrayListCreateTypedArrayList = parcelGi.createTypedArrayList(CarPropertyConfig.CREATOR);
        parcelGi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.rim
    public final void l() throws RemoteException {
        throw null;
    }

    @Override // defpackage.rim
    public final void n(CarAction carAction) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carAction);
        gj(7, parcelGh);
    }

    @Override // defpackage.rim
    public final void t(int i, rip ripVar) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        ijp.i(parcelGh, ripVar);
        gj(8, parcelGh);
    }

    @Override // defpackage.rim
    public final void u(riv rivVar, List list) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rivVar);
        parcelGh.writeTypedList(list);
        gj(3, parcelGh);
    }

    @Override // defpackage.rim
    public final void v(CarProperty carProperty, CarPropertyValue carPropertyValue, ris risVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carProperty);
        ijp.g(parcelGh, carPropertyValue);
        ijp.i(parcelGh, risVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.rim
    public final void w(rip ripVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, ripVar);
        gj(9, parcelGh);
    }

    @Override // defpackage.rim
    public final void x(riv rivVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, rivVar);
        gj(4, parcelGh);
    }
}
