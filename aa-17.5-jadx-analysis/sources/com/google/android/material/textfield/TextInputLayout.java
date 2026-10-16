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
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.dvd;
import defpackage.ebm;
import defpackage.feo;
import defpackage.fgh;
import defpackage.jc;
import defpackage.ka;
import defpackage.ko;
import defpackage.wkn;
import defpackage.wly;
import defpackage.wox;
import defpackage.woy;
import defpackage.wpq;
import defpackage.wpx;
import defpackage.wpy;
import defpackage.wql;
import defpackage.wqm;
import defpackage.wtz;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuj;
import defpackage.wuk;
import defpackage.wvk;
import defpackage.wwp;
import defpackage.wwq;
import defpackage.wwr;
import defpackage.wxa;
import defpackage.wxd;
import defpackage.wxf;
import defpackage.wxi;
import defpackage.wxk;
import defpackage.wxm;
import defpackage.ykd;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private int E;
    private feo F;
    private feo G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private boolean L;
    private CharSequence M;
    private wue N;
    private wue O;
    private StateListDrawable P;
    private boolean Q;
    private wue R;
    private wue S;
    private wuk T;
    private boolean U;
    private final int V;
    private int W;
    public final wxi a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final Rect af;
    private final Rect ag;
    private final RectF ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private ColorStateList an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final wxa b;
    public EditText c;
    public final wxd d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public TextView k;
    public boolean l;
    public int m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final wpx q;
    public boolean r;
    private final FrameLayout u;
    private final int v;
    private CharSequence w;
    private int x;
    private int y;
    private int z;

    /* JADX WARN: Removed duplicated region for block: B:109:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final int E() {
        if (this.L) {
            int i = this.m;
            if (i == 0) {
                return (int) this.q.c();
            }
            if (i == 2) {
                boolean zAb = ab();
                wpx wpxVar = this.q;
                return zAb ? (int) (wpxVar.c() / 2.0f) : Math.max(0, (int) (wpxVar.c() - (wpxVar.b() / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int F(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.g()
            if (r2 == 0) goto L1d
            wxi r0 = r0.a
            int r0 = r0.a()
        Le:
            int r1 = r1 + r0
            return r1
        L10:
            java.lang.CharSequence r2 = r0.h()
            if (r2 == 0) goto L1d
            wxa r0 = r0.b
            int r0 = r0.a()
            goto Le
        L1d:
            android.widget.EditText r0 = r0.c
            int r0 = r0.getCompoundPaddingLeft()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F(int, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int G(int r1, boolean r2) {
        /*
            r0 = this;
            if (r2 != 0) goto L10
            java.lang.CharSequence r2 = r0.h()
            if (r2 == 0) goto L1d
            wxa r0 = r0.b
            int r0 = r0.a()
        Le:
            int r1 = r1 - r0
            return r1
        L10:
            java.lang.CharSequence r2 = r0.g()
            if (r2 == 0) goto L1d
            wxi r0 = r0.a
            int r0 = r0.a()
            goto Le
        L1d:
            android.widget.EditText r0 = r0.c
            int r0 = r0.getCompoundPaddingRight()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.G(int, boolean):int");
    }

    private final Rect H(Rect rect) {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ag;
        boolean zJ = woy.J(this);
        rect2.bottom = rect.bottom;
        int i = this.m;
        if (i == 1) {
            rect2.left = F(rect.left, zJ);
            rect2.top = rect.top + this.W;
            rect2.right = G(rect.right, zJ);
            return rect2;
        }
        if (i != 2) {
            rect2.left = F(rect.left, zJ);
            rect2.top = getPaddingTop();
            rect2.right = G(rect.right, zJ);
            return rect2;
        }
        rect2.left = rect.left + this.c.getPaddingLeft();
        rect2.top = rect.top - E();
        rect2.right = rect.right - this.c.getPaddingRight();
        return rect2;
    }

    private final Drawable I() throws Resources.NotFoundException {
        wue wueVar = this.O;
        if (wueVar != null) {
            return wueVar;
        }
        wue wueVarK = K(true);
        this.O = wueVarK;
        return wueVarK;
    }

    private final feo J() {
        feo feoVar = new feo();
        feoVar.c = woy.u(getContext(), com.google.android.projection.gearhead.R.attr.motionDurationShort2, 87);
        feoVar.d = woy.C(getContext(), com.google.android.projection.gearhead.R.attr.motionEasingLinearInterpolator, wkn.a);
        return feoVar;
    }

    private final wue K(boolean z) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        float dimensionPixelOffset2 = editText instanceof wxf ? ((wxf) editText).c : getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f = true != z ? BitmapDescriptorFactory.HUE_RED : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        wuj wujVar = new wuj();
        wujVar.c(f);
        wujVar.d(f);
        wujVar.a(dimensionPixelOffset);
        wujVar.b(dimensionPixelOffset);
        wuk wukVar = new wuk(wujVar);
        EditText editText2 = this.c;
        wue wueVarG = wue.G(getContext(), dimensionPixelOffset2, editText2 instanceof wxf ? ((wxf) editText2).d : null);
        wueVarG.d(wukVar);
        wueVarG.Q(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return wueVarG;
    }

    private final void L() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!ab()) {
            EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.c() + this.v), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (wub.k(getContext())) {
            EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (wub.j(getContext())) {
            EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void M() {
        wue wueVar = this.N;
        if (wueVar == null) {
            return;
        }
        wuk wukVarFD = wueVar.fD();
        wuk wukVar = this.T;
        if (wukVarFD != wukVar) {
            this.N.d(wukVar);
        }
        if (this.m == 2 && Z()) {
            this.N.S(this.aa, this.ad);
        }
        int iD = this.ae;
        if (this.m == 1) {
            iD = dvd.d(this.ae, woy.n(getContext(), com.google.android.projection.gearhead.R.attr.colorSurface, 0));
        }
        this.ae = iD;
        this.N.O(ColorStateList.valueOf(iD));
        wue wueVar2 = this.R;
        if (wueVar2 != null && this.S != null) {
            if (Z()) {
                wueVar2.O(this.c.isFocused() ? ColorStateList.valueOf(this.ap) : ColorStateList.valueOf(this.ad));
                this.S.O(ColorStateList.valueOf(this.ad));
            }
            invalidate();
        }
        x();
    }

    private final void N() {
        if (aa()) {
            ((wwr) this.N).b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final void O() {
        TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((CharSequence) null);
        fgh.b(this.u, this.G);
        this.k.setVisibility(4);
    }

    private final void P() {
        int i = this.m;
        if (i == 0) {
            this.N = null;
            this.R = null;
            this.S = null;
        } else if (i == 1) {
            this.N = new wue(this.T);
            this.R = new wue();
            this.S = new wue();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.L || (this.N instanceof wwr)) {
                this.N = new wue(this.T);
            } else {
                wuk wukVar = this.T;
                int i2 = wwr.b;
                if (wukVar == null) {
                    wukVar = new wuk();
                }
                this.N = new wwq(new wwp(wukVar, new RectF()));
            }
            this.R = null;
            this.S = null;
        }
        x();
        A();
        if (this.m == 1) {
            if (wub.k(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (wub.j(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        L();
        if (this.m != 0) {
            W();
        }
        EditText editText = this.c;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(I());
                    return;
                }
                if (i3 == 1) {
                    if (this.P == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, I());
                        this.P.addState(new int[0], K(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Q():void");
    }

    private static void R(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                R((ViewGroup) childAt, z);
            }
        }
    }

    private final void S(boolean z) {
        if (this.j == z) {
            return;
        }
        TextView textView = this.k;
        if (!z) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.k = null;
        } else if (textView != null) {
            this.u.addView(textView);
            this.k.setVisibility(0);
        }
        this.j = z;
    }

    private final void T() {
        if (this.h != null) {
            EditText editText = this.c;
            v(editText == null ? null : editText.getText());
        }
    }

    private final void U() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            u(textView, this.g ? this.B : this.C);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.I) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    private final void V() {
        ColorStateList colorStateList;
        ColorStateList colorStateListQ = this.J;
        if (colorStateListQ == null) {
            colorStateListQ = woy.q(getContext(), com.google.android.projection.gearhead.R.attr.colorControlActivated);
        }
        EditText editText = this.c;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.c.getTextCursorDrawable().mutate();
        if ((C() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
            colorStateListQ = colorStateList;
        }
        drawableMutate.setTintList(colorStateListQ);
    }

    private final void W() {
        if (this.m != 1) {
            FrameLayout frameLayout = this.u;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = E();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    private final void X() {
        EditText editText = this.c;
        z(editText == null ? null : editText.getText());
    }

    private final void Y(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean Z() {
        return this.aa >= 0 && this.ad != 0;
    }

    private final boolean aa() {
        return this.L && !TextUtils.isEmpty(this.M) && (this.N instanceof wwr);
    }

    private final boolean ab() {
        return this.q.q == 1;
    }

    private final boolean ac() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A() {
        int currentTextColor;
        TextView textView;
        int i;
        EditText editText;
        EditText editText2;
        if (this.N == null || this.m == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.c) != null && editText.isHovered());
        if (!isEnabled()) {
            this.ad = this.ax;
        } else if (!C()) {
            if (!this.g || (textView = this.h) == null) {
                currentTextColor = z ? this.ar : z2 ? this.aq : this.ap;
            } else if (this.as != null) {
                Y(z, z2);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            this.ad = currentTextColor;
        } else if (this.as != null) {
            Y(z, z2);
        } else {
            this.ad = b();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        wxa wxaVar = this.b;
        wxaVar.p();
        TextInputLayout textInputLayout = wxaVar.a;
        wpq.k(textInputLayout, wxaVar.b, wxaVar.c);
        wxaVar.g();
        if (wxaVar.c().u()) {
            if (!textInputLayout.C() || wxaVar.b() == null) {
                wpq.j(textInputLayout, wxaVar.d, wxaVar.f, wxaVar.g);
            } else {
                Drawable drawableMutate = wxaVar.b().mutate();
                drawableMutate.setTint(textInputLayout.b());
                wxaVar.d.setImageDrawable(drawableMutate);
            }
        }
        this.a.d();
        if (this.m == 2) {
            int i2 = this.aa;
            if (z && isEnabled()) {
                i = this.ac;
                this.aa = i;
            } else {
                i = this.ab;
                this.aa = i;
            }
            if (i != i2 && aa() && !this.p) {
                N();
                Q();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                this.ae = (!z2 || z) ? z ? this.av : this.at : this.aw;
            } else {
                this.ae = this.au;
            }
        }
        M();
        if (a() == 3) {
            EditText editText3 = this.c;
            if (!(editText3 instanceof AutoCompleteTextView) || wox.d(editText3)) {
                d().setFocusable(true);
                d().setClickable(true);
            } else {
                d().setFocusable(false);
                d().setClickable(false);
            }
        }
    }

    public final boolean B() {
        return this.d.n;
    }

    public final boolean C() {
        wxd wxdVar = this.d;
        return (wxdVar.e != 1 || wxdVar.h == null || TextUtils.isEmpty(wxdVar.f)) ? false : true;
    }

    public final boolean D() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        wxi wxiVar = this.a;
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((wxiVar.c.getDrawable() != null || (g() != null && wxiVar.a.getVisibility() == 0)) && wxiVar.getMeasuredWidth() > 0) {
            int iMax = Math.max(0, wxiVar.getMeasuredWidth() - this.c.getPaddingLeft());
            if (this.ai == null || this.aj != iMax) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ai = colorDrawable;
                this.aj = iMax;
                colorDrawable.setBounds(0, 0, iMax, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ai != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ai = null;
                z = true;
            }
            z = false;
        }
        wxa wxaVar = this.b;
        if ((wxaVar.t() || ((wxaVar.r() && wxaVar.s()) || wxaVar.h != null)) && wxaVar.getMeasuredWidth() > 0) {
            int measuredWidth = wxaVar.i.getMeasuredWidth() - this.c.getPaddingRight();
            if (wxaVar.t()) {
                checkableImageButton = wxaVar.b;
            } else if (wxaVar.r() && wxaVar.s()) {
                checkableImageButton = wxaVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth = measuredWidth + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ak;
            if (drawable3 != null && this.al != iMax2) {
                this.al = iMax2;
                drawable3.setBounds(0, 0, iMax2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ak = colorDrawable2;
                this.al = iMax2;
                colorDrawable2.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        return this.b.e;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.u;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        W();
        EditText editText = (EditText) view;
        if (this.c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (a() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.c = editText;
        int i2 = this.x;
        if (i2 != -1) {
            q(i2);
        } else {
            r(this.z);
        }
        int i3 = this.y;
        if (i3 != -1) {
            o(i3);
        } else {
            p(this.A);
        }
        this.Q = false;
        P();
        wxm wxmVar = new wxm(this);
        EditText editText2 = this.c;
        if (editText2 != null) {
            ebm.o(editText2, wxmVar);
        }
        wpx wpxVar = this.q;
        Typeface typeface = this.c.getTypeface();
        boolean zF = wpxVar.F(typeface);
        boolean zG = wpxVar.G(typeface);
        if (zF || zG) {
            wpxVar.l(false);
        }
        wpxVar.y(this.c.getTextSize());
        float letterSpacing = this.c.getLetterSpacing();
        if (wpxVar.n != letterSpacing) {
            wpxVar.n = letterSpacing;
            wpxVar.l(false);
        }
        int gravity = this.c.getGravity();
        wpxVar.s((gravity & (-113)) | 48);
        wpxVar.x(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new wxk(this, editText));
        if (this.an == null) {
            this.an = this.c.getHintTextColors();
        }
        if (this.L) {
            if (TextUtils.isEmpty(this.M)) {
                CharSequence hint = this.c.getHint();
                this.w = hint;
                n(hint);
                this.c.setHint((CharSequence) null);
            }
            this.l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        if (this.h != null) {
            v(this.c.getText());
        }
        w();
        this.d.b();
        this.a.bringToFront();
        wxa wxaVar = this.b;
        wxaVar.bringToFront();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((ykd) it.next()).f(this);
        }
        wxaVar.q();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        y(false, true);
    }

    public final int b() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final CheckableImageButton d() {
        return this.b.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.l;
            this.l = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.u;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.c) {
                viewStructureNewChild.setHint(f());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        wue wueVar;
        super.draw(canvas);
        if (this.L) {
            this.q.h(canvas);
        }
        if (this.S == null || (wueVar = this.R) == null) {
            return;
        }
        wueVar.draw(canvas);
        if (this.c.isFocused()) {
            Rect bounds = this.S.getBounds();
            Rect bounds2 = this.R.getBounds();
            float f = this.q.a;
            int iCenterX = bounds2.centerX();
            bounds.left = wkn.b(iCenterX, bounds2.left, f);
            bounds.right = wkn.b(iCenterX, bounds2.right, f);
            this.S.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        wpx wpxVar = this.q;
        boolean zH = wpxVar != null ? wpxVar.H(drawableState) : false;
        if (this.c != null) {
            y(isLaidOut() && isEnabled(), false);
        }
        w();
        A();
        if (zH) {
            invalidate();
        }
        this.aB = false;
    }

    public final CharSequence e() {
        wxd wxdVar = this.d;
        if (wxdVar.g) {
            return wxdVar.f;
        }
        return null;
    }

    public final CharSequence f() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    public final CharSequence g() {
        return this.a.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + E() : super.getBaseline();
    }

    public final CharSequence h() {
        return this.b.h;
    }

    final void i(float f) {
        wpx wpxVar = this.q;
        if (wpxVar.a == f) {
            return;
        }
        if (this.aA == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aA = valueAnimator;
            valueAnimator.setInterpolator(woy.C(getContext(), com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, wkn.b));
            this.aA.setDuration(woy.u(getContext(), com.google.android.projection.gearhead.R.attr.motionDurationMedium4, 167));
            this.aA.addUpdateListener(new wvk(this, 6));
        }
        this.aA.setFloatValues(wpxVar.a, f);
        this.aA.start();
    }

    public final void j(boolean z) {
        this.b.m(z);
    }

    public final void k(boolean z) {
        wxd wxdVar = this.d;
        if (wxdVar.g == z) {
            return;
        }
        wxdVar.c();
        if (z) {
            wxdVar.h = new ka(wxdVar.a);
            wxdVar.h.setId(com.google.android.projection.gearhead.R.id.textinput_error);
            wxdVar.h.setTextAlignment(5);
            wxdVar.h(wxdVar.k);
            wxdVar.i(wxdVar.l);
            wxdVar.g(wxdVar.i);
            wxdVar.f(wxdVar.j);
            wxdVar.h.setVisibility(4);
            wxdVar.a(wxdVar.h, 0);
        } else {
            wxdVar.d();
            wxdVar.e(wxdVar.h, 0);
            wxdVar.h = null;
            TextInputLayout textInputLayout = wxdVar.b;
            textInputLayout.w();
            textInputLayout.A();
        }
        wxdVar.g = z;
    }

    public final void l(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (B()) {
                m(false);
                return;
            }
            return;
        }
        if (!B()) {
            m(true);
        }
        wxd wxdVar = this.d;
        wxdVar.c();
        wxdVar.m = charSequence;
        wxdVar.o.setText(charSequence);
        int i = wxdVar.d;
        if (i != 2) {
            wxdVar.e = 2;
        }
        wxdVar.l(i, wxdVar.e, wxdVar.m(wxdVar.o, charSequence));
    }

    public final void m(boolean z) {
        wxd wxdVar = this.d;
        if (wxdVar.n == z) {
            return;
        }
        wxdVar.c();
        if (z) {
            wxdVar.o = new ka(wxdVar.a);
            wxdVar.o.setId(com.google.android.projection.gearhead.R.id.textinput_helper_text);
            wxdVar.o.setTextAlignment(5);
            wxdVar.o.setVisibility(4);
            wxdVar.o.setImportantForAccessibility(2);
            wxdVar.j(wxdVar.p);
            wxdVar.k(wxdVar.q);
            wxdVar.a(wxdVar.o, 1);
        } else {
            wxdVar.c();
            int i = wxdVar.d;
            if (i == 2) {
                wxdVar.e = 0;
            }
            wxdVar.l(i, wxdVar.e, wxdVar.m(wxdVar.o, ""));
            wxdVar.e(wxdVar.o, 1);
            wxdVar.o = null;
            TextInputLayout textInputLayout = wxdVar.b;
            textInputLayout.w();
            textInputLayout.A();
        }
        wxdVar.n = z;
    }

    public final void n(CharSequence charSequence) {
        if (this.L) {
            if (!TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                this.q.C(charSequence);
                if (!this.p) {
                    Q();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void o(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.k(configuration);
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
            wxa r0 = r3.b
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r3)
            r1 = 0
            r3.aC = r1
            android.widget.EditText r2 = r3.c
            if (r2 != 0) goto L12
        L10:
            r0 = r1
            goto L2e
        L12:
            wxi r2 = r3.a
            int r0 = r0.getMeasuredHeight()
            int r2 = r2.getMeasuredHeight()
            int r0 = java.lang.Math.max(r0, r2)
            android.widget.EditText r2 = r3.c
            int r2 = r2.getMeasuredHeight()
            if (r2 >= r0) goto L10
            android.widget.EditText r2 = r3.c
            r2.setMinimumHeight(r0)
            r0 = 1
        L2e:
            boolean r2 = r3.D()
            if (r0 != 0) goto L38
            if (r2 == 0) goto L37
            goto L38
        L37:
            return
        L38:
            android.widget.EditText r0 = r3.c
            wxj r2 = new wxj
            r2.<init>(r3, r1)
            r0.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onGlobalLayout():void");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.af;
            wpy.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                wpx wpxVar = this.q;
                wpxVar.y(this.c.getTextSize());
                int gravity = this.c.getGravity();
                wpxVar.s((gravity & (-113)) | 48);
                wpxVar.x(gravity);
                wpxVar.n(H(rect));
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ag;
                float fE = ab() ? wpxVar.e() : wpxVar.d() * wpxVar.i;
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (ac()) {
                    compoundPaddingTop = (int) (rect.centerY() - (fE / 2.0f));
                } else {
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - ((this.m != 0 || ab()) ? 0 : (int) (wpxVar.e() / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = ac() ? (int) (rect2.top + fE) : rect.bottom - this.c.getCompoundPaddingBottom();
                wpxVar.t(rect2.left, rect2.top, rect2.right, rect2.bottom, true);
                wpxVar.l(false);
                if (!aa() || this.p) {
                    return;
                }
                Q();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.q();
        if (ab()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        wpx wpxVar = this.q;
        TextPaint textPaint = wpxVar.m;
        wpxVar.i(textPaint);
        float f = measuredWidth;
        wpxVar.s = wpxVar.g(wpxVar.r, textPaint, wpxVar.k, (wpxVar.g / wpxVar.f) * f, wpxVar.l).getHeight();
        wpxVar.j(textPaint);
        wpxVar.t = wpxVar.g(wpxVar.q, textPaint, wpxVar.k, f, wpxVar.l).getHeight();
        Rect rect = this.af;
        wpy.a(this, this.c, rect);
        wpxVar.n(H(rect));
        W();
        L();
        if (this.c == null) {
            return;
        }
        int i3 = wpxVar.t;
        float fE = i3 != -1 ? i3 : wpxVar.e();
        CharSequence charSequence = this.i;
        float height = BitmapDescriptorFactory.HUE_RED;
        if (charSequence != null) {
            TextPaint textPaint2 = new TextPaint(129);
            textPaint2.set(this.k.getPaint());
            textPaint2.setTextSize(this.k.getTextSize());
            textPaint2.setTypeface(this.k.getTypeface());
            textPaint2.setLetterSpacing(this.k.getLetterSpacing());
            try {
                wqm wqmVar = new wqm(this.i, textPaint2, measuredWidth);
                wqmVar.e = getLayoutDirection() == 1;
                wqmVar.d = true;
                wqmVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                wqmVar.g = new ykd(this);
                height = wqmVar.a().getHeight() + (this.m == 1 ? wpxVar.c() + this.W + this.v : 0.0f);
            } catch (wql e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(fE, height);
        if (this.c.getMeasuredHeight() < fMax) {
            this.c.setMinimumHeight(Math.round(fMax));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onRestoreInstanceState(android.os.Parcelable r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.material.textfield.TextInputLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r6)
            return
        L8:
            com.google.android.material.textfield.TextInputLayout$SavedState r6 = (com.google.android.material.textfield.TextInputLayout.SavedState) r6
            android.os.Parcelable r0 = r6.d
            super.onRestoreInstanceState(r0)
            java.lang.CharSequence r0 = r6.a
            wxd r1 = r5.d
            boolean r2 = r1.g
            r3 = 1
            if (r2 != 0) goto L22
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L1f
            goto L47
        L1f:
            r5.k(r3)
        L22:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L44
            r1.c()
            r1.f = r0
            android.widget.TextView r2 = r1.h
            r2.setText(r0)
            int r2 = r1.d
            if (r2 == r3) goto L38
            r1.e = r3
        L38:
            int r3 = r1.e
            android.widget.TextView r4 = r1.h
            boolean r0 = r1.m(r4, r0)
            r1.l(r2, r3, r0)
            goto L47
        L44:
            r1.d()
        L47:
            boolean r6 = r6.b
            if (r6 == 0) goto L55
            wxj r6 = new wxj
            r0 = 2
            r1 = 0
            r6.<init>(r5, r0, r1)
            r5.post(r6)
        L55:
            r5.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onRestoreInstanceState(android.os.Parcelable):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.U) {
            wtz wtzVar = this.T.b;
            RectF rectF = this.ah;
            float fA = wtzVar.a(rectF);
            float fA2 = this.T.c.a(rectF);
            float fA3 = this.T.e.a(rectF);
            float fA4 = this.T.d.a(rectF);
            wuk wukVar = this.T;
            wub wubVar = wukVar.j;
            wub wubVar2 = wukVar.k;
            wub wubVar3 = wukVar.m;
            wub wubVar4 = wukVar.l;
            wuj wujVar = new wuj();
            wujVar.i(wubVar2);
            wujVar.j(wubVar);
            wujVar.g(wubVar4);
            wujVar.h(wubVar3);
            wujVar.c(fA2);
            wujVar.d(fA);
            wujVar.a(fA4);
            wujVar.b(fA3);
            wuk wukVar2 = new wuk(wujVar);
            this.U = z;
            wue wueVar = this.N;
            if (wueVar == null || wueVar.fD() == wukVar2) {
                return;
            }
            this.T = wukVar2;
            M();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (C()) {
            savedState.a = e();
        }
        wxa wxaVar = this.b;
        boolean z = false;
        if (wxaVar.r() && wxaVar.d.a) {
            z = true;
        }
        savedState.b = z;
        return savedState;
    }

    public final void p(int i) {
        this.A = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public final void q(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void r(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void s(int i) {
        this.E = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        R(this, z);
        super.setEnabled(z);
    }

    public final void t(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public final void u(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.google.android.projection.gearhead.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(com.google.android.projection.gearhead.R.color.design_error));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101 A[PHI: r2
  0x0101: PHI (r2v7 boolean) = (r2v6 boolean), (r2v10 boolean) binds: [B:52:0x00f1, B:57:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(android.text.Editable r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v(android.text.Editable):void");
    }

    public final void w() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = ko.a;
        Drawable drawableMutate = background.mutate();
        if (C()) {
            drawableMutate.setColorFilter(jc.b(b(), PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            drawableMutate.setColorFilter(jc.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void x() {
        Drawable rippleDrawable;
        EditText editText = this.c;
        if (editText == null || this.N == null) {
            return;
        }
        if ((this.Q || editText.getBackground() == null) && this.m != 0) {
            EditText editText2 = this.c;
            if (!(editText2 instanceof AutoCompleteTextView) || wox.d(editText2)) {
                rippleDrawable = this.N;
            } else {
                int iM = woy.m(this.c, com.google.android.projection.gearhead.R.attr.colorControlHighlight);
                int i = this.m;
                if (i == 2) {
                    Context context = getContext();
                    wue wueVar = this.N;
                    int[][] iArr = t;
                    int iS = woy.s(context, "TextInputLayout");
                    wue wueVar2 = new wue(wueVar.fD());
                    int iO = woy.o(iM, iS, 0.1f);
                    wueVar2.O(new ColorStateList(iArr, new int[]{iO, 0}));
                    wueVar2.setTint(iS);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iO, iS});
                    wue wueVar3 = new wue(wueVar.fD());
                    wueVar3.setTint(-1);
                    rippleDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, wueVar2, wueVar3), wueVar});
                } else if (i == 1) {
                    wue wueVar4 = this.N;
                    int i2 = this.ae;
                    rippleDrawable = new RippleDrawable(new ColorStateList(t, new int[]{woy.o(iM, i2, 0.1f), i2}), wueVar4, wueVar4);
                } else {
                    rippleDrawable = null;
                }
            }
            this.c.setBackground(rippleDrawable);
            this.Q = true;
        }
    }

    public final void y(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.an;
        if (colorStateList2 != null) {
            this.q.m(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.an;
            int colorForState = this.ax;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            this.q.m(ColorStateList.valueOf(colorForState));
        } else if (C()) {
            wpx wpxVar = this.q;
            TextView textView2 = this.d.h;
            wpxVar.m(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.m(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.r(colorStateList);
        }
        if (z3 || !this.ay || (isEnabled() && z4)) {
            if (z2 || this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    i(1.0f);
                } else {
                    this.q.z(1.0f);
                }
                this.p = false;
                if (aa()) {
                    Q();
                }
                X();
                this.a.c(false);
                this.b.f(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.az) {
                i(BitmapDescriptorFactory.HUE_RED);
            } else {
                this.q.z(BitmapDescriptorFactory.HUE_RED);
            }
            if (aa() && !((wwr) this.N).a.w.isEmpty()) {
                N();
            }
            this.p = true;
            O();
            this.a.c(true);
            this.b.f(true);
        }
    }

    public final void z(Editable editable) {
        if (c(editable) != 0 || this.p) {
            O();
            return;
        }
        if (this.k == null || !this.j || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        fgh.b(this.u, this.F);
        this.k.setVisibility(0);
        this.k.bringToFront();
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new wly(6);
        CharSequence a;
        boolean b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.b = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + String.valueOf(this.a) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
