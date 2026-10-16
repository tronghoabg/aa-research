package android.support.v4.app;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class w extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f385a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f386b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(cz czVar, boolean z, boolean z2) {
        Object exitTransition;
        super(czVar);
        h.g.b.x.f(czVar, "operation");
        cy cyVarE = czVar.e();
        cy cyVar = cy.f304b;
        boolean z3 = false;
        if (cyVarE == cyVar) {
            if (z) {
                exitTransition = czVar.c().getReenterTransition();
                z3 = true;
            } else {
                exitTransition = czVar.c().getEnterTransition();
            }
        } else if (z) {
            exitTransition = czVar.c().getReturnTransition();
            z3 = true;
        } else {
            exitTransition = czVar.c().getExitTransition();
        }
        this.f385a = exitTransition;
        this.f386b = czVar.e() == cyVar ? z3 ? czVar.c().getAllowReturnTransitionOverlap() : czVar.c().getAllowEnterTransitionOverlap() : true;
        this.f387c = z2 ? z3 ? czVar.c().getSharedElementReturnTransition() : czVar.c().getSharedElementEnterTransition() : null;
    }

    private final cq l(Object obj) {
        if (obj == null) {
            return null;
        }
        cq cqVar = ci.f265a;
        cq cqVar2 = ci.f265a;
        if (cqVar2.canHandle(obj)) {
            return cqVar2;
        }
        cq cqVar3 = ci.f266b;
        if (cqVar3 != null && cqVar3.canHandle(obj)) {
            return cqVar3;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().c() + " is not a valid framework Transition or AndroidX Transition");
    }

    public final cq a() {
        Object obj = this.f387c;
        Object obj2 = this.f385a;
        cq cqVarL = l(obj2);
        cq cqVarL2 = l(obj);
        if (cqVarL == null || cqVarL2 == null || cqVarL == cqVarL2) {
            return cqVarL == null ? cqVarL2 : cqVarL;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().c() + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final Object h() {
        return this.f387c;
    }

    public final Object i() {
        return this.f385a;
    }

    public final boolean j() {
        return this.f387c != null;
    }

    public final boolean k() {
        return this.f386b;
    }
}
