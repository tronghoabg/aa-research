package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.GroundOverlay;
import com.google.android.libraries.maps.model.internal.IGroundOverlayDelegate;

/* loaded from: classes3.dex */
public final class vfq extends ijo implements vfr {
    final /* synthetic */ GoogleMap.OnGroundOverlayClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfq(GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        super("com.google.android.libraries.maps.internal.IOnGroundOverlayClickListener");
        this.a = onGroundOverlayClickListener;
    }

    @Override // defpackage.vfr
    public final void e(IGroundOverlayDelegate iGroundOverlayDelegate) {
        this.a.onGroundOverlayClick(new GroundOverlay(iGroundOverlayDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IGroundOverlayDelegate iGroundOverlayDelegateAsInterface = IGroundOverlayDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        e(iGroundOverlayDelegateAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
