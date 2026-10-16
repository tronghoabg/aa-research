package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
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
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.i;
import h.k;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float MaxModalBottomSheetWidth = 640.0f;
    private static final float ModalBottomSheetPositionalThreshold = 56.0f;
    private static final float ModalBottomSheetVelocityThreshold = 125.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
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
                boolean r3 = r7 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.AnonymousClass1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
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
                boolean r0 = r8 instanceof androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.AnonymousClass1.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
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
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                iArr[ModalBottomSheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ModalBottomSheetValue.HalfExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ModalBottomSheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: $r8$lambda$8xWMl4115nSfPaIldnLFlYRM-Pw, reason: not valid java name */
    public static /* synthetic */ boolean m4121$r8$lambda$8xWMl4115nSfPaIldnLFlYRMPw(ModalBottomSheetState modalBottomSheetState, af afVar) {
        ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0$1(modalBottomSheetState, afVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$SozDVpunY97l4IOZrhnmWtFuMgc(ModalBottomSheetState modalBottomSheetState, af afVar) {
        ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0$2(modalBottomSheetState, afVar);
        return true;
    }

    /* renamed from: $r8$lambda$UVGDYkXK_cYayNQAYYF-u8zoAVc, reason: not valid java name */
    public static /* synthetic */ boolean m4123$r8$lambda$UVGDYkXK_cYayNQAYYFu8zoAVc(ModalBottomSheetState modalBottomSheetState, af afVar) {
        ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0$0(modalBottomSheetState, afVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$wQ63NAUQRyTw3_QkjGgacPF8Pws(ModalBottomSheetValue modalBottomSheetValue) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$zepCp0dmhVv2ZYmufSpxFUQ5F4s(a aVar) {
        Scrim_3J_VO9M$lambda$2$0$0(aVar);
        return true;
    }

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState, Orientation orientation) {
        return new AnonymousClass1(anchoredDraggableState, orientation);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    /* renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4126ModalBottomSheetLayoutGs3lGvM(final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.ui.Modifier r35, androidx.compose.material.ModalBottomSheetState r36, boolean r37, androidx.compose.ui.graphics.Shape r38, float r39, long r40, long r42, long r44, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.m4126ModalBottomSheetLayoutGs3lGvM(h.g.a.q, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalBottomSheetLayout_Gs3lGvM$lambda$0$0$0$0(ModalBottomSheetState modalBottomSheetState, af afVar) {
        if (modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            aj.z(afVar, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, null), 3);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0(final ModalBottomSheetState modalBottomSheetState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (modalBottomSheetState.isVisible()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda12
                @Override // h.g.a.a
                public final Object invoke() {
                    ModalBottomSheetKt.m4123$r8$lambda$UVGDYkXK_cYayNQAYYFu8zoAVc(modalBottomSheetState, afVar);
                    return true;
                }
            }, 1, null);
            if (modalBottomSheetState.getAnchoredDraggableState$material().getCurrentValue() == ModalBottomSheetValue.HalfExpanded) {
                SemanticsPropertiesKt.expand$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // h.g.a.a
                    public final Object invoke() {
                        ModalBottomSheetKt.m4121$r8$lambda$8xWMl4115nSfPaIldnLFlYRMPw(modalBottomSheetState, afVar);
                        return true;
                    }
                }, 1, null);
            } else if (modalBottomSheetState.getHasHalfExpandedState$material()) {
                SemanticsPropertiesKt.collapse$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda14
                    @Override // h.g.a.a
                    public final Object invoke() {
                        ModalBottomSheetKt.$r8$lambda$SozDVpunY97l4IOZrhnmWtFuMgc(modalBottomSheetState, afVar);
                        return true;
                    }
                }, 1, null);
            }
        }
        return ab.f48028a;
    }

    private static final boolean ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0$0(ModalBottomSheetState modalBottomSheetState, af afVar) {
        if (!modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.Hidden).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1(modalBottomSheetState, null), 3);
        return true;
    }

    private static final boolean ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0$1(ModalBottomSheetState modalBottomSheetState, af afVar) {
        if (!modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.Expanded).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1(modalBottomSheetState, null), 3);
        return true;
    }

    private static final boolean ModalBottomSheetLayout_Gs3lGvM$lambda$0$2$0$2(ModalBottomSheetState modalBottomSheetState, af afVar) {
        if (!modalBottomSheetState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(ModalBottomSheetValue.HalfExpanded).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1(modalBottomSheetState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalBottomSheetLayout_Gs3lGvM$lambda$0$3(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1557535116, i2, -1, "androidx.compose.material.ModalBottomSheetLayout.<anonymous>.<anonymous> (ModalBottomSheet.kt:438)");
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

    static final ab ModalBottomSheetLayout_Gs3lGvM$lambda$1(q qVar, Modifier modifier, ModalBottomSheetState modalBottomSheetState, boolean z, Shape shape, float f2, long j2, long j3, long j4, p pVar, int i2, int i3, Composer composer, int i4) {
        m4126ModalBottomSheetLayoutGs3lGvM(qVar, modifier, modalBottomSheetState, z, shape, f2, j2, j3, j4, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    private static final void m4127Scrim3JVO9M(final long j2, final a<ab> aVar, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionSemantics;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-526532668);
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
                ComposerKt.traceEventStart(-526532668, i3, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j2 != 16) {
                composerStartRestartGroup.startReplaceGroup(-714029408);
                boolean z2 = true;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(true != z ? 0.0f : 1.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                final String strM4215getString4foXLRw = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4208getCloseSheetUdPEhr4(), composerStartRestartGroup, 6);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-713811509);
                    Modifier.Companion companion = Modifier.Companion;
                    int i5 = i3 & 112;
                    ModalBottomSheetKt$Scrim$dismissModifier$1$1 modalBottomSheetKt$Scrim$dismissModifier$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i5 == 32 || modalBottomSheetKt$Scrim$dismissModifier$1$1RememberedValue == Composer.Companion.getEmpty()) {
                        modalBottomSheetKt$Scrim$dismissModifier$1$1RememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(aVar);
                        composerStartRestartGroup.updateRememberedValue(modalBottomSheetKt$Scrim$dismissModifier$1$1RememberedValue);
                    }
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (PointerInputEventHandler) modalBottomSheetKt$Scrim$dismissModifier$1$1RememberedValue);
                    boolean zChanged = (i5 == 32) | composerStartRestartGroup.changed(strM4215getString4foXLRw);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new l() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return ModalBottomSheetKt.Scrim_3J_VO9M$lambda$2$0(strM4215getString4foXLRw, aVar, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    companionSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (l) objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-713447786);
                    composerStartRestartGroup.endReplaceGroup();
                    companionSemantics = Modifier.Companion;
                }
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companionSemantics);
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | z2;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new l() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return ModalBottomSheetKt.Scrim_3J_VO9M$lambda$3$0(j2, stateAnimateFloatAsState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                CanvasKt.Canvas(modifierThen, (l) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-713262530);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ModalBottomSheetKt.Scrim_3J_VO9M$lambda$4(j2, aVar, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float Scrim_3J_VO9M$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_3J_VO9M$lambda$2$0(String str, final a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                ModalBottomSheetKt.$r8$lambda$zepCp0dmhVv2ZYmufSpxFUQ5F4s(aVar);
                return true;
            }
        }, 1, null);
        return ab.f48028a;
    }

    private static final boolean Scrim_3J_VO9M$lambda$2$0$0(a aVar) {
        aVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_3J_VO9M$lambda$3$0(long j2, State state, DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, n.g(Scrim_3J_VO9M$lambda$0(state), 0.0f, 1.0f), null, null, 0, 118, null);
        return ab.f48028a;
    }

    static final ab Scrim_3J_VO9M$lambda$4(long j2, a aVar, boolean z, int i2, Composer composer, int i3) {
        m4127Scrim3JVO9M(j2, aVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final Modifier modalBottomSheetAnchors(Modifier modifier, final ModalBottomSheetState modalBottomSheetState) {
        return AnchoredDraggableKt.draggableAnchors(modifier, modalBottomSheetState.getAnchoredDraggableState$material(), Orientation.Vertical, new p() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda11
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ModalBottomSheetKt.modalBottomSheetAnchors$lambda$0(modalBottomSheetState, (IntSize) obj, (Constraints) obj2);
            }
        });
    }

    static final k modalBottomSheetAnchors$lambda$0(final ModalBottomSheetState modalBottomSheetState, final IntSize intSize, Constraints constraints) {
        final float fM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(constraints.m11113unboximpl());
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda6
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ModalBottomSheetKt.modalBottomSheetAnchors$lambda$0$0(fM11106getMaxHeightimpl, modalBottomSheetState, intSize, (DraggableAnchorsConfig) obj);
            }
        });
        int size = modalBottomSheetState.getAnchoredDraggableState$material().getAnchors().getSize();
        ModalBottomSheetValue currentValue = modalBottomSheetState.getCurrentValue();
        if (size > 0 || !DraggableAnchors.hasAnchorFor(currentValue)) {
            ModalBottomSheetValue targetValue = modalBottomSheetState.getTargetValue();
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Hidden;
            int iOrdinal = targetValue.ordinal();
            if (iOrdinal == 0) {
                currentValue = ModalBottomSheetValue.Hidden;
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw new i();
                }
                currentValue = DraggableAnchors.hasAnchorFor(ModalBottomSheetValue.HalfExpanded) ? ModalBottomSheetValue.HalfExpanded : DraggableAnchors.hasAnchorFor(ModalBottomSheetValue.Expanded) ? ModalBottomSheetValue.Expanded : ModalBottomSheetValue.Hidden;
            }
        }
        return new k(DraggableAnchors, currentValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab modalBottomSheetAnchors$lambda$0$0(float f2, ModalBottomSheetState modalBottomSheetState, IntSize intSize, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(ModalBottomSheetValue.Hidden, f2);
        if (!modalBottomSheetState.isSkipHalfExpanded$material()) {
            float f3 = f2 / 2.0f;
            if (((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) > f3) {
                draggableAnchorsConfig.at(ModalBottomSheetValue.HalfExpanded, f3);
            }
        }
        if (((int) (intSize.m11343unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != 0) {
            draggableAnchorsConfig.at(ModalBottomSheetValue.Expanded, Math.max(0.0f, f2 - ((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & intSize.m11343unboximpl()))));
        }
        return ab.f48028a;
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(final ModalBottomSheetValue modalBottomSheetValue, AnimationSpec<Float> animationSpec, l<? super ModalBottomSheetValue, Boolean> lVar, boolean z, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = ModalBottomSheetDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        final l<? super ModalBottomSheetValue, Boolean> lVar2 = lVar;
        int i4 = i3 & 8;
        boolean z2 = true;
        final boolean z3 = (i4 == 0) & z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-126412120, i2, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startMovableGroup(-1222944377, modalBottomSheetValue);
        Object[] objArr = {modalBottomSheetValue, animationSpec2, Boolean.valueOf(z3), lVar2, density};
        Saver<ModalBottomSheetState, ?> Saver = ModalBottomSheetState.Companion.Saver(animationSpec2, lVar2, z3, density);
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(modalBottomSheetValue.ordinal())) || (i2 & 6) == 4) | composer.changed(density) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(lVar2)) || (i2 & 384) == 256) | composer.changedInstance(animationSpec2);
        if ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) <= 2048 || !composer.changed(z3)) && (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) != 2048) {
            z2 = false;
        }
        boolean z4 = zChanged | z2;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            Object obj = new a() { // from class: androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return ModalBottomSheetKt.rememberModalBottomSheetState$lambda$1$0(modalBottomSheetValue, density, lVar2, animationSpec2, z3);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue2 = obj;
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue2, composer, 0);
        composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modalBottomSheetState;
    }

    private static final boolean rememberModalBottomSheetState$lambda$0$0(ModalBottomSheetValue modalBottomSheetValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalBottomSheetState rememberModalBottomSheetState$lambda$1$0(ModalBottomSheetValue modalBottomSheetValue, Density density, l lVar, AnimationSpec animationSpec, boolean z) {
        return new ModalBottomSheetState(modalBottomSheetValue, density, lVar, animationSpec, z);
    }
}
