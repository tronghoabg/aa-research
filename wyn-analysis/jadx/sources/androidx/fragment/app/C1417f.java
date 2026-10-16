package androidx.fragment.app;

import a.AbstractC1304a;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.fragment.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417f extends AbstractC1422k {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18433b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18434c;

    /* renamed from: d, reason: collision with root package name */
    public K f18435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417f(A0 operation, boolean z2) {
        super(operation);
        AbstractC3340k.e(operation, "operation");
        this.f18433b = z2;
    }

    public final K b(Context context) throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        K k;
        if (this.f18434c) {
            return this.f18435d;
        }
        A0 a02 = this.f18473a;
        F f10 = a02.f18280c;
        boolean z2 = a02.f18278a == 2;
        int nextTransition = f10.getNextTransition();
        int popEnterAnim = this.f18433b ? z2 ? f10.getPopEnterAnim() : f10.getPopExitAnim() : z2 ? f10.getEnterAnim() : f10.getExitAnim();
        f10.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = f10.mContainer;
        K k5 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            f10.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = f10.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = f10.onCreateAnimation(nextTransition, z2, popEnterAnim);
            if (animationOnCreateAnimation != null) {
                k5 = new K(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = f10.onCreateAnimator(nextTransition, z2, popEnterAnim);
                if (animatorOnCreateAnimator != null) {
                    k5 = new K(animatorOnCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z2 ? AbstractC1304a.M(context, android.R.attr.activityOpenEnterAnimation) : AbstractC1304a.M(context, android.R.attr.activityOpenExitAnimation) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? AbstractC1304a.M(context, android.R.attr.activityCloseEnterAnimation) : AbstractC1304a.M(context, android.R.attr.activityCloseExitAnimation) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        if (zEquals) {
                            try {
                                animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                            } catch (Resources.NotFoundException e7) {
                                throw e7;
                            } catch (RuntimeException unused) {
                            }
                            if (animationLoadAnimation != null) {
                                k = new K(animationLoadAnimation);
                                k5 = k;
                            }
                        } else {
                            try {
                                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    k = new K(animatorLoadAnimator);
                                    k5 = k;
                                }
                            } catch (RuntimeException e10) {
                                if (zEquals) {
                                    throw e10;
                                }
                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (animationLoadAnimation2 != null) {
                                    k5 = new K(animationLoadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f18435d = k5;
        this.f18434c = true;
        return k5;
    }
}
