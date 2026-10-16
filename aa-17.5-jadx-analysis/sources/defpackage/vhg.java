package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vhg extends ijo implements vhh {
    final /* synthetic */ GoogleMap.OnMyLocationChangeListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhg(GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        super("com.google.android.libraries.maps.internal.IOnMyLocationChangeListener");
        this.a = onMyLocationChangeListener;
    }

    @Override // defpackage.vhh
    public final void e(sqj sqjVar) {
        this.a.onMyLocationChange((Location) sqi.a(sqjVar));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        sqj sqhVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            sqhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
        }
        ijp.d(parcel);
        e(sqhVar);
        parcel2.writeNoException();
        return true;
    }
}
