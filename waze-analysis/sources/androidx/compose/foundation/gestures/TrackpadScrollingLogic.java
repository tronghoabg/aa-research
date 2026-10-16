package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
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
public final class TrackpadScrollingLogic extends NonTouchScrollingLogic {
    public static final int $stable = 8;
    private final o<TrackpadScrollDelta> channel;
    private br receivingPanEventsJob;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackpadScrollingLogic.this.dispatchTrackpadScroll(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
        final /* synthetic */ aq<TrackpadScrollDelta> $targetScrollDelta;
        final /* synthetic */ ScrollingLogic $this_dispatchTrackpadScroll;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ScrollingLogic scrollingLogic, aq<TrackpadScrollDelta> aqVar, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$this_dispatchTrackpadScroll = scrollingLogic;
            this.$targetScrollDelta = aqVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = TrackpadScrollingLogic.this.new AnonymousClass3(this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
            return ((AnonymousClass3) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005f -> B:13:0x0061). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r6.L$1
                h.g.b.aq r1 = (h.g.b.aq) r1
                java.lang.Object r3 = r6.L$0
                androidx.compose.foundation.gestures.NestedScrollScope r3 = (androidx.compose.foundation.gestures.NestedScrollScope) r3
                e.b.c.b(r7)
                goto L61
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1d:
                e.b.c.b(r7)
                java.lang.Object r7 = r6.L$0
                androidx.compose.foundation.gestures.NestedScrollScope r7 = (androidx.compose.foundation.gestures.NestedScrollScope) r7
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r1 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                androidx.compose.foundation.gestures.ScrollingLogic r3 = r6.$this_dispatchTrackpadScroll
                h.g.b.aq<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r4 = r6.$targetScrollDelta
                java.lang.Object r4 = r4.f48105a
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r4 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r4
                long r4 = r4.m2340getValueF1C5BW0()
                long r4 = r3.m2316reverseIfNeededMKHz9U(r4)
                float r3 = r3.m2320toSingleAxisDeltaFromAnglek4lQ0M(r4)
                androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$dispatchTrackpadScroll(r1, r7, r3)
                r3 = r7
            L3e:
                h.g.b.aq<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r7 = r6.$targetScrollDelta
                java.lang.Object r7 = r7.f48105a
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r7 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r7
                boolean r7 = r7.isEnd()
                if (r7 != 0) goto La6
                h.g.b.aq<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r1 = r6.$targetScrollDelta
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                kotlinx.coroutines.a.o r7 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$getChannel$p(r7)
                r4 = r6
                h.c.e r4 = (h.c.e) r4
                r6.L$0 = r3
                r6.L$1 = r1
                r6.label = r2
                java.lang.Object r7 = androidx.compose.foundation.gestures.NonTouchScrollingLogicKt.busyReceive(r7, r4)
                if (r7 == r0) goto La5
            L61:
                r1.f48105a = r7
                h.g.b.aq<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r7 = r6.$targetScrollDelta
                java.lang.Object r7 = r7.f48105a
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r7 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r7
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r1 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$trackVelocity(r1, r7)
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                kotlinx.coroutines.a.o r1 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$getChannel$p(r7)
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r7 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$sumOrNull(r7, r1)
                if (r7 == 0) goto L8b
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r1 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                h.g.b.aq<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r4 = r6.$targetScrollDelta
                androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$trackVelocity(r1, r7)
                java.lang.Object r1 = r4.f48105a
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r1 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r1
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r7 = r1.plus(r7)
                r4.f48105a = r7
            L8b:
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r7 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                androidx.compose.foundation.gestures.ScrollingLogic r1 = r6.$this_dispatchTrackpadScroll
                h.g.b.aq<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r4 = r6.$targetScrollDelta
                java.lang.Object r4 = r4.f48105a
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r4 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r4
                long r4 = r4.m2340getValueF1C5BW0()
                long r4 = r1.m2316reverseIfNeededMKHz9U(r4)
                float r1 = r1.m2320toSingleAxisDeltaFromAnglek4lQ0M(r4)
                androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$dispatchTrackpadScroll(r7, r3, r1)
                goto L3e
            La5:
                return r0
            La6:
                h.ab r6 = h.ab.f48028a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1, reason: invalid class name and case insensitive filesystem */
    final class C02601 extends g implements p<af, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C02601(e<? super C02601> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02601 c02601 = TrackpadScrollingLogic.this.new C02601(eVar);
            c02601.L$0 = obj;
            return c02601;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C02601) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:7:0x0011, B:18:0x003b, B:21:0x0047, B:25:0x0067, B:12:0x0029), top: B:33:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0078 -> B:18:0x003b). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r9.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L33
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
                e.b.c.b(r10)     // Catch: java.lang.Throwable -> L31
                goto L3b
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1d:
                java.lang.Object r1 = r9.L$2
                androidx.compose.foundation.gestures.ScrollingLogic r1 = (androidx.compose.foundation.gestures.ScrollingLogic) r1
                java.lang.Object r5 = r9.L$1
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r5 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic) r5
                java.lang.Object r6 = r9.L$0
                kotlinx.coroutines.af r6 = (kotlinx.coroutines.af) r6
                e.b.c.b(r10)     // Catch: java.lang.Throwable -> L31
                r8 = r5
                r5 = r1
                r1 = r6
            L2f:
                r6 = r8
                goto L67
            L31:
                r10 = move-exception
                goto L82
            L33:
                e.b.c.b(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.af r1 = (kotlinx.coroutines.af) r1
            L3b:
                h.c.j r10 = r1.getCoroutineContext()     // Catch: java.lang.Throwable -> L31
                boolean r10 = h.g.b.o.h(r10)     // Catch: java.lang.Throwable -> L31
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r5 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                if (r10 == 0) goto L7c
                androidx.compose.foundation.gestures.ScrollingLogic r10 = r5.getScrollingLogic()     // Catch: java.lang.Throwable -> L31
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r6 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this     // Catch: java.lang.Throwable -> L31
                kotlinx.coroutines.a.o r6 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$getChannel$p(r6)     // Catch: java.lang.Throwable -> L31
                r7 = r9
                h.c.e r7 = (h.c.e) r7     // Catch: java.lang.Throwable -> L31
                r9.L$0 = r1     // Catch: java.lang.Throwable -> L31
                r9.L$1 = r5     // Catch: java.lang.Throwable -> L31
                r9.L$2 = r10     // Catch: java.lang.Throwable -> L31
                r9.label = r3     // Catch: java.lang.Throwable -> L31
                java.lang.Object r6 = r6.d(r7)     // Catch: java.lang.Throwable -> L31
                if (r6 != r0) goto L63
                goto L7b
            L63:
                r8 = r5
                r5 = r10
                r10 = r6
                goto L2f
            L67:
                androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r10 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r10     // Catch: java.lang.Throwable -> L31
                r7 = r9
                h.c.e r7 = (h.c.e) r7     // Catch: java.lang.Throwable -> L31
                r9.L$0 = r1     // Catch: java.lang.Throwable -> L31
                r9.L$1 = r4     // Catch: java.lang.Throwable -> L31
                r9.L$2 = r4     // Catch: java.lang.Throwable -> L31
                r9.label = r2     // Catch: java.lang.Throwable -> L31
                java.lang.Object r10 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$dispatchTrackpadScroll(r6, r5, r10, r7)     // Catch: java.lang.Throwable -> L31
                if (r10 == r0) goto L7b
                goto L3b
            L7b:
                return r0
            L7c:
                androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$setReceivingPanEventsJob$p(r5, r4)
                h.ab r9 = h.ab.f48028a
                return r9
            L82:
                androidx.compose.foundation.gestures.TrackpadScrollingLogic r9 = androidx.compose.foundation.gestures.TrackpadScrollingLogic.this
                androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$setReceivingPanEventsJob$p(r9, r4)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.C02601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TrackpadScrollingLogic(ScrollingLogic scrollingLogic, p<? super Velocity, ? super e<? super ab>, ? extends Object> pVar, Density density) {
        super(scrollingLogic, pVar, density);
        this.channel = w.c(Integer.MAX_VALUE, null, null, 6);
    }

    /* renamed from: canConsumeDelta-Uv8p0NA, reason: not valid java name */
    private final boolean m2339canConsumeDeltaUv8p0NA(ScrollingLogic scrollingLogic, long j2) {
        return scrollingLogic.m2320toSingleAxisDeltaFromAnglek4lQ0M(scrollingLogic.m2316reverseIfNeededMKHz9U(j2)) != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r6.invoke(r5, r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object dispatchTrackpadScroll(androidx.compose.foundation.gestures.ScrollingLogic r6, androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta r7, h.c.e<? super h.ab> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TrackpadScrollingLogic.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1 r0 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1 r0 = new androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            goto L81
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r8)
            goto L69
        L36:
            e.b.c.b(r8)
            h.g.b.aq r8 = new h.g.b.aq
            r8.<init>()
            r8.f48105a = r7
            r5.trackVelocity(r7)
            kotlinx.coroutines.a.o<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r7 = r5.channel
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r7 = r5.sumOrNull(r7)
            if (r7 == 0) goto L58
            r5.trackVelocity(r7)
            java.lang.Object r2 = r8.f48105a
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r2 = (androidx.compose.foundation.gestures.TrackpadScrollingLogic.TrackpadScrollDelta) r2
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r7 = r2.plus(r7)
            r8.f48105a = r7
        L58:
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3 r7 = new androidx.compose.foundation.gestures.TrackpadScrollingLogic$dispatchTrackpadScroll$3
            r2 = 0
            r7.<init>(r6, r8, r2)
            h.g.a.p r7 = (h.g.a.p) r7
            r0.label = r4
            java.lang.Object r6 = r5.userScroll$foundation(r7, r0)
            if (r6 != r1) goto L69
            goto L84
        L69:
            h.g.a.p r6 = r5.getOnScrollStopped()
            androidx.compose.foundation.gestures.DifferentialVelocityTracker r5 = r5.getVelocityTracker$foundation()
            long r7 = r5.m2173calculateVelocity9UxMQ8M()
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m11397boximpl(r7)
            r0.label = r3
            java.lang.Object r5 = r6.invoke(r5, r0)
            if (r5 == r1) goto L84
        L81:
            h.ab r5 = h.ab.f48028a
            return r5
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.dispatchTrackpadScroll(androidx.compose.foundation.gestures.ScrollingLogic, androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean onPan(androidx.compose.ui.input.pointer.PointerEvent r21) {
        /*
            r20 = this;
            r0 = r20
            java.util.List r1 = r21.getChanges()
            java.lang.Object r1 = h.a.i.R(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L9e
            java.util.List r4 = r1.getHistorical()
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = r2
            r7 = r6
        L1d:
            r8 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            if (r6 >= r5) goto L5c
            java.lang.Object r10 = r4.get(r6)
            androidx.compose.ui.input.pointer.HistoricalChange r10 = (androidx.compose.ui.input.pointer.HistoricalChange) r10
            long r11 = r10.m9508getPanOffsetF1C5BW0()
            long r14 = r11 ^ r8
            androidx.compose.foundation.gestures.ScrollingLogic r8 = r0.getScrollingLogic()
            boolean r8 = r0.m2339canConsumeDeltaUv8p0NA(r8, r14)
            if (r8 == 0) goto L59
            kotlinx.coroutines.a.o<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r8 = r0.channel
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r13 = new androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta
            long r16 = r10.getUptimeMillis()
            r18 = 0
            r19 = 0
            r13.<init>(r14, r16, r18, r19)
            java.lang.Object r8 = r8.i(r13)
            boolean r8 = kotlinx.coroutines.a.t.g(r8)
            if (r8 != 0) goto L58
            if (r7 == 0) goto L56
            goto L58
        L56:
            r7 = r2
            goto L59
        L58:
            r7 = r3
        L59:
            int r6 = r6 + 1
            goto L1d
        L5c:
            long r4 = r1.m9607getPanOffsetF1C5BW0()
            long r11 = r4 ^ r8
            int r4 = r21.m9541getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
            int r5 = r5.m9555getPanEnd7fucELk()
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r4, r5)
            androidx.compose.foundation.gestures.ScrollingLogic r5 = r0.getScrollingLogic()
            boolean r5 = r0.m2339canConsumeDeltaUv8p0NA(r5, r11)
            if (r5 != 0) goto L7e
            if (r4 == 0) goto L9c
            r15 = r3
            goto L7f
        L7e:
            r15 = r4
        L7f:
            kotlinx.coroutines.a.o<androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta> r4 = r0.channel
            androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta r10 = new androidx.compose.foundation.gestures.TrackpadScrollingLogic$TrackpadScrollDelta
            long r13 = r1.getUptimeMillis()
            r16 = 0
            r10.<init>(r11, r13, r15, r16)
            java.lang.Object r1 = r4.i(r10)
            boolean r1 = kotlinx.coroutines.a.t.g(r1)
            if (r1 != 0) goto L9b
            if (r7 == 0) goto L99
            goto L9b
        L99:
            r7 = r2
            goto L9c
        L9b:
            r7 = r3
        L9c:
            if (r7 != 0) goto La4
        L9e:
            boolean r0 = r0.isScrolling$foundation()
            if (r0 == 0) goto La5
        La4:
            return r3
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.onPan(androidx.compose.ui.input.pointer.PointerEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackpadScrollDelta sumOrNull(final o<TrackpadScrollDelta> oVar) {
        TrackpadScrollDelta trackpadScrollDeltaPlus = null;
        for (TrackpadScrollDelta trackpadScrollDelta : NonTouchScrollingLogicKt.untilNull(new a() { // from class: androidx.compose.foundation.gestures.TrackpadScrollingLogic$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return TrackpadScrollingLogic.sumOrNull$lambda$0(oVar);
            }
        })) {
            trackpadScrollDeltaPlus = trackpadScrollDeltaPlus == null ? trackpadScrollDelta : trackpadScrollDeltaPlus.plus(trackpadScrollDelta);
        }
        return trackpadScrollDeltaPlus;
    }

    static final TrackpadScrollDelta sumOrNull$lambda$0(o oVar) {
        return (TrackpadScrollDelta) t.a(oVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVelocity(TrackpadScrollDelta trackpadScrollDelta) {
        getVelocityTracker$foundation().m2172addDeltaUv8p0NA(trackpadScrollDelta.getTimeMillis(), trackpadScrollDelta.m2340getValueF1C5BW0());
    }

    @Override // androidx.compose.foundation.gestures.NonTouchScrollingLogic
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo2250onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        if (PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9557getPanStart7fucELk()) || PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9556getPanMove7fucELk()) || PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9555getPanEnd7fucELk())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (changes.get(i2).isConsumed()) {
                    return;
                }
            }
            if (pointerEventPass == PointerEventPass.Initial && isScrolling$foundation()) {
                onPan(pointerEvent);
                consume$foundation(pointerEvent);
            }
            if (pointerEventPass == PointerEventPass.Main && !isScrolling$foundation() && onPan(pointerEvent)) {
                consume$foundation(pointerEvent);
            }
        }
    }

    @Override // androidx.compose.foundation.gestures.NonTouchScrollingLogic
    public void startReceivingEvents(af afVar) {
        if (this.receivingPanEventsJob == null) {
            this.receivingPanEventsJob = aj.z(afVar, null, null, new C02601(null), 3);
        }
    }

    /* compiled from: WazeSource */
    final class TrackpadScrollDelta {
        private final boolean isEnd;
        private final long timeMillis;
        private final long value;

        private TrackpadScrollDelta(long j2, long j3, boolean z) {
            this.value = j2;
            this.timeMillis = j3;
            this.isEnd = z;
        }

        public final long getTimeMillis() {
            return this.timeMillis;
        }

        /* renamed from: getValue-F1C5BW0, reason: not valid java name */
        public final long m2340getValueF1C5BW0() {
            return this.value;
        }

        public final boolean isEnd() {
            return this.isEnd;
        }

        public final TrackpadScrollDelta plus(TrackpadScrollDelta trackpadScrollDelta) {
            long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(this.value, trackpadScrollDelta.value);
            long jMax = Math.max(this.timeMillis, trackpadScrollDelta.timeMillis);
            boolean z = true;
            if (!this.isEnd && !trackpadScrollDelta.isEnd) {
                z = false;
            }
            return new TrackpadScrollDelta(jM7985plusMKHz9U, jMax, z, null);
        }

        public /* synthetic */ TrackpadScrollDelta(long j2, long j3, boolean z, h.g.b.o oVar) {
            this(j2, j3, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float dispatchTrackpadScroll(NestedScrollScope nestedScrollScope, float f2) {
        ScrollingLogic scrollingLogic = getScrollingLogic();
        return scrollingLogic.m2318toFloatk4lQ0M(scrollingLogic.m2316reverseIfNeededMKHz9U(nestedScrollScope.mo2256scrollByWithOverscrollOzD1aCk(scrollingLogic.m2319toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f2)), NestedScrollSource.Companion.m9476getUserInputWNlRxjI())));
    }
}
