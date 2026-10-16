package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.apps.auto.components.car.info.StartingProcessInfo;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;

/* loaded from: classes.dex */
public interface mka extends IInterface {
    void e(TelemetryEvent telemetryEvent) throws RemoteException;

    void f(StartingProcessInfo startingProcessInfo) throws RemoteException;

    void g(IBinder iBinder) throws RemoteException;
}
