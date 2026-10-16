package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class jdu implements iyw {
    public final iyw a;
    private final jcu b;
    private final jcu c;
    private final fbf d;

    public jdu(iyw iywVar, jcu jcuVar, jcu jcuVar2, fbf fbfVar) {
        this.a = iywVar;
        this.b = jcuVar;
        this.c = jcuVar2;
        this.d = fbfVar;
    }

    private static final jcv a(jcu jcuVar, jbj jbjVar, xyc xycVar) {
        return jcuVar != jcv.c ? jcuVar.a(jbjVar) : (jcv) xycVar.gu();
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        jbj jbjVarB = this.a.b(jbnVar);
        if (jbjVarB == null) {
            return null;
        }
        return new jdx(jbjVarB, this.d, a(this.b, jbjVarB, new ilk(this, 10)), a(this.c, jbjVarB, new ilk(this, 11)));
    }

    @Override // defpackage.iyw
    public final jcv c() {
        throw new UnsupportedOperationException("Should not be wrapping a Proxy Car Service");
    }

    @Override // defpackage.iyw
    public final jcv d() {
        throw new UnsupportedOperationException("Should not be wrapping a Proxy Car Service");
    }

    @Override // defpackage.iyw
    public final void m(PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.iyw
    public final void q() {
        throw null;
    }

    @Override // defpackage.iyw
    public final void r(jbj jbjVar) {
        this.a.r(jbjVar);
    }
}
