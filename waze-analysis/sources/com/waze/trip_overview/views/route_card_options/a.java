package com.waze.trip_overview.views.route_card_options;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.location.af;
import com.waze.shared_infra.i.h;
import com.waze.trip_overview.an;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private WazeTextView f41545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, null);
        x.f(context, "context");
        setOrientation(0);
        setGravity(16);
    }

    public final void a(an anVar) {
        x.f(anVar, "hovRoute");
        removeAllViews();
        String strC = anVar.c();
        Context context = getContext();
        x.e(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1630698206, true, new af(strC, 7)));
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.leftMargin = h.r(2);
        addView(composeView, layoutParamsGenerateDefaultLayoutParams);
        if (o.G(anVar.a().b())) {
            return;
        }
        Context context2 = getContext();
        x.e(context2, "getContext(...)");
        WazeTextView wazeTextView = new WazeTextView(context2, null, 0, 6, null);
        com.waze.design_components.text_view.a aVar = com.waze.design_components.text_view.a.f23491l;
        wazeTextView.a(aVar);
        wazeTextView.setText(" • ");
        addView(wazeTextView);
        String strB = anVar.a().b();
        Context context3 = getContext();
        x.e(context3, "getContext(...)");
        WazeTextView wazeTextView2 = new WazeTextView(context3, null, 0, 6, null);
        wazeTextView2.a(aVar);
        wazeTextView2.setText(strB);
        this.f41545a = wazeTextView2;
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams2.leftMargin = h.r(4);
        addView(this.f41545a, layoutParamsGenerateDefaultLayoutParams2);
    }

    public final void b(String str) {
        WazeTextView wazeTextView;
        x.f(str, "text");
        String str2 = str;
        if (o.G(str2) || (wazeTextView = this.f41545a) == null) {
            return;
        }
        wazeTextView.setText(str2);
    }
}
