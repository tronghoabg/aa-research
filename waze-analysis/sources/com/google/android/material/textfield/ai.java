package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.dm;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ai extends android.support.v7.widget.w {

    /* renamed from: a, reason: collision with root package name */
    private final dm f6850a;

    /* renamed from: b, reason: collision with root package name */
    private final AccessibilityManager f6851b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f6852c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6853d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6854e;

    /* renamed from: f, reason: collision with root package name */
    private final float f6855f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f6856g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6857h;

    /* renamed from: i, reason: collision with root package name */
    private final ColorStateList f6858i;

    public ai(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(com.google.android.material.theme.a.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.f6852c = new int[]{android.R.attr.state_selected};
        this.f6853d = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = com.google.android.material.internal.n.a(context2, attributeSet, al.f6863a, R.attr.autoCompleteTextViewStyle, 2131952870, new int[0]);
        if (typedArrayA.hasValue(0) && typedArrayA.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = typedArrayA.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f6854e = resourceId;
        this.f6855f = typedArrayA.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayA.hasValue(2)) {
            this.f6856g = ColorStateList.valueOf(typedArrayA.getColor(2, 0));
        }
        this.f6857h = typedArrayA.getColor(4, 0);
        this.f6858i = com.google.android.material.internal.t.n(context2, typedArrayA, 5);
        this.f6851b = (AccessibilityManager) context2.getSystemService("accessibility");
        dm dmVar = new dm(context2, null, R.attr.listPopupWindowStyle);
        this.f6850a = dmVar;
        dmVar.J();
        dmVar.y(this);
        dmVar.I();
        dmVar.e(getAdapter());
        dmVar.D(new ag(this));
        if (typedArrayA.hasValue(6)) {
            setAdapter(new ah(this, getContext(), resourceId, getResources().getStringArray(typedArrayA.getResourceId(6, 0))));
        }
        typedArrayA.recycle();
    }

    private final TextInputLayout h() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean i() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f6851b;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    public final float a() {
        return this.f6855f;
    }

    public final ColorStateList d() {
        return this.f6856g;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (i()) {
            this.f6850a.k();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout textInputLayoutH = h();
        return (textInputLayoutH == null || !textInputLayoutH.S()) ? super.getHint() : textInputLayoutH.n();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        dm dmVar = this.f6850a;
        if (dmVar == null || !dmVar.u()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutH = h();
        if (textInputLayoutH != null && textInputLayoutH.S() && super.getHint() == null && com.google.android.material.d.c.e()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6850a.k();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        boolean z;
        if (isPopupShowing()) {
            return super.onKeyDown(i2, keyEvent);
        }
        if (i2 == 66) {
            z = true;
        } else if (i2 == 23) {
            i2 = 23;
            z = true;
        } else {
            z = false;
        }
        if (getKeyListener() == null ? !(z || i2 == 62) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i2, keyEvent);
        }
        TextInputLayout textInputLayoutH = h();
        if (textInputLayoutH != null) {
            textInputLayoutH.g().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutH = h();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutH != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                dm dmVar = this.f6850a;
                int iMin = Math.min(adapter.getCount(), Math.max(0, dmVar.p()) + 15);
                int iMax = Math.max(0, iMin - 15);
                View view = null;
                int iMax2 = 0;
                while (iMax < iMin) {
                    int itemViewType = adapter.getItemViewType(iMax);
                    int i4 = itemViewType != measuredWidth2 ? itemViewType : measuredWidth2;
                    if (itemViewType != measuredWidth2) {
                        view = null;
                    }
                    view = adapter.getView(iMax, view, textInputLayoutH);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                    iMax++;
                    measuredWidth2 = i4;
                }
                Drawable drawableC = dmVar.c();
                if (drawableC != null) {
                    Rect rect = this.f6853d;
                    drawableC.getPadding(rect);
                    iMax2 += rect.left + rect.right;
                }
                measuredWidth2 = iMax2 + textInputLayoutH.g().getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (i()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f6850a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        dm dmVar = this.f6850a;
        if (dmVar != null) {
            dmVar.f(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f6850a.E(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout textInputLayoutH = h();
        if (textInputLayoutH != null) {
            textInputLayoutH.K();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (i()) {
            this.f6850a.s();
        } else {
            super.showDropDown();
        }
    }
}
