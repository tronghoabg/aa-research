package com.google.android.gearhead.demand;

/* JADX INFO: loaded from: classes2.dex */
class ActionProgressIndicatorView extends android.widget.FrameLayout {
    public ActionProgressIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.action_progress_indicator, (android.view.ViewGroup) this, true);
        findViewById(com.google.android.projection.gearhead.R.id.indicator_circle);
    }

    public ActionProgressIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionProgressIndicatorView(android.content.Context context) {
        this(context, null);
    }
}
