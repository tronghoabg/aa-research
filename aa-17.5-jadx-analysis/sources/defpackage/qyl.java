package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;

/* loaded from: classes.dex */
public final class qyl extends ijn implements qyn {
    public qyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarUiInfoChangedListener");
    }

    @Override // defpackage.qyn
    public final void e(CarUiInfo carUiInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carUiInfo);
        gk(1, parcelGh);
    }
}
