package defpackage;

import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jdn implements jdq {
    private final AtomicReference a = new AtomicReference();
    private final jdo b;

    public jdn(jdo jdoVar) {
        this.b = jdoVar;
    }

    @Override // defpackage.jdl
    public final int a() {
        jdl jdlVar = (jdl) this.a.get();
        if (jdlVar != null) {
            return jdlVar.a();
        }
        return 0;
    }

    @Override // defpackage.jdl
    public final void b(PrintWriter printWriter) {
        jdl jdlVar = (jdl) this.a.get();
        if (jdlVar != null) {
            jdlVar.b(printWriter);
        }
    }

    @Override // defpackage.jdl
    public final void c() {
        jdl jdlVar = (jdl) this.a.get();
        if (jdlVar != null) {
            jdlVar.c();
        }
    }

    @Override // defpackage.jdl
    public final void d(List list) {
        i().d(list);
    }

    @Override // defpackage.jdl
    public final void e(int i) {
        i().e(i);
    }

    @Override // defpackage.jdl
    public final void f() {
        i().f();
    }

    @Override // defpackage.jdl
    public final boolean g() throws InterruptedException {
        return i().g();
    }

    @Override // defpackage.jdq
    public final void h(int i) {
        jdo jdoVar = this.b;
        int i2 = jdoVar.e;
        if (!a.p(this.a, new jdp(jdoVar.a, jdoVar.d, i, i2, jdoVar.b, jdoVar.c))) {
            throw new IllegalStateException("initialize should not be called more than once.");
        }
    }

    final jdl i() {
        jdl jdlVar = (jdl) this.a.get();
        if (jdlVar != null) {
            return jdlVar;
        }
        throw new IllegalStateException("MediaSourceFlowController has not been initialized.");
    }
}
