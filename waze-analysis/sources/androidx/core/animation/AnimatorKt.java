package androidx.core.animation;

import android.animation.Animator;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, l<? super Animator, ab> lVar, l<? super Animator, ab> lVar2, l<? super Animator, ab> lVar3, l<? super Animator, ab> lVar4) {
        x.f(animator, "<this>");
        x.f(lVar, "onEnd");
        x.f(lVar2, "onStart");
        x.f(lVar3, "onCancel");
        x.f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, l lVar, l lVar2, l lVar3, l lVar4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l<Animator, ab>() { // from class: androidx.core.animation.AnimatorKt.addListener.1
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Animator animator2) {
                    invoke2(animator2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                    x.f(animator2, "it");
                }
            };
        }
        if ((i2 & 2) != 0) {
            lVar2 = new l<Animator, ab>() { // from class: androidx.core.animation.AnimatorKt.addListener.2
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Animator animator2) {
                    invoke2(animator2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                    x.f(animator2, "it");
                }
            };
        }
        if ((i2 & 4) != 0) {
            lVar3 = new l<Animator, ab>() { // from class: androidx.core.animation.AnimatorKt.addListener.3
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Animator animator2) {
                    invoke2(animator2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                    x.f(animator2, "it");
                }
            };
        }
        if ((i2 & 8) != 0) {
            lVar4 = new l<Animator, ab>() { // from class: androidx.core.animation.AnimatorKt.addListener.4
                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(Animator animator2) {
                    invoke2(animator2);
                    return ab.f48028a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Animator animator2) {
                    x.f(animator2, "it");
                }
            };
        }
        x.f(animator, "<this>");
        x.f(lVar, "onEnd");
        x.f(lVar2, "onStart");
        x.f(lVar3, "onCancel");
        x.f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final l<? super Animator, ab> lVar, final l<? super Animator, ab> lVar2) {
        x.f(animator, "<this>");
        x.f(lVar, "onResume");
        x.f(lVar2, "onPause");
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                x.f(animator2, "animator");
                lVar2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                x.f(animator2, "animator");
                lVar.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, l lVar, l lVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.core.animation.AnimatorKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return AnimatorKt.addPauseListener$lambda$0((Animator) obj2);
                }
            };
        }
        if ((i2 & 2) != 0) {
            lVar2 = new l() { // from class: androidx.core.animation.AnimatorKt$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return AnimatorKt.addPauseListener$lambda$1((Animator) obj2);
                }
            };
        }
        return addPauseListener(animator, lVar, lVar2);
    }

    static final ab addPauseListener$lambda$0(Animator animator) {
        x.f(animator, "it");
        return ab.f48028a;
    }

    static final ab addPauseListener$lambda$1(Animator animator) {
        x.f(animator, "it");
        return ab.f48028a;
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final l<? super Animator, ab> lVar) {
        x.f(animator, "<this>");
        x.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                x.f(animator2, "animator");
                lVar.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                x.f(animator2, "animator");
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final l<? super Animator, ab> lVar) {
        x.f(animator, "<this>");
        x.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                x.f(animator2, "animator");
                lVar.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                x.f(animator2, "animator");
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, l<? super Animator, ab> lVar) {
        x.f(animator, "<this>");
        x.f(lVar, "action");
        return addPauseListener$default(animator, null, lVar, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final l<? super Animator, ab> lVar) {
        x.f(animator, "<this>");
        x.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                x.f(animator2, "animator");
                lVar.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                x.f(animator2, "animator");
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, l<? super Animator, ab> lVar) {
        x.f(animator, "<this>");
        x.f(lVar, "action");
        return addPauseListener$default(animator, lVar, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final l<? super Animator, ab> lVar) {
        x.f(animator, "<this>");
        x.f(lVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                x.f(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                x.f(animator2, "animator");
                lVar.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
