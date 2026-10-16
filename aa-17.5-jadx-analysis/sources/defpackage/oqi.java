package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class oqi implements BluetoothProfile.ServiceListener {
    public static final /* synthetic */ int i = 0;
    public final BluetoothAdapter b;
    public final Consumer c;
    public int f;
    public Runnable g;
    public final Handler h;
    private final Runnable j;
    yph a = yph.c("GH.Bt.ProfMan");
    public boolean d = true;
    public Optional e = Optional.empty();

    public oqi(BluetoothAdapter bluetoothAdapter, Consumer consumer, Runnable runnable) {
        oez oezVar;
        synchronized (this) {
            oezVar = new oez(this, 11);
        }
        this.g = oezVar;
        this.h = new Handler(Looper.getMainLooper());
        this.b = bluetoothAdapter;
        this.c = consumer;
        this.j = runnable;
    }

    public final void a(int i2, BluetoothProfile bluetoothProfile) {
        synchronized (this) {
            this.b.closeProfileProxy(i2, bluetoothProfile);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
        synchronized (this) {
            if (i2 != this.f) {
                return;
            }
            String str = "unknown";
            if (i2 == 1) {
                str = "hfp";
            } else if (i2 == 2) {
                str = "a2dp";
            }
            ((ype) this.a.l().ai(6075)).K("Bluetooth %s profile proxy found (profileId: %d)", str, i2);
            this.h.removeCallbacks(this.g);
            if (this.d) {
                this.e = Optional.ofNullable(bluetoothProfile);
                this.f = i2;
                this.c.accept(bluetoothProfile);
            } else {
                a(i2, bluetoothProfile);
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i2) {
        synchronized (this) {
            if (i2 == this.f) {
                this.e = Optional.empty();
                this.j.run();
            }
        }
    }
}
