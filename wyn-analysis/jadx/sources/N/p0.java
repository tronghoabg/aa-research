package N;

import Ef.C0499l0;
import Ef.C0502n;
import Ef.C0505o0;
import Ef.InterfaceC0498l;
import Ef.InterfaceC0501m0;
import X.C1270c;
import android.util.Log;
import ef.C2515C;
import ef.C2527k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import jf.InterfaceC3108h;
import x.C4425r;

/* loaded from: classes.dex */
public final class p0 extends AbstractC0743q {

    /* renamed from: u, reason: collision with root package name */
    public static final Hf.x0 f7880u = Hf.k0.c(T.b.f11129d);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicReference f7881v = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0724g f7882a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7883b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0501m0 f7884c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f7885d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7886e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7887f;

    /* renamed from: g, reason: collision with root package name */
    public C4425r f7888g;

    /* renamed from: h, reason: collision with root package name */
    public final P.d f7889h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f7890i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7891j;
    public final LinkedHashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f7892l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f7893m;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashSet f7894n;

    /* renamed from: o, reason: collision with root package name */
    public C0502n f7895o;

    /* renamed from: p, reason: collision with root package name */
    public A.e0 f7896p;

    /* renamed from: q, reason: collision with root package name */
    public final Hf.x0 f7897q;

    /* renamed from: r, reason: collision with root package name */
    public final C0505o0 f7898r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3108h f7899s;

    /* renamed from: t, reason: collision with root package name */
    public final P f7900t;

    public p0(InterfaceC3108h interfaceC3108h) {
        C0724g c0724g = new C0724g(new A0.p(this, 12));
        this.f7882a = c0724g;
        this.f7883b = new Object();
        this.f7886e = new ArrayList();
        this.f7888g = new C4425r();
        this.f7889h = new P.d(new C0744s[16]);
        this.f7890i = new ArrayList();
        this.f7891j = new ArrayList();
        this.k = new LinkedHashMap();
        this.f7892l = new LinkedHashMap();
        this.f7897q = Hf.k0.c(EnumC0731j0.f7795c);
        C0505o0 c0505o0 = new C0505o0((InterfaceC0501m0) interfaceC3108h.get(C0499l0.f3748a));
        c0505o0.invokeOnCompletion(new B.F(this, 6));
        this.f7898r = c0505o0;
        this.f7899s = interfaceC3108h.plus(c0724g).plus(c0505o0);
        this.f7900t = new P(8);
    }

    public static final void C(ArrayList arrayList, p0 p0Var, C0744s c0744s) {
        arrayList.clear();
        synchronized (p0Var.f7883b) {
            Iterator it = p0Var.f7891j.iterator();
            if (it.hasNext()) {
                ((T) it.next()).getClass();
                throw null;
            }
        }
    }

