package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class veh extends ijn implements vej {
    public veh(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IInfoWindowAdapter");
    }

    @Override // defpackage.vej
    public final sqj e(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        sqj sqhVar;
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        Parcel parcelGi = gi(2, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
        }
        parcelGi.recycle();
        return sqhVar;
    }

    @Override // defpackage.vej
    public final sqj f(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        sqj sqhVar;
        Parcel parcelGh = gh();
        ijp.i(parcelGh, iMarkerDelegate);
        Parcel parcelGi = gi(1, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
        }
        parcelGi.recycle();
        return sqhVar;
    }
}
