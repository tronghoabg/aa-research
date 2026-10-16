package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes5.dex */
public final class r extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f37154a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f37155b;

    public r(Context context) {
        super(context);
        this.f37154a = new Rect();
        this.f37155b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f37154a.set(i5, i10, i11, i12);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f37154a, layoutParams.x, layoutParams.y, this.f37155b);
            Rect rect = this.f37155b;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE));
        }
        super.onMeasure(i5, i10);
    }
}
