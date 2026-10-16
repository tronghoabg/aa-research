package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vfw extends ijo implements vfx {
    final /* synthetic */ GoogleMap.OnInfoWindowClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfw(GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        super("com.google.android.libraries.maps.internal.IOnInfoWindowClickListener");
        this.a = onInfoWindowClickListener;
    }

    @Override // defpackage.vfx
    public final void e(IMarkerDelegate iMarkerDelegate) {
        this.a.onInfoWindowClick(new Marker(iMarkerDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        e(iMarkerDelegateAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
