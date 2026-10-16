package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.libraries.maps.GoogleMap;

/* loaded from: classes3.dex */
public final class vfk extends ijo implements vfl {
    final /* synthetic */ GoogleMap.OnCameraMoveStartedListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfk(GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        super("com.google.android.libraries.maps.internal.IOnCameraMoveStartedListener");
        this.a = onCameraMoveStartedListener;
    }

    @Override // defpackage.vfl
    public final void e(int i) {
        this.a.onCameraMoveStarted(i);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        ijp.d(parcel);
        e(i2);
        parcel2.writeNoException();
        return true;
    }
}
