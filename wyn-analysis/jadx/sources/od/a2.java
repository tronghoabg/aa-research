package od;

import A7.C0237b0;
import A7.RunnableC0285r1;
import E5.C0441b;
import Va.X7;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class a2 implements InterfaceC3724t {

    /* renamed from: d, reason: collision with root package name */
    public static final Y1 f41912d = new Y1(16);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41913a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41914b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f41915c;

    public /* synthetic */ a2(int i5, Object obj, Object obj2) {
        this.f41913a = i5;
        this.f41915c = obj;
        this.f41914b = obj2;
    }

    @Override // od.InterfaceC3724t
    public void e(L4.g gVar) {
        switch (this.f41913a) {
            case 2:
                ((InterfaceC3724t) this.f41914b).e(gVar);
                break;
            default:
                D1 d12 = ((B0) this.f41915c).f41508o;
                Fe.e.w("Headers should be received prior to messages.", d12.f41542f != null);
                if (d12.f41542f == ((G1) this.f41914b)) {
                    ((B0) this.f41915c).f41497c.execute(new RunnableC3666A(23, this, gVar));
                    break;
                } else {
                    Logger logger = AbstractC3669a0.f41885a;
                    while (true) {
                        InputStream inputStreamA = gVar.a();
                        if (inputStreamA == null) {
                            break;
                        } else {
                            AbstractC3669a0.b(inputStreamA);
                        }
                    }
                }
        }
    }

    @Override // od.InterfaceC3724t
    public void f(md.b0 b0Var) {
        AtomicInteger atomicInteger;
        int i5;
        int i10;
        switch (this.f41913a) {
            case 2:
                ((InterfaceC3724t) this.f41914b).f(b0Var);
                break;
            default:
                if (((G1) this.f41914b).f41567d > 0) {
                    md.W w2 = B0.f41487E;
                    b0Var.a(w2);
                    b0Var.f(w2, String.valueOf(((G1) this.f41914b).f41567d));
                }
                B0 b02 = (B0) this.f41915c;
                G1 g12 = (G1) this.f41914b;
                md.W w3 = B0.f41487E;
                RunnableC0285r1 runnableC0285r1N = b02.n(g12);
                if (runnableC0285r1N != null) {
                    b02.f41496b.execute(runnableC0285r1N);
                }
                if (((B0) this.f41915c).f41508o.f41542f == ((G1) this.f41914b)) {
                    H1 h12 = ((B0) this.f41915c).f41506m;
                    if (h12 != null) {
                        do {
                            atomicInteger = h12.f41584d;
                            i5 = atomicInteger.get();
                            i10 = h12.f41581a;
                            if (i5 == i10) {
                            }
                        } while (!atomicInteger.compareAndSet(i5, Math.min(h12.f41583c + i5, i10)));
                    }
                    ((B0) this.f41915c).f41497c.execute(new RunnableC3666A(22, this, b0Var));
                    break;
                }
                break;
        }
    }

    @Override // od.InterfaceC3724t
    public void h() {
        switch (this.f41913a) {
            case 2:
                ((InterfaceC3724t) this.f41914b).h();
                break;
            default:
                B0 b02 = (B0) this.f41915c;
                if (b02.isReady()) {
                    b02.f41497c.execute(new F1(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // od.InterfaceC3724t
    public void m(md.k0 k0Var, EnumC3721s enumC3721s, md.b0 b0Var) throws NumberFormatException {
        boolean z2;
        j.E e7;
        B0 b02;
        C0441b c0441b;
        switch (this.f41913a) {
            case 2:
                X7 x72 = ((C3696j0) this.f41915c).f41996b.f42001b;
                if (k0Var.f()) {
                    ((InterfaceC3734w0) x72.f13843c).a();
                } else {
                    ((InterfaceC3734w0) x72.f13844d).a();
                }
                ((InterfaceC3724t) this.f41914b).m(k0Var, enumC3721s, b0Var);
                return;
            default:
                synchronized (((B0) this.f41915c).f41503i) {
                    B0 b03 = (B0) this.f41915c;
                    b03.f41508o = b03.f41508o.d((G1) this.f41914b);
                    ((B0) this.f41915c).f41507n.f7714b.add(String.valueOf(k0Var.f40685a));
                }
                if (((B0) this.f41915c).f41511r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((B0) this.f41915c).f41497c.execute(new F1(this, 0));
                    return;
                }
                G1 g12 = (G1) this.f41914b;
                if (g12.f41566c) {
                    B0 b04 = (B0) this.f41915c;
                    RunnableC0285r1 runnableC0285r1N = b04.n(g12);
                    if (runnableC0285r1N != null) {
                        b04.f41496b.execute(runnableC0285r1N);
                    }
                    if (((B0) this.f41915c).f41508o.f41542f == ((G1) this.f41914b)) {
                        ((B0) this.f41915c).u(k0Var, enumC3721s, b0Var);
                        return;
                    }
                    return;
                }
                EnumC3721s enumC3721s2 = EnumC3721s.f42085d;
                if (enumC3721s == enumC3721s2 && ((B0) this.f41915c).f41510q.incrementAndGet() > 1000) {
                    B0 b05 = (B0) this.f41915c;
                    RunnableC0285r1 runnableC0285r1N2 = b05.n((G1) this.f41914b);
                    if (runnableC0285r1N2 != null) {
                        b05.f41496b.execute(runnableC0285r1N2);
                    }
                    if (((B0) this.f41915c).f41508o.f41542f == ((G1) this.f41914b)) {
                        ((B0) this.f41915c).u(md.k0.f40681m.h("Too many transparent retries. Might be a bug in gRPC").g(k0Var.a()), enumC3721s, b0Var);
                        return;
                    }
                    return;
                }
                if (((B0) this.f41915c).f41508o.f41542f == null) {
                    if (enumC3721s == enumC3721s2 || (enumC3721s == EnumC3721s.f42083b && ((B0) this.f41915c).f41509p.compareAndSet(false, true))) {
                        G1 g1O = ((B0) this.f41915c).o(((G1) this.f41914b).f41567d, true);
                        if (g1O == null) {
                            return;
                        }
                        B0 b06 = (B0) this.f41915c;
                        if (b06.f41502h) {
                            synchronized (b06.f41503i) {
                                B0 b07 = (B0) this.f41915c;
                                b07.f41508o = b07.f41508o.c((G1) this.f41914b, g1O);
                            }
                        }
                        ((B0) this.f41915c).f41496b.execute(new E1(this, g1O, 1));
                        return;
                    }
                    if (enumC3721s == EnumC3721s.f42084c) {
                        B0 b08 = (B0) this.f41915c;
                        if (b08.f41502h) {
                            b08.r();
                        }
                    } else {
                        ((B0) this.f41915c).f41509p.set(true);
                        B0 b09 = (B0) this.f41915c;
                        Integer numValueOf = null;
                        if (b09.f41502h) {
                            String str = (String) b0Var.c(B0.f41488F);
                            if (str != null) {
                                try {
                                    numValueOf = Integer.valueOf(str);
                                } catch (NumberFormatException unused) {
                                    numValueOf = -1;
                                }
                            }
                            B0 b010 = (B0) this.f41915c;
                            boolean zContains = b010.f41501g.f41929c.contains(k0Var.f40685a);
                            boolean z10 = (b010.f41506m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !b010.f41506m.a();
                            if (zContains && !z10 && !k0Var.f() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            boolean z11 = zContains && !z10;
                            if (z11) {
                                B0.m((B0) this.f41915c, numValueOf);
                            }
                            synchronized (((B0) this.f41915c).f41503i) {
                                try {
                                    B0 b011 = (B0) this.f41915c;
                                    b011.f41508o = b011.f41508o.b((G1) this.f41914b);
                                    if (z11) {
                                        B0 b012 = (B0) this.f41915c;
                                        if (!b012.s(b012.f41508o)) {
                                            if (!((B0) this.f41915c).f41508o.f41540d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } finally {
                                }
                            }
                        } else {
                            I1 i12 = b09.f41500f;
                            long nanos = 0;
                            if (i12 == null) {
                                e7 = new j.E(false, 0L);
                            } else {
                                boolean zContains2 = i12.f41607f.contains(k0Var.f40685a);
                                String str2 = (String) b0Var.c(B0.f41488F);
                                if (str2 != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str2);
                                    } catch (NumberFormatException unused2) {
                                        numValueOf = -1;
                                    }
                                }
                                boolean z12 = (b09.f41506m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !b09.f41506m.a();
                                if (b09.f41500f.f41602a <= ((G1) this.f41914b).f41567d + 1 || z12) {
                                    z2 = false;
                                    e7 = new j.E(z2, nanos);
                                } else {
                                    if (numValueOf == null) {
                                        if (zContains2) {
                                            nanos = (long) (B0.f41490H.nextDouble() * b09.f41517x);
                                            double d3 = b09.f41517x;
                                            I1 i13 = b09.f41500f;
                                            b09.f41517x = Math.min((long) (d3 * i13.f41605d), i13.f41604c);
                                            z2 = true;
                                        }
                                        z2 = false;
                                    } else {
                                        if (numValueOf.intValue() >= 0) {
                                            nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                            b09.f41517x = b09.f41500f.f41603b;
                                            z2 = true;
                                        }
                                        z2 = false;
                                    }
                                    e7 = new j.E(z2, nanos);
                                }
                            }
                            if (e7.f38375b) {
                                G1 g1O2 = ((B0) this.f41915c).o(((G1) this.f41914b).f41567d + 1, false);
                                if (g1O2 == null) {
                                    return;
                                }
                                synchronized (((B0) this.f41915c).f41503i) {
                                    b02 = (B0) this.f41915c;
                                    c0441b = new C0441b(b02.f41503i);
                                    b02.f41515v = c0441b;
                                }
                                c0441b.m(b02.f41498d.schedule(new E1(this, g1O2, 0), e7.f38376c, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    }
                }
                B0 b013 = (B0) this.f41915c;
                RunnableC0285r1 runnableC0285r1N3 = b013.n((G1) this.f41914b);
                if (runnableC0285r1N3 != null) {
                    b013.f41496b.execute(runnableC0285r1N3);
                }
                if (((B0) this.f41915c).f41508o.f41542f == ((G1) this.f41914b)) {
                    ((B0) this.f41915c).u(k0Var, enumC3721s, b0Var);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f41913a) {
            case 2:
                C0237b0 c0237b0S = Ba.c.S(this);
                c0237b0S.f((InterfaceC3724t) this.f41914b, "delegate");
                return c0237b0S.toString();
            default:
                return super.toString();
        }
    }

    public a2() {
        this.f41913a = 0;
        Y1 y12 = Y1.f41850b;
        this.f41915c = S1.m();
        this.f41914b = y12;
    }

    public a2(String str) {
        this.f41913a = 1;
        md.Q qB = md.Q.b();
        Fe.e.t(qB, "registry");
        this.f41914b = qB;
        Fe.e.t(str, "defaultPolicy");
        this.f41915c = str;
    }
}
