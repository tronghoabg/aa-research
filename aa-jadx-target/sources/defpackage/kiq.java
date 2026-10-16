package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kiq extends java.util.concurrent.locks.ReentrantReadWriteLock {
    private final defpackage.kip a = new defpackage.kip(readLock());
    private final defpackage.kip b = new defpackage.kip(writeLock());

    public final defpackage.kip a() {
        defpackage.kip kipVar = this.a;
        kipVar.a();
        return kipVar;
    }

    public final defpackage.kip b() {
        defpackage.kip kipVar = this.b;
        kipVar.a();
        return kipVar;
    }
}
