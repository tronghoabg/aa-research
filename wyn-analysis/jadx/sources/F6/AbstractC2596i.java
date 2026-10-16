package f6;

import E5.J0;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import u6.AbstractC4256a;

/* renamed from: f6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2596i extends AbstractC2588a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f35063h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f35064i;

    /* renamed from: j, reason: collision with root package name */
    public t6.K f35065j;

    @Override // f6.AbstractC2588a
    public final void c() {
        for (C2595h c2595h : this.f35063h.values()) {
            c2595h.f35060a.b(c2595h.f35061b);
        }
    }

    @Override // f6.AbstractC2588a
    public final void e() {
        for (C2595h c2595h : this.f35063h.values()) {
            c2595h.f35060a.d(c2595h.f35061b);
        }
    }

    @Override // f6.AbstractC2588a
    public void i() {
        Iterator it = this.f35063h.values().iterator();
        while (it.hasNext()) {
            ((C2595h) it.next()).f35060a.i();
        }
    }

    @Override // f6.AbstractC2588a
    public void o() {
        HashMap map = this.f35063h;
        for (C2595h c2595h : map.values()) {
            c2595h.f35060a.n(c2595h.f35061b);
            S3.i iVar = c2595h.f35062c;
            AbstractC2588a abstractC2588a = c2595h.f35060a;
            abstractC2588a.q(iVar);
            abstractC2588a.p(iVar);
        }
        map.clear();
    }

    public abstract C2613z r(Object obj, C2613z c2613z);

    public abstract void u(Object obj, AbstractC2588a abstractC2588a, J0 j02);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [f6.A, f6.g] */
    public final void v(final Object obj, AbstractC2588a abstractC2588a) {
        HashMap map = this.f35063h;
        AbstractC4256a.e(!map.containsKey(obj));
        ?? r12 = new InterfaceC2571A() { // from class: f6.g
            @Override // f6.InterfaceC2571A
            public final void a(AbstractC2588a abstractC2588a2, J0 j02) {
                this.f35058a.u(obj, abstractC2588a2, j02);
            }
        };
        S3.i iVar = new S3.i(this, obj);
        map.put(obj, new C2595h(abstractC2588a, r12, iVar));
        Handler handler = this.f35064i;
        handler.getClass();
        abstractC2588a.getClass();
        I5.f fVar = abstractC2588a.f35024c;
        fVar.getClass();
        C2573C c2573c = new C2573C();
        c2573c.f34874a = handler;
        c2573c.f34875b = iVar;
        fVar.f5394c.add(c2573c);
        this.f35064i.getClass();
        I5.f fVar2 = abstractC2588a.f35025d;
        fVar2.getClass();
        I5.e eVar = new I5.e();
        eVar.f5391a = iVar;
        fVar2.f5394c.add(eVar);
        t6.K k = this.f35065j;
        F5.l lVar = this.f35028g;
        AbstractC4256a.j(lVar);
        abstractC2588a.j(r12, k, lVar);
        if (this.f35023b.isEmpty()) {
            abstractC2588a.b(r12);
        }
    }

    public long s(long j8, Object obj) {
        return j8;
    }

    public int t(int i5, Object obj) {
        return i5;
    }
}
