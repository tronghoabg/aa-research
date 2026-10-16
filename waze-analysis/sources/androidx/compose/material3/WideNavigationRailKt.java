package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.internal.DraggableAnchorsKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationRailBaselineItemTokens;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailExpandedTokens;
import androidx.compose.material3.tokens.NavigationRailHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationRailVerticalItemTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailKt {
    private static final String HeaderLayoutIdTag = "header";
    private static final float PredictiveBackPivotFractionY = 0.5f;
    private static final float WNRItemNoLabelIndicatorPadding = (NavigationRailVerticalItemTokens.INSTANCE.m6896getActiveIndicatorWidthD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m6879getIconSizeD9Ej5fM()) / 2.0f;
    private static final float WNRItemHorizontalPadding = 20.0f;
    private static final float WNRVerticalPadding = NavigationRailCollapsedTokens.INSTANCE.m6884getTopSpaceD9Ej5fM();
    private static final float WNRHeaderPadding = NavigationRailBaselineItemTokens.INSTANCE.m6878getHeaderSpaceMinimumD9Ej5fM();
    private static final float CollapsedRailWidth = NavigationRailCollapsedTokens.INSTANCE.m6881getContainerWidthD9Ej5fM();
    private static final float ExpandedRailMinWidth = NavigationRailExpandedTokens.INSTANCE.m6887getContainerWidthMinimumD9Ej5fM();
    private static final float ExpandedRailMaxWidth = NavigationRailExpandedTokens.INSTANCE.m6886getContainerWidthMaximumD9Ej5fM();
    private static final float TopIconItemMinHeight = NavigationRailBaselineItemTokens.INSTANCE.m6876getContainerHeightD9Ej5fM();
    private static final float ItemTopIconIndicatorVerticalPadding = (NavigationRailVerticalItemTokens.INSTANCE.m6895getActiveIndicatorHeightD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m6879getIconSizeD9Ej5fM()) / 2.0f;
    private static final float ItemTopIconIndicatorHorizontalPadding = (NavigationRailVerticalItemTokens.INSTANCE.m6896getActiveIndicatorWidthD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m6879getIconSizeD9Ej5fM()) / 2.0f;
    private static final float ItemStartIconIndicatorVerticalPadding = (NavigationRailHorizontalItemTokens.INSTANCE.m6890getActiveIndicatorHeightD9Ej5fM() - NavigationRailBaselineItemTokens.INSTANCE.m6879getIconSizeD9Ej5fM()) / 2.0f;
    private static final float PredictiveBackMaxScaleXDistance = 24.0f;
    private static final float PredictiveBackMaxScaleYDistance = 48.0f;
    private static final ProvidableCompositionLocal<WideNavigationRailOverride> LocalWideNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda7
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultWideNavigationRailOverride.INSTANCE;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<ModalWideNavigationRailOverride> LocalModalWideNavigationRailOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda8
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultModalWideNavigationRailOverride.INSTANCE;
        }
    }, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: ModalWideNavigationRail-k3FuEkE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m6138ModalWideNavigationRailk3FuEkE(androidx.compose.ui.Modifier r34, androidx.compose.material3.WideNavigationRailState r35, boolean r36, androidx.compose.ui.graphics.Shape r37, androidx.compose.ui.graphics.Shape r38, androidx.compose.material3.WideNavigationRailColors r39, h.g.a.p r40, float r41, androidx.compose.foundation.layout.WindowInsets r42, androidx.compose.foundation.layout.Arrangement.Vertical r43, androidx.compose.material3.ModalWideNavigationRailProperties r44, final h.g.a.p r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.m6138ModalWideNavigationRailk3FuEkE(androidx.compose.ui.Modifier, androidx.compose.material3.WideNavigationRailState, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.ui.graphics.Shape, androidx.compose.material3.WideNavigationRailColors, h.g.a.p, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.material3.ModalWideNavigationRailProperties, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* renamed from: ModalWideNavigationRail-xKBSf-U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6139ModalWideNavigationRailxKBSfU(androidx.compose.ui.Modifier r42, androidx.compose.material3.WideNavigationRailState r43, boolean r44, androidx.compose.ui.graphics.Shape r45, androidx.compose.ui.graphics.Shape r46, androidx.compose.material3.WideNavigationRailColors r47, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r48, float r49, androidx.compose.foundation.layout.WindowInsets r50, androidx.compose.foundation.layout.Arrangement.Vertical r51, androidx.compose.material3.ModalWideNavigationRailProperties r52, androidx.compose.foundation.layout.PaddingValues r53, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.m6139ModalWideNavigationRailxKBSfU(androidx.compose.ui.Modifier, androidx.compose.material3.WideNavigationRailState, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.ui.graphics.Shape, androidx.compose.material3.WideNavigationRailColors, h.g.a.p, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.material3.ModalWideNavigationRailProperties, androidx.compose.foundation.layout.PaddingValues, h.g.a.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ModalWideNavigationRailContent-_zuB-KE, reason: not valid java name */
    public static final void m6140ModalWideNavigationRailContent_zuBKE(final boolean z, final boolean z2, final Animatable<Float, AnimationVector1D> animatable, final RailPredictiveBackState railPredictiveBackState, final l<? super e<? super ab>, ? extends Object> lVar, final Modifier modifier, final ModalWideNavigationRailState modalWideNavigationRailState, final WideNavigationRailColors wideNavigationRailColors, final Shape shape, final float f2, final p<? super Composer, ? super Integer, ab> pVar, final WindowInsets windowInsets, final boolean z3, final Arrangement.Vertical vertical, final PaddingValues paddingValues, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        p<? super Composer, ? super Integer, ab> pVar3;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        Composer composer2;
        int i9 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1307377989);
        if (i9 == 0) {
            i4 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable)) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(railPredictiveBackState) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 65536 : 131072;
        } else {
            i5 = 196608;
        }
        if ((1572864 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(modalWideNavigationRailState) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= true != composerStartRestartGroup.changed(wideNavigationRailColors) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(shape) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 268435456 : 536870912;
        }
        int i10 = i4;
        if ((i3 & 6) == 0) {
            pVar3 = pVar;
            i6 = i3 | (true != composerStartRestartGroup.changedInstance(pVar3) ? 2 : 4);
        } else {
            pVar3 = pVar;
            i6 = i3;
        }
        int i11 = i6;
        if ((i3 & 48) == 0) {
            i7 = i11 | (true == composerStartRestartGroup.changed(windowInsets) ? 32 : 16);
        } else {
            i7 = i11;
        }
        if ((i3 & 384) == 0) {
            z4 = z3;
            int i12 = i7;
            z5 = true;
            i8 = i12 | (true == composerStartRestartGroup.changed(z4) ? 256 : 128);
        } else {
            z4 = z3;
            i8 = i7;
            z5 = true;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i8 |= z5 == composerStartRestartGroup.changed(vertical) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i8 |= z5 == composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i8 |= z5 != composerStartRestartGroup.changedInstance(pVar2) ? 65536 : 131072;
        }
        int i13 = i8;
        if (composerStartRestartGroup.shouldExecute(((306783379 & i10) == 306783378 && (74899 & i13) == 74898) ? false : true, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1307377989, i10, i13, "androidx.compose.material3.ModalWideNavigationRailContent (WideNavigationRail.kt:1447)");
            }
            final boolean z6 = composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_wide_navigation_rail_pane_title, composerStartRestartGroup, 0);
            AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
            AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState$material3 = modalWideNavigationRailState.getAnchoredDraggableState$material3();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return Float.valueOf(WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$0$0(((Float) obj).floatValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = anchoredDraggableDefaults.flingBehavior(anchoredDraggableState$material3, objRememberedValue, modalWideNavigationRailState.getAnimationSpec(), composerStartRestartGroup, (AnchoredDraggableDefaults.$stable << 9) | 48, 0);
            boolean zChanged = composerStartRestartGroup.changed(targetedFlingBehaviorFlingBehavior);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1(targetedFlingBehaviorFlingBehavior, lVar);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1 = (WideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1) objRememberedValue2;
            long jM6130getModalContainerColor0d7_KjU = wideNavigationRailColors.m6130getModalContainerColor0d7_KjU();
            long jM6131getModalContentColor0d7_KjU = wideNavigationRailColors.m6131getModalContentColor0d7_KjU();
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m2829widthInVpY3zN4$default(modifier, 0.0f, f2, 1, null), 0.0f, 1, null);
            boolean zChanged2 = composerStartRestartGroup.changed(strM6375getString2EP1pXo);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda10
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$2$0(strM6375getString2EP1pXo, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierFillMaxHeight$default, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue3);
            boolean zChangedInstance = ((i10 & 7168) == 2048) | ((i10 & DisplayStrings.DS_TAP_TO_VERIFY) == 256 || ((i10 & 512) != 0 && composerStartRestartGroup.changedInstance(animatable))) | composerStartRestartGroup.changedInstance(modalWideNavigationRailState) | composerStartRestartGroup.changed(z6);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda11
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$3$0(animatable, modalWideNavigationRailState, railPredictiveBackState, z6, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierSemantics, (l) objRememberedValue4);
            AnchoredDraggableState<WideNavigationRailValue> anchoredDraggableState$material32 = modalWideNavigationRailState.getAnchoredDraggableState$material3();
            boolean z7 = (i10 & 112) == 32;
            Orientation orientation = Orientation.Horizontal;
            boolean zChangedInstance2 = z7 | composerStartRestartGroup.changedInstance(modalWideNavigationRailState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new p() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda12
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$4$0(z2, modalWideNavigationRailState, (IntSize) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(DraggableAnchorsKt.draggableAnchors(modifierGraphicsLayer, anchoredDraggableState$material32, orientation, (p) objRememberedValue5), modalWideNavigationRailState.getAnchoredDraggableState$material3(), Orientation.Horizontal, z4, null, null, wideNavigationRailKt$ModalWideNavigationRailContent$railFlingBehavior$1$1, 24, null);
            composer2 = composerStartRestartGroup;
            final p<? super Composer, ? super Integer, ab> pVar4 = pVar3;
            SurfaceKt.m5669SurfaceT9BRK9s(modifierAnchoredDraggable$default, shape, jM6130getModalContainerColor0d7_KjU, jM6131getModalContentColor0d7_KjU, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(131156832, true, new p() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda13
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$5(animatable, railPredictiveBackState, z6, z, wideNavigationRailColors, shape, pVar4, windowInsets, vertical, paddingValues, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, ((i10 >> 21) & 112) | 12582912, 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda14
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$6(z, z2, animatable, railPredictiveBackState, lVar, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f2, pVar, windowInsets, z3, vertical, paddingValues, pVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalWideNavigationRailContent__zuB_KE$lambda$0$0(float f2) {
        return f2 * 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalWideNavigationRailContent__zuB_KE$lambda$2$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalWideNavigationRailContent__zuB_KE$lambda$3$0(Animatable animatable, ModalWideNavigationRailState modalWideNavigationRailState, RailPredictiveBackState railPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float fFloatValue = ((Number) animatable.getValue()).floatValue();
        if (fFloatValue > 0.0f) {
            float currentOffset = modalWideNavigationRailState.getCurrentOffset();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() >> 32));
            if (!Float.isNaN(currentOffset) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue, railPredictiveBackState.getSwipeEdgeMatchesRail()));
                graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue));
                graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(true == z ? 1.0f : 0.0f, 0.5f));
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k ModalWideNavigationRailContent__zuB_KE$lambda$4$0(boolean z, ModalWideNavigationRailState modalWideNavigationRailState, IntSize intSize, Constraints constraints) {
        final float f2 = 0.0f;
        final float f3 = z ? -((int) (intSize.m11343unboximpl() >> 32)) : 0.0f;
        return new k(AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda16
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0(f3, f2, (DraggableAnchorsConfig) obj);
            }
        }), modalWideNavigationRailState.getTargetValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalWideNavigationRailContent__zuB_KE$lambda$4$0$0(float f2, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(WideNavigationRailValue.Collapsed, f2);
        draggableAnchorsConfig.at(WideNavigationRailValue.Expanded, f3);
        return ab.f48028a;
    }

    static final ab ModalWideNavigationRailContent__zuB_KE$lambda$5(final Animatable animatable, final RailPredictiveBackState railPredictiveBackState, final boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, p pVar, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(131156832, i2, -1, "androidx.compose.material3.ModalWideNavigationRailContent.<anonymous> (WideNavigationRail.kt:1524)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChangedInstance = composer.changedInstance(animatable) | composer.changed(railPredictiveBackState) | composer.changed(z);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return WideNavigationRailKt.ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0(animatable, railPredictiveBackState, z, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            WideNavigationRailLayout(GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue), true, z2, wideNavigationRailColors, shape, pVar, windowInsets, vertical, paddingValues, pVar2, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalWideNavigationRailContent__zuB_KE$lambda$5$0$0(Animatable animatable, RailPredictiveBackState railPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float fFloatValue = ((Number) animatable.getValue()).floatValue();
        if (fFloatValue <= 0.0f) {
            return ab.f48028a;
        }
        float fCalculatePredictiveBackScaleX = calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue, railPredictiveBackState.getSwipeEdgeMatchesRail());
        graphicsLayerScope.setScaleX(fCalculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue) / fCalculatePredictiveBackScaleX);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(true != z ? 1.0f : 0.0f, 0.5f));
        return ab.f48028a;
    }

    static final ab ModalWideNavigationRailContent__zuB_KE$lambda$6(boolean z, boolean z2, Animatable animatable, RailPredictiveBackState railPredictiveBackState, l lVar, Modifier modifier, ModalWideNavigationRailState modalWideNavigationRailState, WideNavigationRailColors wideNavigationRailColors, Shape shape, float f2, p pVar, WindowInsets windowInsets, boolean z3, Arrangement.Vertical vertical, PaddingValues paddingValues, p pVar2, int i2, int i3, Composer composer, int i4) {
        m6140ModalWideNavigationRailContent_zuBKE(z, z2, animatable, railPredictiveBackState, lVar, modifier, modalWideNavigationRailState, wideNavigationRailColors, shape, f2, pVar, windowInsets, z3, vertical, paddingValues, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return ab.f48028a;
    }

    static final ab ModalWideNavigationRail_k3FuEkE$lambda$0(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, p pVar, float f2, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, p pVar2, int i2, int i3, int i4, Composer composer, int i5) {
        m6138ModalWideNavigationRailk3FuEkE(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, pVar, f2, windowInsets, vertical, modalWideNavigationRailProperties, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab ModalWideNavigationRail_xKBSf_U$lambda$1(Modifier modifier, WideNavigationRailState wideNavigationRailState, boolean z, Shape shape, Shape shape2, WideNavigationRailColors wideNavigationRailColors, p pVar, float f2, WindowInsets windowInsets, Arrangement.Vertical vertical, ModalWideNavigationRailProperties modalWideNavigationRailProperties, PaddingValues paddingValues, p pVar2, int i2, int i3, int i4, Composer composer, int i5) {
        m6139ModalWideNavigationRailxKBSfU(modifier, wideNavigationRailState, z, shape, shape2, wideNavigationRailColors, pVar, f2, windowInsets, vertical, modalWideNavigationRailProperties, paddingValues, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WideNavigationRail(androidx.compose.ui.Modifier r27, androidx.compose.material3.WideNavigationRailState r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.WideNavigationRailColors r30, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.layout.PaddingValues r34, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.WideNavigationRail(androidx.compose.ui.Modifier, androidx.compose.material3.WideNavigationRailState, androidx.compose.ui.graphics.Shape, androidx.compose.material3.WideNavigationRailColors, h.g.a.p, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.PaddingValues, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab WideNavigationRail$lambda$1(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, p pVar, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, p pVar2, int i2, int i3, Composer composer, int i4) {
        WideNavigationRail(modifier, wideNavigationRailState, shape, wideNavigationRailColors, pVar, windowInsets, vertical, paddingValues, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab WideNavigationRail$lambda$2(Modifier modifier, WideNavigationRailState wideNavigationRailState, Shape shape, WideNavigationRailColors wideNavigationRailColors, p pVar, WindowInsets windowInsets, Arrangement.Vertical vertical, p pVar2, int i2, int i3, Composer composer, int i4) {
        WideNavigationRail(modifier, wideNavigationRailState, shape, wideNavigationRailColors, pVar, windowInsets, vertical, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /* renamed from: WideNavigationRailItem-U_vOP4k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6141WideNavigationRailItemU_vOP4k(final boolean r36, final h.g.a.a<h.ab> r37, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, final boolean r40, androidx.compose.ui.Modifier r41, boolean r42, int r43, androidx.compose.material3.NavigationItemColors r44, androidx.compose.foundation.interaction.MutableInteractionSource r45, androidx.compose.foundation.layout.PaddingValues r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.m6141WideNavigationRailItemU_vOP4k(boolean, h.g.a.a, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.Modifier, boolean, int, androidx.compose.material3.NavigationItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ff  */
    /* renamed from: WideNavigationRailItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m6142WideNavigationRailItemplit6k(final boolean r28, final h.g.a.a r29, final h.g.a.p r30, final h.g.a.p r31, androidx.compose.ui.Modifier r32, boolean r33, boolean r34, int r35, androidx.compose.material3.NavigationItemColors r36, androidx.compose.foundation.interaction.MutableInteractionSource r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.m6142WideNavigationRailItemplit6k(boolean, h.g.a.a, h.g.a.p, h.g.a.p, androidx.compose.ui.Modifier, boolean, boolean, int, androidx.compose.material3.NavigationItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab WideNavigationRailItem_U_vOP4k$lambda$1(boolean z, a aVar, p pVar, p pVar2, boolean z2, Modifier modifier, boolean z3, int i2, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, PaddingValues paddingValues, int i3, int i4, int i5, Composer composer, int i6) {
        m6141WideNavigationRailItemU_vOP4k(z, aVar, pVar, pVar2, z2, modifier, z3, i2, navigationItemColors, mutableInteractionSource, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    static final ab WideNavigationRailItem_pli_t6k$lambda$0(boolean z, a aVar, p pVar, p pVar2, boolean z2, Modifier modifier, boolean z3, int i2, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i3, int i4, Composer composer, int i5) {
        m6143WideNavigationRailItemplit6k(z, aVar, pVar, pVar2, z2, modifier, z3, i2, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab WideNavigationRailItem_pli_t6k$lambda$1(boolean z, a aVar, p pVar, p pVar2, Modifier modifier, boolean z2, boolean z3, int i2, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i3, int i4, Composer composer, int i5) {
        m6142WideNavigationRailItemplit6k(z, aVar, pVar, pVar2, modifier, z2, z3, i2, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WideNavigationRailLayout(final Modifier modifier, final boolean z, final boolean z2, final WideNavigationRailColors wideNavigationRailColors, final Shape shape, final p<? super Composer, ? super Integer, ab> pVar, final WindowInsets windowInsets, final Arrangement.Vertical vertical, final PaddingValues paddingValues, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        WideNavigationRailColors wideNavigationRailColors2;
        final boolean z3;
        float fM11178unboximpl;
        float f2;
        boolean z4;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1072361515);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            wideNavigationRailColors2 = wideNavigationRailColors;
            i3 |= true != composerStartRestartGroup.changed(wideNavigationRailColors2) ? 1024 : 2048;
        } else {
            wideNavigationRailColors2 = wideNavigationRailColors;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(windowInsets) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= true != composerStartRestartGroup.changed(vertical) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 268435456 : 536870912;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i3) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072361515, i3, -1, "androidx.compose.material3.WideNavigationRailLayout (WideNavigationRail.kt:285)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue2;
            if (Dp.m11169equalsimpl0(((Dp) composerStartRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl(), Dp.Companion.m11184getUnspecifiedD9Ej5fM())) {
                composerStartRestartGroup.startReplaceGroup(-754580399);
                composerStartRestartGroup.endReplaceGroup();
                fM11178unboximpl = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(-754545431);
                fM11178unboximpl = ((Dp) composerStartRestartGroup.consume(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize())).m11178unboximpl();
                composerStartRestartGroup.endReplaceGroup();
            }
            final float f3 = fM11178unboximpl;
            FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composerStartRestartGroup, 6);
            FiniteAnimationSpec finiteAnimationSpecValue2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastSpatial, composerStartRestartGroup, 6);
            float f4 = !z2 ? CollapsedRailWidth : ExpandedRailMinWidth;
            if (true != z) {
                finiteAnimationSpecValue2 = finiteAnimationSpecValue;
            }
            FiniteAnimationSpec finiteAnimationSpec = finiteAnimationSpecValue2;
            final State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(f4, finiteAnimationSpec, null, null, composerStartRestartGroup, 0, 12);
            final State<Dp> stateM1867animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(!z2 ? CollapsedRailWidth : ExpandedRailMaxWidth, finiteAnimationSpec, null, null, composerStartRestartGroup, 0, 12);
            FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpecValue;
            final State<Dp> stateM1867animateDpAsStateAjpBEmI3 = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(z2 ? 0.0f : NavigationRailCollapsedTokens.INSTANCE.m6882getItemVerticalSpaceD9Ej5fM(), finiteAnimationSpec2, null, null, composerStartRestartGroup, 0, 12);
            if (z2) {
                f2 = f3;
                z4 = true;
            } else {
                f2 = TopIconItemMinHeight;
                z4 = false;
            }
            final State<Dp> stateM1867animateDpAsStateAjpBEmI4 = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(f2, finiteAnimationSpec2, null, null, composerStartRestartGroup, 0, 12);
            int i5 = i3;
            SurfaceKt.m5669SurfaceT9BRK9s(modifier, shape, !z ? wideNavigationRailColors2.m6128getContainerColor0d7_KjU() : wideNavigationRailColors2.m6130getModalContainerColor0d7_KjU(), !z ? wideNavigationRailColors2.m6129getContentColor0d7_KjU() : wideNavigationRailColors2.m6131getModalContentColor0d7_KjU(), 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(512862384, true, new p() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda18
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return WideNavigationRailKt.WideNavigationRailLayout$lambda$10(windowInsets, paddingValues, pVar, z2, f3, stateM1867animateDpAsStateAjpBEmI, stateM1867animateDpAsStateAjpBEmI4, stateM1867animateDpAsStateAjpBEmI2, mutableIntState2, mutableIntState, vertical, stateM1867animateDpAsStateAjpBEmI3, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 12582912 | ((i5 >> 9) & 112), 112);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda19
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return WideNavigationRailKt.WideNavigationRailLayout$lambda$11(modifier, z, z3, wideNavigationRailColors, shape, pVar, windowInsets, vertical, paddingValues, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WideNavigationRailLayout$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    static final ab WideNavigationRailLayout$lambda$10(WindowInsets windowInsets, PaddingValues paddingValues, p pVar, boolean z, float f2, State state, State state2, State state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State state4, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(512862384, i2, -1, "androidx.compose.material3.WideNavigationRailLayout.<anonymous> (WideNavigationRail.kt:325)");
            }
            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.padding(SizeKt.m2829widthInVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), windowInsets), 0.0f, ExpandedRailMaxWidth, 1, null), paddingValues));
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.WideNavigationRailKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return WideNavigationRailKt.WideNavigationRailLayout$lambda$10$0$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierSelectableGroup, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue);
            WideNavigationRailKt$WideNavigationRailLayout$1$2 wideNavigationRailKt$WideNavigationRailLayout$1$2 = new WideNavigationRailKt$WideNavigationRailLayout$1$2(pVar, z, f2, state, state2, state3, mutableIntState, mutableIntState2, vertical, state4);
            int iM = WideNavigationRailKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierSemantics);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, wideNavigationRailKt$WideNavigationRailLayout$1$2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            if (pVar != null) {
                composer.startReplaceGroup(1497295659);
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, HeaderLayoutIdTag);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int iM2 = WideNavigationRailKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierLayoutId);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composer, Integer.valueOf(iM2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1497385993);
                composer.endReplaceGroup();
            }
            pVar2.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab WideNavigationRailLayout$lambda$10$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    static final ab WideNavigationRailLayout$lambda$11(Modifier modifier, boolean z, boolean z2, WideNavigationRailColors wideNavigationRailColors, Shape shape, p pVar, WindowInsets windowInsets, Arrangement.Vertical vertical, PaddingValues paddingValues, p pVar2, int i2, Composer composer, int i3) {
        WideNavigationRailLayout(modifier, z, z2, wideNavigationRailColors, shape, pVar, windowInsets, vertical, paddingValues, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WideNavigationRailLayout$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$6(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$7(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$8(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float WideNavigationRailLayout$lambda$9(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f2, boolean z) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return (((true != z ? -1.0f : 1.0f) * MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo2127toPx0680j_4(PredictiveBackMaxScaleXDistance), fIntBitsToFloat), f2)) / fIntBitsToFloat) + 1.0f;
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo2127toPx0680j_4(PredictiveBackMaxScaleYDistance), fIntBitsToFloat), f2) / fIntBitsToFloat);
    }

    public static final ProvidableCompositionLocal<ModalWideNavigationRailOverride> getLocalModalWideNavigationRailOverride() {
        return LocalModalWideNavigationRailOverride;
    }

    public static final ProvidableCompositionLocal<WideNavigationRailOverride> getLocalWideNavigationRailOverride() {
        return LocalWideNavigationRailOverride;
    }

    public static final float getWNRItemHorizontalPadding() {
        return WNRItemHorizontalPadding;
    }

    public static final float getWNRItemNoLabelIndicatorPadding() {
        return WNRItemNoLabelIndicatorPadding;
    }

    public static /* synthetic */ void getLocalModalWideNavigationRailOverride$annotations() {
    }

    public static /* synthetic */ void getLocalWideNavigationRailOverride$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void WideNavigationRail(androidx.compose.ui.Modifier r24, androidx.compose.material3.WideNavigationRailState r25, androidx.compose.ui.graphics.Shape r26, androidx.compose.material3.WideNavigationRailColors r27, h.g.a.p r28, androidx.compose.foundation.layout.WindowInsets r29, androidx.compose.foundation.layout.Arrangement.Vertical r30, final h.g.a.p r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.WideNavigationRail(androidx.compose.ui.Modifier, androidx.compose.material3.WideNavigationRailState, androidx.compose.ui.graphics.Shape, androidx.compose.material3.WideNavigationRailColors, h.g.a.p, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.layout.Arrangement$Vertical, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* renamed from: WideNavigationRailItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void m6143WideNavigationRailItemplit6k(final boolean r23, final h.g.a.a r24, final h.g.a.p r25, final h.g.a.p r26, final boolean r27, androidx.compose.ui.Modifier r28, boolean r29, int r30, androidx.compose.material3.NavigationItemColors r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WideNavigationRailKt.m6143WideNavigationRailItemplit6k(boolean, h.g.a.a, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.Modifier, boolean, int, androidx.compose.material3.NavigationItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }
}
