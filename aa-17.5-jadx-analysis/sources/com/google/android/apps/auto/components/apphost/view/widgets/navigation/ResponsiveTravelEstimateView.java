package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class ResponsiveTravelEstimateView extends BleedingCardView {
    public TextView f;
    public FrameLayout g;
    public ImageView h;

    public ResponsiveTravelEstimateView(Context context) {
        super(context);
    }

    @Override // defpackage.fvk, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (TextView) findViewById(R.id.responsive_travel_estimate_text);
        this.g = (FrameLayout) findViewById(R.id.stop_nav_action_container);
        this.h = (ImageView) findViewById(R.id.stop_nav_action_icon);
    }

    public ResponsiveTravelEstimateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ResponsiveTravelEstimateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
