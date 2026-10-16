package com.waze.trip_overview.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.waze.ui.z.as;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class TripOverviewAlertsContainer extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripOverviewAlertsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        setOrientation(1);
    }

    public final void a(f fVar) {
        x.f(fVar, "tripOverviewAlert");
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        if (getChildCount() > 0) {
            layoutParamsGenerateDefaultLayoutParams.topMargin = as.f(8);
        }
        addView(fVar, layoutParamsGenerateDefaultLayoutParams);
    }

    public /* synthetic */ TripOverviewAlertsContainer(Context context, AttributeSet attributeSet, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
