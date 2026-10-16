package com.waze.navigate;

import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import androidx.camera.video.AudioStats;
import com.waze.ConfigManager;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.NavigationInstruction;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.RouteSegment;
import com.waze.jni.protos.navigate.NavigationExitSign;
import com.waze.jni.protos.navigate.NavigationRoadShield;
import com.waze.jni.protos.navigate.NavigationRoadSign;
import com.waze.jni.protos.navigate.OfflineNavigationRouteProto;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.jni.protos.navigate.RoutingPopupActions;
import com.waze.jni.protos.navigate.Toll;
import com.waze.mg;
import com.waze.ui.m.Cdo;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CompletableDeferred;
import l.a.ale;
import l.a.bps;
import l.a.tn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class et {
    public static final /* synthetic */ ale A(com.waze.nav_connect.b.y yVar) {
        return yVar.g() ? ale.NAV_CONNECT_INITIAL_CONSENT : ale.NAV_CONNECT_MID_SESSION_CONSENT;
    }

    private static NavigateTollPriceInformation B(NavigateTollPriceInformation navigateTollPriceInformation) {
        if (navigateTollPriceInformation != null) {
            return navigateTollPriceInformation;
        }
        NavigateTollPriceInformation navigateTollPriceInformation2 = new NavigateTollPriceInformation();
        navigateTollPriceInformation2.popupId = -1;
        return navigateTollPriceInformation2;
    }

    private static Currency C(String str) {
        com.waze.shared_infra.i.h.a("getCurrency: country=null; currency=".concat(str != null ? str : "null"));
        if (str == null) {
            com.waze.shared_infra.i.h.j("getCurrency: did not receive currency or country code");
        }
        Currency currency = null;
        if (str != null) {
            try {
                currency = Currency.getInstance(str);
            } catch (Exception e2) {
                com.waze.shared_infra.i.h.j("getCurrency: exception when getting currency for value " + str + " from Currency: " + e2.getMessage());
            }
        }
        if (currency != null) {
            return currency;
        }
        com.waze.shared_infra.i.h.j("getCurrency: could not retrieve currency. Falling back to IL and NIS");
        return Currency.getInstance(new Locale("he", "IL"));
    }

    private static final List D(com.waze.av.d.a aVar, com.waze.shared_infra.o.a aVar2, long j2, boolean z, boolean z2) {
        List listAf;
        com.waze.av.d.b bVarB;
        if (!z || j2 < 1) {
            return h.a.i.h();
        }
        List listB = aVar.b();
        if (listB.isEmpty()) {
            listAf = h.a.i.h();
        } else {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listB) {
                if (hashSet.add(Long.valueOf(((com.waze.av.d.c) obj).a()))) {
                    arrayList.add(obj);
                }
            }
            List listAl = h.a.i.al(arrayList, new com.google.firebase.crashlytics.a.c.h(20));
            listAf = ((long) listB.size()) < j2 ? listAl : h.a.i.af(h.a.i.am(listAl, (int) ((j2 >> 1) + (1 & j2))), h.a.i.an(listAl, ((int) j2) >> 1));
        }
        List<com.waze.av.d.c> list = listAf;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list, 10));
        for (com.waze.av.d.c cVar : list) {
            String strV = com.waze.shared_infra.i.h.v(aVar2, TimeUnit.SECONDS.toMillis(cVar.a()));
            h.g.b.x.e(strV, "getTimeInterval(...)");
            String strK = com.waze.ad.c.b.k(cVar.c());
            String strK2 = null;
            if (z2 && aVar.a() != null && (bVarB = cVar.b()) != null) {
                strK2 = com.waze.ad.c.b.k(bVarB);
            }
            arrayList2.add(new Cdo(strV, strK, strK2));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.realtime_report_feedback.c E(com.waze.navigate.location_preview.ay ayVar) {
        com.waze.navigate.location_preview.f fVarM = ayVar.m();
        return (fVarM == null || !fVarM.c()) ? (!ayVar.O() || ayVar.o().g()) ? com.waze.navigate.location_preview.au.f31576a : ayVar.n() != null ? new com.waze.navigate.location_preview.av(ayVar.o(), ayVar.n().a().h(), ayVar.n().c()) : new com.waze.navigate.location_preview.aw(ayVar.o()) : com.waze.navigate.location_preview.ax.f31581a;
    }

    private static final com.waze.modules.c.br F(Toll.FixedPrice fixedPrice) {
        double tollPrice = fixedPrice.getTollPrice();
        String tollPriceCurrencyCode = fixedPrice.getTollPriceCurrencyCode();
        h.g.b.x.e(tollPriceCurrencyCode, "getTollPriceCurrencyCode(...)");
        return new com.waze.modules.c.br(tollPrice, tollPriceCurrencyCode);
    }

    private static final com.waze.modules.c.dj G(RoutingPopupActions routingPopupActions) {
        String popupId = routingPopupActions.getPopupId();
        h.g.b.x.e(popupId, "getPopupId(...)");
        String popupKey = routingPopupActions.getPopupKey();
        h.g.b.x.e(popupKey, "getPopupKey(...)");
        String primaryAction = routingPopupActions.getPrimaryAction();
        h.g.b.x.e(primaryAction, "getPrimaryAction(...)");
        String secondaryAction = routingPopupActions.getSecondaryAction();
        h.g.b.x.e(secondaryAction, "getSecondaryAction(...)");
        return new com.waze.modules.c.dj(popupId, popupKey, primaryAction, secondaryAction);
    }

    private static final com.waze.gas.a H(NavigationInstruction navigationInstruction) {
        return navigationInstruction.hasTurnLeft() ? com.waze.modules.c.ac.f29831a : navigationInstruction.hasTurnRight() ? com.waze.modules.c.ad.f29832a : navigationInstruction.hasKeepLeft() ? com.waze.modules.c.p.f30188a : navigationInstruction.hasKeepRight() ? com.waze.modules.c.q.f30189a : navigationInstruction.hasContinueStraight() ? com.waze.modules.c.m.f30185a : navigationInstruction.hasRoundaboutEnter() ? new com.waze.modules.c.s(navigationInstruction.getRoundaboutEnter().getRoundaboutExitNumber()) : navigationInstruction.hasRoundaboutExit() ? new com.waze.modules.c.t(navigationInstruction.getRoundaboutExit().getRoundaboutExitNumber()) : navigationInstruction.hasRoundaboutLeft() ? com.waze.modules.c.y.f30197a : navigationInstruction.hasRoundaboutExitLeft() ? com.waze.modules.c.u.f30193a : navigationInstruction.hasRoundaboutStraight() ? com.waze.modules.c.aa.f29829a : navigationInstruction.hasRoundaboutExitStraight() ? com.waze.modules.c.w.f30195a : navigationInstruction.hasRoundaboutRight() ? com.waze.modules.c.z.f30198a : navigationInstruction.hasRoundaboutExitRight() ? com.waze.modules.c.v.f30194a : navigationInstruction.hasRoundaboutU() ? com.waze.modules.c.ab.f29830a : navigationInstruction.hasRoundaboutExitU() ? com.waze.modules.c.x.f30196a : navigationInstruction.hasApproachingDestination() ? com.waze.modules.c.k.f30183a : navigationInstruction.hasExitLeft() ? com.waze.modules.c.n.f30186a : navigationInstruction.hasExitRight() ? com.waze.modules.c.o.f30187a : navigationInstruction.hasWaypointDelay() ? com.waze.modules.c.af.f29834a : navigationInstruction.hasUTurn() ? com.waze.modules.c.ae.f29833a : com.waze.modules.c.r.f30190a;
    }

    public static final com.waze.bc.a.a a(com.waze.av.d.q qVar, com.waze.shared_infra.o.a aVar, com.waze.shared_infra.q.j jVar, com.waze.shared_infra.q.e eVar, String str, Integer num) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(jVar, "dateFormat");
        h.g.b.x.f(eVar, "clock");
        if (qVar.a().isEmpty()) {
            return null;
        }
        return com.waze.search.v2.cv.d(com.waze.search.v2.cv.e(qVar, eVar, str, num, new com.waze.beacons.a.c(jVar, 4)), aVar);
    }

    public static final kotlinx.coroutines.b.k b(eo eoVar) {
        h.g.b.x.f(eoVar, "<this>");
        return new er(eoVar.ag(), 0);
    }

    public static boolean c(eo eoVar) {
        return eoVar.ag().d() instanceof ej;
    }

    public static String d(NavigateTollPriceInformation navigateTollPriceInformation) {
        NavigateTollPriceInformation navigateTollPriceInformationB = B(navigateTollPriceInformation);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        if (!ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_ROUTING_SHOW_TOLL_PRICE)) {
            return aVarA.c(R.string.ETA_SCREEN_TOLL, new Object[0]);
        }
        if (navigateTollPriceInformationB.popupId == gf.f31414a.ordinal()) {
            return aVarA.c(R.string.ETA_SCREEN_DYNAMIC_TOLL, new Object[0]);
        }
        double d2 = navigateTollPriceInformationB.tollPrice;
        return d2 > AudioStats.AUDIO_AMPLITUDE_NONE ? aVarA.c(R.string.ETA_SCREEN_TOLL_FORMAT_PS, f(g(d2, navigateTollPriceInformationB.tollCurrencyCode), navigateTollPriceInformationB.tollCurrencyCode)) : aVarA.c(R.string.ETA_SCREEN_TOLL, new Object[0]);
    }

    public static void e(NavigateTollPriceInformation navigateTollPriceInformation, ge geVar) {
        gf gfVar;
        String strC;
        String strC2;
        String strC3;
        String strC4;
        NavigateTollPriceInformation navigateTollPriceInformationB = B(navigateTollPriceInformation);
        try {
            gfVar = gf.values()[navigateTollPriceInformationB.popupId];
        } catch (Exception unused) {
            gfVar = gf.f31421h;
        }
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        switch (gfVar.ordinal()) {
            case 0:
                strC = aVarA.c(R.string.TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN_HEADER, new Object[0]);
                strC2 = aVarA.c(R.string.TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            case 1:
                strC = aVarA.c(R.string.TOLL_INFO_MISSING_PASS_HEADER_PS, navigateTollPriceInformationB.passBasedMissingPassName);
                strC3 = aVarA.c(R.string.TOLL_INFO_MISSING_PASS_MESSAGE, new Object[0]);
                strC4 = aVarA.c(R.string.TOLL_INFO_ACTION, new Object[0]);
                break;
            case 2:
                strC = aVarA.c(R.string.TOLL_INFO_MISSING_PASS_WITH_PRICE_HEADER_PS_PS_PS, f(g(navigateTollPriceInformationB.tollPrice, navigateTollPriceInformationB.tollCurrencyCode), navigateTollPriceInformationB.tollCurrencyCode), navigateTollPriceInformationB.passBasedMissingPassName, f(g(navigateTollPriceInformationB.passBasedPriceChangeToPrice, navigateTollPriceInformationB.tollCurrencyCode), navigateTollPriceInformationB.tollCurrencyCode));
                strC3 = aVarA.c(R.string.TOLL_INFO_MISSING_PASS_WITH_PRICE_MESSAGE, new Object[0]);
                strC4 = aVarA.c(R.string.TOLL_INFO_ACTION, new Object[0]);
                break;
            case 3:
                long jG = g(navigateTollPriceInformationB.tollPrice, navigateTollPriceInformationB.tollCurrencyCode);
                long jG2 = g(navigateTollPriceInformationB.timeBasedPriceChangeToPrice, navigateTollPriceInformationB.tollCurrencyCode);
                String strF = f(jG, navigateTollPriceInformationB.tollCurrencyCode);
                String strF2 = f(jG2, navigateTollPriceInformationB.tollCurrencyCode);
                String str = navigateTollPriceInformationB.tollRoadName;
                int i2 = navigateTollPriceInformationB.timeBasedPriceChangeAtSeconds;
                DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(mg.a());
                timeFormat.setTimeZone(Calendar.getInstance().getTimeZone());
                strC = aVarA.c(R.string.TOLL_INFO_PRICE_CHANGE_AT_HEADER_PS_PS_PS_PS, strF, strF2, str, com.waze.shared_infra.o.b.a().c(R.string.ALTERNATE_ROUTES_HOURS_FORMAT_PS, timeFormat.format(new Date(i2 * 1000))));
                strC2 = aVarA.c(R.string.TOLL_INFO_PRICE_CHANGE_AT_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            case 4:
                strC = aVarA.c(R.string.TOLL_INFO_PRICE_CHANGE_BY_TIME_HEADER_PS, navigateTollPriceInformationB.tollRoadName);
                strC2 = aVarA.c(R.string.TOLL_INFO_PRICE_CHANGE_BY_TIME_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            case 5:
                strC = aVarA.c(R.string.TOLL_INFO_WITH_PASS_HEADER_PS, navigateTollPriceInformationB.passBasedUserPassName);
                strC2 = aVarA.c(R.string.TOLL_INFO_WITH_PASS_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            case 6:
                strC = aVarA.c(R.string.TOLL_INFO_DEFAULT_HEADER, new Object[0]);
                strC2 = aVarA.c(R.string.TOLL_INFO_DEFAULT_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            case 7:
                strC = aVarA.c(R.string.TOLL_INFO_NO_PRICE_HEADER, new Object[0]);
                strC2 = aVarA.c(R.string.TOLL_INFO_NO_PRICE_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            case 8:
                strC = aVarA.c(R.string.TOLL_INFO_DYNAMIC_PRICE_SHOWN_HEADER, new Object[0]);
                strC2 = aVarA.c(R.string.TOLL_INFO_DYNAMIC_PRICE_SHOWN_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
            default:
                strC = aVarA.c(R.string.TOLL_INFO_DISABLED_BY_CONFIG_HEADER, new Object[0]);
                strC2 = aVarA.c(R.string.TOLL_INFO_DISABLED_BY_CONFIG_MESSAGE, new Object[0]);
                strC3 = strC2;
                strC4 = null;
                break;
        }
        boolean zF = com.google.d.b.an.f(strC4);
        final boolean z = !zF;
        com.waze.shared_infra.o.a aVarA2 = com.waze.shared_infra.o.b.a();
        final fy fyVar = (fy) com.waze.web.r.h(fy.class);
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(strC);
        com.waze.shared_infra.o.a aVarA3 = com.waze.shared_infra.o.b.a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strC3);
        spannableStringBuilder.append((CharSequence) "\n\n");
        int length = spannableStringBuilder.length();
        String strC5 = aVarA3.c(R.string.TOLL_INFO_PRICES_POPUP_HELP_LINK_TITLE, new Object[0]);
        spannableStringBuilder.append((CharSequence) strC5);
        spannableStringBuilder.setSpan(new gd(strC5), length, spannableStringBuilder.length(), 33);
        oVar.O(spannableStringBuilder);
        oVar.f13808a = new com.waze.ab.q() { // from class: com.waze.navigate.gc
            @Override // com.waze.ab.q
            public final void onClick(boolean z2) {
                fv fvVar;
                if (z && z2) {
                    NativeManager.getInstance().OpenHOVSettings(false);
                    fvVar = fv.f31382b;
                } else {
                    fvVar = fv.f31381a;
                }
                fyVar.a(fvVar);
            }
        };
        if (zF) {
            strC4 = aVarA2.c(R.string.CLOSE, new Object[0]);
        }
        oVar.M(strC4);
        oVar.N(zF ? null : aVarA2.c(R.string.CLOSE, new Object[0]));
        oVar.F(R.drawable.icon_permanent_hazard_toll_booth);
        oVar.H(new com.waze.design_components.c.f(fyVar, 5));
        com.waze.z.a.d.ai.q(oVar);
        ((fy) com.waze.web.r.h(fy.class)).b(navigateTollPriceInformationB, geVar, gfVar);
    }

    public static String f(long j2, String str) {
        com.waze.shared_infra.i.h.a("centsToString: country=null; currency=".concat(str != null ? str : "null"));
        Currency currencyC = C(str);
        double dPow = j2 / Math.pow(10.0d, currencyC.getDefaultFractionDigits());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currencyC);
        return currencyInstance.format(dPow);
    }

    public static long g(double d2, String str) {
        com.waze.shared_infra.i.h.a("majorToMinors: country=null; currency=".concat(str != null ? str : "null"));
        return BigDecimal.valueOf(d2).multiply(BigDecimal.valueOf(Math.pow(10.0d, C(str).getDefaultFractionDigits()))).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.waze.navigate.location_preview.d] */
    public static final com.waze.navigate.location_preview.c h(com.waze.ev.a aVar, com.waze.ev.n nVar) {
        boolean z;
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(nVar, "evRepository");
        Set setE = nVar.e();
        List listB = aVar.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((com.waze.ev.c) obj).b() > 0) {
                arrayList.add(obj);
            }
        }
        List<com.waze.ev.c> listD = h.a.i.D(h.a.i.al(arrayList, h.b.a.b(new com.waze.car_lib.login.b(setE, 7), new com.waze.map.gl(20))));
        ArrayList arrayList2 = new ArrayList();
        for (com.waze.ev.c cVar : listD) {
            com.waze.ev.f fVarA = nVar.a(cVar.d());
            if (fVarA != null) {
                String strD = fVarA.d();
                int iB = cVar.b();
                Integer numC = cVar.c();
                boolean zContains = setE.contains(fVarA.d());
                com.waze.ev.l lVarC = nVar.c(cVar.a());
                dVar = new com.waze.navigate.location_preview.d(strD, iB, zContains, lVarC != null ? new com.waze.navigate.location_preview.e(lVarC, (int) cVar.a()) : null, numC);
            }
            if (dVar != null) {
                arrayList2.add(dVar);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (!((com.waze.ev.m) nVar.g().d()).d() || arrayList3.isEmpty()) {
            z = false;
            break;
        }
        ArrayList arrayList4 = arrayList3;
        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                if (((com.waze.navigate.location_preview.d) it.next()).e()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        com.waze.ui.ac.n nVarD = com.waze.ui.ad.b.d(aVar.a());
        List listC = aVar.c();
        ArrayList arrayList5 = new ArrayList(h.a.i.q(listC, 10));
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList5.add(new com.waze.ui.ac.l((String) it2.next()));
        }
        return new com.waze.navigate.location_preview.c(arrayList3, z, aVar.d(), arrayList5, nVarD);
    }

    public static final com.waze.ui.m.b i(com.waze.ads.a.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        return new com.waze.ui.m.b(fVar.e(), fVar.k(), fVar.p(), fVar.l(), fVar.j(), fVar.g(), fVar.f(), fVar.h(), fVar.n(), fVar.o(), fVar.i(), fVar.d(), fVar.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x09f9 A[LOOP:2: B:372:0x09f3->B:374:0x09f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c6a  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0c83  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d7 A[PHI: r1 r25
  0x01d7: PHI (r1v18 int) = (r1v19 int), (r1v20 int) binds: [B:82:0x01bf, B:79:0x01b9] A[DONT_GENERATE, DONT_INLINE]
  0x01d7: PHI (r25v2 boolean) = (r25v3 boolean), (r25v4 boolean) binds: [B:82:0x01bf, B:79:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.ui.m.dl j(com.waze.navigate.location_preview.ay r49, com.waze.la r50, com.waze.shared_infra.o.a r51, com.waze.sharedui.j r52, com.waze.ev.n r53, com.waze.shared_infra.q.e r54, com.waze.shared_infra.q.j r55, java.lang.Integer r56, boolean r57, com.waze.navigate.location_preview.p r58, boolean r59) {
        /*
            Method dump skipped, instructions count: 3230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.et.j(com.waze.navigate.location_preview.ay, com.waze.la, com.waze.shared_infra.o.a, com.waze.sharedui.j, com.waze.ev.n, com.waze.shared_infra.q.e, com.waze.shared_infra.q.j, java.lang.Integer, boolean, com.waze.navigate.location_preview.p, boolean):com.waze.ui.m.dl");
    }

    public static final /* synthetic */ com.waze.navigate.location_preview.bc k(com.waze.navigate.location_preview.ay ayVar) {
        Long lValueOf = null;
        if (ayVar.l() == null) {
            return null;
        }
        Iterator it = ayVar.l().c().iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((com.waze.navigate.location_preview.d) it.next()).a();
        }
        long j2 = iA;
        List listC = ayVar.l().c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((com.waze.navigate.location_preview.d) obj).c() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (true == arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            int iIntValue = 0;
            while (it2.hasNext()) {
                Integer numC = ((com.waze.navigate.location_preview.d) it2.next()).c();
                iIntValue += numC != null ? numC.intValue() : 0;
            }
            lValueOf = Long.valueOf(iIntValue);
        }
        return new com.waze.navigate.location_preview.bc(lValueOf, j2);
    }

    public static final /* synthetic */ com.waze.navigate.location_preview.bg l(com.waze.navigate.location_preview.ay ayVar, com.waze.shared_infra.q.e eVar, Integer num) {
        if (ayVar.f() == com.waze.av.d.j.f16079a && com.waze.ad.c.b.n(ayVar.g())) {
            return null;
        }
        com.waze.av.d.j jVarF = ayVar.f();
        com.waze.av.d.q qVarG = ayVar.g();
        String strD = ayVar.D();
        com.waze.navigate.location_preview.bg bgVar = com.waze.navigate.location_preview.bg.f31635a;
        int iOrdinal = jVarF.ordinal();
        if (iOrdinal == 2) {
            return com.waze.navigate.location_preview.bg.f31641g;
        }
        if (iOrdinal == 3) {
            return com.waze.navigate.location_preview.bg.f31642h;
        }
        if (com.waze.ad.c.b.n(qVarG)) {
            return null;
        }
        com.waze.realtime_report_feedback.c cVarE = com.waze.search.v2.cv.e(qVarG, eVar, strD, num, new com.waze.native_managers.f(20));
        if (cVarE instanceof fb) {
            return com.waze.navigate.location_preview.bg.f31637c;
        }
        if (cVarE instanceof ey) {
            return com.waze.navigate.location_preview.bg.f31639e;
        }
        if (h.g.b.x.n(cVarE, ez.f31340a)) {
            return com.waze.navigate.location_preview.bg.f31639e;
        }
        if (cVarE instanceof fa) {
            return com.waze.navigate.location_preview.bg.f31640f;
        }
        if (h.g.b.x.n(cVarE, fc.f31347a)) {
            return com.waze.navigate.location_preview.bg.f31638d;
        }
        if (cVarE instanceof fd) {
            return com.waze.navigate.location_preview.bg.f31636b;
        }
        throw new h.i();
    }

    public static final /* synthetic */ tn m(com.waze.navigate.location_preview.bc bcVar) {
        com.waze.shared_infra.s.c cVarD = e.b.c.d(tn.newBuilder());
        cVarD.p(bcVar.a());
        Long lB = bcVar.b();
        if (lB != null) {
            cVarD.o(lB.longValue());
        }
        return cVarD.n();
    }

    public static final /* synthetic */ bps n(com.waze.navigate.location_preview.bg bgVar) {
        Parcelable.Creator<com.waze.av.d.j> creator = com.waze.av.d.j.CREATOR;
        switch (bgVar.ordinal()) {
            case 0:
                return bps.VENUE_OPENING_STATUS_UNSPECIFIED;
            case 1:
                return bps.VENUE_OPENING_SOON;
            case 2:
                return bps.VENUE_OPEN_NOW;
            case 3:
                return bps.VENUE_OPEN_24_HOURS;
            case 4:
                return bps.VENUE_CLOSED;
            case 5:
                return bps.VENUE_CLOSES_SOON;
            case 6:
                return bps.VENUE_TEMPORARILY_CLOSED;
            case 7:
                return bps.VENUE_PERMANENTLY_CLOSED;
            case 8:
                return bps.UNKNOWN;
            default:
                throw new h.i();
        }
    }

    public static final boolean p(el elVar) {
        h.g.b.x.f(elVar, "<this>");
        ek ekVarA = elVar.a();
        ek ekVar = ek.f31314a;
        switch (ekVarA.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return false;
            case 8:
            case 9:
                return true;
            default:
                throw new h.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0575 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.modules.c.ar q(com.waze.jni.protos.navigate.NavigationRoute r47) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.et.q(com.waze.jni.protos.navigate.NavigationRoute):com.waze.modules.c.ar");
    }

    public static final List r(PolylineGeometry polylineGeometry) {
        h.g.b.x.f(polylineGeometry, "<this>");
        List<Position.IntPosition> positionList = polylineGeometry.getPositionList();
        h.g.b.x.e(positionList, "getPositionList(...)");
        List<Position.IntPosition> list = positionList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (Position.IntPosition intPosition : list) {
            arrayList.add(new com.waze.shared_infra.h.c(intPosition.getLatitude(), intPosition.getLongitude()));
        }
        return arrayList;
    }

    public static final List s(OfflineNavigationRouteProto offlineNavigationRouteProto) {
        h.g.b.x.f(offlineNavigationRouteProto, "offlineNavigationRouteProto");
        List<RouteSegment> segmentsList = offlineNavigationRouteProto.getSegmentsList();
        h.g.b.x.e(segmentsList, "getSegmentsList(...)");
        List<RouteSegment> list = segmentsList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (RouteSegment routeSegment : list) {
            NavigationInstruction instruction = routeSegment.getInstruction();
            h.g.b.x.e(instruction, "getInstruction(...)");
            arrayList.add(new com.waze.modules.c.cs(H(instruction), routeSegment.getLengthMeters()));
        }
        return arrayList;
    }

    public static final kotlinx.coroutines.b.k t(NavigationInfoNativeManager navigationInfoNativeManager) {
        h.g.b.x.f(navigationInfoNativeManager, "<this>");
        return kotlinx.coroutines.b.ai.n(new du(navigationInfoNativeManager, null));
    }

    public static final ee u(NavigationRoadSign navigationRoadSign) {
        h.g.b.x.f(navigationRoadSign, "<this>");
        String primaryMarkup = navigationRoadSign.getPrimaryMarkup();
        h.g.b.x.e(primaryMarkup, "getPrimaryMarkup(...)");
        String secondaryMarkup = navigationRoadSign.getSecondaryMarkup();
        h.g.b.x.e(secondaryMarkup, "getSecondaryMarkup(...)");
        List<NavigationRoadShield> roadShieldList = navigationRoadSign.getRoadShieldList();
        h.g.b.x.e(roadShieldList, "getRoadShieldList(...)");
        List<NavigationRoadShield> list = roadShieldList;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (NavigationRoadShield navigationRoadShield : list) {
            h.g.b.x.c(navigationRoadShield);
            h.g.b.x.f(navigationRoadShield, "<this>");
            String resourceName = navigationRoadShield.getResourceName();
            h.g.b.x.e(resourceName, "getResourceName(...)");
            String direction = navigationRoadShield.getDirection();
            h.g.b.x.e(direction, "getDirection(...)");
            String text = navigationRoadShield.getText();
            h.g.b.x.e(text, "getText(...)");
            arrayList.add(new ed(resourceName, direction, text));
        }
        ArrayList arrayList2 = arrayList;
        List<NavigationExitSign> exitSignList = navigationRoadSign.getExitSignList();
        h.g.b.x.e(exitSignList, "getExitSignList(...)");
        List<NavigationExitSign> list2 = exitSignList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(list2, 10));
        for (NavigationExitSign navigationExitSign : list2) {
            h.g.b.x.c(navigationExitSign);
            h.g.b.x.f(navigationExitSign, "<this>");
            String resourceName2 = navigationExitSign.getResourceName();
            h.g.b.x.e(resourceName2, "getResourceName(...)");
            String text2 = navigationExitSign.getText();
            h.g.b.x.e(text2, "getText(...)");
            arrayList3.add(new df(resourceName2, text2));
        }
        return new ee(primaryMarkup, secondaryMarkup, arrayList2, arrayList3);
    }

    public static final Integer v(cj cjVar) {
        ck ckVarB;
        h.g.b.x.f(cjVar, "<this>");
        ci ciVar = (ci) cjVar.P().d();
        if (ciVar == null || (ckVarB = ciVar.b()) == null) {
            return null;
        }
        return Integer.valueOf(ckVarB.a());
    }

    public static final Object w(bt btVar, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = kotlinx.coroutines.bo.j();
        btVar.getRoutingLocationInfo(new com.waze.car_lib.f.u(completableDeferredJ, 11));
        return completableDeferredJ.c(eVar);
    }

    public static j x() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = j.f31469a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(j.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(j.class);
        }
        return (j) bVarC.a(mVar, null, null);
    }

    public static int y(int i2) throws NumberFormatException {
        double d2;
        try {
            d2 = Double.parseDouble(ConfigValues.CONFIG_VALUE_WALK2CAR_DEFAULT_SPEED_KMH.b());
        } catch (NumberFormatException unused) {
            d2 = 5.0d;
        }
        return (int) (((i2 / 1000.0d) / (d2 > AudioStats.AUDIO_AMPLITUDE_NONE ? d2 : 5.0d)) * 60.0d);
    }

    public static com.waze.places.f z(AddressItem addressItem) {
        String venueContext = addressItem.getVenueContext();
        String venueId = addressItem.getVenueId();
        String title = addressItem.getVenueName().isEmpty() ? addressItem.getTitle() : addressItem.getVenueName();
        String title2 = addressItem.getTitle();
        com.waze.shared_infra.h.c coordinate = addressItem.getCoordinate();
        com.waze.places.a aVarG = com.waze.notifications.c.k.g(addressItem.venueData.h().getAddress());
        String routingContext = addressItem.getRoutingContext();
        if (venueContext.isEmpty()) {
            venueContext = addressItem.getMeetingId();
        }
        return new com.waze.places.f(venueId, title, title2, coordinate, aVarG, routingContext, venueContext, addressItem.getId(), addressItem.getIcon());
    }
}
