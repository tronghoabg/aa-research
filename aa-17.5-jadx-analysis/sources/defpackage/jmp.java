package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes2.dex */
public final class jmp extends ijn implements IInterface {
    public jmp(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.carservice.frx.phonescreen.ICarServiceCallbacks");
    }

    public final void e(CarInfoInternal carInfoInternal, boolean z) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carInfoInternal);
        parcelGh.writeInt(z ? 1 : 0);
        gj(2, parcelGh);
    }
}
