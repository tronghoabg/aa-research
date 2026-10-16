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
final class ScrollingLogic2D implements ScrollLogic {
    private FlingBehavior flingBehavior;
    private boolean isFlinging;
    private final a<Boolean> isScrollableNodeAttached;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private OverscrollEffect overscrollEffect;
    private Scrollable2DState scrollableState;
    private int latestScrollSource = NestedScrollSource.Companion.m9476getUserInputWNlRxjI();
    private Scroll2DScope outerStateScope = Scrollable2DKt.NoOpScrollScope;
    private final ScrollingLogic2D$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollBy-OzD1aCk */
        public long mo2255scrollByOzD1aCk(long j2, int i2) {
            ScrollingLogic2D scrollingLogic2D = this.this$0;
            return scrollingLogic2D.m2325performScroll3eAAhYA(scrollingLogic2D.outerStateScope, j2, i2);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo2256scrollByWithOverscrollOzD1aCk(long j2, int i2) {
            this.this$0.latestScrollSource = i2;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect == null || !this.this$0.m2328shouldDispatchOverscrollk4lQ0M(j2)) {
                ScrollingLogic2D scrollingLogic2D = this.this$0;
                return scrollingLogic2D.m2325performScroll3eAAhYA(scrollingLogic2D.outerStateScope, j2, i2);
            }
            ScrollingLogic2D scrollingLogic2D2 = this.this$0;
            return overscrollEffect.mo1950applyToScrollRhakbz0(j2, scrollingLogic2D2.latestScrollSource, scrollingLogic2D2.performScrollForOverscroll);
        }
    };
    private final l<Offset, Offset> performScrollForOverscroll = new l() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            ScrollingLogic2D scrollingLogic2D = this.f$0;
            return Offset.m7969boximpl(scrollingLogic2D.m2325performScroll3eAAhYA(scrollingLogic2D.outerStateScope, ((Offset) obj).m7990unboximpl(), scrollingLogic2D.latestScrollSource));
        }
    };

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ScrollingLogic2D$scroll$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<Scroll2DScope, e<? super ab>, Object> {
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
            AnonymousClass2 anonymousClass2 = ScrollingLogic2D.this.new AnonymousClass2(this.$block, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(Scroll2DScope scroll2DScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(scroll2DScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                ScrollingLogic2D.this.outerStateScope = (Scroll2DScope) this.L$0;
                p<NestedScrollScope, e<? super ab>, Object> pVar = this.$block;
                ScrollingLogic2D$nestedScrollScope$1 scrollingLogic2D$nestedScrollScope$1 = ScrollingLogic2D.this.nestedScrollScope;
                this.label = 1;
                if (pVar.invoke(scrollingLogic2D$nestedScrollScope$1, this) == aVar) {
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

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.foundation.gestures.ScrollingLogic2D$nestedScrollScope$1] */
    public ScrollingLogic2D(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher, a<Boolean> aVar) {
        this.scrollableState = scrollable2DState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.isScrollableNodeAttached = aVar;
    }

    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    private final long m2324dispatchRawDeltaMKHz9U(long j2) {
        return this.scrollableState.mo2168dispatchRawDeltaMKHz9U(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long doFlingAnimation_QWom1Mo$toDecomposedOffset(float f2, long j2) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (Float.isNaN(Scrollable2DKt.m2291getAngleTH1AsA0(j2))) {
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        } else {
            float fAbs = Math.abs(((float) Math.cos(Scrollable2DKt.m2291getAngleTH1AsA0(j2))) * f2) * Math.signum(Velocity.m11406getXimpl(j2));
            float fAbs2 = Math.abs(((float) Math.sin(Scrollable2DKt.m2291getAngleTH1AsA0(j2))) * f2) * Math.signum(Velocity.m11407getYimpl(j2));
            jFloatToRawIntBits = Float.floatToRawIntBits(fAbs);
            iFloatToRawIntBits = Float.floatToRawIntBits(fAbs2);
        }
        return (jFloatToRawIntBits << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & iFloatToRawIntBits);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long doFlingAnimation_QWom1Mo$toDecomposedVelocity(float f2, long j2) {
        return Float.isNaN(Scrollable2DKt.m2291getAngleTH1AsA0(j2)) ? VelocityKt.Velocity(0.0f, f2) : VelocityKt.Velocity(Math.abs(((float) Math.cos(Scrollable2DKt.m2291getAngleTH1AsA0(j2))) * f2) * Math.signum(Velocity.m11406getXimpl(j2)), Math.abs(((float) Math.sin(Scrollable2DKt.m2291getAngleTH1AsA0(j2))) * f2) * Math.signum(Velocity.m11407getYimpl(j2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float doFlingAnimation_QWom1Mo$toMagnitudeFloat(long j2) {
        return (float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat((int) (j2 >> 32)), 2.0d)) + ((float) Math.pow(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 2.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performScroll-3eAAhYA, reason: not valid java name */
    public final long m2325performScroll3eAAhYA(Scroll2DScope scroll2DScope, long j2, int i2) {
        long jM9460dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m9460dispatchPreScrollOzD1aCk(j2, i2);
        long jM7984minusMKHz9U = Offset.m7984minusMKHz9U(j2, jM9460dispatchPreScrollOzD1aCk);
        long jMo2169scrollByMKHz9U = scroll2DScope.mo2169scrollByMKHz9U(jM7984minusMKHz9U);
        return Offset.m7985plusMKHz9U(Offset.m7985plusMKHz9U(jM9460dispatchPreScrollOzD1aCk, jMo2169scrollByMKHz9U), this.nestedScrollDispatcher.m9458dispatchPostScrollDzOQY0M(jMo2169scrollByMKHz9U, Offset.m7984minusMKHz9U(jM7984minusMKHz9U, jMo2169scrollByMKHz9U), i2));
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic2D scrollingLogic2D, MutatePriority mutatePriority, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic2D.scroll(mutatePriority, pVar, eVar);
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
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$1
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
            h.g.b.ap r9 = new h.g.b.ap
            r9.<init>()
            r9.f48104a = r12
            r11.isFlinging = r4
            androidx.compose.foundation.MutatePriority r14 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L68
            androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2     // Catch: java.lang.Throwable -> L68
            r10 = 0
            r6 = r11
            r7 = r12
            r5.<init>(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L66
            h.g.a.p r5 = (h.g.a.p) r5     // Catch: java.lang.Throwable -> L66
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L66
            r0.label = r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r11 = r6.scroll(r14, r5, r0)     // Catch: java.lang.Throwable -> L66
            if (r11 == r1) goto L65
            r12 = r9
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic2D.mo2286doFlingAnimationQWom1Mo(long, h.c.e):java.lang.Object");
    }

    public final Scrollable2DState getScrollableState() {
        return this.scrollableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    public boolean isFlinging() {
        return this.isFlinging;
    }

    /* renamed from: onScrollStopped-sF-c-tU, reason: not valid java name */
    public final Object m2326onScrollStoppedsFctU(long j2, e<? super ab> eVar) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect == null || !m2327shouldDispatchOverscrollTH1AsA0(j2)) {
            Object objInvoke = scrollingLogic2D$onScrollStopped$performFling$1.invoke(Velocity.m11397boximpl(j2), eVar);
            if (objInvoke == h.c.a.a.f48038a) {
                return objInvoke;
            }
        } else {
            Object objMo1949applyToFlingBMRW4eQ = overscrollEffect.mo1949applyToFlingBMRW4eQ(j2, scrollingLogic2D$onScrollStopped$performFling$1, eVar);
            if (objMo1949applyToFlingBMRW4eQ == h.c.a.a.f48038a) {
                return objMo1949applyToFlingBMRW4eQ;
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollLogic
    /* renamed from: performRawScroll-MK-Hz9U */
    public long mo2287performRawScrollMKHz9U(long j2) {
        return this.scrollableState.isScrollInProgress() ? Offset.Companion.m7996getZeroF1C5BW0() : m2324dispatchRawDeltaMKHz9U(j2);
    }

    public final Object scroll(MutatePriority mutatePriority, p<? super NestedScrollScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new AnonymousClass2(pVar, null), eVar);
        return objScroll == h.c.a.a.f48038a ? objScroll : ab.f48028a;
    }

    public final void setScrollableState(Scrollable2DState scrollable2DState) {
        this.scrollableState = scrollable2DState;
    }

    /* renamed from: shouldDispatchOverscroll-TH1AsA0, reason: not valid java name */
    public final boolean m2327shouldDispatchOverscrollTH1AsA0(long j2) {
        Scrollable2DState scrollable2DState = this.scrollableState;
        float fM11406getXimpl = Velocity.m11406getXimpl(j2);
        float fM11407getYimpl = Velocity.m11407getYimpl(j2);
        return scrollable2DState.mo2167canScrollk4lQ0M((Float.floatToRawIntBits(fM11407getYimpl) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fM11406getXimpl) << 32));
    }

    /* renamed from: shouldDispatchOverscroll-k-4lQ0M, reason: not valid java name */
    public final boolean m2328shouldDispatchOverscrollk4lQ0M(long j2) {
        return this.scrollableState.mo2167canScrollk4lQ0M(j2);
    }

    public final boolean shouldScrollImmediately() {
        if (this.scrollableState.isScrollInProgress()) {
            return true;
        }
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return overscrollEffect != null && overscrollEffect.isInProgress();
    }

    public final boolean update(Scrollable2DState scrollable2DState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z;
        if (x.n(this.scrollableState, scrollable2DState)) {
            z = false;
        } else {
            this.scrollableState = scrollable2DState;
            z = true;
        }
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z;
    }
}
