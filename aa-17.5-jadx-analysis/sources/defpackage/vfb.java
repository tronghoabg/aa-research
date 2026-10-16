package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vfb extends ijo implements vfc {
    final /* synthetic */ GoogleMap.OnCameraIdleListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfb(GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        super("com.google.android.libraries.maps.internal.IOnCameraIdleListener");
        this.a = onCameraIdleListener;
    }

    @Override // defpackage.vfc
    public final void e() {
        this.a.onCameraIdle();
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
