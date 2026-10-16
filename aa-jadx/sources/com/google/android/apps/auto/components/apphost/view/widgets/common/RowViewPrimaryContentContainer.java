package com.google.android.apps.auto.components.apphost.view.widgets.common;

/* JADX INFO: loaded from: classes2.dex */
public class RowViewPrimaryContentContainer extends android.widget.LinearLayout {
    private static final int[] a = {com.google.android.projection.gearhead.R.attr.templateFocusStateInactive};
    private boolean b;

    public RowViewPrimaryContentContainer(android.content.Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        if (!this.b) {
            return super.onCreateDrawableState(i);
        }
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(iArrOnCreateDrawableState, a);
        return iArrOnCreateDrawableState;
    }

    public RowViewPrimaryContentContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RowViewPrimaryContentContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
