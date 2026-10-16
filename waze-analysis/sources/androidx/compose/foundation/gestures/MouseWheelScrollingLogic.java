package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.am;
import h.g.b.an;
import h.g.b.aq;
import h.g.b.w;
import java.util.List;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.a.t;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic extends NonTouchScrollingLogic {
    public static final int $stable = 8;
    private final o<MouseWheelScrollDelta> channel;
    private final ScrollConfig mouseWheelScrollConfig;
    private br receivingMouseWheelEventsJob;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MouseWheelScrollingLogic.this.dispatchMouseWheelScroll(null, null, 0.0f, 0.0f, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
        final /* synthetic */ aq<AnimationState<Float, AnimationVector1D>> $animationState;
        final /* synthetic */ float $speed;
        final /* synthetic */ aq<MouseWheelScrollDelta> $targetScrollDelta;
        final /* synthetic */ an $targetValue;
        final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
        final /* synthetic */ float $threshold;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MouseWheelScrollingLogic this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(an anVar, aq<AnimationState<Float, AnimationVector1D>> aqVar, aq<MouseWheelScrollDelta> aqVar2, float f2, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f3, ScrollingLogic scrollingLogic, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$targetValue = anVar;
            this.$animationState = aqVar;
            this.$targetScrollDelta = aqVar2;
            this.$threshold = f2;
            this.this$0 = mouseWheelScrollingLogic;
            this.$speed = f3;
            this.$this_dispatchMouseWheelScroll = scrollingLogic;
        }

        static final boolean invokeSuspend$lambda$0(MouseWheelScrollingLogic mouseWheelScrollingLogic, aq aqVar, an anVar, ScrollingLogic scrollingLogic, am amVar, float f2) {
            MouseWheelScrollDelta mouseWheelScrollDeltaSumOrNull = mouseWheelScrollingLogic.sumOrNull(mouseWheelScrollingLogic.channel);
            if (mouseWheelScrollDeltaSumOrNull != null) {
                mouseWheelScrollingLogic.trackVelocity(mouseWheelScrollDeltaSumOrNull);
                aqVar.f48105a = ((MouseWheelScrollDelta) aqVar.f48105a).plus(mouseWheelScrollDeltaSumOrNull);
                anVar.f48102a = scrollingLogic.m2320toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m2316reverseIfNeededMKHz9U(((MouseWheelScrollDelta) aqVar.f48105a).m2254getValueF1C5BW0()));
                amVar.f48101a = !MouseWheelScrollingLogicKt.isLowScrollingDelta(r2 - f2);
            }
            return mouseWheelScrollDeltaSumOrNull != null;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
            return ((AnonymousClass3) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[PHI: r8 r14
  0x0064: PHI (r8v2 androidx.compose.foundation.gestures.NestedScrollScope) = 
  (r8v1 androidx.compose.foundation.gestures.NestedScrollScope)
  (r8v3 androidx.compose.foundation.gestures.NestedScrollScope)
 binds: [B:28:0x011f, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0064: PHI (r14v1 h.g.b.am) = (r14v0 h.g.b.am), (r14v2 h.g.b.am) binds: [B:28:0x011f, B:13:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x018c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x011f -> B:14:0x0064). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x014a -> B:32:0x014b). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1, reason: invalid class name and case insensitive filesystem */
    final class C02391 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C02391(e<? super C02391> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02391 c02391 = MouseWheelScrollingLogic.this.new C02391(eVar);
            c02391.L$0 = obj;
            return c02391;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02391) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x0011, B:17:0x0030, B:20:0x003c, B:22:0x004d, B:12:0x0021), top: B:29:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:17:0x0030). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r11.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                e.b.c.b(r12)     // Catch: java.lang.Throwable -> L25
                goto L30
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1d:
                java.lang.Object r1 = r11.L$0
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                e.b.c.b(r12)     // Catch: java.lang.Throwable -> L25
                goto L4d
            L25:
                r0 = move-exception
                r12 = r0
                goto L86
            L28:
                e.b.c.b(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
            L30:
                h.c.j r12 = r1.getCoroutineContext()     // Catch: java.lang.Throwable -> L25
                boolean r12 = h.g.b.o.h(r12)     // Catch: java.lang.Throwable -> L25
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                if (r12 == 0) goto L80
                kotlinx.coroutines.a.o r12 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$getChannel$p(r5)     // Catch: java.lang.Throwable -> L25
                r5 = r11
                h.c.e r5 = (h.c.e) r5     // Catch: java.lang.Throwable -> L25
                r11.L$0 = r1     // Catch: java.lang.Throwable -> L25
                r11.label = r4     // Catch: java.lang.Throwable -> L25
                java.lang.Object r12 = r12.d(r5)     // Catch: java.lang.Throwable -> L25
                if (r12 == r0) goto L7f
            L4d:
                r7 = r12
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta r7 = (androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta) r7     // Catch: java.lang.Throwable -> L25
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r12 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L25
                androidx.compose.ui.unit.Density r12 = r12.getDensity()     // Catch: java.lang.Throwable -> L25
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollingLogicKt.access$getAnimationThreshold$p()     // Catch: java.lang.Throwable -> L25
                float r8 = r12.mo2127toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L25
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r12 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L25
                androidx.compose.ui.unit.Density r12 = r12.getDensity()     // Catch: java.lang.Throwable -> L25
                float r5 = androidx.compose.foundation.gestures.MouseWheelScrollingLogicKt.access$getAnimationSpeed$p()     // Catch: java.lang.Throwable -> L25
                float r9 = r12.mo2127toPx0680j_4(r5)     // Catch: java.lang.Throwable -> L25
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r5 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this     // Catch: java.lang.Throwable -> L25
                androidx.compose.foundation.gestures.ScrollingLogic r6 = r5.getScrollingLogic()     // Catch: java.lang.Throwable -> L25
                r10 = r11
                h.c.e r10 = (h.c.e) r10     // Catch: java.lang.Throwable -> L25
                r11.L$0 = r1     // Catch: java.lang.Throwable -> L25
                r11.label = r3     // Catch: java.lang.Throwable -> L25
                java.lang.Object r12 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L25
                if (r12 != r0) goto L30
            L7f:
                return r0
            L80:
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r5, r2)
                h.ab r11 = h.ab.f48028a
                return r11
            L86:
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic r11 = androidx.compose.foundation.gestures.MouseWheelScrollingLogic.this
                androidx.compose.foundation.gestures.MouseWheelScrollingLogic.access$setReceivingMouseWheelEventsJob$p(r11, r2)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.C02391.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MouseWheelScrollingLogic(ScrollingLogic scrollingLogic, ScrollConfig scrollConfig, p<? super Velocity, ? super e<? super ab>, ? extends Object> pVar, Density density) {
        super(scrollingLogic, pVar, density);
        this.mouseWheelScrollConfig = scrollConfig;
        this.channel = w.c(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateMouseWheelScroll(final NestedScrollScope nestedScrollScope, AnimationState<Float, AnimationVector1D> animationState, float f2, int i2, final l<? super Float, Boolean> lVar, e<? super ab> eVar) {
        final an anVar = new an();
        anVar.f48102a = animationState.getValue().floatValue();
        Object objAnimateTo = SuspendAnimationKt.animateTo(animationState, new Float(f2), AnimationSpecKt.tween$default(i2, 0, EasingKt.getLinearEasing(), 2, null), true, new l() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MouseWheelScrollingLogic.animateMouseWheelScroll$lambda$0(anVar, this, nestedScrollScope, lVar, (AnimationScope) obj);
            }
        }, eVar);
        return objAnimateTo == a.f48038a ? objAnimateTo : ab.f48028a;
    }

    static final ab animateMouseWheelScroll$lambda$0(an anVar, MouseWheelScrollingLogic mouseWheelScrollingLogic, NestedScrollScope nestedScrollScope, l lVar, AnimationScope animationScope) {
        float fFloatValue = ((Number) animationScope.getValue()).floatValue() - anVar.f48102a;
        if (!MouseWheelScrollingLogicKt.isLowScrollingDelta(fFloatValue)) {
            if (!MouseWheelScrollingLogicKt.isLowScrollingDelta(fFloatValue - mouseWheelScrollingLogic.dispatchMouseWheelScroll(nestedScrollScope, fFloatValue))) {
                animationScope.cancelAnimation();
                return ab.f48028a;
            }
            anVar.f48102a += fFloatValue;
        }
        if (((Boolean) lVar.invoke(Float.valueOf(anVar.f48102a))).booleanValue()) {
            animationScope.cancelAnimation();
        }
        return ab.f48028a;
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m2248canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j2) {
        float fM2320toSingleAxisDeltaFromAnglek4lQ0M = scrollingLogic.m2320toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m2316reverseIfNeededMKHz9U(j2));
        if (fM2320toSingleAxisDeltaFromAnglek4lQ0M == 0.0f) {
            return false;
        }
        return fM2320toSingleAxisDeltaFromAnglek4lQ0M > 0.0f ? scrollingLogic.getScrollableState().getCanScrollForward() : scrollingLogic.getScrollableState().getCanScrollBackward();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
    
        if (r0.invoke(r1, r9) != r10) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic r23, androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta r24, float r25, float r26, h.c.e<? super h.ab> r27) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.MouseWheelScrollingLogic$MouseWheelScrollDelta, float, float, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r21, h.g.b.aq<androidx.compose.foundation.gestures.MouseWheelScrollingLogic.MouseWheelScrollDelta> r22, h.g.b.an r23, androidx.compose.foundation.gestures.ScrollingLogic r24, h.g.b.aq<androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r25, long r26, h.c.e<? super java.lang.Boolean> r28) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.dispatchMouseWheelScroll$waitNextScrollDelta(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, h.g.b.aq, h.g.b.an, androidx.compose.foundation.gestures.ScrollingLogic, h.g.b.aq, long, h.c.e):java.lang.Object");
    }

    /* renamed from: onMouseWheel-O0kMr_c, reason: not valid java name */
    private final boolean m2249onMouseWheelO0kMr_c(PointerEvent pointerEvent, long j2) {
        long jMo2148calculateMouseWheelScroll8xgXZGE = this.mouseWheelScrollConfig.mo2148calculateMouseWheelScroll8xgXZGE(getDensity(), pointerEvent, j2);
        if (!m2248canConsumeDeltaUv8p0NA(getScrollingLogic(), jMo2148calculateMouseWheelScroll8xgXZGE)) {
            return isScrolling$foundation();
        }
        o<MouseWheelScrollDelta> oVar = this.channel;
        long uptimeMillis = ((PointerInputChange) i.P(pointerEvent.getChanges())).getUptimeMillis();
        boolean z = true;
        if (this.mouseWheelScrollConfig.isSmoothScrollingEnabled() && !this.mouseWheelScrollConfig.isPreciseWheelScroll(pointerEvent)) {
            z = false;
        }
        return t.g(oVar.i(new MouseWheelScrollDelta(jMo2148calculateMouseWheelScroll8xgXZGE, uptimeMillis, z, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MouseWheelScrollDelta sumOrNull(final o<MouseWheelScrollDelta> oVar) {
        MouseWheelScrollDelta mouseWheelScrollDeltaPlus = null;
        for (MouseWheelScrollDelta mouseWheelScrollDelta : NonTouchScrollingLogicKt.untilNull(new h.g.a.a() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return MouseWheelScrollingLogic.sumOrNull$lambda$0(oVar);
            }
        })) {
            mouseWheelScrollDeltaPlus = mouseWheelScrollDeltaPlus == null ? mouseWheelScrollDelta : mouseWheelScrollDeltaPlus.plus(mouseWheelScrollDelta);
        }
        return mouseWheelScrollDeltaPlus;
    }

    static final MouseWheelScrollDelta sumOrNull$lambda$0(o oVar) {
        return (MouseWheelScrollDelta) t.a(oVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(MouseWheelScrollDelta mouseWheelScrollDelta) {
        getVelocityTracker$foundation().m2172addDeltaUv8p0NA(mouseWheelScrollDelta.getTimeMillis(), mouseWheelScrollDelta.m2254getValueF1C5BW0());
    }

    @Override // androidx.compose.foundation.gestures.NonTouchScrollingLogic
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo2250onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9563getScroll7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (changes.get(i2).isConsumed()) {
                    return;
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && isScrolling$foundation()) {
                m2249onMouseWheelO0kMr_c(pointerEvent, j2);
                consume$foundation(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Main && !isScrolling$foundation() && m2249onMouseWheelO0kMr_c(pointerEvent, j2)) {
                consume$foundation(pointerEvent);
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.NonTouchScrollingLogic
    public void startReceivingEvents(af afVar) {
        if (this.receivingMouseWheelEventsJob == null) {
            this.receivingMouseWheelEventsJob = aj.z(afVar, null, null, new C02391(null), 3);
        }
    }

    /* compiled from: WazeSource */
    final class MouseWheelScrollDelta {
        private final boolean shouldApplyImmediately;
        private final long timeMillis;
        private final long value;

        private MouseWheelScrollDelta(long j2, long j3, boolean z) {
            this.value = j2;
            this.timeMillis = j3;
            this.shouldApplyImmediately = z;
        }

        /* renamed from: copy-9KIMszo$default, reason: not valid java name */
        public static /* synthetic */ MouseWheelScrollDelta m2251copy9KIMszo$default(MouseWheelScrollDelta mouseWheelScrollDelta, long j2, long j3, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j2 = mouseWheelScrollDelta.value;
            }
            long j4 = j2;
            if ((i2 & 2) != 0) {
                j3 = mouseWheelScrollDelta.timeMillis;
            }
            long j5 = j3;
            if ((i2 & 4) != 0) {
                z = mouseWheelScrollDelta.shouldApplyImmediately;
            }
            return mouseWheelScrollDelta.m2253copy9KIMszo(j4, j5, z);
        }

        /* renamed from: component1-F1C5BW0, reason: not valid java name */
        public final long m2252component1F1C5BW0() {
            return this.value;
        }

        public final long component2() {
            return this.timeMillis;
        }

        public final boolean component3() {
            return this.shouldApplyImmediately;
        }

        /* renamed from: copy-9KIMszo, reason: not valid java name */
        public final MouseWheelScrollDelta m2253copy9KIMszo(long j2, long j3, boolean z) {
            return new MouseWheelScrollDelta(j2, j3, z, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MouseWheelScrollDelta)) {
                return false;
            }
            MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollDelta) obj;
            return Offset.m7977equalsimpl0(this.value, mouseWheelScrollDelta.value) && this.timeMillis == mouseWheelScrollDelta.timeMillis && this.shouldApplyImmediately == mouseWheelScrollDelta.shouldApplyImmediately;
        }

        public final boolean getShouldApplyImmediately() {
            return this.shouldApplyImmediately;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m2254getValueF1C5BW0() {
            return this.value;
        }

        public int hashCode() {
            return (((Offset.m7982hashCodeimpl(this.value) * 31) + MouseWheelScrollingLogic$MouseWheelScrollDelta$$ExternalSyntheticBackport0.m(this.timeMillis)) * 31) + MouseWheelScrollingLogic$MouseWheelScrollDelta$$ExternalSyntheticBackport1.m(this.shouldApplyImmediately);
        }

        public final MouseWheelScrollDelta plus(MouseWheelScrollDelta mouseWheelScrollDelta) {
            return new MouseWheelScrollDelta(Offset.m7985plusMKHz9U(this.value, mouseWheelScrollDelta.value), Math.max(this.timeMillis, mouseWheelScrollDelta.timeMillis), this.shouldApplyImmediately, null);
        }

        public String toString() {
            return "MouseWheelScrollDelta(value=" + ((Object) Offset.m7988toStringimpl(this.value)) + ", timeMillis=" + this.timeMillis + ", shouldApplyImmediately=" + this.shouldApplyImmediately + ')';
        }

        public /* synthetic */ MouseWheelScrollDelta(long j2, long j3, boolean z, h.g.b.o oVar) {
            this(j2, j3, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchMouseWheelScroll(NestedScrollScope nestedScrollScope, float f2) {
        ScrollingLogic scrollingLogic = getScrollingLogic();
        return scrollingLogic.m2318toFloatk4lQ0M(scrollingLogic.m2316reverseIfNeededMKHz9U(nestedScrollScope.mo2255scrollByOzD1aCk(scrollingLogic.m2319toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f2)), NestedScrollSource.Companion.m9476getUserInputWNlRxjI())));
    }
}
