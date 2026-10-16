package android.support.v7.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AlertDialogLayout extends android.support.v7.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context context) {
        super(context);
    }

    private static int a(android.view.View view) {
        int[] iArr = defpackage.ebt.a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int i9 = this.f;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        android.graphics.drawable.Drawable drawable = this.g;
        int intrinsicHeight = drawable == null ? 0 : drawable.getIntrinsicHeight();
        for (int i12 = 0; i12 < childCount; i12++) {
            android.view.View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                defpackage.le leVar = (defpackage.le) childAt.getLayoutParams();
                int i13 = leVar.gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i7 = leVar.leftMargin + paddingLeft;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = leVar.rightMargin;
                    }
                    if (s(i12)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i14 = paddingTop + leVar.topMargin;
                    childAt.layout(i7, i14, measuredWidth + i7, i14 + measuredHeight2);
                    paddingTop = i14 + measuredHeight2 + leVar.bottomMargin;
                } else {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + leVar.leftMargin;
                    i6 = leVar.rightMargin;
                }
                i7 = i5 - i6;
                if (s(i12)) {
                    paddingTop += intrinsicHeight;
                }
                int i15 = paddingTop + leVar.topMargin;
                childAt.layout(i7, i15, measuredWidth + i7, i15 + measuredHeight2);
                paddingTop = i15 + measuredHeight2 + leVar.bottomMargin;
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iA;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int i3;
        android.support.v7.widget.AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        android.view.View view4 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = alertDialogLayout.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == com.google.android.projection.gearhead.R.id.topPanel) {
                    view2 = childAt;
                } else if (id == com.google.android.projection.gearhead.R.id.buttonPanel) {
                    view3 = childAt;
                } else {
                    if ((id != com.google.android.projection.gearhead.R.id.contentPanel && id != com.google.android.projection.gearhead.R.id.customPanel) || view4 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view4 = childAt;
                }
            }
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i);
        int paddingTop = alertDialogLayout.getPaddingTop() + alertDialogLayout.getPaddingBottom();
        if (view2 != null) {
            view2.measure(i, 0);
            paddingTop += view2.getMeasuredHeight();
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, view2.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view3 != null) {
            view3.measure(i, 0);
            iA = a(view3);
            measuredHeight = view3.getMeasuredHeight() - iA;
            paddingTop += iA;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            iA = 0;
            measuredHeight = 0;
        }
        if (view4 != null) {
            view4.measure(i, mode == 0 ? 0 : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingTop), mode));
            int measuredHeight2 = view4.getMeasuredHeight();
            paddingTop += measuredHeight2;
            int iCombineMeasuredStates3 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, view4.getMeasuredState());
            i3 = measuredHeight2;
            view = view4;
            iCombineMeasuredStates2 = iCombineMeasuredStates3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            i3 = 0;
        }
        int i5 = size - paddingTop;
        if (view3 != null) {
            int i6 = paddingTop - iA;
            int iMin = java.lang.Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iA += iMin;
            }
            view3.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(iA, 1073741824));
            paddingTop = i6 + view3.getMeasuredHeight();
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, view3.getMeasuredState());
        }
        if (view != null && i5 > 0) {
            view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i3 + i5, mode));
            paddingTop = (paddingTop - i3) + view.getMeasuredHeight();
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt2 = alertDialogLayout.getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = java.lang.Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int iResolveSizeAndState = android.view.View.resolveSizeAndState(iMax + alertDialogLayout.getPaddingLeft() + alertDialogLayout.getPaddingRight(), i, iCombineMeasuredStates2);
        int i8 = i2;
        alertDialogLayout.setMeasuredDimension(iResolveSizeAndState, android.view.View.resolveSizeAndState(paddingTop, i8, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i9 = 0;
            while (i9 < childCount) {
                int i10 = iMakeMeasureSpec;
                android.view.View childAt3 = alertDialogLayout.getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    defpackage.le leVar = (defpackage.le) childAt3.getLayoutParams();
                    if (leVar.width == -1) {
                        int i11 = leVar.height;
                        leVar.height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, i10, 0, i8, 0);
                        leVar.height = i11;
                    }
                }
                i9++;
                alertDialogLayout = this;
                i8 = i2;
                iMakeMeasureSpec = i10;
            }
        }
    }

    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
