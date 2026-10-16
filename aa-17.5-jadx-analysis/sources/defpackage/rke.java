package defpackage;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final class rke extends ijn implements rkg {
    public rke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
    }

    @Override // defpackage.rkg
    public final void e(CarDisplayId carDisplayId, Rect rect) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        ijp.g(parcelGh, rect);
        gj(1, parcelGh);
    }
}
