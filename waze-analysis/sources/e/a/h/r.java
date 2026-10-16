package e.a.h;

import e.a.cm;
import e.a.ee;
import e.a.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r extends m {

    /* renamed from: a, reason: collision with root package name */
    private final l f47797a;

    /* renamed from: b, reason: collision with root package name */
    private Object f47798b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47799c = false;

    r(l lVar) {
        this.f47797a = lVar;
    }

    @Override // com.waze.uid.f
    public final void a(ee eeVar, cm cmVar) {
        if (!eeVar.l()) {
            this.f47797a.d(new eh(eeVar, cmVar));
            return;
        }
        if (!this.f47799c) {
            this.f47797a.d(new eh(ee.f47410j.g("No value received for unary call"), cmVar));
        }
        this.f47797a.c(this.f47798b);
    }

    @Override // e.a.h.m
    final void c() {
        this.f47797a.f47784a.c(2);
    }

    @Override // com.waze.uid.f
    public final void h(Object obj) {
        if (this.f47799c) {
            throw new eh(ee.f47410j.g("More than one value received for unary call"));
        }
        this.f47798b = obj;
        this.f47799c = true;
    }

    @Override // com.waze.uid.f
    public final void u(cm cmVar) {
    }
}
