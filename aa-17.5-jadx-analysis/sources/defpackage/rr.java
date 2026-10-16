package defpackage;

import android.os.RemoteException;
import androidx.car.app.hardware.ICarHardwareHost;

/* loaded from: classes2.dex */
public final class rr {
    private final qr a;
    private ICarHardwareHost b;

    public rr(qr qrVar) {
        qrVar.getClass();
        this.a = qrVar;
    }

    public final ICarHardwareHost a() throws RemoteException {
        ICarHardwareHost iCarHardwareHost = this.b;
        if (iCarHardwareHost != null) {
            return iCarHardwareHost;
        }
        ICarHardwareHost iCarHardwareHost2 = (ICarHardwareHost) this.a.b("car", "getHost(CarHardware)", new qh(2));
        iCarHardwareHost2.getClass();
        this.b = iCarHardwareHost2;
        return iCarHardwareHost2;
    }
}
