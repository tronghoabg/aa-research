package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class wkq {
    private final aat a = new aat(0);
    private final aat b = new aat(0);

    public static wkq a(Context context, TypedArray typedArray, int i) throws Resources.NotFoundException {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                if (animatorLoadAnimator instanceof AnimatorSet) {
                    return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
                }
                if (animatorLoadAnimator == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(animatorLoadAnimator);
                return c(arrayList);
            } catch (Exception e) {
                Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), e);
            }
        }
        return null;
    }

    private static wkq c(List list) {
        wkq wkqVar = new wkq();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            wkqVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            wkr wkrVar = new wkr(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            wkrVar.a = objectAnimator.getRepeatCount();
            wkrVar.b = objectAnimator.getRepeatMode();
            wkqVar.a.put(propertyName, wkrVar);
        }
        return wkqVar;
    }

    public final wkr b(String str) {
        aat aatVar = this.a;
        if (aatVar.get(str) != null) {
            return (wkr) aatVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wkq) {
            return this.a.equals(((wkq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
