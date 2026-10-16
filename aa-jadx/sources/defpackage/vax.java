package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vax implements defpackage.xzi {
    public final defpackage.vaw a;
    private final java.util.concurrent.atomic.AtomicReference b;

    public vax() {
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        this.a = new defpackage.vaw();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final java.lang.Object d(java.lang.Object obj) {
        defpackage.vaw vawVar = this.a;
        java.lang.Object andSet = this.b.getAndSet(obj);
        if (!vawVar.n()) {
            vawVar.m(this);
        }
        return andSet;
    }

    public final synchronized void b(java.lang.Object obj) {
        d(obj);
        this.a.h();
    }

    public final synchronized void c(java.lang.Object obj) {
        if (j$.util.Objects.equals(d(obj), obj)) {
            return;
        }
        this.a.h();
    }

    @Override // defpackage.xzi
    public final java.lang.Object fF() {
        return this.b.get();
    }

    public vax(java.lang.Object obj) {
        this.b = new java.util.concurrent.atomic.AtomicReference(obj);
        this.a = new defpackage.vaw(this);
    }
}
