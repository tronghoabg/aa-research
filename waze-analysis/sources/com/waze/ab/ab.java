package com.waze.ab;

import android.content.Intent;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.waze.AlerterController$Alerter$Type;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.an.a.ae;
import com.waze.an.a.ag;
import com.waze.an.a.aj;
import com.waze.an.a.ak;
import com.waze.an.a.al;
import com.waze.an.a.am;
import com.waze.an.a.an;
import com.waze.an.a.ao;
import com.waze.an.c.af;
import com.waze.an.c.ah;
import com.waze.an.c.ai;
import com.waze.asks.at;
import com.waze.bc;
import com.waze.car_lib.ar;
import com.waze.config.ConfigValues;
import com.waze.gas.GasNativeManager;
import com.waze.navigate.AddressItem;
import com.waze.search.h.cd;
import com.waze.strings.DisplayStrings;
import com.waze.ui.l.ad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a.adl;
import l.a.adm;
import l.a.adn;
import l.a.adp;
import l.a.anx;
import l.a.any;
import l.a.anz;
import l.a.azz;
import l.a.bab;
import l.a.bae;
import l.a.bgl;
import l.a.bgm;
import l.a.bro;
import l.a.brp;
import l.a.brs;
import l.a.brt;
import l.a.brv;
import l.a.brw;
import l.a.brx;
import l.a.bry;
import l.a.brz;
import l.a.ca;
import l.a.cb;
import l.a.cj;
import l.a.ck;
import l.a.ud;
import l.a.xi;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ab {
    public static /* synthetic */ h.ab a(final com.waze.app_nav.hub.b.e eVar, h.g.a.a aVar, ManagedActivityResultLauncher managedActivityResultLauncher, Intent intent, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158818032, i2, -1, "com.waze.dialog.createSubmitLogsDialog.<anonymous>.<anonymous>.<anonymous> (SubmitLogsDialog.kt:76)");
            }
            boolean zChanged = composer.changed(aVar) | composer.changedInstance(eVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new h.g.a.a() { // from class: com.waze.ab.y
                    @Override // h.g.a.a
                    public final Object invoke() {
                        eVar.b(false);
                        ab.b();
                        return h.ab.f48028a;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(eVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.beacons.m(eVar, 4);
                composer.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue2;
            boolean zChangedInstance2 = composer.changedInstance(managedActivityResultLauncher) | composer.changedInstance(intent);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new ar(managedActivityResultLauncher, intent, 17, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            n(aVar2, aVar3, (h.g.a.a) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static h.ab b() {
        ConfigManager configManager = ConfigManager.getInstance();
        h.g.b.x.e(configManager, "getInstance(...)");
        bc.sendLogsAutoConfirm$default(configManager, null, 1, null);
        return h.ab.f48028a;
    }

    public static void c() {
        com.waze.app_nav.hub.b.c cVarA = com.waze.app_nav.hub.b.c.f15258a.a();
        String strB = ConfigValues.CONFIG_VALUE_HELP_ABOUT_DEBUG_LOGS.b();
        h.g.b.x.e(strB, "getValue(...)");
        z zVar = new z(0);
        h.g.b.x.f(cVarA, "popupManager");
        h.g.b.x.f(strB, "aboutUrl");
        h.g.b.x.f(zVar, "sendLogs");
        String str = "SubmitLogsDialog";
        cVarA.b(new com.waze.app_nav.hub.b.k(str, null, new ac(strB, zVar, 1), 6));
    }

    static h.ab d(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        n(aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static ud e(com.waze.ac.i iVar) {
        if (h.g.b.x.n(iVar, com.waze.ac.g.f13851a)) {
            return ud.PRIMARY;
        }
        if (h.g.b.x.n(iVar, com.waze.ac.h.f13852a)) {
            return ud.SECONDARY;
        }
        throw new h.i();
    }

    public static ck f(at atVar) {
        h.g.b.x.f(atVar, "<this>");
        com.waze.asks.h hVarA = atVar.a();
        cj cjVarNewBuilder = ck.newBuilder();
        cjVarNewBuilder.b(atVar.c());
        cjVarNewBuilder.d(p(hVarA));
        cjVarNewBuilder.c(o(hVarA));
        ck ckVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(ckVarBuild, "build(...)");
        return ckVarBuild;
    }

    public static brt g(com.waze.asks.f fVar) {
        h.g.b.x.f(fVar, "answer");
        brs brsVarNewBuilder = brt.newBuilder();
        brw brwVarNewBuilder = brx.newBuilder();
        com.waze.asks.g gVarB = fVar.b();
        com.waze.asks.h hVar = com.waze.asks.h.f15593a;
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        int iOrdinal = gVarB.ordinal();
        if (iOrdinal == 0) {
            brwVarNewBuilder.a(brv.WAZE_ASKS_ANSWER_YES);
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            brwVarNewBuilder.a(brv.WAZE_ASKS_ANSWER_NO);
        }
        brsVarNewBuilder.a(brwVarNewBuilder.build());
        brt brtVarBuild = brsVarNewBuilder.build();
        h.g.b.x.e(brtVarBuild, "build(...)");
        return brtVarBuild;
    }

    public static brz h(at atVar) {
        h.g.b.x.f(atVar, "<this>");
        bro broVarNewBuilder = brz.newBuilder();
        broVarNewBuilder.f(atVar.c());
        broVarNewBuilder.g(bry.FEEDBACK_ALERT);
        broVarNewBuilder.e(brp.FEEDBACK_ALERT_IS_THIS_ALERT_HELPFUL);
        broVarNewBuilder.d(p(atVar.a()));
        broVarNewBuilder.c(o(atVar.a()));
        Iterator it = atVar.g().iterator();
        while (it.hasNext()) {
            broVarNewBuilder.a(g((com.waze.asks.f) it.next()));
        }
        brz brzVarBuild = broVarNewBuilder.build();
        h.g.b.x.e(brzVarBuild, "build(...)");
        return brzVarBuild;
    }

    public static adp i(com.waze.an.e.a aVar, com.waze.an.c.k kVar, ad adVar) {
        adn adnVar;
        List listH;
        h.g.b.x.f(aVar, "<this>");
        h.g.b.x.f(kVar, "insightStateHolder");
        h.g.b.x.f(adVar, "insightCardState");
        adm admVarNewBuilder = adp.newBuilder();
        h.g.b.x.e(admVarNewBuilder, "newBuilder(...)");
        h.g.b.x.f(adVar, "<this>");
        if (!adVar.e()) {
            adnVar = adn.HIDDEN;
        } else if (adVar instanceof com.waze.ui.l.r) {
            adnVar = adn.COMPACT;
        } else if (adVar instanceof com.waze.ui.l.t) {
            adnVar = adn.EXTENDED;
        } else if (adVar instanceof com.waze.ui.l.x) {
            adnVar = adn.LABEL;
        } else if (adVar instanceof com.waze.ui.l.z) {
            adnVar = adn.MINI;
        } else if (adVar instanceof com.waze.ui.l.aa) {
            adnVar = adn.MINI_FULL;
        } else {
            if (!(adVar instanceof com.waze.ui.l.ab)) {
                throw new h.i();
            }
            adnVar = adn.REGULAR;
        }
        admVarNewBuilder.d(adnVar);
        h.g.b.x.f(kVar, "<this>");
        boolean z = kVar instanceof af;
        if (z) {
            af afVar = (af) kVar;
            List listE = ((com.waze.an.c.ac) afVar.b().d()).e();
            ArrayList arrayList = new ArrayList(h.a.i.q(listE, 10));
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.waze.an.c.y) it.next()).b().c() ? adl.PRIMARY : adl.SECONDARY);
            }
            listH = h.a.i.af(arrayList, ((com.waze.an.c.ac) afVar.b().d()).a() instanceof com.waze.an.c.z ? h.a.i.d(adl.CLOSE) : h.a.i.h());
        } else if (kVar instanceof com.waze.an.c.a.p) {
            ah ahVarB = ((ai) ((com.waze.an.c.a.p) kVar).f().d()).b();
            listH = (ahVarB != null ? ahVarB.c() : null) != null ? h.a.i.d(adl.CLOSE) : h.a.i.h();
        } else {
            if (!(kVar instanceof com.waze.an.c.j)) {
                throw new h.i();
            }
            listH = h.a.i.h();
        }
        admVarNewBuilder.a(listH);
        if (z) {
            r(admVarNewBuilder, ((af) kVar).c(aVar));
        } else if (kVar instanceof com.waze.an.c.a.p) {
            r(admVarNewBuilder, ((com.waze.an.c.a.p) kVar).m(aVar));
        } else {
            if (!(kVar instanceof com.waze.an.c.j)) {
                throw new h.i();
            }
            h.g.b.x.f(aVar, "<this>");
            r(admVarNewBuilder, com.waze.an.e.b.f14860a);
        }
        adp adpVarBuild = admVarNewBuilder.build();
        h.g.b.x.e(adpVarBuild, "build(...)");
        return adpVarBuild;
    }

    public static void j(com.waze.av.b.n nVar, com.waze.z.a.c.l lVar, com.waze.ui.ac.n nVar2, h.g.a.a aVar, h.g.a.p pVar, h.g.a.l lVar2, Composer composer, int i2) {
        int i3;
        Object jVar;
        int i4;
        MutableState mutableState;
        h.g.b.x.f(nVar, "genericPlace");
        h.g.b.x.f(lVar, "genericPlaceMenuOptionClicked");
        h.g.b.x.f(nVar2, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "dismiss");
        h.g.b.x.f(pVar, "bottomSheetFooterLinkClicked");
        h.g.b.x.f(lVar2, "iconSelector");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-938590458);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(nVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(nVar2) : composerStartRestartGroup.changedInstance(nVar2)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 65536 : 131072;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-938590458, i6, -1, "com.waze.menus.destination.DestinationOptionsBottomSheetContent (DestinationOptionsBottomSheetContent.kt:25)");
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.main_screen.ac.k(10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48);
            int i7 = i6 >> 6;
            int i8 = i7 & 14;
            String strD = com.waze.search.d.a.b.d(nVar2, composerStartRestartGroup, i8);
            boolean z = false;
            h.g.b.x.f(nVar, "<this>");
            List listI = com.waze.ac.e.x(nVar) ? h.a.i.i(com.waze.menus.a.a.f29638a, com.waze.menus.a.a.n, com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l) : com.waze.ac.e.A(nVar) ? h.a.i.i(com.waze.menus.a.a.f29639b, com.waze.menus.a.a.o, com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l) : nVar instanceof com.waze.av.b.k ? h.a.i.i(com.waze.menus.a.a.f29642e, com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l, com.waze.menus.a.a.m) : com.waze.ac.e.w(nVar) ? h.a.i.i(com.waze.menus.a.a.f29641d, com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l, com.waze.menus.a.a.f29647j, com.waze.menus.a.a.p) : com.waze.ac.e.z(nVar) ? h.a.i.i(com.waze.menus.a.a.f29646i, com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l, com.waze.menus.a.a.f29644g, com.waze.menus.a.a.v) : com.waze.ac.e.y(nVar) ? h.a.i.i(com.waze.menus.a.a.f29645h, com.waze.menus.a.a.f29644g, com.waze.menus.a.a.u) : nVar instanceof com.waze.av.b.l ? h.a.i.i(com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l, com.waze.menus.a.a.m) : h.a.i.i(com.waze.menus.a.a.f29643f, com.waze.menus.a.a.f29648k, com.waze.menus.a.a.f29649l);
            boolean zChangedInstance = ((i6 & 112) == 32 || ((i6 & 64) != 0 && composerStartRestartGroup.changedInstance(lVar))) | composerStartRestartGroup.changedInstance(nVar);
            if ((i6 & 7168) == 2048) {
                z = true;
            }
            boolean zChanged = composerStartRestartGroup.changed(mutableState2) | zChangedInstance | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                i4 = i8;
                jVar = new com.waze.z.a.c.j((h.g.a.p) lVar, (Object) nVar, (Object) aVar, (Object) mutableState2, 4);
                mutableState = mutableState2;
                composerStartRestartGroup.updateRememberedValue(jVar);
            } else {
                i4 = i8;
                jVar = objRememberedValue2;
                mutableState = mutableState2;
            }
            MutableState mutableState3 = mutableState;
            com.waze.ab.a.l.n(strD, listI, (h.g.a.l) jVar, lVar2, ComposableLambdaKt.rememberComposableLambda(-846706577, true, new com.waze.z.a.g.u(nVar, pVar, aVar, 6, (char[]) null), composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 7168) | 24576);
            String str = (String) mutableState3.getValue();
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(-1309848796);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1309848795);
                com.waze.menus.a.a aVar2 = (com.waze.menus.a.a) Enum.valueOf(com.waze.menus.a.a.class, str);
                boolean zChanged2 = composerStartRestartGroup.changed(mutableState3) | z;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                int i9 = 17;
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.car_lib.e.d(mutableState3, aVar, i9, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                h.g.a.a aVar3 = (h.g.a.a) objRememberedValue3;
                boolean zChanged3 = composerStartRestartGroup.changed(mutableState3);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new com.waze.car_lib.e.e(mutableState3, i9);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                l(nVar2, nVar, aVar2, lVar, aVar3, (h.g.a.a) objRememberedValue4, composerStartRestartGroup, ((i6 << 3) & 112) | i4 | ((i6 << 6) & 7168));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.menus.a.b(nVar, lVar, nVar2, aVar, pVar, lVar2, i2, 2));
        }
    }

    public static void k(String str, String str2, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(aVar, "onCancel");
        h.g.b.x.f(aVar2, "onRemove");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-287657270);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-287657270, i3, -1, "com.waze.menus.destination.PromptRemoveDestinationDialog (DestinationOptionClicked.kt:106)");
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.main_screen.ac.k(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1137730675);
                byte[] bArr = null;
                int i5 = 6;
                com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_REMOVE_BUTTON, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23358a, null, com.waze.design_components.button.e.f23350b, 2), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_CANCEL_BUTTON, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
                boolean z = (i3 & 7168) == 2048;
                boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if ((z | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.l.g(aVar2, aVar, i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                com.waze.z.a.c.g gVar = (com.waze.z.a.c.g) objRememberedValue2;
                com.waze.z.a.c.a aVar4 = aVar3;
                boolean zChanged = composerStartRestartGroup.changed(mutableState) | z2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.car_lib.e.d(mutableState, aVar, 16, bArr);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                com.waze.z.a.c.q.c(str, aVar4, gVar, (h.g.a.a) objRememberedValue3, null, ComposableLambdaKt.rememberComposableLambda(-1376438656, true, new com.waze.beacons.a.c(str2, 3), composerStartRestartGroup, 54), composerStartRestartGroup, 196608 | (i3 & 14), 16);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1136609064);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b((Object) str, (Object) str2, (Object) aVar, (Object) aVar2, i2, 10));
        }
    }

    public static void l(com.waze.ui.ac.n nVar, com.waze.av.b.n nVar2, com.waze.menus.a.a aVar, com.waze.z.a.c.l lVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String strB;
        String strF;
        h.g.b.x.f(nVar, "itemTitle");
        h.g.b.x.f(nVar2, "genericPlace");
        h.g.b.x.f(aVar, "destinationMenuOption");
        h.g.b.x.f(lVar, "genericPlaceMenuOptionClicked");
        h.g.b.x.f(aVar2, "onDismiss");
        h.g.b.x.f(aVar3, "onCancelled");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-458691613);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(nVar) : composerStartRestartGroup.changedInstance(nVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(nVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(aVar.ordinal()) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(lVar) : composerStartRestartGroup.changedInstance(lVar)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 65536 : 131072;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-458691613, i5, -1, "com.waze.menus.destination.DestinationOptionClicked (DestinationOptionClicked.kt:55)");
            }
            int i6 = i5 >> 3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1068533208, i6 & 126, -1, "com.waze.menus.destination.promptDialogTitleStr (DestinationOptionClicked.kt:79)");
            }
            if (com.waze.ac.e.x(nVar2)) {
                composerStartRestartGroup.startReplaceGroup(363234361);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_TITLE_HOME, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (com.waze.ac.e.A(nVar2)) {
                composerStartRestartGroup.startReplaceGroup(363237401);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_TITLE_WORK, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (aVar == com.waze.menus.a.a.m || (nVar2 instanceof com.waze.av.b.l)) {
                composerStartRestartGroup.startReplaceGroup(363243418);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_TITLE_DRIVE, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (nVar2 instanceof com.waze.av.b.k) {
                composerStartRestartGroup.startReplaceGroup(363247386);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_TITLE_SAVED, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (com.waze.ac.e.w(nVar2)) {
                composerStartRestartGroup.startReplaceGroup(363250908);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_TITLE_PLANNED, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (com.waze.ac.e.v(nVar2)) {
                composerStartRestartGroup.startReplaceGroup(363254561);
                strB = com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_TITLE_EVENT_SINGLE, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(363257313);
                String strValueOf = String.valueOf(com.waze.ui.r.a.c.c.b(R.string.REMOVE, composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                strB = strValueOf.concat("?");
            }
            String str = strB;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            int i7 = i5 & 126;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-156150964, i7, -1, "com.waze.menus.destination.promptDialogTitleContent (DestinationOptionClicked.kt:67)");
            }
            if (nVar2 instanceof com.waze.av.b.j) {
                composerStartRestartGroup.startReplaceGroup(262784284);
                strF = com.waze.search.d.a.b.d(nVar, composerStartRestartGroup, i5 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(262786264);
                composerStartRestartGroup.endReplaceGroup();
                strF = cd.f(nVar2.e().b());
            }
            String str2 = strF;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean zChangedInstance = ((i5 & 7168) == 2048 || ((i5 & 4096) != 0 && composerStartRestartGroup.changedInstance(lVar))) | ((i5 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(nVar2);
            boolean z = (57344 & i5) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.ads.c.b bVar = new com.waze.ads.c.b(lVar, aVar, nVar2, aVar2, 6);
                composerStartRestartGroup.updateRememberedValue(bVar);
                objRememberedValue = bVar;
            }
            composer2 = composerStartRestartGroup;
            k(str, str2, aVar3, (h.g.a.a) objRememberedValue, composer2, (i5 >> 9) & DisplayStrings.DS_TAP_TO_VERIFY);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.menus.a.b(nVar, nVar2, aVar, lVar, aVar2, aVar3, i2, 0));
        }
    }

    public static void m(List list, List list2, boolean z, int i2) {
        h.g.b.x.f(list, "items");
        h.g.b.x.f(list2, "models");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AddressItem addressItem = (AddressItem) it.next();
            if (addressItem.getType() == i2) {
                list2.add(new com.waze.menus.a(addressItem));
                if (z) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void n(final h.g.a.a r40, final h.g.a.a r41, final h.g.a.a r42, androidx.compose.runtime.Composer r43, final int r44) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ab.ab.n(h.g.a.a, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int):void");
    }

    private static long o(com.waze.asks.h hVar) {
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        switch (hVar.ordinal()) {
            case 0:
                return com.waze.alerters.k.f14291a.a();
            case 1:
                return com.waze.alerters.k.f14292b.a();
            case 2:
                return com.waze.alerters.k.f14295e.a();
            case 3:
                return com.waze.alerters.k.f14298h.a();
            case 4:
                return com.waze.alerters.k.f14297g.a();
            case 5:
                return com.waze.alerters.k.f14294d.a();
            case 6:
                return com.waze.alerters.k.f14293c.a();
            case 7:
                return com.waze.alerters.k.f14299i.a();
            case 8:
                return com.waze.alerters.j.f14280b.a();
            case 9:
                return com.waze.alerters.j.f14281c.a();
            case 10:
                return com.waze.alerters.j.f14289k.a();
            case 11:
                return com.waze.alerters.j.f14288j.a();
            case 12:
                return com.waze.alerters.j.m.a();
            case 13:
                return com.waze.alerters.j.n.a();
            case 14:
                return com.waze.alerters.j.f14290l.a();
            case 15:
                return com.waze.alerters.j.f14286h.a();
            case 16:
                return com.waze.alerters.j.f14285g.a();
            case 17:
                return com.waze.alerters.j.f14284f.a();
            case 18:
                return com.waze.alerters.j.f14287i.a();
            default:
                throw new h.i();
        }
    }

    private static long p(com.waze.asks.h hVar) {
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        switch (hVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return com.waze.alerters.a.k.b(AlerterController$Alerter$Type.PERMANENT_HAZARD);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return com.waze.alerters.a.k.b(AlerterController$Alerter$Type.CAMERA);
            default:
                throw new h.i();
        }
    }

    private static bab q(com.waze.an.e.h hVar) {
        bae baeVar;
        azz azzVarNewBuilder = bab.newBuilder();
        h.g.b.x.e(azzVarNewBuilder, "newBuilder(...)");
        azzVarNewBuilder.b(hVar.a().c());
        ao aoVarB = hVar.a().b();
        if (aoVarB instanceof an) {
            baeVar = bae.SEGMENT_TYPE_TRAFFIC;
        } else if (aoVarB instanceof am) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_SPEED_BUMPS;
        } else if (aoVarB instanceof com.waze.an.a.ai) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_SHARP_CURVES;
        } else if (aoVarB instanceof ak) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_HOV_LANE_CAMERAS;
        } else if (aoVarB instanceof com.waze.an.a.ah) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_CARPOOL_LANE_CAMERAS;
        } else if (aoVarB instanceof ag) {
            baeVar = bae.SEGMENT_TYPE_GROUPED_BUS_LANE_CAMERAS;
        } else if (aoVarB instanceof aj) {
            baeVar = bae.SEGMENT_TYPE_ENFORCEMENT_ZONE;
        } else if (aoVarB instanceof com.waze.an.a.af) {
            baeVar = bae.SEGMENT_TYPE_AVERAGE_SPEED_ZONE;
        } else {
            if (!(aoVarB instanceof al)) {
                throw new h.i();
            }
            baeVar = bae.SEGMENT_TYPE_SCHOOL_ZONE;
        }
        azzVarNewBuilder.c(baeVar);
        List<com.waze.an.a.m> listB = hVar.b();
        ArrayList arrayList = new ArrayList(h.a.i.q(listB, 10));
        for (com.waze.an.a.m mVar : listB) {
            cj cjVarNewBuilder = ck.newBuilder();
            cjVarNewBuilder.a(mVar.b());
            cjVarNewBuilder.b(mVar.d());
            cjVarNewBuilder.c(mVar.a());
            cjVarNewBuilder.d(mVar.c().getValueForStats());
            ck ckVarBuild = cjVarNewBuilder.build();
            h.g.b.x.e(ckVarBuild, "build(...)");
            arrayList.add(ckVarBuild);
        }
        azzVarNewBuilder.a(arrayList);
        bab babVarBuild = azzVarNewBuilder.build();
        h.g.b.x.e(babVarBuild, "build(...)");
        return babVarBuild;
    }

    private static void r(adm admVar, com.waze.an.e.i iVar) {
        any anyVar;
        if (iVar instanceof com.waze.an.e.c) {
            ca caVarNewBuilder = cb.newBuilder();
            h.g.b.x.e(caVarNewBuilder, "newBuilder(...)");
            com.waze.j jVarA = ((com.waze.an.e.c) iVar).a();
            h.g.b.x.f(jVarA, "<this>");
            cj cjVarNewBuilder = ck.newBuilder();
            h.g.b.x.e(cjVarNewBuilder, "newBuilder(...)");
            cjVarNewBuilder.a(jVarA.a());
            cjVarNewBuilder.d(jVarA.e().getValueForStats());
            cjVarNewBuilder.c(jVarA.b());
            cjVarNewBuilder.b(jVarA.f().c());
            Long lH = h.n.o.h(jVarA.f().b());
            if (lH != null) {
                cjVarNewBuilder.a(lH.longValue());
            }
            ck ckVarBuild = cjVarNewBuilder.build();
            h.g.b.x.e(ckVarBuild, "build(...)");
            caVarNewBuilder.a(ckVarBuild);
            cb cbVarBuild = caVarNewBuilder.build();
            h.g.b.x.e(cbVarBuild, "build(...)");
            admVar.b(cbVarBuild);
            return;
        }
        if (!(iVar instanceof com.waze.an.e.e)) {
            if (iVar instanceof com.waze.an.e.f) {
                bgl bglVarNewBuilder = bgm.newBuilder();
                h.g.b.x.e(bglVarNewBuilder, "newBuilder(...)");
                bgm bgmVarBuild = bglVarNewBuilder.build();
                h.g.b.x.e(bgmVarBuild, "build(...)");
                admVar.g(bgmVarBuild);
                return;
            }
            if (iVar instanceof com.waze.an.e.d) {
                admVar.f(q(((com.waze.an.e.d) iVar).a()));
                return;
            } else if (iVar instanceof com.waze.an.e.h) {
                admVar.f(q((com.waze.an.e.h) iVar));
                return;
            } else {
                if (!h.g.b.x.n(iVar, com.waze.an.e.b.f14860a)) {
                    throw new h.i();
                }
                admVar.c(xi.newBuilder().build());
                return;
            }
        }
        com.waze.an.e.e eVar = (com.waze.an.e.e) iVar;
        anx anxVarNewBuilder = anz.newBuilder();
        h.g.b.x.e(anxVarNewBuilder, "newBuilder(...)");
        anxVarNewBuilder.a(eVar.b());
        ae aeVarA = eVar.a();
        ae aeVar = ae.f14545a;
        switch (aeVarA.ordinal()) {
            case 0:
                anyVar = any.WAZE_ASK;
                break;
            case 1:
            case 7:
                anyVar = any.REPORT;
                break;
            case 2:
                anyVar = any.TURN_ON_YOUR_HEADLIGHTS;
                break;
            case 3:
                anyVar = any.ECO_REGULATION;
                break;
            case 4:
                anyVar = any.GTW_REROUTE_SUGGESTION;
                break;
            case 5:
                anyVar = any.NETWORK_ISSUE;
                break;
            case 6:
                anyVar = any.CONVERSATION_FEEDBACK;
                break;
            case 8:
                anyVar = any.INSIGHT_FEEDBACK;
                break;
            case 9:
                anyVar = any.LIVE_MATCH;
                break;
            case 10:
                anyVar = any.GPS_ISSUE;
                break;
            case 11:
                anyVar = any.NOTIFICATION_TYPE_UNSPECIFIED;
                break;
            case 12:
                anyVar = any.MULTI_ASK;
                break;
            default:
                throw new h.i();
        }
        anxVarNewBuilder.b(anyVar);
        anz anzVarBuild = anxVarNewBuilder.build();
        h.g.b.x.e(anzVarBuild, "build(...)");
        admVar.e(anzVarBuild);
    }
}
