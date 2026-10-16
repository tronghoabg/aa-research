package defpackage;

import android.transition.Transition;

/* loaded from: classes2.dex */
final class aj extends ad {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(cp cpVar, boolean z, boolean z2) {
        Object exitTransition;
        super(cpVar);
        cpVar.getClass();
        boolean z3 = false;
        if (cpVar.h == 2) {
            if (z) {
                exitTransition = cpVar.a.getReenterTransition();
                z3 = true;
            } else {
                exitTransition = cpVar.a.getEnterTransition();
            }
        } else if (z) {
            exitTransition = cpVar.a.getReturnTransition();
            z3 = true;
        } else {
            exitTransition = cpVar.a.getExitTransition();
        }
        this.b = exitTransition;
        this.c = cpVar.h == 2 ? z3 ? cpVar.a.getAllowReturnTransitionOverlap() : cpVar.a.getAllowEnterTransitionOverlap() : true;
        this.d = z2 ? z3 ? cpVar.a.getSharedElementReturnTransition() : cpVar.a.getSharedElementEnterTransition() : null;
    }

    private final ck d(Object obj) {
        if (obj == null) {
            return null;
        }
        ck ckVar = cd.a;
        ck ckVar2 = cd.a;
        if (obj instanceof Transition) {
            return ckVar2;
        }
        ck ckVar3 = cd.b;
        if (ckVar3 != null && ckVar3.m(obj)) {
            return ckVar3;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final ck a() {
        Object obj = this.d;
        Object obj2 = this.b;
        ck ckVarD = d(obj2);
        ck ckVarD2 = d(obj);
        if (ckVarD == null || ckVarD2 == null || ckVarD == ckVarD2) {
            return ckVarD == null ? ckVarD2 : ckVarD;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + obj2 + " which uses a different Transition  type than its shared element transition " + obj);
    }

    public final boolean c() {
        return this.d != null;
    }
}
