package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.auto.components.car.info.StartingProcessInfo;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;

/* loaded from: classes.dex */
public final class mjy extends ijn implements mka {
    public mjy(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.components.service.ICarModeSharedService");
    }

    @Override // defpackage.mka
    public final void e(TelemetryEvent telemetryEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, telemetryEvent);
        gk(4, parcelGh);
    }

    @Override // defpackage.mka
    public final void f(StartingProcessInfo startingProcessInfo) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, startingProcessInfo);
        gj(2, parcelGh);
    }

    @Override // defpackage.mka
    public final void g(IBinder iBinder) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeStrongBinder(iBinder);
        gj(3, parcelGh);
    }
}
