package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.VisibleRegion;

/* loaded from: classes3.dex */
public final class vik extends ijn implements vim {
    public vik(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.maps.internal.IProjectionDelegate");
    }

    @Override // defpackage.vim
    public final sqj e(LatLng latLng) throws RemoteException {
        sqj sqhVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, latLng);
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

    @Override // defpackage.vim
    public final LatLng f(sqj sqjVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, sqjVar);
        Parcel parcelGi = gi(1, parcelGh);
        LatLng latLng = (LatLng) ijp.a(parcelGi, LatLng.CREATOR);
        parcelGi.recycle();
        return latLng;
    }

    @Override // defpackage.vim
    public final VisibleRegion g() throws RemoteException {
        Parcel parcelGi = gi(3, gh());
        VisibleRegion visibleRegion = (VisibleRegion) ijp.a(parcelGi, VisibleRegion.CREATOR);
        parcelGi.recycle();
        return visibleRegion;
    }
}
