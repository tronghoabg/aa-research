package od;

import Va.X7;
import ba.C1521a;
import g5.RunnableC2707d;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import md.AbstractC3537e;
import md.C3530B;
import md.C3534b;
import md.EnumC3529A;

/* loaded from: classes5.dex */
public final class L0 extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final Dd.c f41630d;

    /* renamed from: e, reason: collision with root package name */
    public final md.F f41631e;

    /* renamed from: f, reason: collision with root package name */
    public final C3698k f41632f;

    /* renamed from: g, reason: collision with root package name */
    public final C3704m f41633g;

    /* renamed from: h, reason: collision with root package name */
    public List f41634h;

    /* renamed from: i, reason: collision with root package name */
    public C3711o0 f41635i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41636j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public C1521a f41637l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0 f41638m;

    public L0(M0 m02, Dd.c cVar) {
        this.f41638m = m02;
        List list = (List) cVar.f2642b;
        this.f41634h = list;
        m02.getClass();
        this.f41630d = cVar;
        md.F f10 = new md.F("Subchannel", m02.f41699t.g(), md.F.f40572d.incrementAndGet());
        this.f41631e = f10;
        Y1 y12 = m02.f41691l;
        C3704m c3704m = new C3704m(f10, y12.d(), "Subchannel for " + list);
        this.f41633g = c3704m;
        this.f41632f = new C3698k(c3704m, y12);
    }

    @Override // md.AbstractC3537e
    public final List b() {
        this.f41638m.f41692m.e();
        Fe.e.w("not started", this.f41636j);
        return this.f41634h;
    }

    @Override // md.AbstractC3537e
    public final C3534b c() {
        return (C3534b) this.f41630d.f2643c;
    }

    @Override // md.AbstractC3537e
    public final AbstractC3537e d() {
        return this.f41632f;
    }

    @Override // md.AbstractC3537e
    public final Object e() {
        Fe.e.w("Subchannel is not started", this.f41636j);
        return this.f41635i;
    }

    @Override // md.AbstractC3537e
    public final void o() {
        this.f41638m.f41692m.e();
        Fe.e.w("not started", this.f41636j);
        C3711o0 c3711o0 = this.f41635i;
        if (c3711o0.f42046v != null) {
            return;
        }
        c3711o0.k.execute(new RunnableC3690h0(c3711o0, 1));
    }

    @Override // md.AbstractC3537e
    public final void p() {
        C1521a c1521a;
        M0 m02 = this.f41638m;
        m02.f41692m.e();
        if (this.f41635i == null) {
            this.k = true;
            return;
        }
        if (!this.k) {
            this.k = true;
        } else {
            if (!m02.f41661I || (c1521a = this.f41637l) == null) {
                return;
            }
            c1521a.j();
            this.f41637l = null;
        }
        if (!m02.f41661I) {
            this.f41637l = m02.f41692m.d(new RunnableC3731v0(new RunnableC2707d(this, 10)), 5L, TimeUnit.SECONDS, m02.f41686f.f41993a.f43492d);
            return;
        }
        C3711o0 c3711o0 = this.f41635i;
        md.k0 k0Var = M0.f41648g0;
        c3711o0.getClass();
        c3711o0.k.execute(new RunnableC3693i0(c3711o0, k0Var, 0));
    }

    @Override // md.AbstractC3537e
    public final void q(md.N n10) {
        M0 m02 = this.f41638m;
        m02.f41692m.e();
        Fe.e.w("already started", !this.f41636j);
        Fe.e.w("already shutdown", !this.k);
        Fe.e.w("Channel is being terminated", !m02.f41661I);
        this.f41636j = true;
        List list = (List) this.f41630d.f2642b;
        String strG = m02.f41699t.g();
        C3695j c3695j = m02.f41686f;
        ScheduledExecutorService scheduledExecutorService = c3695j.f41993a.f43492d;
        a2 a2Var = new a2(3, this, n10);
        m02.L.getClass();
        C3711o0 c3711o0 = new C3711o0(list, strG, m02.f41698s, c3695j, scheduledExecutorService, m02.f41695p, m02.f41692m, a2Var, m02.f41667P, new X7(), this.f41633g, this.f41631e, this.f41632f, m02.f41700u);
        m02.f41665N.b(new C3530B("Child Subchannel started", EnumC3529A.f40558a, m02.f41691l.d(), c3711o0));
        this.f41635i = c3711o0;
        m02.f41653A.add(c3711o0);
    }

    @Override // md.AbstractC3537e
    public final void r(List list) {
        this.f41638m.f41692m.e();
        this.f41634h = list;
        C3711o0 c3711o0 = this.f41635i;
        c3711o0.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fe.e.t(it.next(), "newAddressGroups contains null entry");
        }
        Fe.e.p("newAddressGroups is empty", !list.isEmpty());
        c3711o0.k.execute(new RunnableC3666A(14, c3711o0, DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    public final String toString() {
        return this.f41631e.toString();
    }
}
