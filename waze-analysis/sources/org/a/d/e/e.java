package org.a.d.e;

import e.a.dw;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private Object f56393a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(org.a.d.c.a aVar) {
        super(aVar);
        x.f(aVar, "beanDefinition");
    }

    static final ab d(e eVar, com.waze.shared_infra.n.c cVar) {
        if (eVar.f56393a == null) {
            x.f(cVar, "context");
            eVar.f56393a = eVar.f56393a == null ? super.c(cVar) : eVar.e();
        }
        return ab.f48028a;
    }

    private final Object e() {
        Object obj = this.f56393a;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // org.a.d.e.b
    public final Object a(com.waze.shared_infra.n.c cVar) {
        x.f(cVar, "context");
        dw.g(this, new d(this, cVar, 0));
        return e();
    }
}
