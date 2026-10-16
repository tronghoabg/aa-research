package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class v9 extends ViewGroup {
    public final int a;

    public v9(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = 0;
        int i7 = 0;
        int iMax = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i9 = this.a;
            if (i6 > 0 && i6 + measuredWidth > i5) {
                i7 += iMax + i9;
                i6 = 0;
                iMax = 0;
            }
            childAt.layout(i6, i7, i6 + measuredWidth, i7 + measuredHeight);
            i6 += measuredWidth + i9;
            iMax = Math.max(iMax, measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = 0;
        int iMax = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, View.MeasureSpec.makeMeasureSpec(size, EditorInfoCompat.IME_FLAG_FORCE_ASCII), i2);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = this.a;
            if (i4 > 0 && i4 + measuredWidth > size) {
                i3 += iMax + i6;
                iMax = 0;
                i4 = 0;
            }
            i4 += measuredWidth + i6;
            iMax = Math.max(iMax, measuredHeight);
        }
        setMeasuredDimension(size, i3 + iMax);
    }
}
