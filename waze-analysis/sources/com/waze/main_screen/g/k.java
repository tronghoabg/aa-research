package com.waze.main_screen.g;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.core.content.res.ResourcesCompat;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final int f26406a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26407b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26408c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26409d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26410e;

    /* renamed from: f, reason: collision with root package name */
    private final float f26411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, String str, Integer num) throws Resources.NotFoundException {
        super(context);
        x.f(context, "context");
        x.f(str, "text");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.incar_insight_view_min_width);
        this.f26406a = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.incar_insight_view_horizontal_padding);
        this.f26407b = dimensionPixelSize2;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.incar_insight_view_text_vertical_margin);
        this.f26408c = dimensionPixelSize3;
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.incar_insight_view_icon_size);
        this.f26409d = dimensionPixelSize4;
        int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.incar_insight_view_icon_margin);
        this.f26410e = dimensionPixelSize5;
        this.f26411f = 18.0f;
        setOrientation(0);
        setGravity(17);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        setBackground(android.support.a.i.d(context, R.drawable.incar_insight_background));
        setMinimumWidth(dimensionPixelSize);
        if (num != null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(context);
            appCompatImageView.setImageResource(num.intValue());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize4, dimensionPixelSize4);
            layoutParams.setMargins(0, dimensionPixelSize5, dimensionPixelSize5, dimensionPixelSize5);
            appCompatImageView.setLayoutParams(layoutParams);
            addView(appCompatImageView);
        }
        WazeTextView wazeTextView = new WazeTextView(context, null, 0, 6, null);
        wazeTextView.setText(str);
        wazeTextView.setTextColor(context.getColor(R.color.content_default));
        wazeTextView.setTextSize(1, 18.0f);
        wazeTextView.setTypeface(ResourcesCompat.getFont(context, R.font.roboto_bold));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, dimensionPixelSize3, 0, dimensionPixelSize3);
        wazeTextView.setLayoutParams(layoutParams2);
        wazeTextView.setGravity(17);
        wazeTextView.setMaxLines(2);
        wazeTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(wazeTextView);
    }
}
