package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vgx extends ijo implements vgy {
    final /* synthetic */ GoogleMap.OnMarkerClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgx(GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        super("com.google.android.libraries.maps.internal.IOnMarkerClickListener");
        this.a = onMarkerClickListener;
    }

    @Override // defpackage.vgy
    public final boolean e(IMarkerDelegate iMarkerDelegate) {
        return this.a.onMarkerClick(new Marker(iMarkerDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        boolean zE = e(iMarkerDelegateAsInterface);
        parcel2.writeNoException();
        parcel2.writeInt(zE ? 1 : 0);
        return true;
    }
}
