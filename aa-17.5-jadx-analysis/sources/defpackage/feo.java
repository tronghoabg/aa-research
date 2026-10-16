package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class feo extends fhd {
    public feo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ffs.e);
        U(dlz.m(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.a));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float W(fgo fgoVar, float f) {
        Float f2;
        return (fgoVar == null || (f2 = (Float) fgoVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator X(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        fgu.d(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) fgu.a, f2);
        fen fenVar = new fen(view);
        objectAnimatorOfFloat.addListener(fenVar);
        k().H(fenVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.fhd, defpackage.fgc
    public final void c(fgo fgoVar) {
        fhd.V(fgoVar);
        Float fValueOf = (Float) fgoVar.b.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = fgoVar.b.getVisibility() == 0 ? Float.valueOf(fgu.a(fgoVar.b)) : Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        fgoVar.a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // defpackage.fgc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fhd
    public final Animator f(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        int i = fgu.c;
        return X(view, W(fgoVar, BitmapDescriptorFactory.HUE_RED), 1.0f);
    }

    @Override // defpackage.fhd
    public final Animator g(ViewGroup viewGroup, View view, fgo fgoVar, fgo fgoVar2) {
        int i = fgu.c;
        Animator animatorX = X(view, W(fgoVar, 1.0f), BitmapDescriptorFactory.HUE_RED);
        if (animatorX == null) {
            fgu.d(view, W(fgoVar2, 1.0f));
        }
        return animatorX;
    }

    public feo(int i) {
        U(i);
    }
}
