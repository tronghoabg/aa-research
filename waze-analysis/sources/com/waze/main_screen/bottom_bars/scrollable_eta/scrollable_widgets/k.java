package com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.main_screen.bottom_bars.scrollable_eta.q;
import com.waze.navigate.NavResultData;
import com.waze.web.r;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k extends h {

    /* renamed from: b, reason: collision with root package name */
    private TextView f26045b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f26046c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f26047d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f26048e;

    /* renamed from: f, reason: collision with root package name */
    private ViewGroup f26049f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f26050g;

    /* renamed from: h, reason: collision with root package name */
    private final q f26051h;

    public k(Context context) {
        super(context);
        this.f26050g = com.waze.shared_infra.o.b.a();
        this.f26051h = (q) r.h(q.class);
    }

    public static /* synthetic */ void k(k kVar) {
        kVar.f26030a.j();
        kVar.f26051h.c(com.waze.main_screen.bottom_bars.scrollable_eta.l.v, true, null, null, true, null);
        kVar.f26030a.a();
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void a(boolean z) {
        this.f26045b.setTextColor(ContextCompat.getColor(getContext(), R.color.content_p1));
        this.f26049f.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        this.f26047d.setTextColor(ContextCompat.getColor(getContext(), R.color.alarming_variant));
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.eta_widget_hov_suggestion, (ViewGroup) this, false);
        this.f26045b = (TextView) viewInflate.findViewById(R.id.lblHovTitle);
        this.f26046c = (TextView) viewInflate.findViewById(R.id.lblTimeSaved);
        this.f26047d = (TextView) viewInflate.findViewById(R.id.lblRequirePermit);
        this.f26048e = (TextView) viewInflate.findViewById(R.id.lblHovNumber);
        this.f26049f = (ViewGroup) viewInflate.findViewById(R.id.hovLabelContainer);
        addView(viewInflate);
        setVisibility(8);
        setOnClickListener(new com.waze.feedback.b(this, 13));
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void d() {
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void f(NavResultData navResultData) {
        int color;
        String strC;
        boolean z;
        if (navResultData == null) {
            return;
        }
        if (navResultData.otherRouteHovMinPassengers <= 1) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f26048e.setText(String.format(Locale.US, "%d+", Integer.valueOf(navResultData.otherRouteHovMinPassengers)));
        this.f26048e.setVisibility(0);
        this.f26047d.setVisibility(true != TextUtils.isEmpty(navResultData.otherRouteHovRequiredPermits) ? 0 : 8);
        int i2 = navResultData.otherRouteDurationSeconds - (navResultData.isWaypoint ? navResultData.etaSecondsToWaypoint : navResultData.etaSecondsToDestination);
        int iAbs = Math.abs(i2) / 60;
        if (iAbs > 1) {
            if (i2 < 0) {
                color = ContextCompat.getColor(getContext(), R.color.safe);
                strC = this.f26050g.c(R.string.ALT_HOV_SUGGESTION_SAVE_PD_MINUTES, new Object[0]);
            } else {
                color = ContextCompat.getColor(getContext(), R.color.alarming_variant);
                strC = this.f26050g.c(R.string.ALT_HOV_SUGGESTION_ADD_PD_MINUTES, new Object[0]);
            }
            z = true;
        } else {
            color = ContextCompat.getColor(getContext(), R.color.content_default);
            strC = this.f26050g.c(R.string.ALTERNATE_ROUTES_SIMILAR_ETA, new Object[0]);
            z = false;
        }
        if (z) {
            strC = String.format(Locale.US, strC, Integer.valueOf(iAbs));
        }
        this.f26046c.setText(strC);
        this.f26046c.setTextColor(color);
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void g() {
    }

    @Override // com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.h
    public final void h() {
        TextView textView = this.f26045b;
        com.waze.shared_infra.o.a aVar = this.f26050g;
        textView.setText(aVar.c(R.string.ETA_HOV_CARD_TITLE, new Object[0]));
        this.f26047d.setText(aVar.c(R.string.ALT_ROUTE_LABEL_HOV_REQUIRES_SUBSCRIPTION, new Object[0]));
    }
}
