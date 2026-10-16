package com.waze.ui;

import android.content.res.Configuration;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import com.waze.trip_overview.cj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43259a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final EnterTransition f43260b;

    /* renamed from: c, reason: collision with root package name */
    private static final ExitTransition f43261c;

    /* renamed from: d, reason: collision with root package name */
    private static final EnterTransition f43262d;

    /* renamed from: e, reason: collision with root package name */
    private static final ExitTransition f43263e;

    static {
        h.o.c cVar = h.o.a.f48264a;
        h.o.c.i(0, h.o.d.f48272c);
        h.o.c.i(DisplayStrings.DS_NIGHT, h.o.d.f48272c);
        f43260b = EnterExitTransitionKt.slideInVertically(AnimationSpecKt.spring(0.7f, 130.0f, null), new cj(13));
        f43261c = EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.spring(0.7f, 130.0f, null), new cj(14));
        f43262d = EnterExitTransitionKt.slideInVertically(AnimationSpecKt.spring(0.7f, 130.0f, null), p.f43179a);
        f43263e = EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.spring(0.7f, 130.0f, null), q.f43231a);
    }

    public static final void a(final float f2, final boolean z, final float f3, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, Composer composer, final int i2) {
        int i3;
        h.g.b.x.f(aVar, "onBack");
        h.g.b.x.f(aVar2, "onClose");
        h.g.b.x.f(aVar3, "onSearchArea");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(590094014);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(f2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 65536 : 131072;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590094014, i5, -1, "com.waze.ui.MapOverlayTopButtons (MapOverlay.kt:179)");
            }
            float f4 = 48.0f + f3;
            float f5 = Dp.m11163compareTo0680j_4(f4, f2) < 0 ? 0.0f : f2 - f4;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, f3, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = i5 << 9;
            float f6 = f5;
            b(boxScopeInstance, com.waze.design_components.b.d.T, Alignment.Companion.getTopStart(), f6, 0.0f, 0.0f, aVar, composerStartRestartGroup, (i6 & 3670016) | DisplayStrings.DS_NONE, 24);
            d(boxScopeInstance, z, true, new com.waze.ui.ac.j(R.string.SEARCH_RESULTS_SEARCH_AREA), Alignment.Companion.getTopCenter(), f5, 0.0f, 0.0f, aVar3, composerStartRestartGroup, (i5 & 112) | 24966 | (i6 & 234881024));
            b(boxScopeInstance, com.waze.design_components.b.d.n, Alignment.Companion.getTopEnd(), f6, 0.0f, 0.0f, aVar2, composerStartRestartGroup, ((i5 << 6) & 3670016) | DisplayStrings.DS_NONE, 24);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.l
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    float f7 = f2;
                    boolean z2 = z;
                    float f8 = f3;
                    h.g.a.a aVar4 = aVar;
                    int i7 = i2;
                    r.a(f7, z2, f8, aVar4, aVar2, aVar3, composer2, RecomposeScopeImplKt.updateChangedFlags(i7 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final androidx.compose.foundation.layout.BoxScope r22, final com.waze.design_components.b.d r23, final androidx.compose.ui.Alignment r24, final float r25, float r26, float r27, final h.g.a.a r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.r.b(androidx.compose.foundation.layout.BoxScope, com.waze.design_components.b.d, androidx.compose.ui.Alignment, float, float, float, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final boolean z, final float f2, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, final h.g.a.l lVar, Composer composer, final int i2) {
        int i3;
        h.g.b.x.f(aVar, "onBack");
        h.g.b.x.f(aVar2, "onClose");
        h.g.b.x.f(aVar3, "onSearchArea");
        h.g.b.x.f(lVar, "onMotionEvent");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2093932343);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(false) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 524288 : 1048576;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2093932343, i3, -1, "com.waze.ui.MapOverlayConsumingTouches (MapOverlay.kt:142)");
            }
            float fMo2123toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2123toDpu2uoSUM(f2);
            float fMo2707calculateTopPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo2707calculateTopPaddingD9Ej5fM();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-783103048);
                Modifier modifierM2808height3ABfNKs = SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), fMo2123toDpu2uoSUM);
                int i5 = 3670016 & i3;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i5 == 1048576 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.tide.a.c(lVar, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                BoxKt.Box(PointerInteropFilter_androidKt.pointerInteropFilter$default(modifierM2808height3ABfNKs, null, (h.g.a.l) objRememberedValue, 1, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-782894511);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                composerStartRestartGroup.startReplaceGroup(234121393);
                a(fMo2123toDpu2uoSUM, false, fMo2707calculateTopPaddingD9Ej5fM, aVar, aVar2, aVar3, composerStartRestartGroup, i3 & 523376);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(234361643);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.m
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    float f3 = f2;
                    h.g.a.a aVar4 = aVar;
                    h.g.a.a aVar5 = aVar2;
                    int i6 = i2;
                    r.c(z2, f3, aVar4, aVar5, aVar3, lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    public static final void d(final BoxScope boxScope, final boolean z, final boolean z2, final com.waze.ui.ac.n nVar, final Alignment alignment, final float f2, float f3, float f4, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        boolean z3;
        Composer composer2;
        final float f5;
        final float f6;
        h.g.b.x.f(boxScope, "$this$OverlayTextButton");
        h.g.b.x.f(nVar, "text");
        h.g.b.x.f(alignment, "alignment");
        h.g.b.x.f(aVar, "onClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1754284401);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z3 = z;
            i3 |= true != composerStartRestartGroup.changed(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(nVar) : composerStartRestartGroup.changedInstance(nVar)) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alignment) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 65536 : 131072;
        }
        int i5 = i3 | 14155776;
        if ((100663296 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1754284401, i5, -1, "com.waze.ui.OverlayTextButton (MapOverlay.kt:108)");
            }
            composer2 = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(z3, OffsetKt.m2715offsetVpY3zN4$default(boxScope.align(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 0.0f, 10, null), alignment), 0.0f, f2, 1, null), z2 ? f43260b : f43262d, z2 ? f43261c : f43263e, (String) null, ComposableLambdaKt.rememberComposableLambda(2130250649, true, new com.waze.o.d.b.b.b(aVar, nVar, 15), composerStartRestartGroup, 54), composer2, ((i5 >> 3) & 14) | 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = 16.0f;
            f6 = 16.0f;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            f5 = f3;
            f6 = f4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.j
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    BoxScope boxScope2 = boxScope;
                    boolean z4 = z;
                    boolean z5 = z2;
                    com.waze.ui.ac.n nVar2 = nVar;
                    Alignment alignment2 = alignment;
                    float f7 = f2;
                    float f8 = f5;
                    int i6 = i2;
                    r.d(boxScope2, z4, z5, nVar2, alignment2, f7, f8, f6, aVar, composer3, RecomposeScopeImplKt.updateChangedFlags(i6 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }

    public static final void e(final BoxScope boxScope, final boolean z, final float f2, final h.g.a.a aVar, Composer composer, final int i2) {
        int i3;
        boolean z2;
        h.g.b.x.f(boxScope, "$this$RecenterButton");
        h.g.b.x.f(aVar, "onClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-257856799);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(boxScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= true != composerStartRestartGroup.changed(z2) ? 16 : 32;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(16.0f) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-257856799, i3, -1, "com.waze.ui.RecenterButton (MapOverlay.kt:213)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z2, boxScope.align(Modifier.Companion, Alignment.Companion.getBottomStart()), f43262d, f43263e, (String) null, ComposableLambdaKt.rememberComposableLambda(524448185, true, new h.g.a.q() { // from class: com.waze.ui.n
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i5 = r.f43259a;
                    h.g.b.x.f((AnimatedVisibilityScope) obj, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(524448185, iIntValue, -1, "com.waze.ui.RecenterButton.<anonymous> (MapOverlay.kt:220)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    h.g.a.a aVar2 = aVar;
                    float f3 = f2;
                    Updater.m7351setimpl(composer2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer2, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer2, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer2, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer2, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    r.b(BoxScopeInstance.INSTANCE, com.waze.design_components.b.d.bt, Alignment.Companion.getCenter(), 0.0f, 16.0f, f3, aVar2, composer2, DisplayStrings.DS_REPORTING_AGENT_CAR_PLAY_ERROR_TITLE, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.o
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    BoxScope boxScope2 = boxScope;
                    boolean z3 = z;
                    int i5 = i2;
                    r.e(boxScope2, z3, f2, aVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1));
                    return h.ab.f48028a;
                }
            });
        }
    }
}
