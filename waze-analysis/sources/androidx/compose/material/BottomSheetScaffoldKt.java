package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    private static final float BottomSheetScaffoldPositionalThreshold = 56.0f;
    private static final float BottomSheetScaffoldVelocityThreshold = 125.0f;
    private static final float FabSpacing = 16.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
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
                boolean r3 = r7 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.AnonymousClass1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
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
                boolean r0 = r8 instanceof androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.AnonymousClass1.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
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
            int[] iArr = new int[BottomSheetValue.values().length];
            try {
                iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomSheetValue.Expanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ boolean $r8$lambda$DooMF06SmtC9mm7IkzXKW46qM38(BottomSheetValue bottomSheetValue) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$MFQSEJnXsa8v2UeG2iNGJlqbFkY(BottomSheetState bottomSheetState, af afVar) {
        BottomSheet_dAqlCkY$lambda$2$0$1(bottomSheetState, afVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$gF3ZbPscuKbjgzYVYcT9lzo7kyI(BottomSheetState bottomSheetState, af afVar) {
        BottomSheet_dAqlCkY$lambda$2$0$0(bottomSheetState, afVar);
        return true;
    }

    /* renamed from: BottomSheet-dAqlCkY, reason: not valid java name */
    private static final void m3986BottomSheetdAqlCkY(final BottomSheetState bottomSheetState, final boolean z, final Shape shape, final float f2, final long j2, final long j3, final float f3, Modifier modifier, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2, final int i3) {
        int i4;
        float f4;
        Composer composer2;
        final Modifier modifier2;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-426833549);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(bottomSheetState) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(shape) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            f4 = f2;
            i4 |= true != composerStartRestartGroup.changed(f4) ? 1024 : 2048;
        } else {
            f4 = f2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j3) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f3) ? 524288 : 1048576;
        }
        int i6 = i3 & 128;
        if (i6 != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i4) != 38347922, i4 & 1)) {
            Modifier.Companion companion = i6 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-426833549, i4, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final af afVar = (af) objRememberedValue;
            final float fMo2127toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f3);
            AnchoredDraggableState<BottomSheetValue> anchoredDraggableState$material = bottomSheetState.getAnchoredDraggableState$material();
            int i7 = i4;
            Orientation orientation = Orientation.Vertical;
            boolean zChanged = composerStartRestartGroup.changed(fMo2127toPx0680j_4);
            boolean z2 = (i7 & 14) == 4;
            boolean z3 = zChanged | z2;
            boolean z4 = z2;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$1$0(bottomSheetState, fMo2127toPx0680j_4, (IntSize) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(companion, anchoredDraggableState$material, orientation, (p) objRememberedValue2), bottomSheetState.getAnchoredDraggableState$material(), Orientation.Vertical, z, false, null, false, 56, null);
            boolean zChangedInstance = z4 | composerStartRestartGroup.changedInstance(afVar);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda10
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$2$0(bottomSheetState, afVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int i8 = i7 >> 6;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m4216SurfaceFjzlyU(SemanticsModifierKt.semantics(modifierAnchoredDraggable$default, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue3), shape, j2, j3, null, f4, ComposableLambdaKt.rememberComposableLambda(1065607095, true, new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda11
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$3(qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i7 >> 3) & 112) | 1572864 | (i8 & DisplayStrings.DS_TAP_TO_VERIFY) | (i8 & 7168) | (458752 & (i7 << 6)), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda12
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$4(bottomSheetState, z, shape, f2, j2, j3, f3, modifier2, qVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3987BottomSheetScaffoldHnlDQGw(final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.ui.Modifier r35, androidx.compose.material.BottomSheetScaffoldState r36, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, h.g.a.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r38, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r39, int r40, boolean r41, androidx.compose.ui.graphics.Shape r42, float r43, long r44, long r46, float r48, long r49, long r51, final h.g.a.q<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m3987BottomSheetScaffoldHnlDQGw(h.g.a.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, h.g.a.p, h.g.a.q, h.g.a.p, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, long, long, h.g.a.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: BottomSheetScaffoldLayout-HJHHjMs, reason: not valid java name */
    private static final void m3988BottomSheetScaffoldLayoutHJHHjMs(final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final p<? super Composer, ? super Integer, ab> pVar5, final float f2, final a<Float> aVar, final int i2, final BottomSheetState bottomSheetState, Composer composer, final int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(757616750);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar5) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f2) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 4194304 : 8388608;
        }
        if ((100663296 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changed(bottomSheetState) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i4) != 38347922, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(757616750, i4, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
            }
            p[] pVarArr = new p[5];
            pVarArr[0] = pVar == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m4050getLambda$505419337$material() : pVar;
            pVarArr[1] = pVar2;
            pVarArr[2] = pVar3;
            pVarArr[3] = pVar4 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$687232378$material() : pVar4;
            pVarArr[4] = pVar5;
            List listI = i.i(pVarArr);
            boolean z = (3670016 & i4) == 1048576;
            boolean z2 = (29360128 & i4) == 8388608;
            int i6 = i4 & 234881024;
            boolean z3 = (458752 & i4) == 131072;
            boolean z4 = i6 == 67108864;
            BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2 | z3 | z4) || bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1RememberedValue == Composer.Companion.getEmpty()) {
                bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1RememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(aVar, i2, f2, bottomSheetState);
                composerStartRestartGroup.updateRememberedValue(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1RememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1RememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            p<Composer, Integer, ab> pVarCombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listI);
            boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            pVarCombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetScaffoldKt.BottomSheetScaffoldLayout_HJHHjMs$lambda$1(pVar, pVar2, pVar3, pVar4, pVar5, f2, aVar, i2, bottomSheetState, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab BottomSheetScaffoldLayout_HJHHjMs$lambda$1(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, float f2, a aVar, int i2, BottomSheetState bottomSheetState, int i3, Composer composer, int i4) {
        m3988BottomSheetScaffoldLayoutHJHHjMs(pVar, pVar2, pVar3, pVar4, pVar5, f2, aVar, i2, bottomSheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    static final ab BottomSheetScaffold_HnlDQGw$lambda$0(final BottomSheetScaffoldState bottomSheetScaffoldState, p pVar, p pVar2, final float f2, int i2, final q qVar, final boolean z, final Shape shape, final float f3, final long j2, final long j3, final q qVar2, final q qVar3, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-747577963, i3, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:338)");
            }
            BottomSheetState bottomSheetState = bottomSheetScaffoldState.getBottomSheetState();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(601061661, true, new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetScaffoldKt.BottomSheetScaffold_HnlDQGw$lambda$0$0(qVar, f2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1835125948, true, new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetScaffoldKt.BottomSheetScaffold_HnlDQGw$lambda$0$1(z, bottomSheetScaffoldState, f2, shape, f3, j2, j3, qVar2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54);
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(8287226, true, new p() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BottomSheetScaffoldKt.BottomSheetScaffold_HnlDQGw$lambda$0$2(qVar3, bottomSheetScaffoldState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54);
            boolean zChanged = composer.changed(bottomSheetScaffoldState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(BottomSheetScaffoldKt.BottomSheetScaffold_HnlDQGw$lambda$0$3$0(bottomSheetScaffoldState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            m3988BottomSheetScaffoldLayoutHJHHjMs(pVar, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, pVar2, composableLambdaRememberComposableLambda3, f2, (a) objRememberedValue, i2, bottomSheetState, composer, 25008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomSheetScaffold_HnlDQGw$lambda$0$0(q qVar, float f2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(601061661, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:340)");
            }
            qVar.invoke(PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f2, 7, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomSheetScaffold_HnlDQGw$lambda$0$1(boolean z, BottomSheetScaffoldState bottomSheetScaffoldState, float f2, Shape shape, float f3, long j2, long j3, q qVar, Composer composer, int i2) {
        Modifier.Companion companionNestedScroll$default;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1835125948, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:342)");
            }
            if (z) {
                composer.startReplaceGroup(-401495582);
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composer.changed(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material());
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetScaffoldState.getBottomSheetState().getAnchoredDraggableState$material(), Orientation.Vertical);
                    composer.updateRememberedValue(objRememberedValue);
                }
                companionNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue, null, 2, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1675503260);
                composer.endReplaceGroup();
                companionNestedScroll$default = Modifier.Companion;
            }
            m3986BottomSheetdAqlCkY(bottomSheetScaffoldState.getBottomSheetState(), z, shape, f3, j2, j3, f2, SizeKt.m2813requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companionNestedScroll$default, 0.0f, 1, null), f2, 0.0f, 2, null), qVar, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomSheetScaffold_HnlDQGw$lambda$0$2(q qVar, BottomSheetScaffoldState bottomSheetScaffoldState, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(8287226, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:366)");
            }
            qVar.invoke(bottomSheetScaffoldState.getSnackbarHostState(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomSheetScaffold_HnlDQGw$lambda$0$3$0(BottomSheetScaffoldState bottomSheetScaffoldState) {
        return bottomSheetScaffoldState.getBottomSheetState().requireOffset();
    }

    static final ab BottomSheetScaffold_HnlDQGw$lambda$1(q qVar, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, p pVar, q qVar2, p pVar2, int i2, boolean z, Shape shape, float f2, long j2, long j3, float f3, long j4, long j5, q qVar3, int i3, int i4, int i5, Composer composer, int i6) {
        m3987BottomSheetScaffoldHnlDQGw(qVar, modifier, bottomSheetScaffoldState, pVar, qVar2, pVar2, i2, z, shape, f2, j2, j3, f3, j4, j5, qVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.k BottomSheet_dAqlCkY$lambda$1$0(BottomSheetState bottomSheetState, final float f2, IntSize intSize, Constraints constraints) {
        BottomSheetValue bottomSheetValue;
        final int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl());
        final float fM11343unboximpl = (int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda15
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return BottomSheetScaffoldKt.BottomSheet_dAqlCkY$lambda$1$0$0(iM11106getMaxHeightimpl, f2, fM11343unboximpl, (DraggableAnchorsConfig) obj);
            }
        });
        BottomSheetValue targetValue = bottomSheetState.getAnchoredDraggableState$material().getTargetValue();
        BottomSheetValue bottomSheetValue2 = BottomSheetValue.Collapsed;
        int iOrdinal = targetValue.ordinal();
        if (iOrdinal == 0) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            bottomSheetValue = DraggableAnchors.hasAnchorFor(BottomSheetValue.Expanded) ? BottomSheetValue.Expanded : BottomSheetValue.Collapsed;
        }
        return new h.k(DraggableAnchors, bottomSheetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomSheet_dAqlCkY$lambda$1$0$0(int i2, float f2, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        float f4 = i2;
        draggableAnchorsConfig.at(BottomSheetValue.Collapsed, f4 - f2);
        if (f3 > 0.0f && f3 != f2) {
            draggableAnchorsConfig.at(BottomSheetValue.Expanded, f4 - f3);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomSheet_dAqlCkY$lambda$2$0(final BottomSheetState bottomSheetState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (bottomSheetState.getAnchoredDraggableState$material().getAnchors().getSize() > 1) {
            if (bottomSheetState.isCollapsed()) {
                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        BottomSheetScaffoldKt.$r8$lambda$gF3ZbPscuKbjgzYVYcT9lzo7kyI(bottomSheetState, afVar);
                        return true;
                    }
                }, 1, null);
            } else {
                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        BottomSheetScaffoldKt.$r8$lambda$MFQSEJnXsa8v2UeG2iNGJlqbFkY(bottomSheetState, afVar);
                        return true;
                    }
                }, 1, null);
            }
        }
        return ab.f48028a;
    }

    private static final boolean BottomSheet_dAqlCkY$lambda$2$0$0(BottomSheetState bottomSheetState, af afVar) {
        if (!bottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(BottomSheetValue.Expanded).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new BottomSheetScaffoldKt$BottomSheet$2$1$1$1(bottomSheetState, null), 3);
        return true;
    }

    private static final boolean BottomSheet_dAqlCkY$lambda$2$0$1(BottomSheetState bottomSheetState, af afVar) {
        if (!bottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(BottomSheetValue.Collapsed).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new BottomSheetScaffoldKt$BottomSheet$2$1$2$1(bottomSheetState, null), 3);
        return true;
    }

    static final ab BottomSheet_dAqlCkY$lambda$3(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1065607095, i2, -1, "androidx.compose.material.BottomSheet.<anonymous> (BottomSheetScaffold.kt:440)");
            }
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
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab BottomSheet_dAqlCkY$lambda$4(BottomSheetState bottomSheetState, boolean z, Shape shape, float f2, long j2, long j3, float f3, Modifier modifier, q qVar, int i2, int i3, Composer composer, int i4) {
        m3986BottomSheetdAqlCkY(bottomSheetState, z, shape, f2, j2, j3, f3, modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new AnonymousClass1(anchoredDraggableState, orientation);
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 1) != 0) {
            composer2 = composer;
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer2, 6, 6);
        } else {
            composer2 = composer;
        }
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1022285988, i2, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer2.changed(bottomSheetState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i2 & 48) == 32);
        Object objRememberedValue2 = composer2.rememberedValue();
        if (z || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
            composer2.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue bottomSheetValue, final AnimationSpec<Float> animationSpec, final l<? super BottomSheetValue, Boolean> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i2, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = true;
        Object[] objArr = {animationSpec};
        Saver<BottomSheetState, ?> Saver = BottomSheetState.Companion.Saver(animationSpec, lVar, density);
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(bottomSheetValue.ordinal())) || (i2 & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec);
        if ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) <= 256 || !composer.changed(lVar)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z2 = zChanged | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.material.BottomSheetScaffoldKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return BottomSheetScaffoldKt.rememberBottomSheetState$lambda$1$0(bottomSheetValue, density, animationSpec, lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetState;
    }

    private static final boolean rememberBottomSheetState$lambda$0$0(BottomSheetValue bottomSheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetState rememberBottomSheetState$lambda$1$0(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, l lVar) {
        return new BottomSheetState(bottomSheetValue, density, animationSpec, lVar);
    }
}
