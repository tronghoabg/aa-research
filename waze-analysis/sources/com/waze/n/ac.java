package com.waze.n;

import android.os.Bundle;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.fragment.compose.FragmentStateKt;
import com.waze.ad.a.j;
import com.waze.asks.ad;
import com.waze.reports.di;
import com.waze.reports.dr;
import com.waze.reports_v2.presentation.a.at;
import com.waze.strings.DisplayStrings;
import e.a.cn;
import e.a.cp;
import e.a.cq;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f30643a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f30644b;

    private ac() {
    }

    public static ab k(e.a.i iVar) {
        return (ab) ab.newStub(new ao(1), iVar);
    }

    public static cq l() {
        cq cqVarA;
        cq cqVar = f30644b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (ac.class) {
            cqVarA = f30644b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("com.waze.clientevent.WazeAppEventService", "reportClientMetricStat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(ai.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ak.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f30644b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq m() {
        cq cqVarA;
        cq cqVar = f30643a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (ac.class) {
            cqVarA = f30643a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("com.waze.clientevent.WazeAppEventService", "reportEvents"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(ae.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ag.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f30643a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static void n(Modifier modifier, final com.waze.reports_v2.presentation.a.at atVar, final h.g.a.a aVar, final h.g.a.l lVar, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        h.g.b.x.f(aVar, "onClose");
        h.g.b.x.f(lVar, "onLaterReport");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-64678063);
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(atVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-64678063, i3, -1, "com.waze.closure.ui.ClosureEmptyState (ClosureEmptyState.kt:35)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.c.e.a.a(mutableState, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 48);
            Modifier modifierSafeContentPadding = WindowInsetsPadding_androidKt.safeContentPadding(BackgroundKt.m1972backgroundbw27NRU$default(modifier2, com.waze.bz.a.d(composerStartRestartGroup, 0).h(), null, 2, null));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(atVar) | ((i3 & 7168) == 2048) | ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                h.g.a.l lVar2 = new h.g.a.l() { // from class: com.waze.closure.d.a
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        di diVarL;
                        dr drVar = (dr) obj;
                        x.f(drVar, "reportMenu");
                        mutableState.setValue(drVar);
                        j.s(drVar, new ad(drVar, 10));
                        drVar.t();
                        drVar.w(new c(aVar, lVar, drVar));
                        drVar.x();
                        at atVar2 = atVar;
                        if (atVar2 != null && (diVarL = drVar.l()) != null) {
                            diVarL.M(atVar2);
                        }
                        di diVarL2 = drVar.l();
                        if (diVarL2 != null) {
                            diVarL2.w = new d(managedActivityResultLauncherRememberLauncherForActivityResult);
                        }
                        return ab.f48028a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(lVar2);
                objRememberedValue3 = lVar2;
            }
            composerStartRestartGroup.startReplaceableGroup(1765406104);
            AndroidFragmentKt.AndroidFragment(dr.class, modifierSafeContentPadding, FragmentStateKt.rememberFragmentState(composerStartRestartGroup, 0), Bundle.EMPTY, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(modifier, atVar, aVar, lVar, i2, 0));
        }
    }

    public static kotlinx.coroutines.b.k o(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        kotlinx.coroutines.b.k kVarK = fVar.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        return kotlinx.coroutines.b.ai.y(kVarK);
    }

    public static ch p(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        ch chVarL = fVar.l();
        h.g.b.x.e(chVarL, "getStateFlow(...)");
        return chVarL;
    }

    public static void q(com.waze.config.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        fVar.d(Long.valueOf(((Number) fVar.b()).longValue() + 1));
    }

    public static com.waze.config.h r() {
        return com.waze.config.h.f22637a.a();
    }

    public /* synthetic */ ac(byte[] bArr, byte[] bArr2) {
    }
}
