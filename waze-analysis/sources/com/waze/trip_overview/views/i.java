package com.waze.trip_overview.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.waze.R;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.location.af;
import com.waze.trip_overview.am;
import com.waze.trip_overview.an;
import com.waze.trip_overview.at;
import com.waze.trip_overview.au;
import com.waze.trip_overview.bm;
import com.waze.trip_overview.bn;
import com.waze.trip_overview.bo;
import com.waze.trip_overview.views.route_card_options.RouteCardOptionsView;
import com.waze.ui.z.as;
import h.g.b.x;
import h.n.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends FrameLayout implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41517b = 0;

    /* renamed from: a, reason: collision with root package name */
    public at f41518a;

    /* renamed from: c, reason: collision with root package name */
    private com.waze.trip_overview.views.route_card_options.a f41519c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41520d;

    /* renamed from: e, reason: collision with root package name */
    private final List f41521e;

    /* renamed from: f, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f41522f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f41523g;

    /* renamed from: h, reason: collision with root package name */
    private final RouteCardOptionsView f41524h;

    /* renamed from: i, reason: collision with root package name */
    private final View f41525i;

    /* renamed from: j, reason: collision with root package name */
    private final ConstraintLayout f41526j;

    /* renamed from: k, reason: collision with root package name */
    private final WazeTextView f41527k;

    /* renamed from: l, reason: collision with root package name */
    private final TextView f41528l;
    private final ComposeView m;
    private final LinearLayout n;
    private final Flow o;
    private final WazeTextView p;
    private final WazeTextView q;
    private final TripOverviewAlertsContainer r;
    private final h.f s;
    private int t;
    private com.waze.trip_overview.c.a.d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        x.f(context, "context");
        this.f41521e = new ArrayList();
        this.s = h.g.a(new com.waze.settings.g.a.b(this, 4));
        LayoutInflater.from(getContext()).inflate(R.layout.trip_overview_route_card, this);
        View viewFindViewById = findViewById(R.id.routeViaText);
        x.e(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f41523g = textView;
        View viewFindViewById2 = findViewById(R.id.routeOptions);
        x.e(viewFindViewById2, "findViewById(...)");
        RouteCardOptionsView routeCardOptionsView = (RouteCardOptionsView) viewFindViewById2;
        this.f41524h = routeCardOptionsView;
        View viewFindViewById3 = findViewById(R.id.cardDividerTop);
        x.e(viewFindViewById3, "findViewById(...)");
        this.f41525i = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.routeDurationText);
        x.e(viewFindViewById4, "findViewById(...)");
        WazeTextView wazeTextView = (WazeTextView) viewFindViewById4;
        this.f41527k = wazeTextView;
        View viewFindViewById5 = findViewById(R.id.card);
        x.e(viewFindViewById5, "findViewById(...)");
        this.f41526j = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.routeDistanceText);
        x.e(viewFindViewById6, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById6;
        this.f41528l = textView2;
        View viewFindViewById7 = findViewById(R.id.eventsOnRouteContainer);
        x.e(viewFindViewById7, "findViewById(...)");
        this.m = (ComposeView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.routePrimaryLabelsContainer);
        x.e(viewFindViewById8, "findViewById(...)");
        this.n = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.routePrimaryLabelsContainerOverflow);
        x.e(viewFindViewById9, "findViewById(...)");
        this.o = (Flow) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.routeTrafficText);
        x.e(viewFindViewById10, "findViewById(...)");
        WazeTextView wazeTextView2 = (WazeTextView) viewFindViewById10;
        this.p = wazeTextView2;
        View viewFindViewById11 = findViewById(R.id.carbonEmissionText);
        x.e(viewFindViewById11, "findViewById(...)");
        WazeTextView wazeTextView3 = (WazeTextView) viewFindViewById11;
        this.q = wazeTextView3;
        View viewFindViewById12 = findViewById(R.id.alertsContainer);
        x.e(viewFindViewById12, "findViewById(...)");
        this.r = (TripOverviewAlertsContainer) viewFindViewById12;
        i iVar = this;
        x.f(iVar, "onCheckedChangeListener");
        routeCardOptionsView.a().setOnCheckedChangeListener(iVar);
        textView.setContentDescription("TRIP_OVERVIEW_ROUTE_CARD_NAME_LABEL");
        textView2.setContentDescription("TRIP_OVERVIEW_ROUTE_CARD_DISTANCE_LABEL");
        wazeTextView2.setContentDescription("TRIP_OVERVIEW_ROUTE_CARD_TRAFFIC_LABEL");
        wazeTextView.setContentDescription("TRIP_OVERVIEW_ROUTE_CARD_DURATION_LABEL");
        wazeTextView3.setContentDescription("TRIP_OVERVIEW_ROUTE_CARD_CARBON_EMISSION_LABEL");
    }

    static final void k(i iVar, h hVar) {
        com.waze.trip_overview.c.a.d dVar = iVar.u;
        if (dVar != null) {
            dVar.b(iVar.c(), hVar);
        }
    }

    private final com.waze.shared_infra.o.a m() {
        return (com.waze.shared_infra.o.a) this.s.getValue();
    }

    private final void n(View view, final h hVar, boolean z) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.waze.trip_overview.views.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i.k(this.f41511a, hVar);
            }
        });
        if (!z) {
            this.n.addView(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            x.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).setMarginEnd(as.f(8));
            return;
        }
        if (view.getId() == -1) {
            view.setId(FrameLayout.generateViewId());
        }
        this.f41521e.add(view);
        this.f41526j.addView(view);
        this.o.addView(view);
    }

    private final void o(float f2) {
        this.f41525i.setVisibility(f2 > 0.0f ? 0 : 8);
    }

    private final void p(at atVar) {
        String strJ = atVar.j();
        WazeTextView wazeTextView = this.f41527k;
        wazeTextView.setText(strJ);
        this.f41528l.setText(atVar.i());
        com.waze.ad.a.j.i(this.f41523g, atVar.h());
        wazeTextView.a(this.f41520d ? com.waze.design_components.text_view.a.f23483d : com.waze.design_components.text_view.a.f23484e);
    }

    public final int a() {
        return this.t;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r3 = this;
            com.waze.trip_overview.at r0 = r3.c()
            com.waze.trip_overview.an r0 = r0.d()
            if (r0 == 0) goto L1b
            com.waze.trip_overview.views.route_card_options.RouteCardOptionsView r1 = r3.f41524h
            boolean r1 = r1.c()
            r2 = 1
            if (r2 == r1) goto L14
            r0 = 0
        L14:
            if (r0 == 0) goto L1b
            com.waze.trip_overview.at r3 = r0.b()
            goto L1f
        L1b:
            com.waze.trip_overview.at r3 = r3.c()
        L1f:
            long r0 = r3.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.views.i.b():long");
    }

    public final at c() {
        at atVar = this.f41518a;
        if (atVar != null) {
            return atVar;
        }
        x.j("mainRoute");
        return null;
    }

    public final void d(boolean z) {
        RouteCardOptionsView routeCardOptionsView = this.f41524h;
        routeCardOptionsView.a().setEnabled(z);
        if (z) {
            return;
        }
        routeCardOptionsView.a().setChecked(false);
    }

    public final void e(boolean z, float f2, boolean z2) {
        o(f2);
        ConstraintLayout constraintLayout = this.f41526j;
        if (z) {
            constraintLayout.setBackgroundColor(com.waze.shared_infra.i.h.q(ContextCompat.getColor(getContext(), R.color.background_default), ContextCompat.getColor(getContext(), R.color.background_variant), f2));
        } else {
            constraintLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.background_default));
        }
        if (z) {
            this.f41527k.setTextColor(com.waze.shared_infra.i.h.q(ContextCompat.getColor(getContext(), R.color.content_default), ContextCompat.getColor(getContext(), R.color.primary), f2));
        } else {
            ((TextView) this.f41526j.findViewById(R.id.routeDurationText)).setTextColor(ContextCompat.getColor(getContext(), R.color.content_default));
        }
        ConstraintLayout constraintLayout2 = this.f41526j;
        if (z) {
            ViewCompat.setTranslationZ(constraintLayout2, 1.0f);
        } else {
            ViewCompat.setTranslationZ(constraintLayout2, 0.0f);
        }
        ConstraintLayout constraintLayout3 = this.f41526j;
        if (z) {
            constraintLayout3.findViewById(R.id.routeSelectedIndicator).setAlpha(f2);
        } else {
            constraintLayout3.findViewById(R.id.routeSelectedIndicator).setAlpha(0.0f);
        }
        if (!z) {
            this.f41524h.a().setChecked(false);
        }
        if (f2 != 0.0f || z2) {
            TextView textView = this.f41523g;
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
        } else {
            TextView textView2 = this.f41523g;
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.invalidate();
        }
    }

    public final void f(int i2) {
        this.t = i2;
    }

    public final void g(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f41522f = onCheckedChangeListener;
    }

    public final void h(boolean z, at atVar) {
        String strC;
        x.f(atVar, "route");
        if (this.f41518a == null || !x.n(c(), atVar)) {
            x.f(atVar, "<set-?>");
            this.f41518a = atVar;
            this.f41520d = z;
            o(0.0f);
            p(atVar);
            int i2 = 4;
            com.waze.ui.ab.j[] jVarArr = new com.waze.ui.ab.j[4];
            com.waze.ui.ab.i iVar = com.waze.ui.ab.i.f41742a;
            int i3 = 1;
            if (true != atVar.m()) {
                iVar = null;
            }
            int i4 = 0;
            jVarArr[0] = iVar;
            com.waze.ui.ab.f fVar = new com.waze.ui.ab.f(atVar.e().a());
            if (atVar.e().a() <= 0) {
                fVar = null;
            }
            jVarArr[1] = fVar;
            com.waze.ui.ab.h hVar = new com.waze.ui.ab.h(atVar.e().c());
            if (atVar.e().c() <= 0) {
                hVar = null;
            }
            jVarArr[2] = hVar;
            com.waze.ui.ab.g gVar = new com.waze.ui.ab.g(atVar.e().b());
            if (atVar.e().b() <= 0) {
                gVar = null;
            }
            int i5 = 3;
            jVarArr[3] = gVar;
            List listK = h.a.i.k(jVarArr);
            ComposeView composeView = this.m;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1230442893, true, new af(listK, i2)));
            composeView.setVisibility(true != listK.isEmpty() ? 0 : 8);
            com.waze.ad.a.j.i(this.p, atVar.k());
            WazeTextView wazeTextView = this.q;
            com.waze.ad.a.j.i(wazeTextView, atVar.g());
            String strG = atVar.g();
            if (strG == null || strG.length() == 0) {
                wazeTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            au auVarF = atVar.f();
            LinearLayout linearLayout = this.n;
            linearLayout.removeAllViews();
            List<View> list = this.f41521e;
            for (View view : list) {
                this.o.removeView(view);
                this.f41526j.removeView(view);
            }
            list.clear();
            linearLayout.setVisibility(8);
            Flow flow = this.o;
            flow.setVisibility(8);
            int i6 = (auVarF.a() != null ? 1 : 0) + (auVarF.b() != null ? 1 : 0);
            boolean z2 = i6 > 1 || (i6 == 1 && !this.f41520d);
            if (z2) {
                linearLayout.setVisibility(8);
                flow.setVisibility(0);
            } else {
                linearLayout.setVisibility(0);
                flow.setVisibility(8);
            }
            am amVarA = auVarF.a();
            if (amVarA != null) {
                String strC2 = amVarA.a() > 0 ? amVarA.b() != null ? m().c(R.string.TRIP_OVERVIEW_HOV_PD_PASSENGERS_PS_PERMIT, Integer.valueOf(amVarA.a()), amVarA.b()) : m().c(R.string.TRIP_OVERVIEW_HOV_PD_PASSENGERS, Integer.valueOf(amVarA.a())) : amVarA.b() != null ? m().c(R.string.TRIP_OVERVIEW_HOV_PS_PERMIT, amVarA.b()) : m().c(R.string.TRIP_OVERVIEW_HOV, new Object[0]);
                Context context = getContext();
                x.e(context, "getContext(...)");
                ComposeView composeView2 = new ComposeView(context, null, 0, 6, null);
                composeView2.setContent(ComposableLambdaKt.composableLambdaInstance(-2010561163, true, new af(strC2, i3)));
                n(composeView2, h.f41514b, z2);
            }
            com.waze.speech.k kVarB = auVarF.b();
            if (kVarB != null) {
                if (x.n(kVarB, bm.f41096a)) {
                    strC = m().c(R.string.TRIP_OVERVIEW_DYNAMIC_TOLL, new Object[0]);
                } else if (kVarB instanceof bn) {
                    strC = m().c(R.string.TRIP_OVERVIEW_TOLL_PS, ((bn) kVarB).a());
                } else {
                    if (!x.n(kVarB, bo.f41098a)) {
                        throw new h.i();
                    }
                    strC = m().c(R.string.TRIP_OVERVIEW_TOLL, new Object[0]);
                }
                Context context2 = getContext();
                x.e(context2, "getContext(...)");
                ComposeView composeView3 = new ComposeView(context2, null, 0, 6, null);
                composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(994659343, true, new af(strC, i5)));
                n(composeView3, h.f41513a, z2);
            }
            RouteCardOptionsView routeCardOptionsView = this.f41524h;
            com.waze.ad.a.j.g(routeCardOptionsView, atVar.d() != null);
            an anVarD = atVar.d();
            if (anVarD != null) {
                Context context3 = getContext();
                x.e(context3, "getContext(...)");
                com.waze.trip_overview.views.route_card_options.a aVar = new com.waze.trip_overview.views.route_card_options.a(context3);
                this.f41519c = aVar;
                aVar.a(anVarD);
                routeCardOptionsView.b(aVar);
            }
            List listL = atVar.l();
            x.f(listL, "alerts");
            TripOverviewAlertsContainer tripOverviewAlertsContainer = this.r;
            tripOverviewAlertsContainer.removeAllViews();
            com.waze.ad.a.j.g(tripOverviewAlertsContainer, !listL.isEmpty());
            for (Object obj : listL) {
                int i7 = i4 + 1;
                if (i4 < 0) {
                    h.a.i.p();
                }
                Context context4 = getContext();
                x.e(context4, "getContext(...)");
                f fVar2 = new f(context4, (e) obj);
                fVar2.setContentDescription("TRIP_OVERVIEW_ROUTE_CARD_ALERT_LABEL" + i4);
                tripOverviewAlertsContainer.a(fVar2);
                i4 = i7;
            }
        }
    }

    public final boolean i(long j2) {
        an anVarD = c().d();
        if (j2 != c().b()) {
            return anVarD != null && anVarD.b().b() == j2;
        }
        return true;
    }

    public final boolean j() {
        return this.f41524h.c();
    }

    public final void l(com.waze.trip_overview.c.a.d dVar) {
        this.u = dVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        x.f(compoundButton, "buttonView");
        an anVarD = c().d();
        if (anVarD != null) {
            if (z) {
                p(anVarD.b());
                com.waze.trip_overview.views.route_card_options.a aVar = this.f41519c;
                if (aVar != null && !o.G(anVarD.a().a())) {
                    aVar.b(anVarD.a().a());
                }
            } else {
                p(c());
                com.waze.trip_overview.views.route_card_options.a aVar2 = this.f41519c;
                if (aVar2 != null && !o.G(anVarD.a().b())) {
                    aVar2.b(anVarD.a().b());
                }
            }
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f41522f;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }
}
