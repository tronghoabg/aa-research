package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class yse extends defpackage.ysr {
    public static final defpackage.yse a = new defpackage.yse(defpackage.yst.a);
    private final java.util.concurrent.atomic.AtomicReference b;

    public yse(defpackage.ysr ysrVar) {
        this.b = new java.util.concurrent.atomic.AtomicReference(ysrVar);
    }

    @Override // defpackage.ysr
    public final defpackage.yqy a() {
        return ((defpackage.ysr) this.b.get()).a();
    }

    @Override // defpackage.ysr
    public final defpackage.ysy b() {
        return ((defpackage.ysr) this.b.get()).b();
    }

    public final void c() {
        this.b.set(defpackage.yst.a);
    }

    @Override // defpackage.ysr
    public final void d(java.lang.String str, java.util.logging.Level level, boolean z) {
        ((defpackage.ysr) this.b.get()).d(str, level, z);
    }
}
