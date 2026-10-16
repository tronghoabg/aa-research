package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class fdk extends defpackage.fdf {
    public static final defpackage.fdk a = new defpackage.fdk();
    private static final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);

    @Override // defpackage.fdf, java.lang.AutoCloseable
    public final void close() {
        b.set(0);
    }
}
