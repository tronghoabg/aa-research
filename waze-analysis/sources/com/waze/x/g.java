package com.waze.x;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.waze.R;
import com.waze.c.e.w;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.b.n;
import com.waze.z.a.c.i;
import com.waze.z.a.c.q;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import java.util.Iterator;
import kotlinx.coroutines.af;
import l.a.fn;
import l.a.fo;
import l.a.fp;
import l.a.pq;
import l.a.ps;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class g {
    public /* synthetic */ g(byte[] bArr) {
    }

    private static void a(String str, fn fnVar) {
        ax axVarA = ax.f40550a.a();
        pq pqVarNewBuilder = ps.newBuilder();
        fo foVarNewBuilder = fp.newBuilder();
        foVarNewBuilder.b(str);
        foVarNewBuilder.a(fnVar);
        pqVarNewBuilder.a(foVarNewBuilder.build());
        ps psVarBuild = pqVarNewBuilder.build();
        x.e(psVarBuild, "build(...)");
        o.l(axVarA, psVarBuild);
    }

    public static /* synthetic */ ab d(com.waze.z.a.c.d dVar, String str, h.g.a.a aVar, com.waze.z.a.c.d dVar2, h.g.a.a aVar2, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar3) {
        x.f(cVar, "<unused var>");
        x.f(dVar3, "cta");
        if (x.n(dVar3, dVar)) {
            a(str, fn.UPGRADE);
            aVar.invoke();
        } else if (x.n(dVar3, dVar2)) {
            a(str, fn.CANCEL);
            aVar2.invoke();
        }
        return ab.f48028a;
    }

    public static void e(final String str, final h.g.a.a aVar, final h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        x.f(str, "url");
        x.f(aVar, "onUpgrade");
        x.f(aVar2, "onCancel");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626646240);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626646240, i3, -1, "com.waze.deep_link.DeepLinkUpgradeDialog (DeepLinkUpgradeDialog.kt:59)");
            }
            int i5 = i3 & 14;
            ab abVar = ab.f48028a;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (p) new f(str, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            final com.waze.z.a.c.d dVar = new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DEEP_LINK_UPGRADE_BUTTON, composerStartRestartGroup, 0), n.e(null, null, null, 7), false, null, 12);
            final com.waze.z.a.c.d dVar2 = new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DEEP_LINK_UPGRADE_CANCEL, composerStartRestartGroup, 0), n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12);
            String strB = com.waze.ui.r.a.c.c.b(R.string.DEEP_LINK_UPGRADE_TITLE, composerStartRestartGroup, 0);
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.DEEP_LINK_UPGRADE_BODY, composerStartRestartGroup, 0);
            com.waze.z.a.c.h hVar = new com.waze.z.a.c.h(new com.waze.ui.ac.f(R.drawable.t3_account_error), null, i.f45844b, 14);
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(dVar, dVar2);
            boolean zChangedInstance = (i5 == 4) | composerStartRestartGroup.changedInstance(dVar) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(dVar2);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.z.a.c.g() { // from class: com.waze.x.e
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return g.d(dVar, str, aVar, dVar2, aVar2, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            q.j(strB, strB2, aVar3, hVar, (com.waze.z.a.c.g) objRememberedValue2, composerStartRestartGroup, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(str, aVar, aVar2, i2, 5, null));
        }
    }

    public static com.waze.design_components.a.a f(com.waze.design_components.a.d dVar, int i2) {
        x.f(dVar, "<this>");
        return new com.waze.design_components.a.a(i2, dVar.c(i2));
    }

    public static com.waze.design_components.b.e g(int i2) {
        com.waze.design_components.b.e eVar;
        com.waze.design_components.b.e[] eVarArrValues = com.waze.design_components.b.e.values();
        int length = eVarArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i3];
            if (eVar.a() == i2) {
                break;
            }
            i3++;
        }
        return eVar == null ? com.waze.design_components.b.e.f23312a : eVar;
    }

    public static com.waze.design_components.b.d h(int i2) {
        Object next;
        Iterator<E> it = com.waze.design_components.b.d.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.design_components.b.d) next).a() == i2) {
                break;
            }
        }
        com.waze.design_components.b.d dVar = (com.waze.design_components.b.d) next;
        return dVar == null ? com.waze.design_components.b.d.f23300a : dVar;
    }

    private g() {
        throw null;
    }
}
