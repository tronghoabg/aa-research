package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wwn extends wxb {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public wwn(wxa wxaVar) {
        super(wxaVar);
        this.j = new wwt(this, 1);
        this.k = new krj(this, 11);
        this.b = woy.u(wxaVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = woy.u(wxaVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = woy.C(wxaVar.getContext(), R.attr.motionEasingLinearInterpolator, wkn.a);
        this.i = woy.C(wxaVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, wkn.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.setDuration(this.b);
        valueAnimatorOfFloat.addUpdateListener(new wwk(this, 1));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.wxb
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.wxb
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.wxb
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.wxb
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.wxb
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean zS = this.f.s();
        AnimatorSet animatorSet = this.l;
        if (!z) {
            animatorSet.cancel();
            this.m.start();
            if (zS) {
                return;
            }
            this.m.end();
            return;
        }
        if (animatorSet.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (zS) {
            this.l.end();
        }
    }

    @Override // defpackage.wxb
    public final void g(EditText editText) {
        this.a = editText;
        this.e.j(k());
    }

    @Override // defpackage.wxb
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.wxb
    public final void i() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.i);
        valueAnimatorOfFloat.setDuration(this.c);
        valueAnimatorOfFloat.addUpdateListener(new wwk(this, 0));
        ValueAnimator valueAnimatorM = m(BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorM);
        this.l.addListener(new wwl(this));
        ValueAnimator valueAnimatorM2 = m(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.m = valueAnimatorM2;
        valueAnimatorM2.addListener(new wwm(this));
    }

    @Override // defpackage.wxb
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new wil(this, 20));
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText == null) {
            return false;
        }
        boolean z = editText.hasFocus() || this.h.hasFocus();
        int length = this.a.getText().length();
        CharSequence charSequence = this.f.h;
        if (z) {
            return length > 0 || charSequence != null;
        }
        return false;
    }

    @Override // defpackage.wxb
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
