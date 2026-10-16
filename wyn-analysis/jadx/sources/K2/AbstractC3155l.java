package k2;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: k2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3155l extends AbstractC3144a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f39115h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f39116i;

    /* renamed from: j, reason: collision with root package name */
    public S1.A f39117j;

    @Override // k2.AbstractC3144a
    public void d() {
        for (C3154k c3154k : this.f39115h.values()) {
            c3154k.f39100a.c(c3154k.f39101b);
        }
    }

    @Override // k2.AbstractC3144a
    public void f() {
        for (C3154k c3154k : this.f39115h.values()) {
            c3154k.f39100a.e(c3154k.f39101b);
        }
    }

    @Override // k2.AbstractC3144a
    public void j() {
        Iterator it = this.f39115h.values().iterator();
        while (it.hasNext()) {
            ((C3154k) it.next()).f39100a.j();
        }
    }

    @Override // k2.AbstractC3144a
    public void p() {
        HashMap map = this.f39115h;
        for (C3154k c3154k : map.values()) {
            c3154k.f39100a.o(c3154k.f39101b);
            C3153j c3153j = c3154k.f39102c;
            AbstractC3144a abstractC3144a = c3154k.f39100a;
            abstractC3144a.r(c3153j);
            abstractC3144a.q(c3153j);
        }
        map.clear();
    }

    public abstract H t(Object obj, H h10);

    public abstract void x(Object obj, AbstractC3144a abstractC3144a, N1.N n10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [k2.I, k2.i] */
    public final void y(final Object obj, AbstractC3144a abstractC3144a) {
        HashMap map = this.f39115h;
        Q1.k.c(!map.containsKey(obj));
        ?? r12 = new I() { // from class: k2.i
            @Override // k2.I
            public final void a(AbstractC3144a abstractC3144a2, N1.N n10) {
                this.f39087a.x(obj, abstractC3144a2, n10);
            }
        };
        C3153j c3153j = new C3153j(this, obj);
        map.put(obj, new C3154k(abstractC3144a, r12, c3153j));
        Handler handler = this.f39116i;
        handler.getClass();
        abstractC3144a.getClass();
        Z1.d dVar = abstractC3144a.f39018c;
        dVar.getClass();
        L l10 = new L();
        l10.f38917a = handler;
        l10.f38918b = c3153j;
        dVar.f16928c.add(l10);
        this.f39116i.getClass();
        Z1.d dVar2 = abstractC3144a.f39019d;
        dVar2.getClass();
        Z1.c cVar = new Z1.c();
        cVar.f16925a = c3153j;
        dVar2.f16928c.add(cVar);
        S1.A a5 = this.f39117j;
        V1.k kVar = this.f39022g;
        Q1.k.h(kVar);
        abstractC3144a.k(r12, a5, kVar);
        if (this.f39017b.isEmpty()) {
            abstractC3144a.c(r12);
        }
    }

    public long u(long j8, Object obj) {
        return j8;
    }

    public int v(int i5, Object obj) {
        return i5;
    }
}
