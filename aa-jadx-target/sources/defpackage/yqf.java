package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yqf extends defpackage.yqc {
    public static final defpackage.ypr a = new defpackage.yqd();
    public static final java.lang.ThreadLocal b = new defpackage.yqe();
    final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();

    @Override // defpackage.yqc
    public final void a() {
        this.e.decrementAndGet();
    }
}
