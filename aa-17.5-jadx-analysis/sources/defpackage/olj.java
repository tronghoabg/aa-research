package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class olj extends Transition {
    private final Property a = new oli(Float.class);

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        transitionValues.values.put("ANDROID_AUTO:TRANSLATE_Y", Float.valueOf(transitionValues.view.getTranslationY()));
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        transitionValues.values.put("ANDROID_AUTO:TRANSLATE_Y", Float.valueOf(transitionValues.view.getTranslationY()));
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            float fFloatValue = ((Float) transitionValues.values.get("ANDROID_AUTO:TRANSLATE_Y")).floatValue();
            float fFloatValue2 = ((Float) transitionValues2.values.get("ANDROID_AUTO:TRANSLATE_Y")).floatValue();
            if (fFloatValue != fFloatValue2) {
                transitionValues2.view.setTranslationY(fFloatValue);
                return ObjectAnimator.ofFloat(transitionValues2.view, (Property<View, Float>) this.a, fFloatValue2);
            }
        }
        return super.createAnimator(viewGroup, transitionValues, transitionValues2);
    }
}
