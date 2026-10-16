package defpackage;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class jdt implements iyw, jbo {
    private final int a;
    private final rro b;

    public jdt(int i, rro rroVar) {
        this.a = i;
        this.b = rroVar;
    }

    @Override // defpackage.jbo
    public final iyw a(xnz xnzVar) {
        if (xnzVar.c == this.a) {
            return this;
        }
        return null;
    }

    @Override // defpackage.iyw
    public final jbj b(jbn jbnVar) {
        return new jds(this.b.a(), this, jbnVar);
    }

    @Override // defpackage.iyw
    public final jcv c() {
        return jcv.a;
    }

    @Override // defpackage.iyw
    public final jcv d() {
        return jcv.a;
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
    }
}
