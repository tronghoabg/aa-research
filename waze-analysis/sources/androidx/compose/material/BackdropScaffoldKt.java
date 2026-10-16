package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.an;
import h.g.b.x;
import h.i;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = 20.0f;
    private static final float PositionalThreshold = 56.0f;
    private static final float VelocityThreshold = 125.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, reason: invalid class name */
    public final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        AnonymousClass1(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
            this.$state = anchoredDraggableState;
            this.$orientation = orientation;
        }

        private final float offsetToFloat(long j2) {
            return Float.intBitsToFloat(this.$orientation == Orientation.Horizontal ? (int) (j2 >> 32) : (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }

        private final long toOffset(float f2) {
            Orientation orientation = this.$orientation;
            float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
            Orientation orientation2 = Orientation.Vertical;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
            if (orientation != orientation2) {
                f2 = 0.0f;
            }
            return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        }

        private final float velocityToFloat(long j2) {
            return this.$orientation == Orientation.Horizontal ? Velocity.m11406getXimpl(j2) : Velocity.m11407getYimpl(j2);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo2297onPostFlingRZ2iAVY(long r3, long r5, h.c.e<? super androidx.compose.ui.unit.Velocity> r7) {
            /*
                r2 = this;
                boolean r3 = r7 instanceof androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1
                r3.<init>(r2, r7)
            L18:
                java.lang.Object r4 = r3.result
                h.c.a.a r7 = h.c.a.a.f48038a
                int r0 = r3.label
                r1 = 1
                if (r0 == 0) goto L31
                if (r0 != r1) goto L29
                long r5 = r3.J$0
                e.b.c.b(r4)
                goto L44
            L29:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r3)
                throw r2
            L31:
                e.b.c.b(r4)
                androidx.compose.material.AnchoredDraggableState<?> r4 = r2.$state
                float r2 = r2.velocityToFloat(r5)
                r3.J$0 = r5
                r3.label = r1
                java.lang.Object r2 = r4.settle(r2, r3)
                if (r2 == r7) goto L49
            L44:
                androidx.compose.ui.unit.Velocity r2 = androidx.compose.ui.unit.Velocity.m11397boximpl(r5)
                return r2
            L49:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.AnonymousClass1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
            return NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI()) ? toOffset(this.$state.dispatchRawDelta(offsetToFloat(j3))) : Offset.Companion.m7996getZeroF1C5BW0();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo2299onPreFlingQWom1Mo(long r6, h.c.e<? super androidx.compose.ui.unit.Velocity> r8) {
            /*
                r5 = this;
                boolean r0 = r8 instanceof androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1
                r0.<init>(r5, r8)
            L18:
                java.lang.Object r8 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                long r6 = r0.J$0
                e.b.c.b(r8)
                goto L65
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                e.b.c.b(r8)
                float r8 = r5.velocityToFloat(r6)
                androidx.compose.material.AnchoredDraggableState<?> r2 = r5.$state
                r4 = 0
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                float r2 = r2.requireOffset()
                if (r4 >= 0) goto L5f
                androidx.compose.material.AnchoredDraggableState<?> r4 = r5.$state
                androidx.compose.material.DraggableAnchors r4 = r4.getAnchors()
                float r4 = r4.minAnchor()
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L5f
                androidx.compose.material.AnchoredDraggableState<?> r5 = r5.$state
                r0.J$0 = r6
                r0.label = r3
                java.lang.Object r5 = r5.settle(r8, r0)
                if (r5 == r1) goto L5e
                goto L65
            L5e:
                return r1
            L5f:
                androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.Companion
                long r6 = r5.m11417getZero9UxMQ8M()
            L65:
                androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m11397boximpl(r6)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.AnonymousClass1.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
            float fOffsetToFloat = offsetToFloat(j2);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI())) ? Offset.Companion.m7996getZeroF1C5BW0() : toOffset(this.$state.dispatchRawDelta(fOffsetToFloat));
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackdropValue.values().length];
            try {
                iArr[BackdropValue.Concealed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackdropValue.Revealed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ boolean $r8$lambda$4gvh8BVURZw2E2UgenhGN89eEZM(BackdropValue backdropValue) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$Oh3ZqPUUxavobu71tyOKlfnhriM(BackdropScaffoldState backdropScaffoldState, af afVar) {
        BackdropScaffold_0hNv9B8$lambda$5$0$1$0$1(backdropScaffoldState, afVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$XaFKkqZyYH8qWHT0KdEze5PKqtY(BackdropScaffoldState backdropScaffoldState, af afVar) {
        BackdropScaffold_0hNv9B8$lambda$5$0$1$0$0(backdropScaffoldState, afVar);
        return true;
    }

    private static final void BackLayerTransition(final BackdropValue backdropValue, final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2129748230);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(backdropValue.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2129748230, i3, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:519)");
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            final float fMo2127toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(AnimationSlideOffset);
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new q() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BackdropScaffoldKt.BackLayerTransition$lambda$2$0$0(stateAnimateFloatAsState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierLayout = LayoutModifierKt.layout(companion2, (q) objRememberedValue);
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | composerStartRestartGroup.changed(fMo2127toPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return BackdropScaffoldKt.BackLayerTransition$lambda$2$1$0(fMo2127toPx0680j_4, stateAnimateFloatAsState, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayout, (l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
            a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                composerStartRestartGroup.updateRememberedValue(numValueOf2);
                composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 14));
            composerStartRestartGroup.endNode();
            Modifier.Companion companion3 = Modifier.Companion;
            boolean zChanged3 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new q() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BackdropScaffoldKt.BackLayerTransition$lambda$2$3$0(stateAnimateFloatAsState, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierLayout2 = LayoutModifierKt.layout(companion3, (q) objRememberedValue3);
            boolean zChanged4 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | composerStartRestartGroup.changed(fMo2127toPx0680j_4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return BackdropScaffoldKt.BackLayerTransition$lambda$2$4$0(fMo2127toPx0680j_4, stateAnimateFloatAsState, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierLayout2, (l) objRememberedValue4);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
            a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                Integer numValueOf3 = Integer.valueOf(currentCompositeKeyHash3);
                composerStartRestartGroup.updateRememberedValue(numValueOf3);
                composerStartRestartGroup.apply(numValueOf3, setCompositeKeyHash3);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            pVar2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BackdropScaffoldKt.BackLayerTransition$lambda$3(backdropValue, pVar, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float BackLayerTransition$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BackLayerTransition$lambda$2$0$0(State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final float fBackLayerTransition$lambda$0 = BackLayerTransition$lambda$0(state) - 1.0f;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        int width = placeableMo9741measureBRTryo0.getWidth();
        int height = placeableMo9741measureBRTryo0.getHeight();
        if (fBackLayerTransition$lambda$0 < 0.0f) {
            fBackLayerTransition$lambda$0 = 0.0f;
        }
        if (fBackLayerTransition$lambda$0 > 1.0f) {
            fBackLayerTransition$lambda$0 = 1.0f;
        }
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda28
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BackdropScaffoldKt.BackLayerTransition$lambda$2$0$0$0(placeableMo9741measureBRTryo0, fBackLayerTransition$lambda$0, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackLayerTransition$lambda$2$0$0$0(Placeable placeable, float f2, Placeable.PlacementScope placementScope) {
        placementScope.place(placeable, 0, 0, f2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackLayerTransition$lambda$2$1$0(float f2, State state, GraphicsLayerScope graphicsLayerScope) {
        float fBackLayerTransition$lambda$0 = BackLayerTransition$lambda$0(state) - 1.0f;
        if (fBackLayerTransition$lambda$0 < 0.0f) {
            fBackLayerTransition$lambda$0 = 0.0f;
        }
        if (fBackLayerTransition$lambda$0 > 1.0f) {
            fBackLayerTransition$lambda$0 = 1.0f;
        }
        graphicsLayerScope.setAlpha(fBackLayerTransition$lambda$0);
        graphicsLayerScope.setTranslationY((1.0f - fBackLayerTransition$lambda$0) * f2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BackLayerTransition$lambda$2$3$0(State state, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float fBackLayerTransition$lambda$0 = 1.0f - BackLayerTransition$lambda$0(state);
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        int width = placeableMo9741measureBRTryo0.getWidth();
        int height = placeableMo9741measureBRTryo0.getHeight();
        if (fBackLayerTransition$lambda$0 < 0.0f) {
            fBackLayerTransition$lambda$0 = 0.0f;
        }
        final float f2 = fBackLayerTransition$lambda$0 <= 1.0f ? fBackLayerTransition$lambda$0 : 1.0f;
        return MeasureScope.CC.layout$default(measureScope, width, height, null, new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BackdropScaffoldKt.BackLayerTransition$lambda$2$3$0$0(placeableMo9741measureBRTryo0, f2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackLayerTransition$lambda$2$3$0$0(Placeable placeable, float f2, Placeable.PlacementScope placementScope) {
        placementScope.place(placeable, 0, 0, f2);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackLayerTransition$lambda$2$4$0(float f2, State state, GraphicsLayerScope graphicsLayerScope) {
        float fBackLayerTransition$lambda$0 = 1.0f - BackLayerTransition$lambda$0(state);
        if (fBackLayerTransition$lambda$0 < 0.0f) {
            fBackLayerTransition$lambda$0 = 0.0f;
        }
        if (fBackLayerTransition$lambda$0 > 1.0f) {
            fBackLayerTransition$lambda$0 = 1.0f;
        }
        graphicsLayerScope.setAlpha(fBackLayerTransition$lambda$0);
        graphicsLayerScope.setTranslationY((1.0f - fBackLayerTransition$lambda$0) * f2);
        return ab.f48028a;
    }

    static final ab BackLayerTransition$lambda$3(BackdropValue backdropValue, p pVar, p pVar2, int i2, Composer composer, int i3) {
        BackLayerTransition(backdropValue, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /* renamed from: BackdropScaffold-0hNv9B8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3968BackdropScaffold0hNv9B8(final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r41, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r42, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r43, androidx.compose.ui.Modifier r44, androidx.compose.material.BackdropScaffoldState r45, h.g.a.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r46, boolean r47, float r48, float r49, boolean r50, boolean r51, long r52, long r54, androidx.compose.ui.graphics.Shape r56, float r57, long r58, long r60, long r62, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m3968BackdropScaffold0hNv9B8(h.g.a.p, h.g.a.p, h.g.a.p, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, h.g.a.q, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final BackdropScaffoldState BackdropScaffoldState(BackdropValue backdropValue, Density density, AnimationSpec<Float> animationSpec, l<? super BackdropValue, Boolean> lVar, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState backdropScaffoldState = new BackdropScaffoldState(backdropValue, animationSpec, lVar, snackbarHostState);
        backdropScaffoldState.setDensity$material(density);
        return backdropScaffoldState;
    }

    public static /* synthetic */ BackdropScaffoldState BackdropScaffoldState$default(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, l lVar, SnackbarHostState snackbarHostState, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 8) != 0) {
            lVar = new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda23
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return true;
                }
            };
        }
        if ((i2 & 16) != 0) {
            snackbarHostState = new SnackbarHostState();
        }
        return BackdropScaffoldState(backdropValue, density, animationSpec, lVar, snackbarHostState);
    }

    static final boolean BackdropScaffoldState$lambda$0(BackdropValue backdropValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropScaffold_0hNv9B8$lambda$0$0(BackdropScaffoldState backdropScaffoldState, Density density) {
        backdropScaffoldState.setDensity$material(density);
        return ab.f48028a;
    }

    static final ab BackdropScaffold_0hNv9B8$lambda$3(boolean z, BackdropScaffoldState backdropScaffoldState, p pVar, p pVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(998762775, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:373)");
            }
            if (z) {
                composer.startReplaceGroup(-1391557043);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                    composer.updateRememberedValue(numValueOf);
                    composer.apply(numValueOf, setCompositeKeyHash);
                }
                Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                pVar.invoke(composer, 0);
                pVar2.invoke(composer, 0);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1391423619);
                BackLayerTransition(backdropScaffoldState.getAnchoredDraggableState$material().getTargetValue(), pVar, pVar2, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Constraints BackdropScaffold_0hNv9B8$lambda$4$0(float f2, Constraints constraints) {
        return Constraints.m11094boximpl(ConstraintsKt.m11127offsetNN6EwU$default(Constraints.m11097copyZbe2FdA$default(constraints.m11113unboximpl(), 0, 0, 0, 0, 10, null), 0, -h.h.a.b(f2), 1, null));
    }

    static final ab BackdropScaffold_0hNv9B8$lambda$5(Modifier modifier, p pVar, l lVar, final float f2, final boolean z, final boolean z2, final BackdropScaffoldState backdropScaffoldState, final AnchoredDraggableState anchoredDraggableState, final Shape shape, final long j2, final long j3, final float f3, final float f4, final float f5, final float f6, final p pVar2, final long j4, final q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1243386547, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous> (BackdropScaffold.kt:394)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            final af afVar = (af) objRememberedValue;
            BackdropStack(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), pVar, lVar, ComposableLambdaKt.rememberComposableLambda(-323178911, true, new r() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda0
                @Override // h.g.a.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$5$0(f2, z, z2, backdropScaffoldState, anchoredDraggableState, afVar, shape, j2, j3, f3, f4, f5, f6, pVar2, j4, qVar, (Constraints) obj, ((Float) obj2).floatValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer, 54), composer, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropScaffold_0hNv9B8$lambda$5$0(float f2, boolean z, final boolean z2, final BackdropScaffoldState backdropScaffoldState, AnchoredDraggableState anchoredDraggableState, final af afVar, Shape shape, long j2, long j3, float f3, float f4, final float f5, final float f6, final p pVar, final long j4, q qVar, Constraints constraints, float f7, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(constraints.m11113unboximpl()) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composer.changed(f7) ? 16 : 32;
        }
        if (composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-323178911, i3, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous> (BackdropScaffold.kt:398)");
            }
            final an anVar = new an();
            float fM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl()) - f2;
            anVar.f48102a = fM11106getMaxHeightimpl;
            if (z) {
                anVar.f48102a = Math.min(fM11106getMaxHeightimpl, f7);
            }
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(z2 ? NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, backdropScaffoldState.getNestedScrollConnection$material(), null, 2, null) : Modifier.Companion, anchoredDraggableState, Orientation.Vertical, new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda20
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$5$0$0(f5, backdropScaffoldState, anVar, (IntSize) obj, (Constraints) obj2);
                }
            }), anchoredDraggableState, Orientation.Vertical, z2, false, null, false, 56, null);
            boolean zChanged = composer.changed(backdropScaffoldState) | composer.changedInstance(afVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda21
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$5$0$1$0(backdropScaffoldState, afVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            SurfaceKt.m4216SurfaceFjzlyU(SemanticsModifierKt.semantics(modifierAnchoredDraggable$default, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue), shape, j2, j3, null, f3, ComposableLambdaKt.rememberComposableLambda(356452509, true, new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda22
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$5$0$2(f6, pVar, j4, z2, backdropScaffoldState, afVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 1572864, 16);
            Modifier.Companion companion = Modifier.Companion;
            float f8 = 0.0f;
            if (backdropScaffoldState.isRevealed() && anVar.f48102a == Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl()) - f2) {
                f8 = f4;
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, f8, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
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
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            qVar.invoke(backdropScaffoldState.getSnackbarHostState(), composer, 0);
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
    public static final h.k BackdropScaffold_0hNv9B8$lambda$5$0$0(final float f2, BackdropScaffoldState backdropScaffoldState, final an anVar, IntSize intSize, Constraints constraints) {
        BackdropValue backdropValue;
        long jM11343unboximpl = intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        final float fM11343unboximpl = ((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - f2;
        final float f3 = (int) jM11343unboximpl;
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$5$0$0$0(f3, f2, fM11343unboximpl, anVar, (DraggableAnchorsConfig) obj);
            }
        });
        BackdropValue targetValue = backdropScaffoldState.getTargetValue();
        BackdropValue backdropValue2 = BackdropValue.Concealed;
        int iOrdinal = targetValue.ordinal();
        if (iOrdinal == 0) {
            backdropValue = BackdropValue.Concealed;
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            backdropValue = DraggableAnchors.hasAnchorFor(BackdropValue.Revealed) ? BackdropValue.Revealed : BackdropValue.Concealed;
        }
        return new h.k(DraggableAnchors, backdropValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropScaffold_0hNv9B8$lambda$5$0$0$0(float f2, float f3, float f4, an anVar, DraggableAnchorsConfig draggableAnchorsConfig) {
        if (f2 == 0.0f || f2 == f3) {
            draggableAnchorsConfig.at(BackdropValue.Concealed, f4);
        } else {
            draggableAnchorsConfig.at(BackdropValue.Concealed, f3);
            draggableAnchorsConfig.at(BackdropValue.Revealed, anVar.f48102a);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropScaffold_0hNv9B8$lambda$5$0$1$0(final BackdropScaffoldState backdropScaffoldState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (backdropScaffoldState.isConcealed()) {
            SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda26
                @Override // h.g.a.a
                public final Object invoke() {
                    BackdropScaffoldKt.$r8$lambda$XaFKkqZyYH8qWHT0KdEze5PKqtY(backdropScaffoldState, afVar);
                    return true;
                }
            }, 1, null);
        } else {
            SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda27
                @Override // h.g.a.a
                public final Object invoke() {
                    BackdropScaffoldKt.$r8$lambda$Oh3ZqPUUxavobu71tyOKlfnhriM(backdropScaffoldState, afVar);
                    return true;
                }
            }, 1, null);
        }
        return ab.f48028a;
    }

    private static final boolean BackdropScaffold_0hNv9B8$lambda$5$0$1$0$0(BackdropScaffoldState backdropScaffoldState, af afVar) {
        if (!backdropScaffoldState.getConfirmValueChange().invoke(BackdropValue.Revealed).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new BackdropScaffoldKt$BackdropScaffold$2$1$2$1$1$1(backdropScaffoldState, null), 3);
        return true;
    }

    private static final boolean BackdropScaffold_0hNv9B8$lambda$5$0$1$0$1(BackdropScaffoldState backdropScaffoldState, af afVar) {
        if (!backdropScaffoldState.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new BackdropScaffoldKt$BackdropScaffold$2$1$2$1$2$1(backdropScaffoldState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropScaffold_0hNv9B8$lambda$5$0$2(float f2, p pVar, long j2, final boolean z, final BackdropScaffoldState backdropScaffoldState, final af afVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(356452509, i2, -1, "androidx.compose.material.BackdropScaffold.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:459)");
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, f2, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
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
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composer.updateRememberedValue(numValueOf);
                composer.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            boolean zChanged = composer.changed(z) | composer.changed(backdropScaffoldState) | composer.changedInstance(afVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda15
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return BackdropScaffoldKt.BackdropScaffold_0hNv9B8$lambda$5$0$2$0$0$0(z, backdropScaffoldState, afVar);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m3969Scrim3JVO9M(j2, (a) objRememberedValue, backdropScaffoldState.getTargetValue() == BackdropValue.Revealed, composer, 0);
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
    public static final ab BackdropScaffold_0hNv9B8$lambda$5$0$2$0$0$0(boolean z, BackdropScaffoldState backdropScaffoldState, af afVar) {
        if (z && backdropScaffoldState.getConfirmValueChange().invoke(BackdropValue.Concealed).booleanValue()) {
            aj.z(afVar, null, null, new BackdropScaffoldKt$BackdropScaffold$2$1$3$1$1$1$1(backdropScaffoldState, null), 3);
        }
        return ab.f48028a;
    }

    static final ab BackdropScaffold_0hNv9B8$lambda$6(p pVar, p pVar2, p pVar3, Modifier modifier, BackdropScaffoldState backdropScaffoldState, q qVar, boolean z, float f2, float f3, boolean z2, boolean z3, long j2, long j3, Shape shape, float f4, long j4, long j5, long j6, int i2, int i3, int i4, Composer composer, int i5) {
        m3968BackdropScaffold0hNv9B8(pVar, pVar2, pVar3, modifier, backdropScaffoldState, qVar, z, f2, f3, z2, z3, j2, j3, shape, f4, j4, j5, j6, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    private static final void BackdropStack(final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final l<? super Constraints, Constraints> lVar, final r<? super Constraints, ? super Float, ? super Composer, ? super Integer, ab> rVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1490100844);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(rVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1490100844, i3, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
            }
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z3 = (i3 & 7168) == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2 | z3) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda24
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return BackdropScaffoldKt.BackdropStack$lambda$0$0(pVar, lVar, rVar, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) objRememberedValue, composerStartRestartGroup, i3 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda25
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BackdropScaffoldKt.BackdropStack$lambda$1(modifier, pVar, lVar, rVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult BackdropStack$lambda$0$0(p pVar, l lVar, final r rVar, SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        final Placeable placeableMo9741measureBRTryo0 = ((Measurable) h.a.i.P(subcomposeMeasureScope.subcompose(BackdropLayers.Back, pVar))).mo9741measureBRTryo0(((Constraints) lVar.invoke(constraints)).m11113unboximpl());
        final float height = placeableMo9741measureBRTryo0.getHeight();
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-344317043, true, new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda13
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return BackdropScaffoldKt.BackdropStack$lambda$0$0$0(rVar, constraints, height, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        ArrayList arrayList = new ArrayList(listSubcompose.size());
        int size = listSubcompose.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listSubcompose.get(i2).mo9741measureBRTryo0(constraints.m11113unboximpl()));
        }
        final ArrayList arrayList2 = arrayList;
        int iMax = Math.max(Constraints.m11109getMinWidthimpl(constraints.m11113unboximpl()), placeableMo9741measureBRTryo0.getWidth());
        int iMax2 = Math.max(Constraints.m11108getMinHeightimpl(constraints.m11113unboximpl()), placeableMo9741measureBRTryo0.getHeight());
        int size2 = arrayList2.size();
        int iMax3 = iMax;
        int iMax4 = iMax2;
        for (int i3 = 0; i3 < size2; i3++) {
            Placeable placeable = (Placeable) arrayList2.get(i3);
            iMax3 = Math.max(iMax3, placeable.getWidth());
            iMax4 = Math.max(iMax4, placeable.getHeight());
        }
        return MeasureScope.CC.layout$default(subcomposeMeasureScope, iMax3, iMax4, null, new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda14
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BackdropScaffoldKt.BackdropStack$lambda$0$0$3(placeableMo9741measureBRTryo0, arrayList2, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropStack$lambda$0$0$0(r rVar, Constraints constraints, float f2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-344317043, i2, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:583)");
            }
            rVar.invoke(constraints, Float.valueOf(f2), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BackdropStack$lambda$0$0$3(Placeable placeable, List list, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i2), 0, 0, 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    static final ab BackdropStack$lambda$1(Modifier modifier, p pVar, l lVar, r rVar, int i2, Composer composer, int i3) {
        BackdropStack(modifier, pVar, lVar, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final NestedScrollConnection ConsumeSwipeNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new AnonymousClass1(anchoredDraggableState, orientation);
    }

    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    private static final void m3969Scrim3JVO9M(final long j2, final a<ab> aVar, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionPointerInput;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-92141505);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i3, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:493)");
            }
            if (j2 != 16) {
                composerStartRestartGroup.startReplaceGroup(-503366080);
                boolean z2 = true;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(true != z ? 0.0f : 1.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-503200478);
                    Modifier.Companion companion = Modifier.Companion;
                    int i5 = i3 & 112;
                    ab abVar = ab.f48028a;
                    BackdropScaffoldKt$Scrim$dismissModifier$1$1 backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i5 == 32 || backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue == Composer.Companion.getEmpty()) {
                        backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(aVar);
                        composerStartRestartGroup.updateRememberedValue(backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue);
                    }
                    companionPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, abVar, (PointerInputEventHandler) backdropScaffoldKt$Scrim$dismissModifier$1$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-503100069);
                    composerStartRestartGroup.endReplaceGroup();
                    companionPointerInput = Modifier.Companion;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companionPointerInput);
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState) | z2;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda16
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return BackdropScaffoldKt.Scrim_3J_VO9M$lambda$2$0(j2, stateAnimateFloatAsState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                CanvasKt.Canvas(modifierThen, (l) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-502932669);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda17
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BackdropScaffoldKt.Scrim_3J_VO9M$lambda$3(j2, aVar, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float Scrim_3J_VO9M$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_3J_VO9M$lambda$2$0(long j2, State state, DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, Scrim_3J_VO9M$lambda$0(state), null, null, 0, 118, null);
        return ab.f48028a;
    }

    static final ab Scrim_3J_VO9M$lambda$3(long j2, a aVar, boolean z, int i2, Composer composer, int i3) {
        m3969Scrim3JVO9M(j2, aVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final BackdropScaffoldState rememberBackdropScaffoldState(final BackdropValue backdropValue, AnimationSpec<Float> animationSpec, l<? super BackdropValue, Boolean> lVar, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda18
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        final l<? super BackdropValue, Boolean> lVar2 = lVar;
        if ((i3 & 8) != 0) {
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue2);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue2;
        }
        final SnackbarHostState snackbarHostState2 = snackbarHostState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i2, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = true;
        Object[] objArr = {animationSpec2, lVar2, snackbarHostState2};
        Saver<BackdropScaffoldState, ?> Saver = BackdropScaffoldState.Companion.Saver(animationSpec2, lVar2, snackbarHostState2, density);
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(backdropValue.ordinal())) || (i2 & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec2) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(lVar2)) || (i2 & 384) == 256);
        if ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) <= 2048 || !composer.changed(snackbarHostState2)) && (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 2048) {
            z = false;
        }
        boolean z2 = z | zChanged;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            Object obj = new a() { // from class: androidx.compose.material.BackdropScaffoldKt$$ExternalSyntheticLambda19
                @Override // h.g.a.a
                public final Object invoke() {
                    return BackdropScaffoldKt.BackdropScaffoldState(backdropValue, density, animationSpec2, lVar2, snackbarHostState2);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue3 = obj;
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return backdropScaffoldState;
    }

    private static final boolean rememberBackdropScaffoldState$lambda$0$0(BackdropValue backdropValue) {
        return true;
    }
}
