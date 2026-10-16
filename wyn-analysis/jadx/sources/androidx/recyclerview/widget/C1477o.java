package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1478p f18927a;

    public C1477o(C1478p c1478p) {
        this.f18927a = c1478p;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C1478p c1478p = this.f18927a;
        c1478p.f18936c.setAlpha(iFloatValue);
        c1478p.f18937d.setAlpha(iFloatValue);
        c1478p.f18951s.invalidate();
    }
}
