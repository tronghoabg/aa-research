package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vgc extends ijo implements vgd {
    final /* synthetic */ GoogleMap.OnInfoWindowLongClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgc(GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        super("com.google.android.libraries.maps.internal.IOnInfoWindowLongClickListener");
        this.a = onInfoWindowLongClickListener;
    }

    @Override // defpackage.vgd
    public final void e(IMarkerDelegate iMarkerDelegate) {
        this.a.onInfoWindowLongClick(new Marker(iMarkerDelegate));
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
