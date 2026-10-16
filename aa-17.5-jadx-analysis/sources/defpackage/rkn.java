package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;

/* loaded from: classes.dex */
public final class rkn extends ijn implements rkp {
    public rkn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.display.manager.ICarDisplayUiFeaturesChangedListener");
    }

    @Override // defpackage.rkp
    public final void e(CarDisplayId carDisplayId, CarDisplayUiFeatures carDisplayUiFeatures) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carDisplayId);
        ijp.g(parcelGh, carDisplayUiFeatures);
        gj(2, parcelGh);
    }
}
