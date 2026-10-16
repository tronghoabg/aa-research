package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class wxa extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final wwz n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private AccessibilityManager.TouchExplorationStateChangeListener s;
    private final ykd t;

    public wxa(TextInputLayout textInputLayout, lah lahVar) {
        super(textInputLayout.getContext());
        int i = 0;
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new wwy(this);
        ykd ykdVar = new ykd(this, null);
        this.t = ykdVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonU = u(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.b = checkableImageButtonU;
        CheckableImageButton checkableImageButtonU2 = u(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.d = checkableImageButtonU2;
        this.n = new wwz(this, lahVar);
        ka kaVar = new ka(getContext());
        this.i = kaVar;
        int[] iArr = wxh.a;
        if (lahVar.y(38)) {
            this.c = wub.m(getContext(), lahVar, 38);
        }
        if (lahVar.y(39)) {
            this.m = a.R(lahVar.n(39, -1), null);
        }
        if (lahVar.y(37)) {
            n(lahVar.s(37));
        }
        checkableImageButtonU.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonU.setImportantForAccessibility(2);
        checkableImageButtonU.setClickable(false);
        checkableImageButtonU.c = false;
        checkableImageButtonU.a(false);
        checkableImageButtonU.setFocusable(false);
        if (!lahVar.y(54)) {
            if (lahVar.y(32)) {
                this.f = wub.m(getContext(), lahVar, 32);
            }
            if (lahVar.y(33)) {
                this.g = a.R(lahVar.n(33, -1), null);
            }
        }
        int i2 = 1;
        if (lahVar.y(30)) {
            l(lahVar.n(30, 0));
            if (lahVar.y(27)) {
                k(lahVar.u(27));
            }
            j(lahVar.x(26, true));
        } else if (lahVar.y(54)) {
            if (lahVar.y(55)) {
                this.f = wub.m(getContext(), lahVar, 55);
            }
            if (lahVar.y(56)) {
                this.g = a.R(lahVar.n(56, -1), null);
            }
            l(lahVar.x(54, false) ? 1 : 0);
            k(lahVar.u(52));
        }
        int iM = lahVar.m(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iM < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iM != this.p) {
            this.p = iM;
            wpq.l(checkableImageButtonU2, iM);
            wpq.l(checkableImageButtonU, iM);
        }
        if (lahVar.y(31)) {
            ImageView.ScaleType scaleTypeI = wpq.i(lahVar.n(31, -1));
            checkableImageButtonU2.setScaleType(scaleTypeI);
            checkableImageButtonU.setScaleType(scaleTypeI);
        }
        kaVar.setVisibility(8);
        kaVar.setId(R.id.textinput_suffix_text);
        kaVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        kaVar.setAccessibilityLiveRegion(1);
        kaVar.setTextAppearance(lahVar.q(73, 0));
        if (lahVar.y(74)) {
            kaVar.setTextColor(lahVar.r(74));
        }
        CharSequence charSequenceU = lahVar.u(72);
        this.h = true != TextUtils.isEmpty(charSequenceU) ? charSequenceU : null;
        kaVar.setText(charSequenceU);
        w();
        frameLayout.addView(checkableImageButtonU2);
        addView(kaVar);
        addView(frameLayout);
        addView(checkableImageButtonU);
        checkableImageButtonU.d = new wwx(this, i2);
        checkableImageButtonU2.d = new wwx(this, i);
        textInputLayout.n.add(ykdVar);
        if (textInputLayout.c != null) {
            ykdVar.f(textInputLayout);
        }
        addOnAttachStateChangeListener(new hy(this, 6));
    }

    private final CheckableImageButton u(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (wub.j(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void v() {
        int i = 0;
        this.l.setVisibility((this.d.getVisibility() != 0 || t()) ? 8 : 0);
        boolean z = (this.h == null || this.q) ? 8 : false;
        if (!s() && !t() && z) {
            i = 8;
        }
        setVisibility(i);
    }

    private final void w() {
        TextView textView = this.i;
        int visibility = textView.getVisibility();
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            c().h(i == 0);
        }
        v();
        textView.setVisibility(i);
        this.a.D();
    }

    public final int a() {
        int marginStart;
        if (s() || t()) {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final wxb c() {
        int i = this.e;
        wwz wwzVar = this.n;
        SparseArray sparseArray = wwzVar.a;
        wxb wwoVar = (wxb) sparseArray.get(i);
        if (wwoVar == null) {
            if (i == -1) {
                wwoVar = new wwo(wwzVar.b);
            } else if (i == 0) {
                wwoVar = new wxb(wwzVar.b);
            } else if (i == 1) {
                wwoVar = new wxg(wwzVar.b, wwzVar.d);
            } else if (i == 2) {
                wwoVar = new wwn(wwzVar.b);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(a.bp(i, "Invalid end icon mode: "));
                }
                wwoVar = new www(wwzVar.b);
            }
            sparseArray.append(i, wwoVar);
        }
        return wwoVar;
    }

    final CharSequence d() {
        return this.d.getContentDescription();
    }

    public final void e() {
        AccessibilityManager accessibilityManager;
        if (this.s == null || (accessibilityManager = this.r) == null || !isAttachedToWindow()) {
            return;
        }
        accessibilityManager.addTouchExplorationStateChangeListener(this.s);
    }

    public final void f(boolean z) {
        this.q = z;
        w();
    }

    public final void g() {
        wpq.k(this.a, this.d, this.f);
    }

    final void h(boolean z) {
        CheckableImageButton checkableImageButton;
        boolean zIsActivated;
        CheckableImageButton checkableImageButton2;
        boolean z2;
        wxb wxbVarC = c();
        boolean z3 = false;
        boolean z4 = true;
        if (wxbVarC.s() && (z2 = (checkableImageButton2 = this.d).a) != wxbVarC.t()) {
            checkableImageButton2.setChecked(!z2);
            z3 = true;
        }
        if (!wxbVarC.q() || (zIsActivated = (checkableImageButton = this.d).isActivated()) == wxbVarC.r()) {
            z4 = z3;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            g();
        }
    }

    public final void i() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.s;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.r) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    final void j(boolean z) {
        this.d.a(z);
    }

    final void k(CharSequence charSequence) {
        if (d() != charSequence) {
            CheckableImageButton checkableImageButton = this.d;
            checkableImageButton.setContentDescription(charSequence);
            wpq.o(checkableImageButton, charSequence);
        }
    }

    final void l(int i) {
        if (this.e == i) {
            return;
        }
        wxb wxbVarC = c();
        i();
        this.s = null;
        wxbVarC.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((wxn) it.next()).a();
        }
        m(i != 0);
        wxb wxbVarC2 = c();
        int iB = this.n.c;
        if (iB == 0) {
            iB = wxbVarC2.b();
        }
        Drawable drawableE = iB != 0 ? ca.e(getContext(), iB) : null;
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawableE);
        if (drawableE != null) {
            wpq.j(this.a, checkableImageButton, this.f, this.g);
            g();
        }
        j(wxbVarC2.s());
        TextInputLayout textInputLayout = this.a;
        int i2 = textInputLayout.m;
        if (!wxbVarC2.o(i2)) {
            throw new IllegalStateException(a.bo(i, i2, "The current box background mode ", " is not supported by the end icon mode "));
        }
        wxbVarC2.i();
        this.s = wxbVarC2.A();
        e();
        wpq.m(checkableImageButton, wxbVarC2.c());
        int iA = wxbVarC2.a();
        k(iA != 0 ? getResources().getText(iA) : null);
        EditText editText = this.j;
        if (editText != null) {
            wxbVarC2.g(editText);
            o(wxbVarC2);
        }
        wpq.j(textInputLayout, checkableImageButton, this.f, this.g);
        h(true);
    }

    public final void m(boolean z) {
        EditText editText;
        if (s() != z) {
            if (!z && this.d.hasFocus() && (editText = this.j) != null) {
                editText.requestFocus();
            }
            this.d.setVisibility(true != z ? 8 : 0);
            v();
            q();
            this.a.D();
        }
    }

    final void n(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.b;
        checkableImageButton.setImageDrawable(drawable);
        p();
        wpq.j(this.a, checkableImageButton, this.c, this.m);
    }

    public final void o(wxb wxbVar) {
        EditText editText = this.j;
        if (editText == null) {
            return;
        }
        if (wxbVar.d() != null) {
            editText.setOnFocusChangeListener(wxbVar.d());
        }
        if (wxbVar.e() != null) {
            this.d.setOnFocusChangeListener(wxbVar.e());
        }
    }

    public final void p() {
        CheckableImageButton checkableImageButton = this.b;
        int i = 8;
        if (checkableImageButton.getDrawable() != null) {
            TextInputLayout textInputLayout = this.a;
            if (textInputLayout.d.g && textInputLayout.C()) {
                i = 0;
            }
        }
        checkableImageButton.setVisibility(i);
        v();
        q();
        if (r()) {
            return;
        }
        this.a.D();
    }

    public final void q() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.c == null) {
            return;
        }
        int paddingEnd = 0;
        if (!s() && !t()) {
            paddingEnd = textInputLayout.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.c.getPaddingTop(), paddingEnd, textInputLayout.c.getPaddingBottom());
    }

    public final boolean r() {
        return this.e != 0;
    }

    public final boolean s() {
        return this.l.getVisibility() == 0 && this.d.getVisibility() == 0;
    }

    public final boolean t() {
        return this.b.getVisibility() == 0;
    }
}
