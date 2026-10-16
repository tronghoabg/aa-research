package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Polyline;
import com.google.android.libraries.maps.model.internal.IPolylineDelegate;

/* loaded from: classes3.dex */
public final class vhs extends ijo implements vht {
    final /* synthetic */ GoogleMap.OnPolylineClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhs(GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        super("com.google.android.libraries.maps.internal.IOnPolylineClickListener");
        this.a = onPolylineClickListener;
    }

    @Override // defpackage.vht
    public final void e(IPolylineDelegate iPolylineDelegate) {
        this.a.onPolylineClick(new Polyline(iPolylineDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IPolylineDelegate iPolylineDelegateAsInterface = IPolylineDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        e(iPolylineDelegateAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
