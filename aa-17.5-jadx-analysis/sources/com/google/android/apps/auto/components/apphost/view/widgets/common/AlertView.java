package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class AlertView extends LinearLayout {
    public CarTextView a;
    public CarTextView b;
    public ActionButtonListView c;
    public ActionButtonView d;
    public ProgressBar e;
    public ObjectAnimator f;
    private ImageView g;

    public AlertView(Context context) {
        this(context, null);
    }

    public static final boolean b(long j) {
        return j != 2147483647L;
    }

    public final void a(Drawable drawable) {
        ImageView imageView = this.g;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            this.g.setImageDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.g = (ImageView) findViewById(R.id.alert_icon);
        this.a = (CarTextView) findViewById(R.id.alert_title);
        this.b = (CarTextView) findViewById(R.id.alert_subtitle);
        this.c = (ActionButtonListView) findViewById(R.id.action_button_list_view);
        this.e = (ProgressBar) findViewById(R.id.progress);
    }

    public AlertView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlertView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
