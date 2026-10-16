package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jdx extends jbj {
    private static final ypf b = ols.R("GH.CAR.ProxyEP");
    public final jcv a;
    private final jcv c;
    private final jbj d;
    private volatile jcs e;
    private final fbf f;

    public jdx(jbj jbjVar, fbf fbfVar, jcv jcvVar, jcv jcvVar2) {
        super(jbjVar.u, null, null, jbjVar.v);
        this.a = jcvVar;
        this.c = jcvVar2;
        this.d = jbjVar;
        this.f = fbfVar;
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void P(int i) {
        jcs jcsVar = this.e;
        if (jcv.a == this.c && jcsVar != null && !((jdv) jcsVar).b.f(((jax) jcsVar).a, i)) {
            jdv.d.g().ai(1930).u("Forward throttled, dropping control packet");
        }
        this.d.P(i);
    }

    @Override // defpackage.jbj, defpackage.iyz
    public final void Q() {
        if (jcv.a == this.c) {
            jcs jcsVar = this.e;
            jcsVar.getClass();
            jcz jczVar = ((jdv) jcsVar).b;
            int i = ((jax) jcsVar).a;
            if (!jczVar.g(i) && i != 0) {
                jdv.d.g().ai(1932).u("Forward throttled, dropping control packet");
            }
        }
        this.d.Q();
    }

    @Override // defpackage.jbj, defpackage.iyx
    public final void R(int i) {
        this.d.R(i);
    }

    @Override // defpackage.jbj, defpackage.iyx
    public final void S(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
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
            yop yopVarAi = b.h().ai(1936);
            izo izoVar = this.w;
            izoVar.getClass();
            yopVarAi.B("Dropping %d:%d. We are quitting.", ((izd) izoVar).b, byteBuffer.remaining());
        } catch (Throwable th) {
            byteBuffer.position(iPosition);
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    @Override // defpackage.jbj
    protected final void a(int i, ByteBuffer byteBuffer) {
        jcs jcsVar = this.e;
        if (this.t) {
            yop yopVarAi = b.h().ai(1935);
            izo izoVar = this.w;
            izoVar.getClass();
            yopVarAi.B("Dropping %d:%d. We are quitting.", ((izd) izoVar).b, byteBuffer.remaining());
            return;
        }
        if (this.c.a(i) == 1) {
            jcsVar.getClass();
            izn iznVar = new izn(false, false, 0);
            if (((jdv) jcsVar).b.e(((jax) jcsVar).a, iznVar, i, byteBuffer)) {
                return;
            }
            jdv.d.h().ai(1933).u("Forward throttled, dropping packet");
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
        jcs jcsVar = this.e;
        if (this.t) {
            yop yopVarAi = b.h().ai(1937);
            izo izoVar = this.w;
            izoVar.getClass();
            yopVarAi.B("Dropping callback %d:%d. We are quitting.", ((izd) izoVar).b, i);
            return;
        }
        if (this.c == jcv.a) {
            jcsVar.getClass();
            if (!((jdv) jcsVar).b.h(((jax) jcsVar).a, i)) {
                jdv.d.g().ai(1928).u("Forward throttled, dropping control packet");
            }
        }
        this.d.b(i);
    }

    @Override // defpackage.jbj
    public final void g() {
        jcs jcsVar = this.e;
        if (jcsVar != null) {
            jax jaxVar = (jax) jcsVar;
            jaxVar.b.b(jaxVar.a);
            this.e = null;
        }
        super.g();
        this.d.g();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, jcz] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.jbj
    public final void p(izo izoVar) {
        this.w = izoVar;
        b.f().ai(1938).w("Proxy created for channel %d", ((izd) izoVar).b);
        jdw jdwVar = new jdw(this);
        Integer numValueOf = Integer.valueOf(jdwVar.a());
        fbf fbfVar = this.f;
        jdv jdvVar = new jdv(fbfVar.a, jdwVar, (Handler) fbfVar.b.get(numValueOf));
        jdvVar.b.a(jdvVar.a, jdvVar);
        this.e = jdvVar;
        this.d.p(izoVar);
    }
}
