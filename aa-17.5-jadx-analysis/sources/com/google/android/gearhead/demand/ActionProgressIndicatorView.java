package com.google.android.gearhead.demand;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
class ActionProgressIndicatorView extends FrameLayout {
    public ActionProgressIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.action_progress_indicator, (ViewGroup) this, true);
        findViewById(R.id.indicator_circle);
    }

    public ActionProgressIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionProgressIndicatorView(Context context) {
        this(context, null);
    }
}
