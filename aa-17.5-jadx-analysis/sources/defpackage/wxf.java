package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes3.dex */
public final class wxf extends iv {
    public final lk a;
    public final int[] b;
    public final float c;
    public ColorStateList d;
    public final int e;
    public final ColorStateList f;
    private final AccessibilityManager g;
    private final Rect h;
    private final int i;

    public wxf(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(wxp.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.b = new int[]{android.R.attr.state_selected};
        this.h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wxh.a, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayA.hasValue(0) && typedArrayA.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = typedArrayA.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = resourceId;
        this.c = typedArrayA.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayA.hasValue(2)) {
            this.d = ColorStateList.valueOf(typedArrayA.getColor(2, 0));
        }
        this.e = typedArrayA.getColor(4, 0);
        this.f = wub.h(context2, typedArrayA, 5);
        this.g = (AccessibilityManager) context2.getSystemService("accessibility");
        lk lkVar = new lk(context2, null, R.attr.listPopupWindowStyle);
        this.a = lkVar;
        lkVar.y();
        lkVar.k = this;
        lkVar.x();
        lkVar.e(getAdapter());
        lkVar.l = new lcl(this, 3);
        if (typedArrayA.hasValue(6)) {
            setAdapter(new wxe(this, getContext(), resourceId, getResources().getStringArray(typedArrayA.getResourceId(6, 0))));
        }
        typedArrayA.recycle();
    }

    private final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.g;
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

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.a.k();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.l) ? super.getHint() : textInputLayoutB.f();
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        lk lkVar = this.a;
        if (lkVar == null || !lkVar.u()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.l && super.getHint() == null && wpq.c()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.k();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 66) {
            z = true;
        } else if (i == 23) {
            i = 23;
            z = true;
        } else {
            z = false;
        }
        if (getKeyListener() == null ? !(z || i == 62) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.d().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                lk lkVar = this.a;
                int iMin = Math.min(adapter.getCount(), Math.max(0, lkVar.o()) + 15);
                int iMax = Math.max(0, iMin - 15);
                View view = null;
                int iMax2 = 0;
                while (iMax < iMin) {
                    int itemViewType = adapter.getItemViewType(iMax);
                    int i3 = itemViewType != measuredWidth2 ? itemViewType : measuredWidth2;
                    if (itemViewType != measuredWidth2) {
                        view = null;
                    }
                    view = adapter.getView(iMax, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                    iMax++;
                    measuredWidth2 = i3;
                }
                Drawable drawableC = lkVar.c();
                if (drawableC != null) {
                    Rect rect = this.h;
                    drawableC.getPadding(rect);
                    iMax2 += rect.left + rect.right;
                }
                measuredWidth2 = iMax2 + textInputLayoutB.d().getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.a.e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        lk lkVar = this.a;
        if (lkVar != null) {
            lkVar.f(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.a.m = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.x();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.a.s();
        } else {
            super.showDropDown();
        }
    }
}
