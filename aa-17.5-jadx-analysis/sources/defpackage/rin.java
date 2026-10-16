package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarControlGroup;

/* loaded from: classes2.dex */
public final class rin extends ijn implements rip {
    public rin(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.control.ICarControlGroupUpdateListener");
    }

    @Override // defpackage.rip
    public final void e(CarControlGroup carControlGroup) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carControlGroup);
        gk(1, parcelGh);
    }
}
