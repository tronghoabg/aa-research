package k2;

import N1.C0769s;
import N1.C0770t;
import N1.C0771u;
import N1.C0773w;
import U1.AbstractC0831a;
import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l8.AbstractC3409K;
import l8.C3407I;

/* renamed from: k2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3162t extends AbstractC3155l {

    /* renamed from: v, reason: collision with root package name */
    public static final C0773w f39148v;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final HashSet f39149l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f39150m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f39151n;

    /* renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f39152o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f39153p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f39154q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f39155r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f39156s;

    /* renamed from: t, reason: collision with root package name */
    public HashSet f39157t;

    /* renamed from: u, reason: collision with root package name */
    public g0 f39158u;

    static {
        J5.n nVar = new J5.n(3);
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        E5.Y y10 = new E5.Y();
        C0771u c0771u = C0771u.f8270a;
        Uri uri = Uri.EMPTY;
        f39148v = new C0773w("", new N1.r(nVar), uri != null ? new C0770t(uri, null, null, list, e0Var2, null, -9223372036854775807L) : null, new C0769s(y10), N1.z.f8304B, c0771u);
    }

    public C3162t(boolean z2, g0 g0Var, AbstractC3144a... abstractC3144aArr) {
        for (AbstractC3144a abstractC3144a : abstractC3144aArr) {
            abstractC3144a.getClass();
        }
        this.f39158u = g0Var.f39073b.length > 0 ? g0Var.a() : g0Var;
        this.f39152o = new IdentityHashMap();
        this.f39153p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f39151n = new ArrayList();
        this.f39157t = new HashSet();
        this.f39149l = new HashSet();
        this.f39154q = new HashSet();
        this.f39155r = z2;
        List listAsList = Arrays.asList(abstractC3144aArr);
        synchronized (this) {
            C(arrayList.size(), listAsList, null, null);
        }
    }

    public final void B(int i5, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            int i10 = i5 + 1;
            ArrayList arrayList = this.f39151n;
            if (i5 > 0) {
                r rVar2 = (r) arrayList.get(i5 - 1);
                int iO = rVar2.f39139a.f38898o.f39170b.o() + rVar2.f39143e;
                rVar.f39142d = i5;
                rVar.f39143e = iO;
                rVar.f39144f = false;
                rVar.f39141c.clear();
            } else {
                rVar.f39142d = i5;
                rVar.f39143e = 0;
                rVar.f39144f = false;
                rVar.f39141c.clear();
            }
            D(i5, 1, rVar.f39139a.f38898o.f39170b.o());
            arrayList.add(i5, rVar);
            this.f39153p.put(rVar.f39140b, rVar);
            y(rVar, rVar.f39139a);
            if (this.f39017b.isEmpty() || !this.f39152o.isEmpty()) {
                C3154k c3154k = (C3154k) this.f39115h.get(rVar);
                c3154k.getClass();
                c3154k.f39100a.c(c3154k.f39101b);
            } else {
                this.f39154q.add(rVar);
            }
            i5 = i10;
        }
    }

    public final void C(int i5, List list, Handler handler, Cg.b bVar) {
        Q1.k.c((handler == null) == (bVar == null));
        Handler handler2 = this.f39150m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC3144a) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new r((AbstractC3144a) it2.next(), this.f39155r));
        }
        this.k.addAll(i5, arrayList);
        if (handler2 != null && !list.isEmpty()) {
            handler2.obtainMessage(1, new C3161s(i5, arrayList, F(handler, bVar))).sendToTarget();
        } else {
            if (bVar == null || handler == null) {
                return;
            }
            handler.post(bVar);
        }
    }

    public final void D(int i5, int i10, int i11) {
        while (true) {
            ArrayList arrayList = this.f39151n;
            if (i5 >= arrayList.size()) {
                return;
            }
            r rVar = (r) arrayList.get(i5);
            rVar.f39142d += i10;
            rVar.f39143e += i11;
            i5++;
        }
    }

    public final C3160q F(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C3160q c3160q = new C3160q(handler, runnable);
        this.f39149l.add(c3160q);
        return c3160q;
    }

    public final void G() {
        Iterator it = this.f39154q.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.f39141c.isEmpty()) {
                C3154k c3154k = (C3154k) this.f39115h.get(rVar);
                c3154k.getClass();
                c3154k.f39100a.c(c3154k.f39101b);
                it.remove();
            }
        }
    }

    public final synchronized void H(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C3160q c3160q = (C3160q) it.next();
                c3160q.f39137a.post(c3160q.f39138b);
            }
            this.f39149l.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void I(int i5, int i10, Handler handler, Cg.b bVar) {
        Q1.k.c(handler != null);
        Handler handler2 = this.f39150m;
        ArrayList arrayList = this.k;
        arrayList.add(i10, (r) arrayList.remove(i5));
        if (handler2 != null) {
            handler2.obtainMessage(3, new C3161s(i5, Integer.valueOf(i10), F(handler, bVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(bVar);
        }
    }

    public final synchronized void J(int i5, int i10, Handler handler, Cg.b bVar) {
        Q1.k.c(handler != null);
        Handler handler2 = this.f39150m;
        Q1.x.P(this.k, i5, i10);
        if (handler2 != null) {
            handler2.obtainMessage(2, new C3161s(i5, Integer.valueOf(i10), F(handler, bVar))).sendToTarget();
        } else if (handler != null) {
            handler.post(bVar);
        }
    }

    public final void K(C3160q c3160q) {
        if (!this.f39156s) {
            Handler handler = this.f39150m;
            handler.getClass();
            handler.obtainMessage(5).sendToTarget();
            this.f39156s = true;
        }
        if (c3160q != null) {
            this.f39157t.add(c3160q);
        }
    }

    public final void L(g0 g0Var) {
        int size;
        Handler handler = this.f39150m;
        if (handler == null) {
            if (g0Var.f39073b.length > 0) {
                g0Var = g0Var.a();
            }
            this.f39158u = g0Var;
        } else {
            synchronized (this) {
                size = this.k.size();
            }
            if (g0Var.f39073b.length != size) {
                g0Var = g0Var.a().b(0, size);
            }
            handler.obtainMessage(4, new C3161s(0, g0Var, null)).sendToTarget();
        }
    }

    public final synchronized void M(g0 g0Var) {
        L(g0Var);
    }

    public final void N() {
        this.f39156s = false;
        HashSet hashSet = this.f39157t;
        this.f39157t = new HashSet();
        m(new C3158o(this.f39151n, this.f39158u));
        Handler handler = this.f39150m;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        int i5 = AbstractC0831a.f12016d;
        Pair pair = (Pair) h10.f38903a;
        Object obj = pair.first;
        H hA = h10.a(pair.second);
        r rVar = (r) this.f39153p.get(obj);
        if (rVar == null) {
            rVar = new r(new C3159p(), this.f39155r);
            rVar.f39144f = true;
            y(rVar, rVar.f39139a);
        }
        this.f39154q.add(rVar);
        C3154k c3154k = (C3154k) this.f39115h.get(rVar);
        c3154k.getClass();
        c3154k.f39100a.e(c3154k.f39101b);
        rVar.f39141c.add(hA);
        C3139A c3139aD = rVar.f39139a.b(hA, eVar, j8);
        this.f39152o.put(c3139aD, rVar);
        G();
        return c3139aD;
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void d() {
        super.d();
        this.f39154q.clear();
    }

    @Override // k2.AbstractC3144a
    public final synchronized N1.N g() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new C3158o(this.k, this.f39158u.f39073b.length != this.k.size() ? this.f39158u.a().b(0, this.k.size()) : this.f39158u);
    }

    @Override // k2.AbstractC3144a
    public final C0773w h() {
        return f39148v;
    }

    @Override // k2.AbstractC3144a
    public final boolean i() {
        return false;
    }

    @Override // k2.AbstractC3144a
    public final synchronized void l(S1.A a5) {
        try {
            this.f39117j = a5;
            this.f39116i = Q1.x.m(null);
            this.f39150m = new Handler(new Q1.f(this, 1));
            if (this.k.isEmpty()) {
                N();
            } else {
                this.f39158u = this.f39158u.b(0, this.k.size());
                B(0, this.k);
                K(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        IdentityHashMap identityHashMap = this.f39152o;
        r rVar = (r) identityHashMap.remove(f10);
        rVar.getClass();
        rVar.f39139a.n(f10);
        ArrayList arrayList = rVar.f39141c;
        arrayList.remove(((C3139A) f10).f38884a);
        if (!identityHashMap.isEmpty()) {
            G();
        }
        if (rVar.f39144f && arrayList.isEmpty()) {
            this.f39154q.remove(rVar);
            C3154k c3154k = (C3154k) this.f39115h.remove(rVar);
            c3154k.getClass();
            C3152i c3152i = c3154k.f39101b;
            AbstractC3144a abstractC3144a = c3154k.f39100a;
            abstractC3144a.o(c3152i);
            C3153j c3153j = c3154k.f39102c;
            abstractC3144a.r(c3153j);
            abstractC3144a.q(c3153j);
        }
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final synchronized void p() {
        try {
            super.p();
            this.f39151n.clear();
            this.f39154q.clear();
            this.f39153p.clear();
            this.f39158u = this.f39158u.a();
            Handler handler = this.f39150m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f39150m = null;
            }
            this.f39156s = false;
            this.f39157t.clear();
            H(this.f39149l);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k2.AbstractC3155l
    public final H t(Object obj, H h10) {
        r rVar = (r) obj;
        for (int i5 = 0; i5 < rVar.f39141c.size(); i5++) {
            if (((H) rVar.f39141c.get(i5)).f38906d == h10.f38906d) {
                Object obj2 = rVar.f39140b;
                int i10 = AbstractC0831a.f12016d;
                return h10.a(Pair.create(obj2, h10.f38903a));
            }
        }
        return null;
    }

    @Override // k2.AbstractC3155l
    public final int v(int i5, Object obj) {
        return i5 + ((r) obj).f39143e;
    }

    @Override // k2.AbstractC3155l
    public final void x(Object obj, AbstractC3144a abstractC3144a, N1.N n10) {
        r rVar = (r) obj;
        int i5 = rVar.f39142d + 1;
        ArrayList arrayList = this.f39151n;
        if (i5 < arrayList.size()) {
            int iO = n10.o() - (((r) arrayList.get(rVar.f39142d + 1)).f39143e - rVar.f39143e);
            if (iO != 0) {
                D(rVar.f39142d + 1, 0, iO);
            }
        }
        K(null);
    }

    public final synchronized void z(int i5, ArrayList arrayList, Handler handler, Cg.b bVar) {
        C(i5, arrayList, handler, bVar);
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void f() {
    }
}
