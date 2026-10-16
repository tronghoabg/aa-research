package com.waze.ui.z;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import com.waze.kv;
import com.waze.sound.gv;
import com.waze.strings.DisplayStrings;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private static Resources f43932a;

    static final h.ab A(al alVar, Modifier modifier, int i2, Composer composer) {
        L(alVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab B(Modifier modifier, int i2, Composer composer) {
        M(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab C(ao aoVar, Modifier modifier, int i2, Composer composer) {
        N(aoVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void D(final boolean r22, final boolean r23, androidx.compose.ui.Modifier r24, final h.g.a.a r25, final h.g.a.a r26, boolean r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.z.as.D(boolean, boolean, androidx.compose.ui.Modifier, h.g.a.a, h.g.a.a, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final float E(MutableState mutableState) {
        return ((Dp) mutableState.getValue()).m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Rect F(MutableState mutableState) {
        return (Rect) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.map.b.bg G(androidx.compose.ui.geometry.Rect r7, com.waze.ui.z.f r8, boolean r9) {
        /*
            com.waze.map.b.dz r0 = new com.waze.map.b.dz
            androidx.compose.ui.unit.IntRect r7 = androidx.compose.ui.unit.IntRectKt.roundToIntRect(r7)
            android.graphics.Rect r7 = androidx.compose.ui.graphics.RectHelper_androidKt.toAndroidRect(r7)
            r0.<init>(r7)
            r2 = r0
            com.waze.map.b.ec r2 = (com.waze.map.b.ec) r2
            com.waze.ui.z.e r7 = r8.b()
            if (r7 == 0) goto L35
            java.util.List r7 = r7.a()
            if (r7 == 0) goto L35
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            r0 = 1
            if (r0 != r8) goto L27
            r7 = 0
        L27:
            if (r7 == 0) goto L35
            com.waze.map.b.co r8 = new com.waze.map.b.co
            com.waze.map.b.ct r0 = com.waze.map.b.ct.f28166b
            r1 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r7, r0, r1)
            com.waze.destination_cell.b.e r8 = (com.waze.destination_cell.b.e) r8
            goto L3a
        L35:
            com.waze.map.b.cr r7 = com.waze.map.b.cr.f28163a
            r8 = r7
            com.waze.destination_cell.b.e r8 = (com.waze.destination_cell.b.e) r8
        L3a:
            r3 = r8
            com.waze.map.b.bg r1 = new com.waze.map.b.bg
            r4 = 0
            r6 = 4
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.z.as.G(androidx.compose.ui.geometry.Rect, com.waze.ui.z.f, boolean):com.waze.map.b.bg");
    }

    private static final void H(Modifier modifier, com.waze.ui.p.i iVar, h.g.a.a aVar, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(500818132);
        int i5 = 2;
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(iVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        int i6 = i3;
        if (composerStartRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(500818132, i6, -1, "com.waze.ui.shared_drive.AnimatedRecenterButton (LiveShareScreen.kt:265)");
            }
            boolean z = !((Boolean) FlowExtKt.collectAsStateWithLifecycle((kotlinx.coroutines.b.k<? extends boolean>) (((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue() ? kotlinx.coroutines.b.ai.G(false) : iVar.c()), true, (LifecycleOwner) null, (Lifecycle.State) null, (h.c.j) null, composerStartRestartGroup, 48, 14).getValue()).booleanValue();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.ui.x.a(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (h.g.a.l) objRememberedValue, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            int i7 = 3;
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.x.a(i7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (h.g.a.l) objRememberedValue2, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1629988978, true, new com.waze.main_screen.c.d.a(aVar, 13), composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 << 3) & 112) | 200064, 16);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q(modifier, iVar, aVar, i2, 0));
        }
    }

    private static final void I(com.waze.ui.p.i iVar, f fVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        boolean z;
        boolean z2;
        MutableState mutableState;
        State state;
        aa aaVar;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1006625146);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(iVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(fVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1006625146, i3, -1, "com.waze.ui.shared_drive.MapViewportArea (LiveShareScreen.kt:209)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(fVar, composerStartRestartGroup, (i3 >> 3) & 14);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.x.p(mutableState2, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (h.g.a.l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            if (((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(800359662);
                Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.m8227copywmQWz5c$default(Color.Companion.m8262getRed0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composerStartRestartGroup, 54);
                int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1972backgroundbw27NRU$default);
                h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Rect rectF = F(mutableState2);
                Objects.toString(rectF);
                String strConcat = "GlobalRect: ".concat(String.valueOf(rectF));
                z = false;
                i4 = 32;
                z2 = true;
                TextKt.m4275Text4IGK_g(strConcat, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131070);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                i4 = 32;
                z = false;
                z2 = true;
                composer2.startReplaceGroup(800611630);
                composer2.endReplaceGroup();
            }
            Modifier modifierAlign = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomEnd());
            boolean z3 = (i3 & 14) == 4 ? z2 : z;
            if ((i3 & 112) == i4) {
                z = z2;
            }
            Object objRememberedValue3 = composer2.rememberedValue();
            int i6 = 6;
            if ((z | z3) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.nav_connect.b.ab(iVar, fVar, mutableState2, i6);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            H(modifierAlign, iVar, (h.g.a.a) objRememberedValue3, composer2, (i3 << 3) & 112);
            composer2.endNode();
            h.ab abVar = h.ab.f48028a;
            boolean zChanged = composer2.changed(stateRememberUpdatedState) | z3;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                mutableState = mutableState2;
                state = stateRememberUpdatedState;
                aaVar = new aa(state, mutableState, iVar, null, 1, null);
                composer2.updateRememberedValue(aaVar);
            } else {
                aaVar = objRememberedValue4;
                mutableState = mutableState2;
                state = stateRememberUpdatedState;
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) aaVar, composer2, 6);
            boolean zChanged2 = composer2.changed(state) | z3;
            aa aaVarRememberedValue = composer2.rememberedValue();
            if (zChanged2 || aaVarRememberedValue == Composer.Companion.getEmpty()) {
                aaVarRememberedValue = new aa(state, mutableState, iVar, null, 0);
                composer2.updateRememberedValue(aaVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) aaVarRememberedValue, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q(iVar, fVar, modifier, i2, 2));
        }
    }

    private static final void J(ak akVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        String strC;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1419244437);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(akVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1419244437, i3, -1, "com.waze.ui.shared_drive.ArrivedListItem (LiveShareParticipantListItem.kt:254)");
            }
            if (akVar.d()) {
                composerStartRestartGroup.startReplaceGroup(1053192167);
                strC = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_CURRENT_USER, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1053274751);
                strC = akVar.c();
                if (strC == null) {
                    composerStartRestartGroup.startReplaceGroup(-1905685425);
                    strC = com.waze.ui.r.a.c.c.b(R.string.WAZER, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1905686045);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.z.a.a.a aVarO = O(akVar.a(), composerStartRestartGroup);
            int i5 = b.f43938a;
            com.waze.z.a.a.h.h(strC, false, false, modifier, 0L, null, aVarO, b.a(), null, null, composerStartRestartGroup, ((i3 << 6) & 7168) | 12583344, 6, DisplayStrings.DS_TRAFFIC_DETECTED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(akVar, modifier, i2, 2));
        }
    }

    private static final void K(an anVar, Modifier modifier, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String strB;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1787019016);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(anVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1787019016, i3, -1, "com.waze.ui.shared_drive.CurrentUserViewerListItem (LiveShareParticipantListItem.kt:196)");
            }
            if (anVar.c()) {
                composerStartRestartGroup.startReplaceGroup(964109973);
                strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_VIEWING_SHARING_LOCATION, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(964215590);
                strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_VIEWING, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            com.waze.z.a.a.h.h(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_CURRENT_USER, composerStartRestartGroup, 0), false, false, modifier, 0L, null, O(anVar.a(), composerStartRestartGroup), ComposableLambdaKt.rememberComposableLambda(2079925573, true, new com.waze.parking.f(anVar, lVar, 18, null), composerStartRestartGroup, 54), null, com.waze.z.a.a.h.g(strB), composer2, ((i3 << 6) & 7168) | 12583344, 0, DisplayStrings.DS_TRAFFIC_DETECTED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q(anVar, modifier, lVar, i2, 1));
        }
    }

    private static final void L(al alVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        String strD;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1157090761);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(alVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1157090761, i3, -1, "com.waze.ui.shared_drive.DriverListItem (LiveShareParticipantListItem.kt:166)");
            }
            if (alVar.e()) {
                composerStartRestartGroup.startReplaceGroup(-432303359);
                strD = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_CURRENT_USER, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-516436085);
                strD = alVar.d();
                if (strD == null) {
                    composerStartRestartGroup.startReplaceGroup(-432300605);
                    strD = com.waze.ui.r.a.c.c.b(R.string.WAZER, composerStartRestartGroup, 0);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-432301225);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            int i5 = ((i3 << 6) & 7168) | 12583344;
            com.waze.z.a.a.h.h(strD, false, true, modifier, 0L, null, O(alVar.a(), composerStartRestartGroup), ComposableLambdaKt.rememberComposableLambda(-1246886330, true, new com.waze.main_screen.o(alVar, 3), composerStartRestartGroup, 54), null, com.waze.z.a.a.h.g(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_DRIVING, composerStartRestartGroup, 0)), composerStartRestartGroup, i5, 0, DisplayStrings.DS_TRAFFIC_DETECTED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(alVar, modifier, i2, 0));
        }
    }

    private static final void M(final Modifier modifier, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1932895939);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1932895939, i3, -1, "com.waze.ui.shared_drive.LoadingListItem (LiveShareParticipantListItem.kt:292)");
            }
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("shimmer_transition", composerStartRestartGroup, 6, 0), 0.0f, 1.0f, AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), RepeatMode.Restart, 0L, 4, null), "shimmer_progress", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            long jM = com.waze.bz.a.d(composerStartRestartGroup, 0).M();
            boolean zChanged = composerStartRestartGroup.changed(jM);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = h.a.i.i(Color.m8218boximpl(jM), Color.m8218boximpl(Color.m8227copywmQWz5c$default(jM, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m8218boximpl(jM));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list = (List) objRememberedValue;
            Modifier modifierClip = ClipKt.clip(SizeKt.m2808height3ABfNKs(PaddingKt.m2759paddingqDBjuR0$default(PaddingKt.m2757paddingVpY3zN4$default(modifier, 16.0f, 0.0f, 2, null), 0.0f, 12.0f, 0.0f, 12.0f, 5, null), 48.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f));
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat) | composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.u(list, stateAnimateFloat, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BoxKt.Box(DrawModifierKt.drawWithCache(modifierClip, (h.g.a.l) objRememberedValue2), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.z.j
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return as.B(modifier, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void N(ao aoVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        String strB;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(391783245);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(aoVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(391783245, i3, -1, "com.waze.ui.shared_drive.OtherViewerListItem (LiveShareParticipantListItem.kt:228)");
            }
            String strC = aoVar.c();
            if (strC == null) {
                composerStartRestartGroup.startReplaceGroup(-1453415865);
                strC = com.waze.ui.r.a.c.c.b(R.string.WAZER, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(-1453416485);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (aoVar.d()) {
                composerStartRestartGroup.startReplaceGroup(-2106130224);
                strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_VIEWING_SHARING_LOCATION, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2106024607);
                strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_VIEWING, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i5 = ((i3 << 6) & 7168) | 12583344;
            com.waze.z.a.a.h.h(strC, false, false, modifier, 0L, null, O(aoVar.a(), composerStartRestartGroup), null, null, com.waze.z.a.a.h.g(strB), composerStartRestartGroup, i5, 0, DisplayStrings.DS_TRAFFIC_DETECTED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i(aoVar, modifier, i2, 1));
        }
    }

    private static final com.waze.z.a.a.a O(com.waze.ui.ac.i iVar, Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411854798, 0, -1, "com.waze.ui.shared_drive.rememberLeadingImage (LiveShareParticipantListItem.kt:278)");
        }
        boolean zChanged = composer.changed(iVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            if (iVar == null) {
                iVar = new com.waze.ui.ac.f(com.waze.design_components.b.d.S.c(com.waze.design_components.b.e.f23314c));
            }
            objRememberedValue = new com.waze.z.a.a.a(iVar, com.waze.z.a.s.g(com.waze.z.a.s.f46181a, ContentScale.Companion.getCrop(), null, RoundedCornerShapeKt.getCircleShape(), 27), 4);
            composer.updateRememberedValue(objRememberedValue);
        }
        com.waze.z.a.a.a aVar = (com.waze.z.a.a.a) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar;
    }

    public static final void a(String str, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(str, "message");
        h.g.b.x.f(aVar, "onShareCompleted");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041801945);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041801945, i3, -1, "com.waze.ui.shared_drive.OsShareSideEffect (OsShareSideEffect.kt:15)");
            }
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.ui.x.a(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue, composerStartRestartGroup, 48);
            int i6 = i3 & 14;
            boolean zChangedInstance = (i6 == 4) | composerStartRestartGroup.changedInstance(managedActivityResultLauncherRememberLauncherForActivityResult);
            boolean z = (i3 & 112) == 32;
            ar arVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || arVarRememberedValue == Composer.Companion.getEmpty()) {
                arVarRememberedValue = new ar(managedActivityResultLauncherRememberLauncherForActivityResult, aVar, str, null);
                composerStartRestartGroup.updateRememberedValue(arVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(str, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) arVarRememberedValue, composerStartRestartGroup, i6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.d.ad(str, aVar, i2, 17));
        }
    }

    public static final void b(final d dVar, Modifier modifier, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, h.g.a.l lVar, h.g.a.l lVar2, h.g.a.a aVar4, h.g.a.a aVar5, Composer composer, int i2) {
        int i3;
        h.g.a.l lVar3;
        h.g.a.l lVar4;
        h.g.a.a aVar6;
        h.g.a.a aVar7;
        h.g.b.x.f(dVar, "content");
        h.g.b.x.f(aVar, "onCloseClicked");
        h.g.b.x.f(aVar2, "onExitSharedDrive");
        h.g.b.x.f(aVar3, "onResumeDrive");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1350992647);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            lVar3 = lVar;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 65536 : 131072;
        } else {
            lVar3 = lVar;
        }
        if ((1572864 & i2) == 0) {
            lVar4 = lVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar4) ? 524288 : 1048576;
        } else {
            lVar4 = lVar2;
        }
        if ((12582912 & i2) == 0) {
            aVar6 = aVar4;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar6) ? 4194304 : 8388608;
        } else {
            aVar6 = aVar4;
        }
        if ((100663296 & i2) == 0) {
            aVar7 = aVar5;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar7) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            aVar7 = aVar5;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1350992647, i3, -1, "com.waze.ui.shared_drive.LiveShareSheet (LiveShareSheet.kt:67)");
            }
            final h.g.a.l lVar5 = lVar4;
            final h.g.a.l lVar6 = lVar3;
            final h.g.a.a aVar8 = aVar6;
            final h.g.a.a aVar9 = aVar7;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-746062621, true, new h.g.a.q() { // from class: com.waze.ui.z.ae
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fMo2704calculateBottomPaddingD9Ej5fM;
                    int i5;
                    Object obj4;
                    BoxWithConstraintsScope boxWithConstraintsScope = (BoxWithConstraintsScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    h.g.b.x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != composer2.changed(boxWithConstraintsScope) ? 2 : 4;
                    }
                    if (composer2.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-746062621, iIntValue, -1, "com.waze.ui.shared_drive.LiveShareSheet.<anonymous> (LiveShareSheet.kt:70)");
                        }
                        h.g.a.l lVar7 = lVar6;
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar7, composer2, 0);
                        final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
                        Object[] objArr = new Object[0];
                        Object objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new com.waze.ui.o.ac(10);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composer2, 48);
                        if (((Boolean) composer2.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                            composer2.startReplaceGroup(504642763);
                            composer2.endReplaceGroup();
                            fMo2704calculateBottomPaddingD9Ej5fM = 16.0f;
                        } else {
                            composer2.startReplaceGroup(504543904);
                            fMo2704calculateBottomPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer2, 6), density).mo2704calculateBottomPaddingD9Ej5fM();
                            composer2.endReplaceGroup();
                        }
                        final float f2 = fMo2704calculateBottomPaddingD9Ej5fM;
                        boolean zChanged = composer2.changed(density) | composer2.changed(f2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new com.waze.z.a.b.a(density.mo2121roundToPx0680j_4(151.0f + f2));
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        final d dVar2 = dVar;
                        com.waze.z.a.b.a aVar10 = (com.waze.z.a.b.a) objRememberedValue2;
                        boolean zChanged2 = composer2.changed(dVar2.c().size()) | composer2.changed(boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM()) | composer2.changed(f2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = Float.valueOf(Math.min(boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM(), (dVar2.c().size() * 73) + 179 + f2));
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        float fFloatValue = ((Number) objRememberedValue3).floatValue();
                        boolean zChanged3 = composer2.changed(dVar2.c().size()) | composer2.changed(fFloatValue) | composer2.changed(f2);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = Float.valueOf(Math.min((((h.k.n.j(dVar2.c().size(), 1, 2) * 73) + 179) + f2) / fFloatValue, 1.0f));
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        float fFloatValue2 = ((Number) objRememberedValue4).floatValue();
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                            Object mVar = new com.waze.z.a.b.m(com.waze.z.a.b.c.f45740a, new com.waze.z.a.b.e(fFloatValue2), aVar10);
                            composer2.updateRememberedValue(mVar);
                            objRememberedValue5 = mVar;
                        }
                        com.waze.z.a.b.ab abVarP = com.waze.z.a.d.ai.p(com.waze.z.a.b.ad.f45734b, (com.waze.z.a.b.m) objRememberedValue5, composer2, 54, 0);
                        final com.waze.z.a.b.x xVarA = com.waze.z.a.b.y.a(abVarP, lazyListStateRememberLazyListState, composer2, 0);
                        Float fValueOf = Float.valueOf(fFloatValue2);
                        boolean zChanged4 = composer2.changed(abVarP) | composer2.changed(fFloatValue2) | composer2.changed(aVar10);
                        Object objRememberedValue6 = composer2.rememberedValue();
                        byte[] bArr = null;
                        if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                            objRememberedValue6 = (h.g.a.p) new ag(abVarP, fFloatValue2, aVar10, null);
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        EffectsKt.LaunchedEffect(aVar10, fValueOf, abVarP, (h.g.a.p) objRememberedValue6, composer2, 0);
                        h.ab abVar = h.ab.f48028a;
                        boolean zChanged5 = composer2.changed(mutableState) | composer2.changed(abVarP);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChanged5 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                            objRememberedValue7 = (h.g.a.p) new ai(mutableState, abVarP, (h.c.e) null, 1);
                            composer2.updateRememberedValue(objRememberedValue7);
                        }
                        EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue7, composer2, 6);
                        boolean zChanged6 = composer2.changed(abVarP) | composer2.changed(lazyListStateRememberLazyListState);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChanged6 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                            i5 = 0;
                            obj4 = (h.g.a.p) new ai(abVarP, lazyListStateRememberLazyListState, (h.c.e) null, 0);
                            composer2.updateRememberedValue(obj4);
                        } else {
                            obj4 = objRememberedValue8;
                            i5 = 0;
                        }
                        EffectsKt.LaunchedEffect(abVarP, lazyListStateRememberLazyListState, (h.g.a.p) obj4, composer2, i5);
                        boolean zChanged7 = composer2.changed(abVarP) | composer2.changed(stateRememberUpdatedState);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged7 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                            objRememberedValue9 = (h.g.a.p) new ai(abVarP, stateRememberUpdatedState, (h.c.e) null, 2);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        final h.g.a.l lVar8 = lVar5;
                        final h.g.a.a aVar11 = aVar;
                        final h.g.a.a aVar12 = aVar8;
                        EffectsKt.LaunchedEffect(abVarP, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue9, composer2, 0);
                        com.waze.z.a.b.y.d(com.waze.ui.r.a.d.d.a(boxWithConstraintsScope.align(SizeKt.m2808height3ABfNKs(Modifier.Companion, fFloatValue), Alignment.Companion.getBottomCenter()), com.waze.ui.r.a.d.c.dF, null), abVarP, true, null, ComposableLambdaKt.rememberComposableLambda(-688118701, true, new h.g.a.p() { // from class: com.waze.ui.z.af
                            @Override // h.g.a.p
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if (composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-688118701, iIntValue2, -1, "com.waze.ui.shared_drive.LiveShareSheet.<anonymous>.<anonymous> (LiveShareSheet.kt:175)");
                                    }
                                    h.g.a.l lVar9 = lVar8;
                                    h.g.a.a aVar13 = aVar11;
                                    h.g.a.a aVar14 = aVar12;
                                    as.w(dVar2, NestedScrollModifierKt.nestedScroll$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, f2 + 81.0f, 7, null), xVarA, null, 2, null), lazyListStateRememberLazyListState, aVar14, aVar13, lVar9, composer3, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return h.ab.f48028a;
                            }
                        }, composer2, 54), composer2, 24960, 8);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                            objRememberedValue10 = SnapshotStateKt.derivedStateOf(new com.waze.ui.t(lazyListStateRememberLazyListState, abVarP, 15, bArr));
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        State state = (State) objRememberedValue10;
                        AnimatedContentKt.AnimatedContent(Boolean.valueOf(dVar2.d()), PaddingKt.m2759paddingqDBjuR0$default(BackgroundKt.m1972backgroundbw27NRU$default(boxWithConstraintsScope.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter()), com.waze.bz.a.d(composer2, 0).h(), null, 2, null), 0.0f, 0.0f, 0.0f, f2, 7, null), null, null, "ctaBarTransition", null, ComposableLambdaKt.rememberComposableLambda(1241525440, true, new l(state, aVar2, aVar3, aVar9, 2), composer2, 54), composer2, 1597440, 44);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return h.ab.f48028a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.sharedrive.g.u(dVar, modifier, aVar, aVar2, aVar3, lVar, lVar2, aVar4, aVar5, i2, 2));
        }
    }

    public static final kv c(com.waze.shared_infra.i.e eVar, String str) {
        h.g.b.x.f(eVar, "logger");
        com.waze.utils.b bVarD = d(eVar, str);
        if (bVarD != null) {
            return new kv(bVarD.a(), bVarD.b());
        }
        return null;
    }

    public static final com.waze.utils.b d(com.waze.shared_infra.i.e eVar, String str) {
        List listAf;
        h.g.b.x.f(eVar, "logger");
        if (str != null) {
            try {
                listAf = h.n.o.af(str, new String[]{"^"}, 0, 6);
            } catch (Exception e2) {
                eVar.g("Exception " + e2 + " with value: " + str);
                return null;
            }
        } else {
            listAf = null;
        }
        if (listAf != null && listAf.size() == 2 && h.n.o.ah((String) listAf.get(0), "ORIGINATOR") && h.n.o.ah((String) listAf.get(1), "REQUEST_ID")) {
            return new com.waze.utils.b((String) h.n.o.af((CharSequence) listAf.get(0), new String[]{"="}, 0, 6).get(1), (String) h.n.o.af((CharSequence) listAf.get(1), new String[]{"="}, 0, 6).get(1));
        }
        eVar.g("Invalid compound value: " + str);
        return null;
    }

    public static int e(int i2) {
        return f43932a.getDimensionPixelSize(i2);
    }

    public static int f(int i2) {
        return h(f43932a, i2);
    }

    public static int g(Context context, int i2) {
        return h(context.getResources(), i2);
    }

    public static int h(Resources resources, int i2) {
        return (int) TypedValue.applyDimension(1, i2, resources.getDisplayMetrics());
    }

    public static void i(Resources resources) {
        if (f43932a == null) {
            f43932a = resources;
        }
    }

    public static void j(Resources resources) {
        f43932a = resources;
    }

    static final h.ab k(boolean z, boolean z2, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, boolean z3, boolean z4, int i2, int i3, Composer composer) {
        D(z, z2, modifier, aVar, aVar2, z3, z4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return h.ab.f48028a;
    }

    public static final void l(boolean z, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(aVar, "onExitSharedDrive");
        h.g.b.x.f(aVar2, "onResumeDrive");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1934283983);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1934283983, i3, -1, "com.waze.ui.shared_drive.LiveShareSheetDriverCTABar (LiveShareSheetCTABar.kt:37)");
            }
            int i5 = i3 << 3;
            D(true, z, modifier, aVar, aVar2, false, false, composerStartRestartGroup, (i5 & 112) | 6 | (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | (i5 & 7168) | (i5 & 57344), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.c.b.b(z, modifier, aVar, aVar2, i2, 11));
        }
    }

    public static final void m(boolean z, Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, boolean z2, Composer composer, int i2) {
        int i3;
        boolean z3;
        h.g.b.x.f(aVar, "onExitSharedDrive");
        h.g.b.x.f(aVar2, "onDriveThere");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1521569885);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            z3 = z2;
            i3 |= true != composerStartRestartGroup.changed(z3) ? 8192 : 16384;
        } else {
            z3 = z2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1521569885, i3, -1, "com.waze.ui.shared_drive.LiveShareSheetViewerCTABar (LiveShareSheetCTABar.kt:54)");
            }
            int i5 = i3 << 3;
            D(false, z, modifier, aVar, aVar2, false, z3, composerStartRestartGroup, (i5 & 57344) | (i5 & 112) | 6 | (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | (i5 & 7168) | (3670016 & (i3 << 6)), 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ad(z, modifier, aVar, aVar2, z2, i2, 0));
        }
    }

    public static final /* synthetic */ f o(State state) {
        return (f) state.getValue();
    }

    public static /* synthetic */ h.ab p(com.waze.ui.p.i iVar, f fVar, MutableState mutableState) {
        iVar.d(G(F(mutableState), fVar, true));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab q(Density density, MutableState mutableState, IntSize intSize) {
        float fMo2124toDpu2uoSUM = density.mo2124toDpu2uoSUM((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (!Dp.m11169equalsimpl0(E(mutableState), fMo2124toDpu2uoSUM)) {
            mutableState.setValue(Dp.m11162boximpl(fMo2124toDpu2uoSUM));
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final h.ab r(d dVar, float f2, com.waze.ui.p.i iVar, f fVar, h.g.a.p pVar, h.g.a.p pVar2, Density density, h.g.a.a aVar, MutableState mutableState, h.g.a.l lVar, h.g.a.a aVar2, h.g.a.a aVar3, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        int i3;
        float fMo2468getMaxHeightD9Ej5fM;
        d dVar2;
        Modifier.Companion companionWindowInsetsPadding;
        boolean z;
        MutableState mutableState2;
        MutableState mutableState3;
        int i4;
        int i5;
        h.g.b.x.f(boxWithConstraintsScope, "$this$BoxWithConstraints");
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1418721045, i3, -1, "com.waze.ui.shared_drive.LiveShareScreen.<anonymous> (LiveShareScreen.kt:101)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(0.0f), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue;
            boolean zChanged = composer.changed(dVar == null);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                if (dVar == null) {
                    dVar2 = null;
                    fMo2468getMaxHeightD9Ej5fM = 0.0f;
                } else {
                    fMo2468getMaxHeightD9Ej5fM = boxWithConstraintsScope.mo2468getMaxHeightD9Ej5fM();
                    dVar2 = dVar;
                }
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m11162boximpl(fMo2468getMaxHeightD9Ej5fM), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            } else {
                dVar2 = dVar;
            }
            MutableState mutableState5 = (MutableState) objRememberedValue2;
            if (((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2) {
                composer.startReplaceGroup(-1654187737);
                companionWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(Modifier.Companion, WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composer, 6), WindowInsetsSides.Companion.m2873getStartJoeWqyM()));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1654082957);
                composer.endReplaceGroup();
                companionWindowInsetsPadding = Modifier.Companion;
            }
            Modifier modifierThen = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(Modifier.Companion, f2), 0.0f, 1, null).then(companionWindowInsetsPadding);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierThen);
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
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (pVar == null) {
                composer.startReplaceGroup(173535220);
                composer.endReplaceGroup();
                z = false;
            } else {
                composer.startReplaceGroup(173535221);
                Modifier modifierZIndex = ZIndexModifierKt.zIndex(boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getTopStart()), pVar2 != null ? 1.0f : 0.0f);
                boolean zChanged2 = composer.changed(density);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new com.waze.ui.u(density, mutableState4, 2);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierZIndex, (h.g.a.l) objRememberedValue3);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 6);
                int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierOnSizeChanged);
                h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                z = false;
                pVar.invoke(composer, 0);
                if (pVar2 == null) {
                    composer.startReplaceGroup(-941997626);
                } else {
                    composer.startReplaceGroup(-861671013);
                    pVar2.invoke(composer, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (dVar2 == null) {
                composer.startReplaceGroup(174473435);
                composer.endReplaceGroup();
                mutableState2 = mutableState4;
                mutableState3 = mutableState5;
                i4 = 1;
                i5 = 2;
            } else {
                composer.startReplaceGroup(174473436);
                Modifier modifierAlign = boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomStart());
                boolean zChanged3 = composer.changed(mutableState);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new gv(mutableState, 9);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                h.g.a.a aVar4 = (h.g.a.a) objRememberedValue4;
                boolean zChanged4 = composer.changed(mutableState5) | composer.changed(density);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new com.waze.ui.u(density, mutableState5, 3);
                    composer.updateRememberedValue(objRememberedValue5);
                }
                h.g.a.l lVar2 = (h.g.a.l) objRememberedValue5;
                mutableState2 = mutableState4;
                mutableState3 = mutableState5;
                i4 = 1;
                i5 = 2;
                b(dVar2, modifierAlign, aVar, aVar4, aVar, lVar2, lVar, aVar2, aVar3, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endNode();
            I(iVar, fVar, PaddingKt.m2758paddingqDBjuR0(WindowInsetsPaddingKt.windowInsetsPadding(PaddingKt.m2759paddingqDBjuR0$default(boxWithConstraintsScope.align(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, i4, null), ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == i5 ? 0.5f : 1.0f), Alignment.Companion.getBottomEnd()), 0.0f, ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == i4 ? E(mutableState2) : 0.0f, 0.0f, ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == i4 ? ((Dp) mutableState3.getValue()).m11178unboximpl() : 0.0f, 5, null), WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composer, 6), ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == i4 ? WindowInsetsSides.Companion.m2870getHorizontalJoeWqyM() : WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.Companion.m2874getTopJoeWqyM(), WindowInsetsSides.Companion.m2869getEndJoeWqyM()), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()))), 16.0f, ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == i5 ? 0.0f : 16.0f, 16.0f, 16.0f), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab s(Modifier modifier, com.waze.ui.p.i iVar, h.g.a.a aVar, int i2, Composer composer) {
        H(modifier, iVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void t(final d dVar, final f fVar, final com.waze.ui.p.i iVar, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.p pVar, final h.g.a.p pVar2, final Modifier modifier, final h.g.a.l lVar, final h.g.a.a aVar3, final h.g.a.a aVar4, Composer composer, final int i2, final int i3) {
        int i4;
        h.g.a.p pVar3;
        final h.g.a.p pVar4;
        h.g.a.l lVar2;
        h.g.a.a aVar5;
        h.g.a.a aVar6;
        int i5;
        Composer composer2;
        h.g.b.x.f(fVar, "liveShareDriveMapContent");
        h.g.b.x.f(iVar, "mapState");
        h.g.b.x.f(aVar, "onClose");
        h.g.b.x.f(aVar2, "onLeaveShareDrive");
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-390447829);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(fVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(iVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            pVar3 = pVar;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 65536 : 131072;
        } else {
            pVar3 = pVar;
        }
        if ((1572864 & i2) == 0) {
            pVar4 = pVar2;
            i4 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 524288 : 1048576;
        } else {
            pVar4 = pVar2;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            lVar2 = lVar;
            i4 |= true != composerStartRestartGroup.changedInstance(lVar2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            lVar2 = lVar;
        }
        if ((805306368 & i2) == 0) {
            aVar5 = aVar3;
            i4 |= true != composerStartRestartGroup.changedInstance(aVar5) ? 268435456 : 536870912;
        } else {
            aVar5 = aVar3;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            aVar6 = aVar4;
            i5 = i3 | (true != composerStartRestartGroup.changedInstance(aVar6) ? 2 : 4);
        } else {
            aVar6 = aVar4;
            i5 = i3;
        }
        if (composerStartRestartGroup.shouldExecute(((i7 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-390447829, i7, i5, "com.waze.ui.shared_drive.LiveShareScreen (LiveShareScreen.kt:94)");
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.ui.o.ac(9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48);
            float f2 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2 ? 0.5f : 1.0f;
            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            final float f3 = f2;
            final h.g.a.p pVar5 = pVar3;
            final h.g.a.l lVar3 = lVar2;
            final h.g.a.a aVar7 = aVar5;
            final h.g.a.a aVar8 = aVar6;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1418721045, true, new h.g.a.q() { // from class: com.waze.ui.z.r
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return as.r(dVar, f3, iVar, fVar, pVar5, pVar4, density, aVar, mutableState, lVar3, aVar7, aVar8, (BoxWithConstraintsScope) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(modifierFillMaxSize$default, null, false, composableLambdaRememberComposableLambda, composer2, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composer2.startReplaceGroup(-1055748695);
                boolean zChanged = composer2.changed(mutableState) | ((57344 & i7) == 16384);
                boolean z = (i7 & 7168) == 2048;
                Object objRememberedValue2 = composer2.rememberedValue();
                if ((zChanged | z) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.nav_connect.b.ab(aVar2, aVar, mutableState, 7);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                h.g.a.a aVar9 = (h.g.a.a) objRememberedValue2;
                boolean zChanged2 = composer2.changed(mutableState);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new gv(mutableState, 10);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                com.waze.ui.j.h.j(aVar9, (h.g.a.a) objRememberedValue3, composer2, 0);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1055519977);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.z.s
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    d dVar2 = dVar;
                    f fVar2 = fVar;
                    com.waze.ui.p.i iVar2 = iVar;
                    h.g.a.a aVar10 = aVar;
                    h.g.a.a aVar11 = aVar2;
                    h.g.a.p pVar6 = pVar;
                    h.g.a.p pVar7 = pVar2;
                    Modifier modifier2 = modifier;
                    h.g.a.l lVar4 = lVar;
                    h.g.a.a aVar12 = aVar3;
                    int i8 = i2;
                    as.t(dVar2, fVar2, iVar2, aVar10, aVar11, pVar6, pVar7, modifier2, lVar4, aVar12, aVar4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                    return h.ab.f48028a;
                }
            });
        }
    }

    static final h.ab u(com.waze.ui.p.i iVar, f fVar, Modifier modifier, int i2, Composer composer) {
        I(iVar, fVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void w(d dVar, Modifier modifier, final LazyListState lazyListState, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        h.g.a.l lVar2;
        Composer composer2;
        h.g.b.x.f(dVar, "content");
        h.g.b.x.f(lazyListState, "lazyListState");
        h.g.b.x.f(aVar2, "onCloseClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1679960777);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(dVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(lazyListState) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            lVar2 = lVar;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 65536 : 131072;
        } else {
            lVar2 = lVar;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1679960777, i5, -1, "com.waze.ui.shared_drive.LiveShareParticipantList (LiveShareParticipantList.kt:46)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            boolean zChanged = composerStartRestartGroup.changed(density);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = Float.valueOf(density.mo2127toPx0680j_4(2.0f));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final float fFloatValue = ((Number) objRememberedValue).floatValue();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new h.g.a.a() { // from class: com.waze.ui.z.m
                    @Override // h.g.a.a
                    public final Object invoke() {
                        LazyListState lazyListState2 = lazyListState;
                        int firstVisibleItemIndex = lazyListState2.getFirstVisibleItemIndex();
                        int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                        boolean z = true;
                        if (firstVisibleItemIndex <= 0 && firstVisibleItemScrollOffset <= fFloatValue) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State state = (State) objRememberedValue2;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            boolean z = (i5 & 14) == 4;
            boolean z2 = (i5 & 7168) == 2048;
            boolean z3 = (57344 & i5) == 16384;
            boolean z4 = (458752 & i5) == 131072;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((z | z2 | z3 | z4) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                com.waze.ui.r.a.a.h hVar = new com.waze.ui.r.a.a.h(dVar, aVar, aVar2, state, lVar2, 3);
                composerStartRestartGroup.updateRememberedValue(hVar);
                objRememberedValue3 = hVar;
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, lazyListState, null, false, null, null, null, false, null, (h.g.a.l) objRememberedValue3, composer2, (i5 >> 3) & 112, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.menus.a.b(dVar, modifier, lazyListState, aVar, aVar2, lVar, i2, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(com.waze.ui.z.aq r22, androidx.compose.ui.Modifier r23, boolean r24, h.g.a.l r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.ui.z.as.x(com.waze.ui.z.aq, androidx.compose.ui.Modifier, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final h.ab y(ak akVar, Modifier modifier, int i2, Composer composer) {
        J(akVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab z(an anVar, Modifier modifier, h.g.a.l lVar, int i2, Composer composer) {
        K(anVar, modifier, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }
}
