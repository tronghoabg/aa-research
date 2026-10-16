package od;

import a2.C1323c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import md.AbstractC3541i;
import md.C3535c;
import md.C3549q;

/* loaded from: classes5.dex */
public final class H implements U0 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f41570c;

    /* renamed from: d, reason: collision with root package name */
    public final md.n0 f41571d;

    /* renamed from: e, reason: collision with root package name */
    public F f41572e;

    /* renamed from: f, reason: collision with root package name */
    public F f41573f;

    /* renamed from: g, reason: collision with root package name */
    public F f41574g;

    /* renamed from: h, reason: collision with root package name */
    public C1323c f41575h;

    /* renamed from: j, reason: collision with root package name */
    public md.k0 f41577j;
    public md.M k;

    /* renamed from: l, reason: collision with root package name */
    public long f41578l;

    /* renamed from: a, reason: collision with root package name */
    public final md.F f41568a = md.F.a(H.class, null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f41569b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Collection f41576i = new LinkedHashSet();

    public H(Executor executor, md.n0 n0Var) {
        this.f41570c = executor;
        this.f41571d = n0Var;
    }

    @Override // od.U0
    public final void a(md.k0 k0Var) {
        Collection<G> collection;
        F f10;
        d(k0Var);
        synchronized (this.f41569b) {
            try {
                collection = this.f41576i;
                f10 = this.f41574g;
                this.f41574g = null;
                if (!collection.isEmpty()) {
                    this.f41576i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f10 != null) {
            for (G g9 : collection) {
                J jQ = g9.q(new S(k0Var, EnumC3721s.f42083b, g9.f41561l));
                if (jQ != null) {
                    jQ.run();
                }
            }
            this.f41571d.execute(f10);
        }
    }

    @Override // od.InterfaceC3727u
    public final r c(F6.r rVar, md.b0 b0Var, C3535c c3535c, AbstractC3541i[] abstractC3541iArr) {
        r s10;
        try {
            C3709n1 c3709n1 = new C3709n1(rVar, b0Var, c3535c);
            md.M m10 = null;
            long j8 = -1;
            while (true) {
                synchronized (this.f41569b) {
                    md.k0 k0Var = this.f41577j;
                    if (k0Var == null) {
                        md.M m11 = this.k;
                        if (m11 != null) {
                            if (m10 != null && j8 == this.f41578l) {
                                s10 = g(c3709n1, abstractC3541iArr);
                                break;
                            }
                            j8 = this.f41578l;
                            InterfaceC3727u interfaceC3727uF = AbstractC3669a0.f(m11.a(c3709n1), Boolean.TRUE.equals(c3535c.f40625f));
                            if (interfaceC3727uF != null) {
                                s10 = interfaceC3727uF.c(c3709n1.f42022c, c3709n1.f42021b, c3709n1.f42020a, abstractC3541iArr);
                                break;
                            }
                            m10 = m11;
                        } else {
                            s10 = g(c3709n1, abstractC3541iArr);
                            break;
                        }
                    } else {
                        s10 = new S(k0Var, EnumC3721s.f42082a, abstractC3541iArr);
                        break;
                    }
                }
            }
            return s10;
        } finally {
            this.f41571d.b();
        }
    }

    @Override // od.U0
    public final void d(md.k0 k0Var) {
        F f10;
        synchronized (this.f41569b) {
            try {
                if (this.f41577j != null) {
                    return;
                }
                this.f41577j = k0Var;
                this.f41571d.c(new RunnableC3666A(5, this, k0Var));
                if (!h() && (f10 = this.f41574g) != null) {
                    this.f41571d.c(f10);
                    this.f41574g = null;
                }
                this.f41571d.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // od.U0
    public final Runnable e(T0 t02) {
        C1323c c1323c = (C1323c) t02;
        this.f41575h = c1323c;
        this.f41572e = new F(c1323c, 0);
        this.f41573f = new F(c1323c, 1);
        this.f41574g = new F(c1323c, 2);
        return null;
    }

    @Override // md.E
    public final md.F f() {
        return this.f41568a;
    }

    public final G g(C3709n1 c3709n1, AbstractC3541i[] abstractC3541iArr) {
        int size;
        G g9 = new G(this, c3709n1, abstractC3541iArr);
        this.f41576i.add(g9);
        synchronized (this.f41569b) {
            size = this.f41576i.size();
        }
        if (size == 1) {
            this.f41571d.c(this.f41572e);
        }
        for (AbstractC3541i abstractC3541i : abstractC3541iArr) {
            abstractC3541i.a();
        }
        return g9;
    }

    public final boolean h() {
        boolean z2;
        synchronized (this.f41569b) {
            z2 = !this.f41576i.isEmpty();
        }
        return z2;
    }

    public final void i(md.M m10) {
        F f10;
        synchronized (this.f41569b) {
            this.k = m10;
            this.f41578l++;
            if (m10 != null && h()) {
                ArrayList arrayList = new ArrayList(this.f41576i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    G g9 = (G) it.next();
                    md.K kA = m10.a(g9.f41560j);
                    C3535c c3535c = g9.f41560j.f42020a;
                    InterfaceC3727u interfaceC3727uF = AbstractC3669a0.f(kA, Boolean.TRUE.equals(c3535c.f40625f));
                    if (interfaceC3727uF != null) {
                        Executor executor = this.f41570c;
                        Executor executor2 = c3535c.f40621b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        C3549q c3549q = g9.k;
                        C3549q c3549qA = c3549q.a();
                        try {
                            C3709n1 c3709n1 = g9.f41560j;
                            r rVarC = interfaceC3727uF.c(c3709n1.f42022c, c3709n1.f42021b, c3709n1.f42020a, g9.f41561l);
                            c3549q.c(c3549qA);
                            J jQ = g9.q(rVarC);
                            if (jQ != null) {
                                executor.execute(jQ);
                            }
                            arrayList2.add(g9);
                        } catch (Throwable th) {
                            c3549q.c(c3549qA);
                            throw th;
                        }
                    }
                }
                synchronized (this.f41569b) {
                    try {
                        if (h()) {
                            this.f41576i.removeAll(arrayList2);
                            if (this.f41576i.isEmpty()) {
                                this.f41576i = new LinkedHashSet();
                            }
                            if (!h()) {
                                this.f41571d.c(this.f41573f);
                                if (this.f41577j != null && (f10 = this.f41574g) != null) {
                                    this.f41571d.c(f10);
                                    this.f41574g = null;
                                }
                            }
                            this.f41571d.b();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
