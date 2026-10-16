package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aisg implements defpackage.aisp {
    private final java.util.concurrent.atomic.AtomicReference a;

    public aisg(defpackage.aisp aispVar) {
        this.a = new java.util.concurrent.atomic.AtomicReference(aispVar);
    }

    @Override // defpackage.aisp
    public final java.util.Iterator a() {
        defpackage.aisp aispVar = (defpackage.aisp) this.a.getAndSet(null);
        if (aispVar != null) {
            return aispVar.a();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
