package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vfh extends ijo implements vfi {
    final /* synthetic */ GoogleMap.OnCameraMoveListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfh(GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        super("com.google.android.libraries.maps.internal.IOnCameraMoveListener");
        this.a = onCameraMoveListener;
    }

    @Override // defpackage.vfi
    public final void e() {
        this.a.onCameraMove();
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
