package od;

import ad.C1355I;
import cg.C1618g;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import md.AbstractC3537e;
import md.C3535c;
import md.C3551t;

/* renamed from: od.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3671b extends S1 implements r {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f41916i = Logger.getLogger(AbstractC3671b.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public final a2 f41917c;

    /* renamed from: d, reason: collision with root package name */
    public final W f41918d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41919e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41920f;

    /* renamed from: g, reason: collision with root package name */
    public md.b0 f41921g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f41922h;

    public AbstractC3671b(C1355I c1355i, W1 w12, a2 a2Var, md.b0 b0Var, C3535c c3535c, boolean z2) {
        Fe.e.t(b0Var, "headers");
        Fe.e.t(a2Var, "transportTracer");
        this.f41917c = a2Var;
        this.f41919e = !Boolean.TRUE.equals(c3535c.a(AbstractC3669a0.f41897n));
        this.f41920f = z2;
        if (!z2) {
            this.f41918d = new Z0(this, c1355i, w12);
            this.f41921g = b0Var;
            return;
        }
        M.y yVar = new M.y();
        yVar.f7230e = this;
        Fe.e.t(b0Var, "headers");
        yVar.f7227b = b0Var;
        yVar.f7228c = w12;
        this.f41918d = yVar;
    }

    @Override // od.r
    public final void b(int i5) {
        this.f41918d.b(i5);
    }

    @Override // od.r
    public final void e(int i5) {
        ((pd.k) this).f43536n.f41870a.f41826b = i5;
    }

    @Override // od.r
    public final void f(md.r rVar) {
        md.b0 b0Var = this.f41921g;
        md.W w2 = AbstractC3669a0.f41887c;
        b0Var.a(w2);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f41921g.f(w2, Long.valueOf(Math.max(0L, rVar.b())));
    }

    @Override // od.r
    public final void g(md.k0 k0Var) {
        Fe.e.p("Should not cancel with OK status", !k0Var.f());
        this.f41922h = true;
        ad.L l10 = ((pd.k) this).f43537o;
        l10.getClass();
        Xd.b.c();
        try {
            synchronized (((pd.k) l10.f17515b).f43536n.f43528w) {
                ((pd.k) l10.f17515b).f43536n.m(k0Var, true, null);
            }
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // od.r
    public final void i(N.J0 j02) {
        j02.c(((pd.k) this).f43538p.f40613a.get(AbstractC3537e.f40634a), "remote_addr");
    }

    @Override // od.X1
    public final boolean isReady() {
        return ((pd.k) this).f43536n.e() && !this.f41922h;
    }

    @Override // od.r
    public final void j() {
        pd.k kVar = (pd.k) this;
        if (kVar.f43536n.f41882n) {
            return;
        }
        kVar.f43536n.f41882n = true;
        this.f41918d.close();
    }

    @Override // od.r
    public final void k(InterfaceC3724t interfaceC3724t) {
        pd.k kVar = (pd.k) this;
        pd.j jVar = kVar.f43536n;
        Fe.e.w("Already called setListener", jVar.f41879j == null);
        Fe.e.t(interfaceC3724t, "listener");
        jVar.f41879j = interfaceC3724t;
        if (this.f41920f) {
            return;
        }
        kVar.f43537o.w(this.f41921g, null);
        this.f41921g = null;
    }

    @Override // od.r
    public final void l(C3551t c3551t) {
        pd.j jVar = ((pd.k) this).f43536n;
        Fe.e.w("Already called start", jVar.f41879j == null);
        Fe.e.t(c3551t, "decompressorRegistry");
        jVar.k = c3551t;
    }

    public final void u(pd.t tVar, boolean z2, boolean z10, int i5) {
        C1618g c1618g;
        Fe.e.p("null frame before EOS", tVar != null || z2);
        ad.L l10 = ((pd.k) this).f43537o;
        l10.getClass();
        Xd.b.c();
        try {
            if (tVar == null) {
                c1618g = pd.k.f43532r;
            } else {
                c1618g = tVar.f43600a;
                int i10 = (int) c1618g.f19902b;
                if (i10 > 0) {
                    pd.k.v((pd.k) l10.f17515b, i10);
                }
            }
            synchronized (((pd.k) l10.f17515b).f43536n.f43528w) {
                pd.j.l(((pd.k) l10.f17515b).f43536n, c1618g, z2, z10);
                a2 a2Var = ((pd.k) l10.f17515b).f41917c;
                if (i5 == 0) {
                    a2Var.getClass();
                } else {
                    a2Var.getClass();
                    ((Y1) a2Var.f41914b).d();
                }
            }
            Xd.b.f16226a.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
