package com.waze.view.navbar;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f45060a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f45061b;

    /* renamed from: c, reason: collision with root package name */
    private final View f45062c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f45063d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f45064e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f45065f;

    public a(Context context) {
        super(context, null, 0);
        addView(LayoutInflater.from(getContext()).inflate(R.layout.alert_summary_view, (ViewGroup) this, false));
        this.f45060a = findViewById(R.id.alertSummaryTop);
        this.f45061b = (TextView) findViewById(R.id.alertSummaryCountLabel);
        this.f45062c = findViewById(R.id.alertSummaryDurationLayout);
        this.f45063d = (TextView) findViewById(R.id.alertSummaryDurationLabel);
        this.f45064e = (TextView) findViewById(R.id.alertSummaryDurationUnitsLabel);
        this.f45065f = (ImageView) findViewById(R.id.alertSummaryIcon);
    }

    public final void a(int i2) {
        ((GradientDrawable) this.f45060a.getBackground()).setColor(i2);
    }

    public final void b(int i2) {
        this.f45062c.setVisibility(8);
        TextView textView = this.f45061b;
        textView.setVisibility(0);
        textView.setText(String.valueOf(i2));
    }

    public final void c(int i2) {
        this.f45062c.setVisibility(0);
        this.f45061b.setVisibility(8);
        this.f45063d.setText(String.valueOf(i2));
        this.f45064e.setText(com.waze.shared_infra.o.b.a().c(R.string.DRIVE_OVERVIEW_TRAFFIC_MINUTES, new Object[0]));
    }

    public final void d(int i2) {
        this.f45065f.setImageResource(i2);
    }
}
