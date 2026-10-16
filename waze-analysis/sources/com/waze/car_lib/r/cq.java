package com.waze.car_lib.r;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class cq {
    public cq(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_QR_LOGIN_SCREEN_TITLE, new Object[0]), aVar.c(R.string.AAOS_QR_TOKEN_EXPIRED_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_QR_TOKEN_EXPIRED_REFRESH_BUTTON, new Object[0]), true), null, 32);
    }

    public static /* synthetic */ y j(com.waze.n.j jVar) {
        h.g.b.x.f(jVar, "builder");
        return new y(jVar);
    }

    public static void k(boolean z, com.waze.ui.r.a.c.b bVar, com.waze.as.a aVar, com.waze.ui.r.a.a.q qVar, com.waze.ui.r.a.e.a aVar2, h.g.a.p pVar, Composer composer, int i2) {
        boolean z2;
        com.waze.ui.r.a.c.b bVar2;
        com.waze.as.a aVar3;
        com.waze.ui.r.a.a.q qVar2;
        com.waze.ui.r.a.e.a aVar4;
        boolean zBooleanValue;
        com.waze.ui.r.a.c.b bVar3;
        com.waze.as.a aVar5;
        com.waze.ui.r.a.e.a aVar6;
        com.waze.ui.r.a.a.q qVar3;
        h.g.b.x.f(pVar, "content");
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1986196507);
        int i4 = i3 == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            int i5 = (-65535) & i4;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(642058210, 0, -1, "com.waze.compose.isWazeDarkMode (WazeDriverTheme.kt:38)");
                }
                org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
                int i6 = h.g.b.ar.f48106a;
                zBooleanValue = ((Boolean) SnapshotStateKt.collectAsState(((com.waze.nightmode.j) bVarC.a(new h.g.b.m(com.waze.nightmode.j.class), null, null)).a(), null, composerStartRestartGroup, 0, 1).getValue()).booleanValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                org.a.d.k.b bVarA = org.a.c.a.a(composerStartRestartGroup);
                org.a.b.b.d.f(composerStartRestartGroup);
                boolean zChanged = composerStartRestartGroup.changed((Object) null) | composerStartRestartGroup.changed(bVarA);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = bVarA.a(new h.g.b.m(com.waze.ui.r.a.c.b.class), null, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                bVar3 = (com.waze.ui.r.a.c.b) objRememberedValue;
                org.a.d.k.b bVarA2 = org.a.c.a.a(composerStartRestartGroup);
                org.a.b.b.d.f(composerStartRestartGroup);
                boolean zChanged2 = composerStartRestartGroup.changed((Object) null) | composerStartRestartGroup.changed(bVarA2);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = bVarA2.a(new h.g.b.m(com.waze.as.a.class), null, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                aVar5 = (com.waze.as.a) objRememberedValue2;
                org.a.d.k.b bVarA3 = org.a.c.a.a(composerStartRestartGroup);
                org.a.b.b.d.f(composerStartRestartGroup);
                boolean zChanged3 = composerStartRestartGroup.changed((Object) null) | composerStartRestartGroup.changed(bVarA3);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = bVarA3.a(new h.g.b.m(com.waze.ui.r.a.a.q.class), null, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                com.waze.ui.r.a.a.q qVar4 = (com.waze.ui.r.a.a.q) objRememberedValue3;
                org.a.d.k.b bVarA4 = org.a.c.a.a(composerStartRestartGroup);
                org.a.b.b.d.f(composerStartRestartGroup);
                boolean zChanged4 = composerStartRestartGroup.changed((Object) null) | composerStartRestartGroup.changed(bVarA4);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = bVarA4.a(new h.g.b.m(com.waze.ui.r.a.e.a.class), null, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                aVar6 = (com.waze.ui.r.a.e.a) objRememberedValue4;
                qVar3 = qVar4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                zBooleanValue = z;
                bVar3 = bVar;
                aVar5 = aVar;
                qVar3 = qVar;
                aVar6 = aVar2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1986196507, i5, -1, "com.waze.compose.WazeDriverTheme (WazeDriverTheme.kt:25)");
            }
            int i7 = i4 & 458752;
            boolean z3 = zBooleanValue;
            com.waze.ui.r.a.e.a aVar7 = aVar6;
            com.waze.ui.r.a.c.b bVar4 = bVar3;
            com.waze.ui.r.a.e.e.f(z3, bVar4, (com.waze.ui.r.a.e.b.a) SnapshotStateKt.collectAsState(aVar5.a(), null, composerStartRestartGroup, 0, 1).getValue(), qVar3, aVar7, pVar, composerStartRestartGroup, i7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bVar2 = bVar4;
            aVar4 = aVar7;
            z2 = z3;
            qVar2 = qVar3;
            aVar3 = aVar5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
            bVar2 = bVar;
            aVar3 = aVar;
            qVar2 = qVar;
            aVar4 = aVar2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.t.m(z2, bVar2, aVar3, qVar2, aVar4, pVar, i2, 1));
        }
    }

    public static /* synthetic */ com.waze.o.d.b.b.i l(com.waze.t.b.bw bwVar) {
        return new com.waze.o.d.b.b.i(com.waze.t.c.n.a(bwVar));
    }

    public boolean g() {
        throw null;
    }

    public String m() {
        throw null;
    }

    public /* synthetic */ cq() {
    }
}
