package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class as extends defpackage.pb {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference a;

    public as(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.pb
    public final void a() {
        throw null;
    }

    @Override // defpackage.pb
    public final void b(java.lang.Object obj) {
        defpackage.pb pbVar = (defpackage.pb) this.a.get();
        if (pbVar == null) {
            throw new java.lang.IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        pbVar.b(obj);
    }
}
