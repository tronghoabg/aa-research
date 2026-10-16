package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wrb implements defpackage.wrc {
    private final /* synthetic */ int a;

    @Override // defpackage.wrc
    public final void a(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        int i = this.a;
        if (i == 0) {
            int i2 = defpackage.wrd.a;
            java.lang.Float f = (java.lang.Float) valueAnimator.getAnimatedValue();
            view.setScaleX(f.floatValue());
            view.setScaleY(f.floatValue());
            return;
        }
        if (i == 1) {
            int i3 = defpackage.wrd.a;
            view.setTranslationX(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        } else if (i != 2) {
            int i4 = defpackage.wrd.a;
            view.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            int i5 = defpackage.wrd.a;
            view.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
