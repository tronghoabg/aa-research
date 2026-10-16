package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jee extends defpackage.jbq {
    private static final defpackage.yqk b = defpackage.omv.n("GH.CAR.ProxyEP");
    public final defpackage.jdc a;
    private final defpackage.jdc c;
    private final defpackage.jbq d;
    private volatile defpackage.jcz e;
    private final defpackage.mbt f;

    public jee(defpackage.jbq jbqVar, defpackage.mbt mbtVar, defpackage.jdc jdcVar, defpackage.jdc jdcVar2) {
        super(jbqVar.u, null, null, jbqVar.v);
        this.a = jdcVar;
        this.c = jdcVar2;
        this.d = jbqVar;
        this.f = mbtVar;
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void P(int i) {
        defpackage.jcz jczVar = this.e;
        if (defpackage.jdc.a == this.c && jczVar != null && !((defpackage.jec) jczVar).b.f(((defpackage.jbe) jczVar).a, i)) {
            defpackage.jec.d.g().ai(1930).u("Forward throttled, dropping control packet");
        }
        this.d.P(i);
    }

    @Override // defpackage.jbq, defpackage.izg
    public final void Q() {
        if (defpackage.jdc.a == this.c) {
            defpackage.jcz jczVar = this.e;
            jczVar.getClass();
            defpackage.jdg jdgVar = ((defpackage.jec) jczVar).b;
            int i = ((defpackage.jbe) jczVar).a;
            if (!jdgVar.g(i) && i != 0) {
                defpackage.jec.d.g().ai(1932).u("Forward throttled, dropping control packet");
            }
        }
        this.d.Q();
    }

    @Override // defpackage.jbq, defpackage.ize
    public final void R(int i) {
        this.d.R(i);
    }

    @Override // defpackage.jbq, defpackage.ize
    public final void S(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.capacity());
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            byteBufferAllocate.put(byteBuffer);
            byteBufferAllocate.order(byteBuffer.order());
            byteBufferAllocate.position(iPosition);
            byteBufferAllocate.limit(iLimit);
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            if (!this.t) {
                super.S(byteBuffer);
                this.d.S(byteBufferAllocate);
                return;
            }
            defpackage.ypu ypuVarAi = b.h().ai(1936);
            defpackage.izv izvVar = this.w;
            izvVar.getClass();
            ypuVarAi.B("Dropping %d:%d. We are quitting.", ((defpackage.izk) izvVar).b, byteBuffer.remaining());
        } catch (java.lang.Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    @Override // defpackage.jbq
    protected final void a(int i, java.nio.ByteBuffer byteBuffer) {
        defpackage.jcz jczVar = this.e;
        if (this.t) {
            defpackage.ypu ypuVarAi = b.h().ai(1935);
            defpackage.izv izvVar = this.w;
            izvVar.getClass();
            ypuVarAi.B("Dropping %d:%d. We are quitting.", ((defpackage.izk) izvVar).b, byteBuffer.remaining());
            return;
        }
        if (this.c.a(i) == 1) {
            jczVar.getClass();
            defpackage.izu izuVar = new defpackage.izu(false, false, 0);
            if (((defpackage.jec) jczVar).b.e(((defpackage.jbe) jczVar).a, izuVar, i, byteBuffer)) {
                return;
            }
            defpackage.jec.d.h().ai(1933).u("Forward throttled, dropping packet");
        }
    }

    @Override // defpackage.ize
    public final void b(int i) {
        defpackage.jcz jczVar = this.e;
        if (this.t) {
            defpackage.ypu ypuVarAi = b.h().ai(1937);
            defpackage.izv izvVar = this.w;
            izvVar.getClass();
            ypuVarAi.B("Dropping callback %d:%d. We are quitting.", ((defpackage.izk) izvVar).b, i);
            return;
        }
        if (this.c == defpackage.jdc.a) {
            jczVar.getClass();
            if (!((defpackage.jec) jczVar).b.h(((defpackage.jbe) jczVar).a, i)) {
                defpackage.jec.d.g().ai(1928).u("Forward throttled, dropping control packet");
            }
        }
        this.d.b(i);
    }

    @Override // defpackage.jbq
    public final void g() {
        defpackage.jcz jczVar = this.e;
        if (jczVar != null) {
            defpackage.jbe jbeVar = (defpackage.jbe) jczVar;
            jbeVar.b.b(jbeVar.a);
            this.e = null;
        }
        super.g();
        this.d.g();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, jdg] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jbq
    public final void p(defpackage.izv izvVar) {
        this.w = izvVar;
        b.f().ai(1938).w("Proxy created for channel %d", ((defpackage.izk) izvVar).b);
        defpackage.jed jedVar = new defpackage.jed(this);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(jedVar.a());
        defpackage.mbt mbtVar = this.f;
        defpackage.jec jecVar = new defpackage.jec(mbtVar.b, jedVar, (android.os.Handler) mbtVar.a.get(numValueOf));
        jecVar.b.a(jecVar.a, jecVar);
        this.e = jecVar;
        this.d.p(izvVar);
    }
}
