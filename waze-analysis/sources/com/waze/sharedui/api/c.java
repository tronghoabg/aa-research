package com.waze.sharedui.api;

import android.media.AudioManager;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.datasource.cache.Cache;
import com.waze.R;
import com.waze.bw.c.d.cu;
import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.cx;
import com.waze.bw.c.d.cy;
import com.waze.bw.c.d.cz;
import com.waze.bw.c.d.da;
import com.waze.bw.c.d.db;
import com.waze.bw.c.d.dc;
import com.waze.bw.c.d.dd;
import com.waze.bw.c.d.di;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;
import h.g.b.x;
import i.b.l.cc;
import i.b.l.cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class c {
    public /* synthetic */ c() {
    }

    public static cc a() {
        cc ccVarNewBuilder = cd.newBuilder();
        x.e(ccVarNewBuilder, "newBuilder(...)");
        return ccVarNewBuilder;
    }

    public static void b(Cache cache) {
        x.f(cache, "<this>");
        if (cache.getKeys().isEmpty()) {
            return;
        }
        Set<String> keys = cache.getKeys();
        x.e(keys, "getKeys(...)");
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            cache.removeResource((String) it.next());
        }
    }

    public static boolean c(AudioManager audioManager) {
        x.f(audioManager, "<this>");
        return audioManager.getMode() != 0;
    }

    public static String d(cu cuVar) {
        String strG;
        String strE;
        x.f(cuVar, "<this>");
        String strC = cuVar.c();
        if ((strC == null || strC.length() == 0) && (((strG = cuVar.g()) == null || strG.length() == 0) && ((strE = cuVar.e()) == null || strE.length() == 0))) {
            return null;
        }
        List listI = h.a.i.i(cuVar.c(), cuVar.g(), cuVar.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        return h.a.i.aM(arrayList, ", ", null, null, 0, null, 62);
    }

    public static String e(cu cuVar, Composer composer) {
        String strF;
        String strD;
        x.f(cuVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-273013252, 0, -1, "com.waze.startstate.mobile.ui.formatStreetAddressOrNull (WazeUIAddressExtensions.kt:18)");
        }
        String strF2 = cuVar.f();
        if (strF2 == null || strF2.length() == 0 || (strD = cuVar.d()) == null || strD.length() == 0) {
            composer.startReplaceGroup(1330396882);
            composer.endReplaceGroup();
            strF = cuVar.f();
        } else {
            composer.startReplaceGroup(1330425929);
            if (com.waze.bz.a.j(composer)) {
                strF = cuVar.f() + " " + cuVar.d();
            } else {
                strF = cuVar.d() + " " + cuVar.f();
            }
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public static void f(cw cwVar, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        String strG;
        String strB;
        TextStyle textStyleB;
        boolean z;
        String strB2;
        com.waze.z.a.n nVar;
        List listD;
        x.f(cwVar, "drive");
        x.f(aVar, "onClick");
        x.f(aVar2, "onLongClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1529524051);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cwVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1529524051, i3, -1, "com.waze.startstate.mobile.ui.UpcomingDriveCell (UpcomingDriveCell.kt:37)");
            }
            int i5 = i3 & 14;
            PaddingValues paddingValuesM2748PaddingValues0680j_4 = PaddingKt.m2748PaddingValues0680j_4(16.0f);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1024558690, i5, -1, "com.waze.startstate.mobile.ui.getTitleText (UpcomingDriveCell.kt:78)");
            }
            if (cwVar.b() instanceof da) {
                composerStartRestartGroup.startReplaceGroup(-1704512865);
                composerStartRestartGroup.endReplaceGroup();
                strG = ((da) cwVar.b()).c();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1704473588);
                strG = i.g(cwVar.a(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (strG == null) {
                composerStartRestartGroup.startReplaceGroup(1053397952);
                strG = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNKNOWN_LOCATION, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1053397673);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1820386804, i5, -1, "com.waze.startstate.mobile.ui.getFirstDescriptionText (UpcomingDriveCell.kt:91)");
            }
            dd ddVarB = cwVar.b();
            if (ddVarB instanceof da) {
                composerStartRestartGroup.startReplaceGroup(1408915353);
                if (((da) cwVar.b()).d()) {
                    composerStartRestartGroup.startReplaceGroup(1409065796);
                    strB = i.g(cwVar.a(), composerStartRestartGroup, 0);
                    if (strB == null) {
                        composerStartRestartGroup.startReplaceGroup(-1340017974);
                        strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNKNOWN_LOCATION, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1340019586);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1408952212);
                    strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNVERIFIED_CALENDAR_EVENT_SUBTITLE, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (ddVarB instanceof db) {
                composerStartRestartGroup.startReplaceGroup(1409262274);
                if (((db) cwVar.b()).b() instanceof cx) {
                    composerStartRestartGroup.startReplaceGroup(1409313827);
                    strB = i.h(cwVar.a(), composerStartRestartGroup, 0);
                    if (strB == null) {
                        composerStartRestartGroup.startReplaceGroup(-1340009818);
                        strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNKNOWN_ROAD, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1340011585);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else if (((db) cwVar.b()).c() != null) {
                    composerStartRestartGroup.startReplaceGroup(1409483614);
                    String strG2 = i.g(((db) cwVar.b()).c(), composerStartRestartGroup, 0);
                    if (strG2 == null) {
                        composerStartRestartGroup.startReplaceGroup(-1340000950);
                        strG2 = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNKNOWN_LOCATION, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1340003027);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    strB = com.waze.ui.r.a.c.c.d(R.string.REWIRE_START_STATE_FUTURE_DRIVE_FROM_PS, new Object[]{strG2}, composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1409741379);
                    strB = i.h(cwVar.a(), composerStartRestartGroup, 0);
                    if (strB == null) {
                        composerStartRestartGroup.startReplaceGroup(-1339996026);
                        strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNKNOWN_ROAD, composerStartRestartGroup, 0);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1339997793);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1409880910);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_CELL_UNKNOWN_ROAD, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1130745836, i5, -1, "com.waze.startstate.mobile.ui.getFirstDescriptionTextStyle (UpcomingDriveCell.kt:159)");
            }
            if (!(cwVar.b() instanceof da) || ((da) cwVar.b()).d()) {
                composerStartRestartGroup.startReplaceGroup(620961746);
                textStyleB = com.waze.bz.a.h(composerStartRestartGroup).b();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(620875876);
                textStyleB = TextStyle.m10559copyp1EtxEg$default(com.waze.bz.a.h(composerStartRestartGroup).b(), com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            if (ComposerKt.isTraceInProgress()) {
                z = 1;
                ComposerKt.traceEventStart(-1425990136, i5, -1, "com.waze.startstate.mobile.ui.getSecondaryDescription (UpcomingDriveCell.kt:124)");
            } else {
                z = 1;
            }
            if (cwVar.b() instanceof dc) {
                composerStartRestartGroup.startReplaceGroup(-150415245);
                cz czVarB = ((dc) cwVar.b()).b();
                if (czVarB != null) {
                    composerStartRestartGroup.startReplaceGroup(-150345216);
                    if (czVarB instanceof cy) {
                        composerStartRestartGroup.startReplaceGroup(-150299863);
                        cy cyVar = (cy) czVarB;
                        String strB3 = cyVar.b();
                        String strA = cyVar.a();
                        Object[] objArr = new Object[2];
                        objArr[0] = strB3;
                        objArr[z] = strA;
                        strB2 = com.waze.ui.r.a.c.c.d(R.string.REWIRE_START_STATE_FUTURE_DRIVE_LEAVE_ARRIVE_PS_PS, objArr, composerStartRestartGroup);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (cwVar.c() == di.f18094c) {
                        composerStartRestartGroup.startReplaceGroup(-150014818);
                        strB2 = com.waze.ui.r.a.c.c.b(R.string.DRIVE_SUGGESTION_CARD_TRAFFIC_INFO_HEAVY, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-149895654);
                        composerStartRestartGroup.endReplaceGroup();
                        strB2 = null;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-149889702);
                    composerStartRestartGroup.endReplaceGroup();
                    strB2 = null;
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-149885734);
                composerStartRestartGroup.endReplaceGroup();
                strB2 = null;
            }
            if (strB2 == null) {
                composerStartRestartGroup.startReplaceGroup(-149836475);
                composerStartRestartGroup.endReplaceGroup();
                listD = h.a.i.h();
            } else {
                composerStartRestartGroup.startReplaceGroup(-149803894);
                com.waze.ui.ac.m mVar = new com.waze.ui.ac.m(strB2);
                int i6 = i3 & 14;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-347447155, i6, -1, "com.waze.startstate.mobile.ui.getSecondaryDescriptionTextColor (UpcomingDriveCell.kt:172)");
                }
                dd ddVarB2 = cwVar.b();
                dc dcVar = ddVarB2 instanceof dc ? (dc) ddVarB2 : null;
                if (((dcVar != null ? dcVar.b() : null) instanceof cx) && cwVar.c() == di.f18094c) {
                    nVar = com.waze.z.a.n.f46151b;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    nVar = com.waze.z.a.n.f46150a;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                listD = h.a.i.d(new com.waze.z.a.m(mVar, null, nVar, null, false, 26));
                composerStartRestartGroup.endReplaceGroup();
            }
            List list = listD;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            int i7 = com.waze.bw.c.d.g.f18116a;
            be.B(strG, modifier, com.waze.bw.c.d.g.a(), ComposableLambdaKt.rememberComposableLambda(1745191573, z, new com.waze.z.a.c.n(cwVar, 9), composerStartRestartGroup, 54), false, null, strB, list, textStyleB, false, paddingValuesM2748PaddingValues0680j_4, aVar, aVar2, composerStartRestartGroup, (i3 & 112) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | 48 | (i3 & 7168), DisplayStrings.DS_THANK_YOU_TITLE_ZERO_POINTS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(cwVar, modifier, aVar, aVar2, i2, 13, null));
        }
    }

    public /* synthetic */ c(byte[] bArr, byte[] bArr2) {
    }
}
