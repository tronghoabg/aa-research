package com.waze.ui.b;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.z.a.be;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d {
    static final h.ab b(a aVar, f fVar, h.g.a.p pVar, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(918845963, i3, -1, "com.waze.ui.alternate_routes.AlternativeRoutesCardsVerticalLayout.<anonymous> (AlternativeRoutesCardsVerticalLayout.kt:25)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChanged = composer.changed(aVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.tide.a.c(aVar, 17);
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOffset = OffsetKt.offset(companion, (h.g.a.l) objRememberedValue);
            SwipeableState swipeableStateB = aVar.b();
            boolean zI = aVar.i();
            int iB = h.h.a.b(be.H(boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM(), composer, 0));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-621823532, 0, -1, "com.waze.ui.alternate_routes.toMap (AlternativeRoutesCardsVerticalLayout.kt:76)");
            }
            float f2 = iB;
            Map mapK = h.a.r.k(new h.k(Float.valueOf(0.0f), e.f42055d), new h.k(Float.valueOf(be.H(fVar.b(), composer, 0)), e.f42054c), new h.k(Float.valueOf(f2 - be.H(fVar.c(), composer, 0)), e.f42053b), new h.k(Float.valueOf(f2 - be.H(fVar.a(), composer, 0)), e.f42052a));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Orientation orientation = Orientation.Vertical;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.a.v(i4);
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SwipeableKt.m4227swipeablepPrIpRY$default(modifierOffset, swipeableStateB, mapK, orientation, zI, false, null, (h.g.a.p) objRememberedValue2, null, 0.0f, DisplayStrings.DS_DIRT_ROADS, null), com.waze.bz.a.d(composer, 0).U(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1972backgroundbw27NRU$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final f c(float f2, float f3, float f4, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-267351994, 0, -1, "com.waze.ui.alternate_routes.rememberAlternativeRoutesLayoutAnchors (AlternativeRoutesCardsVerticalLayout.kt:63)");
        }
        boolean zChanged = composer.changed(f2) | composer.changed(f3) | composer.changed(f4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new f(f2, f3, f4);
            composer.updateRememberedValue(objRememberedValue);
        }
        f fVar = (f) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fVar;
    }

    public static final void d(Modifier modifier, final a aVar, final f fVar, final h.g.a.p pVar, Composer composer, int i2) {
        Modifier modifier2;
        h.g.b.x.f(aVar, "alternativeRoutesCardsLayoutState");
        h.g.b.x.f(fVar, "anchors");
        h.g.b.x.f(pVar, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-80377163);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(fVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-80377163, i3, -1, "com.waze.ui.alternate_routes.AlternativeRoutesCardsVerticalLayout (AlternativeRoutesCardsVerticalLayout.kt:22)");
            }
            BoxWithConstraintsKt.BoxWithConstraints(companion, null, false, ComposableLambdaKt.rememberComposableLambda(918845963, true, new h.g.a.q() { // from class: com.waze.ui.b.c
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return d.b(aVar, fVar, pVar, (BoxWithConstraintsScope) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(modifier2, aVar, fVar, pVar, i2, 16));
        }
    }

    public static final void e(com.waze.ui.c.a aVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aVar, "state");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1860780953);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1860780953, i3, -1, "com.waze.ui.app_launch_dialog.AppLaunchDialogLayout (AppLaunchDialogLayout.kt:127)");
            }
            com.waze.ui.ac.i iVarA = aVar.a();
            com.waze.z.a.c.h hVar = iVarA != null ? new com.waze.z.a.c.h(iVarA, null, com.waze.z.a.c.i.f45846d, 14) : null;
            String strC = aVar.c();
            String strD = aVar.d();
            com.waze.z.a.c.d dVar = new com.waze.z.a.c.d(strC, com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12);
            com.waze.z.a.c.a bVar = strD == null ? new com.waze.z.a.c.b(dVar) : new com.waze.z.a.c.a(dVar, new com.waze.z.a.c.d(strD, com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12));
            String strE = aVar.e();
            int i5 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.location.af(aVar, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.q.f(strE, bVar, null, hVar, null, (h.g.a.p) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(35674140, true, new com.waze.location.af(aVar, 11), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.s(aVar, i2, 5));
        }
    }

    public static final void f(Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1773150160);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1773150160, i3, -1, "com.waze.ui.offline_badge.OfflineBadge (OfflineBadge.kt:13)");
            }
            com.waze.design_components.g.b.f(new com.waze.z.a.a(com.waze.ui.r.a.c.c.b(R.string.NETWORK_WARNING_TEXT, composerStartRestartGroup, 0), new com.waze.ui.ac.f(R.drawable.no_network_warning_icon), false, com.waze.z.a.c.f45818d, 44), modifier, composerStartRestartGroup, (i3 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.o(modifier, i2, 7));
        }
    }

    public static /* synthetic */ List g(Object obj) {
        Object[] objArr = {obj};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Objects.requireNonNull(objArr[0]));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset h(a aVar, Density density) {
        h.g.b.x.f(density, "$this$offset");
        return IntOffset.m11287boximpl(h.h.a.b(aVar.b().getOffset().getValue().floatValue()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }
}
