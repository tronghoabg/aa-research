package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import j$.util.OptionalInt;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pap implements pal {
    public static final yph a = yph.c("GH.WirelessClient");
    private static final ComponentName l = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.wireless.setup.service.impl.WirelessSetupSharedService");
    public final Context b;
    public final ServiceConnection f;
    public volatile pbg g;
    public volatile pak h;
    private final Executor m;
    public final IBinder d = new Binder();
    public final Handler e = new Handler(Looper.getMainLooper());
    public OptionalInt k = OptionalInt.empty();
    public boolean i = false;
    public boolean j = false;
    public final pbj c = new pbi(this);

    public pap(Context context, Executor executor) {
        this.b = context;
        this.m = executor;
        this.f = new pao(this, executor);
    }

    @Override // defpackage.pal
    public final void a(pak pakVar, String str, BluetoothDevice bluetoothDevice, boolean z) {
        ((ype) ((ype) a.f()).ai((char) 6269)).y("Connecting to wireless setup shared service: %s", bluetoothDevice);
        this.h = pakVar;
        Intent intent = new Intent();
        intent.setComponent(l);
        intent.setAction(str);
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        this.k.ifPresent(new oyh(intent, 2));
        Context context = this.b;
        context.startForegroundService(intent);
        if (z) {
            this.i = context.bindService(intent, this.f, 64);
        }
    }

    @Override // defpackage.pal
    public final void b() {
        ((ype) ((ype) a.f()).ai(6270)).y("Disconnecting wireless setup shared service %s", this.d);
        if (this.j) {
            this.m.execute(new oyy(this, 11));
        } else if (this.i) {
            try {
                this.b.unbindService(this.f);
            } catch (IllegalArgumentException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 6271)).u("Projection process crashed and restarted, no longer bound.");
            }
        }
    }
}
