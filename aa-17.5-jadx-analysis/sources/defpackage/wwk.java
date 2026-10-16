package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.PorterDuff;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.projection.gearhead.rail.ui.ImageButtonWithAlphaFade;

/* loaded from: classes3.dex */
public final /* synthetic */ class wwk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wwk(ImageButtonWithAlphaFade imageButtonWithAlphaFade, int i) {
        this.b = i;
        this.a = imageButtonWithAlphaFade;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CheckableImageButton checkableImageButton = ((wwn) this.a).h;
            checkableImageButton.setScaleX(fFloatValue);
            checkableImageButton.setScaleY(fFloatValue);
            return;
        }
        if (i == 1) {
            ((wwn) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 2) {
            ((www) this.a).h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        ImageButtonWithAlphaFade imageButtonWithAlphaFade = (ImageButtonWithAlphaFade) this.a;
        if (imageButtonWithAlphaFade.getDrawable() == null) {
            return;
        }
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float[] fArr = imageButtonWithAlphaFade.a;
        float[] fArr2 = imageButtonWithAlphaFade.c;
        float f = fArr2[0];
        float[] fArr3 = imageButtonWithAlphaFade.b;
        fArr[0] = f + ((fArr3[0] - f) * animatedFraction);
        float f2 = fArr2[1];
        fArr[1] = f2 + ((fArr3[1] - f2) * animatedFraction);
        float f3 = fArr2[2];
        fArr[2] = f3 + ((fArr3[2] - f3) * animatedFraction);
        int iHSVToColor = Color.HSVToColor(fArr);
        imageButtonWithAlphaFade.getDrawable().setColorFilter(Color.argb((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0d), Color.red(iHSVToColor), Color.green(iHSVToColor), Color.blue(iHSVToColor)), PorterDuff.Mode.SRC_IN);
    }

    public /* synthetic */ wwk(wxb wxbVar, int i) {
        this.b = i;
        this.a = wxbVar;
    }
}
