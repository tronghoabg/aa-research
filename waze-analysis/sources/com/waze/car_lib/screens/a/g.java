package com.waze.car_lib.screens.a;

import android.text.SpannableString;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.RoutePreviewNavigationTemplate;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.R;
import com.waze.car_lib.bd;
import com.waze.car_lib.p.ae;
import com.waze.car_lib.p.bi;
import com.waze.car_lib.p.bj;
import com.waze.car_lib.p.bk;
import com.waze.car_lib.p.bl;
import com.waze.car_lib.p.bm;
import com.waze.car_lib.p.bn;
import com.waze.car_lib.p.cb;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.a.p;
import com.waze.car_lib.screens.bx;
import com.waze.car_lib.screens.core.n;
import com.waze.sharedui.utils.o;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.i;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.f.a.f f21748a;

    /* renamed from: b, reason: collision with root package name */
    private final p f21749b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21750c;

    /* renamed from: d, reason: collision with root package name */
    private final bd f21751d;

    /* renamed from: e, reason: collision with root package name */
    private final RoutePreviewNavigationTemplate f21752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CarContext carContext, com.waze.car_lib.f.a.f fVar, p pVar, boolean z) {
        org.a.d.k.b bVarC;
        m mVar;
        org.a.d.k.b bVarC2;
        m mVar2;
        super(carContext, "AlternateRoutesV2Screen");
        x.f(carContext, "carContext");
        x.f(fVar, "coordinatorController");
        x.f(pVar, "viewModel");
        this.f21748a = fVar;
        this.f21749b = pVar;
        g gVar = this;
        boolean z2 = gVar instanceof org.a.d.a.b;
        if (z2) {
            bVarC = gVar.l();
            int i2 = ar.f48106a;
            mVar = new m(com.waze.shared_infra.o.a.class);
        } else {
            bVarC = gVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(com.waze.shared_infra.o.a.class);
        }
        this.f21750c = (com.waze.shared_infra.o.a) bVarC.a(mVar, null, null);
        if (z2) {
            bVarC2 = gVar.l();
            mVar2 = new m(bd.class);
        } else {
            bVarC2 = gVar.getKoin().a().c();
            mVar2 = new m(bd.class);
        }
        this.f21751d = (bd) bVarC2.a(mVar2, null, null);
        this.f21752e = dh.D();
        aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(this, z, carContext, null), 3);
    }

    public static /* synthetic */ ab e(h.g.a.a aVar, g gVar) {
        aVar.invoke();
        gVar.f21748a.b();
        return ab.f48028a;
    }

    static final ab f(g gVar) {
        gVar.n().a(new f(gVar.f21748a, 0));
        return ab.f48028a;
    }

    static final ab g(g gVar) {
        gVar.n().a(new f(gVar.f21748a, 4, (int[]) null));
        return ab.f48028a;
    }

    static final ab h(g gVar, h.g.a.a aVar) {
        gVar.n().a(new com.waze.app_nav.hub.n(aVar, gVar, 14, null));
        return ab.f48028a;
    }

    public static final /* synthetic */ void j(final g gVar, CarContext carContext, bx bxVar, l lVar, final h.g.a.a aVar) {
        boolean z;
        CarContext carContext2;
        f fVar;
        Iterator it;
        f fVar2;
        bj bjVar;
        bl blVar;
        CarContext carContext3;
        CarContext carContext4 = carContext;
        final int i2 = 1;
        h.g.a.a aVar2 = new h.g.a.a(gVar) { // from class: com.waze.car_lib.screens.a.a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f21736a;

            {
                this.f21736a = gVar;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i3 = i2;
                g gVar2 = this.f21736a;
                return i3 != 0 ? g.f(gVar2) : g.g(gVar2);
            }
        };
        p pVar = gVar.f21749b;
        f fVar3 = new f((Object) pVar, 2, (char[]) null);
        f fVar4 = new f((Object) pVar, 3, (short[]) null);
        final int i3 = 0;
        h.g.a.a aVar3 = new h.g.a.a(gVar) { // from class: com.waze.car_lib.screens.a.a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f21736a;

            {
                this.f21736a = gVar;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i32 = i3;
                g gVar2 = this.f21736a;
                return i32 != 0 ? g.f(gVar2) : g.g(gVar2);
            }
        };
        h.g.a.a aVar4 = new h.g.a.a() { // from class: com.waze.car_lib.screens.a.b
            @Override // h.g.a.a
            public final Object invoke() {
                return g.h(this.f21738a, aVar);
            }
        };
        x.f(carContext4, "context");
        com.waze.shared_infra.o.a aVar5 = gVar.f21750c;
        x.f(aVar5, "stringProvider");
        x.f(bxVar, "state");
        x.f(aVar2, "onTollInfoClicked");
        x.f(fVar3, "zoomInClicked");
        x.f(fVar4, "zoomOutClicked");
        x.f(lVar, "onPanModeChanged");
        x.f(aVar3, "onNavigationSettingsClicked");
        x.f(aVar4, "onStartNavigation");
        RoutePreviewNavigationTemplate.Builder builder = new RoutePreviewNavigationTemplate.Builder();
        if (bxVar instanceof bm) {
            Header.Builder builder2 = new Header.Builder();
            builder2.setStartHeaderAction(Action.BACK);
            builder.setHeader(builder2.build());
            builder.setLoading(true);
            carContext2 = carContext4;
            fVar = fVar4;
        } else {
            if (bxVar instanceof bn) {
                throw null;
            }
            if (!(bxVar instanceof bl)) {
                throw new i();
            }
            Header.Builder builder3 = new Header.Builder();
            bl blVar2 = (bl) bxVar;
            builder3.setTitle(o.a(aVar5, blVar2.m()));
            builder3.setStartHeaderAction(Action.BACK);
            if (blVar2.p()) {
                z = false;
                builder3.addEndHeaderAction(dh.G(R.drawable.icon_outline_info_30px, carContext4, false, aVar2, 12));
            } else {
                z = false;
            }
            builder3.addEndHeaderAction(dh.G(R.drawable.icon_outline_settings_30px, carContext4, z, aVar3, 12));
            builder.setHeader(builder3.build());
            List listN = blVar2.n();
            int iA = blVar2.a();
            l lVarO = blVar2.o();
            ItemList.Builder builder4 = new ItemList.Builder();
            Iterator it2 = listN.iterator();
            while (it2.hasNext()) {
                bj bjVar2 = (bj) it2.next();
                Row.Builder builder5 = new Row.Builder();
                bk bkVarD = bjVar2.d();
                String strConcat = ExifInterface.LONGITUDE_EAST;
                if (bkVarD != null) {
                    ExifInterface.LONGITUDE_EAST.toString();
                    Double dA = bkVarD.a();
                    it = it2;
                    if (dA != null) {
                        fVar2 = fVar4;
                        bjVar = bjVar2;
                        blVar = blVar2;
                        String strC = aVar5.c(R.string.AAOS_ALT_ROUTES_TOLL_PRICE_PS, com.waze.shared_infra.q.m.d(dA.doubleValue(), bkVarD.b()));
                        "E • ".toString();
                        strConcat = "E • ".concat(String.valueOf(strC));
                    } else {
                        fVar2 = fVar4;
                        bjVar = bjVar2;
                        blVar = blVar2;
                        String strC2 = aVar5.c(R.string.AAOS_ALT_ROUTES_TOLL_PRICE, new Object[0]);
                        "E • ".toString();
                        strConcat = "E • ".concat(String.valueOf(strC2));
                    }
                } else {
                    it = it2;
                    fVar2 = fVar4;
                    bjVar = bjVar2;
                    blVar = blVar2;
                }
                String strConcat2 = strConcat;
                bi biVarC = bjVar.c();
                if (biVarC != null) {
                    Objects.toString(strConcat2);
                    String strConcat3 = strConcat2.concat(" • ");
                    String strC3 = aVar5.c(R.string.ALT_ROUTES_V2_HOV_DIAMOND_MIN_PASSENGERS_PD, Integer.valueOf(biVarC.a()));
                    Objects.toString(strConcat3);
                    strConcat2 = strConcat3.concat(String.valueOf(strC3));
                }
                SpannableString spannableString = new SpannableString(strConcat2);
                spannableString.setSpan(DurationSpan.create(bjVar.a()), 0, 1, 18);
                builder5.setTitle(spannableString);
                if (bjVar.e() != null) {
                    SpannableString spannableString2 = new SpannableString("D • ".concat(String.valueOf(aVar5.c(true != x.n(bjVar.e(), true) ? R.string.IN_CAR_ROUTE_ALERT_NO_PERSONAL_SAFETY : R.string.IN_CAR_ROUTE_ALERT_PERSONAL_SAFETY, new Object[0]))));
                    carContext3 = carContext4;
                    spannableString2.setSpan(DistanceSpan.create(bjVar.b()), 0, 1, 18);
                    if (x.n(bjVar.e(), true)) {
                        spannableString2.setSpan(ForegroundCarColorSpan.create(CarColor.RED), 4, spannableString2.length(), 17);
                    }
                    builder5.addText(spannableString2);
                } else {
                    carContext3 = carContext4;
                    SpannableString spannableString3 = new SpannableString("D • ".concat(String.valueOf(aVar5.c(R.string.ALT_ROUTES_V2_VIA_FORMAT_PS, bjVar.f()))));
                    spannableString3.setSpan(DistanceSpan.create(bjVar.b()), 0, 1, 18);
                    builder5.addText(spannableString3);
                }
                Row rowBuild = builder5.build();
                x.e(rowBuild, "build(...)");
                builder4.addItem(rowBuild);
                carContext4 = carContext3;
                it2 = it;
                fVar4 = fVar2;
                blVar2 = blVar;
            }
            carContext2 = carContext4;
            fVar = fVar4;
            builder4.setOnSelectedListener(new cb(lVarO, 1));
            builder4.setSelectedIndex(iA);
            ItemList itemListBuild = builder4.build();
            x.e(itemListBuild, "build(...)");
            builder.setItemList(itemListBuild);
            Action.Builder builder6 = new Action.Builder();
            builder6.setTitle(o.a(aVar5, blVar2.l()));
            builder6.setOnClickListener(new com.waze.car_lib.screens.b.a(aVar4, 12));
            builder.setNavigateAction(builder6.build());
        }
        builder.setPanModeListener(new ae(lVar, 6));
        builder.setMapActionStrip(dh.K(carContext2, bxVar.j(), fVar3, fVar));
        RoutePreviewNavigationTemplate routePreviewNavigationTemplateBuild = builder.build();
        x.e(routePreviewNavigationTemplateBuild, "build(...)");
        gVar.q(routePreviewNavigationTemplateBuild);
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21752e;
    }
}
