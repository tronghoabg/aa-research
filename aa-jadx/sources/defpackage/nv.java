package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nv implements android.animation.ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public nv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [affc, java.lang.Object] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((defpackage.nw) this.a).p = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                defpackage.kx kxVar = (defpackage.kx) this.a;
                int i = (int) fFloatValue;
                kxVar.b.setAlpha(i);
                kxVar.c.setAlpha(i);
                kxVar.d();
                break;
            case 2:
                ((android.view.View) ((defpackage.fs) ((defpackage.ajnd) this.a).a).c.getParent()).invalidate();
                break;
            case 3:
                ((defpackage.jhh) this.a).E = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                valueAnimator.getClass();
                defpackage.mzx mzxVar = (defpackage.mzx) defpackage.tez.a((android.support.v4.app.Fragment) this.a, defpackage.mzx.class);
                if (mzxVar != null) {
                    java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    mzxVar.c(((java.lang.Integer) animatedValue).intValue());
                }
                break;
            case 5:
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 6:
                defpackage.yqm yqmVar2 = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 7:
                defpackage.yqm yqmVar3 = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 8:
                defpackage.yqm yqmVar4 = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 9:
                ((defpackage.oxz) this.a).a();
                break;
            case 10:
                float fFloatValue2 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                com.google.android.apps.auto.sdk.ui.PagedScrollBarView pagedScrollBarView = (com.google.android.apps.auto.sdk.ui.PagedScrollBarView) this.a;
                pagedScrollBarView.f.setAlpha(1.0f - fFloatValue2);
                pagedScrollBarView.g.setAlpha(fFloatValue2);
                break;
            case 11:
                float fFloatValue3 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                defpackage.wnl wnlVar = (defpackage.wnl) this.a;
                wnlVar.l.setAlpha((int) (255.0f * fFloatValue3));
                wnlVar.v = fFloatValue3;
                break;
            case 12:
                ((com.google.android.material.internal.ClippableRoundedCornerLayout) this.a).b((float[]) valueAnimator.getAnimatedValue());
                break;
            case 13:
                defpackage.wta wtaVar = (defpackage.wta) this.a;
                wtaVar.b.e = wtaVar.e.getInterpolation(wtaVar.d.getAnimatedFraction());
                break;
            case 14:
                int i2 = defpackage.wut.x;
                ((defpackage.fv) this.a).setProgress(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                int i3 = defpackage.wut.x;
                ((defpackage.wqx) this.a).a(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                int i4 = defpackage.wut.x;
                ((android.widget.ImageButton) this.a).setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                ((defpackage.wuq) this.a).a.f.setAlpha(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ((defpackage.wuq) this.a).a.k(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                defpackage.wuq.g(((defpackage.wuq) this.a).a.i, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float fFloatValue4 = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                defpackage.wut wutVar = ((defpackage.wus) this.a).a;
                wutVar.j.setAlpha(fFloatValue4);
                wutVar.q.D.setAlpha(1.0f - ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ nv(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
