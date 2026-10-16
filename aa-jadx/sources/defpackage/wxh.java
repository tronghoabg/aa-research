package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wxh implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public wxh(com.google.android.projection.gearhead.rail.ui.ImageButtonWithAlphaFade imageButtonWithAlphaFade, int i) {
        this.b = i;
        this.a = imageButtonWithAlphaFade;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            com.google.android.material.internal.CheckableImageButton checkableImageButton = ((defpackage.wxk) this.a).h;
            checkableImageButton.setScaleX(fFloatValue);
            checkableImageButton.setScaleY(fFloatValue);
            return;
        }
        if (i == 1) {
            ((defpackage.wxk) this.a).h.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        if (i == 2) {
            ((defpackage.wxs) this.a).h.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
            return;
        }
        com.google.android.projection.gearhead.rail.ui.ImageButtonWithAlphaFade imageButtonWithAlphaFade = (com.google.android.projection.gearhead.rail.ui.ImageButtonWithAlphaFade) this.a;
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
        int iHSVToColor = android.graphics.Color.HSVToColor(fArr);
        imageButtonWithAlphaFade.getDrawable().setColorFilter(android.graphics.Color.argb((int) (((double) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue()) * 255.0d), android.graphics.Color.red(iHSVToColor), android.graphics.Color.green(iHSVToColor), android.graphics.Color.blue(iHSVToColor)), android.graphics.PorterDuff.Mode.SRC_IN);
    }

    public /* synthetic */ wxh(defpackage.wxx wxxVar, int i) {
        this.b = i;
        this.a = wxxVar;
    }
}
