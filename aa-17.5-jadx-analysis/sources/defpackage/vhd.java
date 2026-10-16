package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vhd extends ijo implements vhe {
    final /* synthetic */ GoogleMap.OnMyLocationButtonClickListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhd(GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        super("com.google.android.libraries.maps.internal.IOnMyLocationButtonClickListener");
        this.a = onMyLocationButtonClickListener;
    }

    @Override // defpackage.vhe
    public final boolean e() {
        return this.a.onMyLocationButtonClick();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zE = e();
        parcel2.writeNoException();
        ClassLoader classLoader = ijp.a;
        parcel2.writeInt(zE ? 1 : 0);
        return true;
    }
}
