package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rw {
    private final defpackage.qw a;
    private androidx.car.app.hardware.ICarHardwareHost b;

    public rw(defpackage.qw qwVar) {
        qwVar.getClass();
        this.a = qwVar;
    }

    public final androidx.car.app.hardware.ICarHardwareHost a() throws android.os.RemoteException {
        androidx.car.app.hardware.ICarHardwareHost iCarHardwareHost = this.b;
        if (iCarHardwareHost != null) {
            return iCarHardwareHost;
        }
        androidx.car.app.hardware.ICarHardwareHost iCarHardwareHost2 = (androidx.car.app.hardware.ICarHardwareHost) this.a.b("car", "getHost(CarHardware)", new defpackage.qm(2));
        iCarHardwareHost2.getClass();
        this.b = iCarHardwareHost2;
        return iCarHardwareHost2;
    }
}
