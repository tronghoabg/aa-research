package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rvb implements defpackage.rva {
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    public final defpackage.rvc b;

    public rvb(defpackage.rvc rvcVar) {
        this.b = rvcVar;
    }

    private final defpackage.rva g() {
        defpackage.rva rvaVar = (defpackage.rva) this.a.get();
        if (rvaVar != null) {
            return rvaVar;
        }
        throw new java.lang.IllegalStateException("MediaSourceFlowController has not been initialized.");
    }

    @Override // defpackage.rva
    public final int a() {
        defpackage.rva rvaVar = (defpackage.rva) this.a.get();
        if (rvaVar != null) {
            return rvaVar.a();
        }
        return 0;
    }

    @Override // defpackage.rva
    public final void b(java.io.PrintWriter printWriter) {
        defpackage.rva rvaVar = (defpackage.rva) this.a.get();
        if (rvaVar != null) {
            rvaVar.b(printWriter);
        }
    }

    @Override // defpackage.rva
    public final void c() {
        defpackage.rva rvaVar = (defpackage.rva) this.a.get();
        if (rvaVar != null) {
            rvaVar.c();
        }
    }

    @Override // defpackage.rva
    public final void d(java.util.List list) {
        g().d(list);
    }

    @Override // defpackage.rva
    public final void e() {
        g().e();
    }

    @Override // defpackage.rva
    public final boolean f() throws java.lang.InterruptedException {
        return g().f();
    }
}
