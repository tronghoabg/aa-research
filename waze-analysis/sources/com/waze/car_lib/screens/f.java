package com.waze.car_lib.screens;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.Header;
import androidx.car.app.model.Pane;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.core.graphics.drawable.IconCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.waze.R;
import com.waze.car_lib.p.dh;
import com.waze.config.ConfigValues;
import com.waze.map.b.ed;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.n f22010a;

    /* renamed from: b, reason: collision with root package name */
    private final MapTemplate f22011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(final CarContext carContext, com.waze.car_lib.f.z zVar, com.waze.av.b.n nVar, com.waze.av.d.k kVar, com.waze.car_lib.r.bq bqVar) {
        super(carContext, "AddressPreviewScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(zVar, "controller");
        h.g.b.x.f(nVar, "place");
        h.g.b.x.f(bqVar, "previewMap");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.map.b.n nVar2 = (com.waze.map.b.n) bVarL.a(new h.g.b.m(com.waze.map.b.n.class), null, null);
        this.f22010a = nVar2;
        this.f22011b = dh.y();
        com.waze.car_lib.bd bdVar = (com.waze.car_lib.bd) l().a(new h.g.b.m(com.waze.car_lib.bd.class), null, null);
        final com.waze.shared_infra.o.a aVar = (com.waze.shared_infra.o.a) l().a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null);
        final com.waze.car_lib.r.d dVar = (com.waze.car_lib.r.d) l().a(new h.g.b.m(com.waze.car_lib.r.d.class), null, null);
        f fVar = this;
        h.k kVarR = dVar.r(carContext, LifecycleOwnerKt.getLifecycleScope(fVar), zVar, nVar, kVar, n());
        LiveData liveData = (LiveData) kVarR.a();
        final ed edVar = (ed) kVarR.b();
        liveData.observe(fVar, new g(new h.g.a.l() { // from class: com.waze.car_lib.screens.b
            @Override // h.g.a.l
            public final Object invoke(Object obj) throws IOException {
                dh dhVar;
                f fVar2;
                c cVar;
                com.waze.car_lib.p.c cVar2;
                CharSequence charSequence;
                SpannableStringBuilder spannableStringBuilder;
                Iterator it;
                com.waze.car_lib.p.a aVar2;
                int i3;
                int i4;
                String strC;
                String strC2;
                String strR;
                SpannableString spannableStringR;
                int i5;
                boolean z;
                String strK;
                dh dhVar2 = (dh) obj;
                h.g.b.x.c(dhVar2);
                f fVar3 = this.f21818a;
                com.waze.car_lib.r.d dVar2 = dVar;
                q qVar = new q((com.waze.car_lib.screens.core.n) fVar3, (Object) dVar2, 1);
                boolean z2 = dhVar2 instanceof com.waze.car_lib.p.c;
                byte[] bArr = null;
                com.waze.car_lib.p.c cVar3 = z2 ? (com.waze.car_lib.p.c) dhVar2 : null;
                CarContext carContext2 = carContext;
                com.waze.a.aa aaVar = (cVar3 == null || (strK = cVar3.k()) == null) ? null : new com.waze.a.aa(carContext2, strK, 12, bArr);
                ed edVar2 = edVar;
                com.waze.shared_infra.o.a aVar3 = aVar;
                ab abVar = new ab((Object) dVar2, 1, (byte[]) null);
                c cVar4 = new c(edVar2, 0);
                c cVar5 = new c((Object) edVar2, 2, (char[]) null);
                h.g.b.x.f(carContext2, "carContext");
                h.g.b.x.f(dhVar2, "state");
                h.g.b.x.f(aVar3, "stringProvider");
                h.g.b.x.f(qVar, "onCloseClicked");
                h.g.b.x.f(abVar, "onPanModeChanged");
                h.g.b.x.f(cVar4, "zoomInClicked");
                h.g.b.x.f(cVar5, "zoomOutClicked");
                MapTemplate.Builder builder = new MapTemplate.Builder();
                Pane.Builder builder2 = new Pane.Builder();
                if (dhVar2 instanceof com.waze.car_lib.p.d) {
                    builder2.setLoading(true);
                    dhVar = dhVar2;
                    fVar2 = fVar3;
                    cVar = cVar4;
                } else {
                    if (!z2) {
                        throw new h.i();
                    }
                    com.waze.car_lib.p.c cVar6 = (com.waze.car_lib.p.c) dhVar2;
                    ArrayList arrayList = new ArrayList();
                    Row.Builder builder3 = new Row.Builder();
                    builder3.setTitle(cVar6.j());
                    String strG = cVar6.g();
                    dhVar = dhVar2;
                    if (strG != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) com.waze.shared_infra.l.b.d(strG));
                        cVar2 = cVar6;
                        fVar2 = fVar3;
                        cVar = cVar4;
                        spannableStringBuilder2.setSpan(ForegroundCarColorSpan.create(CarColor.RED), 0, spannableStringBuilder2.length(), 33);
                        builder3.addText(spannableStringBuilder2);
                    } else {
                        fVar2 = fVar3;
                        cVar = cVar4;
                        cVar2 = cVar6;
                    }
                    CharSequence charSequenceC = com.waze.car_lib.b.c(carContext2, cVar2.c(), cVar2.d());
                    if (charSequenceC != null) {
                        if (true == h.n.o.G(charSequenceC)) {
                            charSequenceC = null;
                        }
                        if (charSequenceC != null) {
                            builder3.addText(charSequenceC);
                        }
                    }
                    Row rowBuild = builder3.build();
                    h.g.b.x.e(rowBuild, "build(...)");
                    arrayList.add(rowBuild);
                    if (cVar2.f() == null && cVar2.h() == null && cVar2.e() != null) {
                        charSequence = " • ";
                    } else {
                        Row.Builder builder4 = new Row.Builder();
                        builder4.setTitle(com.waze.shared_infra.l.b.d(aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_LOCATION_TITLE, new Object[0])));
                        String strF = cVar2.f();
                        if (strF != null) {
                            builder4.addText(com.waze.shared_infra.l.b.d(strF));
                        }
                        String strH = cVar2.h();
                        Long lE = cVar2.e();
                        if (strH == null && lE == null) {
                            charSequence = " • ";
                            spannableStringBuilder = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            if (strH != null) {
                                spannableStringBuilder3.append((CharSequence) com.waze.shared_infra.l.b.d(strH));
                            }
                            if (lE != null) {
                                lE.longValue();
                                SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder3;
                                if (spannableStringBuilder4.length() > 0) {
                                    spannableStringBuilder3.append((CharSequence) " • ");
                                }
                                charSequence = " • ";
                                spannableStringBuilder3.append((CharSequence) com.waze.shared_infra.l.b.d(aVar3.c(R.string.SEARCH_RESULTS_TIME_UNITS_AWAY_PS, "_DISTANCE_PLACEHOLDER_")));
                                int iX = h.n.o.X(spannableStringBuilder4, "_DISTANCE_PLACEHOLDER_", 0, false, 6);
                                if (iX < 0) {
                                    spannableStringBuilder3.append((CharSequence) "_DISTANCE_PLACEHOLDER_");
                                    iX = spannableStringBuilder3.length() - 22;
                                }
                                spannableStringBuilder3.setSpan(DurationSpan.create(lE.longValue() * 60), iX, iX + 22, 18);
                            } else {
                                charSequence = " • ";
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        if (spannableStringBuilder != null) {
                            if (true == h.n.o.G(spannableStringBuilder)) {
                                spannableStringBuilder = null;
                            }
                            if (spannableStringBuilder != null) {
                                builder4.addText(spannableStringBuilder);
                            }
                        }
                        Row rowBuild2 = builder4.build();
                        h.g.b.x.e(rowBuild2, "build(...)");
                        arrayList.add(rowBuild2);
                    }
                    com.waze.car_lib.p.b bVarB = cVar2.b();
                    if (bVarB != null) {
                        String strB = bVarB.b();
                        if (strB != null) {
                            Row.Builder builder5 = new Row.Builder();
                            builder5.setTitle(strB);
                            Row rowBuild3 = builder5.build();
                            h.g.b.x.e(rowBuild3, "build(...)");
                            arrayList.add(rowBuild3);
                        }
                        Iterator it2 = bVarB.d().iterator();
                        while (it2.hasNext()) {
                            com.waze.car_lib.p.a aVar4 = (com.waze.car_lib.p.a) it2.next();
                            Row.Builder builder6 = new Row.Builder();
                            com.waze.car_lib.p.b bVar = bVarB;
                            CarIcon.Builder builder7 = new CarIcon.Builder(IconCompat.createWithResource(carContext2, aVar4.b()));
                            builder7.setTint(CarColor.createCustom(-1, -1));
                            builder6.setImage(builder7.build(), 1);
                            builder6.setTitle(h.a.i.aM(h.a.i.k(aVar4.e(), aVar4.f()), charSequence, null, null, 0, null, 62));
                            if (aVar4.c() != null) {
                                it = it2;
                                aVar2 = aVar4;
                                String strA = com.waze.sharedui.utils.o.a(aVar3, new com.waze.ui.ac.k(R.string.EV_VENUE_PAGE_PLUGS_AVAILABLE_NUMBER_PD_PD, aVar4.c(), Integer.valueOf(aVar4.a())));
                                CarColor carColor = aVar2.c().intValue() > 0 ? CarColor.GREEN : CarColor.DEFAULT;
                                h.g.b.x.c(carColor);
                                strR = dh.r(strA, carColor);
                            } else {
                                it = it2;
                                aVar2 = aVar4;
                                Integer numD = aVar2.d();
                                if (numD != null) {
                                    i3 = 1;
                                    i4 = 0;
                                    strC = aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_PLUG_SPEED_KW_PD, Integer.valueOf(numD.intValue()));
                                } else {
                                    i3 = 1;
                                    i4 = 0;
                                    strC = null;
                                }
                                if (aVar2.a() == i3) {
                                    strC2 = aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_PLUG_COUNT_SINGLE_PLUG, new Object[i4]);
                                } else {
                                    Object[] objArr = new Object[i3];
                                    objArr[i4] = Integer.valueOf(aVar2.a());
                                    strC2 = aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_PLUG_COUNT_PD, objArr);
                                }
                                String strAM = h.a.i.aM(h.a.i.k(strC, strC2), charSequence, null, null, 0, null, 62);
                                if (true == h.n.o.G(strAM)) {
                                    strAM = null;
                                }
                                strR = strAM;
                            }
                            if (strR != null) {
                                builder6.addText(strR);
                            }
                            if (aVar2.c() == null && aVar2.g()) {
                                String strC3 = aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_PLUG_COMPATIBLE, new Object[0]);
                                CarColor carColor2 = CarColor.GREEN;
                                h.g.b.x.e(carColor2, "GREEN");
                                spannableStringR = dh.r(strC3, carColor2);
                            } else {
                                spannableStringR = null;
                            }
                            if (spannableStringR != null) {
                                builder6.addText(spannableStringR);
                            }
                            Row rowBuild4 = builder6.build();
                            h.g.b.x.e(rowBuild4, "build(...)");
                            arrayList.add(rowBuild4);
                            bVarB = bVar;
                            it2 = it;
                        }
                        com.waze.car_lib.p.b bVar2 = bVarB;
                        String strA2 = bVar2.a();
                        if (strA2 != null) {
                            Row.Builder builder8 = new Row.Builder();
                            builder8.setTitle(aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_HOW_TO_FIND_TITLE, new Object[0]));
                            builder8.addText(strA2);
                            Row rowBuild5 = builder8.build();
                            h.g.b.x.e(rowBuild5, "build(...)");
                            arrayList.add(rowBuild5);
                        }
                        String strC4 = bVar2.c();
                        if (strC4 != null) {
                            Row.Builder builder9 = new Row.Builder();
                            builder9.setTitle(aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_EV_VENUE_PAYMENT_TITLE, new Object[0]));
                            builder9.addText(strC4);
                            Row rowBuild6 = builder9.build();
                            h.g.b.x.e(rowBuild6, "build(...)");
                            arrayList.add(rowBuild6);
                        }
                    }
                    for (com.waze.navigate.t tVar : cVar2.n()) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        spannableStringBuilder5.append((CharSequence) tVar.a());
                        spannableStringBuilder5.append(charSequence);
                        spannableStringBuilder5.append((CharSequence) tVar.b());
                        Row.Builder builder10 = new Row.Builder();
                        builder10.setImage(new CarIcon.Builder(IconCompat.createWithResource(carContext2, R.drawable.icon_outline_gas_24px)).build());
                        builder10.setTitle(spannableStringBuilder5);
                        Row rowBuild7 = builder10.build();
                        h.g.b.x.e(rowBuild7, "build(...)");
                        arrayList.add(rowBuild7);
                    }
                    String strI = cVar2.i();
                    if (strI != null) {
                        Row.Builder builder11 = new Row.Builder();
                        builder11.setTitle(strI);
                        Row rowBuild8 = builder11.build();
                        h.g.b.x.e(rowBuild8, "build(...)");
                        arrayList.add(rowBuild8);
                    }
                    if (cVar2.p()) {
                        Row.Builder builder12 = new Row.Builder();
                        builder12.setTitle(aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_PARKING_TITLE, new Object[0]));
                        builder12.addText(aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_ONSITE_PARKING, new Object[0]));
                        Row rowBuild9 = builder12.build();
                        h.g.b.x.e(rowBuild9, "build(...)");
                        arrayList.add(rowBuild9);
                    }
                    int i6 = true != h.g.b.x.n(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b(), "latam") ? R.drawable.icon_outline_parking_24px : R.drawable.car_lib_icon_outline_parking_latam_24px;
                    for (com.waze.navigate.t tVar2 : cVar2.o()) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                        spannableStringBuilder6.append((CharSequence) tVar2.a());
                        spannableStringBuilder6.append(charSequence);
                        spannableStringBuilder6.append((CharSequence) tVar2.b());
                        Row.Builder builder13 = new Row.Builder();
                        builder13.setImage(new CarIcon.Builder(IconCompat.createWithResource(carContext2, i6)).build());
                        builder13.setTitle(spannableStringBuilder6);
                        Row rowBuild10 = builder13.build();
                        h.g.b.x.e(rowBuild10, "build(...)");
                        arrayList.add(rowBuild10);
                    }
                    if (!cVar2.l().isEmpty()) {
                        Row.Builder builder14 = new Row.Builder();
                        builder14.setTitle(aVar3.c(R.string.AAOS_ADDRESS_PREVIEW_AMENITIES, new Object[0]));
                        builder14.addText(h.a.i.aM(cVar2.l(), charSequence, null, null, 0, null, 62));
                        Row rowBuild11 = builder14.build();
                        h.g.b.x.e(rowBuild11, "build(...)");
                        arrayList.add(rowBuild11);
                    }
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        builder2.addRow((Row) it3.next());
                    }
                    Iterator it4 = h.a.i.am(cVar2.m(), 2).iterator();
                    while (it4.hasNext()) {
                        builder2.addAction(dh.L((com.waze.car_lib.p.co) it4.next()));
                    }
                }
                builder.setPane(builder2.build());
                Header.Builder builder15 = new Header.Builder();
                builder15.setStartHeaderAction(Action.BACK);
                if (aaVar != null) {
                    i5 = 12;
                    z = false;
                    builder15.addEndHeaderAction(dh.G(R.drawable.icon_outline_phone_30px, carContext2, false, aaVar, 12));
                } else {
                    i5 = 12;
                    z = false;
                }
                CarContext carContext3 = carContext2;
                builder15.addEndHeaderAction(dh.G(R.drawable.icon_outline_close_30px, carContext3, z, qVar, i5));
                builder.setHeader(builder15.build());
                MapController.Builder builder16 = new MapController.Builder();
                builder16.setPanModeListener(new com.waze.car_lib.p.ae(abVar, 1));
                builder16.setMapActionStrip(dh.K(carContext3, dhVar.q(), cVar, cVar5));
                builder.setMapController(builder16.build());
                MapTemplate mapTemplateBuild = builder.build();
                h.g.b.x.e(mapTemplateBuild, "build(...)");
                fVar2.q(mapTemplateBuild);
                return h.ab.f48028a;
            }
        }, 1, (byte[]) null));
        addBackPressedCallback(new com.waze.b.g(dVar, 14));
        if (bqVar instanceof d) {
            com.waze.shared_infra.h.c cVarD = nVar.e().d();
            nVar2.r(new com.waze.map.b.o(cVarD, null, 0.0f, true, null, 22), ((d) bqVar).a());
            getLifecycle().addObserver(new by(this, 1));
            return;
        }
        if (!h.g.b.x.n(bqVar, e.f22009a)) {
            throw new h.i();
        }
        Lifecycle lifecycle = getLifecycle();
        h.g.b.x.e(lifecycle, "<get-lifecycle>(...)");
        bdVar.v(edVar, lifecycle, "AddressPreview", com.waze.bk.a.a.f16839a, com.waze.car_lib.aw.f18911a);
    }

    static final h.ab c(f fVar, com.waze.car_lib.r.d dVar) {
        fVar.n().a(new c((Object) dVar, 1, (byte[]) null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22011b;
    }
}
