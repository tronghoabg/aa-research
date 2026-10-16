package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends ac {

    /* renamed from: e, reason: collision with root package name */
    private final int f6890e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6891f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f6892g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f6893h;

    /* renamed from: i, reason: collision with root package name */
    private EditText f6894i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f6895j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f6896k;

    /* renamed from: l, reason: collision with root package name */
    private AnimatorSet f6897l;
    private ValueAnimator m;

    h(ab abVar) {
        super(abVar);
        this.f6895j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.g(this.f6808a, view);
            }
        };
        this.f6896k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                h hVar = this.f6884a;
                hVar.o(hVar.v());
            }
        };
        this.f6890e = com.google.android.material.internal.t.e(abVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f6891f = com.google.android.material.internal.t.e(abVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f6892g = com.google.android.material.k.f.d(abVar.getContext(), R.attr.motionEasingLinearInterpolator, com.google.android.material.a.a.f6173a);
        this.f6893h = com.google.android.material.k.f.d(abVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6176d);
    }

    public static /* synthetic */ void g(h hVar, View view) {
        EditText editText = hVar.f6894i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (view.hasFocus()) {
            hVar.f6894i.requestFocus();
        }
        if (text != null) {
            text.clear();
        }
        hVar.A();
    }

    private final ValueAnimator n(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f6892g);
        valueAnimatorOfFloat.setDuration(this.f6890e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f6885a.f6828d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z) {
        boolean zC = this.f6826b.C();
        AnimatorSet animatorSet = this.f6897l;
        if (!z) {
            animatorSet.cancel();
            this.m.start();
            if (zC) {
                return;
            }
            this.m.end();
            return;
        }
        if (animatorSet.isRunning()) {
            return;
        }
        this.m.cancel();
        this.f6897l.start();
        if (zC) {
            this.f6897l.end();
        }
    }

    private final boolean v() {
        EditText editText = this.f6894i;
        if (editText == null) {
            return false;
        }
        boolean z = editText.hasFocus() || this.f6828d.hasFocus();
        int length = this.f6894i.getText().length();
        CharSequence charSequenceK = this.f6826b.k();
        if (z) {
            return length > 0 || charSequenceK != null;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.ac
    final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.google.android.material.textfield.ac
    final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // com.google.android.material.textfield.ac
    final View.OnClickListener c() {
        return this.f6895j;
    }

    @Override // com.google.android.material.textfield.ac
    final View.OnFocusChangeListener d() {
        return this.f6896k;
    }

    @Override // com.google.android.material.textfield.ac
    final View.OnFocusChangeListener e() {
        return this.f6896k;
    }

    @Override // com.google.android.material.textfield.ac
    public final void h(EditText editText) {
        this.f6894i = editText;
        this.f6825a.v(v());
    }

    @Override // com.google.android.material.textfield.ac
    final void i(boolean z) {
        if (this.f6826b.k() == null) {
            return;
        }
        o(z);
    }

    @Override // com.google.android.material.textfield.ac
    final void j() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f6893h);
        valueAnimatorOfFloat.setDuration(this.f6891f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = this.f6887a.f6828d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorN = n(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6897l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorN);
        this.f6897l.addListener(new f(this));
        ValueAnimator valueAnimatorN2 = n(1.0f, 0.0f);
        this.m = valueAnimatorN2;
        valueAnimatorN2.addListener(new g(this));
    }

    @Override // com.google.android.material.textfield.ac
    final void k() {
        EditText editText = this.f6894i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6886a.o(true);
                }
            });
        }
    }

    @Override // com.google.android.material.textfield.ac
    final void m() {
        if (this.f6826b.k() != null) {
            return;
        }
        o(v());
    }
}
