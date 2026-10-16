package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.waze.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bi {
    static aw a(Context context, ar arVar, boolean z, boolean z2) throws Resources.NotFoundException {
        int exitAnim;
        boolean z3;
        int nextTransition = arVar.getNextTransition();
        int iB = 0;
        if (z2) {
            if (z) {
                exitAnim = arVar.getPopEnterAnim();
                z3 = true;
            } else {
                exitAnim = arVar.getPopExitAnim();
                z3 = false;
            }
        } else if (z) {
            exitAnim = arVar.getEnterAnim();
            z3 = true;
        } else {
            exitAnim = arVar.getExitAnim();
            z3 = false;
        }
        boolean z4 = z3;
        arVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = arVar.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            arVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = arVar.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = arVar.onCreateAnimation(nextTransition, z3, exitAnim);
        if (animationOnCreateAnimation != null) {
            return new aw(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = arVar.onCreateAnimator(nextTransition, z3, exitAnim);
        if (animatorOnCreateAnimator != null) {
            return new aw(animatorOnCreateAnimator);
        }
        if (exitAnim != 0) {
            iB = exitAnim;
        } else if (nextTransition != 0) {
            iB = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z3 ? b(context, android.R.attr.activityOpenEnterAnimation) : b(context, android.R.attr.activityOpenExitAnimation) : true != z4 ? R.animator.fragment_fade_exit : R.animator.fragment_fade_enter : z3 ? b(context, android.R.attr.activityCloseEnterAnimation) : b(context, android.R.attr.activityCloseExitAnimation) : true != z4 ? R.animator.fragment_close_exit : R.animator.fragment_close_enter : true != z4 ? R.animator.fragment_open_exit : R.animator.fragment_open_enter;
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new aw(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new aw(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new aw(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int b(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
