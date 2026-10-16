package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dau extends android.view.ViewGroup {
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    public dau(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (defpackage.dmm dmmVar : this.a.keySet()) {
            dmmVar.layout(dmmVar.getLeft(), dmmVar.getTop(), dmmVar.getRight(), dmmVar.getBottom());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            defpackage.csc.b("widthMeasureSpec should be EXACTLY");
        }
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            defpackage.csc.b("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
        for (defpackage.dmm dmmVar : this.a.keySet()) {
            int i4 = dmmVar.s;
            if (i4 != Integer.MIN_VALUE && (i3 = dmmVar.t) != Integer.MIN_VALUE) {
                dmmVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            defpackage.cxl cxlVar = (defpackage.cxl) this.a.get(childAt);
            if (childAt.isLayoutRequested() && cxlVar != null) {
                cxlVar.X(false, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
    }
}
