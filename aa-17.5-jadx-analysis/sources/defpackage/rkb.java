package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplay;

/* loaded from: classes.dex */
public final class rkb extends ijn implements rkd {
    public rkb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
    }

    @Override // defpackage.rkd
    public final void e(CarDisplay carDisplay) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplay);
        gj(1, parcelGh);
    }
}
