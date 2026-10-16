package od;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import md.AbstractC3532D;
import md.AbstractC3536d;
import md.AbstractC3538f;
import md.C3535c;
import md.C3549q;

/* loaded from: classes5.dex */
public final class J0 extends AbstractC3536d {

    /* renamed from: b, reason: collision with root package name */
    public final String f41611b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M0 f41613d;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f41610a = new AtomicReference(M0.f41651j0);

    /* renamed from: c, reason: collision with root package name */
    public final G0 f41612c = new G0(this);

    public J0(M0 m02, String str) {
        this.f41613d = m02;
        Fe.e.t(str, "authority");
        this.f41611b = str;
    }

    @Override // md.AbstractC3536d
    public final String g() {
        return this.f41611b;
    }

    @Override // md.AbstractC3536d
    public final AbstractC3538f h(F6.r rVar, C3535c c3535c) {
        AtomicReference atomicReference = this.f41610a;
        Object obj = atomicReference.get();
        C3737x0 c3737x0 = M0.f41651j0;
        if (obj != c3737x0) {
            return i(rVar, c3535c);
        }
        M0 m02 = this.f41613d;
        m02.f41692m.execute(new H0(this, 2));
        if (atomicReference.get() != c3737x0) {
            return i(rVar, c3535c);
        }
        if (m02.f41659G.get()) {
            return new C(2);
        }
        I0 i02 = new I0(this, C3549q.b(), rVar, c3535c);
        m02.f41692m.execute(new RunnableC3666A(this, i02));
        return i02;
    }

    public final AbstractC3538f i(F6.r rVar, C3535c c3535c) {
        AbstractC3532D abstractC3532D = (AbstractC3532D) this.f41610a.get();
        G0 g02 = this.f41612c;
        if (abstractC3532D == null) {
            return g02.h(rVar, c3535c);
        }
        if (!(abstractC3532D instanceof R0)) {
            return new C0(abstractC3532D, g02, this.f41613d.f41688h, rVar, c3535c);
        }
        S0 s02 = ((R0) abstractC3532D).f41794b;
        s02.getClass();
        Q0 q02 = (Q0) s02.f41802b.get((String) rVar.f4012c);
        if (q02 == null) {
            q02 = (Q0) s02.f41803c.get((String) rVar.f4013d);
        }
        if (q02 == null) {
            q02 = s02.f41801a;
        }
        if (q02 != null) {
            c3535c = c3535c.c(Q0.f41785g, q02);
        }
        return g02.h(rVar, c3535c);
    }

    public final void j(AbstractC3532D abstractC3532D) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f41610a;
        AbstractC3532D abstractC3532D2 = (AbstractC3532D) atomicReference.get();
        atomicReference.set(abstractC3532D);
        if (abstractC3532D2 != M0.f41651j0 || (linkedHashSet = this.f41613d.f41654B) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((I0) it.next()).i();
        }
    }
}
