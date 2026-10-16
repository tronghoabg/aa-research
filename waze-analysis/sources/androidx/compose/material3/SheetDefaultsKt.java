package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SheetDefaultsKt {
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final float DragHandleVerticalPadding = 22.0f;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1665a = 0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    public final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ SheetState $sheetState;

        AnonymousClass1(SheetState sheetState, FlingBehavior flingBehavior, Orientation orientation) {
            this.$sheetState = sheetState;
            this.$flingBehavior = flingBehavior;
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
        public java.lang.Object mo2297onPostFlingRZ2iAVY(long r5, long r7, h.c.e<? super androidx.compose.ui.unit.Velocity> r9) {
            /*
                r4 = this;
                boolean r0 = r9 instanceof androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                r0.<init>(r4, r9)
            L18:
                java.lang.Object r9 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                long r5 = r0.J$0
                e.b.c.b(r9)
                goto L46
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                e.b.c.b(r9)
                float r7 = r4.velocityToFloat(r7)
                androidx.compose.material3.SheetState r8 = r4.$sheetState
                androidx.compose.foundation.gestures.FlingBehavior r4 = r4.$flingBehavior
                r0.J$0 = r5
                r0.label = r3
                java.lang.Object r9 = r8.anchoredDrag$material3(r4, r7, r0)
                if (r9 == r1) goto L59
            L46:
                java.lang.Number r9 = (java.lang.Number) r9
                float r4 = r9.floatValue()
                float r5 = androidx.compose.ui.unit.Velocity.m11406getXimpl(r5)
                long r4 = androidx.compose.ui.unit.VelocityKt.Velocity(r5, r4)
                androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m11397boximpl(r4)
                return r4
            L59:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetDefaultsKt.AnonymousClass1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
            return NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI()) ? toOffset(this.$sheetState.getAnchoredDraggableState$material3().dispatchRawDelta(offsetToFloat(j3))) : Offset.Companion.m7996getZeroF1C5BW0();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object mo2299onPreFlingQWom1Mo(long r7, h.c.e<? super androidx.compose.ui.unit.Velocity> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                r0.<init>(r6, r9)
            L18:
                java.lang.Object r9 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                long r7 = r0.J$0
                e.b.c.b(r9)
                goto L69
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                e.b.c.b(r9)
                float r9 = r6.velocityToFloat(r7)
                androidx.compose.material3.SheetState r2 = r6.$sheetState
                float r4 = r2.requireOffset()
                androidx.compose.foundation.gestures.AnchoredDraggableState r2 = r2.getAnchoredDraggableState$material3()
                androidx.compose.foundation.gestures.DraggableAnchors r2 = r2.getAnchors()
                float r2 = r2.minPosition()
                r5 = 0
                int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r5 >= 0) goto L63
                int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r2 <= 0) goto L63
                androidx.compose.material3.SheetState r2 = r6.$sheetState
                androidx.compose.foundation.gestures.FlingBehavior r6 = r6.$flingBehavior
                r0.J$0 = r7
                r0.label = r3
                java.lang.Object r6 = r2.anchoredDrag$material3(r6, r9, r0)
                if (r6 == r1) goto L62
                goto L69
            L62:
                return r1
            L63:
                androidx.compose.ui.unit.Velocity$Companion r6 = androidx.compose.ui.unit.Velocity.Companion
                long r7 = r6.m11417getZero9UxMQ8M()
            L69:
                androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m11397boximpl(r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetDefaultsKt.AnonymousClass1.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
            float fOffsetToFloat = offsetToFloat(j2);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI())) ? Offset.Companion.m7996getZeroF1C5BW0() : toOffset(this.$sheetState.getAnchoredDraggableState$material3().dispatchRawDelta(fOffsetToFloat));
        }
    }

    /* renamed from: $r8$lambda$F-DOdAyBpHAr7nj_rOnSDAudKEI, reason: not valid java name */
    public static /* synthetic */ boolean m5538$r8$lambda$FDOdAyBpHAr7nj_rOnSDAudKEI(SheetValue sheetValue) {
        return true;
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SheetState sheetState, Orientation orientation, FlingBehavior flingBehavior) {
        return new AnonymousClass1(sheetState, flingBehavior, orientation);
    }

    public static final void DragHandleWithTooltip(final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1361920385);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1361920385, i3, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:490)");
            }
            final String strM6375getString2EP1pXo = Strings_androidKt.m6375getString2EP1pXo(com.waze.R.string.m3c_bottom_sheet_drag_handle_description, composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = SheetDefaultsKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TooltipKt.TooltipBox(TooltipDefaults.INSTANCE.m6046rememberTooltipPositionProviderHu5FAss(TooltipAnchorPosition.Companion.m6033getAbovelOKsHw4(), 0.0f, composer2, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT, 2), ComposableLambdaKt.rememberComposableLambda(1497042086, true, new q() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda6
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SheetDefaultsKt.DragHandleWithTooltip$lambda$0$0(strM6375getString2EP1pXo, (TooltipScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), TooltipKt.rememberTooltipState(false, false, null, composer2, 0, 7), modifier, null, false, false, false, pVar, composerStartRestartGroup, ((i3 << 9) & 7168) | 48 | ((i3 << 21) & 234881024), 240);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SheetDefaultsKt.DragHandleWithTooltip$lambda$1(modifier, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DragHandleWithTooltip$lambda$0$0(final String str, TooltipScope tooltipScope, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != ((i2 & 8) == 0 ? composer.changed(tooltipScope) : composer.changedInstance(tooltipScope)) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1497042086, i3, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:498)");
            }
            TooltipKt.m6053PlainTooltipInternalkw8QeXY(tooltipScope, str, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(660974002, true, new p() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SheetDefaultsKt.DragHandleWithTooltip$lambda$0$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, i3 & 14, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab DragHandleWithTooltip$lambda$0$0$0(String str, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660974002, i2, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:498)");
            }
            TextKt.m5817TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab DragHandleWithTooltip$lambda$1(Modifier modifier, p pVar, int i2, Composer composer, int i3) {
        DragHandleWithTooltip(modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final AnimationSpec<Float> getBottomSheetAnimationSpec() {
        return BottomSheetAnimationSpec;
    }

    /* renamed from: rememberSheetState-AGcomas, reason: not valid java name */
    public static final SheetState m5540rememberSheetStateAGcomas(boolean z, l<? super SheetValue, Boolean> lVar, SheetValue sheetValue, boolean z2, float f2, float f3, Composer composer, int i2, int i3) {
        final l<? super SheetValue, Boolean> lVar2;
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        int i4 = SheetDefaultsKt.f1665a;
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar2 = (l) objRememberedValue;
        } else {
            lVar2 = lVar;
        }
        final SheetValue sheetValue2 = (i3 & 4) != 0 ? SheetValue.Hidden : sheetValue;
        boolean z3 = true;
        final boolean z4 = ((i3 & 8) == 0) & z2;
        final float fM4391getPositionalThresholdD9Ej5fM$material3 = (i3 & 16) != 0 ? BottomSheetDefaults.INSTANCE.m4391getPositionalThresholdD9Ej5fM$material3() : f2;
        final float fM4394getVelocityThresholdD9Ej5fM$material3 = (i3 & 32) != 0 ? BottomSheetDefaults.INSTANCE.m4394getVelocityThresholdD9Ej5fM$material3() : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20307384, i2, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:575)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(density) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(fM4391getPositionalThresholdD9Ej5fM$material3)) || (i2 & 24576) == 16384);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return Float.valueOf(density.mo2127toPx0680j_4(fM4391getPositionalThresholdD9Ej5fM$material3));
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        final a<Float> aVar = (a) objRememberedValue2;
        boolean zChanged2 = composer.changed(density) | ((((458752 & i2) ^ 196608) > 131072 && composer.changed(fM4394getVelocityThresholdD9Ej5fM$material3)) || (i2 & 196608) == 131072);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new a() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return Float.valueOf(density.mo2127toPx0680j_4(fM4394getVelocityThresholdD9Ej5fM$material3));
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        final boolean z5 = 1 == ((z ? 1 : 0) & ((i3 & 1) ^ 1));
        final a<Float> aVar2 = (a) objRememberedValue3;
        Object[] objArr = {Boolean.valueOf(z5), lVar2, Boolean.valueOf(z4)};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z5, aVar, aVar2, lVar2, z4);
        boolean zChanged3 = ((((i2 & 14) ^ 6) > 4 && composer.changed(z5)) || (i2 & 6) == 4) | composer.changed(aVar) | composer.changed(aVar2) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(sheetValue2.ordinal())) || (i2 & 384) == 256) | ((((i2 & 112) ^ 48) > 32 && composer.changed(lVar2)) || (i2 & 48) == 32);
        if ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) <= 2048 || !composer.changed(z4)) && (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 2048) {
            z3 = false;
        }
        boolean z6 = zChanged3 | z3;
        Object objRememberedValue4 = composer.rememberedValue();
        if (z6 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            Object obj = new a() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda4
                @Override // h.g.a.a
                public final Object invoke() {
                    return SheetDefaultsKt.rememberSheetState_AGcomas$lambda$3$0(z5, aVar, aVar2, sheetValue2, lVar2, z4);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue4 = obj;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }

    private static final boolean rememberSheetState_AGcomas$lambda$0$0(SheetValue sheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SheetState rememberSheetState_AGcomas$lambda$3$0(boolean z, a aVar, a aVar2, SheetValue sheetValue, l lVar, boolean z2) {
        return new SheetState(z, aVar, aVar2, sheetValue, lVar, z2);
    }

    public static final Modifier verticalScaleDown(Modifier modifier, final SheetState sheetState) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda8
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SheetDefaultsKt.verticalScaleDown$lambda$0(sheetState, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab verticalScaleDown$lambda$0(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float fMinPosition = sheetState.getAnchoredDraggableState$material3().getAnchors().minPosition();
        float f2 = offset < fMinPosition ? fMinPosition - offset : 0.0f;
        graphicsLayerScope.setScaleY(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + f2) / Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) : 1.0f);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return ab.f48028a;
    }

    public static final Modifier verticalScaleUp(Modifier modifier, final SheetState sheetState) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new l() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda5
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SheetDefaultsKt.verticalScaleUp$lambda$0(sheetState, (GraphicsLayerScope) obj);
            }
        });
    }

    static final ab verticalScaleUp$lambda$0(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float fMinPosition = sheetState.getAnchoredDraggableState$material3().getAnchors().minPosition();
        float f2 = offset < fMinPosition ? fMinPosition - offset : 0.0f;
        graphicsLayerScope.setScaleY(f2 > 0.0f ? (Float.intBitsToFloat((int) (graphicsLayerScope.mo8406getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + f2) / Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & graphicsLayerScope.mo8406getSizeNHjbRc())) : 1.0f);
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return ab.f48028a;
    }
}
