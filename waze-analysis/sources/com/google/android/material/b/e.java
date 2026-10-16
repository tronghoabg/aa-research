package com.google.android.material.b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.a.i;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.support.v7.widget.gc;
import android.support.v7.widget.z;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.internal.n;
import com.google.android.material.internal.t;
import com.waze.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class e extends z {

    /* renamed from: c, reason: collision with root package name */
    private static final int f6207c = 2131953288;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f6208d = {R.attr.state_indeterminate};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6209e = {R.attr.state_error};

    /* renamed from: f, reason: collision with root package name */
    private static final int[][] f6210f = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: g, reason: collision with root package name */
    private static final int f6211g = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: a, reason: collision with root package name */
    ColorStateList f6212a;

    /* renamed from: b, reason: collision with root package name */
    final ColorStateList f6213b;

    /* renamed from: h, reason: collision with root package name */
    private final LinkedHashSet f6214h;

    /* renamed from: i, reason: collision with root package name */
    private ColorStateList f6215i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6216j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f6217k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f6218l;
    private final CharSequence m;
    private Drawable n;
    private Drawable o;
    private boolean p;
    private final PorterDuff.Mode q;
    private int r;
    private int[] s;
    private boolean t;
    private CharSequence u;
    private CompoundButton.OnCheckedChangeListener v;
    private final AnimatedVectorDrawableCompat w;
    private final Animatable2Compat.AnimationCallback x;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListO;
        int i2 = f6207c;
        super(com.google.android.material.theme.a.a.a(context, attributeSet, R.attr.checkboxStyle, i2), attributeSet);
        new LinkedHashSet();
        this.f6214h = new LinkedHashSet();
        this.w = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.x = new a(this);
        Context context2 = getContext();
        this.n = CompoundButtonCompat.getButtonDrawable(this);
        ColorStateList colorStateList = this.f6212a;
        this.f6212a = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList() : colorStateList;
        setSupportButtonTintList(null);
        gc gcVarB = n.b(context2, attributeSet, f.f6219a, R.attr.checkboxStyle, i2, new int[0]);
        this.o = gcVarB.j(2);
        if (this.n != null && t.j(context2, R.attr.isMaterial3Theme, false)) {
            int iF = gcVarB.f(0, 0);
            int iF2 = gcVarB.f(1, 0);
            if (iF == f6211g && iF2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.n = i.d(context2, R.drawable.mtrl_checkbox_button);
                this.p = true;
                if (this.o == null) {
                    this.o = i.d(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f6213b = t.o(context2, gcVarB, 3);
        this.q = com.waze.c.c.e.h(gcVarB.c(4, -1), PorterDuff.Mode.SRC_IN);
        this.f6216j = gcVarB.r(11, false);
        this.f6217k = gcVarB.r(6, true);
        this.f6218l = gcVarB.r(9, false);
        this.m = gcVarB.o(8);
        if (gcVarB.s(7)) {
            a(gcVarB.c(7, 0));
        }
        if (gcVarB.s(10) && (colorStateListO = t.o(context2, gcVarB, 10)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListO);
            }
        }
        gcVarB.q();
        c();
    }

    private final void c() {
        ColorStateList colorStateList;
        this.n = com.google.android.material.d.c.a(this.n, this.f6212a, CompoundButtonCompat.getButtonTintMode(this));
        Drawable drawable = this.o;
        ColorStateList colorStateList2 = this.f6213b;
        this.o = com.google.android.material.d.c.a(drawable, colorStateList2, this.q);
        if (this.p) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.w;
            if (animatedVectorDrawableCompat != null) {
                Animatable2Compat.AnimationCallback animationCallback = this.x;
                animatedVectorDrawableCompat.unregisterAnimationCallback(animationCallback);
                animatedVectorDrawableCompat.registerAnimationCallback(animationCallback);
            }
            Drawable drawable2 = this.n;
            if ((drawable2 instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable2).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.n).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable3 = this.n;
        if (drawable3 != null && (colorStateList = this.f6212a) != null) {
            drawable3.setTintList(colorStateList);
        }
        Drawable drawable4 = this.o;
        if (drawable4 != null && colorStateList2 != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.n;
        Drawable drawable6 = this.o;
        if (drawable5 == null) {
            drawable5 = drawable6;
        } else if (drawable6 != null) {
            int intrinsicWidth = drawable6.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable5.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable6.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable5.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable5.getIntrinsicWidth() || intrinsicHeight > drawable5.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable5.getIntrinsicWidth() / drawable5.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable5.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable5.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable5, drawable6});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable5 = layerDrawable;
        }
        super.setButtonDrawable(drawable5);
        refreshDrawableState();
    }

    private final void d() {
        if (Build.VERSION.SDK_INT < 30 || this.u != null) {
            return;
        }
        int i2 = this.r;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void a(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.r != i2) {
            this.r = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            d();
            if (this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet = this.f6214h;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            }
            if (this.r != 2 && (onCheckedChangeListener = this.v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManagerM63m = j$$ExternalSyntheticApiModelOutline1.m63m(getContext().getSystemService(j$$ExternalSyntheticApiModelOutline1.m81m$2()));
            if (autofillManagerM63m != null) {
                autofillManagerM63m.notifyValueChanged(this);
            }
            this.t = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.n;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.f6212a;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6216j && this.f6212a == null && this.f6213b == null) {
            this.f6216j = true;
            ColorStateList colorStateList = this.f6215i;
            if (colorStateList == null) {
                int[][] iArr = f6210f;
                int length = iArr.length;
                int iB = com.google.android.material.focus.d.b(this, R.attr.colorControlActivated);
                int iB2 = com.google.android.material.focus.d.b(this, R.attr.colorError);
                int iB3 = com.google.android.material.focus.d.b(this, R.attr.colorSurface);
                int iB4 = com.google.android.material.focus.d.b(this, R.attr.colorOnSurface);
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{com.google.android.material.focus.d.d(iB3, iB2, 1.0f), com.google.android.material.focus.d.d(iB3, iB, 1.0f), com.google.android.material.focus.d.d(iB3, iB4, 0.54f), com.google.android.material.focus.d.d(iB3, iB4, 0.38f), com.google.android.material.focus.d.d(iB3, iB4, 0.38f)});
                this.f6215i = colorStateList2;
                colorStateList = colorStateList2;
            }
            CompoundButtonCompat.setButtonTintList(this, colorStateList);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArr;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.r == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6208d);
        }
        if (this.f6218l) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6209e);
        }
        int i3 = 0;
        while (true) {
            int length = iArrOnCreateDrawableState.length;
            if (i3 >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, length + 1);
                iArrCopyOf[length] = 16842912;
                iArr = iArrCopyOf;
                break;
            }
            int i4 = iArrOnCreateDrawableState[i3];
            if (i4 == 16842912) {
                iArr = iArrOnCreateDrawableState;
                break;
            }
            if (i4 == 0) {
                iArr = (int[]) iArrOnCreateDrawableState.clone();
                iArr[i3] = 16842912;
                break;
            }
            i3++;
        }
        this.s = iArr;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f6217k || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == t.b(this) ? -1 : 1;
        int width = getWidth() - buttonDrawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f6218l) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        a(dVar.f6206a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f6206a = this.r;
        return dVar;
    }

    @Override // android.support.v7.widget.z, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(i.d(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.f6212a == colorStateList) {
            return;
        }
        this.f6212a = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.u = charSequence;
        if (charSequence == null) {
            d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    @Override // android.support.v7.widget.z, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.n = drawable;
        this.p = false;
        c();
    }
}
