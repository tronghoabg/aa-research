package vd;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC3537e;
import md.C3533a;
import md.C3534b;
import md.C3546n;
import md.C3552u;
import md.EnumC3545m;
import md.J;
import md.N;
import md.k0;

/* loaded from: classes5.dex */
public final class q extends AbstractC4339b {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3537e f47209d;

    /* renamed from: e, reason: collision with root package name */
    public k f47210e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47211f;

    /* renamed from: g, reason: collision with root package name */
    public C3546n f47212g;

    /* renamed from: h, reason: collision with root package name */
    public N f47213h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC3537e f47214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f47215j;

    public q(r rVar, Dd.c cVar, h hVar) {
        this.f47215j = rVar;
        N n10 = (N) cVar.G();
        if (n10 != null) {
            this.f47213h = n10;
            f fVar = new f(this, n10, 1);
            cVar.getClass();
            J jL = Dd.c.L();
            jL.x((List) cVar.f2642b);
            C3534b c3534b = (C3534b) cVar.f2643c;
            Fe.e.t(c3534b, "attrs");
            jL.f40581b = c3534b;
            Object[][] objArr = (Object[][]) cVar.f2644d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            jL.f40582c = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            jL.i(fVar);
            this.f47209d = hVar.b(jL.j());
        } else {
            this.f47209d = hVar.b(cVar);
        }
        this.f47214i = this.f47209d.d();
    }

    @Override // md.AbstractC3537e
    public final C3534b c() {
        k kVar = this.f47210e;
        AbstractC3537e abstractC3537e = this.f47209d;
        if (kVar == null) {
            return abstractC3537e.c();
        }
        C3534b c3534bC = abstractC3537e.c();
        c3534bC.getClass();
        C3533a c3533a = r.f47216n;
        k kVar2 = this.f47210e;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c3533a, kVar2);
        for (Map.Entry entry : c3534bC.f40613a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C3533a) entry.getKey(), entry.getValue());
            }
        }
        return new C3534b(identityHashMap);
    }

    @Override // vd.AbstractC4339b, md.AbstractC3537e
    public final void p() {
        k kVar = this.f47210e;
        if (kVar != null) {
            this.f47210e = null;
            kVar.f47193f.remove(this);
        }
        super.p();
    }

    @Override // md.AbstractC3537e
    public final void q(N n10) {
        if (this.f47213h != null) {
            s().q(n10);
            return;
        }
        this.f47213h = n10;
        s().q(new f(this, n10, 1));
    }

    @Override // vd.AbstractC4339b, md.AbstractC3537e
    public final void r(List list) {
        boolean zG = r.g(b());
        r rVar = this.f47215j;
        if (zG && r.g(list)) {
            if (rVar.f47217f.containsValue(this.f47210e)) {
                k kVar = this.f47210e;
                kVar.getClass();
                this.f47210e = null;
                kVar.f47193f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C3552u) list.get(0)).f40728a.get(0);
            if (rVar.f47217f.containsKey(socketAddress)) {
                ((k) rVar.f47217f.get(socketAddress)).a(this);
            }
        } else if (!r.g(b()) || r.g(list)) {
            if (!r.g(b()) && r.g(list)) {
                SocketAddress socketAddress2 = (SocketAddress) ((C3552u) list.get(0)).f40728a.get(0);
                if (rVar.f47217f.containsKey(socketAddress2)) {
                    ((k) rVar.f47217f.get(socketAddress2)).a(this);
                }
            }
        } else if (rVar.f47217f.containsKey(a().f40728a.get(0))) {
            k kVar2 = (k) rVar.f47217f.get(a().f40728a.get(0));
            kVar2.getClass();
            this.f47210e = null;
            kVar2.f47193f.remove(this);
            t6.q qVar = kVar2.f47189b;
            ((AtomicLong) qVar.f45906a).set(0L);
            ((AtomicLong) qVar.f45907b).set(0L);
            t6.q qVar2 = kVar2.f47190c;
            ((AtomicLong) qVar2.f45906a).set(0L);
            ((AtomicLong) qVar2.f45907b).set(0L);
        }
        this.f47209d.r(list);
    }

    @Override // vd.AbstractC4339b
    public final AbstractC3537e s() {
        return this.f47209d;
    }

    public final void t() {
        this.f47211f = true;
        N n10 = this.f47213h;
        k0 k0Var = k0.f40682n;
        Fe.e.p("The error status must not be OK", !k0Var.f());
        n10.a(new C3546n(EnumC3545m.f40694c, k0Var));
        this.f47214i.h(2, "Subchannel ejected: {0}", this);
    }

    @Override // vd.AbstractC4339b
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f47209d.b() + '}';
    }
}
