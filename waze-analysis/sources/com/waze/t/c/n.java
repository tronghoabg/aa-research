package com.waze.t.c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.waze.R;
import com.waze.a.z;
import com.waze.c.e.t;
import com.waze.car_lib.screens.at;
import com.waze.strings.DisplayStrings;
import com.waze.t.b.ba;
import com.waze.t.b.bo;
import com.waze.t.b.bp;
import com.waze.t.b.bq;
import com.waze.t.b.br;
import com.waze.t.b.bv;
import com.waze.t.b.bw;
import com.waze.ui.f.ab;
import com.waze.ui.f.ad;
import com.waze.ui.f.ae;
import com.waze.ui.f.af;
import com.waze.ui.f.ag;
import com.waze.ui.f.ah;
import com.waze.ui.f.ai;
import com.waze.ui.f.ak;
import com.waze.ui.f.p;
import com.waze.ui.f.w;
import com.waze.ui.f.y;
import com.waze.z.a.c.q;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class n {
    public /* synthetic */ n(byte[] bArr) {
    }

    public static ak a(bw bwVar) {
        p pVar;
        x.f(bwVar, "<this>");
        if (bwVar instanceof bv) {
            return ad.f42276a;
        }
        if (bwVar instanceof br) {
            return new ae(((br) bwVar).a());
        }
        if (bwVar instanceof bq) {
            bq bqVar = (bq) bwVar;
            if (bqVar.c() == null) {
                return ah.f42280a;
            }
            String strA = bqVar.a().a();
            if (strA == null) {
                strA = "";
            }
            return new ai(strA);
        }
        if (bwVar instanceof bp) {
            ba baVarA = ((bp) bwVar).a();
            x.f(baVarA, "<this>");
            ba baVar = ba.f40709a;
            com.waze.t.b.ah ahVar = com.waze.t.b.ah.f40680a;
            int iOrdinal = baVarA.ordinal();
            if (iOrdinal == 0) {
                return af.f42278a;
            }
            if (iOrdinal == 1) {
                return new ag(w.f42314a);
            }
            if (iOrdinal == 2) {
                return new ag(y.f42315a);
            }
            throw new h.i();
        }
        if (!(bwVar instanceof bo)) {
            throw new h.i();
        }
        com.waze.t.b.ah ahVarA = ((bo) bwVar).a();
        x.f(ahVarA, "<this>");
        ba baVar2 = ba.f40709a;
        com.waze.t.b.ah ahVar2 = com.waze.t.b.ah.f40680a;
        int iOrdinal2 = ahVarA.ordinal();
        if (iOrdinal2 == 0) {
            pVar = p.f42309a;
        } else if (iOrdinal2 == 1) {
            pVar = com.waze.ui.f.j.f42304a;
        } else if (iOrdinal2 == 2) {
            pVar = com.waze.ui.f.o.f42308a;
        } else if (iOrdinal2 == 3) {
            pVar = com.waze.ui.f.n.f42307a;
        } else {
            if (iOrdinal2 != 4) {
                throw new h.i();
            }
            pVar = com.waze.ui.f.k.f42305a;
        }
        return new ab(pVar);
    }

    public static /* synthetic */ h.ab b(Context context, h.g.a.l lVar, ManagedActivityResultLauncher managedActivityResultLauncher, ActivityResult activityResult) {
        x.f(activityResult, "it");
        if (l(context)) {
            lVar.invoke(o.f40868a);
        } else {
            managedActivityResultLauncher.launch("android.permission.RECORD_AUDIO");
        }
        return h.ab.f48028a;
    }

    public static void c(k kVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        x.f(kVar, "permissionState");
        x.f(lVar, "onPermissionResult");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-705001205);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(kVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-705001205, i3, -1, "com.waze.conversation.presentation.ConversationPermissionRequester (ConversationPermissionRequester.kt:101)");
            }
            boolean zG = kVar.g();
            int i6 = i3 & 14;
            boolean z = i6 == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.asks.ak(kVar, lVar, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            j(kVar, zG, (h.g.a.l) objRememberedValue, composerStartRestartGroup, i6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(kVar, lVar, i2, 9, null));
        }
    }

    static h.ab e(k kVar, boolean z, h.g.a.l lVar, int i2, Composer composer) {
        j(kVar, z, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab f(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        k(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static k g(l lVar, Composer composer) {
        x.f(lVar, "stateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1452591461, 0, -1, "com.waze.conversation.presentation.rememberConversationPermissionState (ConversationPermissionRequester.kt:80)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object obj = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        boolean zChanged = composer.changed(context) | composer.changed(lVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new k(context, lVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        k kVar = (k) objRememberedValue;
        boolean zChanged2 = composer.changed(kVar) | composer.changedInstance(context) | composer.changedInstance(obj);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            Object cVar = new com.waze.ads.c(obj, (Object) kVar, (Object) context, 5, (short[]) null);
            composer.updateRememberedValue(cVar);
            objRememberedValue2 = cVar;
        }
        EffectsKt.DisposableEffect(kVar, obj, (h.g.a.l) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return kVar;
    }

    public static /* synthetic */ com.waze.copilot.data.y h(List list) {
        Iterator it = list.iterator();
        String strC = null;
        String strC2 = null;
        String strC3 = null;
        while (it.hasNext()) {
            com.waze.copilot.data.b.o oVar = (com.waze.copilot.data.b.o) it.next();
            com.waze.copilot.data.b.p pVarB = oVar.b();
            com.waze.copilot.data.b.p pVar = com.waze.copilot.data.b.p.f23012a;
            int iOrdinal = pVarB.ordinal();
            if (iOrdinal == 0) {
                strC = oVar.c();
            } else if (iOrdinal == 1) {
                strC2 = oVar.c();
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                strC3 = oVar.c();
            }
        }
        return new com.waze.copilot.data.y(strC, strC2, strC3);
    }

    private static void j(k kVar, boolean z, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.a.l lVar2;
        Context context;
        MutableState mutableState;
        Boolean bool;
        Context context2;
        i iVar;
        k kVar2 = kVar;
        h.g.a.l lVar3 = lVar;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1781319833);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(kVar2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 128 : 256;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1781319833, i6, -1, "com.waze.conversation.presentation.ConversationPermissionRequester (ConversationPermissionRequester.kt:121)");
            }
            Context context3 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChanged = composerStartRestartGroup.changed(context3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                Context baseContext = context3;
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        objRememberedValue = null;
                        break;
                    } else if (baseContext instanceof Activity) {
                        objRememberedValue = (Activity) baseContext;
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        x.e(baseContext, "getBaseContext(...)");
                    }
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Activity activity = (Activity) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue4;
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            boolean z2 = (i6 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean zChangedInstance = z2 | composerStartRestartGroup.changedInstance(activity);
            boolean z3 = (i6 & 14) == 4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance || z3) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                context = context3;
                at atVar = new at(lVar3, activity, kVar2, mutableState4, mutableState2, mutableState3, 5);
                lVar3 = lVar3;
                mutableState = mutableState4;
                composerStartRestartGroup.updateRememberedValue(atVar);
                objRememberedValue5 = atVar;
            } else {
                mutableState = mutableState4;
                context = context3;
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (h.g.a.l) objRememberedValue5, composerStartRestartGroup, 0);
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | z2 | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new com.waze.ads.c(context, lVar3, managedActivityResultLauncherRememberLauncherForActivityResult, 6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue6, composerStartRestartGroup, 0);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zChangedInstance3 = ((i6 & 112) == 32) | composerStartRestartGroup.changedInstance(context) | z2 | composerStartRestartGroup.changedInstance(activity) | z3 | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                Context context4 = context;
                bool = boolValueOf;
                i iVar2 = new i(z, context4, lVar3, activity, kVar, managedActivityResultLauncherRememberLauncherForActivityResult, mutableState2, null);
                context2 = context4;
                kVar2 = kVar;
                mutableState2 = mutableState2;
                lVar2 = lVar3;
                iVar = iVar2;
                composerStartRestartGroup.updateRememberedValue(iVar);
            } else {
                kVar2 = kVar;
                bool = boolValueOf;
                lVar2 = lVar3;
                iVar = objRememberedValue7;
                context2 = context;
            }
            EffectsKt.LaunchedEffect(bool, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) iVar, composerStartRestartGroup, (i6 >> 3) & 14);
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                boolean z4 = z3 | z2;
                composerStartRestartGroup.startReplaceGroup(1319197603);
                boolean zChangedInstance4 = z3 | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                    objRememberedValue8 = new z(kVar2, managedActivityResultLauncherRememberLauncherForActivityResult, mutableState2, 20);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue8;
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                    objRememberedValue9 = new com.waze.app_nav.hub.o(kVar2, lVar2, mutableState2, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                k(aVar, (h.g.a.a) objRememberedValue9, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1319589691);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                boolean z5 = z3 | z2;
                composerStartRestartGroup.startReplaceGroup(1319635602);
                boolean zChangedInstance5 = z3 | composerStartRestartGroup.changedInstance(context2) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult2);
                Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                    com.waze.z.a.d.y yVar = new com.waze.z.a.d.y(kVar2, managedActivityResultLauncherRememberLauncherForActivityResult2, mutableState3, mutableState, context2, 1);
                    composerStartRestartGroup.updateRememberedValue(yVar);
                    objRememberedValue10 = yVar;
                }
                h.g.a.a aVar2 = (h.g.a.a) objRememberedValue10;
                Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                    objRememberedValue11 = new com.waze.app_nav.hub.o(kVar2, lVar2, mutableState3, i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                k(aVar2, (h.g.a.a) objRememberedValue11, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1320197787);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            lVar2 = lVar3;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(kVar2, z, lVar2, i2, 0));
        }
    }

    private static void k(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1576696920);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1576696920, i3, -1, "com.waze.conversation.presentation.RationaleDialog (ConversationPermissionRequester.kt:229)");
            }
            String strValueOf = String.valueOf(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_PERMISSION_TITLE, composerStartRestartGroup, 0));
            String strB = com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_PERMISSION_SUBTITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_PERMISSION_PRIMARY_BUTTON, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.CONVERSATION_INFRA_PERMISSION_SECONDARY_BUTTON, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(aVar, aVar2, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            q.d("🎤 ".concat(strValueOf), strB, aVar3, (com.waze.z.a.c.g) objRememberedValue, aVar2, null, composerStartRestartGroup, (i3 << 9) & 57344, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(aVar, aVar2, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(Context context) {
        return ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
    }

    private n() {
        throw null;
    }
}
