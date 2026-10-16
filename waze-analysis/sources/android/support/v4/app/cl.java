package android.support.v4.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cl implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f270a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f271b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f272c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f273d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f274e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f275f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ co f276g;

    cl(co coVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f276g = coVar;
        this.f270a = obj;
        this.f271b = arrayList;
        this.f272c = obj2;
        this.f273d = arrayList2;
        this.f274e = obj3;
        this.f275f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.f270a;
        if (obj != null) {
            this.f276g.replaceTargets(obj, this.f271b, null);
        }
        Object obj2 = this.f272c;
        if (obj2 != null) {
            this.f276g.replaceTargets(obj2, this.f273d, null);
        }
        Object obj3 = this.f274e;
        if (obj3 != null) {
            this.f276g.replaceTargets(obj3, this.f275f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
