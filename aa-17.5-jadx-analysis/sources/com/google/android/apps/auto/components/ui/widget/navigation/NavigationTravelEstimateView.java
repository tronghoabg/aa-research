package com.google.android.apps.auto.components.ui.widget.navigation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class NavigationTravelEstimateView extends LinearLayout {
    public TextView a;
    public TextView b;

    public NavigationTravelEstimateView(Context context) {
        this(context, null);
    }

    public final void a(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.a;
        if (zIsEmpty) {
            textView.setText((CharSequence) null);
            this.a.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.a.setVisibility(0);
        }
    }

    public final void b(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.b;
        if (zIsEmpty) {
            textView.setText((CharSequence) null);
            this.b.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.b.setVisibility(0);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.arrival_time_text);
        this.b = (TextView) findViewById(R.id.time_and_distance_text);
    }

    public NavigationTravelEstimateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationTravelEstimateView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NavigationTravelEstimateView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
