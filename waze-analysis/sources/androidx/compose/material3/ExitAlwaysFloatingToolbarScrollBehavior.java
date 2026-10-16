package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import h.g.b.am;
import h.g.b.o;
import h.h.a;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExitAlwaysFloatingToolbarScrollBehavior implements FloatingToolbarScrollBehavior {
    public static final int $stable = 0;
    private final int exitDirection;
    private final DecayAnimationSpec<Float> flingAnimationSpec;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final FloatingToolbarState state;

    private ExitAlwaysFloatingToolbarScrollBehavior(int i2, FloatingToolbarState floatingToolbarState, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec) {
        this.exitDirection = i2;
        this.state = floatingToolbarState;
        this.snapAnimationSpec = animationSpec;
        this.flingAnimationSpec = decayAnimationSpec;
    }

    static final ab floatingScrollBehavior$lambda$0(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, am amVar, float f2) {
        if (i.i(FloatingToolbarExitDirection.m4918boximpl(FloatingToolbarExitDirection.Companion.m4927getStart8LIK8E()), FloatingToolbarExitDirection.m4918boximpl(FloatingToolbarExitDirection.Companion.m4926getEnd8LIK8E())).contains(FloatingToolbarExitDirection.m4918boximpl(exitAlwaysFloatingToolbarScrollBehavior.mo4800getExitDirection8LIK8E())) && amVar.f48101a) {
            f2 = -f2;
        }
        int iMo4800getExitDirection8LIK8E = exitAlwaysFloatingToolbarScrollBehavior.mo4800getExitDirection8LIK8E();
        if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4927getStart8LIK8E()) || FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4928getTop8LIK8E())) {
            FloatingToolbarState state = exitAlwaysFloatingToolbarScrollBehavior.getState();
            state.setOffset(state.getOffset() + f2);
        } else if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4926getEnd8LIK8E()) || FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4925getBottom8LIK8E())) {
            FloatingToolbarState state2 = exitAlwaysFloatingToolbarScrollBehavior.getState();
            state2.setOffset(state2.getOffset() - f2);
        }
        return ab.f48028a;
    }

    static final MeasureResult floatingScrollBehavior$lambda$1(am amVar, final ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        amVar.f48101a = measureScope.getLayoutDirection() == LayoutDirection.Rtl;
        final Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(constraints.m11113unboximpl());
        final float offset = (i.i(FloatingToolbarExitDirection.m4918boximpl(FloatingToolbarExitDirection.Companion.m4927getStart8LIK8E()), FloatingToolbarExitDirection.m4918boximpl(FloatingToolbarExitDirection.Companion.m4926getEnd8LIK8E())).contains(FloatingToolbarExitDirection.m4918boximpl(exitAlwaysFloatingToolbarScrollBehavior.mo4800getExitDirection8LIK8E())) && amVar.f48101a) ? -exitAlwaysFloatingToolbarScrollBehavior.getState().getOffset() : exitAlwaysFloatingToolbarScrollBehavior.getState().getOffset();
        return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new l() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$1$0(this.f$0, placeableMo9741measureBRTryo0, offset, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab floatingScrollBehavior$lambda$1$0(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, Placeable placeable, float f2, Placeable.PlacementScope placementScope) {
        int iMo4800getExitDirection8LIK8E = exitAlwaysFloatingToolbarScrollBehavior.mo4800getExitDirection8LIK8E();
        if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4927getStart8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, a.b(f2), 0, 0.0f, (l) null, 12, (Object) null);
        } else if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4926getEnd8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, -a.b(f2), 0, 0.0f, (l) null, 12, (Object) null);
        } else if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4928getTop8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, a.b(f2), 0.0f, (l) null, 12, (Object) null);
        } else if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4925getBottom8LIK8E())) {
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, -a.b(f2), 0.0f, (l) null, 12, (Object) null);
        }
        return ab.f48028a;
    }

    static final ab floatingScrollBehavior$lambda$2(ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior, am amVar, LayoutCoordinates layoutCoordinates) {
        long j2;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float f2;
        float f3;
        long jPositionInParent = LayoutCoordinatesKt.positionInParent(layoutCoordinates);
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        long jMo9743getSizeYbymL2g = parentLayoutCoordinates != null ? parentLayoutCoordinates.mo9743getSizeYbymL2g() : IntSize.Companion.m11344getZeroYbymL2g();
        long jMo9743getSizeYbymL2g2 = layoutCoordinates.mo9743getSizeYbymL2g() >> 32;
        long jMo9743getSizeYbymL2g3 = layoutCoordinates.mo9743getSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int iMo4800getExitDirection8LIK8E = exitAlwaysFloatingToolbarScrollBehavior.mo4800getExitDirection8LIK8E();
        int i2 = (int) jMo9743getSizeYbymL2g2;
        if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4927getStart8LIK8E())) {
            int i3 = (int) (jPositionInParent >> 32);
            if (amVar.f48101a) {
                j2 = jMo9743getSizeYbymL2g >> 32;
                fIntBitsToFloat = Float.intBitsToFloat(i3);
                f3 = ((int) j2) - fIntBitsToFloat;
            } else {
                f2 = i2;
                fIntBitsToFloat2 = Float.intBitsToFloat(i3);
                f3 = fIntBitsToFloat2 + f2;
            }
        } else if (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4926getEnd8LIK8E())) {
            int i4 = (int) (jPositionInParent >> 32);
            if (amVar.f48101a) {
                f2 = i2;
                fIntBitsToFloat2 = Float.intBitsToFloat(i4);
                f3 = fIntBitsToFloat2 + f2;
            } else {
                j2 = jMo9743getSizeYbymL2g >> 32;
                fIntBitsToFloat = Float.intBitsToFloat(i4);
                f3 = ((int) j2) - fIntBitsToFloat;
            }
        } else {
            long j3 = jPositionInParent & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            boolean zM4921equalsimpl0 = FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4928getTop8LIK8E());
            int i5 = (int) j3;
            if (zM4921equalsimpl0) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i5);
                f2 = (int) jMo9743getSizeYbymL2g3;
                f3 = fIntBitsToFloat2 + f2;
            } else {
                j2 = jMo9743getSizeYbymL2g & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
                fIntBitsToFloat = Float.intBitsToFloat(i5);
                f3 = ((int) j2) - fIntBitsToFloat;
            }
        }
        exitAlwaysFloatingToolbarScrollBehavior.getState().setOffsetLimit(-(f3 - exitAlwaysFloatingToolbarScrollBehavior.getState().getOffset()));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public Modifier floatingScrollBehavior(Modifier modifier) {
        final am amVar = new am();
        int iMo4800getExitDirection8LIK8E = mo4800getExitDirection8LIK8E();
        return OnGloballyPositionedModifierKt.onGloballyPositioned(DraggableKt.draggable$default(LayoutModifierKt.layout(modifier, new q() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$1(amVar, this, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
            }
        }), DraggableKt.DraggableState(new l() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$0(this.f$0, amVar, ((Float) obj).floatValue());
            }
        }), (FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4927getStart8LIK8E()) || FloatingToolbarExitDirection.m4921equalsimpl0(iMo4800getExitDirection8LIK8E, FloatingToolbarExitDirection.Companion.m4926getEnd8LIK8E())) ? Orientation.Horizontal : Orientation.Vertical, false, null, false, null, new AnonymousClass2(null), false, 188, null), new l() { // from class: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ExitAlwaysFloatingToolbarScrollBehavior.floatingScrollBehavior$lambda$2(this.f$0, amVar, (LayoutCoordinates) obj);
            }
        });
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    /* renamed from: getExitDirection-8LIK8-E, reason: not valid java name */
    public int mo4800getExitDirection8LIK8E() {
        return this.exitDirection;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public DecayAnimationSpec<Float> getFlingAnimationSpec() {
        return this.flingAnimationSpec;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    @Override // androidx.compose.material3.FloatingToolbarScrollBehavior
    public FloatingToolbarState getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2297onPostFlingRZ2iAVY(long r7, long r9, h.c.e<? super androidx.compose.ui.unit.Velocity> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 r0 = (androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1 r0 = new androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$onPostFling$1
            r0.<init>(r6, r11)
        L18:
            r11 = r0
            java.lang.Object r0 = r11.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r11.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            long r6 = r11.J$0
            e.b.c.b(r0)
            goto L9a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            long r9 = r11.J$0
            e.b.c.b(r0)
            goto L79
        L3b:
            e.b.c.b(r0)
            float r0 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r9)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6f
            androidx.compose.material3.FloatingToolbarState r0 = r6.getState()
            float r0 = r0.getOffset()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L54
            goto L68
        L54:
            androidx.compose.material3.FloatingToolbarState r0 = r6.getState()
            float r0 = r0.getOffset()
            androidx.compose.material3.FloatingToolbarState r5 = r6.getState()
            float r5 = r5.getOffsetLimit()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L6f
        L68:
            androidx.compose.material3.FloatingToolbarState r0 = r6.getState()
            r0.setContentOffset(r2)
        L6f:
            r11.J$0 = r9
            r11.label = r4
            java.lang.Object r0 = androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m9443$default$onPostFlingRZ2iAVY(r6, r7, r9, r11)
            if (r0 == r1) goto La9
        L79:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.m11415unboximpl()
            androidx.compose.material3.FloatingToolbarState r0 = r6.getState()
            float r9 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r9)
            androidx.compose.animation.core.AnimationSpec r10 = r6.getSnapAnimationSpec()
            androidx.compose.animation.core.DecayAnimationSpec r6 = r6.getFlingAnimationSpec()
            r11.J$0 = r7
            r11.label = r3
            java.lang.Object r0 = androidx.compose.material3.FloatingToolbarKt.access$settleFloatingToolbar(r0, r9, r10, r6, r11)
            if (r0 == r1) goto La9
            r6 = r7
        L9a:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r8 = r0.m11415unboximpl()
            long r6 = androidx.compose.ui.unit.Velocity.m11410plusAH228Gc(r6, r8)
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m11397boximpl(r6)
            return r6
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        FloatingToolbarState state = getState();
        float contentOffset = state.getContentOffset();
        int i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        state.setContentOffset(contentOffset + Float.intBitsToFloat(i3));
        FloatingToolbarState state2 = getState();
        state2.setOffset(state2.getOffset() + Float.intBitsToFloat(i3));
        return Offset.Companion.m7996getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo2299onPreFlingQWom1Mo(long j2, e eVar) {
        return NestedScrollConnection.CC.m9452onPreFlingQWom1Mo$suspendImpl(this, j2, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        return NestedScrollConnection.CC.m9446$default$onPreScrollOzD1aCk(this, j2, i2);
    }

    public /* synthetic */ ExitAlwaysFloatingToolbarScrollBehavior(int i2, FloatingToolbarState floatingToolbarState, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, o oVar) {
        this(i2, floatingToolbarState, animationSpec, decayAnimationSpec);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ExitAlwaysFloatingToolbarScrollBehavior$floatingScrollBehavior$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements q<af, Float, e<? super ab>, Object> {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(3, eVar);
        }

        public final Object invoke(af afVar, float f2, e<? super ab> eVar) {
            AnonymousClass2 anonymousClass2 = ExitAlwaysFloatingToolbarScrollBehavior.this.new AnonymousClass2(eVar);
            anonymousClass2.F$0 = f2;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                float f2 = this.F$0;
                ExitAlwaysFloatingToolbarScrollBehavior exitAlwaysFloatingToolbarScrollBehavior = ExitAlwaysFloatingToolbarScrollBehavior.this;
                this.label = 1;
                if (FloatingToolbarKt.settleFloatingToolbar(exitAlwaysFloatingToolbarScrollBehavior.getState(), f2, exitAlwaysFloatingToolbarScrollBehavior.getSnapAnimationSpec(), exitAlwaysFloatingToolbarScrollBehavior.getFlingAnimationSpec(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(af afVar, Float f2, e<? super ab> eVar) {
            return invoke(afVar, f2.floatValue(), eVar);
        }
    }
}
