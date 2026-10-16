package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.material3.FloatingActionButtonMenuKt;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabLargeTokens;
import androidx.compose.material3.tokens.FabMediumTokens;
import androidx.compose.material3.tokens.FabMenuBaselineTokens;
import androidx.compose.material3.tokens.FabPrimaryContainerTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.g.b.aq;
import h.g.b.v;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FloatingActionButtonMenuKt {
    private static final float FabFinalCornerRadius;
    private static final float FabFinalIconSize;
    private static final float FabFinalSize;
    private static final float FabMenuButtonPaddingBottom;
    private static final float FabMenuItemContentPaddingEnd;
    private static final float FabMenuItemContentPaddingStart;
    private static final float FabMenuItemContentSpacingHorizontal;
    private static final float FabMenuItemHeight;
    private static final float FabMenuItemMinWidth;
    private static final float FabMenuItemSpacingVertical;
    private static final float FabMenuPaddingBottom;
    private static final float FabMenuPaddingHorizontal;
    private static final float FabShadowElevation;
    private static final HorizontalRuler MenuItemRuler = new HorizontalRuler();
    private static final float FabInitialSize = FabBaselineTokens.INSTANCE.m6701getContainerHeightD9Ej5fM();
    private static final float FabInitialCornerRadius = 16.0f;
    private static final float FabInitialIconSize = FabBaselineTokens.INSTANCE.m6703getIconSizeD9Ej5fM();
    private static final float FabMediumInitialSize = FabMediumTokens.INSTANCE.m6707getContainerHeightD9Ej5fM();
    private static final float FabMediumInitialCornerRadius = 20.0f;
    private static final float FabMediumInitialIconSize = FabMediumTokens.INSTANCE.m6709getIconSizeD9Ej5fM();
    private static final float FabLargeInitialSize = FabLargeTokens.INSTANCE.m6704getContainerHeightD9Ej5fM();
    private static final float FabLargeInitialCornerRadius = 28.0f;
    private static final float FabLargeInitialIconSize = 36.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3, reason: invalid class name */
    final class AnonymousClass3 implements MeasurePolicy {
        final /* synthetic */ a<Integer> $buttonHeight;
        final /* synthetic */ af $coroutineScope;
        final /* synthetic */ boolean $expanded;
        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
        final /* synthetic */ MutableIntState $itemCount$delegate;
        final /* synthetic */ MutableState<Boolean> $itemsNeedVerticalScroll$delegate;
        final /* synthetic */ aq<Constraints> $originalConstraints;
        final /* synthetic */ MutableState<Animatable<Integer, AnimationVector1D>> $staggerAnim$delegate;
        final /* synthetic */ aq<FiniteAnimationSpec<Integer>> $staggerAnimSpec;

        AnonymousClass3(boolean z, a<Integer> aVar, aq<Constraints> aqVar, MutableIntState mutableIntState, MutableState<Animatable<Integer, AnimationVector1D>> mutableState, af afVar, aq<FiniteAnimationSpec<Integer>> aqVar2, MutableState<Boolean> mutableState2, Alignment.Horizontal horizontal) {
            this.$expanded = z;
            this.$buttonHeight = aVar;
            this.$originalConstraints = aqVar;
            this.$itemCount$delegate = mutableIntState;
            this.$staggerAnim$delegate = mutableState;
            this.$coroutineScope = afVar;
            this.$staggerAnimSpec = aqVar2;
            this.$itemsNeedVerticalScroll$delegate = mutableState2;
            this.$horizontalAlignment = horizontal;
        }

        static final ab measure_3p2s80s$lambda$6(int i2, an anVar, RulerScope rulerScope) {
            rulerScope.provides(FloatingActionButtonMenuKt.MenuItemRuler, i2 - anVar.f48102a);
            return ab.f48028a;
        }

        static final ab measure_3p2s80s$lambda$7(List list, Alignment.Horizontal horizontal, int i2, MeasureScope measureScope, int i3, Placeable.PlacementScope placementScope) {
            int size = list.size();
            int i4 = 0;
            int height = 0;
            while (i4 < size) {
                Placeable placeable = (Placeable) list.get(i4);
                Placeable.PlacementScope placementScope2 = placementScope;
                Placeable.PlacementScope.place$default(placementScope2, placeable, horizontal.align(placeable.getWidth(), i2, measureScope.getLayoutDirection()), height, 0.0f, 4, null);
                height += placeable.getHeight();
                if (i4 < list.size() - 1) {
                    height += i3;
                }
                i4++;
                placementScope = placementScope2;
            }
            return ab.f48028a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo1704measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
            int i2;
            FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$2(this.$itemCount$delegate, list.size());
            int iFloatingActionButtonMenuItemColumn$lambda$1 = this.$expanded ? FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$1(this.$itemCount$delegate) : 0;
            MutableState<Animatable<Integer, AnimationVector1D>> mutableState = this.$staggerAnim$delegate;
            Animatable animatableFloatingActionButtonMenuItemColumn$lambda$7 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$7(mutableState);
            Object obj = null;
            if (animatableFloatingActionButtonMenuItemColumn$lambda$7 != null) {
                af afVar = this.$coroutineScope;
                aq<FiniteAnimationSpec<Integer>> aqVar = this.$staggerAnimSpec;
                if (((Number) animatableFloatingActionButtonMenuItemColumn$lambda$7.getTargetValue()).intValue() != iFloatingActionButtonMenuItemColumn$lambda$1) {
                    aj.z(afVar, null, null, new FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$1$1(animatableFloatingActionButtonMenuItemColumn$lambda$7, iFloatingActionButtonMenuItemColumn$lambda$1, aqVar, null), 3);
                }
            } else {
                animatableFloatingActionButtonMenuItemColumn$lambda$7 = new Animatable(Integer.valueOf(iFloatingActionButtonMenuItemColumn$lambda$1), VectorConvertersKt.getVectorConverter(v.f48128a), null, null, 12, null);
            }
            FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$8(mutableState, animatableFloatingActionButtonMenuItemColumn$lambda$7);
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(list.get(i3).mo9741measureBRTryo0(j2));
            }
            final ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                obj = arrayList2.get(0);
                int width = ((Placeable) obj).getWidth();
                int iE = i.e(arrayList2);
                if (iE > 0) {
                    int i4 = 1;
                    while (true) {
                        Object obj2 = arrayList2.get(i4);
                        int width2 = ((Placeable) obj2).getWidth();
                        int i5 = width < width2 ? width2 : width;
                        if (width < width2) {
                            obj = obj2;
                        }
                        if (i4 == iE) {
                            break;
                        }
                        i4++;
                        width = i5;
                    }
                }
            }
            Placeable placeable = (Placeable) obj;
            int width3 = placeable != null ? placeable.getWidth() : 0;
            final int i6 = measureScope.mo2121roundToPx0680j_4(FloatingActionButtonMenuKt.FabMenuItemSpacingVertical);
            ArrayList arrayList3 = arrayList2;
            int size2 = !arrayList3.isEmpty() ? (arrayList2.size() - 1) * i6 : 0;
            int iIntValue = this.$buttonHeight.invoke().intValue();
            int i7 = iIntValue > 0 ? iIntValue + measureScope.mo2121roundToPx0680j_4(FloatingActionButtonMenuKt.FabMenuButtonPaddingBottom) + measureScope.mo2121roundToPx0680j_4(FloatingActionButtonMenuKt.FabMenuPaddingBottom) : 0;
            int size3 = arrayList3.size();
            int height = 0;
            for (int i8 = 0; i8 < size3; i8++) {
                height += ((Placeable) arrayList2.get(i8)).getHeight();
            }
            final int i9 = height + size2 + i7;
            final an anVar = new an();
            anVar.f48102a = i7;
            MutableIntState mutableIntState = this.$itemCount$delegate;
            MutableState<Animatable<Integer, AnimationVector1D>> mutableState2 = this.$staggerAnim$delegate;
            int size4 = arrayList3.size();
            for (int i10 = 0; i10 < size4; i10++) {
                Placeable placeable2 = (Placeable) arrayList2.get(i10);
                int iFloatingActionButtonMenuItemColumn$lambda$12 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$1(mutableIntState);
                Animatable animatableFloatingActionButtonMenuItemColumn$lambda$72 = FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$7(mutableState2);
                if (i10 >= iFloatingActionButtonMenuItemColumn$lambda$12 - (animatableFloatingActionButtonMenuItemColumn$lambda$72 != null ? ((Number) animatableFloatingActionButtonMenuItemColumn$lambda$72.getValue()).intValue() : 0)) {
                    anVar.f48102a += placeable2.getHeight();
                    if (i10 < arrayList2.size() - 1) {
                        anVar.f48102a += i6;
                    }
                }
            }
            int size5 = arrayList3.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size5) {
                    i2 = 0;
                    break;
                }
                if (FloatingActionButtonMenuKt.isVisible((Placeable) arrayList2.get(i11))) {
                    i2 = i9;
                    break;
                }
                i11++;
            }
            MutableState<Boolean> mutableState3 = this.$itemsNeedVerticalScroll$delegate;
            Object obj3 = this.$originalConstraints.f48105a;
            x.c(obj3);
            FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$5(mutableState3, i2 > Constraints.m11106getMaxHeightimpl(((Constraints) obj3).m11113unboximpl()));
            l lVar = new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj4) {
                    return FloatingActionButtonMenuKt.AnonymousClass3.measure_3p2s80s$lambda$6(i9, anVar, (RulerScope) obj4);
                }
            };
            final Alignment.Horizontal horizontal = this.$horizontalAlignment;
            final int i12 = width3;
            return MeasureScope.CC.layout$default(measureScope, i12, i2, null, lVar, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$3$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj4) {
                    return FloatingActionButtonMenuKt.AnonymousClass3.measure_3p2s80s$lambda$7(arrayList2, horizontal, i12, measureScope, i6, (Placeable.PlacementScope) obj4);
                }
            }, 4, null);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i2);
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i2) {
            return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i2);
        }
    }

    static {
        float fM6712getCloseButtonContainerHeightD9Ej5fM = FabMenuBaselineTokens.INSTANCE.m6712getCloseButtonContainerHeightD9Ej5fM();
        FabFinalSize = fM6712getCloseButtonContainerHeightD9Ej5fM;
        FabFinalCornerRadius = fM6712getCloseButtonContainerHeightD9Ej5fM / 2.0f;
        FabFinalIconSize = FabMenuBaselineTokens.INSTANCE.m6714getCloseButtonIconSizeD9Ej5fM();
        FabShadowElevation = FabPrimaryContainerTokens.INSTANCE.m6722getContainerElevationD9Ej5fM();
        FabMenuPaddingHorizontal = 16.0f;
        FabMenuPaddingBottom = FabMenuBaselineTokens.INSTANCE.m6710getCloseButtonBetweenSpaceD9Ej5fM();
        FabMenuButtonPaddingBottom = 16.0f;
        FabMenuItemMinWidth = FabMenuBaselineTokens.INSTANCE.m6717getListItemContainerHeightD9Ej5fM();
        FabMenuItemHeight = FabMenuBaselineTokens.INSTANCE.m6717getListItemContainerHeightD9Ej5fM();
        FabMenuItemSpacingVertical = FabMenuBaselineTokens.INSTANCE.m6715getListItemBetweenSpaceD9Ej5fM();
        FabMenuItemContentPaddingStart = FabMenuBaselineTokens.INSTANCE.m6720getListItemLeadingSpaceD9Ej5fM();
        FabMenuItemContentPaddingEnd = FabMenuBaselineTokens.INSTANCE.m6721getListItemTrailingSpaceD9Ej5fM();
        FabMenuItemContentSpacingHorizontal = FabMenuBaselineTokens.INSTANCE.m6718getListItemIconLabelSpaceD9Ej5fM();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FloatingActionButtonMenu(final boolean r18, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r19, androidx.compose.ui.Modifier r20, androidx.compose.ui.Alignment.Horizontal r21, final h.g.a.q<? super androidx.compose.material3.FloatingActionButtonMenuScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonMenuKt.FloatingActionButtonMenu(boolean, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment$Horizontal, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FloatingActionButtonMenu$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    static final ab FloatingActionButtonMenu$lambda$6(boolean z, p pVar, Modifier modifier, Alignment.Horizontal horizontal, q qVar, int i2, int i3, Composer composer, int i4) {
        FloatingActionButtonMenu(z, pVar, modifier, horizontal, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* renamed from: FloatingActionButtonMenuItem-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4888FloatingActionButtonMenuItemWMdw5o4(final androidx.compose.material3.FloatingActionButtonMenuScope r24, final h.g.a.a<h.ab> r25, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.ui.Modifier r28, long r29, long r31, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonMenuKt.m4888FloatingActionButtonMenuItemWMdw5o4(androidx.compose.material3.FloatingActionButtonMenuScope, h.g.a.a, h.g.a.p, h.g.a.p, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void FloatingActionButtonMenuItemColumn(Modifier modifier, final boolean z, final Alignment.Horizontal horizontal, final a<Integer> aVar, final q<? super FloatingActionButtonMenuScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        a<Integer> aVar2;
        int i4;
        Modifier.Companion companionVerticalScroll$default;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-353421035);
        if (i5 == 0) {
            modifier2 = modifier;
            i3 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= true != composerStartRestartGroup.changed(z2) ? 16 : 32;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(horizontal) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            aVar2 = aVar;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-353421035, i3, -1, "androidx.compose.material3.FloatingActionButtonMenuItemColumn (FloatingActionButtonMenu.kt:197)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            final aq aqVar = new aq();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            af afVar = (af) objRememberedValue4;
            aq aqVar2 = new aq();
            aqVar2.f48105a = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowEffects, composerStartRestartGroup, 6);
            Object obj = aqVar2.f48105a;
            if (obj instanceof SpringSpec) {
                i4 = i3;
                aqVar2.f48105a = AnimationSpecKt.spring(((SpringSpec) aqVar2.f48105a).getDampingRatio(), ((SpringSpec) obj).getStiffness(), 1);
            } else {
                i4 = i3;
            }
            Modifier modifierClipToBounds = ClipKt.clipToBounds(modifier2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$9$0((SemanticsPropertyReceiver) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierLayout = LayoutModifierKt.layout(SemanticsModifierKt.semantics(modifierClipToBounds, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue5), new q() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda6
                @Override // h.g.a.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$10(aqVar, (MeasureScope) obj2, (Measurable) obj3, (Constraints) obj4);
                }
            });
            if (FloatingActionButtonMenuItemColumn$lambda$4(mutableState)) {
                composerStartRestartGroup.startReplaceGroup(-335134346);
                companionVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), z2, null, false, 12, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-335131491);
                composerStartRestartGroup.endReplaceGroup();
                companionVerticalScroll$default = Modifier.Companion;
            }
            Modifier modifierThen = modifierLayout.then(companionVerticalScroll$default);
            int i6 = i4;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(z, aVar2, aqVar, mutableIntState, mutableState2, afVar, aqVar2, mutableState, horizontal);
            int iM = FloatingActionButtonMenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, anonymousClass3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            int i7 = i6 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (i7 == 256 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new FloatingActionButtonMenuScope() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$4$scope$1$1
                    @Override // androidx.compose.material3.FloatingActionButtonMenuScope
                    public Alignment.Horizontal getHorizontalAlignment() {
                        return horizontal;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            qVar.invoke((FloatingActionButtonMenuKt$FloatingActionButtonMenuItemColumn$4$scope$1$1) objRememberedValue6, composerStartRestartGroup, Integer.valueOf((i6 >> 9) & 112));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$12(modifier3, z, horizontal, aVar, qVar, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FloatingActionButtonMenuItemColumn$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    static final MeasureResult FloatingActionButtonMenuItemColumn$lambda$10(aq aqVar, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        aqVar.f48105a = constraints;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda14
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingActionButtonMenuKt.FloatingActionButtonMenuItemColumn$lambda$10$0(placeableMo9741measureBRTryo0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FloatingActionButtonMenuItemColumn$lambda$10$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab FloatingActionButtonMenuItemColumn$lambda$12(Modifier modifier, boolean z, Alignment.Horizontal horizontal, a aVar, q qVar, int i2, Composer composer, int i3) {
        FloatingActionButtonMenuItemColumn(modifier, z, horizontal, aVar, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingActionButtonMenuItemColumn$lambda$2(MutableIntState mutableIntState, int i2) {
        mutableIntState.setIntValue(i2);
    }

    private static final boolean FloatingActionButtonMenuItemColumn$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingActionButtonMenuItemColumn$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animatable<Integer, AnimationVector1D> FloatingActionButtonMenuItemColumn$lambda$7(MutableState<Animatable<Integer, AnimationVector1D>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingActionButtonMenuItemColumn$lambda$8(MutableState<Animatable<Integer, AnimationVector1D>> mutableState, Animatable<Integer, AnimationVector1D> animatable) {
        mutableState.setValue(animatable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FloatingActionButtonMenuItemColumn$lambda$9$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, -0.9f);
        return ab.f48028a;
    }

    private static final Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$1(MutableState<Animatable<Float, AnimationVector1D>> mutableState) {
        return mutableState.getValue();
    }

    static final ab FloatingActionButtonMenuItem_WMdw5o4$lambda$10(FloatingActionButtonMenuScope floatingActionButtonMenuScope, a aVar, p pVar, p pVar2, Modifier modifier, long j2, long j3, int i2, int i3, Composer composer, int i4) {
        m4888FloatingActionButtonMenuItemWMdw5o4(floatingActionButtonMenuScope, aVar, pVar, pVar2, modifier, j2, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final Animatable<Float, AnimationVector1D> FloatingActionButtonMenuItem_WMdw5o4$lambda$4(MutableState<Animatable<Float, AnimationVector1D>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FloatingActionButtonMenuItem_WMdw5o4$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FloatingActionButtonMenuItem_WMdw5o4$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final ab FloatingActionButtonMenuItem_WMdw5o4$lambda$9(Modifier modifier, final af afVar, final FiniteAnimationSpec finiteAnimationSpec, final FiniteAnimationSpec finiteAnimationSpec2, a aVar, long j2, long j3, MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final p pVar, final p pVar2, Composer composer, int i2) {
        final MutableState mutableState4;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581009332, i2, -1, "androidx.compose.material3.FloatingActionButtonMenuItem.<anonymous> (FloatingActionButtonMenu.kt:346)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                mutableState4 = mutableState;
                objRememberedValue = new a() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$7(mutableState4));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            } else {
                mutableState4 = mutableState;
            }
            Modifier modifierItemVisible = itemVisible(modifier, (a) objRememberedValue);
            boolean zChangedInstance = composer.changedInstance(afVar) | composer.changedInstance(finiteAnimationSpec) | composer.changedInstance(finiteAnimationSpec2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                q qVar = new q() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0(mutableState2, afVar, finiteAnimationSpec, mutableState3, finiteAnimationSpec2, mutableState4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composer.updateRememberedValue(qVar);
                objRememberedValue2 = qVar;
            }
            SurfaceKt.m5672Surfaceo_FOJdg(aVar, LayoutModifierKt.layout(modifierItemVisible, (q) objRememberedValue2), false, ShapesKt.getValue(FabMenuBaselineTokens.INSTANCE.getListItemContainerShape(), composer, 6), j2, j3, 0.0f, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-267751263, true, new p() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2(floatingActionButtonMenuScope, mutableState2, pVar, pVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 0, 6, DisplayStrings.DS_ONBOARDING_VEHICLE_TYPE_SELECTION_TITLE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0(final MutableState mutableState, final af afVar, final FiniteAnimationSpec finiteAnimationSpec, final MutableState mutableState2, final FiniteAnimationSpec finiteAnimationSpec2, final MutableState mutableState3, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda21
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0(placeableMo9741measureBRTryo0, mutableState, afVar, finiteAnimationSpec, mutableState2, finiteAnimationSpec2, mutableState3, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0(Placeable placeable, MutableState mutableState, af afVar, FiniteAnimationSpec finiteAnimationSpec, MutableState mutableState2, FiniteAnimationSpec finiteAnimationSpec2, MutableState mutableState3, Placeable.PlacementScope placementScope) {
        float fCurrent = placementScope.current(MenuItemRuler, Float.POSITIVE_INFINITY);
        Animatable<Float, AnimationVector1D> animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1 = FloatingActionButtonMenuItem_WMdw5o4$lambda$1(mutableState);
        float f2 = fCurrent <= 0.0f ? 1.0f : 0.0f;
        if (animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1 == null) {
            animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1 = new Animatable<>(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a), null, null, 12, null);
        } else if (animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1.getTargetValue().floatValue() != f2) {
            aj.z(afVar, null, null, new FloatingActionButtonMenuKt$FloatingActionButtonMenuItem$1$2$1$1$1$1(animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1, f2, finiteAnimationSpec, null), 3);
        }
        mutableState.setValue(animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1);
        final Animatable<Float, AnimationVector1D> animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4 = FloatingActionButtonMenuItem_WMdw5o4$lambda$4(mutableState2);
        if (animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4 == null) {
            animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4 = new Animatable<>(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(h.g.b.q.f48127a), null, null, 12, null);
        } else if (animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4.getTargetValue().floatValue() != f2) {
            aj.z(afVar, null, null, new FloatingActionButtonMenuKt$FloatingActionButtonMenuItem$1$2$1$1$tempAlphaAnim$1$1(animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4, f2, finiteAnimationSpec2, null), 3);
        }
        mutableState2.setValue(animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4);
        FloatingActionButtonMenuItem_WMdw5o4$lambda$8(mutableState3, animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4.getValue().floatValue() != 0.0f);
        if (FloatingActionButtonMenuItem_WMdw5o4$lambda$7(mutableState3)) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda8
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2(animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$4, (GraphicsLayerScope) obj);
                }
            }, 4, (Object) null);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FloatingActionButtonMenuItem_WMdw5o4$lambda$9$1$0$0$2(Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setAlpha(((Number) animatable.getValue()).floatValue());
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2(final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final MutableState mutableState, p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-267751263, i2, -1, "androidx.compose.material3.FloatingActionButtonMenuItem.<anonymous>.<anonymous> (FloatingActionButtonMenu.kt:379)");
            }
            Modifier.Companion companion = Modifier.Companion;
            boolean zChangedInstance = composer.changedInstance(floatingActionButtonMenuScope);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new q() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda15
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0(mutableState, floatingActionButtonMenuScope, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.m2826sizeInqDBjuR0$default(LayoutModifierKt.layout(companion, (q) objRememberedValue), FabMenuItemMinWidth, FabMenuItemHeight, 0.0f, 0.0f, 12, null), FabMenuItemContentPaddingStart, 0.0f, FabMenuItemContentPaddingEnd, 0.0f, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m2441spacedByD5KLDUw(FabMenuItemContentSpacingHorizontal, Alignment.Companion.getCenterHorizontally()), Alignment.Companion.getCenterVertically(), composer, 54);
            int iM = FloatingActionButtonMenuKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
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
            Updater.m7351setimpl(composer, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            CompositionLocalKt.CompositionLocalProvider(TextKt.getLocalTextStyle().provides(MaterialTheme.INSTANCE.getTypography(composer, 6).getTitleMedium()), (p<? super Composer, ? super Integer, ab>) pVar2, composer, ProvidedValue.$stable);
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
    public static final MeasureResult FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0(MutableState mutableState, final FloatingActionButtonMenuScope floatingActionButtonMenuScope, final MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        float width = placeableMo9741measureBRTryo0.getWidth();
        Animatable<Float, AnimationVector1D> animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1 = FloatingActionButtonMenuItem_WMdw5o4$lambda$1(mutableState);
        final int iB = h.h.a.b(width * Math.max(animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1 != null ? animatableFloatingActionButtonMenuItem_WMdw5o4$lambda$1.getValue().floatValue() : 0.0f, 0.0f));
        return MeasureScope.CC.layout$default(measureScope, iB, placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda20
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingActionButtonMenuKt.FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0(floatingActionButtonMenuScope, placeableMo9741measureBRTryo0, iB, measureScope, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab FloatingActionButtonMenuItem_WMdw5o4$lambda$9$2$0$0$0(FloatingActionButtonMenuScope floatingActionButtonMenuScope, Placeable placeable, int i2, MeasureScope measureScope, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, floatingActionButtonMenuScope.getHorizontalAlignment().align(placeable.getWidth(), i2, measureScope.getLayoutDirection()), 0, 0.0f, (l) null, 12, (Object) null);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ToggleFloatingActionButton(final boolean r39, final h.g.a.l<? super java.lang.Boolean, h.ab> r40, final h.g.a.a<java.lang.Float> r41, androidx.compose.ui.Modifier r42, h.g.a.l<? super java.lang.Float, androidx.compose.ui.graphics.Color> r43, androidx.compose.ui.Alignment r44, h.g.a.l<? super java.lang.Float, androidx.compose.ui.unit.Dp> r45, h.g.a.l<? super java.lang.Float, androidx.compose.ui.unit.Dp> r46, final h.g.a.q<? super androidx.compose.material3.ToggleFloatingActionButtonScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r47, androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1147
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonMenuKt.ToggleFloatingActionButton(boolean, h.g.a.l, h.g.a.a, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ToggleFloatingActionButton$lambda$0$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    static final ab ToggleFloatingActionButton$lambda$1(boolean z, l lVar, Modifier modifier, l lVar2, Alignment alignment, l lVar3, l lVar4, q qVar, int i2, int i3, Composer composer, int i4) {
        ToggleFloatingActionButton(z, lVar, modifier, lVar2, alignment, lVar3, lVar4, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ToggleFloatingActionButton$lambda$3$1$0(Density density, l lVar, a aVar, Path path, Size size, LayoutDirection layoutDirection) {
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(((Dp) lVar.invoke(aVar.invoke())).m11178unboximpl());
        Path.CC.addRoundRect$default(path, RoundRectKt.m8035RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m8070toRectuvyYCjk(size.m8054unboximpl()), (Float.floatToRawIntBits(fMo2127toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo2127toPx0680j_4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), null, 2, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ToggleFloatingActionButton$lambda$3$2$0(GenericShape genericShape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo2127toPx0680j_4(FabShadowElevation));
        graphicsLayerScope.setShape(genericShape);
        graphicsLayerScope.setClip(true);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ToggleFloatingActionButton$lambda$3$3$0(Density density, l lVar, a aVar, l lVar2, DrawScope drawScope) {
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(((Dp) lVar2.invoke(aVar.invoke())).m11178unboximpl());
        DrawScope.CC.m8838drawRoundRectuAw5IA$default(drawScope, ((Color) lVar.invoke(aVar.invoke())).m8238unboximpl(), 0L, 0L, (Float.floatToRawIntBits(fMo2127toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo2127toPx0680j_4) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), null, 0.0f, null, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_DEFAULT_3, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ToggleFloatingActionButton$lambda$3$4$0(l lVar, a aVar, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        final int i2 = measureScope.mo2121roundToPx0680j_4(((Dp) lVar.invoke(aVar.invoke())).m11178unboximpl());
        return MeasureScope.CC.layout$default(measureScope, i2, i2, null, new l() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return FloatingActionButtonMenuKt.ToggleFloatingActionButton$lambda$3$4$0$0(placeableMo9741measureBRTryo0, i2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ToggleFloatingActionButton$lambda$3$4$0$0(Placeable placeable, int i2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, (i2 - placeable.getWidth()) / 2, (i2 - placeable.getHeight()) / 2, 0.0f, 4, null);
        return ab.f48028a;
    }

    static final ab ToggleFloatingActionButton$lambda$4(boolean z, l lVar, a aVar, Modifier modifier, l lVar2, Alignment alignment, l lVar3, l lVar4, q qVar, int i2, int i3, Composer composer, int i4) {
        ToggleFloatingActionButton(z, lVar, aVar, modifier, lVar2, alignment, lVar3, lVar4, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isVisible(Placeable placeable) {
        a<Boolean> visible;
        Object parentData = placeable.getParentData();
        MenuItemVisibilityModifier menuItemVisibilityModifier = parentData instanceof MenuItemVisibilityModifier ? (MenuItemVisibilityModifier) parentData : null;
        return menuItemVisibilityModifier == null || (visible = menuItemVisibilityModifier.getVisible()) == null || visible.invoke().booleanValue();
    }

    private static final Modifier itemVisible(Modifier modifier, a<Boolean> aVar) {
        return modifier.then(new MenuItemVisibleElement(aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ToggleFloatingActionButton(final boolean r21, final h.g.a.l<? super java.lang.Boolean, h.ab> r22, androidx.compose.ui.Modifier r23, h.g.a.l<? super java.lang.Float, androidx.compose.ui.graphics.Color> r24, androidx.compose.ui.Alignment r25, h.g.a.l<? super java.lang.Float, androidx.compose.ui.unit.Dp> r26, h.g.a.l<? super java.lang.Float, androidx.compose.ui.unit.Dp> r27, final h.g.a.q<? super androidx.compose.material3.ToggleFloatingActionButtonScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonMenuKt.ToggleFloatingActionButton(boolean, h.g.a.l, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.ui.Alignment, h.g.a.l, h.g.a.l, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
