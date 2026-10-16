package androidx.fragment.app;

import android.transition.Transition;

/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425n extends AbstractC1422k {

    /* renamed from: b, reason: collision with root package name */
    public final Object f18500b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18501c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18502d;

    public C1425n(A0 a02, boolean z2, boolean z10) {
        super(a02);
        int i5 = a02.f18278a;
        F f10 = a02.f18280c;
        this.f18500b = i5 == 2 ? z2 ? f10.getReenterTransition() : f10.getEnterTransition() : z2 ? f10.getReturnTransition() : f10.getExitTransition();
        this.f18501c = a02.f18278a == 2 ? z2 ? f10.getAllowReturnTransitionOverlap() : f10.getAllowEnterTransitionOverlap() : true;
        this.f18502d = z10 ? z2 ? f10.getSharedElementReturnTransition() : f10.getSharedElementEnterTransition() : null;
    }

    public final v0 b() {
        Object obj = this.f18500b;
        v0 v0VarC = c(obj);
        Object obj2 = this.f18502d;
        v0 v0VarC2 = c(obj2);
        if (v0VarC == null || v0VarC2 == null || v0VarC == v0VarC2) {
            return v0VarC == null ? v0VarC2 : v0VarC;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f18473a.f18280c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final v0 c(Object obj) {
        if (obj == null) {
            return null;
        }
        t0 t0Var = o0.f18517a;
        if (obj instanceof Transition) {
            return t0Var;
        }
        v0 v0Var = o0.f18518b;
        if (v0Var != null && v0Var.e(obj)) {
            return v0Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f18473a.f18280c + " is not a valid framework Transition or AndroidX Transition");
    }
}
