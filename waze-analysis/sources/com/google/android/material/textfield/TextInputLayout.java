package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.support.v7.widget.bn;
import android.support.v7.widget.cg;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e, reason: collision with root package name */
    private static final int[][] f6796e = {new int[]{R.attr.state_pressed}, new int[0]};
    private Fade A;
    private ColorStateList B;
    private ColorStateList C;
    private ColorStateList D;
    private ColorStateList E;
    private boolean F;
    private CharSequence G;
    private boolean H;
    private com.google.android.material.k.k I;
    private com.google.android.material.k.k J;
    private StateListDrawable K;
    private boolean L;
    private com.google.android.material.k.k M;
    private com.google.android.material.k.k N;
    private com.google.android.material.k.r O;
    private boolean P;
    private final int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a, reason: collision with root package name */
    EditText f6797a;
    private boolean aA;
    private boolean aB;
    private int aa;
    private final Rect ab;
    private final Rect ac;
    private final RectF ad;
    private Drawable ae;
    private int af;
    private final LinkedHashSet ag;
    private Drawable ah;
    private int ai;
    private Drawable aj;
    private ColorStateList ak;
    private ColorStateList al;
    private int am;
    private int an;
    private int ao;
    private ColorStateList ap;
    private int aq;
    private int ar;
    private int as;
    private int at;
    private int au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private ValueAnimator ay;
    private boolean az;

    /* renamed from: b, reason: collision with root package name */
    boolean f6798b;

    /* renamed from: c, reason: collision with root package name */
    int f6799c;

    /* renamed from: d, reason: collision with root package name */
    final com.google.android.material.internal.f f6800d;

    /* renamed from: f, reason: collision with root package name */
    private final FrameLayout f6801f;

    /* renamed from: g, reason: collision with root package name */
    private final an f6802g;

    /* renamed from: h, reason: collision with root package name */
    private final ab f6803h;

    /* renamed from: i, reason: collision with root package name */
    private final int f6804i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f6805j;

    /* renamed from: k, reason: collision with root package name */
    private int f6806k;

    /* renamed from: l, reason: collision with root package name */
    private int f6807l;
    private int m;
    private int n;
    private final af o;
    private int p;
    private boolean q;
    private TextView r;
    private int s;
    private int t;
    private CharSequence u;
    private boolean v;
    private TextView w;
    private ColorStateList x;
    private int y;
    private Fade z;

    /* JADX WARN: Removed duplicated region for block: B:101:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final int W() {
        if (this.F) {
            int i2 = this.R;
            if (i2 == 0) {
                return (int) this.f6800d.b();
            }
            if (i2 == 2) {
                boolean zAv = av();
                com.google.android.material.internal.f fVar = this.f6800d;
                return zAv ? (int) (fVar.b() / 2.0f) : Math.max(0, (int) (fVar.b() - (fVar.a() / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int X(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.p()
            if (r2 == 0) goto L1d
            com.google.android.material.textfield.an r0 = r0.f6802g
            int r0 = r0.a()
        Le:
            int r1 = r1 + r0
            return r1
        L10:
            java.lang.CharSequence r2 = r0.q()
            if (r2 == 0) goto L1d
            com.google.android.material.textfield.ab r0 = r0.f6803h
            int r0 = r0.b()
            goto Le
        L1d:
            android.widget.EditText r0 = r0.f6797a
            int r0 = r0.getCompoundPaddingLeft()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.X(int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int Y(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.q()
            if (r2 == 0) goto L1d
            com.google.android.material.textfield.ab r0 = r0.f6803h
            int r0 = r0.b()
        Le:
            int r1 = r1 - r0
            return r1
        L10:
            java.lang.CharSequence r2 = r0.p()
            if (r2 == 0) goto L1d
            com.google.android.material.textfield.an r0 = r0.f6802g
            int r0 = r0.a()
            goto Le
        L1d:
            android.widget.EditText r0 = r0.f6797a
            int r0 = r0.getCompoundPaddingRight()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Y(int, boolean):int");
    }

    private final Rect Z(Rect rect) {
        if (this.f6797a == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ac;
        boolean zB = com.google.android.material.internal.t.b(this);
        rect2.bottom = rect.bottom;
        int i2 = this.R;
        if (i2 == 1) {
            rect2.left = X(rect.left, zB);
            rect2.top = rect.top + this.S;
            rect2.right = Y(rect.right, zB);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = X(rect.left, zB);
            rect2.top = getPaddingTop();
            rect2.right = Y(rect.right, zB);
            return rect2;
        }
        rect2.left = rect.left + this.f6797a.getPaddingLeft();
        rect2.top = rect.top - W();
        rect2.right = rect.right - this.f6797a.getPaddingRight();
        return rect2;
    }

    private final Drawable aa() throws Resources.NotFoundException {
        com.google.android.material.k.k kVar = this.J;
        if (kVar != null) {
            return kVar;
        }
        com.google.android.material.k.k kVarAc = ac(true);
        this.J = kVarAc;
        return kVarAc;
    }

    private final Fade ab() {
        Fade fade = new Fade();
        fade.setDuration(com.google.android.material.internal.t.e(getContext(), com.waze.R.attr.motionDurationShort2, 87));
        fade.setInterpolator(com.google.android.material.k.f.d(getContext(), com.waze.R.attr.motionEasingLinearInterpolator, com.google.android.material.a.a.f6173a));
        return fade;
    }

    private final com.google.android.material.k.k ac(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.waze.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.f6797a;
        float fA = editText instanceof ai ? ((ai) editText).a() : getResources().getDimensionPixelOffset(com.waze.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f2 = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.waze.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.k.p pVar = new com.google.android.material.k.p();
        pVar.o(f2);
        pVar.q(f2);
        pVar.k(dimensionPixelOffset);
        pVar.m(dimensionPixelOffset);
        com.google.android.material.k.r rVarI = pVar.i();
        EditText editText2 = this.f6797a;
        ColorStateList colorStateListD = editText2 instanceof ai ? ((ai) editText2).d() : null;
        Context context = getContext();
        int i2 = com.google.android.material.k.k.f6666b;
        if (colorStateListD == null) {
            colorStateListD = ColorStateList.valueOf(com.google.android.material.focus.d.g(context, com.google.android.material.k.k.class.getSimpleName()));
        }
        com.google.android.material.k.k kVar = new com.google.android.material.k.k();
        kVar.r(context);
        kVar.v(colorStateListD);
        kVar.u(fA);
        kVar.e(rVarI);
        kVar.K(dimensionPixelOffset2, dimensionPixelOffset2);
        return kVar;
    }

    private final void ad() {
        if (this.f6797a == null || this.R != 1) {
            return;
        }
        if (!av()) {
            EditText editText = this.f6797a;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f6800d.b() + this.f6804i), this.f6797a.getPaddingEnd(), getResources().getDimensionPixelSize(com.waze.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (com.google.android.material.internal.t.r(getContext())) {
            EditText editText2 = this.f6797a;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.waze.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f6797a.getPaddingEnd(), getResources().getDimensionPixelSize(com.waze.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.google.android.material.internal.t.q(getContext())) {
            EditText editText3 = this.f6797a;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.waze.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f6797a.getPaddingEnd(), getResources().getDimensionPixelSize(com.waze.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void ae() {
        com.google.android.material.k.k kVar = this.I;
        if (kVar == null) {
            return;
        }
        com.google.android.material.k.r rVarO = kVar.o();
        com.google.android.material.k.r rVar = this.O;
        if (rVarO != rVar) {
            this.I.e(rVar);
        }
        if (this.R == 2 && at()) {
            this.I.z(this.T, this.W);
        }
        int iCompositeColors = this.aa;
        if (this.R == 1) {
            iCompositeColors = ColorUtils.compositeColors(this.aa, com.google.android.material.focus.d.c(getContext(), com.waze.R.attr.colorSurface, 0));
        }
        this.aa = iCompositeColors;
        this.I.v(ColorStateList.valueOf(iCompositeColors));
        com.google.android.material.k.k kVar2 = this.M;
        if (kVar2 != null && this.N != null) {
            if (at()) {
                kVar2.v(this.f6797a.isFocused() ? ColorStateList.valueOf(this.am) : ColorStateList.valueOf(this.W));
                this.N.v(ColorStateList.valueOf(this.W));
            }
            invalidate();
        }
        K();
    }

    private final void af() {
        if (au()) {
            ((l) this.I).O(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void ag() {
        TextView textView = this.w;
        if (textView == null || !this.v) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.beginDelayedTransition(this.f6801f, this.A);
        this.w.setVisibility(4);
    }

    private final void ah() {
        int i2 = this.R;
        if (i2 == 0) {
            this.I = null;
            this.M = null;
            this.N = null;
        } else if (i2 == 1) {
            this.I = new com.google.android.material.k.k(this.O);
            this.M = new com.google.android.material.k.k();
            this.N = new com.google.android.material.k.k();
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException(i2 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.F || (this.I instanceof l)) {
                this.I = new com.google.android.material.k.k(this.O);
            } else {
                com.google.android.material.k.r rVar = this.O;
                int i3 = l.f6898d;
                if (rVar == null) {
                    rVar = new com.google.android.material.k.r();
                }
                this.I = new k(new j(rVar, new RectF()));
            }
            this.M = null;
            this.N = null;
        }
        K();
        M();
        if (this.R == 1) {
            if (com.google.android.material.internal.t.r(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.waze.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.google.android.material.internal.t.q(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.waze.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        ad();
        if (this.R != 0) {
            ao();
        }
        EditText editText = this.f6797a;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.R;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(aa());
                    return;
                }
                if (i4 == 1) {
                    if (this.K == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.K = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, aa());
                        this.K.addState(new int[0], ac(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.K);
                }
            }
        }
    }

    private final void ai() {
        if (au()) {
            RectF rectF = this.ad;
            this.f6800d.l(rectF, this.f6797a.getWidth(), this.f6797a.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f2 = rectF.left;
            float f3 = this.Q;
            rectF.left = f2 - f3;
            rectF.right += f3;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.T);
            rectF.top = 0.0f;
            ((l) this.I).O(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private static void aj(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                aj((ViewGroup) childAt, z);
            }
        }
    }

    private final void ak(boolean z) {
        if (this.v == z) {
            return;
        }
        TextView textView = this.w;
        if (!z) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.w = null;
        } else if (textView != null) {
            this.f6801f.addView(textView);
            this.w.setVisibility(0);
        }
        this.v = z;
    }

    private final void al() {
        if (this.r != null) {
            EditText editText = this.f6797a;
            I(editText == null ? null : editText.getText());
        }
    }

    private final void am() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.r;
        if (textView != null) {
            H(textView, this.q ? this.s : this.t);
            if (!this.q && (colorStateList2 = this.B) != null) {
                this.r.setTextColor(colorStateList2);
            }
            if (!this.q || (colorStateList = this.C) == null) {
                return;
            }
            this.r.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void an() {
        /*
            r4 = this;
            android.content.res.ColorStateList r0 = r4.D
            if (r0 != 0) goto L29
            android.content.Context r0 = r4.getContext()
            r1 = 2130968887(0x7f040137, float:1.754644E38)
            android.util.TypedValue r1 = com.google.android.material.internal.t.g(r0, r1)
            r2 = 0
            if (r1 != 0) goto L14
        L12:
            r0 = r2
            goto L29
        L14:
            int r3 = r1.resourceId
            if (r3 == 0) goto L1f
            int r1 = r1.resourceId
            android.content.res.ColorStateList r0 = androidx.core.content.ContextCompat.getColorStateList(r0, r1)
            goto L29
        L1f:
            int r0 = r1.data
            if (r0 == 0) goto L12
            int r0 = r1.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L29:
            android.widget.EditText r1 = r4.f6797a
            if (r1 == 0) goto L54
            android.graphics.drawable.Drawable r1 = com.waze.mg$$ExternalSyntheticApiModelOutline1.m(r1)
            if (r1 != 0) goto L34
            goto L54
        L34:
            android.widget.EditText r1 = r4.f6797a
            android.graphics.drawable.Drawable r1 = com.waze.mg$$ExternalSyntheticApiModelOutline1.m(r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            boolean r2 = r4.T()
            if (r2 != 0) goto L4c
            android.widget.TextView r2 = r4.r
            if (r2 == 0) goto L51
            boolean r2 = r4.q
            if (r2 == 0) goto L51
        L4c:
            android.content.res.ColorStateList r4 = r4.E
            if (r4 == 0) goto L51
            r0 = r4
        L51:
            r1.setTintList(r0)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.an():void");
    }

    private final void ao() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.f6801f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iW = W();
            if (iW != layoutParams.topMargin) {
                layoutParams.topMargin = iW;
                frameLayout.requestLayout();
            }
        }
    }

    private final void ap(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f6797a;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f6797a;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.ak;
        if (colorStateList2 != null) {
            this.f6800d.p(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.ak;
            int colorForState = this.au;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            this.f6800d.p(ColorStateList.valueOf(colorForState));
        } else if (T()) {
            this.f6800d.p(this.o.b());
        } else if (this.q && (textView = this.r) != null) {
            this.f6800d.p(textView.getTextColors());
        } else if (z4 && (colorStateList = this.al) != null) {
            this.f6800d.t(colorStateList);
        }
        if (z3 || !this.aw || (isEnabled() && z4)) {
            if (z2 || this.av) {
                ValueAnimator valueAnimator = this.ay;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.ay.cancel();
                }
                if (z && this.ax) {
                    u(1.0f);
                } else {
                    this.f6800d.B(1.0f);
                }
                this.av = false;
                if (au()) {
                    ai();
                }
                aq();
                this.f6802g.f(false);
                this.f6803h.q(false);
                return;
            }
            return;
        }
        if (z2 || !this.av) {
            ValueAnimator valueAnimator2 = this.ay;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.ay.cancel();
            }
            if (z && this.ax) {
                u(0.0f);
            } else {
                this.f6800d.B(0.0f);
            }
            if (au() && !((l) this.I).f6899c.w.isEmpty()) {
                af();
            }
            this.av = true;
            ag();
            this.f6802g.f(true);
            this.f6803h.q(true);
        }
    }

    private final void aq() {
        EditText editText = this.f6797a;
        ar(editText == null ? null : editText.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ar(Editable editable) {
        if (e(editable) != 0 || this.av) {
            ag();
            return;
        }
        if (this.w == null || !this.v || TextUtils.isEmpty(this.u)) {
            return;
        }
        this.w.setText(this.u);
        TransitionManager.beginDelayedTransition(this.f6801f, this.z);
        this.w.setVisibility(0);
        this.w.bringToFront();
    }

    private final void as(boolean z, boolean z2) {
        int defaultColor = this.ap.getDefaultColor();
        int colorForState = this.ap.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.ap.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.W = defaultColor;
    }

    private final boolean at() {
        return this.T >= 0 && this.W != 0;
    }

    private final boolean au() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof l);
    }

    private final boolean av() {
        return this.f6800d.i() == 1;
    }

    private final boolean aw() {
        return this.R == 1 && this.f6797a.getMinLines() <= 1;
    }

    static /* synthetic */ int e(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A(int i2) {
        this.f6807l = i2;
        EditText editText = this.f6797a;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxEms(i2);
    }

    public final void B(int i2) {
        this.n = i2;
        EditText editText = this.f6797a;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMaxWidth(i2);
    }

    public final void C(int i2) {
        this.f6806k = i2;
        EditText editText = this.f6797a;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinEms(i2);
    }

    public final void D(int i2) {
        this.m = i2;
        EditText editText = this.f6797a;
        if (editText == null || i2 == -1) {
            return;
        }
        editText.setMinWidth(i2);
    }

    public final void E(CharSequence charSequence) {
        if (this.w == null) {
            bn bnVar = new bn(getContext());
            this.w = bnVar;
            bnVar.setId(com.waze.R.id.textinput_placeholder);
            this.w.setImportantForAccessibility(1);
            this.w.setAccessibilityLiveRegion(1);
            Fade fadeAb = ab();
            this.z = fadeAb;
            fadeAb.setStartDelay(67L);
            this.A = ab();
            F(this.y);
            G(this.x);
            ViewCompat.setAccessibilityDelegate(this.w, new aq(this));
        }
        if (TextUtils.isEmpty(charSequence)) {
            ak(false);
        } else {
            if (!this.v) {
                ak(true);
            }
            this.u = charSequence;
        }
        aq();
    }

    public final void F(int i2) {
        this.y = i2;
        TextView textView = this.w;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i2);
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            TextView textView = this.w;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    final void H(TextView textView, int i2) {
        try {
            TextViewCompat.setTextAppearance(textView, i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(textView, 2131952311);
        textView.setTextColor(ContextCompat.getColor(getContext(), com.waze.R.color.design_error));
    }

    final void I(Editable editable) {
        int iE = e(editable);
        boolean z = this.q;
        int i2 = this.p;
        if (i2 == -1) {
            this.r.setText(String.valueOf(iE));
            this.r.setContentDescription(null);
            this.q = false;
        } else {
            this.q = iE > i2;
            Context context = getContext();
            TextView textView = this.r;
            int i3 = this.p;
            int i4 = true != this.q ? com.waze.R.string.character_counter_content_description : com.waze.R.string.character_counter_overflowed_content_description;
            Integer numValueOf = Integer.valueOf(iE);
            textView.setContentDescription(context.getString(i4, numValueOf, Integer.valueOf(i3)));
            if (z != this.q) {
                am();
            }
            this.r.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(com.waze.R.string.character_counter_pattern, numValueOf, Integer.valueOf(this.p))));
        }
        if (this.f6797a == null || z == this.q) {
            return;
        }
        L(false);
        M();
        J();
    }

    final void J() {
        Drawable background;
        TextView textView;
        EditText editText = this.f6797a;
        if (editText == null || this.R != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = cg.f1231a;
        Drawable drawableMutate = background.mutate();
        if (T()) {
            drawableMutate.setColorFilter(android.support.v7.widget.ae.c(d(), PorterDuff.Mode.SRC_IN));
        } else if (this.q && (textView = this.r) != null) {
            drawableMutate.setColorFilter(android.support.v7.widget.ae.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(drawableMutate);
            this.f6797a.refreshDrawableState();
        }
    }

    final void K() {
        Drawable rippleDrawable;
        EditText editText = this.f6797a;
        if (editText == null || this.I == null) {
            return;
        }
        if ((this.L || editText.getBackground() == null) && this.R != 0) {
            EditText editText2 = this.f6797a;
            if (!(editText2 instanceof AutoCompleteTextView) || ad.h(editText2)) {
                rippleDrawable = this.I;
            } else {
                int iB = com.google.android.material.focus.d.b(this.f6797a, com.waze.R.attr.colorControlHighlight);
                int i2 = this.R;
                if (i2 == 2) {
                    Context context = getContext();
                    com.google.android.material.k.k kVar = this.I;
                    int[][] iArr = f6796e;
                    int iG = com.google.android.material.focus.d.g(context, "TextInputLayout");
                    com.google.android.material.k.k kVar2 = new com.google.android.material.k.k(kVar.o());
                    int iD = com.google.android.material.focus.d.d(iB, iG, 0.1f);
                    kVar2.v(new ColorStateList(iArr, new int[]{iD, 0}));
                    kVar2.setTint(iG);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iD, iG});
                    com.google.android.material.k.k kVar3 = new com.google.android.material.k.k(kVar.o());
                    kVar3.setTint(-1);
                    rippleDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar2, kVar3), kVar});
                } else if (i2 == 1) {
                    com.google.android.material.k.k kVar4 = this.I;
                    int i3 = this.aa;
                    rippleDrawable = new RippleDrawable(new ColorStateList(f6796e, new int[]{com.google.android.material.focus.d.d(iB, i3, 0.1f), i3}), kVar4, kVar4);
                } else {
                    rippleDrawable = null;
                }
            }
            this.f6797a.setBackground(rippleDrawable);
            this.L = true;
        }
    }

    final void L(boolean z) {
        ap(z, false);
    }

    final void M() {
        int currentTextColor;
        TextView textView;
        int i2;
        EditText editText;
        EditText editText2;
        if (this.I == null || this.R == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.f6797a) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.f6797a) != null && editText.isHovered());
        if (!isEnabled()) {
            this.W = this.au;
        } else if (!T()) {
            if (!this.q || (textView = this.r) == null) {
                currentTextColor = z ? this.ao : z2 ? this.an : this.am;
            } else if (this.ap != null) {
                as(z, z2);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            this.W = currentTextColor;
        } else if (this.ap != null) {
            as(z, z2);
        } else {
            this.W = d();
        }
        an();
        this.f6803h.r();
        this.f6802g.g();
        if (this.R == 2) {
            int i3 = this.T;
            if (z && isEnabled()) {
                i2 = this.V;
                this.T = i2;
            } else {
                i2 = this.U;
                this.T = i2;
            }
            if (i2 != i3 && au() && !this.av) {
                af();
                ai();
            }
        }
        if (this.R == 1) {
            if (isEnabled()) {
                this.aa = (!z2 || z) ? z ? this.as : this.aq : this.at;
            } else {
                this.aa = this.ar;
            }
        }
        ae();
        if (c() == 3) {
            EditText editText3 = this.f6797a;
            if (!(editText3 instanceof AutoCompleteTextView) || ad.h(editText3)) {
                g().setFocusable(true);
                g().setClickable(true);
            } else {
                g().setFocusable(false);
                g().setClickable(false);
            }
        }
    }

    public final boolean P() {
        return this.o.x();
    }

    public final boolean Q() {
        return this.o.y();
    }

    final boolean R() {
        return this.av;
    }

    public final boolean S() {
        return this.H;
    }

    final boolean T() {
        return this.o.v();
    }

    final boolean U() {
        boolean z;
        if (this.f6797a == null) {
            return false;
        }
        an anVar = this.f6802g;
        boolean z2 = true;
        if ((anVar.b() != null || (p() != null && anVar.c().getVisibility() == 0)) && anVar.getMeasuredWidth() > 0) {
            int iMax = Math.max(0, anVar.getMeasuredWidth() - this.f6797a.getPaddingLeft());
            if (this.ae == null || this.af != iMax) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ae = colorDrawable;
                this.af = iMax;
                colorDrawable.setBounds(0, 0, iMax, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f6797a.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ae;
            if (drawable != drawable2) {
                this.f6797a.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ae != null) {
                Drawable[] compoundDrawablesRelative2 = this.f6797a.getCompoundDrawablesRelative();
                this.f6797a.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ae = null;
                z = true;
            }
            z = false;
        }
        ab abVar = this.f6803h;
        if ((abVar.D() || ((abVar.A() && abVar.C()) || abVar.k() != null)) && abVar.getMeasuredWidth() > 0) {
            int measuredWidth = abVar.f().getMeasuredWidth() - this.f6797a.getPaddingRight();
            CheckableImageButton checkableImageButtonG = abVar.g();
            if (checkableImageButtonG != null) {
                measuredWidth = measuredWidth + checkableImageButtonG.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButtonG.getLayoutParams()).getMarginStart();
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.f6797a.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ah;
            if (drawable3 != null && this.ai != iMax2) {
                this.ai = iMax2;
                drawable3.setBounds(0, 0, iMax2, 1);
                this.f6797a.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ah, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ah = colorDrawable2;
                this.ai = iMax2;
                colorDrawable2.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ah;
            if (drawable4 != drawable5) {
                this.aj = drawable4;
                this.f6797a.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ah != null) {
            Drawable[] compoundDrawablesRelative4 = this.f6797a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ah) {
                this.f6797a.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.aj, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ah = null;
            return z2;
        }
        return z;
    }

    public final void V() {
        this.f6803h.y(null);
    }

    public final int a() {
        return this.R;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i2, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f6801f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        ao();
        EditText editText = (EditText) view;
        if (this.f6797a != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (c() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f6797a = editText;
        int i3 = this.f6806k;
        if (i3 != -1) {
            C(i3);
        } else {
            D(this.m);
        }
        int i4 = this.f6807l;
        if (i4 != -1) {
            A(i4);
        } else {
            B(this.n);
        }
        this.L = false;
        ah();
        as asVar = new as(this);
        EditText editText2 = this.f6797a;
        if (editText2 != null) {
            ViewCompat.setAccessibilityDelegate(editText2, asVar);
        }
        com.google.android.material.internal.f fVar = this.f6800d;
        fVar.F(this.f6797a.getTypeface());
        fVar.A(this.f6797a.getTextSize());
        fVar.x(this.f6797a.getLetterSpacing());
        int gravity = this.f6797a.getGravity();
        fVar.u((gravity & (-113)) | 48);
        fVar.z(gravity);
        this.f6799c = editText.getMinimumHeight();
        this.f6797a.addTextChangedListener(new ap(this, editText));
        if (this.ak == null) {
            this.ak = this.f6797a.getHintTextColors();
        }
        if (this.F) {
            if (TextUtils.isEmpty(this.G)) {
                CharSequence hint = this.f6797a.getHint();
                this.f6805j = hint;
                z(hint);
                this.f6797a.setHint((CharSequence) null);
            }
            this.H = true;
        }
        an();
        if (this.r != null) {
            I(this.f6797a.getText());
        }
        J();
        this.o.h();
        this.f6802g.bringToFront();
        ab abVar = this.f6803h;
        abVar.bringToFront();
        Iterator it = this.ag.iterator();
        while (it.hasNext()) {
            ((at) it.next()).a(this);
        }
        abVar.z();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        ap(false, true);
    }

    public final int b() {
        return this.p;
    }

    public final int c() {
        return this.f6803h.a();
    }

    public final int d() {
        return this.o.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f6797a;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f6805j != null) {
            boolean z = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.f6797a.setHint(this.f6805j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.f6797a.setHint(hint);
                this.H = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i2);
        onProvideAutofillVirtualStructure(viewStructure, i2);
        FrameLayout frameLayout = this.f6801f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
            View childAt = frameLayout.getChildAt(i3);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i3);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i2);
            if (childAt == this.f6797a) {
                viewStructureNewChild.setHint(n());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.aA = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.aA = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        com.google.android.material.k.k kVar;
        super.draw(canvas);
        if (this.F) {
            this.f6800d.k(canvas);
        }
        if (this.N == null || (kVar = this.M) == null) {
            return;
        }
        kVar.draw(canvas);
        if (this.f6797a.isFocused()) {
            Rect bounds = this.N.getBounds();
            Rect bounds2 = this.M.getBounds();
            float f2 = this.f6800d.f();
            int iCenterX = bounds2.centerX();
            bounds.left = com.google.android.material.a.a.a(iCenterX, bounds2.left, f2);
            bounds.right = com.google.android.material.a.a.a(iCenterX, bounds2.right, f2);
            this.N.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.az) {
            return;
        }
        this.az = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.f fVar = this.f6800d;
        boolean zH = fVar != null ? fVar.H(drawableState) : false;
        if (this.f6797a != null) {
            L(isLaidOut() && isEnabled());
        }
        J();
        M();
        if (zH) {
            invalidate();
        }
        this.az = false;
    }

    public final EditText f() {
        return this.f6797a;
    }

    final CheckableImageButton g() {
        return this.f6803h.h();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.f6797a;
        return editText != null ? editText.getBaseline() + getPaddingTop() + W() : super.getBaseline();
    }

    final CharSequence k() {
        TextView textView;
        if (this.f6798b && this.q && (textView = this.r) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public final CharSequence l() {
        af afVar = this.o;
        if (afVar.x()) {
            return afVar.d();
        }
        return null;
    }

    public final CharSequence m() {
        af afVar = this.o;
        if (afVar.y()) {
            return afVar.e();
        }
        return null;
    }

    public final CharSequence n() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    public final CharSequence o() {
        if (this.v) {
            return this.u;
        }
        return null;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6800d.m(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r3 = this;
            com.google.android.material.textfield.ab r0 = r3.f6803h
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r3)
            r1 = 0
            r3.aB = r1
            android.widget.EditText r2 = r3.f6797a
            if (r2 != 0) goto L12
        L10:
            r0 = r1
            goto L2e
        L12:
            com.google.android.material.textfield.an r2 = r3.f6802g
            int r0 = r0.getMeasuredHeight()
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.f6797a
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L10
            android.widget.EditText r2 = r3.f6797a
            r2.setMinimumHeight(r0)
            r0 = 1
        L2e:
            boolean r2 = r3.U()
            if (r0 != 0) goto L38
            if (r2 == 0) goto L37
            goto L38
        L37:
            return
        L38:
            android.widget.EditText r0 = r3.f6797a
            com.google.android.material.textfield.ao r2 = new com.google.android.material.textfield.ao
            r2.<init>(r3, r1)
            r0.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onGlobalLayout():void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int compoundPaddingTop;
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.f6797a;
        if (editText != null) {
            Rect rect = this.ab;
            com.google.android.material.internal.g.a(this, editText, rect);
            if (this.M != null) {
                this.M.setBounds(rect.left, rect.bottom - this.U, rect.right, rect.bottom);
            }
            if (this.N != null) {
                this.N.setBounds(rect.left, rect.bottom - this.V, rect.right, rect.bottom);
            }
            if (this.F) {
                com.google.android.material.internal.f fVar = this.f6800d;
                fVar.A(this.f6797a.getTextSize());
                int gravity = this.f6797a.getGravity();
                fVar.u((gravity & (-113)) | 48);
                fVar.z(gravity);
                fVar.q(Z(rect));
                if (this.f6797a == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ac;
                float fE = av() ? fVar.e() : fVar.c() * fVar.h();
                rect2.left = rect.left + this.f6797a.getCompoundPaddingLeft();
                if (aw()) {
                    compoundPaddingTop = (int) (rect.centerY() - (fE / 2.0f));
                } else {
                    int iE = 0;
                    if (this.R == 0 && !av()) {
                        iE = (int) (fVar.e() / 2.0f);
                    }
                    compoundPaddingTop = (rect.top + this.f6797a.getCompoundPaddingTop()) - iE;
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.f6797a.getCompoundPaddingRight();
                rect2.bottom = aw() ? (int) (rect2.top + fE) : rect.bottom - this.f6797a.getCompoundPaddingBottom();
                fVar.w(rect2.left, rect2.top, rect2.right, rect2.bottom);
                fVar.n();
                if (!au() || this.av) {
                    return;
                }
                ai();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        if (!this.aB) {
            this.f6803h.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aB = true;
        }
        if (this.w != null && (editText = this.f6797a) != null) {
            this.w.setGravity(editText.getGravity());
            this.w.setPadding(this.f6797a.getCompoundPaddingLeft(), this.f6797a.getCompoundPaddingTop(), this.f6797a.getCompoundPaddingRight(), this.f6797a.getCompoundPaddingBottom());
        }
        this.f6803h.z();
        if (av()) {
            return;
        }
        int measuredWidth = (this.f6797a.getMeasuredWidth() - this.f6797a.getCompoundPaddingLeft()) - this.f6797a.getCompoundPaddingRight();
        com.google.android.material.internal.f fVar = this.f6800d;
        fVar.G(measuredWidth);
        Rect rect = this.ab;
        com.google.android.material.internal.g.a(this, this.f6797a, rect);
        fVar.q(Z(rect));
        ao();
        ad();
        if (this.f6797a == null) {
            return;
        }
        float fD = fVar.d();
        float height = 0.0f;
        if (this.u != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.w.getPaint());
            textPaint.setTextSize(this.w.getTextSize());
            textPaint.setTypeface(this.w.getTypeface());
            textPaint.setLetterSpacing(this.w.getLetterSpacing());
            try {
                com.google.android.material.internal.l lVarB = com.google.android.material.internal.l.b(this.u, textPaint, measuredWidth);
                lVarB.f(getLayoutDirection() == 1);
                lVarB.e(true);
                lVarB.g(this.w.getLineSpacingExtra(), this.w.getLineSpacingMultiplier());
                lVarB.j(new com.google.firebase.messaging.l(this));
                height = lVarB.a().getHeight() + (this.R == 1 ? fVar.b() + this.S + this.f6804i : 0.0f);
            } catch (com.google.android.material.internal.k e2) {
                Log.e("TextInputLayout", e2.getCause().getMessage(), e2);
            }
        }
        float fMax = Math.max(fD, height);
        if (this.f6797a.getMeasuredHeight() < fMax) {
            this.f6797a.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aw awVar = (aw) parcelable;
        super.onRestoreInstanceState(awVar.getSuperState());
        w(awVar.f6882a);
        if (awVar.f6883b) {
            post(new ao(this, 1, null));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = i2 == 1;
        if (z != this.P) {
            com.google.android.material.k.d dVarI = this.O.i();
            RectF rectF = this.ad;
            float fA = dVarI.a(rectF);
            float fA2 = this.O.j().a(rectF);
            float fA3 = this.O.f().a(rectF);
            float fA4 = this.O.g().a(rectF);
            com.google.android.material.k.f fVarR = this.O.r();
            com.google.android.material.k.f fVarS = this.O.s();
            com.google.android.material.k.f fVarP = this.O.p();
            com.google.android.material.k.f fVarQ = this.O.q();
            com.google.android.material.k.p pVar = new com.google.android.material.k.p();
            pVar.D(fVarS);
            pVar.E(fVarR);
            pVar.B(fVarQ);
            pVar.C(fVarP);
            pVar.o(fA2);
            pVar.q(fA);
            pVar.k(fA4);
            pVar.m(fA3);
            com.google.android.material.k.r rVarI = pVar.i();
            this.P = z;
            com.google.android.material.k.k kVar = this.I;
            if (kVar == null || kVar.o() == rVarI) {
                return;
            }
            this.O = rVarI;
            ae();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        aw awVar = new aw(super.onSaveInstanceState());
        if (T()) {
            awVar.f6882a = l();
        }
        awVar.f6883b = this.f6803h.B();
        return awVar;
    }

    public final CharSequence p() {
        return this.f6802g.d();
    }

    public final CharSequence q() {
        return this.f6803h.k();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        aj(this, z);
        super.setEnabled(z);
    }

    public final void t(at atVar) {
        this.ag.add(atVar);
        if (this.f6797a != null) {
            atVar.a(this);
        }
    }

    final void u(float f2) {
        com.google.android.material.internal.f fVar = this.f6800d;
        if (fVar.f() == f2) {
            return;
        }
        if (this.ay == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.ay = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.k.f.d(getContext(), com.waze.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6174b));
            this.ay.setDuration(com.google.android.material.internal.t.e(getContext(), com.waze.R.attr.motionDurationMedium4, 167));
            this.ay.addUpdateListener(new ar(this));
        }
        this.ay.setFloatValues(fVar.f(), f2);
        this.ay.start();
    }

    public final void v(boolean z) {
        this.f6803h.x(z);
    }

    public final void w(CharSequence charSequence) {
        af afVar = this.o;
        if (!afVar.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                x(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            afVar.j();
        } else {
            afVar.t(charSequence);
        }
    }

    public final void x(boolean z) {
        this.o.n(z);
    }

    public final void y(boolean z) {
        this.o.r(z);
    }

    public final void z(CharSequence charSequence) {
        if (this.F) {
            if (!TextUtils.equals(charSequence, this.G)) {
                this.G = charSequence;
                this.f6800d.D(charSequence);
                if (!this.av) {
                    ai();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
