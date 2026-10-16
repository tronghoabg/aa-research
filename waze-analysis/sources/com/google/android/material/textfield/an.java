package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.bn;
import android.support.v7.widget.gc;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class an extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f6867a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f6868b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f6869c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f6870d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f6871e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f6872f;

    /* renamed from: g, reason: collision with root package name */
    private int f6873g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6874h;

    an(TextInputLayout textInputLayout, gc gcVar) {
        super(textInputLayout.getContext());
        this.f6867a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f6870d = checkableImageButton;
        bn bnVar = new bn(getContext());
        this.f6868b = bnVar;
        if (com.google.android.material.internal.t.q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        n();
        o();
        int[] iArr = al.f6863a;
        if (gcVar.s(70)) {
            this.f6871e = com.google.android.material.internal.t.o(getContext(), gcVar, 70);
        }
        if (gcVar.s(71)) {
            this.f6872f = com.waze.c.c.e.h(gcVar.c(71, -1), null);
        }
        if (gcVar.s(67)) {
            Drawable drawableJ = gcVar.j(67);
            checkableImageButton.setImageDrawable(drawableJ);
            if (drawableJ != null) {
                ad.b(textInputLayout, checkableImageButton, this.f6871e, this.f6872f);
                i(true);
                g();
            } else {
                i(false);
                n();
                o();
                h(null);
            }
            if (gcVar.s(66)) {
                h(gcVar.o(66));
            }
            checkableImageButton.a(gcVar.r(65, true));
        }
        int iB = gcVar.b(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iB < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iB != this.f6873g) {
            this.f6873g = iB;
            ad.d(checkableImageButton, iB);
        }
        if (gcVar.s(69)) {
            checkableImageButton.setScaleType(ad.a(gcVar.c(69, -1)));
        }
        bnVar.setVisibility(8);
        bnVar.setId(R.id.textinput_prefix_text);
        bnVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        bnVar.setAccessibilityLiveRegion(1);
        TextViewCompat.setTextAppearance(bnVar, gcVar.f(61, 0));
        if (gcVar.s(62)) {
            bnVar.setTextColor(gcVar.g(62));
        }
        CharSequence charSequenceO = gcVar.o(60);
        this.f6869c = true != TextUtils.isEmpty(charSequenceO) ? charSequenceO : null;
        bnVar.setText(charSequenceO);
        p();
        addView(checkableImageButton);
        addView(bnVar);
        checkableImageButton.b(new com.google.android.material.internal.b() { // from class: com.google.android.material.textfield.am
            @Override // com.google.android.material.internal.b
            public final void a() {
                an anVar = this.f6866a;
                ad.g(anVar.f6870d, anVar.e());
            }
        });
    }

    private final void p() {
        int i2 = 0;
        int i3 = (this.f6869c == null || this.f6874h) ? 8 : 0;
        if (this.f6870d.getVisibility() != 0 && i3 != 0) {
            i2 = 8;
        }
        setVisibility(i2);
        this.f6868b.setVisibility(i3);
        this.f6867a.U();
    }

    final int a() {
        int measuredWidth;
        if (l()) {
            CheckableImageButton checkableImageButton = this.f6870d;
            measuredWidth = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            measuredWidth = 0;
        }
        return getPaddingStart() + this.f6868b.getPaddingStart() + measuredWidth;
    }

    final Drawable b() {
        return this.f6870d.getDrawable();
    }

    final TextView c() {
        return this.f6868b;
    }

    final CharSequence d() {
        return this.f6869c;
    }

    final CharSequence e() {
        return this.f6870d.getContentDescription();
    }

    final void f(boolean z) {
        this.f6874h = z;
        p();
    }

    final void g() {
        ad.c(this.f6867a, this.f6870d, this.f6871e);
    }

    final void h(CharSequence charSequence) {
        if (e() != charSequence) {
            CheckableImageButton checkableImageButton = this.f6870d;
            checkableImageButton.setContentDescription(charSequence);
            ad.g(checkableImageButton, charSequence);
        }
    }

    final void i(boolean z) {
        EditText editText;
        if (l() != z) {
            if (!z && this.f6870d.hasFocus() && (editText = this.f6867a.f6797a) != null) {
                editText.requestFocus();
            }
            this.f6870d.setVisibility(true != z ? 8 : 0);
            k();
            p();
        }
    }

    final void j(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        TextView textView = this.f6868b;
        if (textView.getVisibility() != 0) {
            accessibilityNodeInfoCompat.setTraversalAfter(this.f6870d);
        } else {
            accessibilityNodeInfoCompat.setLabelFor(textView);
            accessibilityNodeInfoCompat.setTraversalAfter(textView);
        }
    }

    final void k() {
        EditText editText = this.f6867a.f6797a;
        if (editText == null) {
            return;
        }
        this.f6868b.setPaddingRelative(l() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    final boolean l() {
        return this.f6870d.getVisibility() == 0;
    }

    final void n() {
        ad.e(this.f6870d, null);
    }

    final void o() {
        ad.f(this.f6870d);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        k();
    }
}
