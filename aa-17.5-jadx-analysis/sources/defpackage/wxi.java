package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class wxi extends LinearLayout {
    public final TextView a;
    public CharSequence b;
    public final CheckableImageButton c;
    private final TextInputLayout d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private boolean h;

    public wxi(TextInputLayout textInputLayout, lah lahVar) {
        super(textInputLayout.getContext());
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.c = checkableImageButton;
        ka kaVar = new ka(getContext());
        this.a = kaVar;
        if (wub.j(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        i();
        j();
        int[] iArr = wxh.a;
        if (lahVar.y(70)) {
            this.e = wub.m(getContext(), lahVar, 70);
        }
        if (lahVar.y(71)) {
            this.f = a.R(lahVar.n(71, -1), null);
        }
        if (lahVar.y(67)) {
            Drawable drawableS = lahVar.s(67);
            checkableImageButton.setImageDrawable(drawableS);
            if (drawableS != null) {
                wpq.j(textInputLayout, checkableImageButton, this.e, this.f);
                f(true);
                d();
            } else {
                f(false);
                i();
                j();
                e(null);
            }
            if (lahVar.y(66)) {
                e(lahVar.u(66));
            }
            checkableImageButton.a(lahVar.x(65, true));
        }
        int iM = lahVar.m(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iM < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iM != this.g) {
            this.g = iM;
            wpq.l(checkableImageButton, iM);
        }
        if (lahVar.y(69)) {
            checkableImageButton.setScaleType(wpq.i(lahVar.n(69, -1)));
        }
        kaVar.setVisibility(8);
        kaVar.setId(R.id.textinput_prefix_text);
        kaVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        kaVar.setAccessibilityLiveRegion(1);
        kaVar.setTextAppearance(lahVar.q(61, 0));
        if (lahVar.y(62)) {
            kaVar.setTextColor(lahVar.r(62));
        }
        CharSequence charSequenceU = lahVar.u(60);
        this.b = true != TextUtils.isEmpty(charSequenceU) ? charSequenceU : null;
        kaVar.setText(charSequenceU);
        k();
        addView(checkableImageButton);
        addView(kaVar);
        checkableImageButton.d = new wwx(this, 2);
    }

    private final void k() {
        int i = 0;
        int i2 = (this.b == null || this.h) ? 8 : 0;
        if (this.c.getVisibility() != 0 && i2 != 0) {
            i = 8;
        }
        setVisibility(i);
        this.a.setVisibility(i2);
        this.d.D();
    }

    public final int a() {
        int measuredWidth;
        if (h()) {
            CheckableImageButton checkableImageButton = this.c;
            measuredWidth = checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd();
        } else {
            measuredWidth = 0;
        }
        return getPaddingStart() + this.a.getPaddingStart() + measuredWidth;
    }

    final CharSequence b() {
        return this.c.getContentDescription();
    }

    public final void c(boolean z) {
        this.h = z;
        k();
    }

    public final void d() {
        wpq.k(this.d, this.c, this.e);
    }

    final void e(CharSequence charSequence) {
        if (b() != charSequence) {
            CheckableImageButton checkableImageButton = this.c;
            checkableImageButton.setContentDescription(charSequence);
            wpq.o(checkableImageButton, charSequence);
        }
    }

    final void f(boolean z) {
        EditText editText;
        if (h() != z) {
            if (!z && this.c.hasFocus() && (editText = this.d.c) != null) {
                editText.requestFocus();
            }
            this.c.setVisibility(true != z ? 8 : 0);
            g();
            k();
        }
    }

    final void g() {
        EditText editText = this.d.c;
        if (editText == null) {
            return;
        }
        this.a.setPaddingRelative(h() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    final boolean h() {
        return this.c.getVisibility() == 0;
    }

    final void i() {
        wpq.m(this.c, null);
    }

    final void j() {
        wpq.n(this.c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        g();
    }
}
