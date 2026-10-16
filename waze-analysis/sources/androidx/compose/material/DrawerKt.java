package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawerKt {
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold = 56.0f;
    private static final float DrawerVelocityThreshold = 400.0f;
    private static final float EndDrawerPadding = 56.0f;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1657a = 0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    public final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ AnchoredDraggableState<?> $state;
        private final Orientation orientation = Orientation.Vertical;

        AnonymousClass1(AnchoredDraggableState<?> anchoredDraggableState) {
            this.$state = anchoredDraggableState;
        }

        private final float offsetToFloat(long j2) {
            return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j2 >> 32) : (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }

        private final long toOffset(float f2) {
            Orientation orientation = this.orientation;
            float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
            Orientation orientation2 = Orientation.Vertical;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
            if (orientation != orientation2) {
                f2 = 0.0f;
            }
            return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
        }

        private final float velocityToFloat(long j2) {
            return this.orientation == Orientation.Horizontal ? Velocity.m11406getXimpl(j2) : Velocity.m11407getYimpl(j2);
        }

        public final Orientation getOrientation() {
            return this.orientation;
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
                boolean r3 = r7 instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
                if (r3 == 0) goto L13
                r3 = r7
                androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r3
                int r4 = r3.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r4 & r0
                if (r1 == 0) goto L13
                int r4 = r4 - r0
                r3.label = r4
                goto L18
            L13:
                androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r3 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.AnonymousClass1.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
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
                boolean r0 = r8 instanceof androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = new androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.AnonymousClass1.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
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
            int[] iArr = new int[BottomDrawerValue.values().length];
            try {
                iArr[BottomDrawerValue.Closed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomDrawerValue.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomDrawerValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ boolean $r8$lambda$1lRBgqQoAlpqE9QA0P6jZxba0BA(DrawerValue drawerValue) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$GdMUtVt2s9lU8rF1IfkcdyhczeA(BottomDrawerValue bottomDrawerValue) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$Gpo0nnoP2dNhCUKiES65_i2OpTw(a aVar) {
        Scrim_Bx497Mc$lambda$1$0$0(aVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$Z4yBYcj7QipKCYQKRwwsucHsr5M(DrawerState drawerState, af afVar) {
        ModalDrawer_Gs3lGvM$lambda$0$1$5$0$0(drawerState, afVar);
        return true;
    }

    /* renamed from: $r8$lambda$misvRtgWlA1mirT0VqanO-FxCdI, reason: not valid java name */
    public static /* synthetic */ boolean m4068$r8$lambda$misvRtgWlA1mirT0VqanOFxCdI(BottomDrawerState bottomDrawerState, af afVar) {
        BottomDrawer_Gs3lGvM$lambda$0$1$3$0$0(bottomDrawerState, afVar);
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$wjSyGBg3T7hfh0Z9XN8C00UBJJ0(a aVar) {
        BottomDrawerScrim_3J_VO9M$lambda$2$0$0(aVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4070BottomDrawerGs3lGvM(final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.ui.Modifier r33, androidx.compose.material.BottomDrawerState r34, boolean r35, androidx.compose.ui.graphics.Shape r36, float r37, long r38, long r40, long r42, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m4070BottomDrawerGs3lGvM(h.g.a.q, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    private static final void m4071BottomDrawerScrim3JVO9M(final long j2, final a<ab> aVar, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionSemantics;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-513067266);
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
                ComposerKt.traceEventStart(-513067266, i3, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:725)");
            }
            if (j2 != 16) {
                composerStartRestartGroup.startReplaceGroup(1001814516);
                boolean z2 = true;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(true != z ? 0.0f : 1.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                final String strM4215getString4foXLRw = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4207getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1002034864);
                    Modifier.Companion companion = Modifier.Companion;
                    int i5 = i3 & 112;
                    DrawerKt$BottomDrawerScrim$dismissModifier$1$1 drawerKt$BottomDrawerScrim$dismissModifier$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (i5 == 32 || drawerKt$BottomDrawerScrim$dismissModifier$1$1RememberedValue == Composer.Companion.getEmpty()) {
                        drawerKt$BottomDrawerScrim$dismissModifier$1$1RememberedValue = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(aVar);
                        composerStartRestartGroup.updateRememberedValue(drawerKt$BottomDrawerScrim$dismissModifier$1$1RememberedValue);
                    }
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (PointerInputEventHandler) drawerKt$BottomDrawerScrim$dismissModifier$1$1RememberedValue);
                    boolean zChanged = (i5 == 32) | composerStartRestartGroup.changed(strM4215getString4foXLRw);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda19
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) {
                                return DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$2$0(strM4215getString4foXLRw, aVar, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    companionSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (l) objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1002399548);
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
                    objRememberedValue2 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda20
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$3$0(j2, stateAnimateFloatAsState, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                CanvasKt.Canvas(modifierThen, (l) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1002567940);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda21
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerKt.BottomDrawerScrim_3J_VO9M$lambda$4(j2, aVar, z, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float BottomDrawerScrim_3J_VO9M$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomDrawerScrim_3J_VO9M$lambda$2$0(String str, final a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                DrawerKt.$r8$lambda$wjSyGBg3T7hfh0Z9XN8C00UBJJ0(aVar);
                return true;
            }
        }, 1, null);
        return ab.f48028a;
    }

    private static final boolean BottomDrawerScrim_3J_VO9M$lambda$2$0$0(a aVar) {
        aVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomDrawerScrim_3J_VO9M$lambda$3$0(long j2, State state, DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, BottomDrawerScrim_3J_VO9M$lambda$0(state), null, null, 0, 118, null);
        return ab.f48028a;
    }

    static final ab BottomDrawerScrim_3J_VO9M$lambda$4(long j2, a aVar, boolean z, int i2, Composer composer, int i3) {
        m4071BottomDrawerScrim3JVO9M(j2, aVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab BottomDrawer_Gs3lGvM$lambda$0(final boolean z, final BottomDrawerState bottomDrawerState, p pVar, long j2, final af afVar, Shape shape, long j3, long j4, float f2, final q qVar, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i3;
        if ((i2 & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope2) ? 2 : 4);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468886998, i3, -1, "androidx.compose.material.BottomDrawer.<anonymous> (Drawer.kt:591)");
            }
            int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk());
            final boolean z2 = Constraints.m11107getMaxWidthimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk()) > Constraints.m11106getMaxHeightimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk());
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierM2826sizeInqDBjuR0$default = SizeKt.m2826sizeInqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, density.mo2124toDpu2uoSUM(Constraints.m11107getMaxWidthimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk())), density.mo2124toDpu2uoSUM(Constraints.m11106getMaxHeightimpl(boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk())), 3, null);
            Modifier.Companion companionNestedScroll$default = z ? NestedScrollModifierKt.nestedScroll$default(Modifier.Companion, bottomDrawerState.getNestedScrollConnection$material(), null, 2, null) : Modifier.Companion;
            boolean z3 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Modifier.Companion.then(companionNestedScroll$default);
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companionNestedScroll$default, bottomDrawerState.getAnchoredDraggableState$material(), Orientation.Vertical, z, z3, null, false, 48, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnchoredDraggable$default);
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
            boolean zChanged = composer.changed(z) | composer.changedInstance(bottomDrawerState) | composer.changedInstance(afVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda24
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DrawerKt.BottomDrawer_Gs3lGvM$lambda$0$1$0$0(z, bottomDrawerState, afVar);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            final float f3 = iM11106getMaxHeightimpl;
            m4071BottomDrawerScrim3JVO9M(j2, (a) objRememberedValue, bottomDrawerState.getTargetValue() != BottomDrawerValue.Closed, composer, 0);
            final String strM4215getString4foXLRw = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4211getNavigationMenuUdPEhr4(), composer, 6);
            boolean zChanged2 = composer.changed(f3) | composer.changed(z2) | composer.changedInstance(bottomDrawerState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda25
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DrawerKt.BottomDrawer_Gs3lGvM$lambda$0$1$1$0(bottomDrawerState, f3, z2, (IntSize) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM2826sizeInqDBjuR0$default, (l) objRememberedValue2);
            boolean zChangedInstance = composer.changedInstance(bottomDrawerState);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda26
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DrawerKt.BottomDrawer_Gs3lGvM$lambda$0$1$2$0(bottomDrawerState, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOffset = OffsetKt.offset(modifierOnSizeChanged, (l) objRememberedValue3);
            boolean zChanged3 = composer.changed(strM4215getString4foXLRw) | composer.changedInstance(bottomDrawerState) | composer.changedInstance(afVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda27
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DrawerKt.BottomDrawer_Gs3lGvM$lambda$0$1$3$0(strM4215getString4foXLRw, bottomDrawerState, afVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            SurfaceKt.m4216SurfaceFjzlyU(SemanticsModifierKt.semantics(modifierOffset, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue4), shape, j3, j4, null, f2, ComposableLambdaKt.rememberComposableLambda(1691510868, true, new p() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda28
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerKt.BottomDrawer_Gs3lGvM$lambda$0$1$4(qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 1572864, 16);
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
    public static final ab BottomDrawer_Gs3lGvM$lambda$0$1$0$0(boolean z, BottomDrawerState bottomDrawerState, af afVar) {
        if (z && bottomDrawerState.confirmStateChange$material(BottomDrawerValue.Closed)) {
            aj.z(afVar, null, null, new DrawerKt$BottomDrawer$1$1$1$1$1(bottomDrawerState, null), 3);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h.ab BottomDrawer_Gs3lGvM$lambda$0$1$1$0(androidx.compose.material.BottomDrawerState r4, final float r5, final boolean r6, androidx.compose.ui.unit.IntSize r7) {
        /*
            long r0 = r7.m11343unboximpl()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            androidx.compose.material.DrawerKt$$ExternalSyntheticLambda29 r7 = new androidx.compose.material.DrawerKt$$ExternalSyntheticLambda29
            int r0 = (int) r0
            float r0 = (float) r0
            r7.<init>()
            androidx.compose.material.DraggableAnchors r5 = androidx.compose.material.AnchoredDraggableKt.DraggableAnchors(r7)
            androidx.compose.material.AnchoredDraggableState r6 = r4.getAnchoredDraggableState$material()
            androidx.compose.material.DraggableAnchors r6 = r6.getAnchors()
            int r6 = r6.getSize()
            if (r6 <= 0) goto L24
            goto L33
        L24:
            androidx.compose.material.BottomDrawerValue r6 = r4.getCurrentValue()
            boolean r6 = r5.hasAnchorFor(r6)
            if (r6 == 0) goto L33
            androidx.compose.material.BottomDrawerValue r6 = r4.getCurrentValue()
            goto L64
        L33:
            androidx.compose.material.BottomDrawerValue r6 = r4.getTargetValue()
            androidx.compose.material.BottomDrawerValue r7 = androidx.compose.material.BottomDrawerValue.Closed
            int r6 = r6.ordinal()
            if (r6 == 0) goto L62
            r7 = 1
            if (r6 == r7) goto L4c
            r7 = 2
            if (r6 != r7) goto L46
            goto L4c
        L46:
            h.i r4 = new h.i
            r4.<init>()
            throw r4
        L4c:
            androidx.compose.material.BottomDrawerValue r6 = androidx.compose.material.BottomDrawerValue.Open
            boolean r6 = r5.hasAnchorFor(r6)
            if (r6 == 0) goto L57
            androidx.compose.material.BottomDrawerValue r6 = androidx.compose.material.BottomDrawerValue.Open
            goto L64
        L57:
            androidx.compose.material.BottomDrawerValue r6 = androidx.compose.material.BottomDrawerValue.Expanded
            boolean r6 = r5.hasAnchorFor(r6)
            if (r6 == 0) goto L62
            androidx.compose.material.BottomDrawerValue r6 = androidx.compose.material.BottomDrawerValue.Expanded
            goto L64
        L62:
            androidx.compose.material.BottomDrawerValue r6 = androidx.compose.material.BottomDrawerValue.Closed
        L64:
            androidx.compose.material.AnchoredDraggableState r4 = r4.getAnchoredDraggableState$material()
            r4.updateAnchors(r5, r6)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.BottomDrawer_Gs3lGvM$lambda$0$1$1$0(androidx.compose.material.BottomDrawerState, float, boolean, androidx.compose.ui.unit.IntSize):h.ab");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomDrawer_Gs3lGvM$lambda$0$1$1$0$0(float f2, float f3, boolean z, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(BottomDrawerValue.Closed, f2);
        float f4 = 0.5f * f2;
        if (f3 > f4 || z) {
            draggableAnchorsConfig.at(BottomDrawerValue.Open, f4);
        }
        if (f3 > 0.0f) {
            draggableAnchorsConfig.at(BottomDrawerValue.Expanded, Math.max(0.0f, f2 - f3));
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset BottomDrawer_Gs3lGvM$lambda$0$1$2$0(BottomDrawerState bottomDrawerState, Density density) {
        return IntOffset.m11287boximpl(h.h.a.b(bottomDrawerState.requireOffset$material()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomDrawer_Gs3lGvM$lambda$0$1$3$0(String str, final BottomDrawerState bottomDrawerState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (bottomDrawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda15
                @Override // h.g.a.a
                public final Object invoke() {
                    DrawerKt.m4068$r8$lambda$misvRtgWlA1mirT0VqanOFxCdI(bottomDrawerState, afVar);
                    return true;
                }
            }, 1, null);
        }
        return ab.f48028a;
    }

    private static final boolean BottomDrawer_Gs3lGvM$lambda$0$1$3$0$0(BottomDrawerState bottomDrawerState, af afVar) {
        if (!bottomDrawerState.confirmStateChange$material(BottomDrawerValue.Closed)) {
            return true;
        }
        aj.z(afVar, null, null, new DrawerKt$BottomDrawer$1$1$4$1$1$1(bottomDrawerState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab BottomDrawer_Gs3lGvM$lambda$0$1$4(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1691510868, i2, -1, "androidx.compose.material.BottomDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:687)");
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

    static final ab BottomDrawer_Gs3lGvM$lambda$1(q qVar, Modifier modifier, BottomDrawerState bottomDrawerState, boolean z, Shape shape, float f2, long j2, long j3, long j4, p pVar, int i2, int i3, Composer composer, int i4) {
        m4070BottomDrawerGs3lGvM(qVar, modifier, bottomDrawerState, z, shape, f2, j2, j3, j4, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> anchoredDraggableState) {
        return new AnonymousClass1(anchoredDraggableState);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4072ModalDrawerGs3lGvM(final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, androidx.compose.ui.Modifier r33, androidx.compose.material.DrawerState r34, boolean r35, androidx.compose.ui.graphics.Shape r36, float r37, long r38, long r40, long r42, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.m4072ModalDrawerGs3lGvM(h.g.a.q, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ModalDrawer_Gs3lGvM$lambda$0(final DrawerState drawerState, final boolean z, final af afVar, long j2, Shape shape, long j3, long j4, float f2, p pVar, final q qVar, BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i2) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i3;
        boolean z2;
        boolean z3;
        if ((i2 & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2 | (true != composer.changed(boxWithConstraintsScope2) ? 2 : 4);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1549911011, i3, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:464)");
            }
            long jMo2467getConstraintsmsEJaDk = boxWithConstraintsScope2.mo2467getConstraintsmsEJaDk();
            if (!Constraints.m11103getHasBoundedWidthimpl(jMo2467getConstraintsmsEJaDk)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(jMo2467getConstraintsmsEJaDk);
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            final float f3 = -iM11107getMaxWidthimpl;
            boolean zChanged = composer.changed(drawerState) | composer.changed(density) | composer.changed(f3);
            Object objRememberedValue = composer.rememberedValue();
            final float f4 = 0.0f;
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$0$0(drawerState, density, f3, f4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.SideEffect((a) objRememberedValue, composer, 0);
            if (composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(Modifier.Companion, drawerState.getAnchoredDraggableState$material(), Orientation.Horizontal, z, z3, null, false, 48, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAnchoredDraggable$default);
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
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composer.getInserting() || !x.n(composer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                composer.updateRememberedValue(numValueOf2);
                composer.apply(numValueOf2, setCompositeKeyHash2);
            }
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            boolean zIsOpen = drawerState.isOpen();
            boolean zChanged2 = composer.changed(z) | composer.changed(drawerState) | composer.changedInstance(afVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$1$0(z, drawerState, afVar);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            a aVar = (a) objRememberedValue2;
            boolean zChanged3 = composer.changed(f3) | composer.changed(drawerState);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                final float f5 = 0.0f;
                objRememberedValue3 = new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$2$0(f3, f5, drawerState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            m4073ScrimBx497Mc(zIsOpen, aVar, (a) objRememberedValue3, j2, composer, 0);
            final String strM4215getString4foXLRw = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4211getNavigationMenuUdPEhr4(), composer, 6);
            Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Modifier modifierM2825sizeInqDBjuR0 = SizeKt.m2825sizeInqDBjuR0(Modifier.Companion, density2.mo2124toDpu2uoSUM(Constraints.m11109getMinWidthimpl(jMo2467getConstraintsmsEJaDk)), density2.mo2124toDpu2uoSUM(Constraints.m11108getMinHeightimpl(jMo2467getConstraintsmsEJaDk)), density2.mo2124toDpu2uoSUM(Constraints.m11107getMaxWidthimpl(jMo2467getConstraintsmsEJaDk)), density2.mo2124toDpu2uoSUM(Constraints.m11106getMaxHeightimpl(jMo2467getConstraintsmsEJaDk)));
            boolean zChanged4 = composer.changed(drawerState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$4$0(drawerState, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(OffsetKt.offset(modifierM2825sizeInqDBjuR0, (l) objRememberedValue4), 0.0f, 0.0f, EndDrawerPadding, 0.0f, 11, null);
            boolean zChanged5 = composer.changed(strM4215getString4foXLRw) | composer.changed(drawerState) | composer.changedInstance(afVar);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda10
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$5$0(strM4215getString4foXLRw, drawerState, afVar, (SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            SurfaceKt.m4216SurfaceFjzlyU(SemanticsModifierKt.semantics(modifierM2759paddingqDBjuR0$default, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), (l) objRememberedValue5), shape, j3, j4, null, f2, ComposableLambdaKt.rememberComposableLambda(1265707871, true, new p() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda11
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$1$6(qVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 1572864, 16);
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
    public static final ab ModalDrawer_Gs3lGvM$lambda$0$0$0(DrawerState drawerState, Density density, final float f2, final float f3) {
        drawerState.setDensity$material(density);
        AnchoredDraggableState.updateAnchors$default(drawerState.getAnchoredDraggableState$material(), AnchoredDraggableKt.DraggableAnchors(new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda30
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DrawerKt.ModalDrawer_Gs3lGvM$lambda$0$0$0$0(f2, f3, (DraggableAnchorsConfig) obj);
            }
        }), null, 2, null);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalDrawer_Gs3lGvM$lambda$0$0$0$0(float f2, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.at(DrawerValue.Closed, f2);
        draggableAnchorsConfig.at(DrawerValue.Open, f3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalDrawer_Gs3lGvM$lambda$0$1$1$0(boolean z, DrawerState drawerState, af afVar) {
        if (z && drawerState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(DrawerValue.Closed).booleanValue()) {
            aj.z(afVar, null, null, new DrawerKt$ModalDrawer$1$2$2$1$1(drawerState, null), 3);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalDrawer_Gs3lGvM$lambda$0$1$2$0(float f2, float f3, DrawerState drawerState) {
        return calculateFraction(f2, f3, drawerState.requireOffset$material());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ModalDrawer_Gs3lGvM$lambda$0$1$4$0(DrawerState drawerState, Density density) {
        return IntOffset.m11287boximpl(h.h.a.b(drawerState.requireOffset$material()) << 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalDrawer_Gs3lGvM$lambda$0$1$5$0(String str, final DrawerState drawerState, final af afVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda12
                @Override // h.g.a.a
                public final Object invoke() {
                    DrawerKt.$r8$lambda$Z4yBYcj7QipKCYQKRwwsucHsr5M(drawerState, afVar);
                    return true;
                }
            }, 1, null);
        }
        return ab.f48028a;
    }

    private static final boolean ModalDrawer_Gs3lGvM$lambda$0$1$5$0$0(DrawerState drawerState, af afVar) {
        if (!drawerState.getAnchoredDraggableState$material().getConfirmValueChange$material().invoke(DrawerValue.Closed).booleanValue()) {
            return true;
        }
        aj.z(afVar, null, null, new DrawerKt$ModalDrawer$1$2$6$1$1$1(drawerState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ModalDrawer_Gs3lGvM$lambda$0$1$6(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265707871, i2, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:540)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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

    static final ab ModalDrawer_Gs3lGvM$lambda$1(q qVar, Modifier modifier, DrawerState drawerState, boolean z, Shape shape, float f2, long j2, long j3, long j4, p pVar, int i2, int i3, Composer composer, int i4) {
        m4072ModalDrawerGs3lGvM(qVar, modifier, drawerState, z, shape, f2, j2, j3, j4, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    private static final void m4073ScrimBx497Mc(final boolean z, final a<ab> aVar, final a<Float> aVar2, final long j2, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionSemantics;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1983403750);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983403750, i3, -1, "androidx.compose.material.Scrim (Drawer.kt:751)");
            }
            final String strM4215getString4foXLRw = Strings_androidKt.m4215getString4foXLRw(Strings.Companion.m4207getCloseDrawerUdPEhr4(), composerStartRestartGroup, 6);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1716213970);
                Modifier.Companion companion = Modifier.Companion;
                int i5 = i3 & 112;
                DrawerKt$Scrim$dismissDrawer$1$1 drawerKt$Scrim$dismissDrawer$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (i5 == 32 || drawerKt$Scrim$dismissDrawer$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    drawerKt$Scrim$dismissDrawer$1$1RememberedValue = new DrawerKt$Scrim$dismissDrawer$1$1(aVar);
                    composerStartRestartGroup.updateRememberedValue(drawerKt$Scrim$dismissDrawer$1$1RememberedValue);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, aVar, (PointerInputEventHandler) drawerKt$Scrim$dismissDrawer$1$1RememberedValue);
                boolean zChanged = (i5 == 32) | composerStartRestartGroup.changed(strM4215getString4foXLRw);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda16
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return DrawerKt.Scrim_Bx497Mc$lambda$1$0(strM4215getString4foXLRw, aVar, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                companionSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (l) objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1716538044);
                composerStartRestartGroup.endReplaceGroup();
                companionSemantics = Modifier.Companion;
            }
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companionSemantics);
            boolean z2 = (i3 & 7168) == 2048;
            boolean z3 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z3 | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda17
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DrawerKt.Scrim_Bx497Mc$lambda$2$0(j2, aVar2, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CanvasKt.Canvas(modifierThen, (l) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda18
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerKt.Scrim_Bx497Mc$lambda$3(z, aVar, aVar2, j2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_Bx497Mc$lambda$1$0(String str, final a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                DrawerKt.$r8$lambda$Gpo0nnoP2dNhCUKiES65_i2OpTw(aVar);
                return true;
            }
        }, 1, null);
        return ab.f48028a;
    }

    private static final boolean Scrim_Bx497Mc$lambda$1$0$0(a aVar) {
        aVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Scrim_Bx497Mc$lambda$2$0(long j2, a aVar, DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, ((Number) aVar.invoke()).floatValue(), null, null, 0, 118, null);
        return ab.f48028a;
    }

    static final ab Scrim_Bx497Mc$lambda$3(boolean z, a aVar, a aVar2, long j2, int i2, Composer composer, int i3) {
        m4073ScrimBx497Mc(z, aVar, aVar2, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static final float calculateFraction(float f2, float f3, float f4) {
        float f5 = (f4 - f2) / (f3 - f2);
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            return 1.0f;
        }
        return f5;
    }

    public static final BottomDrawerState rememberBottomDrawerState(final BottomDrawerValue bottomDrawerValue, final l<? super BottomDrawerValue, Boolean> lVar, final AnimationSpec<Float> animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda22
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        int i4 = DrawerKt.f1657a;
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        if ((i3 & 4) != 0) {
            animationSpec = DrawerDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477366969, i2, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:409)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = true;
        Object[] objArr = {density};
        Saver<BottomDrawerState, BottomDrawerValue> Saver = BottomDrawerState.Companion.Saver(density, lVar, animationSpec);
        boolean zChanged = ((((i2 & 14) ^ 6) > 4 && composer.changed(bottomDrawerValue.ordinal())) || (i2 & 6) == 4) | composer.changed(density);
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(lVar)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean zChangedInstance = zChanged | z | composer.changedInstance(animationSpec);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda23
                @Override // h.g.a.a
                public final Object invoke() {
                    return DrawerKt.rememberBottomDrawerState$lambda$1$0(bottomDrawerValue, density, lVar, animationSpec);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomDrawerState bottomDrawerState = (BottomDrawerState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomDrawerState;
    }

    private static final boolean rememberBottomDrawerState$lambda$0$0(BottomDrawerValue bottomDrawerValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomDrawerState rememberBottomDrawerState$lambda$1$0(BottomDrawerValue bottomDrawerValue, Density density, l lVar, AnimationSpec animationSpec) {
        return new BottomDrawerState(bottomDrawerValue, density, lVar, animationSpec);
    }

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final l<? super DrawerValue, Boolean> lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        int i4 = DrawerKt.f1657a;
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            lVar = (l) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435874229, i2, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:390)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(lVar);
        boolean z = true;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(drawerValue.ordinal())) || (i2 & 6) == 4;
        if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(lVar)) && (i2 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue2 = composer.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new a() { // from class: androidx.compose.material.DrawerKt$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return DrawerKt.rememberDrawerState$lambda$1$0(drawerValue, lVar);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }

    private static final boolean rememberDrawerState$lambda$0$0(DrawerValue drawerValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawerState rememberDrawerState$lambda$1$0(DrawerValue drawerValue, l lVar) {
        return new DrawerState(drawerValue, lVar);
    }
}
