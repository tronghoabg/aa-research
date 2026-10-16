package od;

import A7.RunnableC0299w0;
import g5.RunnableC2707d;
import java.util.concurrent.ScheduledExecutorService;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.EnumC3545m;

/* loaded from: classes5.dex */
public final class E0 extends AbstractC3556y {

    /* renamed from: a, reason: collision with root package name */
    public S3.n f41548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M0 f41549b;

    public E0(M0 m02) {
        this.f41549b = m02;
    }

    @Override // md.AbstractC3556y
    public final AbstractC3537e b(Dd.c cVar) {
        M0 m02 = this.f41549b;
        m02.f41692m.e();
        Fe.e.w("Channel is being terminated", !m02.f41661I);
        return new L0(m02, cVar);
    }

    @Override // md.AbstractC3556y
    public final AbstractC3537e d() {
        return this.f41549b.f41666O;
    }

    @Override // md.AbstractC3556y
    public final ScheduledExecutorService e() {
        return this.f41549b.f41687g;
    }

    @Override // md.AbstractC3556y
    public final md.n0 g() {
        return this.f41549b.f41692m;
    }

    @Override // md.AbstractC3556y
    public final void i() {
        M0 m02 = this.f41549b;
        m02.f41692m.e();
        m02.f41692m.execute(new RunnableC2707d(this, 9));
    }

    @Override // md.AbstractC3556y
    public final void l(EnumC3545m enumC3545m, md.M m10) {
        M0 m02 = this.f41549b;
        m02.f41692m.e();
        Fe.e.t(enumC3545m, "newState");
        Fe.e.t(m10, "newPicker");
        m02.f41692m.execute(new RunnableC0299w0(this, m10, enumC3545m, 29));
    }
}
