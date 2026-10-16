package f8;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;

/* loaded from: classes4.dex */
public final class d extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f35125e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35126f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f35127g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f35128h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f35129i;

    /* renamed from: j, reason: collision with root package name */
    public final Lb.h f35130j;
    public final ViewOnFocusChangeListenerC2617a k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f35131l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f35132m;

    public d(m mVar) {
        super(mVar);
        this.f35130j = new Lb.h(this, 5);
        this.k = new ViewOnFocusChangeListenerC2617a(this, 0);
        this.f35125e = Ba.c.J(mVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f35126f = Ba.c.J(mVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f35127g = Ba.c.K(mVar.getContext(), R.attr.motionEasingLinearInterpolator, J7.a.f5719a);
        this.f35128h = Ba.c.K(mVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, J7.a.f5722d);
    }

    @Override // f8.n
    public final void a() {
        if (this.f35177b.f35169p != null) {
            return;
        }
        t(u());
    }

    @Override // f8.n
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // f8.n
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // f8.n
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // f8.n
    public final View.OnClickListener f() {
        return this.f35130j;
    }

    @Override // f8.n
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // f8.n
    public final void m(EditText editText) {
        this.f35129i = editText;
        this.f35176a.setEndIconVisible(u());
    }

    @Override // f8.n
    public final void p(boolean z2) {
        if (this.f35177b.f35169p == null) {
            return;
        }
        t(z2);
    }

    @Override // f8.n
    public final void r() {
        final int i5 = 1;
        final int i10 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f35128h);
        valueAnimatorOfFloat.setDuration(this.f35126f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f35122b;

            {
                this.f35122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        d dVar = this.f35122b;
                        dVar.getClass();
                        dVar.f35179d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f35122b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f35179d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        TimeInterpolator timeInterpolator = this.f35127g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f35125e;
        valueAnimatorOfFloat2.setDuration(i11);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f35122b;

            {
                this.f35122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.f35122b;
                        dVar.getClass();
                        dVar.f35179d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f35122b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f35179d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35131l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f35131l.addListener(new c(this, i10));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: f8.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f35122b;

            {
                this.f35122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.f35122b;
                        dVar.getClass();
                        dVar.f35179d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f35122b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f35179d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f35132m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i5));
    }

    @Override // f8.n
    public final void s() {
        EditText editText = this.f35129i;
        if (editText != null) {
            editText.post(new com.applovin.adview.a(this, 24));
        }
    }

    public final void t(boolean z2) {
        boolean z10 = this.f35177b.c() == z2;
        if (z2 && !this.f35131l.isRunning()) {
            this.f35132m.cancel();
            this.f35131l.start();
            if (z10) {
                this.f35131l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f35131l.cancel();
        this.f35132m.start();
        if (z10) {
            this.f35132m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f35129i;
        if (editText != null) {
            return (editText.hasFocus() || this.f35179d.hasFocus()) && this.f35129i.getText().length() > 0;
        }
        return false;
    }
}
