package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vei extends ijo implements vej {
    final /* synthetic */ GoogleMap.InfoWindowAdapter a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vei(GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        super("com.google.android.libraries.maps.internal.IInfoWindowAdapter");
        this.a = infoWindowAdapter;
    }

    @Override // defpackage.vej
    public final sqj e(IMarkerDelegate iMarkerDelegate) {
        return new sqi(this.a.getInfoContents(new Marker(iMarkerDelegate)));
    }

    @Override // defpackage.vej
    public final sqj f(IMarkerDelegate iMarkerDelegate) {
        return new sqi(this.a.getInfoWindow(new Marker(iMarkerDelegate)));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            sqj sqjVarF = f(iMarkerDelegateAsInterface);
            parcel2.writeNoException();
            ijp.i(parcel2, sqjVarF);
        } else {
            if (i != 2) {
                return false;
            }
            IMarkerDelegate iMarkerDelegateAsInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            sqj sqjVarE = e(iMarkerDelegateAsInterface2);
            parcel2.writeNoException();
            ijp.i(parcel2, sqjVarE);
        }
        return true;
    }
}
