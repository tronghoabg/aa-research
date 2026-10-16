package od;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kd.RunnableC3307c;
import md.AbstractC3537e;
import md.C3533a;
import md.C3534b;

/* loaded from: classes5.dex */
public final class K1 extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3537e f41619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L1 f41620e;

    public K1(L1 l12, AbstractC3537e abstractC3537e) {
        this.f41620e = l12;
        this.f41619d = abstractC3537e;
    }

    @Override // md.AbstractC3537e
    public final void j(md.k0 k0Var) {
        this.f41619d.j(k0Var);
        this.f41620e.f41642c.execute(new RunnableC3307c(this, 4));
    }

    @Override // md.AbstractC3537e
    public final void n(md.e0 e0Var) {
        C3533a c3533a = L1.f41639d;
        C3534b c3534b = e0Var.f40638b;
        if (c3534b.f40613a.get(c3533a) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        List list = Collections.EMPTY_LIST;
        C3534b c3534b2 = C3534b.f40612b;
        c3534b.getClass();
        J1 j12 = new J1(this.f41620e);
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c3533a, j12);
        for (Map.Entry entry : c3534b.f40613a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C3533a) entry.getKey(), entry.getValue());
            }
        }
        this.f41619d.n(new md.e0(e0Var.f40637a, new C3534b(identityHashMap), e0Var.f40639c));
    }
}
