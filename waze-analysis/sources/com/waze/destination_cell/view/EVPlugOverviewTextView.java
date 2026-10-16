package com.waze.destination_cell.view;

import android.content.Context;
import android.util.AttributeSet;
import com.waze.design_components.text_view.WazeTextView;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class EVPlugOverviewTextView extends WazeTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVPlugOverviewTextView(Context context) {
        this(context, null, 0, 6, null);
        x.f(context, "context");
    }

    @Override // com.waze.design_components.text_view.WazeTextView, android.support.v7.widget.bn, android.widget.TextView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getMeasuredWidth();
        getCompoundPaddingLeft();
        getCompoundPaddingRight();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EVPlugOverviewTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        x.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EVPlugOverviewTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        x.f(context, "context");
        com.waze.shared_infra.o.b.a();
    }

    public /* synthetic */ EVPlugOverviewTextView(Context context, AttributeSet attributeSet, int i2, int i3, o oVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
