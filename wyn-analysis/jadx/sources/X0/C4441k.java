package x0;

import B.F;
import K.s;
import U8.v0;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import ff.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import t0.t;
import t0.y;

/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4441k {

    /* renamed from: a, reason: collision with root package name */
    public final C4438h f47599a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47600b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47601c;

    /* renamed from: d, reason: collision with root package name */
    public C4441k f47602d;

    /* renamed from: e, reason: collision with root package name */
    public final C4437g f47603e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47604f;

    /* renamed from: g, reason: collision with root package name */
    public final t f47605g;

    public C4441k(C4438h outerSemanticsEntity, boolean z2) {
        AbstractC3340k.e(outerSemanticsEntity, "outerSemanticsEntity");
        this.f47599a = outerSemanticsEntity;
        this.f47600b = z2;
        this.f47603e = outerSemanticsEntity.j();
        this.f47604f = ((C4440j) ((InterfaceC4439i) ((Z.j) outerSemanticsEntity.f15789c))).f47597a;
        this.f47605g = ((y) outerSemanticsEntity.f15788b).f45561e;
    }

    public static List b(C4441k c4441k, List list, boolean z2, int i5) {
        if ((i5 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i5 & 2) != 0) {
            z2 = false;
        }
        c4441k.getClass();
        List listJ = c4441k.j(z2, false);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4441k c4441k2 = (C4441k) listJ.get(i10);
            if (c4441k2.h()) {
                list.add(c4441k2);
            } else if (!c4441k2.f47603e.f47595c) {
                b(c4441k2, list, false, 2);
            }
        }
        return list;
    }

    public final C4441k a(C4435e c4435e, tf.l lVar) {
        C4441k c4441k = new C4441k(new C4438h(new t(true).f45533x, new C4440j(this.f47604f + (c4435e != null ? Http2Connection.DEGRADED_PONG_TIMEOUT_NS : 2000000000), false, lVar)), false);
        c4441k.f47601c = true;
        c4441k.f47602d = this;
        return c4441k;
    }

    public final y c() {
        boolean z2 = this.f47603e.f47594b;
        C4438h c4438h = this.f47599a;
        if (!z2) {
            return (y) c4438h.f15788b;
        }
        C4438h c4438hU = S3.f.u(this.f47605g);
        if (c4438hU != null) {
            c4438h = c4438hU;
        }
        return (y) c4438h.f15788b;
    }

    public final d0.d d() {
        return !this.f47605g.r() ? d0.d.f33936e : Fe.g.q(c());
    }

    public final List e(boolean z2) {
        return this.f47603e.f47595c ? v.f35432a : h() ? b(this, null, z2, 1) : j(z2, true);
    }

    public final C4437g f() {
        boolean zH = h();
        C4437g c4437g = this.f47603e;
        if (!zH) {
            return c4437g;
        }
        c4437g.getClass();
        C4437g c4437g2 = new C4437g();
        c4437g2.f47594b = c4437g.f47594b;
        c4437g2.f47595c = c4437g.f47595c;
        c4437g2.f47593a.putAll(c4437g.f47593a);
        i(c4437g2);
        return c4437g2;
    }

    public final C4441k g() {
        t tVarJ;
        C4437g c4437gJ;
        C4441k c4441k = this.f47602d;
        if (c4441k != null) {
            return c4441k;
        }
        t tVar = this.f47605g;
        boolean z2 = this.f47600b;
        if (z2) {
            tVarJ = tVar.j();
            while (tVarJ != null) {
                C4438h c4438hV = S3.f.v(tVarJ);
                if ((c4438hV == null || (c4437gJ = c4438hV.j()) == null || !c4437gJ.f47594b) ? false : true) {
                    break;
                }
                tVarJ = tVarJ.j();
            }
            tVarJ = null;
        } else {
            tVarJ = null;
        }
        if (tVarJ == null) {
            t tVarJ2 = tVar.j();
            while (true) {
                if (tVarJ2 == null) {
                    tVarJ = null;
                    break;
                }
                if (S3.f.v(tVarJ2) != null) {
                    tVarJ = tVarJ2;
                    break;
                }
                tVarJ2 = tVarJ2.j();
            }
        }
        C4438h c4438hV2 = tVarJ != null ? S3.f.v(tVarJ) : null;
        if (c4438hV2 == null) {
            return null;
        }
        return new C4441k(c4438hV2, z2);
    }

    public final boolean h() {
        return this.f47600b && this.f47603e.f47594b;
    }

    public final void i(C4437g c4437g) {
        if (this.f47603e.f47595c) {
            return;
        }
        List listJ = j(false, false);
        int size = listJ.size();
        for (int i5 = 0; i5 < size; i5++) {
            C4441k c4441k = (C4441k) listJ.get(i5);
            if (!c4441k.h()) {
                C4437g child = c4441k.f47603e;
                AbstractC3340k.e(child, "child");
                for (Map.Entry entry : child.f47593a.entrySet()) {
                    C4447q c4447q = (C4447q) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = c4437g.f47593a;
                    Object objInvoke = c4447q.f47644b.invoke(linkedHashMap.get(c4447q), value);
                    if (objInvoke != null) {
                        linkedHashMap.put(c4447q, objInvoke);
                    }
                }
                c4441k.i(c4437g);
            }
        }
    }

    public final List j(boolean z2, boolean z10) {
        ArrayList arrayList;
        if (this.f47601c) {
            return v.f35432a;
        }
        ArrayList arrayList2 = new ArrayList();
        t tVar = this.f47605g;
        if (z2) {
            arrayList = new ArrayList();
            v0.F(tVar, arrayList);
        } else {
            arrayList = new ArrayList();
            S3.f.p(tVar, arrayList);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(new C4441k((C4438h) arrayList.get(i5), this.f47600b));
        }
        if (z10) {
            C4447q c4447q = AbstractC4444n.f47629o;
            C4437g c4437g = this.f47603e;
            C4435e c4435e = (C4435e) Fe.e.F(c4437g, c4447q);
            if (c4435e != null && c4437g.f47594b && !arrayList2.isEmpty()) {
                arrayList2.add(a(c4435e, new F(c4435e, 22)));
            }
            C4447q c4447q2 = AbstractC4444n.f47616a;
            if (c4437g.a(c4447q2) && !arrayList2.isEmpty() && c4437g.f47594b) {
                List list = (List) Fe.e.F(c4437g, c4447q2);
                String str = list != null ? (String) ff.o.s0(list) : null;
                if (str != null) {
                    arrayList2.add(0, a(null, new s(str, 2)));
                }
            }
        }
        return arrayList2;
    }
}
