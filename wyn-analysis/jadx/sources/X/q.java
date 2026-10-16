package X;

import E.C0421k;
import N.C0718d;
import java.util.Collection;
import x.C4425r;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15733a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15734b = new Object();

    public static final void a(int i5, int i10) {
        if (i5 < 0 || i5 >= i10) {
            throw new IndexOutOfBoundsException("index (" + i5 + ") is out of bound of [0, " + i10 + ')');
        }
    }

    public static final int b(int i5, int[] iArr) {
        int length = iArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            int i12 = iArr[i11];
            if (i5 > i12) {
                i10 = i11 + 1;
            } else {
                if (i5 >= i12) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static Object c(tf.a aVar, tf.l lVar) {
        g d3;
        if (lVar == null) {
            return aVar.invoke();
        }
        g gVar = (g) m.f15717a.E();
        if (gVar instanceof D) {
            D d5 = (D) gVar;
            if (d5.f15678t == C0718d.y()) {
                tf.l lVar2 = d5.f15676r;
                tf.l lVar3 = d5.f15677s;
                try {
                    ((D) gVar).f15676r = m.l(lVar, lVar2, true);
                    ((D) gVar).f15677s = lVar3;
                    return aVar.invoke();
                } finally {
                    d5.f15676r = lVar2;
                    d5.f15677s = lVar3;
                }
            }
        }
        if (gVar == null || (gVar instanceof C1270c)) {
            d3 = new D(gVar instanceof C1270c ? (C1270c) gVar : null, lVar, null, true, false);
        } else {
            if (lVar == null) {
                return aVar.invoke();
            }
            d3 = gVar.t(lVar);
        }
        try {
            g gVarJ = d3.j();
            try {
                Object objInvoke = aVar.invoke();
                g.p(gVarJ);
                return objInvoke;
            } catch (Throwable th) {
                g.p(gVarJ);
                throw th;
            }
        } finally {
            d3.c();
        }
    }

    public static S8.b d(C0421k c0421k) {
        Dd.c cVar = m.f15717a;
        m.f(l.k);
        synchronized (m.f15718b) {
            m.f15723g = ff.o.F0((Collection) m.f15723g, c0421k);
        }
        return new S8.b(c0421k);
    }

    public static void e() {
        boolean z2;
        synchronized (m.f15718b) {
            C4425r c4425r = ((C1269b) m.f15725i.get()).f15688h;
            z2 = false;
            if (c4425r != null) {
                if (c4425r.h()) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            m.a();
        }
    }

    public static final void f() {
        throw new UnsupportedOperationException();
    }
}
