package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class usr implements java.io.Closeable {
    private final defpackage.trr a;
    private final defpackage.usq b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public usr(defpackage.trr trrVar, defpackage.usq usqVar) {
        this.a = trrVar;
        this.b = usqVar;
    }

    public final defpackage.trr a() {
        defpackage.ysr.bj(!this.c.get());
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        defpackage.trr trrVar;
        if (!this.c.compareAndSet(false, true)) {
            ((defpackage.ype) defpackage.uss.a.a(defpackage.uzo.a).ai((char) 9653)).u("StyleCollectionImpl.close() called twice; this represents a usage error.");
            return;
        }
        defpackage.usq usqVar = this.b;
        synchronized (usqVar) {
            int i = usqVar.b - 1;
            usqVar.b = i;
            trrVar = null;
            if (i == 0) {
                defpackage.trr trrVar2 = usqVar.c;
                trrVar2.getClass();
                usqVar.c = null;
                trrVar = trrVar2;
            }
        }
        if (trrVar != null) {
            usqVar.a.f(trrVar);
        }
    }
}
