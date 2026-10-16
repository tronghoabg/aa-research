package android.support.v7.widget;

/* JADX INFO: loaded from: classes2.dex */
public final class AppCompatSpinner extends android.widget.Spinner {
    private static final int[] e = {android.R.attr.spinnerMode};
    public final android.content.Context a;
    public defpackage.jt b;
    public int c;
    public final android.graphics.Rect d;
    private final defpackage.ix f;
    private defpackage.ky g;
    private android.widget.SpinnerAdapter h;
    private final boolean i;

    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.support.v7.widget.AppCompatSpinner.SavedState> CREATOR = new defpackage.x(14);
        boolean a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:214), block:B:39:0x00d5 */
    public AppCompatSpinner(android.content.Context context, android.util.AttributeSet attributeSet) throws java.lang.Throwable {
        java.lang.Exception e2;
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        android.content.res.TypedArray typedArray;
        super(context, attributeSet, com.google.android.projection.gearhead.R.attr.spinnerStyle);
        this.d = new android.graphics.Rect();
        defpackage.ne.d(this, getContext());
        defpackage.lam lamVarC = defpackage.lam.C(context, attributeSet, defpackage.ft.v, com.google.android.projection.gearhead.R.attr.spinnerStyle, 0);
        this.f = new defpackage.ix(this);
        int iQ = lamVarC.q(4, 0);
        if (iQ != 0) {
            this.a = new defpackage.pl(context, iQ);
        } else {
            this.a = context;
        }
        android.content.res.TypedArray typedArray2 = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e, com.google.android.projection.gearhead.R.attr.spinnerStyle, 0);
                try {
                    int i = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getInt(0, 0) : -1;
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    if (i == 0) {
                        defpackage.jp jpVar = new defpackage.jp(this);
                        this.b = jpVar;
                        jpVar.i(lamVarC.v(2));
                    } else if (i == 1) {
                        defpackage.js jsVar = new defpackage.js(this, this.a, attributeSet);
                        defpackage.lam lamVarC2 = defpackage.lam.C(this.a, attributeSet, defpackage.ft.v, com.google.android.projection.gearhead.R.attr.spinnerStyle, 0);
                        this.c = lamVarC2.p(3, -2);
                        jsVar.f(lamVarC2.s(1));
                        jsVar.a = lamVarC.v(2);
                        lamVarC2.w();
                        this.b = jsVar;
                        this.g = new defpackage.jo(this, this, jsVar);
                    }
                } catch (java.lang.Exception e3) {
                    e2 = e3;
                    android.util.Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e2);
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                }
            } catch (java.lang.Throwable th) {
                th = th;
                typedArray2 = typedArray;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (java.lang.Exception e4) {
            e2 = e4;
            typedArrayObtainStyledAttributes = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        java.lang.CharSequence[] textArray = ((android.content.res.TypedArray) lamVarC.a).getTextArray(0);
        if (textArray != null) {
            android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter(context, android.R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.google.android.projection.gearhead.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((android.widget.SpinnerAdapter) arrayAdapter);
        }
        lamVarC.w();
        this.i = true;
        android.widget.SpinnerAdapter spinnerAdapter = this.h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.h = null;
        }
        this.f.b(attributeSet, com.google.android.projection.gearhead.R.attr.spinnerStyle);
    }

    public final int a(android.widget.SpinnerAdapter spinnerAdapter, android.graphics.drawable.Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = java.lang.Math.max(0, getSelectedItemPosition());
        int iMin = java.lang.Math.min(spinnerAdapter.getCount(), iMax + 15);
        int iMax2 = java.lang.Math.max(0, iMax - (15 - (iMin - iMax)));
        android.view.View view = null;
        int iMax3 = 0;
        while (iMax2 < iMin) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax2);
            int i2 = itemViewType != i ? itemViewType : i;
            if (itemViewType != i) {
                view = null;
            }
            view = spinnerAdapter.getView(iMax2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax3 = java.lang.Math.max(iMax3, view.getMeasuredWidth());
            iMax2++;
            i = i2;
        }
        if (drawable == null) {
            return iMax3;
        }
        android.graphics.Rect rect = this.d;
        drawable.getPadding(rect);
        return iMax3 + rect.left + rect.right;
    }

    public final void b() {
        this.b.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.ix ixVar = this.f;
        if (ixVar != null) {
            ixVar.a();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        defpackage.jt jtVar = this.b;
        return jtVar != null ? jtVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        defpackage.jt jtVar = this.b;
        return jtVar != null ? jtVar.b() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.b != null ? this.c : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final android.graphics.drawable.Drawable getPopupBackground() {
        defpackage.jt jtVar = this.b;
        return jtVar != null ? jtVar.c() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final android.content.Context getPopupContext() {
        return this.a;
    }

    @Override // android.widget.Spinner
    public final java.lang.CharSequence getPrompt() {
        defpackage.jt jtVar = this.b;
        return jtVar != null ? jtVar.d() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.jt jtVar = this.b;
        if (jtVar == null || !jtVar.u()) {
            return;
        }
        this.b.k();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b == null || android.view.View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.ViewTreeObserver viewTreeObserver;
        android.support.v7.widget.AppCompatSpinner.SavedState savedState = (android.support.v7.widget.AppCompatSpinner.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new defpackage.hy(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        android.support.v7.widget.AppCompatSpinner.SavedState savedState = new android.support.v7.widget.AppCompatSpinner.SavedState(super.onSaveInstanceState());
        defpackage.jt jtVar = this.b;
        boolean z = false;
        if (jtVar != null && jtVar.u()) {
            z = true;
        }
        savedState.a = z;
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        defpackage.ky kyVar = this.g;
        if (kyVar == null || !kyVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        defpackage.jt jtVar = this.b;
        if (jtVar == null) {
            return super.performClick();
        }
        if (jtVar.u()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(android.widget.SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.b != null) {
            android.content.Context context = this.a;
            if (context == null) {
                context = getContext();
            }
            this.b.e(new defpackage.jq(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.ix ixVar = this.f;
        if (ixVar != null) {
            ixVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.ix ixVar = this.f;
        if (ixVar != null) {
            ixVar.c(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        defpackage.jt jtVar = this.b;
        if (jtVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            jtVar.h(i);
            this.b.g(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        defpackage.jt jtVar = this.b;
        if (jtVar != null) {
            jtVar.j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.b != null) {
            this.c = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.jt jtVar = this.b;
        if (jtVar != null) {
            jtVar.f(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(defpackage.ca.e(this.a, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(java.lang.CharSequence charSequence) {
        defpackage.jt jtVar = this.b;
        if (jtVar != null) {
            jtVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }
}
