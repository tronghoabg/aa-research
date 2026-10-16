package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;
import com.google.android.libraries.maps.model.Polygon;
import com.google.android.libraries.maps.model.internal.IPolygonDelegate;

/* loaded from: classes3.dex */
public final class vhp extends ijo implements vhq {
    final /* synthetic */ GoogleMap.OnPolygonClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhp(GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        super("com.google.android.libraries.maps.internal.IOnPolygonClickListener");
        this.a = onPolygonClickListener;
    }

    @Override // defpackage.vhq
    public final void e(IPolygonDelegate iPolygonDelegate) {
        this.a.onPolygonClick(new Polygon(iPolygonDelegate));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IPolygonDelegate iPolygonDelegateAsInterface = IPolygonDelegate.Stub.asInterface(parcel.readStrongBinder());
        ijp.d(parcel);
        e(iPolygonDelegateAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
