package defpackage;

import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class jmi implements AutoCloseable {
    public final VirtualDeviceManager.VirtualDevice a;
    public final Context b;
    public final long c;
    public final yph d;
    public final skn e;
    private final afdr f;
    private final AtomicBoolean g;

    public jmi(VirtualDeviceManager.VirtualDevice virtualDevice, Context context, afdr afdrVar) {
        this.a = virtualDevice;
        this.b = context;
        this.f = afdrVar;
        long j = aisq.a;
        this.c = afzc.c(50, aiss.c);
        this.d = new yph(yqn.d("GH.VirtualDevice"));
        this.e = new skn(virtualDevice, virtualDevice);
        this.g = new AtomicBoolean(false);
    }

    public final void a(int i, int i2) {
        if (Build.VERSION.SDK_INT < 37) {
            return;
        }
        this.d.l().B("set DisplayUiMode of %s to %s", i, i2);
        skn sknVar = this.e;
        synchronized (sknVar.a) {
            try {
                ((VirtualDeviceManager.VirtualDevice) sknVar.b).setDisplayUiMode(i, i2);
            } catch (NoSuchMethodError unused) {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.g.compareAndSet(false, true)) {
            this.f.invoke();
        }
    }
}
