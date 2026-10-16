package com.waze.bw.c.d;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.waze.R;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ct {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18062a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.z.a.ak f18063b = new com.waze.z.a.ak(h.a.i.d(com.waze.z.a.be.r(new com.waze.ui.ac.j(R.string.START_STATE_SWIPE_OPTIONS_BUTTON_TITLE), com.waze.z.a.ab.f45610a, new com.waze.ui.ac.f(com.waze.design_components.b.d.N.c(com.waze.design_components.b.e.f23312a)))));

    public static /* synthetic */ h.ab a(MutableState mutableState, com.waze.z.a.ae aeVar, String str) {
        h.g.b.x.f(aeVar, "anchor");
        h.g.b.x.f(str, "key");
        com.waze.z.a.ae aeVar2 = com.waze.z.a.ae.f45619a;
        Lifecycle.Event.Companion companion = Lifecycle.Event.Companion;
        int iOrdinal = aeVar.ordinal();
        if (iOrdinal == 0) {
            str = h.g.b.x.n(str, a.a.i(mutableState)) ? null : a.a.i(mutableState);
        } else if (iOrdinal != 1) {
            throw new h.i();
        }
        l(mutableState, str);
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab b(h.g.a.l lVar, MutableState mutableState, bl blVar) {
        h.g.b.x.f(blVar, "it");
        l(mutableState, null);
        lVar.invoke(blVar);
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.waze.bw.c.d.cf r25, com.waze.z.a.b.ab r26, h.g.a.l r27, androidx.compose.ui.Modifier r28, androidx.compose.foundation.lazy.LazyListState r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.d.ct.c(com.waze.bw.c.d.cf, com.waze.z.a.b.ab, h.g.a.l, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.runtime.Composer, int, int):void");
    }

    static final h.ab d(String str, String str2, com.waze.z.a.al alVar, h.g.a.p pVar, h.g.a.l lVar, h.g.a.p pVar2, int i2, Composer composer) {
        j(str, str2, alVar, pVar, lVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab e(h.g.a.a aVar, int i2, Composer composer) {
        k(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab f(String str, Modifier modifier, int i2, Composer composer) {
        m(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final String str, final String str2, final com.waze.z.a.al alVar, final h.g.a.p pVar, final h.g.a.l lVar, final h.g.a.p pVar2, Composer composer, final int i2) {
        int i3;
        h.g.a.l lVar2;
        Composer composer2;
        String str3;
        String str4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-964341818);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(alVar) : composerStartRestartGroup.changedInstance(alVar)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            lVar2 = lVar;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 8192 : 16384;
        } else {
            lVar2 = lVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 65536 : 131072;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-964341818, i5, -1, "com.waze.startstate.mobile.ui.CellSwipeBehaviorWrapper (StartStateSheetContent.kt:510)");
            }
            boolean z = (i5 & 112) == 32;
            boolean z2 = (i5 & 14) == 4;
            int i6 = i5 & DisplayStrings.DS_TAP_TO_VERIFY;
            boolean z3 = i6 == 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(alVar));
            ci ciVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (((z | z2) || z3) || ciVarRememberedValue == Composer.Companion.getEmpty()) {
                str3 = str2;
                str4 = str;
                ciVarRememberedValue = new ci(str3, str, alVar, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(ciVarRememberedValue);
            } else {
                str4 = str;
                str3 = str2;
            }
            int i7 = i5 >> 3;
            EffectsKt.LaunchedEffect(str3, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) ciVarRememberedValue, composerStartRestartGroup, i7 & 14);
            com.waze.z.a.ae aeVarB = alVar.b();
            com.waze.z.a.ae aeVarC = alVar.c();
            boolean z4 = i6 == 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(alVar));
            boolean z5 = (i5 & 7168) == 2048;
            cj cjVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z4 | z5) || cjVarRememberedValue == Composer.Companion.getEmpty()) {
                cjVarRememberedValue = new cj(alVar, pVar, str4, null);
                composerStartRestartGroup.updateRememberedValue(cjVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(aeVarB, aeVarC, (h.g.a.p) cjVarRememberedValue, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            com.waze.z.a.aj.b(f18063b, Modifier.Companion, alVar, lVar2, ComposableLambdaKt.rememberComposableLambda(609898136, true, new com.waze.main_screen.c.b.a(pVar2, 12), composerStartRestartGroup, 54), composer2, (i7 & 7168) | i6 | 24630, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.bw.c.d.ch
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ct.d(str, str2, alVar, pVar, lVar, pVar2, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void k(h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2061357729);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061357729, i3, -1, "com.waze.startstate.mobile.ui.DisposableLifecycleEffect (StartStateSheetContent.kt:635)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, i3 & 14);
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bw.a.b.l(lifecycleOwner, stateRememberUpdatedState, 5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(aVar, i2, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(String str, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(470195579);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(470195579, i3, -1, "com.waze.startstate.mobile.ui.StartStateGroupHeader (StartStateSheetContent.kt:621)");
            }
            Modifier modifierM2757paddingVpY3zN4$default = PaddingKt.m2757paddingVpY3zN4$default(SizeKt.m2808height3ABfNKs(modifier, 40.0f), 16.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2757paddingVpY3zN4$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(Modifier.Companion, Alignment.Companion.getCenterStart()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composer2, i3 & 14, 0, 65532);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new m(str, modifier, i2, 6));
        }
    }
}
