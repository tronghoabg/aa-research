package com.google.android.apps.auto.components.apphost.view.widgets.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class ResponsiveTravelEstimateView extends com.google.android.apps.auto.components.apphost.view.widgets.common.BleedingCardView {
    public android.widget.TextView f;
    public android.widget.FrameLayout g;
    public android.widget.ImageView h;

    public ResponsiveTravelEstimateView(android.content.Context context) {
        super(context);
    }

    @Override // defpackage.fvu, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.responsive_travel_estimate_text);
        this.g = (android.widget.FrameLayout) findViewById(com.google.android.projection.gearhead.R.id.stop_nav_action_container);
        this.h = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.stop_nav_action_icon);
    }

    public ResponsiveTravelEstimateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ResponsiveTravelEstimateView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
