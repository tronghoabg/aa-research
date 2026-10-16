package com.waze.car_lib.r;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class cr {
    public cr(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        new com.waze.car_lib.p.dg(aVar.c(R.string.QR_LOGIN_TITLE, new Object[0]), aVar.c(R.string.AAOS_QR_LOGIN_WAIT_FOR_MOBILE_SCREEN_TITLE, new Object[0]) + "\n" + aVar.c(R.string.AAOS_QR_LOGIN_WAIT_FOR_MOBILE_SCREEN_MESSAGE, new Object[0]), Integer.valueOf(R.drawable.launch_icon_64px), false, null, null, 56);
    }

    public static /* synthetic */ ak c(com.waze.n.e eVar) {
        h.g.b.x.f(eVar, "builder");
        return new ak(eVar);
    }

    public static void d(boolean z, com.waze.ui.r.a.c.b bVar, com.waze.ui.r.a.a.q qVar, com.waze.ui.r.a.e.a aVar, h.g.a.p pVar, Composer composer, int i2) {
        boolean z2;
        com.waze.ui.r.a.c.b bVar2;
        com.waze.ui.r.a.a.q qVar2;
        com.waze.ui.r.a.e.a aVar2;
        h.g.b.x.f(pVar, "content");
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1315621180);
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
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i5 = i4 & (-8191);
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                z = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
                int i6 = h.g.b.ar.f48106a;
                bVar = (com.waze.ui.r.a.c.b) bVarC.a(new h.g.b.m(com.waze.ui.r.a.c.b.class), null, null);
                qVar = (com.waze.ui.r.a.a.q) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.ui.r.a.a.q.class), null, null);
                aVar = (com.waze.ui.r.a.e.a) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.ui.r.a.e.a.class), null, null);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            qVar2 = qVar;
            aVar2 = aVar;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1315621180, i5, -1, "com.waze.compose.WazeUIDTheme (WazeUIDTheme.kt:22)");
            }
            int i7 = 384 | ((i5 << 3) & 458752);
            boolean z3 = z;
            com.waze.ui.r.a.c.b bVar3 = bVar;
            com.waze.ui.r.a.e.e.f(z3, bVar3, com.waze.ui.r.a.e.b.a.f43360b, qVar2, aVar2, pVar, composerStartRestartGroup, i7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            bVar2 = bVar3;
            z2 = z3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
            bVar2 = bVar;
            qVar2 = qVar;
            aVar2 = aVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.l.h(z2, bVar2, qVar2, aVar2, pVar, i2, 3));
        }
    }

    public /* synthetic */ cr(byte[] bArr) {
    }

    private cr() {
        throw null;
    }
}
