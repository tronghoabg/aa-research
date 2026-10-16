package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vfe extends ijo implements vff {
    final /* synthetic */ GoogleMap.OnCameraMoveCanceledListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfe(GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        super("com.google.android.libraries.maps.internal.IOnCameraMoveCanceledListener");
        this.a = onCameraMoveCanceledListener;
    }

    @Override // defpackage.vff
    public final void e() {
        this.a.onCameraMoveCanceled();
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
