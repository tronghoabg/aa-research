package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes2.dex */
public final class rjy extends ijn implements rka {
    public rjy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayActionsController");
    }

    @Override // defpackage.rka
    public final void e(CarDisplayId carDisplayId) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        gk(3, parcelGh);
    }

    @Override // defpackage.rka
    public final void f(CarDisplayId carDisplayId) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        gk(2, parcelGh);
    }
}
