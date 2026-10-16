package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class RowViewPrimaryContentContainer extends LinearLayout {
    private static final int[] a = {R.attr.templateFocusStateInactive};
    private boolean b;

    public RowViewPrimaryContentContainer(Context context) {
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

    public RowViewPrimaryContentContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RowViewPrimaryContentContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
