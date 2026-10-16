package com.waze.settings.d;

import android.support.v4.app.ar;
import android.view.View;
import com.waze.R;
import com.waze.bw.c.d.a.bd;
import com.waze.bw.c.d.a.bf;
import com.waze.bw.c.d.a.bg;
import com.waze.config.ConfigValues;
import com.waze.design_components.text_view.WazeTextView;
import com.waze.trip_overview.aw;
import com.waze.trip_overview.ax;
import com.waze.trip_overview.ds;
import com.waze.trip_overview.dt;
import com.waze.trip_overview.dw;
import com.waze.trip_overview.en;
import com.waze.trip_overview.et;
import com.waze.trip_overview.ew;
import com.waze.trip_overview.ey;
import com.waze.trip_overview.fe;
import com.waze.trip_overview.ff;
import com.waze.trip_overview.views.RouteHeader;
import com.waze.web.SimpleWebActivity;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36999a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37000b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f37000b = i2;
        this.f36999a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.waze.tide.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f37000b) {
            case 0:
                return f.d((f) this.f36999a);
            case 1:
                this.f36999a.invoke(bf.f17907a);
                return ab.f48028a;
            case 2:
                this.f36999a.invoke(bg.f17908a);
                return ab.f48028a;
            case 3:
                this.f36999a.setValue(Boolean.valueOf(true));
                return ab.f48028a;
            case 4:
                this.f36999a.invoke(bd.f17905a);
                return ab.f48028a;
            case 5:
                this.f36999a.setValue(Boolean.valueOf(false));
                return ab.f48028a;
            case 6:
                this.f36999a.c();
                return ab.f48028a;
            case 7:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(ff.f41461a);
                return ab.f48028a;
            case 8:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(fe.f41460a);
                return ab.f48028a;
            case 9:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(ds.f41417a);
                return ab.f48028a;
            case 10:
                Object obj = this.f36999a;
                ((com.waze.trip_overview.c.a.ab) obj).h().l(dt.f41418a);
                String strB = ConfigValues.CONFIG_VALUE_ECO_REGULATIONS_TRIP_OVERVIEW_CARBON_EMISSION_DIALOG_LINK.b();
                com.waze.web.b bVarP = SimpleWebActivity.p(((ar) obj).requireActivity());
                bVarP.c();
                bVarP.b(strB);
                bVarP.a();
                return ab.f48028a;
            case 11:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(et.f41444a);
                return ab.f48028a;
            case 12:
                com.waze.trip_overview.c.a.ab abVar = (com.waze.trip_overview.c.a.ab) this.f36999a;
                ax axVar = (ax) abVar.h().j().d();
                if (!(axVar instanceof aw) || !((aw) axVar).c()) {
                    abVar.h().l(new dw(com.waze.trip_overview.a.f40978b));
                }
                return ab.f48028a;
            case 13:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(ew.f41447a);
                return ab.f48028a;
            case 14:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(ew.f41447a);
                return ab.f48028a;
            case 15:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(ey.f41449a);
                return ab.f48028a;
            case 16:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(ew.f41447a);
                return ab.f48028a;
            case 17:
                return com.waze.trip_overview.c.a.ab.p((com.waze.trip_overview.c.a.ab) this.f36999a);
            case 18:
                ((com.waze.trip_overview.c.a.ab) this.f36999a).h().l(en.f41437a);
                return ab.f48028a;
            case 19:
                View viewFindViewById = ((RouteHeader) this.f36999a).findViewById(R.id.origin);
                x.e(viewFindViewById, "findViewById(...)");
                return (WazeTextView) viewFindViewById;
            default:
                View viewFindViewById2 = ((RouteHeader) this.f36999a).findViewById(R.id.destination);
                x.e(viewFindViewById2, "findViewById(...)");
                return (WazeTextView) viewFindViewById2;
        }
    }
}
