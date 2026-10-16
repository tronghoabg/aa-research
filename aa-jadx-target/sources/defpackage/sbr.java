package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbr implements java.io.Closeable {
    private final java.io.Closeable a;
    private final int b;
    private final java.util.concurrent.atomic.AtomicBoolean c;

    public sbr(java.io.Closeable closeable, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, int i) {
        this.a = closeable;
        this.b = i;
        this.c = atomicBoolean;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.ypu ypuVarAi = com.google.android.gms.carsetup.CarSetupServiceImpl.a.l().ai(8646);
        java.io.Closeable closeable = this.a;
        ypuVarAi.y("Closing fd: %s", closeable);
        closeable.close();
        if (this.b == 1) {
            this.c.set(false);
        }
    }
}
