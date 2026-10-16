package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class l8 extends ViewGroup {
    public final int a;
    public final int b;

    public l8(Context context, int i, int i2) {
        super(context);
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = ((i3 - i) - paddingLeft) - getPaddingRight();
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i5 > 0 && i5 + measuredWidth > paddingRight) {
                    i6 += iMax + this.b;
                    i5 = 0;
                    iMax = 0;
                }
                int i8 = paddingLeft + i5;
                int i9 = paddingTop + i6;
                childAt.layout(i8, i9, i8 + measuredWidth, i9 + measuredHeight);
                i5 += measuredWidth + this.a;
                iMax = Math.max(iMax, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i4 > 0 && i4 + measuredWidth > paddingLeft) {
                    i3 += iMax + this.b;
                    iMax = 0;
                    i4 = 0;
                }
                i4 += measuredWidth + this.a;
                iMax = Math.max(iMax, measuredHeight);
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i3 + iMax);
    }
}
