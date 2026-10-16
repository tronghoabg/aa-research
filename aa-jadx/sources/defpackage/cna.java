package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class cna extends android.view.ViewGroup {
    private boolean a;

    public cna(android.content.Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(com.google.android.projection.gearhead.R.id.hide_graphics_layer_in_inspector_tag, java.lang.Boolean.TRUE);
    }

    public final void a(defpackage.ckc ckcVar, android.view.View view, long j) {
        android.graphics.Canvas canvas = defpackage.cjn.a;
        ckcVar.getClass();
        super.drawChild(((defpackage.cjm) ckcVar).a, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            childAt.getClass();
            if (((defpackage.cmz) childAt).a) {
                this.a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildCount() {
        if (this.a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
