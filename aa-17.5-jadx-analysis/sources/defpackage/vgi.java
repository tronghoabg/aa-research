package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.MapCapabilities;
import com.google.android.libraries.maps.model.internal.IMapCapabilitiesDelegate;

/* loaded from: classes3.dex */
public final class vgi extends ijo implements vgj {
    final /* synthetic */ GoogleMap.OnMapCapabilitiesChangedListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgi(GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        super("com.google.android.libraries.maps.internal.IOnMapCapabilitiesChangedListener");
        this.a = onMapCapabilitiesChangedListener;
    }

    @Override // defpackage.vgj
    public final void e(IMapCapabilitiesDelegate iMapCapabilitiesDelegate) {
        this.a.onMapCapabilitiesChanged(new MapCapabilities(iMapCapabilitiesDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IMapCapabilitiesDelegate iMapCapabilitiesDelegateAsInterface = IMapCapabilitiesDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        e(iMapCapabilitiesDelegateAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
