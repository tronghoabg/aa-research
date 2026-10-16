package com.waze.main_screen.r.a;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.authentication.at;
import com.waze.av.a.o;
import com.waze.av.b.h;
import com.waze.bw.b.a.j;
import com.waze.main_screen.u.ab;
import com.waze.main_screen.u.y;
import com.waze.ui.u.aa;
import com.waze.ui.u.ac;
import com.waze.ui.u.ad;
import com.waze.ui.u.ag;
import com.waze.ui.u.ah;
import com.waze.ui.u.ai;
import com.waze.ui.u.u;
import com.waze.ui.u.v;
import com.waze.ui.u.w;
import com.waze.ui.u.x;
import h.g.a.l;
import h.g.a.p;
import h.i;
import java.util.Iterator;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {
    public static final /* synthetic */ y b(ag agVar) {
        ag agVar2 = ag.f43430a;
        j jVar = j.f17696a;
        int iOrdinal = agVar.ordinal();
        if (iOrdinal == 0) {
            return y.f27762b;
        }
        if (iOrdinal == 1) {
            return y.f27761a;
        }
        throw new i();
    }

    public static final /* synthetic */ ab c(ad adVar) {
        if (adVar instanceof ac) {
            return ab.f27658a;
        }
        if (adVar instanceof aa) {
            return ab.f27659b;
        }
        if (adVar instanceof com.waze.ui.u.ab) {
            return ab.f27660c;
        }
        throw new i();
    }

    public static final /* synthetic */ com.waze.shared_infra.h.c d(v vVar) {
        return new com.waze.shared_infra.h.c(vVar.a(), vVar.b());
    }

    public static final /* synthetic */ ad e(com.waze.av.b.c cVar) {
        if (cVar instanceof com.waze.av.b.a) {
            return new aa(((com.waze.av.b.a) cVar).d());
        }
        if (cVar instanceof com.waze.av.b.b) {
            return ac.f43423a;
        }
        if (cVar == null) {
            return com.waze.ui.u.ab.f43422a;
        }
        throw new i();
    }

    public static final /* synthetic */ ah f(com.waze.main_screen.u.a aVar) {
        h hVar;
        String str;
        Object next;
        x xVar = null;
        if (aVar.c() != null) {
            Iterator it = aVar.b().c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long jA = ((h) next).a();
                Long lC = aVar.c();
                if (lC != null && jA == lC.longValue()) {
                    break;
                }
            }
            hVar = (h) next;
        } else {
            hVar = null;
        }
        com.waze.shared_infra.h.c cVarD = aVar.b().a().d();
        v vVar = new v(cVarD.c(), cVarD.d());
        String strB = aVar.b().a().b().b();
        String strA = aVar.b().a().b().a();
        String strF = aVar.b().a().b().f();
        String strC = aVar.b().a().b().c();
        String strE = aVar.b().a().b().e();
        String strG = aVar.b().a().b().g();
        o oVarC = aVar.b().a().c();
        String strC2 = oVarC.c();
        String strE2 = oVarC.e();
        u uVar = new u(strB, strA, strF, strC, strE, strG, (strC2 == null || (str = strE2) == null || str.length() == 0) ? null : new ai(strC2, strE2, oVarC.d()));
        if (hVar instanceof com.waze.av.b.e) {
            xVar = w.f43477a;
        } else if (hVar instanceof com.waze.av.b.g) {
            xVar = com.waze.ui.u.y.f43479a;
        } else if (hVar instanceof com.waze.av.b.f) {
            xVar = new x(((com.waze.av.b.f) hVar).d());
        } else if (hVar != null) {
            throw new i();
        }
        return new ah(uVar, vVar, xVar);
    }

    public static final com.waze.sound.e.j g(c cVar, Composer composer, int i2) {
        h.g.b.x.f(cVar, "notitficationMessageStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1123233579, i2, -1, "com.waze.main_screen.notification_message.presentation.rememberNotificationMessageState (NotificationMessage.kt:61)");
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(cVar)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new com.waze.sound.e.j(cVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        com.waze.sound.e.j jVar = (com.waze.sound.e.j) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jVar;
    }

    public static final void h(Modifier modifier, com.waze.sound.e.j jVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(jVar, "notificationMessageState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1879378371);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(jVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1879378371, i3, -1, "com.waze.main_screen.notification_message.presentation.NotificationMessage (NotificationMessage.kt:33)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(jVar.i(), null, composerStartRestartGroup, 0, 1);
            String strI = i(stateCollectAsState);
            int i5 = i3 & 112;
            boolean zChanged = (i5 == 32) | composerStartRestartGroup.changed(stateCollectAsState);
            a aVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || aVarRememberedValue == Composer.Companion.getEmpty()) {
                aVarRememberedValue = new a(jVar, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(aVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(strI, (p<? super af, ? super h.c.e<? super h.ab>, ? extends Object>) aVarRememberedValue, composerStartRestartGroup, 0);
            String strI2 = i(stateCollectAsState);
            if (strI2 == null) {
                composerStartRestartGroup.startReplaceGroup(632990491);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(632990492);
                int iM11011getCentere0LSkKk = TextAlign.Companion.m11011getCentere0LSkKk();
                TextStyle textStyleI = com.waze.bz.a.h(composerStartRestartGroup).i();
                long jM = com.waze.bz.a.d(composerStartRestartGroup, 0).m();
                Modifier modifierThen = com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).c(), null, 2, null), 0.0f, 2.0f, 0.0f, 2.0f, 5, null), com.waze.ui.r.a.d.c.cJ, null).then(modifier);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new at(jVar, 19);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer2 = composerStartRestartGroup;
                TextKt.m4275Text4IGK_g(strI2, OnRemeasuredModifierKt.onSizeChanged(modifierThen, (l) objRememberedValue), jM, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m11004boximpl(iM11011getCentere0LSkKk), 0L, 0, false, 0, 0, (l<? super TextLayoutResult, h.ab>) null, textStyleI, composer2, 0, 0, 65016);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(modifier, jVar, i2, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(State state) {
        return (String) state.getValue();
    }
}
