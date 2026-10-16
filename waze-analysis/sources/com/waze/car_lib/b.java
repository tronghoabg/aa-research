package com.waze.car_lib;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.CarContext;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.Distance;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.ParkedOnlyOnClickListener;
import androidx.car.app.model.Row;
import androidx.car.app.navigation.model.MapController;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import androidx.car.app.navigation.model.PlaceListNavigationTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.R;
import com.waze.car_lib.p.bs;
import com.waze.car_lib.p.bt;
import com.waze.car_lib.p.bu;
import com.waze.car_lib.p.bv;
import com.waze.car_lib.p.bw;
import com.waze.car_lib.p.bx;
import com.waze.car_lib.p.by;
import com.waze.car_lib.p.bz;
import com.waze.car_lib.p.co;
import com.waze.car_lib.p.dh;
import com.waze.config.ConfigValues;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public b() {
        kotlinx.coroutines.bo.j();
    }

    public static String a(Context context) {
        h.g.b.x.f(context, "context");
        return String.valueOf(context.getPackageName()).concat(".camera.WazeCameraIntentsFileProvider");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static MapWithContentTemplate b(CarContext carContext, com.waze.shared_infra.o.a aVar, com.waze.car_lib.a.z zVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, h.g.a.a aVar6) {
        int i2;
        String strC;
        String strConcat;
        com.waze.bc.a.a aVar7;
        int i3;
        com.waze.bc.a.b bVar;
        String strC2;
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(zVar, "uiState");
        h.g.b.x.f(aVar2, "onAddStopClicked");
        h.g.b.x.f(aVar3, "onNewDriveClicked");
        h.g.b.x.f(aVar4, "onCloseClicked");
        h.g.b.x.f(aVar5, "onAdInfoClicked");
        h.g.b.x.f(aVar6, "onReportClicked");
        Pane.Builder builder = new Pane.Builder();
        List listB = h.a.i.b();
        h.o.a aVarP = zVar.p();
        String strC3 = !zVar.r() ? aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_DETOUR_TIME_ADD, new Object[0]) : "";
        if (aVarP == null) {
            strConcat = String.valueOf(strC3).concat(String.valueOf(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_DETOUR_TIME_MIN, new Object[0])));
            i2 = 0;
        } else {
            long jW = aVarP.w();
            long jL = h.o.a.l(jW);
            int iD = h.o.a.d(jW);
            h.o.a.f(jW);
            if (jL < 1) {
                i2 = 0;
                strC = iD > 0 ? aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_DETOUR_TIME_MIN_PD, Long.valueOf(iD)) : aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_DETOUR_TIME_MIN_PD, 1);
            } else if (iD > 0) {
                i2 = 0;
                strC = aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_DETOUR_TIME_HOUR_AND_MIN_PD_PD, Long.valueOf(jL), Integer.valueOf(iD));
            } else {
                i2 = 0;
                strC = aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_DETOUR_TIME_HOUR_PD, Long.valueOf(jL));
            }
            strConcat = String.valueOf(strC3).concat(String.valueOf(strC));
        }
        Row.Builder builder2 = new Row.Builder();
        CarContext carContext2 = carContext;
        CarIcon.Builder builder3 = new CarIcon.Builder(IconCompat.createWithResource(carContext2, R.drawable.car_fill_24px));
        builder3.setTint(CarColor.DEFAULT);
        CarIcon carIconBuild = builder3.build();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strConcat);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append(" ", CarIconSpan.create(carIconBuild, 2), 33);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        builder2.setTitle(zVar.o());
        builder2.addText(spannedString);
        com.waze.c.c.e eVarS = zVar.s();
        if (eVarS != null) {
            boolean z = eVarS instanceof com.waze.car_lib.a.x;
            if (z) {
                bVar = com.waze.bc.a.b.f16196a;
            } else if (eVarS instanceof com.waze.car_lib.a.w) {
                bVar = com.waze.bc.a.b.f16197b;
            } else {
                if (!(eVarS instanceof com.waze.car_lib.a.y) && !(eVarS instanceof com.waze.car_lib.a.v)) {
                    throw new h.i();
                }
                bVar = com.waze.bc.a.b.f16198c;
            }
            com.waze.bc.a.b bVar2 = bVar;
            if (z) {
                strC2 = aVar.c(R.string.LOCATION_PREVIEW_NOW_OPEN, new Object[i2]);
            } else {
                int i4 = i2;
                if (eVarS instanceof com.waze.car_lib.a.y) {
                    strC2 = aVar.c(R.string.LOCATION_PREVIEW_OPENS_SOON, new Object[i4]);
                } else if (eVarS instanceof com.waze.car_lib.a.w) {
                    strC2 = aVar.c(R.string.LOCATION_PREVIEW_CLOSES_SOON, new Object[i4]);
                } else {
                    if (!(eVarS instanceof com.waze.car_lib.a.v)) {
                        throw new h.i();
                    }
                    strC2 = aVar.c(R.string.LOCATION_PREVIEW_NOW_CLOSED, new Object[i4]);
                }
            }
            aVar7 = new com.waze.bc.a.a(strC2, bVar2, null, null, 12);
        } else {
            aVar7 = null;
        }
        CharSequence charSequenceC = c(carContext, aVar7, zVar.n() != null ? Double.valueOf(r14.floatValue()) : null);
        if (charSequenceC != null) {
            builder2.addText(charSequenceC);
        }
        Row rowBuild = builder2.build();
        h.g.b.x.e(rowBuild, "build(...)");
        listB.add(rowBuild);
        Iterator it = h.a.i.a(listB).iterator();
        while (it.hasNext()) {
            builder.addRow((Row) it.next());
        }
        boolean zR = zVar.r();
        boolean zQ = zVar.q();
        List listB2 = h.a.i.b();
        if (zQ) {
            if (zR) {
                i3 = 0;
            } else {
                i3 = 0;
                listB2.add(e(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_ADD_A_STOP, new Object[0]), true, aVar2));
            }
            listB2.add(e(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_NEW_DRIVE, new Object[i3]), i3, aVar3));
        } else {
            listB2.add(e(aVar.c(R.string.GOOGLE_ADS_AD_PIN_IN_CAR_START_NAVIGATION_BUTTON, new Object[0]), true, aVar3));
        }
        Iterator it2 = h.a.i.a(listB2).iterator();
        while (it2.hasNext()) {
            builder.addAction((Action) it2.next());
        }
        Header.Builder builder4 = new Header.Builder();
        builder4.setTitle(aVar.c(R.string.GOOGLE_ADS_AD_PIN_SPONSORED, new Object[0]));
        builder4.setStartHeaderAction(Action.BACK);
        builder4.addEndHeaderAction(dh.G(R.drawable.three_dot_menu_android_outline_24px, carContext2, false, aVar5, 12));
        builder4.addEndHeaderAction(dh.G(R.drawable.icon_outline_close_30px, carContext2, false, aVar4, 12));
        Header headerBuild = builder4.build();
        PaneTemplate.Builder builder5 = new PaneTemplate.Builder(builder.build());
        builder5.setHeader(headerBuild);
        PaneTemplate paneTemplateBuild = builder5.build();
        MapWithContentTemplate.Builder builder6 = new MapWithContentTemplate.Builder();
        builder6.setContentTemplate(paneTemplateBuild);
        MapController.Builder builder7 = new MapController.Builder();
        builder7.setPanModeListener(new com.waze.car_lib.a.u());
        ActionStrip.Builder builder8 = new ActionStrip.Builder();
        builder8.addAction(dh.G(R.drawable.icon_report_button, carContext2, true, aVar6, 4));
        builder7.setMapActionStrip(builder8.build());
        builder6.setMapController(builder7.build());
        MapWithContentTemplate mapWithContentTemplateBuild = builder6.build();
        h.g.b.x.e(mapWithContentTemplateBuild, "build(...)");
        return mapWithContentTemplateBuild;
    }

    public static CharSequence c(CarContext carContext, com.waze.bc.a.a aVar, Double d2) {
        CarColor carColor;
        h.g.b.x.f(carContext, "carContext");
        if (aVar == null && d2 == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (aVar != null) {
            spannableStringBuilder.append((CharSequence) aVar.c());
            if (d2 != null) {
                spannableStringBuilder.append((CharSequence) " • ");
            }
            com.waze.bc.a.b bVarA = aVar.a();
            com.waze.bc.a.b bVar = com.waze.bc.a.b.f16196a;
            int iOrdinal = bVarA.ordinal();
            if (iOrdinal == 0) {
                carColor = CarColor.GREEN;
                h.g.b.x.e(carColor, "GREEN");
            } else if (iOrdinal == 1) {
                carColor = CarColor.YELLOW;
                h.g.b.x.e(carColor, "YELLOW");
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                carColor = CarColor.RED;
                h.g.b.x.e(carColor, "RED");
            }
            spannableStringBuilder.setSpan(ForegroundCarColorSpan.create(carColor), 0, spannableStringBuilder.length(), 33);
        }
        if (d2 != null) {
            double dDoubleValue = d2.doubleValue();
            int length = spannableStringBuilder.length();
            String str = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1));
            h.g.b.x.e(str, "format(...)");
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " ");
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "★");
            CarIcon.Builder builder = new CarIcon.Builder(IconCompat.createWithResource(carContext, R.drawable.star_fill_24px));
            builder.setTint(CarColor.YELLOW);
            spannableStringBuilder.setSpan(CarIconSpan.create(builder.build(), 2), length2, spannableStringBuilder.length(), 1);
            spannableStringBuilder.setSpan(ForegroundCarColorSpan.create(CarColor.YELLOW), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static PlaceListNavigationTemplate d(com.waze.car_lib.r.bq bqVar, CarContext carContext, com.waze.shared_infra.o.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, h.g.a.l lVar, final h.g.a.q qVar) throws IOException {
        Iterator it;
        SpannableString spannableStringR;
        h.g.b.x.f(bqVar, "state");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(aVar2, "onCloseClicked");
        h.g.b.x.f(aVar3, "onInfoIconClicked");
        h.g.b.x.f(aVar4, "zoomInClicked");
        h.g.b.x.f(aVar5, "zoomOutClicked");
        h.g.b.x.f(lVar, "onPanModeChanged");
        h.g.b.x.f(qVar, "onItemsVisibilityChanged");
        PlaceListNavigationTemplate.Builder builder = new PlaceListNavigationTemplate.Builder();
        if (bqVar instanceof bz) {
            Header.Builder builder2 = new Header.Builder();
            builder2.setStartHeaderAction(Action.BACK);
            builder.setHeader(builder2.build());
            builder.setLoading(true);
        } else {
            if (!(bqVar instanceof by)) {
                throw new h.i();
            }
            Header.Builder builder3 = new Header.Builder();
            by byVar = (by) bqVar;
            builder3.setTitle(byVar.c());
            builder3.setStartHeaderAction(Action.BACK);
            if (byVar.e()) {
                Action.Builder builder4 = new Action.Builder();
                builder4.setIcon(com.waze.car_lib.login.i.c(carContext, byVar.b()));
                builder4.setOnClickListener(ParkedOnlyOnClickListener.create(new com.waze.car_lib.screens.b.a(aVar3, 14)));
                builder3.addEndHeaderAction(builder4.build());
            }
            Action.Builder builder5 = new Action.Builder();
            builder5.setIcon(com.waze.car_lib.login.i.c(carContext, byVar.a()));
            builder5.setOnClickListener(new com.waze.car_lib.screens.b.a(aVar2, 15));
            builder3.addEndHeaderAction(builder5.build());
            builder.setHeader(builder3.build());
            final List listD = byVar.d();
            ItemList.Builder builder6 = new ItemList.Builder();
            builder6.setOnItemsVisibilityChangedListener(new ItemList.OnItemVisibilityChangedListener() { // from class: com.waze.car_lib.p.br
                @Override // androidx.car.app.model.ItemList.OnItemVisibilityChangedListener
                public final void onItemVisibilityChanged(int i2, int i3) {
                    qVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), listD);
                }
            });
            for (Iterator it2 = listD.iterator(); it2.hasNext(); it2 = it) {
                bw bwVar = (bw) it2.next();
                Row.Builder builder7 = new Row.Builder();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) com.waze.shared_infra.l.b.d(bwVar.m()));
                builder7.setTitle(spannableStringBuilder);
                builder7.setImage(bwVar.a(), 1);
                if (bwVar.o() != null) {
                    com.waze.car_lib.r.bq bqVarO = bwVar.o();
                    if (bqVarO instanceof bt) {
                        bt btVar = (bt) bqVarO;
                        bu buVar = (bu) h.a.i.R(btVar.b());
                        spannableStringR = h.a.i.aM(h.a.i.k(buVar != null ? buVar.a() + " " + buVar.b() : null, btVar.a()), " • ", null, null, 0, null, 62);
                    } else {
                        if (!(bqVarO instanceof bs)) {
                            throw new h.i();
                        }
                        String strA = ((bs) bqVarO).a();
                        CarColor carColor = CarColor.RED;
                        h.g.b.x.e(carColor, "RED");
                        spannableStringR = dh.r(strA, carColor);
                    }
                    builder7.addText(spannableStringR);
                    builder7.addText(f(aVar, bwVar));
                    it = it2;
                } else if (bwVar.d() != null) {
                    bv bvVarD = bwVar.d();
                    SpannableString spannableString = new SpannableString(bvVarD.c());
                    it = it2;
                    spannableString.setSpan(ForegroundCarColorSpan.create(bvVarD.a()), 0, bvVarD.c().length(), 33);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) spannableString);
                    spannableStringBuilder2.append((CharSequence) " • ");
                    spannableStringBuilder2.append((CharSequence) bvVarD.b());
                    builder7.addText(spannableStringBuilder2);
                    builder7.addText(f(aVar, bwVar));
                } else {
                    it = it2;
                    if (bwVar.e() != null) {
                        bx bxVarE = bwVar.e();
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) bxVarE.b());
                        spannableStringBuilder3.append((CharSequence) " • ");
                        spannableStringBuilder3.append((CharSequence) bxVarE.a());
                        builder7.addText(spannableStringBuilder3);
                        builder7.addText(f(aVar, bwVar));
                    } else {
                        if (bwVar.k() == null || bwVar.j() == null) {
                            CharSequence charSequenceC = c(carContext, bwVar.f(), bwVar.g());
                            if (charSequenceC != null && !h.n.o.G(charSequenceC)) {
                                builder7.addText(charSequenceC);
                            } else if (bwVar.l().length() > 0) {
                                builder7.addText(h(bwVar));
                            }
                            builder7.addText(f(aVar, bwVar));
                        } else {
                            if (bwVar.l().length() > 0) {
                                builder7.addText(h(bwVar));
                            }
                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                            spannableStringBuilder4.append((CharSequence) "_DISTANCE_PLACEHOLDER_");
                            spannableStringBuilder4.append((CharSequence) " • ");
                            spannableStringBuilder4.append((CharSequence) aVar.c(R.string.AAOS_CATEGORY_SEARCH_WALKING_TIME_PD, bwVar.k()));
                            Integer numJ = bwVar.j();
                            spannableStringBuilder4.setSpan(g(numJ != null ? numJ.intValue() : 0), 0, 22, 18);
                            builder7.addText(spannableStringBuilder4);
                        }
                        builder7.setOnClickListener(bwVar.b());
                        builder6.addItem(builder7.build());
                    }
                }
                builder7.setOnClickListener(bwVar.b());
                builder6.addItem(builder7.build());
            }
            ItemList itemListBuild = builder6.build();
            h.g.b.x.e(itemListBuild, "build(...)");
            builder.setItemList(itemListBuild);
        }
        builder.setPanModeListener(new com.waze.car_lib.p.ae(lVar, 7));
        builder.setMapActionStrip(dh.K(carContext, bqVar.f(), aVar4, aVar5));
        PlaceListNavigationTemplate placeListNavigationTemplateBuild = builder.build();
        h.g.b.x.e(placeListNavigationTemplateBuild, "build(...)");
        return placeListNavigationTemplateBuild;
    }

    private static Action e(String str, boolean z, h.g.a.a aVar) {
        Action actionL = dh.L(new co(str, z, true, aVar));
        h.g.b.x.e(actionL, "toAction(...)");
        return actionL;
    }

    private static CharSequence f(com.waze.shared_infra.o.a aVar, bw bwVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Integer numI = bwVar.i();
        if (numI != null) {
            spannableStringBuilder.append((CharSequence) com.waze.shared_infra.l.b.d(aVar.c(R.string.AAOS_CATEGORY_SEARCH_MINUTES_OFF_ROUTE_PD, Integer.valueOf(numI.intValue()))));
            spannableStringBuilder.append((CharSequence) " • ");
        }
        spannableStringBuilder.append((CharSequence) (bwVar.i() == null ? aVar.c(R.string.SEARCH_RESULTS_UNITS_AWAY, "_DISTANCE_PLACEHOLDER_") : "_DISTANCE_PLACEHOLDER_"));
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int iX = h.n.o.X(spannableStringBuilder2, "_DISTANCE_PLACEHOLDER_", 0, false, 6);
        if (iX < 0) {
            spannableStringBuilder.append((CharSequence) "_DISTANCE_PLACEHOLDER_");
            iX = spannableStringBuilder.length() - 22;
        }
        Integer numH = bwVar.h();
        spannableStringBuilder.setSpan(g(numH != null ? numH.intValue() : 0), iX, iX + 22, 18);
        return spannableStringBuilder2;
    }

    private static DistanceSpan g(int i2) {
        int i3 = 1;
        com.waze.sharedui.utils.c cVar = new com.waze.sharedui.utils.c(com.waze.sharedui.utils.f.d(ConfigValues.CONFIG_VALUE_GENERAL_UNITS.b()), i2, true);
        double d2 = cVar.f39085b;
        com.waze.sharedui.utils.d dVar = cVar.f39084a;
        if (dVar != null) {
            int iOrdinal = dVar.ordinal();
            if (iOrdinal == 0) {
                i3 = 2;
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i3 = 4;
                } else {
                    if (iOrdinal != 3) {
                        throw new h.i();
                    }
                    i3 = 6;
                }
            }
        }
        DistanceSpan distanceSpanCreate = DistanceSpan.create(Distance.create(d2, i3));
        h.g.b.x.e(distanceSpanCreate, "create(...)");
        return distanceSpanCreate;
    }

    private static CharSequence h(bw bwVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) com.waze.shared_infra.l.b.d(bwVar.l()));
        return spannableStringBuilder;
    }

    public /* synthetic */ b(byte[] bArr, byte[] bArr2) {
    }
}
