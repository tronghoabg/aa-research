package od;

import R8.C0805a;
import java.util.concurrent.Executor;
import md.AbstractC3532D;
import md.AbstractC3537e;
import md.AbstractC3538f;
import md.AbstractC3555x;
import md.C3535c;
import md.C3549q;

/* loaded from: classes5.dex */
public final class C0 extends AbstractC3555x {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3532D f41524a;

    /* renamed from: b, reason: collision with root package name */
    public final G0 f41525b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f41526c;

    /* renamed from: d, reason: collision with root package name */
    public final F6.r f41527d;

    /* renamed from: e, reason: collision with root package name */
    public final C3549q f41528e;

    /* renamed from: f, reason: collision with root package name */
    public C3535c f41529f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC3538f f41530g;

    public C0(AbstractC3532D abstractC3532D, G0 g02, Executor executor, F6.r rVar, C3535c c3535c) {
        this.f41524a = abstractC3532D;
        this.f41525b = g02;
        this.f41527d = rVar;
        Executor executor2 = c3535c.f40621b;
        executor = executor2 != null ? executor2 : executor;
        this.f41526c = executor;
        C0805a c0805aB = C3535c.b(c3535c);
        c0805aB.f10437b = executor;
        this.f41529f = new C3535c(c0805aB);
        this.f41528e = C3549q.b();
    }

    @Override // md.AbstractC3555x, md.AbstractC3538f
    public final void a(String str, Throwable th) {
        AbstractC3538f abstractC3538f = this.f41530g;
        if (abstractC3538f != null) {
            abstractC3538f.a(str, th);
        }
    }

    @Override // md.AbstractC3555x, md.AbstractC3538f
    public final void e(AbstractC3537e abstractC3537e, md.b0 b0Var) {
        C3535c c3535c = this.f41529f;
        F6.r rVar = this.f41527d;
        Fe.e.t(rVar, "method");
        Fe.e.t(c3535c, "callOptions");
        X2.j jVarA = this.f41524a.a();
        md.k0 k0Var = (md.k0) jVarA.f16075b;
        if (!k0Var.f()) {
            this.f41526c.execute(new D(this, abstractC3537e, AbstractC3669a0.h(k0Var)));
            this.f41530g = M0.f41652k0;
            return;
        }
        S0 s02 = (S0) jVarA.f16076c;
        s02.getClass();
        Q0 q02 = (Q0) s02.f41802b.get((String) rVar.f4012c);
        if (q02 == null) {
            q02 = (Q0) s02.f41803c.get((String) rVar.f4013d);
        }
        if (q02 == null) {
            q02 = s02.f41801a;
        }
        if (q02 != null) {
            this.f41529f = this.f41529f.c(Q0.f41785g, q02);
        }
        AbstractC3538f abstractC3538fH = this.f41525b.h(rVar, this.f41529f);
        this.f41530g = abstractC3538fH;
        abstractC3538fH.e(abstractC3537e, b0Var);
    }

    @Override // md.AbstractC3555x
    public final AbstractC3538f f() {
        return this.f41530g;
    }
}
