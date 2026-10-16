package f8;

import android.animation.ValueAnimator;
import s6.C4017d;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35138b;

    public /* synthetic */ h(Object obj, int i5) {
        this.f35137a = i5;
        this.f35138b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f35137a) {
            case 0:
                j jVar = (j) this.f35138b;
                jVar.getClass();
                jVar.f35179d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                C4017d c4017d = (C4017d) this.f35138b;
                c4017d.getClass();
                c4017d.f45138F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4017d.invalidate(c4017d.f45147a);
                break;
        }
    }
}
