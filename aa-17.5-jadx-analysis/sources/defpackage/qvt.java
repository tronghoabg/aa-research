package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class qvt extends ijo implements qvu {
    public final Object a;
    public final Set b;
    private final Handler c;

    public qvt(Looper looper) {
        super("com.google.android.gms.car.ICarBluetoothClient");
        this.a = new Object();
        this.b = new LinkedHashSet();
        this.c = new sss(looper, new rnz(this));
    }

    public final void a() {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onCarDisconnected");
        }
        Handler handler = this.c;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(7));
    }

    @Override // defpackage.qvu
    public final void e() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onCarDelayedPairing");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(2));
    }

    @Override // defpackage.qvu
    public final void f() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onDisabled");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                g();
                return true;
            case 2:
                f();
                return true;
            case 3:
                e();
                return true;
            case 4:
                j();
                return true;
            case 5:
                k();
                return true;
            case 6:
                h();
                return true;
            case 7:
                i();
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.qvu
    public final void g() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onEnabled");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(0));
    }

    @Override // defpackage.qvu
    public final void h() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onHfpConnected");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(5));
    }

    @Override // defpackage.qvu
    public final void i() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onHfpDisconnected");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(6));
    }

    @Override // defpackage.qvu
    public final void j() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onPaired");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // defpackage.qvu
    public final void k() throws RemoteException {
        if (omc.c("CarBluetoothClient", 3)) {
            rrd.a("CarBluetoothClient", null, "onUnpaired");
        }
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(4));
    }

    public qvt() {
        throw null;
    }
}
