package f8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.S;
import q.Y;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f35186A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f35187B;

    /* renamed from: a, reason: collision with root package name */
    public final int f35188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35190c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f35191d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f35192e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f35193f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f35194g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f35195h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f35196i;

    /* renamed from: j, reason: collision with root package name */
    public int f35197j;
    public FrameLayout k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f35198l;

    /* renamed from: m, reason: collision with root package name */
    public final float f35199m;

    /* renamed from: n, reason: collision with root package name */
    public int f35200n;

    /* renamed from: o, reason: collision with root package name */
    public int f35201o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f35202p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35203q;

    /* renamed from: r, reason: collision with root package name */
    public Y f35204r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f35205s;

    /* renamed from: t, reason: collision with root package name */
    public int f35206t;

    /* renamed from: u, reason: collision with root package name */
    public int f35207u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f35208v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f35209w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f35210x;

    /* renamed from: y, reason: collision with root package name */
    public Y f35211y;

    /* renamed from: z, reason: collision with root package name */
    public int f35212z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f35194g = context;
        this.f35195h = textInputLayout;
        this.f35199m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f35188a = Ba.c.J(context, R.attr.motionDurationShort4, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f35189b = Ba.c.J(context, R.attr.motionDurationMedium4, 167);
        this.f35190c = Ba.c.J(context, R.attr.motionDurationShort4, 167);
        this.f35191d = Ba.c.K(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, J7.a.f5722d);
        LinearInterpolator linearInterpolator = J7.a.f5719a;
        this.f35192e = Ba.c.K(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f35193f = Ba.c.K(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(Y y10, int i5) {
        if (this.f35196i == null && this.k == null) {
            Context context = this.f35194g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f35196i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f35196i;
            TextInputLayout textInputLayout = this.f35195h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f35196i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i5 == 0 || i5 == 1) {
            this.k.setVisibility(0);
            this.k.addView(y10);
        } else {
            this.f35196i.addView(y10, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f35196i.setVisibility(0);
        this.f35197j++;
    }

    public final void b() {
        if (this.f35196i != null) {
            TextInputLayout textInputLayout = this.f35195h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f35194g;
                boolean zF = Ba.c.F(context);
                LinearLayout linearLayout = this.f35196i;
                WeakHashMap weakHashMap = S.f38779a;
                int paddingStart = editText.getPaddingStart();
                if (zF) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zF) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zF) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f35198l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z2, Y y10, int i5, int i10, int i11) {
        if (y10 == null || !z2) {
            return;
        }
        if (i5 == i11 || i5 == i10) {
            boolean z10 = i11 == i5;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(y10, (Property<Y, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i12 = this.f35190c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f35189b : i12);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f35192e : this.f35193f);
            if (i5 == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i5 || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(y10, (Property<Y, Float>) View.TRANSLATION_Y, -this.f35199m, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            objectAnimatorOfFloat2.setDuration(this.f35188a);
            objectAnimatorOfFloat2.setInterpolator(this.f35191d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i5) {
        if (i5 == 1) {
            return this.f35204r;
        }
        if (i5 != 2) {
            return null;
        }
        return this.f35211y;
    }

    public final void f() {
        this.f35202p = null;
        c();
        if (this.f35200n == 1) {
            if (!this.f35210x || TextUtils.isEmpty(this.f35209w)) {
                this.f35201o = 0;
            } else {
                this.f35201o = 2;
            }
        }
        i(this.f35200n, this.f35201o, h(this.f35204r, ""));
    }

    public final void g(Y y10, int i5) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f35196i;
        if (linearLayout == null) {
            return;
        }
        if ((i5 == 0 || i5 == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(y10);
        } else {
            linearLayout.removeView(y10);
        }
        int i10 = this.f35197j - 1;
        this.f35197j = i10;
        LinearLayout linearLayout2 = this.f35196i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(Y y10, CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f38779a;
        TextInputLayout textInputLayout = this.f35195h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f35201o == this.f35200n && y10 != null && TextUtils.equals(y10.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i5, int i10, boolean z2) {
        TextView textViewE;
        TextView textViewE2;
        q qVar = this;
        if (i5 == i10) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            qVar.f35198l = animatorSet;
            ArrayList arrayList = new ArrayList();
            qVar.d(arrayList, qVar.f35210x, qVar.f35211y, 2, i5, i10);
            qVar.d(arrayList, qVar.f35203q, qVar.f35204r, 1, i5, i10);
            int size = arrayList.size();
            long jMax = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            o oVar = new o(this, i10, e(i5), i5, qVar.e(i10));
            qVar = this;
            animatorSet.addListener(oVar);
            animatorSet.start();
        } else if (i5 != i10) {
            if (i10 != 0 && (textViewE2 = qVar.e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i5 != 0 && (textViewE = e(i5)) != null) {
                textViewE.setVisibility(4);
                if (i5 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            qVar.f35200n = i10;
        }
        TextInputLayout textInputLayout = qVar.f35195h;
        textInputLayout.q();
        textInputLayout.t(z2, false);
        textInputLayout.w();
    }
}
