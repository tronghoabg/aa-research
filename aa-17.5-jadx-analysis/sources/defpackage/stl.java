package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationReceiver;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

/* loaded from: classes.dex */
public final class stl extends ijn implements IInterface {
    public stl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void e(LocationReceiver locationReceiver, LocationRequest locationRequest, smm smmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, locationReceiver);
        ijp.g(parcelGh, locationRequest);
        ijp.i(parcelGh, smmVar);
        gj(88, parcelGh);
    }

    public final void f(LocationReceiver locationReceiver, smm smmVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, locationReceiver);
        ijp.i(parcelGh, smmVar);
        gj(89, parcelGh);
    }

    public final void g(LocationRequestUpdateData locationRequestUpdateData) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, locationRequestUpdateData);
        gj(59, parcelGh);
    }
}
