package com.waze.z.a;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import com.waze.dv;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45635a = 0;

    static {
        be.r(new com.waze.ui.ac.m("Options"), ab.f45610a, new com.waze.ui.ac.f(com.waze.design_components.b.d.N.c(com.waze.design_components.b.e.f23312a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.waze.z.a.ak r28, androidx.compose.ui.Modifier r29, com.waze.z.a.al r30, h.g.a.l r31, h.g.a.q r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.aj.b(com.waze.z.a.ak, androidx.compose.ui.Modifier, com.waze.z.a.al, h.g.a.l, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final h.ab c(ak akVar, float f2, h.g.a.l lVar, int i2, Composer composer) {
        h(akVar, f2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab d(Modifier modifier, ad adVar, h.g.a.a aVar, int i2, Composer composer) {
        i(modifier, adVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final al e(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(96046566, 0, -1, "com.waze.design_components_compose.components.rememberSwipeableContentActionsState (SwipeToShowActions.kt:54)");
        }
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(ae.f45619a);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new al(anchoredDraggableState);
            composer.updateRememberedValue(objRememberedValue);
        }
        al alVar = (al) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return alVar;
    }

    public static final long f(ab abVar, Composer composer) {
        long jG;
        h.g.b.x.f(abVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1305826487, 0, -1, "com.waze.design_components_compose.components.toColor (SwipeToShowActions.kt:190)");
        }
        ab abVar2 = ab.f45610a;
        int iOrdinal = abVar.ordinal();
        if (iOrdinal == 0) {
            composer.startReplaceGroup(768807877);
            jG = com.waze.bz.a.d(composer, 0).G();
            composer.endReplaceGroup();
        } else if (iOrdinal == 1) {
            composer.startReplaceGroup(768810310);
            jG = com.waze.bz.a.d(composer, 0).b();
            composer.endReplaceGroup();
        } else if (iOrdinal == 2) {
            composer.startReplaceGroup(768812774);
            jG = com.waze.bz.a.d(composer, 0).n();
            composer.endReplaceGroup();
        } else if (iOrdinal == 3) {
            composer.startReplaceGroup(768815106);
            jG = com.waze.bz.a.d(composer, 0).J();
            composer.endReplaceGroup();
        } else {
            if (iOrdinal != 4) {
                composer.startReplaceGroup(768805889);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(768817479);
            jG = com.waze.bz.a.d(composer, 0).H();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset g(float f2, Density density) {
        h.g.b.x.f(density, "$this$offset");
        return IntOffset.m11287boximpl(h.h.a.b(f2) << 32);
    }

    private static final void h(final ak akVar, final float f2, final h.g.a.l lVar, Composer composer, final int i2) {
        byte[] bArr;
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(326396573);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(akVar) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(326396573, i4, -1, "com.waze.design_components_compose.components.ActionsRow (SwipeToShowActions.kt:128)");
            }
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            float f3 = 0.0f;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composerStartRestartGroup, 54);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            SpacerKt.Spacer(RowScope.CC.weight$default(RowScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(2073866909);
            int i5 = 0;
            for (Object obj : akVar.a()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    h.a.i.p();
                }
                ad adVar = (ad) obj;
                float f4 = 1.0f / i6;
                float fMax = Math.max(f3, f2);
                float fMin = Math.min(Math.abs(Math.min(f3, f2)), 10.0f);
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composerStartRestartGroup.changed(fMax) | composerStartRestartGroup.changed(f4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.car_lib.i.a.e(fMax, f4, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM2827width3ABfNKs = SizeKt.m2827width3ABfNKs(OffsetKt.offset(companion, (h.g.a.l) objRememberedValue), fMin + 104.0f);
                f3 = 0.0f;
                Modifier modifierA = com.waze.ui.r.a.d.d.a(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(modifierM2827width3ABfNKs, 0.0f, 1, null), f(adVar.a(), composerStartRestartGroup), null, 2, null), com.waze.ui.r.a.d.c.C, Integer.valueOf(i5));
                boolean zChangedInstance = ((i4 & DisplayStrings.DS_TAP_TO_VERIFY) == 256) | composerStartRestartGroup.changedInstance(adVar);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    bArr = null;
                    objRememberedValue2 = new com.waze.car_lib.ar(lVar, adVar, 12, bArr);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    bArr = null;
                }
                i(modifierA, adVar, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, 0);
                i5 = i6;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.z.a.af
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    return aj.c(akVar, f2, lVar, i2, (Composer) obj2);
                }
            });
        }
    }

    private static final void i(Modifier modifier, ad adVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1560889087);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(adVar) : composerStartRestartGroup.changedInstance(adVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1560889087, i3, -1, "com.waze.design_components_compose.components.SwipeActionItem (SwipeToShowActions.kt:155)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            SurfaceKt.m4217SurfaceLPr_se0(aVar, modifier, false, null, f(adVar.a(), composerStartRestartGroup), 0L, null, 0.0f, (MutableInteractionSource) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(541397128, true, new dv(adVar, 10), composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | 918552576 | ((i3 << 3) & 112), 108);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ag(modifier, adVar, aVar, i2, 0));
        }
    }
}
