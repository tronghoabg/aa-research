package defpackage;

import android.bluetooth.BluetoothProfile;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class oza implements BluetoothProfile.ServiceListener {
    public static final /* synthetic */ int g = 0;
    public BluetoothProfile b;
    public int c;
    public final ExecutorService d;
    public final /* synthetic */ ozb e;
    public final gjv f = new gjv((Object) false);
    public final Handler a = new Handler(Looper.getMainLooper());

    public oza(ozb ozbVar) {
        ExecutorService executorServiceNewSingleThreadExecutor;
        this.e = ozbVar;
        if (!aczv.az()) {
            executorServiceNewSingleThreadExecutor = null;
        } else if (aczv.n() > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, aczv.n(), TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            executorServiceNewSingleThreadExecutor = threadPoolExecutor;
        } else {
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        }
        this.d = executorServiceNewSingleThreadExecutor;
    }

    public final void a(int i, BluetoothProfile bluetoothProfile) {
        if (!aczv.az()) {
            this.e.e.closeProfileProxy(i, bluetoothProfile);
            return;
        }
        ExecutorService executorService = this.d;
        if (executorService == null) {
            throw new IllegalStateException("background executor is expected to be initialized");
        }
        executorService.execute(new isp(this.e, i, bluetoothProfile, this, 8));
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        bluetoothProfile.getClass();
        this.b = bluetoothProfile;
        this.c = i;
        if (((Boolean) this.f.v()).booleanValue()) {
            a(i, bluetoothProfile);
            return;
        }
        ((ype) ozb.a.f()).w("profile service connected. profile = %d", i);
        ozb ozbVar = this.e;
        ozbVar.c.post(new oa(ozbVar, i, bluetoothProfile, 11));
        ozbVar.d();
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
        ((ype) ozb.a.f()).w("profile service disconnected. profile = %d", i);
        ozb ozbVar = this.e;
        ozbVar.c.post(new hhx(ozbVar, i, 15));
        ozbVar.d();
    }
}
