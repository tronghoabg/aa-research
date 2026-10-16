package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adzp extends defpackage.adzo {
    private final java.util.concurrent.atomic.AtomicIntegerFieldUpdater a;

    public adzp(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.a = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.adzo
    public final boolean a(defpackage.adzr adzrVar) {
        return this.a.compareAndSet(adzrVar, 0, -1);
    }

    @Override // defpackage.adzo
    public final void b(defpackage.adzr adzrVar) {
        this.a.set(adzrVar, 0);
    }
}
