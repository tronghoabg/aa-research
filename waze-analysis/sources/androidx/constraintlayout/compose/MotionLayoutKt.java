package androidx.constraintlayout.compose;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.compose.MotionLayoutKt;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionLayoutKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1, reason: invalid class name */
    final class AnonymousClass1 implements MeasurePolicy {
        final /* synthetic */ Ref<CompositionSource> $compositionSource;
        final /* synthetic */ ConstraintSet $constraintSetEnd;
        final /* synthetic */ ConstraintSet $constraintSetStart;
        final /* synthetic */ androidx.compose.runtime.State<ab> $contentTracker;
        final /* synthetic */ InvalidationStrategy $invalidationStrategy;
        final /* synthetic */ MotionMeasurer $measurer;
        final /* synthetic */ MutableFloatState $motionProgress;
        final /* synthetic */ int $optimizationLevel;
        final /* synthetic */ TransitionImpl $transition;

        AnonymousClass1(androidx.compose.runtime.State<ab> state, MotionMeasurer motionMeasurer, ConstraintSet constraintSet, ConstraintSet constraintSet2, TransitionImpl transitionImpl, int i2, MutableFloatState mutableFloatState, Ref<CompositionSource> ref, InvalidationStrategy invalidationStrategy) {
            this.$contentTracker = state;
            this.$measurer = motionMeasurer;
            this.$constraintSetStart = constraintSet;
            this.$constraintSetEnd = constraintSet2;
            this.$transition = transitionImpl;
            this.$optimizationLevel = i2;
            this.$motionProgress = mutableFloatState;
            this.$compositionSource = ref;
            this.$invalidationStrategy = invalidationStrategy;
        }

        static final ab measure_3p2s80s$lambda$0(MotionMeasurer motionMeasurer, List list, Map map, Placeable.PlacementScope placementScope) {
            motionMeasurer.performLayout(placementScope, list, map);
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
        public final MeasureResult mo1704measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j2) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.$contentTracker.getValue();
            Ref<CompositionSource> ref = this.$compositionSource;
            MutableFloatState mutableFloatState = this.$motionProgress;
            LayoutDirection layoutDirection = measureScope.getLayoutDirection();
            float floatValue = mutableFloatState.getFloatValue();
            CompositionSource value = ref.getValue();
            if (value == null) {
                value = CompositionSource.Unknown;
            }
            int i2 = this.$optimizationLevel;
            TransitionImpl transitionImpl = this.$transition;
            ConstraintSet constraintSet = this.$constraintSetEnd;
            ConstraintSet constraintSet2 = this.$constraintSetStart;
            long jM11606performInterpolationMeasureLzAeyeM = this.$measurer.m11606performInterpolationMeasureLzAeyeM(j2, layoutDirection, constraintSet2, constraintSet, transitionImpl, list, linkedHashMap, i2, floatValue, value, this.$invalidationStrategy.getShouldInvalidate$constraintlayout_compose());
            this.$compositionSource.setValue(CompositionSource.Unknown);
            int iM11339getWidthimpl = IntSize.m11339getWidthimpl(jM11606performInterpolationMeasureLzAeyeM);
            int iM11338getHeightimpl = IntSize.m11338getHeightimpl(jM11606performInterpolationMeasureLzAeyeM);
            final MotionMeasurer motionMeasurer = this.$measurer;
            return MeasureScope.CC.layout$default(measureScope, iM11339getWidthimpl, iM11338getHeightimpl, null, new l() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return MotionLayoutKt.AnonymousClass1.measure_3p2s80s$lambda$0(motionMeasurer, list, linkedHashMap, (Placeable.PlacementScope) obj);
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

    /* renamed from: MotionLayout-6oYECBM, reason: not valid java name */
    public static final void m11579MotionLayout6oYECBM(MotionScene motionScene, float f2, Modifier modifier, String str, int i2, int i3, InvalidationStrategy invalidationStrategy, final q<? super MotionLayoutScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i4, int i5) {
        Modifier modifier2 = (i5 & 4) != 0 ? Modifier.Companion : modifier;
        String str2 = (i5 & 8) != 0 ? "default" : str;
        int iM11523getNonebfy_xzQ = (i5 & 16) != 0 ? DebugFlags.Companion.m11523getNonebfy_xzQ() : i2;
        int i6 = (i5 & 32) != 0 ? 257 : i3;
        final InvalidationStrategy defaultInvalidationStrategy = (i5 & 64) != 0 ? InvalidationStrategy.Companion.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        m11582MotionLayoutCoreSehEMGo(motionScene, f2, str2, i6, iM11523getNonebfy_xzQ, modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(1494814620, true, new q<MotionLayoutScope, Composer, Integer, ab>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$2
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i7) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1494814620, i7, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:264)");
                }
                mutableState.setValue(ab.f48028a);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                qVar.invoke(motionLayoutScope, composer2, Integer.valueOf(i7 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ ab invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return ab.f48028a;
            }
        }, composer, 54), composer, (i4 & 14) | 806879232 | (i4 & 112) | ((i4 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 >> 6) & 7168) | (i4 & 57344) | (458752 & (i4 << 9)) | (Ref.$stable << 21) | ((i4 << 6) & 234881024));
    }

    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m11580MotionLayoutT3LJ6Qw(ConstraintSet constraintSet, ConstraintSet constraintSet2, float f2, Modifier modifier, Transition transition, int i2, int i3, InvalidationStrategy invalidationStrategy, final q<? super MotionLayoutScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i4, int i5) {
        Modifier modifier2 = (i5 & 8) != 0 ? Modifier.Companion : modifier;
        Transition transition2 = (i5 & 16) != 0 ? null : transition;
        int iM11523getNonebfy_xzQ = (i5 & 32) != 0 ? DebugFlags.Companion.m11523getNonebfy_xzQ() : i2;
        int i6 = (i5 & 64) != 0 ? 257 : i3;
        final InvalidationStrategy defaultInvalidationStrategy = (i5 & 128) != 0 ? InvalidationStrategy.Companion.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        MotionLayoutCore(constraintSet, constraintSet2, transition2, f2, null, i6, DebugFlags.m11516getShowBoundsimpl(iM11523getNonebfy_xzQ), DebugFlags.m11518getShowPathsimpl(iM11523getNonebfy_xzQ), DebugFlags.m11517getShowKeyPositionsimpl(iM11523getNonebfy_xzQ), modifier2, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(511777000, true, new q<MotionLayoutScope, Composer, Integer, ab>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$1
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i7) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(511777000, i7, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
                }
                mutableState.setValue(ab.f48028a);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                qVar.invoke(motionLayoutScope, composer2, Integer.valueOf(i7 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ ab invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return ab.f48028a;
            }
        }, composer, 54), composer, (i4 & 14) | 24576 | (i4 & 112) | ((i4 >> 6) & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 << 3) & 7168) | (458752 & (i4 >> 3)) | ((i4 << 18) & C.ENCODING_PCM_DOUBLE), (Ref.$stable << 3) | DisplayStrings.DS_AAOS_SOUND_OFF | ((i4 >> 15) & DisplayStrings.DS_TAP_TO_VERIFY));
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0390  */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionLayoutCore(final androidx.constraintlayout.compose.ConstraintSet r30, final androidx.constraintlayout.compose.ConstraintSet r31, final androidx.constraintlayout.compose.Transition r32, final float r33, final androidx.constraintlayout.compose.LayoutInformationReceiver r34, final int r35, boolean r36, final boolean r37, final boolean r38, final androidx.compose.ui.Modifier r39, final androidx.compose.runtime.MutableState<h.ab> r40, final androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r41, final androidx.constraintlayout.compose.InvalidationStrategy r42, final h.g.a.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.MotionLayoutCore(androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.ConstraintSet, androidx.constraintlayout.compose.Transition, float, androidx.constraintlayout.compose.LayoutInformationReceiver, int, boolean, boolean, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.MutableState, androidx.compose.ui.node.Ref, androidx.constraintlayout.compose.InvalidationStrategy, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MotionLayoutCore$lambda$4$0(MutableState mutableState, Ref ref, Object obj) {
        ab abVar = ab.f48028a;
        mutableState.setValue(abVar);
        if (ref.getValue() == CompositionSource.Unknown) {
            ref.setValue(CompositionSource.Content);
        }
        return abVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MotionLayoutCore$lambda$5$0(MotionMeasurer motionMeasurer, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, motionMeasurer);
        return ab.f48028a;
    }

    static final ab MotionLayoutCore$lambda$6(q qVar, MotionLayoutScope motionLayoutScope, Composer composer, int i2) {
        if ((i2 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-767824957, i2, -1, "androidx.constraintlayout.compose.MotionLayoutCore.<anonymous> (MotionLayout.kt:677)");
            }
            qVar.invoke(motionLayoutScope, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return ab.f48028a;
    }

    static final ab MotionLayoutCore$lambda$7(ConstraintSet constraintSet, ConstraintSet constraintSet2, Transition transition, float f2, LayoutInformationReceiver layoutInformationReceiver, int i2, boolean z, boolean z2, boolean z3, Modifier modifier, MutableState mutableState, Ref ref, InvalidationStrategy invalidationStrategy, q qVar, int i3, int i4, Composer composer, int i5) {
        MotionLayoutCore(constraintSet, constraintSet2, transition, f2, layoutInformationReceiver, i2, z, z2, z3, modifier, mutableState, ref, invalidationStrategy, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
        return ab.f48028a;
    }

    /* renamed from: MotionLayoutCore-SehEMGo, reason: not valid java name */
    public static final void m11582MotionLayoutCoreSehEMGo(final MotionScene motionScene, final float f2, final String str, final int i2, final int i3, final Modifier modifier, final MutableState<ab> mutableState, final Ref<CompositionSource> ref, final InvalidationStrategy invalidationStrategy, final q<? super MotionLayoutScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i4) {
        int i5;
        float f3;
        int i6;
        Modifier modifier2;
        MutableState<ab> mutableState2;
        InvalidationStrategy invalidationStrategy2;
        String startConstraintSetId;
        String endConstraintSetId;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        p<? super Composer, ? super Integer, ab> pVar;
        Composer composer2;
        int i7 = i4 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1537813217);
        if (i7 == 0) {
            i5 = (true != composerStartRestartGroup.changed(motionScene) ? 2 : 4) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            f3 = f2;
            i5 |= true != composerStartRestartGroup.changed(f3) ? 16 : 32;
        } else {
            f3 = f2;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str) ? 128 : 256;
        }
        if ((i4 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(i2) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 = i3;
            i5 |= true != composerStartRestartGroup.changed(i6) ? 8192 : 16384;
        } else {
            i6 = i3;
        }
        if ((196608 & i4) == 0) {
            modifier2 = modifier;
            i5 |= true != composerStartRestartGroup.changed(modifier2) ? 65536 : 131072;
        } else {
            modifier2 = modifier;
        }
        if ((1572864 & i4) == 0) {
            mutableState2 = mutableState;
            i5 |= true != composerStartRestartGroup.changed(mutableState2) ? 524288 : 1048576;
        } else {
            mutableState2 = mutableState;
        }
        if ((12582912 & i4) == 0) {
            i5 |= true != ((16777216 & i4) == 0 ? composerStartRestartGroup.changed(ref) : composerStartRestartGroup.changedInstance(ref)) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            invalidationStrategy2 = invalidationStrategy;
            i5 |= true != composerStartRestartGroup.changedInstance(invalidationStrategy2) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            invalidationStrategy2 = invalidationStrategy;
        }
        if ((805306368 & i4) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(qVar) ? 268435456 : 536870912;
        }
        if ((306783379 & i5) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1537813217, i5, -1, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:523)");
            }
            boolean z = (i5 & 14) == 4;
            boolean z2 = (i5 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = motionScene.getTransitionInstance(str);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Transition transition = (Transition) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(transition) | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                if (transition == null || (startConstraintSetId = transition.getStartConstraintSetId()) == null) {
                    startConstraintSetId = TtmlNode.START;
                }
                objRememberedValue2 = motionScene.getConstraintSetInstance(startConstraintSetId);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ConstraintSet constraintSet = (ConstraintSet) objRememberedValue2;
            boolean zChanged2 = z | composerStartRestartGroup.changed(transition);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                if (transition == null || (endConstraintSetId = transition.getEndConstraintSetId()) == null) {
                    endConstraintSetId = TtmlNode.END;
                }
                objRememberedValue3 = motionScene.getConstraintSetInstance(endConstraintSetId);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ConstraintSet constraintSet2 = (ConstraintSet) objRememberedValue3;
            if (constraintSet == null || constraintSet2 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    pVar = new p() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$$ExternalSyntheticLambda10
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return MotionLayoutKt.MotionLayoutCore_SehEMGo$lambda$3(motionScene, f2, str, i2, i3, modifier, mutableState, ref, invalidationStrategy, qVar, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(pVar);
                }
                return;
            }
            int i8 = i5 << 6;
            int i9 = i5 << 12;
            int i10 = i5 >> 18;
            composer2 = composerStartRestartGroup;
            MotionLayoutCore(constraintSet, constraintSet2, transition, f3, motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null, i2, DebugFlags.m11516getShowBoundsimpl(i6), DebugFlags.m11518getShowPathsimpl(i6), DebugFlags.m11517getShowKeyPositionsimpl(i3), modifier2, mutableState2, ref, invalidationStrategy2, qVar, composer2, (i8 & 465920) | (i9 & C.ENCODING_PCM_DOUBLE), (i10 & 14) | (Ref.$stable << 3) | (i10 & 112) | (i10 & DisplayStrings.DS_TAP_TO_VERIFY) | (i10 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            pVar = new p() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$$ExternalSyntheticLambda11
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MotionLayoutKt.MotionLayoutCore_SehEMGo$lambda$4(motionScene, f2, str, i2, i3, modifier, mutableState, ref, invalidationStrategy, qVar, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(pVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /* renamed from: MotionLayoutCore-TEds9UA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11583MotionLayoutCoreTEds9UA(final androidx.constraintlayout.compose.MotionScene r23, final java.lang.String r24, final androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, androidx.compose.ui.Modifier r26, h.g.a.a<h.ab> r27, int r28, int r29, final androidx.compose.runtime.MutableState<h.ab> r30, final androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r31, final androidx.constraintlayout.compose.InvalidationStrategy r32, final h.g.a.q<? super androidx.constraintlayout.compose.MotionLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt.m11583MotionLayoutCoreTEds9UA(androidx.constraintlayout.compose.MotionScene, java.lang.String, androidx.compose.animation.core.AnimationSpec, androidx.compose.ui.Modifier, h.g.a.a, int, int, androidx.compose.runtime.MutableState, androidx.compose.ui.node.Ref, androidx.constraintlayout.compose.InvalidationStrategy, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab MotionLayoutCore_SehEMGo$lambda$3(MotionScene motionScene, float f2, String str, int i2, int i3, Modifier modifier, MutableState mutableState, Ref ref, InvalidationStrategy invalidationStrategy, q qVar, int i4, Composer composer, int i5) {
        m11582MotionLayoutCoreSehEMGo(motionScene, f2, str, i2, i3, modifier, mutableState, ref, invalidationStrategy, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
        return ab.f48028a;
    }

    static final ab MotionLayoutCore_SehEMGo$lambda$4(MotionScene motionScene, float f2, String str, int i2, int i3, Modifier modifier, MutableState mutableState, Ref ref, InvalidationStrategy invalidationStrategy, q qVar, int i4, Composer composer, int i5) {
        m11582MotionLayoutCoreSehEMGo(motionScene, f2, str, i2, i3, modifier, mutableState, ref, invalidationStrategy, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MotionLayoutCore_TEds9UA$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MotionLayoutCore_TEds9UA$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MotionLayoutCore_TEds9UA$lambda$17$0(o oVar, ConstraintSet constraintSet) {
        oVar.i(constraintSet);
        return ab.f48028a;
    }

    static final ab MotionLayoutCore_TEds9UA$lambda$19(MotionScene motionScene, String str, AnimationSpec animationSpec, Modifier modifier, a aVar, int i2, int i3, MutableState mutableState, Ref ref, InvalidationStrategy invalidationStrategy, q qVar, int i4, int i5, int i6, Composer composer, int i7) {
        m11583MotionLayoutCoreTEds9UA(motionScene, str, animationSpec, modifier, aVar, i2, i3, mutableState, ref, invalidationStrategy, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    static final ab MotionLayoutCore_TEds9UA$lambda$4(MotionScene motionScene, String str, AnimationSpec animationSpec, Modifier modifier, a aVar, int i2, int i3, MutableState mutableState, Ref ref, InvalidationStrategy invalidationStrategy, q qVar, int i4, int i5, int i6, Composer composer, int i7) {
        m11583MotionLayoutCoreTEds9UA(motionScene, str, animationSpec, modifier, aVar, i2, i3, mutableState, ref, invalidationStrategy, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$6(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet MotionLayoutCore_TEds9UA$lambda$9(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    public static final void UpdateWithForcedIfNoUserChange(final MutableFloatState mutableFloatState, final LayoutInformationReceiver layoutInformationReceiver, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501096015);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(mutableFloatState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(layoutInformationReceiver) : composerStartRestartGroup.changedInstance(layoutInformationReceiver)) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501096015, i3, -1, "androidx.constraintlayout.compose.UpdateWithForcedIfNoUserChange (MotionLayout.kt:1019)");
            }
            if (layoutInformationReceiver == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final LayoutInformationReceiver layoutInformationReceiver2 = null;
                    scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$$ExternalSyntheticLambda1
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return MotionLayoutKt.UpdateWithForcedIfNoUserChange$lambda$0(mutableFloatState, layoutInformationReceiver2, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            float floatValue = mutableFloatState.getFloatValue();
            float forcedProgress = layoutInformationReceiver.getForcedProgress();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(Float.valueOf(floatValue));
                composerStartRestartGroup.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            if (Float.isNaN(forcedProgress) || !x.l((Float) ref2.getValue(), floatValue)) {
                layoutInformationReceiver.resetForcedProgress();
            } else {
                mutableFloatState.setFloatValue(forcedProgress);
            }
            ref2.setValue(Float.valueOf(floatValue));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new p() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return MotionLayoutKt.UpdateWithForcedIfNoUserChange$lambda$2(mutableFloatState, layoutInformationReceiver, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    static final ab UpdateWithForcedIfNoUserChange$lambda$0(MutableFloatState mutableFloatState, LayoutInformationReceiver layoutInformationReceiver, int i2, Composer composer, int i3) {
        UpdateWithForcedIfNoUserChange(mutableFloatState, layoutInformationReceiver, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab UpdateWithForcedIfNoUserChange$lambda$2(MutableFloatState mutableFloatState, LayoutInformationReceiver layoutInformationReceiver, int i2, Composer composer, int i3) {
        UpdateWithForcedIfNoUserChange(mutableFloatState, layoutInformationReceiver, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final MutableFloatState createAndUpdateMotionProgress(float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1721363510, i2, -1, "androidx.constraintlayout.compose.createAndUpdateMotionProgress (MotionLayout.kt:1046)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            an anVar = new an();
            anVar.f48102a = f2;
            composer.updateRememberedValue(anVar);
            obj = anVar;
        }
        an anVar2 = (an) obj;
        if (anVar2.f48102a != f2) {
            anVar2.f48102a = f2;
            mutableFloatState.setFloatValue(f2);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableFloatState;
    }

    public static final Modifier motionDebug(Modifier modifier, final MotionMeasurer motionMeasurer, float f2, final boolean z, final boolean z2, final boolean z3) {
        if (!Float.isNaN(f2)) {
            modifier = ScaleKt.scale(modifier, f2);
        }
        return (z || z3 || z2) ? DrawModifierKt.drawBehind(modifier, new l() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MotionLayoutKt.motionDebug$lambda$0(motionMeasurer, z, z2, z3, (DrawScope) obj);
            }
        }) : modifier;
    }

    static final ab motionDebug$lambda$0(MotionMeasurer motionMeasurer, boolean z, boolean z2, boolean z3, DrawScope drawScope) {
        motionMeasurer.drawDebug(drawScope, z, z2, z3);
        return ab.f48028a;
    }

    public static final MeasurePolicy motionLayoutMeasurePolicy(androidx.compose.runtime.State<ab> state, Ref<CompositionSource> ref, ConstraintSet constraintSet, ConstraintSet constraintSet2, TransitionImpl transitionImpl, MutableFloatState mutableFloatState, MotionMeasurer motionMeasurer, int i2, InvalidationStrategy invalidationStrategy) {
        return new AnonymousClass1(state, motionMeasurer, constraintSet, constraintSet2, transitionImpl, i2, mutableFloatState, ref, invalidationStrategy);
    }

    /* renamed from: MotionLayout-T3LJ6Qw, reason: not valid java name */
    public static final void m11581MotionLayoutT3LJ6Qw(MotionScene motionScene, String str, AnimationSpec<Float> animationSpec, Modifier modifier, a<ab> aVar, int i2, int i3, InvalidationStrategy invalidationStrategy, final q<? super MotionLayoutScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i4, int i5) {
        Modifier modifier2 = (i5 & 8) != 0 ? Modifier.Companion : modifier;
        a<ab> aVar2 = (i5 & 16) != 0 ? null : aVar;
        int iM11523getNonebfy_xzQ = (i5 & 32) != 0 ? DebugFlags.Companion.m11523getNonebfy_xzQ() : i2;
        int i6 = (i5 & 64) != 0 ? 257 : i3;
        final InvalidationStrategy defaultInvalidationStrategy = (i5 & 128) != 0 ? InvalidationStrategy.Companion.getDefaultInvalidationStrategy() : invalidationStrategy;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf(ab.f48028a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(objRememberedValue);
        }
        final MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            Ref ref = new Ref();
            ref.setValue(CompositionSource.Unknown);
            composer.updateRememberedValue(ref);
            obj = ref;
        }
        final Ref ref2 = (Ref) obj;
        m11583MotionLayoutCoreTEds9UA(motionScene, str, animationSpec, modifier2, aVar2, iM11523getNonebfy_xzQ, i6, mutableState, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(-1209711375, true, new q<MotionLayoutScope, Composer, Integer, ab>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayout$contentDelegate$3
            public final void invoke(MotionLayoutScope motionLayoutScope, Composer composer2, int i7) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1209711375, i7, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:390)");
                }
                mutableState.setValue(ab.f48028a);
                if (defaultInvalidationStrategy.getOnObservedStateChange() == null && ref2.getValue() == CompositionSource.Unknown) {
                    ref2.setValue(CompositionSource.Content);
                }
                qVar.invoke(motionLayoutScope, composer2, Integer.valueOf(i7 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ ab invoke(MotionLayoutScope motionLayoutScope, Composer composer2, Integer num) {
                invoke(motionLayoutScope, composer2, num.intValue());
                return ab.f48028a;
            }
        }, composer, 54), composer, (i4 & 14) | 12582912 | (i4 & 112) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016) | (Ref.$stable << 24) | ((i4 << 6) & C.ENCODING_PCM_DOUBLE), 6, 0);
    }
}
