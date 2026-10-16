package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ypc extends defpackage.yqc {
    public static final defpackage.ypr a = new defpackage.ypa();
    public final java.util.concurrent.atomic.AtomicLong b = new java.util.concurrent.atomic.AtomicLong(-1);

    @Override // defpackage.yqc
    public final void a() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.b;
        atomicLong.set(java.lang.Math.max(-atomicLong.get(), 0L));
    }
}
