package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class pan implements pak {
    public static final yph a = yph.c("GH.WirelessClient");
    public volatile pbg b;
    public volatile IBinder c;
    public final boolean d;
    public final BluetoothDevice e;
    public final Executor f;
    public volatile pag h;
    public final Runnable i;
    public final dnw j;
    private final pal k;
    public final Handler g = new Handler(Looper.getMainLooper());
    private final AtomicBoolean l = new AtomicBoolean(false);

    public pan(pal palVar, boolean z, BluetoothDevice bluetoothDevice, Executor executor, dnw dnwVar) {
        this.k = palVar;
        this.d = z;
        this.e = bluetoothDevice;
        this.f = executor;
        this.j = dnwVar;
        palVar.getClass();
        this.i = new oyy(palVar, 9);
    }

    public static zgp d(pal palVar, String str, BluetoothDevice bluetoothDevice, Executor executor) {
        ((ype) a.l().ai((char) 6257)).u("Connecting and starting projection");
        if (!aczv.ba()) {
            return dsg.w(new pam(palVar, bluetoothDevice, executor, str, 0));
        }
        palVar.a(new pan(palVar, true, bluetoothDevice, executor, null), str, bluetoothDevice, false);
        return wub.Y(true);
    }

    public static zgp e(pal palVar, String str, BluetoothDevice bluetoothDevice, Executor executor) {
        ((ype) a.l().ai((char) 6258)).u("Connecting and starting wireless setup");
        palVar.a(new pan(palVar, false, bluetoothDevice, executor, null), str, bluetoothDevice, false);
        return wub.Y(true);
    }

    @Override // defpackage.pah
    @ResultIgnorabilityUnspecified
    public final void c(pag pagVar, Bundle bundle) {
        if (g(pagVar)) {
            try {
                ((ype) a.l().ai(6264)).u("Starting projection and disconnecting");
                f();
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 6265)).u("Remote gone. Cannot start projection");
            }
        }
    }

    public final void f() throws RemoteException {
        if (this.l.compareAndSet(false, true)) {
            ((ype) a.l().ai(6266)).y("Starting wireless projection: %s", this.c);
            this.b.g(this.c);
            Handler handler = this.g;
            handler.removeCallbacks(this.i);
            pal palVar = this.k;
            palVar.getClass();
            handler.post(new oyy(palVar, 9));
        }
    }

    public final boolean g(pag pagVar) {
        return this.d && pagVar.Z;
    }

    @Override // defpackage.pah
    public final void b() {
    }

    @Override // defpackage.pah
    public final void a(String str, int i, WifiInfo wifiInfo, int i2, int i3) {
    }
}
