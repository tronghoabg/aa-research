package androidx.transition;

import androidx.transition.Transition;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TransitionKt {
    public static final Transition.TransitionListener addListener(Transition transition, l<? super Transition, ab> lVar, l<? super Transition, ab> lVar2, l<? super Transition, ab> lVar3, l<? super Transition, ab> lVar4, l<? super Transition, ab> lVar5) {
        x.f(transition, "<this>");
        x.f(lVar, "onEnd");
        x.f(lVar2, "onStart");
        x.f(lVar3, "onCancel");
        x.f(lVar4, "onResume");
        x.f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<Transition, ab>() { // from class: androidx.transition.TransitionKt.addListener.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Transition transition2) {
                    invoke2(transition2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                    x.f(transition2, "it");
                }
            };
        }
        if ((i2 & 2) != 0) {
            lVar2 = new l<Transition, ab>() { // from class: androidx.transition.TransitionKt.addListener.2
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Transition transition2) {
                    invoke2(transition2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                    x.f(transition2, "it");
                }
            };
        }
        l lVar6 = lVar2;
        if ((i2 & 4) != 0) {
            lVar3 = new l<Transition, ab>() { // from class: androidx.transition.TransitionKt.addListener.3
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Transition transition2) {
                    invoke2(transition2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                    x.f(transition2, "it");
                }
            };
        }
        if ((i2 & 8) != 0) {
            lVar4 = new l<Transition, ab>() { // from class: androidx.transition.TransitionKt.addListener.4
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Transition transition2) {
                    invoke2(transition2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                    x.f(transition2, "it");
                }
            };
        }
        if ((i2 & 16) != 0) {
            lVar5 = new l<Transition, ab>() { // from class: androidx.transition.TransitionKt.addListener.5
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Transition transition2) {
                    invoke2(transition2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Transition transition2) {
                    x.f(transition2, "it");
                }
            };
        }
        x.f(transition, "<this>");
        x.f(lVar, "onEnd");
        x.f(lVar6, "onStart");
        x.f(lVar3, "onCancel");
        x.f(lVar4, "onResume");
        x.f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final l<? super Transition, ab> lVar) {
        x.f(transition, "<this>");
        x.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                x.f(transition2, "transition");
                lVar.invoke(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionEnd(Transition transition2, boolean z) {
                onTransitionEnd(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionStart(Transition transition2, boolean z) {
                onTransitionStart(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final l<? super Transition, ab> lVar) {
        x.f(transition, "<this>");
        x.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                x.f(transition2, "transition");
                lVar.invoke(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionStart(Transition transition2, boolean z) {
                onTransitionStart(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionEnd(Transition transition2, boolean z) {
                onTransitionEnd(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final l<? super Transition, ab> lVar) {
        x.f(transition, "<this>");
        x.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                x.f(transition2, "transition");
                lVar.invoke(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionEnd(Transition transition2, boolean z) {
                onTransitionEnd(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionStart(Transition transition2, boolean z) {
                onTransitionStart(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final l<? super Transition, ab> lVar) {
        x.f(transition, "<this>");
        x.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                x.f(transition2, "transition");
                lVar.invoke(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionEnd(Transition transition2, boolean z) {
                onTransitionEnd(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionStart(Transition transition2, boolean z) {
                onTransitionStart(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final l<? super Transition, ab> lVar) {
        x.f(transition, "<this>");
        x.f(lVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                x.f(transition2, "transition");
            }

            @Override // androidx.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                x.f(transition2, "transition");
                lVar.invoke(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionEnd(Transition transition2, boolean z) {
                onTransitionEnd(transition2);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* synthetic */ void onTransitionStart(Transition transition2, boolean z) {
                onTransitionStart(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
