package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jmp implements java.lang.AutoCloseable {
    public final android.companion.virtual.VirtualDeviceManager.VirtualDevice a;
    public final android.content.Context b;
    public final long c;
    public final defpackage.yqm d;
    public final defpackage.teb e;
    private final defpackage.afer f;
    private final java.util.concurrent.atomic.AtomicBoolean g;

    public jmp(android.companion.virtual.VirtualDeviceManager.VirtualDevice virtualDevice, android.content.Context context, defpackage.afer aferVar) {
        this.a = virtualDevice;
        this.b = context;
        this.f = aferVar;
        long j = aitq.a;
        this.c = agac.e(50, aits.c);
        this.d = defpackage.yqm.c("GH.VirtualDevice");
        this.e = new defpackage.teb(virtualDevice, virtualDevice);
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a(int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT < 37) {
            return;
        }
        this.d.l().B("set DisplayUiMode of %s to %s", i, i2);
        defpackage.teb tebVar = this.e;
        synchronized (tebVar.b) {
            try {
                ((android.companion.virtual.VirtualDeviceManager.VirtualDevice) tebVar.a).setDisplayUiMode(i, i2);
            } catch (java.lang.NoSuchMethodError unused) {
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
