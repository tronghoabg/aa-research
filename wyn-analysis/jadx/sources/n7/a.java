package N7;

import android.animation.ValueAnimator;
import c8.C1582f;
import c8.C1583g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8578b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f8577a = i5;
        this.f8578b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8577a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1583g c1583g = ((BottomSheetBehavior) this.f8578b).f26826i;
                if (c1583g != null) {
                    C1582f c1582f = c1583g.f19729a;
                    if (c1582f.f19721i != fFloatValue) {
                        c1582f.f19721i = fFloatValue;
                        c1583g.f19733e = true;
                        c1583g.invalidateSelf();
                        break;
                    }
                }
                break;
            default:
                ((TextInputLayout) this.f8578b).f27073s0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
