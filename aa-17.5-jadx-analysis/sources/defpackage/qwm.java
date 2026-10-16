package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.GestureDirection;

/* loaded from: classes2.dex */
public final class qwm extends ijn implements qwo {
    public qwm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarGestureListener");
    }

    @Override // defpackage.qwo
    public final void e(GestureDirection gestureDirection) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, gestureDirection);
        gk(2, parcelGh);
    }
}
