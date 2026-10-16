package com.waze.trip_overview.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Drawable drawable) {
        super(context, null);
        x.f(context, "context");
        x.f(drawable, "icon");
        LayoutInflater.from(context).inflate(R.layout.trip_overview_ad_pin_marker, this);
        ((ImageView) findViewById(R.id.adPinIcon)).setImageDrawable(drawable);
    }
}
