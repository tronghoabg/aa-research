package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v7.widget.bn;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af {
    private ColorStateList A;

    /* renamed from: a, reason: collision with root package name */
    private final int f6834a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6835b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6836c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f6837d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f6838e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f6839f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f6840g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f6841h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f6842i;

    /* renamed from: j, reason: collision with root package name */
    private int f6843j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f6844k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f6845l;
    private final float m;
    private int n;
    private int o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private CharSequence s;
    private int t;
    private int u;
    private ColorStateList v;
    private CharSequence w;
    private boolean x;
    private TextView y;
    private int z;

    public af(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f6840g = context;
        this.f6841h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f6834a = com.google.android.material.internal.t.e(context, R.attr.motionDurationShort4, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8);
        this.f6835b = com.google.android.material.internal.t.e(context, R.attr.motionDurationMedium4, 167);
        this.f6836c = com.google.android.material.internal.t.e(context, R.attr.motionDurationShort4, 167);
        this.f6837d = com.google.android.material.k.f.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, com.google.android.material.a.a.f6176d);
        TimeInterpolator timeInterpolator = com.google.android.material.a.a.f6173a;
        this.f6838e = com.google.android.material.k.f.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, timeInterpolator);
        this.f6839f = com.google.android.material.k.f.d(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    static final boolean A(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private final int B(boolean z, int i2, int i3) {
        return z ? this.f6840g.getResources().getDimensionPixelSize(i2) : i3;
    }

    private final TextView C(int i2) {
        if (i2 == 1) {
            return this.r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.y;
    }

    private final void D(List list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            boolean z2 = i4 == i2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i4 == i2 ? 1.0f : 0.0f);
            objectAnimatorOfFloat.setDuration(z2 ? this.f6835b : this.f6836c);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.f6838e : this.f6839f);
            if (i4 == i2 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(this.f6836c);
            }
            list.add(objectAnimatorOfFloat);
            if (i4 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f6834a);
            objectAnimatorOfFloat2.setInterpolator(this.f6837d);
            objectAnimatorOfFloat2.setStartDelay(this.f6836c);
            list.add(objectAnimatorOfFloat2);
        }
    }

    private final void E(int i2, int i3, boolean z) {
        TextView textViewC;
        TextView textViewC2;
        af afVar = this;
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            afVar.f6845l = animatorSet;
            ArrayList arrayList = new ArrayList();
            afVar.D(arrayList, afVar.x, afVar.y, 2, i2, i3);
            afVar.D(arrayList, afVar.q, afVar.r, 1, i2, i3);
            int size = arrayList.size();
            long jMax = 0;
            for (int i4 = 0; i4 < size; i4++) {
                Animator animator = (Animator) arrayList.get(i4);
                jMax = Math.max(jMax, animator.getStartDelay() + animator.getDuration());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            ae aeVar = new ae(this, i3, C(i2), i2, afVar.C(i3));
            afVar = this;
            animatorSet.addListener(aeVar);
            animatorSet.start();
        } else if (i2 != i3) {
            if (i3 != 0 && (textViewC2 = afVar.C(i3)) != null) {
                textViewC2.setVisibility(0);
                textViewC2.setAlpha(1.0f);
            }
            if (i2 != 0 && (textViewC = C(i2)) != null) {
                textViewC.setVisibility(4);
                if (i2 == 1) {
                    textViewC.setText((CharSequence) null);
                }
            }
            afVar.n = i3;
        }
        TextInputLayout textInputLayout = afVar.f6841h;
        textInputLayout.J();
        textInputLayout.L(z);
        textInputLayout.M();
    }

    private final boolean F(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f6841h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.o == this.n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    final int a() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    final ColorStateList b() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    final CharSequence d() {
        return this.p;
    }

    final CharSequence e() {
        return this.w;
    }

    final void g(TextView textView, int i2) {
        if (this.f6842i == null && this.f6844k == null) {
            Context context = this.f6840g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f6842i = linearLayout;
            linearLayout.setOrientation(0);
            TextInputLayout textInputLayout = this.f6841h;
            textInputLayout.addView(this.f6842i, -1, -2);
            this.f6844k = new FrameLayout(context);
            this.f6842i.addView(this.f6844k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.f6797a != null) {
                h();
            }
        }
        if (A(i2)) {
            this.f6844k.setVisibility(0);
            this.f6844k.addView(textView);
        } else {
            this.f6842i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f6842i.setVisibility(0);
        this.f6843j++;
    }

    final void h() {
        EditText editText;
        if (this.f6842i == null || (editText = this.f6841h.f6797a) == null) {
            return;
        }
        Context context = this.f6840g;
        boolean zQ = com.google.android.material.internal.t.q(context);
        this.f6842i.setPaddingRelative(B(zQ, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), B(zQ, R.dimen.material_helper_text_font_1_3_padding_top, context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), B(zQ, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
    }

    final void i() {
        Animator animator = this.f6845l;
        if (animator != null) {
            animator.cancel();
        }
    }

    final void j() {
        this.p = null;
        i();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        E(this.n, this.o, F(this.r, ""));
    }

    final void k(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6842i;
        if (linearLayout == null) {
            return;
        }
        if (!A(i2) || (frameLayout = this.f6844k) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.f6843j - 1;
        this.f6843j = i3;
        LinearLayout linearLayout2 = this.f6842i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    final void l(int i2) {
        this.t = i2;
        TextView textView = this.r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i2);
        }
    }

    final void m(CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    final void n(boolean z) {
        if (this.q == z) {
            return;
        }
        i();
        if (z) {
            bn bnVar = new bn(this.f6840g);
            this.r = bnVar;
            bnVar.setId(R.id.textinput_error);
            this.r.setTextAlignment(5);
            o(this.u);
            p(this.v);
            m(this.s);
            l(this.t);
            this.r.setVisibility(4);
            g(this.r, 0);
        } else {
            j();
            k(this.r, 0);
            this.r = null;
            TextInputLayout textInputLayout = this.f6841h;
            textInputLayout.J();
            textInputLayout.M();
        }
        this.q = z;
    }

    final void o(int i2) {
        this.u = i2;
        TextView textView = this.r;
        if (textView != null) {
            this.f6841h.H(textView, i2);
        }
    }

    final void p(ColorStateList colorStateList) {
        this.v = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    final void q(int i2) {
        this.z = i2;
        TextView textView = this.y;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i2);
        }
    }

    final void r(boolean z) {
        if (this.x == z) {
            return;
        }
        i();
        if (z) {
            bn bnVar = new bn(this.f6840g);
            this.y = bnVar;
            bnVar.setId(R.id.textinput_helper_text);
            this.y.setTextAlignment(5);
            this.y.setVisibility(4);
            this.y.setImportantForAccessibility(2);
            q(this.z);
            s(this.A);
            g(this.y, 1);
        } else {
            i();
            int i2 = this.n;
            if (i2 == 2) {
                this.o = 0;
            }
            E(i2, this.o, F(this.y, ""));
            k(this.y, 1);
            this.y = null;
            TextInputLayout textInputLayout = this.f6841h;
            textInputLayout.J();
            textInputLayout.M();
        }
        this.x = z;
    }

    final void s(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    final void t(CharSequence charSequence) {
        i();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i2 = this.n;
        if (i2 != 1) {
            this.o = 1;
        }
        E(i2, this.o, F(this.r, charSequence));
    }

    final void u(CharSequence charSequence) {
        i();
        this.w = charSequence;
        this.y.setText(charSequence);
        int i2 = this.n;
        if (i2 != 2) {
            this.o = 2;
        }
        E(i2, this.o, F(this.y, charSequence));
    }

    final boolean v() {
        return (this.o != 1 || this.r == null || TextUtils.isEmpty(this.p)) ? false : true;
    }

    final boolean w() {
        return (this.o != 2 || this.y == null || TextUtils.isEmpty(this.w)) ? false : true;
    }

    final boolean x() {
        return this.q;
    }

    final boolean y() {
        return this.x;
    }
}