    public static final Object p(p0 p0Var, C0741o0 c0741o0) {
        C0502n c0502n;
        if (p0Var.z()) {
            return C2515C.f34653a;
        }
        C0502n c0502n2 = new C0502n(1, A6.h.A(c0741o0));
        c0502n2.t();
        synchronized (p0Var.f7883b) {
            if (p0Var.z()) {
                c0502n = c0502n2;
            } else {
                p0Var.f7895o = c0502n2;
                c0502n = null;
            }
        }
        if (c0502n != null) {
            c0502n.resumeWith(C2515C.f34653a);
        }
        Object objS = c0502n2.s();
        return objS == kf.a.f39711a ? objS : C2515C.f34653a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(p0 p0Var) {
        int i5;
        ff.v vVar;
        synchronized (p0Var.f7883b) {
            try {
                if (p0Var.k.isEmpty()) {
                    vVar = ff.v.f35432a;
                } else {
                    ArrayList arrayListB0 = ff.p.b0(p0Var.k.values());
                    p0Var.k.clear();
                    ArrayList arrayList = new ArrayList(arrayListB0.size());
                    int size = arrayListB0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        T t10 = (T) arrayListB0.get(i10);
                        arrayList.add(new C2527k(t10, p0Var.f7892l.get(t10)));
                    }
                    p0Var.f7892l.clear();
                    vVar = arrayList;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = vVar.size();
        for (i5 = 0; i5 < size2; i5++) {
            C2527k c2527k = (C2527k) vVar.get(i5);
        }
    }

    public static final boolean r(p0 p0Var) {
        boolean zY;
        synchronized (p0Var.f7883b) {
            zY = p0Var.y();
        }
        return zY;
    }

    public static final C0744s s(p0 p0Var, C0744s c0744s, C4425r c4425r) {
        LinkedHashSet linkedHashSet;
        C1270c c1270cC;
        if (!c0744s.f7919q.f7834E && !c0744s.f7920r && ((linkedHashSet = p0Var.f7894n) == null || !linkedHashSet.contains(c0744s))) {
            B.F f10 = new B.F(c0744s, 7);
            A.W w2 = new A.W(15, c0744s, c4425r);
            X.g gVarK = X.m.k();
            C1270c c1270c = gVarK instanceof C1270c ? (C1270c) gVarK : null;
            if (c1270c == null || (c1270cC = c1270c.C(f10, w2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                X.g gVarJ = c1270cC.j();
                if (c4425r != null) {
                    try {
                        if (c4425r.h()) {
                            A0.e eVar = new A0.e(4, c4425r, c0744s);
                            C0740o c0740o = c0744s.f7919q;
                            if (c0740o.f7834E) {
                                C0718d.v("Preparing a composition while composing is not supported");
                                throw null;
                            }
                            c0740o.f7834E = true;
                            try {
                                eVar.invoke();
                                c0740o.f7834E = false;
                            } catch (Throwable th) {
                                c0740o.f7834E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        X.g.p(gVarJ);
                        throw th2;
                    }
                }
                boolean zT = c0744s.t();
                X.g.p(gVarJ);
                if (zT) {
                    return c0744s;
                }
            } finally {
                v(c1270cC);
            }
        }
        return null;
    }

    public static final boolean t(p0 p0Var) {
        List listA;
        synchronized (p0Var.f7883b) {
            boolean z2 = true;
            if (p0Var.f7888g.g()) {
                if (!p0Var.f7889h.j() && !p0Var.y()) {
                    z2 = false;
                }
                return z2;
            }
            P.f fVar = new P.f(p0Var.f7888g);
            p0Var.f7888g = new C4425r();
            synchronized (p0Var.f7883b) {
                listA = p0Var.A();
            }
            try {
                int size = listA.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((C0744s) listA.get(i5)).u(fVar);
                    if (((EnumC0731j0) p0Var.f7897q.getValue()).compareTo(EnumC0731j0.f7794b) <= 0) {
                        break;
                    }
                }
                synchronized (p0Var.f7883b) {
                    p0Var.f7888g = new C4425r();
                }
                synchronized (p0Var.f7883b) {
                    if (p0Var.x() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (!p0Var.f7889h.j() && !p0Var.y()) {
                        z2 = false;
                    }
                }
                return z2;
            } catch (Throwable th) {
                synchronized (p0Var.f7883b) {
                    C4425r c4425r = p0Var.f7888g;
                    c4425r.getClass();
                    for (Object obj : fVar) {
                        c4425r.f47554b[c4425r.d(obj)] = obj;
                    }
                    throw th;
                }
            }
        }
    }

    public static final void u(p0 p0Var, InterfaceC0501m0 interfaceC0501m0) {
        synchronized (p0Var.f7883b) {
            Throwable th = p0Var.f7885d;
            if (th != null) {
                throw th;
            }
            if (((EnumC0731j0) p0Var.f7897q.getValue()).compareTo(EnumC0731j0.f7794b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (p0Var.f7884c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            p0Var.f7884c = interfaceC0501m0;
            p0Var.x();
        }
    }

    public static void v(C1270c c1270c) {
        try {
            if (c1270c.v() instanceof X.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c1270c.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List A() {
        Object obj = this.f7887f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f7886e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? ff.v.f35432a : new ArrayList(arrayList);
            this.f7887f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    public final void B(C0744s c0744s) {
        synchronized (this.f7883b) {
            ArrayList arrayList = this.f7891j;
            if (arrayList.size() > 0) {
                ((T) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r4 >= r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0105, code lost:
    
        if (((ef.C2527k) r10.get(r4)).f34672b == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        if (r8 >= r4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011a, code lost:
    
        r11 = (ef.C2527k) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        if (r11.f34672b != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0124, code lost:
    
        r11 = (N.T) r11.f34671a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        r4 = r17.f7883b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
    
        ff.t.e0(r3, r17.f7891j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0136, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:
    
        if (r8 >= r4) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0150, code lost:
    
        if (((ef.C2527k) r11).f34672b == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0155, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List D(java.util.List r18, x.C4425r r19) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.p0.D(java.util.List, x.r):java.util.List");
    }

    public final void E(Exception exc, C0744s c0744s) throws Exception {
        int i5 = 14;
        if (!((Boolean) f7881v.get()).booleanValue() || (exc instanceof C0730j)) {
            synchronized (this.f7883b) {
                A.e0 e0Var = this.f7896p;
                if (e0Var != null) {
                    throw ((Exception) e0Var.f152b);
                }
                this.f7896p = new A.e0(exc, i5);
            }
            throw exc;
        }
        synchronized (this.f7883b) {
            int i10 = AbstractC0714b.f7745b;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            this.f7890i.clear();
            this.f7889h.e();
            this.f7888g = new C4425r();
            this.f7891j.clear();
            this.k.clear();
            this.f7892l.clear();
            this.f7896p = new A.e0(exc, i5);
            if (c0744s != null) {
                F(c0744s);
            }
            x();
        }
    }

    public final void F(C0744s c0744s) {
        ArrayList arrayList = this.f7893m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f7893m = arrayList;
        }
        if (!arrayList.contains(c0744s)) {
            arrayList.add(c0744s);
        }
        this.f7886e.remove(c0744s);
        this.f7887f = null;
    }

    @Override // N.AbstractC0743q
    public final void a(C0744s c0744s, V.d dVar) throws Exception {
        C1270c c1270cC;
        boolean z2 = c0744s.f7919q.f7834E;
        try {
            B.F f10 = new B.F(c0744s, 7);
            A.W w2 = new A.W(15, c0744s, null);
            X.g gVarK = X.m.k();
            C1270c c1270c = gVarK instanceof C1270c ? (C1270c) gVarK : null;
            if (c1270c == null || (c1270cC = c1270c.C(f10, w2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                X.g gVarJ = c1270cC.j();
                try {
                    c0744s.k(dVar);
                    if (!z2) {
                        X.m.k().m();
                    }
                    synchronized (this.f7883b) {
                        if (((EnumC0731j0) this.f7897q.getValue()).compareTo(EnumC0731j0.f7794b) > 0 && !A().contains(c0744s)) {
                            this.f7886e.add(c0744s);
                            this.f7887f = null;
                        }
                    }
                    try {
                        B(c0744s);
                        try {
                            c0744s.f();
                            c0744s.h();
                            if (z2) {
                                return;
                            }
                            X.m.k().m();
                        } catch (Exception e7) {
                            E(e7, null);
                        }
                    } catch (Exception e10) {
                        E(e10, c0744s);
                    }
                } finally {
                    X.g.p(gVarJ);
                }
            } finally {
                v(c1270cC);
            }
        } catch (Exception e11) {
            E(e11, c0744s);
        }
    }

    @Override // N.AbstractC0743q
    public final boolean c() {
        return ((Boolean) f7881v.get()).booleanValue();
    }

    @Override // N.AbstractC0743q
    public final boolean d() {
        return false;
    }

    @Override // N.AbstractC0743q
    public final boolean e() {
        return false;
    }

    @Override // N.AbstractC0743q
    public final int g() {
        return 1000;
    }

    @Override // N.AbstractC0743q
    public final InterfaceC3108h h() {
        return this.f7899s;
    }

    @Override // N.AbstractC0743q
    public final void i(C0744s c0744s) {
        InterfaceC0498l interfaceC0498lX;
        synchronized (this.f7883b) {
            if (this.f7889h.f(c0744s)) {
                interfaceC0498lX = null;
            } else {
                this.f7889h.b(c0744s);
                interfaceC0498lX = x();
            }
        }
        if (interfaceC0498lX != null) {
            ((C0502n) interfaceC0498lX).resumeWith(C2515C.f34653a);
        }
    }

    @Override // N.AbstractC0743q
    public final void l(C0744s c0744s) {
        synchronized (this.f7883b) {
            try {
                LinkedHashSet linkedHashSet = this.f7894n;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f7894n = linkedHashSet;
                }
                linkedHashSet.add(c0744s);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // N.AbstractC0743q
    public final void o(C0744s c0744s) {
        synchronized (this.f7883b) {
            this.f7886e.remove(c0744s);
            this.f7887f = null;
            this.f7889h.k(c0744s);
            this.f7890i.remove(c0744s);
        }
    }

    public final void w() {
        synchronized (this.f7883b) {
            if (((EnumC0731j0) this.f7897q.getValue()).compareTo(EnumC0731j0.f7797e) >= 0) {
                Hf.x0 x0Var = this.f7897q;
                EnumC0731j0 enumC0731j0 = EnumC0731j0.f7794b;
                x0Var.getClass();
                x0Var.k(null, enumC0731j0);
            }
        }
        this.f7898r.cancel(null);
    }

    public final InterfaceC0498l x() {
        Hf.x0 x0Var = this.f7897q;
        int iCompareTo = ((EnumC0731j0) x0Var.getValue()).compareTo(EnumC0731j0.f7794b);
        ArrayList arrayList = this.f7891j;
        ArrayList arrayList2 = this.f7890i;
        P.d dVar = this.f7889h;
        if (iCompareTo <= 0) {
            this.f7886e.clear();
            this.f7887f = ff.v.f35432a;
            this.f7888g = new C4425r();
            dVar.e();
            arrayList2.clear();
            arrayList.clear();
            this.f7893m = null;
            C0502n c0502n = this.f7895o;
            if (c0502n != null) {
                c0502n.a(null);
            }
            this.f7895o = null;
            this.f7896p = null;
            return null;
        }
        A.e0 e0Var = this.f7896p;
        EnumC0731j0 enumC0731j0 = EnumC0731j0.f7798f;
        EnumC0731j0 enumC0731j02 = EnumC0731j0.f7795c;
        if (e0Var == null) {
            if (this.f7884c == null) {
                this.f7888g = new C4425r();
                dVar.e();
                if (y()) {
                    enumC0731j02 = EnumC0731j0.f7796d;
                }
            } else {
                enumC0731j02 = (dVar.j() || this.f7888g.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || y()) ? enumC0731j0 : EnumC0731j0.f7797e;
            }
        }
        x0Var.getClass();
        x0Var.k(null, enumC0731j02);
        if (enumC0731j02 != enumC0731j0) {
            return null;
        }
        C0502n c0502n2 = this.f7895o;
        this.f7895o = null;
        return c0502n2;
    }

    public final boolean y() {
        return this.f7882a.f7772f.get() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f7883b
            monitor-enter(r0)
            x.r r1 = r2.f7888g     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            P.d r1 = r2.f7889h     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.y()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N.p0.z():boolean");
    }

    @Override // N.AbstractC0743q
    public final void j(Set set) {
    }
}
