package com.waze.trip_overview.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.design_components.button.WazeIconButton;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.trip_overview.br;
import com.waze.trip_overview.bs;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class RouteHeader extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f41497a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f41498b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f41499c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f41500d;

    /* renamed from: e, reason: collision with root package name */
    private final h.f f41501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        this.f41497a = h.g.a(new com.waze.settings.d.a(this, 19));
        this.f41498b = h.g.a(new com.waze.settings.d.a(this, 20));
        this.f41499c = h.g.a(new com.waze.settings.g.a.b(this, 1));
        this.f41500d = h.g.a(new com.waze.settings.g.a.b(this, 2));
        this.f41501e = h.g.a(new com.waze.settings.g.a.b(this, 3));
        ConstraintLayout.inflate(context, R.layout.route_header, this);
        setBackgroundColor(ContextCompat.getColor(context, R.color.background_default));
        j().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.waze.trip_overview.views.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                RouteHeader.h(this.f41504a);
            }
        });
        d dVar = new d(context, this);
        if (dVar.canDetectOrientation()) {
            dVar.enable();
        }
        if (isInEditMode()) {
            g(true);
            f("time to leave text");
            e("origin text");
            c("destination text");
        }
    }

    static final void h(RouteHeader routeHeader) {
        routeHeader.k(routeHeader.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WazeTextView j() {
        return (WazeTextView) this.f41498b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(TextView textView) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        x.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        textView.setMaxWidth((int) (getResources().getDisplayMetrics().widthPixels * 0.7f));
        textView.setLayoutParams((ConstraintLayout.LayoutParams) layoutParams);
    }

    public final void b(bs bsVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2) {
        x.f(bsVar, "state");
        x.f(lVar, "onVehicleTypeSelected");
        x.f(aVar, "onTooltipShown");
        x.f(aVar2, "onTooltipDismissedByUI");
        ComposeView composeView = (ComposeView) findViewById(R.id.tripOverview_vehicleTypeSelectorComposeHeader);
        if (composeView == null) {
            return;
        }
        View viewFindViewById = findViewById(R.id.separator);
        int i2 = getResources().getConfiguration().orientation;
        if (bsVar instanceof br) {
            composeView.setVisibility(0);
            if (i2 == 2) {
                viewFindViewById.setVisibility(8);
            }
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(824109275, true, new com.waze.reports_v2.presentation.g(bsVar, lVar, aVar, aVar2, 2)));
            return;
        }
        composeView.setVisibility(8);
        if (i2 == 2) {
            viewFindViewById.setVisibility(0);
        }
    }

    public final void c(String str) {
        x.f(str, "text");
        j().setText(str);
    }

    public final void d(View.OnClickListener onClickListener) {
        x.f(onClickListener, "onClickListener");
        ((WazeIconButton) this.f41501e.getValue()).setOnClickListener(onClickListener);
    }

    public final void e(String str) {
        x.f(str, "text");
        ((WazeTextView) this.f41497a.getValue()).setText(str);
    }

    public final void f(String str) {
        ((TextView) this.f41499c.getValue()).setText(str);
    }

    public final void g(boolean z) {
        com.waze.ad.a.j.g((ViewGroup) this.f41500d.getValue(), z);
    }

    public /* synthetic */ RouteHeader(Context context, AttributeSet attributeSet, int i2, o oVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }
}
