package com.google.android.apps.auto.components.ui.widget.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationTravelEstimateView extends android.widget.LinearLayout {
    public android.widget.TextView a;
    public android.widget.TextView b;

    public NavigationTravelEstimateView(android.content.Context context) {
        this(context, null);
    }

    public final void a(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.a;
        if (zIsEmpty) {
            textView.setText((java.lang.CharSequence) null);
            this.a.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.a.setVisibility(0);
        }
    }

    public final void b(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.b;
        if (zIsEmpty) {
            textView.setText((java.lang.CharSequence) null);
            this.b.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.b.setVisibility(0);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.arrival_time_text);
        this.b = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.time_and_distance_text);
    }

    public NavigationTravelEstimateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationTravelEstimateView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NavigationTravelEstimateView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
