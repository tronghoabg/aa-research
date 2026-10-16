package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ScrollingLogic implements ScrollLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final a<Boolean> isScrollableNodeAttached;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private OnScrollChangedDispatcher onScrollChangedDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.Companion.m9476getUserInputWNlRxjI();
    private ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo2255scrollByOzD1aCk(long j2, int i2) {
            ScrollingLogic scrollingLogic = this.this$0;
            return scrollingLogic.m2311performScroll3eAAhYA(scrollingLogic.outerStateScope, j2, i2);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo2256scrollByWithOverscrollOzD1aCk(long j2, int i2) {
            this.this$0.latestScrollSource = i2;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect == null || !this.this$0.getShouldDispatchOverscroll()) {
                ScrollingLogic scrollingLogic = this.this$0;
                return scrollingLogic.m2311performScroll3eAAhYA(scrollingLogic.outerStateScope, j2, i2);
            }
            ScrollingLogic scrollingLogic2 = this.this$0;
            return overscrollEffect.mo1950applyToScrollRhakbz0(j2, scrollingLogic2.latestScrollSource, scrollingLogic2.performScrollForOverscroll);
        }
    };
    private final l<Offset, Offset> performScrollForOverscroll = new l() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            ScrollingLogic scrollingLogic = this.f$0;
            return Offset.m7969boximpl(scrollingLogic.m2311performScroll3eAAhYA(scrollingLogic.outerStateScope, ((Offset) obj).m7990unboximpl(), scrollingLogic.latestScrollSource));
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<ScrollScope, e<? super ab>, Object> {
        final /* synthetic */ p<NestedScrollScope, e<? super ab>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super NestedScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = ScrollingLogic.this.new AnonymousClass2(this.$block, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(ScrollScope scrollScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(scrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ScrollingLogic.this.outerStateScope = (ScrollScope) this.L$0;
                p<NestedScrollScope, e<? super ab>, Object> pVar = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (pVar.invoke(scrollingLogic$nestedScrollScope$1, this) == aVar) {
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
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z, NestedScrollDispatcher nestedScrollDispatcher, OnScrollChangedDispatcher onScrollChangedDispatcher, a<Boolean> aVar) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.onScrollChangedDispatcher = onScrollChangedDispatcher;
        this.isScrollableNodeAttached = aVar;
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m2310dispatchRawDeltaMKHz9U(long j2) {
        return m2319toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m2318toFloatk4lQ0M(j2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m2311performScroll3eAAhYA(ScrollScope scrollScope, long j2, int i2) {
        long jM9460dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m9460dispatchPreScrollOzD1aCk(j2, i2);
        long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(j2, jM9460dispatchPreScrollOzD1aCk);
        long jM2316reverseIfNeededMKHz9U = m2316reverseIfNeededMKHz9U(m2319toOffsettuRUvjQ(scrollScope.scrollBy(m2318toFloatk4lQ0M(m2316reverseIfNeededMKHz9U(m2317singleAxisOffsetMKHz9U(jM7984minusMKHz9U))))));
        this.onScrollChangedDispatcher.mo2258dispatchScrollDeltaInfok4lQ0M(jM2316reverseIfNeededMKHz9U);
        return Offset.m7985plusMKHz9U(Offset.m7985plusMKHz9U(jM9460dispatchPreScrollOzD1aCk, jM2316reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m9458dispatchPostScrollDzOQY0M(jM2316reverseIfNeededMKHz9U, Offset.m7984minusMKHz9U(jM7984minusMKHz9U, jM2316reverseIfNeededMKHz9U), i2));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, pVar, eVar);
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    private final long m2312singleAxisVelocityAH228Gc(long j2) {
        return Velocity.m11402copyOhffZ5M$default(j2, 0.0f, 0.0f, this.orientation == Orientation.Horizontal ? 1 : 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m2313toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m11406getXimpl(j2) : Velocity.m11407getYimpl(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m2314updateQWom1Mo(long j2, float f2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m11402copyOhffZ5M$default(j2, f2, 0.0f, 2, null) : Velocity.m11402copyOhffZ5M$default(j2, 0.0f, f2, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2286doFlingAnimationQWom1Mo(long r12, h.c.e<? super androidx.compose.ui.unit.Velocity> r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.L$0
            h.g.b.ap r12 = (h.g.b.ap) r12
            e.b.c.b(r14)     // Catch: java.lang.Throwable -> L2d
            r6 = r11
            goto L5c
        L2d:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L6b
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            e.b.c.b(r14)
            h.g.b.ap r7 = new h.g.b.ap
            r7.<init>()
            r7.f48104a = r12
            r11.isFlinging = r4
            androidx.compose.foundation.MutatePriority r14 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L68
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2     // Catch: java.lang.Throwable -> L68
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L66
            h.g.a.p r5 = (h.g.a.p) r5     // Catch: java.lang.Throwable -> L66
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L66
            r0.label = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r11 = r6.scroll(r14, r5, r0)     // Catch: java.lang.Throwable -> L66
            if (r11 == r1) goto L65
            r12 = r7
        L5c:
            r6.isFlinging = r3
            long r11 = r12.f48104a
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m11397boximpl(r11)
            return r11
        L65:
            return r1
        L66:
            r0 = move-exception
            goto L6a
        L68:
            r0 = move-exception
            r6 = r11
        L6a:
            r12 = r0
        L6b:
            r6.isFlinging = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.mo2286doFlingAnimationQWom1Mo(long, h.c.e):java.lang.Object");
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean isFlinging() {
        return this.isFlinging;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }

    /* renamed from: onScrollStopped-BMRW4eQ, reason: not valid java name */
    public final Object m2315onScrollStoppedBMRW4eQ(long j2, boolean z, e<? super ab> eVar) {
        if (!z || ScrollableKt.getShouldBeTriggeredByMouseWheel(this.flingBehavior)) {
            long jM2312singleAxisVelocityAH228Gc = m2312singleAxisVelocityAH228Gc(j2);
            ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (overscrollEffect == null || !getShouldDispatchOverscroll()) {
                Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(Velocity.m11397boximpl(jM2312singleAxisVelocityAH228Gc), eVar);
                if (objInvoke == h.c.a.a.f48038a) {
                    return objInvoke;
                }
            } else {
                Object objMo1949applyToFlingBMRW4eQ = overscrollEffect.mo1949applyToFlingBMRW4eQ(jM2312singleAxisVelocityAH228Gc, scrollingLogic$onScrollStopped$performFling$1, eVar);
                if (objMo1949applyToFlingBMRW4eQ == h.c.a.a.f48038a) {
                    return objMo1949applyToFlingBMRW4eQ;
                }
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public long mo2287performRawScrollMKHz9U(long j2) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m7996getZeroF1C5BW0() : m2310dispatchRawDeltaMKHz9U(j2);
    }

    public final float reverseIfNeeded(float f2) {
        return this.reverseDirection ? -f2 : f2;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m2316reverseIfNeededMKHz9U(long j2) {
        return this.reverseDirection ? Offset.m7987timestuRUvjQ(j2, -1.0f) : j2;
    }

    public final Object scroll(MutatePriority mutatePriority, p<? super NestedScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new AnonymousClass2(pVar, null), eVar);
        return objScroll == h.c.a.a.f48038a ? objScroll : ab.f48028a;
    }

    public final void setScrollableState(ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null && overscrollEffect.isInProgress();
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m2317singleAxisOffsetMKHz9U(long j2) {
        return Offset.m7974copydBAh8RU$default(j2, 0.0f, 0.0f, this.orientation == Orientation.Horizontal ? 1 : 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m2318toFloatk4lQ0M(long j2) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j2 >> 32) : (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m2319toOffsettuRUvjQ(float f2) {
        if (f2 == 0.0f) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        return (Float.floatToRawIntBits(f2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* renamed from: toSingleAxisDeltaFromAngle-k-4lQ0M, reason: not valid java name */
    public final float m2320toSingleAxisDeltaFromAnglek4lQ0M(long j2) {
        int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        int i3 = (int) (j2 >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i2)), Math.abs(Float.intBitsToFloat(i3)));
        Orientation orientation = this.orientation;
        if (dAtan2 >= 0.7853981633974483d) {
            if (orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i2);
            }
            return 0.0f;
        }
        if (orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i3);
        }
        return 0.0f;
    }

    /* renamed from: toVelocity-adjELrA, reason: not valid java name */
    public final long m2321toVelocityadjELrA(float f2) {
        return f2 == 0.0f ? Velocity.Companion.m11417getZero9UxMQ8M() : this.orientation == Orientation.Horizontal ? VelocityKt.Velocity(f2, 0.0f) : VelocityKt.Velocity(0.0f, f2);
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z2;
        boolean z3 = true;
        if (x.n(this.scrollableState, scrollableState)) {
            z2 = false;
        } else {
            this.scrollableState = scrollableState;
            z2 = true;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z2 = true;
        }
        if (this.reverseDirection != z) {
            this.reverseDirection = z;
        } else {
            z3 = z2;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z3;
    }
}
