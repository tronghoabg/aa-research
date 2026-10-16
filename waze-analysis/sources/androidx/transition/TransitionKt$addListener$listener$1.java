package androidx.transition;

import androidx.transition.Transition;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ l<Transition, ab> $onCancel;
    final /* synthetic */ l<Transition, ab> $onEnd;
    final /* synthetic */ l<Transition, ab> $onPause;
    final /* synthetic */ l<Transition, ab> $onResume;
    final /* synthetic */ l<Transition, ab> $onStart;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(l<? super Transition, ab> lVar, l<? super Transition, ab> lVar2, l<? super Transition, ab> lVar3, l<? super Transition, ab> lVar4, l<? super Transition, ab> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        x.f(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        x.f(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        x.f(transition, "transition");
        this.$onPause.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        x.f(transition, "transition");
        this.$onResume.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        x.f(transition, "transition");
        this.$onStart.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public /* synthetic */ void onTransitionEnd(Transition transition, boolean z) {
        onTransitionEnd(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public /* synthetic */ void onTransitionStart(Transition transition, boolean z) {
        onTransitionStart(transition);
    }
}
