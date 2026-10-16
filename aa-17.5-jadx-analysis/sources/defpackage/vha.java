package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Marker;
import com.google.android.libraries.maps.model.internal.IMarkerDelegate;

/* loaded from: classes3.dex */
public final class vha extends ijo implements vhb {
    final /* synthetic */ GoogleMap.OnMarkerDragListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vha(GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        super("com.google.android.libraries.maps.internal.IOnMarkerDragListener");
        this.a = onMarkerDragListener;
    }

    @Override // defpackage.vhb
    public final void e(IMarkerDelegate iMarkerDelegate) {
        this.a.onMarkerDrag(new Marker(iMarkerDelegate));
    }

    @Override // defpackage.vhb
    public final void f(IMarkerDelegate iMarkerDelegate) {
        this.a.onMarkerDragEnd(new Marker(iMarkerDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            IMarkerDelegate iMarkerDelegateAsInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            g(iMarkerDelegateAsInterface);
        } else if (i == 2) {
            IMarkerDelegate iMarkerDelegateAsInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            e(iMarkerDelegateAsInterface2);
        } else {
            if (i != 3) {
                return false;
            }
            IMarkerDelegate iMarkerDelegateAsInterface3 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            ijp.d(parcel);
            f(iMarkerDelegateAsInterface3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.vhb
    public final void g(IMarkerDelegate iMarkerDelegate) {
        this.a.onMarkerDragStart(new Marker(iMarkerDelegate));
    }
}
