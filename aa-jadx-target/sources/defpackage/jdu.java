package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jdu implements defpackage.jdx {
    private final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();
    private final defpackage.jdv b;

    public jdu(defpackage.jdv jdvVar) {
        this.b = jdvVar;
    }

    @Override // defpackage.jds
    public final int a() {
        defpackage.jds jdsVar = (defpackage.jds) this.a.get();
        if (jdsVar != null) {
            return jdsVar.a();
        }
        return 0;
    }

    @Override // defpackage.jds
    public final void b(java.io.PrintWriter printWriter) {
        defpackage.jds jdsVar = (defpackage.jds) this.a.get();
        if (jdsVar != null) {
            jdsVar.b(printWriter);
        }
    }

    @Override // defpackage.jds
    public final void c() {
        defpackage.jds jdsVar = (defpackage.jds) this.a.get();
        if (jdsVar != null) {
            jdsVar.c();
        }
    }

    @Override // defpackage.jds
    public final void d(java.util.List list) {
        i().d(list);
    }

    @Override // defpackage.jds
    public final void e(int i) {
        i().e(i);
    }

    @Override // defpackage.jds
    public final void f() {
        i().f();
    }

    @Override // defpackage.jds
    public final boolean g() throws java.lang.InterruptedException {
        return i().g();
    }

    @Override // defpackage.jdx
    public final void h(int i) {
        defpackage.jdv jdvVar = this.b;
        int i2 = jdvVar.e;
        if (!defpackage.a.o(this.a, new defpackage.jdw(jdvVar.a, jdvVar.d, i, i2, jdvVar.b, jdvVar.c))) {
            throw new java.lang.IllegalStateException("initialize should not be called more than once.");
        }
    }

    final defpackage.jds i() {
        defpackage.jds jdsVar = (defpackage.jds) this.a.get();
        if (jdsVar != null) {
            return jdsVar;
        }
        throw new java.lang.IllegalStateException("MediaSourceFlowController has not been initialized.");
    }
}
