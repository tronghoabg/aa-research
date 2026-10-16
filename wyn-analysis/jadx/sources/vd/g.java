package vd;

import java.util.IdentityHashMap;
import java.util.Map;
import md.AbstractC3537e;
import md.C3533a;
import md.C3534b;
import md.N;
import md.O;

/* loaded from: classes5.dex */
public final class g extends AbstractC4339b {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3537e f47175d;

    /* renamed from: e, reason: collision with root package name */
    public final N f47176e;

    public g(AbstractC3537e abstractC3537e, N n10) {
        Fe.e.t(abstractC3537e, "delegate");
        this.f47175d = abstractC3537e;
        Fe.e.t(n10, "healthListener");
        this.f47176e = n10;
    }

    @Override // md.AbstractC3537e
    public final C3534b c() {
        C3534b c3534bC = this.f47175d.c();
        c3534bC.getClass();
        C3533a c3533a = O.f40593d;
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c3533a, bool);
        for (Map.Entry entry : c3534bC.f40613a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C3533a) entry.getKey(), entry.getValue());
            }
        }
        return new C3534b(identityHashMap);
    }

    @Override // md.AbstractC3537e
    public final void q(N n10) {
        this.f47175d.q(new f(this, n10, 0));
    }

    @Override // vd.AbstractC4339b
    public final AbstractC3537e s() {
        return this.f47175d;
    }
}
