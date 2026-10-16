package V;

import E.C0427q;
import K.C0678c;
import N.C0729i0;
import N.C0740o;
import ef.C2537u;
import ef.InterfaceC2521e;
import java.util.ArrayList;
import kotlin.jvm.internal.K;
import tf.j;
import tf.k;
import tf.l;
import tf.m;
import tf.n;
import tf.p;
import tf.q;
import tf.r;
import tf.s;
import tf.t;
import tf.u;
import tf.v;
import tf.w;

/* loaded from: classes.dex */
public final class d implements p, q, r, s, t, u, v, w, tf.b, tf.c, tf.e, tf.f, tf.g, tf.h, tf.i, j, k, m, n {

    /* renamed from: a, reason: collision with root package name */
    public final int f12855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12856b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2521e f12857c;

    /* renamed from: d, reason: collision with root package name */
    public C0729i0 f12858d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f12859e;

    public d(int i5, boolean z2, InterfaceC2521e interfaceC2521e) {
        this.f12855a = i5;
        this.f12856b = z2;
        this.f12857c = interfaceC2521e;
    }

    public final Object a(Boolean bool, Boolean bool2, tf.a aVar, l lVar, Boolean bool3, Comparable comparable, C2537u c2537u, tf.a aVar2, C0740o c0740o, int i5) {
        C0427q c0427q = C0427q.f2765a;
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = c0740o.e(this) ? e.a(2, 9) : e.a(1, 9);
        InterfaceC2521e interfaceC2521e = this.f12857c;
        K.e(11, interfaceC2521e);
        Object objInvoke = ((tf.c) interfaceC2521e).invoke(c0427q, bool, bool2, aVar, lVar, bool3, comparable, c2537u, aVar2, c0740o, Integer.valueOf(i5 | iA));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new c(this, bool, bool2, aVar, lVar, bool3, comparable, c2537u, aVar2, i5);
        }
        return objInvoke;
    }

    public final Object b(Boolean bool, Object obj, InterfaceC2521e interfaceC2521e, InterfaceC2521e interfaceC2521e2, C0740o c0740o, int i5) {
        C0427q c0427q = C0427q.f2765a;
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = c0740o.e(this) ? e.a(2, 5) : e.a(1, 5);
        InterfaceC2521e interfaceC2521e3 = this.f12857c;
        K.e(7, interfaceC2521e3);
        Object objInvoke = ((u) interfaceC2521e3).invoke(c0427q, bool, obj, interfaceC2521e, interfaceC2521e2, c0740o, Integer.valueOf(iA | i5));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new b(this, bool, obj, interfaceC2521e, interfaceC2521e2, i5);
        }
        return objInvoke;
    }

    public final Object c(Object obj, C0740o c0740o, int i5) {
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = c0740o.e(this) ? e.a(2, 1) : e.a(1, 1);
        InterfaceC2521e interfaceC2521e = this.f12857c;
        K.e(3, interfaceC2521e);
        Object objInvoke = ((q) interfaceC2521e).invoke(obj, c0740o, Integer.valueOf(iA | i5));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new K.w(this, obj, i5);
        }
        return objInvoke;
    }

    public final Object d(Object obj, Object obj2, C0740o c0740o, int i5) {
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = c0740o.e(this) ? e.a(2, 2) : e.a(1, 2);
        InterfaceC2521e interfaceC2521e = this.f12857c;
        K.e(4, interfaceC2521e);
        Object objInvoke = ((r) interfaceC2521e).invoke(obj, obj2, c0740o, Integer.valueOf(iA | i5));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new C0678c(this, obj, obj2, i5);
        }
        return objInvoke;
    }

    public final Object e(Object obj, Object obj2, Object obj3, C0740o c0740o, int i5) {
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = c0740o.e(this) ? e.a(2, 3) : e.a(1, 3);
        InterfaceC2521e interfaceC2521e = this.f12857c;
        K.e(5, interfaceC2521e);
        Object objInvoke = ((s) interfaceC2521e).invoke(obj, obj2, obj3, c0740o, Integer.valueOf(iA | i5));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new a(this, obj, obj2, obj3, i5);
        }
        return objInvoke;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, C0740o c0740o, int i5) {
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = c0740o.e(this) ? e.a(2, 4) : e.a(1, 4);
        InterfaceC2521e interfaceC2521e = this.f12857c;
        K.e(6, interfaceC2521e);
        Object objInvoke = ((t) interfaceC2521e).invoke(obj, obj2, obj3, obj4, c0740o, Integer.valueOf(iA | i5));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new b(this, obj, obj2, obj3, obj4, i5);
        }
        return objInvoke;
    }

    public final void g(C0740o c0740o) {
        C0729i0 c0729i0V;
        if (!this.f12856b || (c0729i0V = c0740o.v()) == null) {
            return;
        }
        c0729i0V.f7785a |= 1;
        if (e.c(this.f12858d, c0729i0V)) {
            this.f12858d = c0729i0V;
            return;
        }
        ArrayList arrayList = this.f12859e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f12859e = arrayList2;
            arrayList2.add(c0729i0V);
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (e.c((C0729i0) arrayList.get(i5), c0729i0V)) {
                arrayList.set(i5, c0729i0V);
                return;
            }
        }
        arrayList.add(c0729i0V);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C0740o c0740o = (C0740o) obj;
        int iIntValue = ((Number) obj2).intValue();
        c0740o.N(this.f12855a);
        g(c0740o);
        int iA = iIntValue | (c0740o.e(this) ? e.a(2, 0) : e.a(1, 0));
        InterfaceC2521e interfaceC2521e = this.f12857c;
        K.e(2, interfaceC2521e);
        Object objInvoke = ((p) interfaceC2521e).invoke(c0740o, Integer.valueOf(iA));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            K.e(2, this);
            c0729i0R.f7788d = this;
        }
        return objInvoke;
    }

    @Override // tf.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return c(obj, (C0740o) obj2, ((Number) obj3).intValue());
    }

    @Override // tf.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (C0740o) obj3, ((Number) obj4).intValue());
    }

    @Override // tf.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (C0740o) obj4, ((Number) obj5).intValue());
    }

    @Override // tf.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return f(obj, obj2, obj3, obj4, (C0740o) obj5, ((Number) obj6).intValue());
    }

    @Override // tf.u
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return b((Boolean) obj2, obj3, (InterfaceC2521e) obj4, (InterfaceC2521e) obj5, (C0740o) obj6, ((Number) obj7).intValue());
    }

    @Override // tf.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return a((Boolean) obj2, (Boolean) obj3, (tf.a) obj4, (l) obj5, (Boolean) obj6, (Comparable) obj7, (C2537u) obj8, (tf.a) obj9, (C0740o) obj10, ((Number) obj11).intValue());
    }
}
