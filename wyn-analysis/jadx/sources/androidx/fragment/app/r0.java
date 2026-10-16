package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t0 f18531e;

    public r0(t0 t0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f18531e = t0Var;
        this.f18527a = obj;
        this.f18528b = arrayList;
        this.f18529c = obj2;
        this.f18530d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        t0 t0Var = this.f18531e;
        Object obj = this.f18527a;
        if (obj != null) {
            t0Var.u(obj, this.f18528b, null);
        }
        Object obj2 = this.f18529c;
        if (obj2 != null) {
            t0Var.u(obj2, this.f18530d, null);
        }
    }
}
