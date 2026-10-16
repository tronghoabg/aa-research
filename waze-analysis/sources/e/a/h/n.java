package e.a.h;

import e.a.cm;
import e.a.ee;
import e.a.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends m {

    /* renamed from: a, reason: collision with root package name */
    private final ae f47785a;

    /* renamed from: b, reason: collision with root package name */
    private final k f47786b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47787c;

    n(ae aeVar, k kVar) {
        this.f47785a = aeVar;
        this.f47786b = kVar;
        if (aeVar instanceof t) {
            ((t) aeVar).a();
        }
    }

    @Override // com.waze.uid.f
    public final void a(ee eeVar, cm cmVar) {
        boolean zL = eeVar.l();
        ae aeVar = this.f47785a;
        if (zL) {
            aeVar.onCompleted();
        } else {
            aeVar.onError(new eh(eeVar, cmVar));
        }
    }

    @Override // e.a.h.m
    final void c() {
        this.f47786b.b();
    }

    @Override // com.waze.uid.f
    public final void h(Object obj) {
        if (this.f47787c && !this.f47786b.f47781b) {
            throw new eh(ee.f47410j.g("More than one responses received for unary or client-streaming call"));
        }
        this.f47787c = true;
        this.f47785a.onNext(obj);
        k kVar = this.f47786b;
        if (kVar.f47781b) {
            kVar.b();
        }
    }

    @Override // com.waze.uid.f
    public final void i() {
    }

    @Override // com.waze.uid.f
    public final void u(cm cmVar) {
    }
}
