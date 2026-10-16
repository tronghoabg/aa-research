package com.waze.trip_overview.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.ui.z.as;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f41509a;

    /* renamed from: b, reason: collision with root package name */
    private final WazeTextView f41510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, e eVar) {
        super(context, null);
        x.f(context, "context");
        x.f(eVar, "tovAlertData");
        x.f(context, "context");
        ImageView imageView = new ImageView(context);
        this.f41509a = imageView;
        WazeTextView wazeTextView = new WazeTextView(context, null, 0, 6, null);
        this.f41510b = wazeTextView;
        setOrientation(0);
        setGravity(48);
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = as.g(context, 20);
        layoutParamsGenerateDefaultLayoutParams.height = as.g(context, 20);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(imageView, layoutParamsGenerateDefaultLayoutParams);
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = generateDefaultLayoutParams();
        wazeTextView.a(com.waze.design_components.text_view.a.n);
        wazeTextView.setTextColor(ContextCompat.getColor(context, R.color.content_p3));
        layoutParamsGenerateDefaultLayoutParams2.leftMargin = as.g(context, 6);
        addView(wazeTextView, layoutParamsGenerateDefaultLayoutParams2);
        com.waze.design_components.b.d dVarB = eVar.b();
        int iA = eVar.a();
        Context context2 = getContext();
        x.e(context2, "getContext(...)");
        imageView.setImageDrawable(dVarB.f(context2, com.waze.design_components.b.e.f23312a, ContextCompat.getColor(getContext(), iA)));
        wazeTextView.setText(eVar.c());
    }
}
