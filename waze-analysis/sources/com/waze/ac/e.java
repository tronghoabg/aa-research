package com.waze.ac;

import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.google.v.ec;
import com.waze.MainActivity;
import com.waze.asks.ak;
import com.waze.av.b.z;
import com.waze.c.e.t;
import com.waze.jni.protos.places.Address;
import com.waze.jni.protos.places.EventPlace;
import com.waze.jni.protos.places.EventPlaceType;
import com.waze.jni.protos.places.FavoritePlace;
import com.waze.jni.protos.places.FavoritePlaceType;
import com.waze.jni.protos.places.GenericPlace;
import com.waze.jni.protos.places.Place;
import com.waze.jni.protos.places.PlaceKey;
import com.waze.jni.protos.places.RecentPlace;
import com.waze.jni.protos.places.RecentPlaceType;
import com.waze.lm;
import com.waze.location.aa;
import com.waze.map.b.ah;
import com.waze.mg;
import com.waze.navigate.AddressItem;
import com.waze.reports.ed;
import com.waze.search.v2.bt;
import com.waze.strings.DisplayStrings;
import com.waze.ui.e.w;
import com.waze.ui.e.y;
import h.g.b.ar;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class e {
    public /* synthetic */ e(byte[] bArr) {
    }

    public static boolean A(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        return (nVar instanceof com.waze.av.b.k) && ((com.waze.av.b.k) nVar).f() == com.waze.av.b.i.f15957c;
    }

    public static /* synthetic */ AddressItem B(com.waze.av.b.n nVar) {
        return q(nVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(j jVar, com.waze.messages.c cVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        r.f13870a.a().a(cVar, jVar.b(), new k(m.f13865a, cVar.f29767c));
        org.a.d.a.a aVar = com.waze.ac.b.b.f13832a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.ac.b.b.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.ac.b.b.class);
        }
        ((com.waze.ac.b.b) bVarC.a(mVar, null, null)).a(cVar.w, jVar.a(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.waze.av.b.h D(com.waze.av.b.n nVar) {
        if (!(nVar instanceof com.waze.av.b.k)) {
            return null;
        }
        com.waze.av.b.k kVar = (com.waze.av.b.k) nVar;
        long jA = kVar.a();
        com.waze.av.b.i iVarF = kVar.f();
        com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
        int iOrdinal = iVarF.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new com.waze.av.b.e(kVar.d(), jA);
            }
            if (iOrdinal == 2) {
                return new com.waze.av.b.g(kVar.d(), jA);
            }
            if (iOrdinal != 3) {
                throw new h.i();
            }
        }
        return new com.waze.av.b.f(jA, kVar.h(), kVar.d(), kVar.b());
    }

    private static Address E(com.waze.av.a.a aVar) {
        Address.Builder builderNewBuilder = Address.newBuilder();
        String strB = aVar.b();
        if (strB != null) {
            builderNewBuilder.setCountry(strB);
        }
        String strA = aVar.a();
        if (strA != null) {
            builderNewBuilder.setCity(strA);
        }
        String strE = aVar.e();
        if (strE != null) {
            builderNewBuilder.setState(strE);
        }
        String strF = aVar.f();
        if (strF != null) {
            builderNewBuilder.setStreet(strF);
        }
        String strC = aVar.c();
        if (strC != null) {
            builderNewBuilder.setHouseNumber(strC);
        }
        String strG = aVar.g();
        if (strG != null) {
            builderNewBuilder.setZip(strG);
        }
        Address addressBuild = builderNewBuilder.build();
        x.e(addressBuild, "build(...)");
        return addressBuild;
    }

    private static com.waze.av.a.p F(com.waze.av.a.p pVar, com.waze.av.d.k kVar) {
        return com.waze.av.a.p.f(pVar, kVar.a(), com.waze.av.a.o.g(pVar.c(), kVar.B(), null, 61), 26);
    }

    private static String G(com.waze.av.a.p pVar) {
        String strC = pVar.c().c();
        if ((strC == null || strC.length() == 0) && pVar.d().g()) {
            return null;
        }
        String strC2 = pVar.c().c();
        return (strC2 == null || strC2.length() == 0) ? pVar.d().toString() : pVar.c().c();
    }

    static /* synthetic */ void a(com.waze.messages.c cVar, boolean z) {
        MainActivity mainActivityC = lm.d().c();
        String str = z ? cVar.f29771g : cVar.f29772h;
        if (!TextUtils.isEmpty(str)) {
            x.f(str, "url");
            Intent intentA = new b(mg.f29780a.a()).a(str);
            if (intentA != null && mainActivityC != null) {
                mainActivityC.startActivity(intentA);
            }
        }
        C(z ? j.f13855c : j.f13856d, cVar);
    }

    public static Set c(com.waze.shared_infra.i.e eVar, String str, List list) {
        x.f(eVar, "logger");
        x.f(str, "selectedConnectorsString");
        x.f(list, "hardCodedIds");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : h.n.o.af(str, new String[]{"|"}, 0, 6)) {
            if (list.contains(str2)) {
                linkedHashSet.add(str2);
            } else {
                eVar.g("Found connector id " + str2 + " that doesn't exist in hard coded data. Ignoring this id.");
            }
        }
        return linkedHashSet;
    }

    public static String d(com.waze.shared_infra.i.e eVar, List list, String str, ch chVar) throws IOException {
        String strAM;
        x.f(eVar, "logger");
        x.f(list, "evNetworkNames");
        x.f(str, "selectedNetworkNames");
        x.f(chVar, "allNetworks");
        List list2 = (List) chVar.d();
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (list.contains(((com.waze.ev.g) obj).a())) {
                    arrayList.add(obj);
                }
            }
            strAM = h.a.i.aM(arrayList, "|", null, null, 0, new com.waze.z.a.d.d(12), 30);
        } else {
            strAM = "";
        }
        eVar.a("Changing EV selected networks config from " + str + " to " + strAM);
        return strAM;
    }

    public static void e(com.waze.main_screen.d.a.d dVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        t tVar;
        x.f(dVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(704917102);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        int i5 = 18;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(704917102, i3, -1, "com.waze.main_screen.compass.presentation.Compass (Compass.kt:18)");
            }
            byte[] bArr = null;
            ah ahVar = (ah) SnapshotStateKt.collectAsState(dVar.a(), null, composerStartRestartGroup, 0, 1).getValue();
            if (ahVar == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    tVar = new t(dVar, modifier, i2, i5);
                    scopeUpdateScopeEndRestartGroup.updateScope(tVar);
                }
                return;
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cO, null);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            int i6 = 14;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new aa(i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(ahVar) | ((i3 & 14) == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ak(ahVar, dVar, 15, bArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierA, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            tVar = new t(dVar, modifier, i2, 19);
            scopeUpdateScopeEndRestartGroup.updateScope(tVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Modifier modifier, com.waze.main_screen.ae.a.d dVar, boolean z, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        com.waze.main_screen.ae.a.d dVar2;
        h.g.a.a aVar2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        com.waze.main_screen.c.b.b bVar;
        x.f(dVar, "transportSdkButtonStateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-238222682);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(dVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-238222682, i3, -1, "com.waze.main_screen.button_pack.transport_sdk_button.TransportSdkButtonV1 (TransportSdkButtonV1.kt:32)");
            }
            String str = null;
            Object[] objArr = 0;
            Bitmap bitmapA = ((com.waze.main_screen.ae.a.b) SnapshotStateKt.collectAsState(dVar.a(), null, composerStartRestartGroup, 0, 1).getValue()).b().a();
            if (bitmapA == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    bVar = new com.waze.main_screen.c.b.b(modifier, dVar, z, aVar, i2, 3);
                    scopeUpdateScopeEndRestartGroup.updateScope(bVar);
                }
                return;
            }
            dVar2 = dVar;
            aVar2 = aVar;
            int i6 = i3 << 3;
            char c2 = (i3 & 112) == 32;
            char c3 = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((c3 | c2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.car_lib.e.d(dVar2, aVar2, 5, objArr == true ? 1 : 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i7 = i6 & 112;
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1605495046);
                y yVar = new y(new com.waze.ui.e.p(AndroidImageBitmap_androidKt.asImageBitmap(bitmapA)), str, 14);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.main_screen.c.g.a(i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                w.f(yVar, modifier, null, 0L, aVar3, (h.g.a.a) objRememberedValue2, null, composerStartRestartGroup, i7 | 196608, 76);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1605291190);
                com.waze.ui.d.s.j(aVar3, modifier, 0L, null, ComposableLambdaKt.rememberComposableLambda(23680336, true, new com.waze.ads.c.a(bitmapA, 18), composerStartRestartGroup, 54), composerStartRestartGroup, i7 | 24576, 12);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            dVar2 = dVar;
            aVar2 = aVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            bVar = new com.waze.main_screen.c.b.b(modifier, dVar2, z, aVar2, i2, 4);
            scopeUpdateScopeEndRestartGroup.updateScope(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.util.List h(java.util.List r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ac.e.h(java.util.List):java.util.List");
    }

    public static GenericPlace i(com.waze.av.b.n nVar) {
        RecentPlaceType recentPlaceType;
        FavoritePlaceType favoritePlaceType;
        EventPlaceType eventPlaceType;
        x.f(nVar, "<this>");
        if (nVar instanceof com.waze.av.b.m) {
            return null;
        }
        GenericPlace.Builder builderNewBuilder = GenericPlace.newBuilder();
        builderNewBuilder.setWazeAddress(j(nVar.e()));
        if (nVar instanceof com.waze.av.b.j) {
            com.waze.av.b.j jVar = (com.waze.av.b.j) nVar;
            EventPlace.Builder builderNewBuilder2 = EventPlace.newBuilder();
            builderNewBuilder2.setId(jVar.a());
            builderNewBuilder2.setEventId(jVar.g());
            builderNewBuilder2.setName(jVar.i());
            com.waze.av.b.d dVarF = jVar.f();
            RecentPlaceType recentPlaceType2 = RecentPlaceType.RECENT_PLACE_TYPE_DEFAULT;
            z zVar = z.f16013a;
            EventPlaceType eventPlaceType2 = EventPlaceType.EVENT_PLACE_TYPE_NONE;
            com.waze.av.b.d dVar = com.waze.av.b.d.f15942a;
            FavoritePlaceType favoritePlaceType2 = FavoritePlaceType.FAVORITE_PLACE_TYPE_DEFAULT;
            com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
            int iOrdinal = dVarF.ordinal();
            if (iOrdinal == 0) {
                eventPlaceType = EventPlaceType.EVENT_PLACE_TYPE_NONE;
            } else if (iOrdinal == 1) {
                eventPlaceType = EventPlaceType.EVENT_PLACE_TYPE_WAZE;
            } else if (iOrdinal == 2) {
                eventPlaceType = EventPlaceType.EVENT_PLACE_TYPE_CALENDAR;
            } else {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                eventPlaceType = EventPlaceType.EVENT_PLACE_TYPE_FUTURE_DRIVE;
            }
            builderNewBuilder2.setType(eventPlaceType);
            builderNewBuilder2.setStartTime(jVar.c());
            builderNewBuilder2.setEndTime(jVar.b());
            builderNewBuilder2.setAllDay(jVar.k());
            builderNewBuilder2.setValidated(jVar.n());
            builderNewBuilder2.setValidateOnly(jVar.m());
            String strJ = jVar.j();
            if (strJ != null) {
                builderNewBuilder2.setRefEventId(strJ);
            }
            String strH = jVar.h();
            if (strH != null) {
                builderNewBuilder2.setImageUrl(strH);
            }
            builderNewBuilder2.setRecurringCalendarEvent(jVar.l());
            EventPlace eventPlaceBuild = builderNewBuilder2.build();
            x.e(eventPlaceBuild, "build(...)");
            builderNewBuilder.setEventPlace(eventPlaceBuild);
        } else if (nVar instanceof com.waze.av.b.k) {
            com.waze.av.b.k kVar = (com.waze.av.b.k) nVar;
            FavoritePlace.Builder builderNewBuilder3 = FavoritePlace.newBuilder();
            builderNewBuilder3.setId(kVar.a());
            builderNewBuilder3.setName(kVar.h());
            com.waze.av.b.i iVarF = kVar.f();
            RecentPlaceType recentPlaceType3 = RecentPlaceType.RECENT_PLACE_TYPE_DEFAULT;
            z zVar2 = z.f16013a;
            EventPlaceType eventPlaceType3 = EventPlaceType.EVENT_PLACE_TYPE_NONE;
            com.waze.av.b.d dVar2 = com.waze.av.b.d.f15942a;
            FavoritePlaceType favoritePlaceType3 = FavoritePlaceType.FAVORITE_PLACE_TYPE_DEFAULT;
            com.waze.av.b.i iVar2 = com.waze.av.b.i.f15955a;
            int iOrdinal2 = iVarF.ordinal();
            if (iOrdinal2 == 0) {
                favoritePlaceType = FavoritePlaceType.FAVORITE_PLACE_TYPE_DEFAULT;
            } else if (iOrdinal2 == 1) {
                favoritePlaceType = FavoritePlaceType.FAVORITE_PLACE_TYPE_HOME;
            } else if (iOrdinal2 == 2) {
                favoritePlaceType = FavoritePlaceType.FAVORITE_PLACE_TYPE_WORK;
            } else {
                if (iOrdinal2 != 3) {
                    throw new h.i();
                }
                favoritePlaceType = FavoritePlaceType.FAVORITE_PLACE_TYPE_OTHER;
            }
            builderNewBuilder3.setType(favoritePlaceType);
            builderNewBuilder3.setServerId(kVar.d());
            builderNewBuilder3.setAccessTimeSec(kVar.c());
            FavoritePlace favoritePlaceBuild = builderNewBuilder3.build();
            x.e(favoritePlaceBuild, "build(...)");
            builderNewBuilder.setFavoritePlace(favoritePlaceBuild);
        } else if (nVar instanceof com.waze.av.b.l) {
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            RecentPlace.Builder builderNewBuilder4 = RecentPlace.newBuilder();
            builderNewBuilder4.setId(lVar.a());
            builderNewBuilder4.setName(lVar.f());
            z zVarC = lVar.c();
            RecentPlaceType recentPlaceType4 = RecentPlaceType.RECENT_PLACE_TYPE_DEFAULT;
            z zVar3 = z.f16013a;
            EventPlaceType eventPlaceType4 = EventPlaceType.EVENT_PLACE_TYPE_NONE;
            com.waze.av.b.d dVar3 = com.waze.av.b.d.f15942a;
            FavoritePlaceType favoritePlaceType4 = FavoritePlaceType.FAVORITE_PLACE_TYPE_DEFAULT;
            com.waze.av.b.i iVar3 = com.waze.av.b.i.f15955a;
            int iOrdinal3 = zVarC.ordinal();
            if (iOrdinal3 == 0) {
                recentPlaceType = RecentPlaceType.RECENT_PLACE_TYPE_DEFAULT;
            } else {
                if (iOrdinal3 != 1) {
                    throw new h.i();
                }
                recentPlaceType = RecentPlaceType.RECENT_PLACE_TYPE_ADS;
            }
            builderNewBuilder4.setType(recentPlaceType);
            builderNewBuilder4.setImageId(lVar.d());
            builderNewBuilder4.setAccessTimeSec(lVar.b());
            builderNewBuilder4.setShouldConfirmLocationUpdate(lVar.g());
            RecentPlace recentPlaceBuild = builderNewBuilder4.build();
            x.e(recentPlaceBuild, "build(...)");
            builderNewBuilder.setRecentPlace(recentPlaceBuild);
        }
        return builderNewBuilder.build();
    }

    public static Place j(com.waze.av.a.p pVar) {
        x.f(pVar, "<this>");
        Place.Builder builderNewBuilder = Place.newBuilder();
        builderNewBuilder.setAddress(E(pVar.b()));
        String strB = pVar.c().b();
        if (strB != null) {
            builderNewBuilder.setVenueContext(strB);
        }
        String strC = pVar.c().c();
        if (strC != null) {
            builderNewBuilder.setVenueId(strC);
        }
        String strE = pVar.c().e();
        if (strE != null) {
            builderNewBuilder.setName(strE);
        }
        String strF = pVar.c().f();
        if (strF != null) {
            builderNewBuilder.setRoutingContext(strF);
        }
        Integer numE = pVar.e();
        if (numE != null) {
            builderNewBuilder.setDbId(ec.of(numE.intValue()));
        }
        Boolean boolA = pVar.c().a();
        if (boolA != null) {
            builderNewBuilder.setIsResidential(com.google.v.o.of(boolA.booleanValue()));
        }
        builderNewBuilder.setPosition(com.waze.notifications.c.k.d(pVar.d()));
        builderNewBuilder.setUpdatedTimeSec(pVar.a());
        Place placeBuild = builderNewBuilder.build();
        x.e(placeBuild, "build(...)");
        return placeBuild;
    }

    public static Place k(com.waze.av.b.n nVar) {
        String strE;
        x.f(nVar, "<this>");
        boolean z = nVar instanceof com.waze.av.b.j;
        Place.Builder builderNewBuilder = Place.newBuilder();
        if (z) {
            strE = ((com.waze.av.b.j) nVar).i();
        } else if (nVar instanceof com.waze.av.b.k) {
            strE = ((com.waze.av.b.k) nVar).h();
        } else if (nVar instanceof com.waze.av.b.l) {
            strE = ((com.waze.av.b.l) nVar).f();
        } else {
            if (!(nVar instanceof com.waze.av.b.m)) {
                throw new h.i();
            }
            strE = ((com.waze.av.b.m) nVar).e().c().e();
        }
        String str = strE;
        if (str == null || str.length() == 0) {
            strE = nVar.e().c().e();
        }
        builderNewBuilder.setAddress(E(nVar.e().b()));
        String strB = nVar.e().c().b();
        if (strB != null) {
            builderNewBuilder.setVenueContext(strB);
        }
        String strC = nVar.e().c().c();
        if (strC != null) {
            builderNewBuilder.setVenueId(strC);
        }
        if (strE != null) {
            builderNewBuilder.setName(strE);
        }
        String strF = nVar.e().c().f();
        if (strF != null) {
            builderNewBuilder.setRoutingContext(strF);
        }
        Integer numE = nVar.e().e();
        if (numE != null) {
            builderNewBuilder.setDbId(ec.of(numE.intValue()));
        }
        Boolean boolA = nVar.e().c().a();
        if (boolA != null) {
            builderNewBuilder.setIsResidential(com.google.v.o.of(boolA.booleanValue()));
        }
        builderNewBuilder.setPosition(com.waze.notifications.c.k.d(nVar.e().d()));
        Place placeBuild = builderNewBuilder.build();
        x.e(placeBuild, "build(...)");
        return placeBuild;
    }

    public static PlaceKey l(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        boolean z = nVar instanceof com.waze.av.b.m;
        PlaceKey.Builder builderNewBuilder = PlaceKey.newBuilder();
        if (z) {
            builderNewBuilder.setType(PlaceKey.Type.None);
            builderNewBuilder.setDbId(-1);
            bt.a().f("Should never create PlaceKey from StandardPlace");
        } else if (nVar instanceof com.waze.av.b.k) {
            builderNewBuilder.setType(PlaceKey.Type.Favorite);
            builderNewBuilder.setDbId(((com.waze.av.b.k) nVar).a());
        } else if (nVar instanceof com.waze.av.b.l) {
            builderNewBuilder.setType(PlaceKey.Type.Recent);
            builderNewBuilder.setDbId(((com.waze.av.b.l) nVar).a());
        } else {
            if (!(nVar instanceof com.waze.av.b.j)) {
                throw new h.i();
            }
            builderNewBuilder.setType(PlaceKey.Type.Event);
            builderNewBuilder.setDbId(((com.waze.av.b.j) nVar).a());
        }
        PlaceKey placeKeyBuild = builderNewBuilder.build();
        x.e(placeKeyBuild, "build(...)");
        return placeKeyBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.waze.av.b.n m(com.waze.jni.protos.places.GenericPlace r21) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ac.e.m(com.waze.jni.protos.places.GenericPlace):com.waze.av.b.n");
    }

    public static int n(com.waze.av.b.n nVar) {
        Integer category;
        x.f(nVar, "<this>");
        int i2 = 2;
        if (!(nVar instanceof com.waze.av.b.l)) {
            boolean z = nVar instanceof com.waze.av.b.k;
            if (z && ((com.waze.av.b.k) nVar).g() != null) {
                return 2;
            }
            if (z) {
                AddressItem addressItemP = nVar.p();
                if (addressItemP == null || (category = addressItemP.getCategory()) == null) {
                    return 1;
                }
                return category.intValue();
            }
            boolean z2 = nVar instanceof com.waze.av.b.j;
            if (z2 && ((com.waze.av.b.j) nVar).f() == com.waze.av.b.d.f15944c) {
                return 7;
            }
            i2 = 99;
            if (z2) {
                return ((com.waze.av.b.j) nVar).f() != com.waze.av.b.d.f15945d ? 99 : 9;
            }
        }
        return i2;
    }

    public static com.waze.av.b.n o(com.waze.av.b.n nVar, com.waze.av.d.k kVar) {
        x.f(nVar, "<this>");
        x.f(kVar, "venue");
        if (nVar instanceof com.waze.av.b.j) {
            com.waze.av.b.j jVar = (com.waze.av.b.j) nVar;
            return com.waze.av.b.j.o(jVar, F(jVar.e(), kVar));
        }
        if (nVar instanceof com.waze.av.b.k) {
            com.waze.av.b.k kVar2 = (com.waze.av.b.k) nVar;
            return com.waze.av.b.k.i(kVar2, F(kVar2.e(), kVar));
        }
        if (nVar instanceof com.waze.av.b.l) {
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            return com.waze.av.b.l.h(lVar, F(lVar.e(), kVar));
        }
        if (!(nVar instanceof com.waze.av.b.m)) {
            throw new h.i();
        }
        com.waze.av.a.p pVarF = F(((com.waze.av.b.m) nVar).e(), kVar);
        x.f(pVarF, "wazeAddress");
        return new com.waze.av.b.m(pVarF);
    }

    public static AddressItem p(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        AddressItem addressItemP = nVar.p();
        return addressItemP == null ? B(nVar) : addressItemP;
    }

    public static AddressItem q(com.waze.av.b.n nVar, boolean z) {
        x.f(nVar, "<this>");
        com.waze.av.a.p pVarE = nVar.e();
        AddressItem addressItem = new AddressItem(pVarE.d().d(), pVarE.d().c(), pVarE.c().e(), pVarE.b().b(), pVarE.b().a(), pVarE.b().f(), pVarE.b().c(), pVarE.c().c(), pVarE.c().f());
        addressItem.setId(r(nVar));
        addressItem.setCategory(Integer.valueOf(n(nVar)));
        if (nVar instanceof com.waze.av.b.j) {
            addressItem.setType(true != v(nVar) ? 9 : 11);
            com.waze.av.b.j jVar = (com.waze.av.b.j) nVar;
            addressItem.setTitle(jVar.i());
            if (v(nVar)) {
                String strD = jVar.e().b().d();
                if (strD == null && (strD = jVar.e().c().e()) == null) {
                    strD = "";
                }
                addressItem.setAddress(strD);
            } else {
                String strE = jVar.e().c().e();
                if (strE == null) {
                    strE = "";
                }
                addressItem.setAddress(strE);
            }
            addressItem.setMeetingId(jVar.g());
            addressItem.setStartTime(String.valueOf(jVar.c()));
            addressItem.setIsValidate(jVar.n());
        } else if (nVar instanceof com.waze.av.b.k) {
            addressItem.setTitle(((com.waze.av.b.k) nVar).h());
            addressItem.setType(x(nVar) ? 1 : A(nVar) ? 3 : 5);
        } else if (nVar instanceof com.waze.av.b.l) {
            addressItem.setType(8);
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            if (lVar.f().length() > 0) {
                addressItem.setTitle(lVar.f());
            }
        }
        ed venueData = addressItem.getVenueData();
        if (venueData != null) {
            venueData.W(nVar.e().c().e());
            venueData.Q(nVar.e().c().b());
        }
        if (z) {
            com.waze.av.a.a aVarB = nVar.e().b();
            String address = addressItem.getAddress();
            x.e(address, "getAddress(...)");
            if (address.length() == 0) {
                String strH = com.waze.nightmode.e.h(aVarB.c(), aVarB.f(), aVarB.a(), aVarB.e(), aVarB.g());
                addressItem.setAddress(strH != null ? strH : "");
            }
            String title = addressItem.getTitle();
            x.e(title, "getTitle(...)");
            if (title.length() == 0) {
                addressItem.setTitle(addressItem.getAddress());
            }
        }
        return addressItem;
    }

    public static String r(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        if (nVar instanceof com.waze.av.b.m) {
            return t(-1, 0);
        }
        if (nVar instanceof com.waze.av.b.k) {
            return t(((com.waze.av.b.k) nVar).a(), 1);
        }
        if (nVar instanceof com.waze.av.b.l) {
            return t(((com.waze.av.b.l) nVar).a(), 2);
        }
        if (nVar instanceof com.waze.av.b.j) {
            return t(((com.waze.av.b.j) nVar).a(), 3);
        }
        throw new h.i();
    }

    public static String s(com.waze.av.b.n nVar, com.waze.shared_infra.o.a aVar) {
        x.f(nVar, "<this>");
        x.f(aVar, "stringProvider");
        String strF = nVar instanceof com.waze.av.b.l ? ((com.waze.av.b.l) nVar).f() : null;
        boolean zX = x(nVar);
        boolean zA = A(nVar);
        String strI = nVar instanceof com.waze.av.b.j ? ((com.waze.av.b.j) nVar).i() : strF;
        if (nVar instanceof com.waze.av.b.k) {
            strF = ((com.waze.av.b.k) nVar).h();
        }
        return com.waze.nightmode.e.j(zX, zA, strF, nVar.e().c().e(), strI, nVar.e().b().c(), nVar.e().b().f(), nVar.e().b().a(), nVar.e().b().e(), nVar.e().b().g(), aVar, 32);
    }

    public static String t(int i2, int i3) {
        return i2 + "|" + i3;
    }

    public static String u(com.waze.av.b.n nVar) {
        String strG;
        x.f(nVar, "<this>");
        if (nVar instanceof com.waze.av.b.k) {
            com.waze.av.b.k kVar = (com.waze.av.b.k) nVar;
            com.waze.av.b.i iVarF = kVar.f();
            com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
            int iOrdinal = iVarF.ordinal();
            if (iOrdinal == 0) {
                strG = G(kVar.e());
            } else if (iOrdinal == 1) {
                strG = "home";
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new h.i();
                }
                strG = G(kVar.e());
            } else {
                strG = "work";
            }
        } else {
            strG = nVar instanceof com.waze.av.b.j ? ((com.waze.av.b.j) nVar).g() : G(nVar.e());
        }
        return strG == null ? r(nVar) : strG;
    }

    public static boolean v(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        return (nVar instanceof com.waze.av.b.j) && ((com.waze.av.b.j) nVar).f() == com.waze.av.b.d.f15944c;
    }

    public static boolean w(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        return (nVar instanceof com.waze.av.b.j) && ((com.waze.av.b.j) nVar).f() == com.waze.av.b.d.f15945d;
    }

    public static boolean x(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        return (nVar instanceof com.waze.av.b.k) && ((com.waze.av.b.k) nVar).f() == com.waze.av.b.i.f15956b;
    }

    public static boolean y(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        if (!(nVar instanceof com.waze.av.b.j)) {
            return false;
        }
        com.waze.av.b.j jVar = (com.waze.av.b.j) nVar;
        return jVar.f() == com.waze.av.b.d.f15944c && !jVar.n();
    }

    public static boolean z(com.waze.av.b.n nVar) {
        x.f(nVar, "<this>");
        if (!(nVar instanceof com.waze.av.b.j)) {
            return false;
        }
        com.waze.av.b.j jVar = (com.waze.av.b.j) nVar;
        return jVar.f() == com.waze.av.b.d.f15944c && jVar.n();
    }

    private e() {
        throw null;
    }
}
