package com.waze.ui.r.a.d;

import androidx.compose.material.SwitchColors;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.waze.R;
import com.waze.ab.ac;
import com.waze.ab.o;
import com.waze.app_nav.hub.b.k;
import com.waze.navigate.f;
import com.waze.uid.UidModel;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {
    public static final Modifier a(Modifier modifier, c cVar, Integer num) {
        x.f(modifier, "<this>");
        x.f(cVar, "uiTestTag");
        return modifier.then(new a(cVar, num));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, c cVar) {
        Modifier modifierA;
        x.f(modifier, "<this>");
        return (cVar == null || (modifierA = a(modifier, cVar, null)) == null) ? modifier : modifierA;
    }

    public static final SwitchColors d(SwitchDefaults switchDefaults, Composer composer, int i2) {
        x.f(switchDefaults, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(468378470, i2, -1, "com.waze.ui.mobile.infra.theme.colors.wazeColors (WazeComponentColors.kt:7)");
        }
        SwitchColors switchColorsM4228colorsSQMK_m0 = switchDefaults.m4228colorsSQMK_m0(com.waze.bz.a.d(composer, 6).G(), com.waze.bz.a.d(composer, 6).E(), 0.0f, com.waze.bz.a.d(composer, 6).r(), com.waze.bz.a.d(composer, 6).y(), 0.0f, com.waze.bz.a.d(composer, 6).s(), com.waze.bz.a.d(composer, 6).y(), com.waze.bz.a.d(composer, 6).s(), com.waze.bz.a.d(composer, 6).y(), composer, 0, SwitchDefaults.$stable | (i2 & 14), 36);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColorsM4228colorsSQMK_m0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final k e(h.g.a.a aVar, h.g.a.a aVar2) {
        x.f(aVar, "onExitCallback");
        x.f(aVar2, "onCancelCallback");
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        o oVar = new o();
        oVar.Q(aVarA.c(R.string.TURN_OFF, new Object[0]));
        oVar.P(aVarA.c(R.string.SURE_YOU_WANNA_SHUT_DOWNQ, new Object[0]));
        oVar.f13808a = new f(aVar, aVar2, 7, null);
        oVar.M(aVarA.c(R.string.TURN_OFF, new Object[0]));
        oVar.N(aVarA.c(R.string.CANCEL, new Object[0]));
        ac acVar = new ac(oVar, aVar2, 2);
        return new k("ExitWazeDialog", 0 == true ? 1 : 0, acVar, 6);
    }

    public static final boolean f(UidModel uidModel) {
        x.f(uidModel, "<this>");
        return uidModel.getInstallParameters().community == null;
    }
}
