package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.f;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.an;
import h.g.b.ap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop = 18.0f;
    private static final float mouseSlop = 0.125f;
    private static final float mouseToTouchSlopRatio = 0.0069444445f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$13, reason: invalid class name */
    final class AnonymousClass13 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ p<PointerInputChange, Offset, ab> $onDrag;
        final /* synthetic */ a<ab> $onDragCancel;
        final /* synthetic */ l<PointerInputChange, ab> $onDragEnd;
        final /* synthetic */ q<PointerInputChange, PointerInputChange, Offset, ab> $onDragStart;
        final /* synthetic */ Orientation $orientationLock;
        final /* synthetic */ a<Boolean> $shouldAwaitTouchSlop;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass13(a<Boolean> aVar, Orientation orientation, q<? super PointerInputChange, ? super PointerInputChange, ? super Offset, ab> qVar, p<? super PointerInputChange, ? super Offset, ab> pVar, a<ab> aVar2, l<? super PointerInputChange, ab> lVar, e<? super AnonymousClass13> eVar) {
            super(2, eVar);
            this.$shouldAwaitTouchSlop = aVar;
            this.$orientationLock = orientation;
            this.$onDragStart = qVar;
            this.$onDrag = pVar;
            this.$onDragCancel = aVar2;
            this.$onDragEnd = lVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass13 anonymousClass13 = new AnonymousClass13(this.$shouldAwaitTouchSlop, this.$orientationLock, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, eVar);
            anonymousClass13.L$0 = obj;
            return anonymousClass13;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass13) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
        
            if (androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r1, r4, r12.$shouldAwaitTouchSlop, r12.$orientationLock, r12.$onDragStart, r12.$onDrag, r12.$onDragCancel, r12.$onDragEnd, r12) == r0) goto L17;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r12.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r13)
                goto L57
            L10:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L18:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r13)
                goto L38
            L20:
                e.b.c.b(r13)
                java.lang.Object r13 = r12.L$0
                r1 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                r4 = r12
                h.c.e r4 = (h.c.e) r4
                r12.L$0 = r1
                r12.label = r3
                r3 = 0
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r3, r13, r4)
                if (r13 == r0) goto L5a
            L38:
                r3 = r1
                h.g.a.a<java.lang.Boolean> r5 = r12.$shouldAwaitTouchSlop
                androidx.compose.foundation.gestures.Orientation r6 = r12.$orientationLock
                h.g.a.q<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, h.ab> r7 = r12.$onDragStart
                h.g.a.p<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, h.ab> r8 = r12.$onDrag
                h.g.a.a<h.ab> r9 = r12.$onDragCancel
                h.g.a.l<androidx.compose.ui.input.pointer.PointerInputChange, h.ab> r10 = r12.$onDragEnd
                r4 = r13
                androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                r11 = r12
                h.c.e r11 = (h.c.e) r11
                r13 = 0
                r12.L$0 = r13
                r12.label = r2
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r12 != r0) goto L57
                goto L5a
            L57:
                h.ab r12 = h.ab.f48028a
                return r12
            L5a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.AnonymousClass13.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5, reason: invalid class name */
    final class AnonymousClass5 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ p<PointerInputChange, Offset, ab> $onDrag;
        final /* synthetic */ a<ab> $onDragCancel;
        final /* synthetic */ a<ab> $onDragEnd;
        final /* synthetic */ l<Offset, ab> $onDragStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(l<? super Offset, ab> lVar, a<ab> aVar, a<ab> aVar2, p<? super PointerInputChange, ? super Offset, ab> pVar, e<? super AnonymousClass5> eVar) {
            super(2, eVar);
            this.$onDragStart = lVar;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
            this.$onDrag = pVar;
        }

        static final ab invokeSuspend$lambda$0(p pVar, PointerInputChange pointerInputChange) {
            pVar.invoke(pointerInputChange, Offset.m7969boximpl(PointerEventKt.positionChange(pointerInputChange)));
            pointerInputChange.consume();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, eVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass5) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:8:0x0013, B:29:0x0086, B:31:0x008e, B:33:0x00a0, B:35:0x00ac, B:36:0x00af, B:37:0x00b2, B:38:0x00b8, B:13:0x0023, B:24:0x005c, B:26:0x0060, B:16:0x002b, B:22:0x0049, B:19:0x0037), top: B:45:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[Catch: CancellationException -> 0x00c1, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:8:0x0013, B:29:0x0086, B:31:0x008e, B:33:0x00a0, B:35:0x00ac, B:36:0x00af, B:37:0x00b2, B:38:0x00b8, B:13:0x0023, B:24:0x005c, B:26:0x0060, B:16:0x002b, B:22:0x0049, B:19:0x0037), top: B:45:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b8 A[Catch: CancellationException -> 0x00c1, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c1, blocks: (B:8:0x0013, B:29:0x0086, B:31:0x008e, B:33:0x00a0, B:35:0x00ac, B:36:0x00af, B:37:0x00b2, B:38:0x00b8, B:13:0x0023, B:24:0x005c, B:26:0x0060, B:16:0x002b, B:22:0x0049, B:19:0x0037), top: B:45:0x0007 }] */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                e.b.c.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lc1
                goto L86
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1f:
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lc1
                goto L5c
            L27:
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r12)     // Catch: java.util.concurrent.CancellationException -> Lc1
                goto L49
            L2f:
                e.b.c.b(r12)
                java.lang.Object r12 = r11.L$0
                r5 = r12
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r8 = r11
                h.c.e r8 = (h.c.e) r8     // Catch: java.util.concurrent.CancellationException -> Lc1
                r11.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> Lc1
                r11.label = r4     // Catch: java.util.concurrent.CancellationException -> Lc1
                r9 = 2
                r10 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> Lc1
                if (r12 == r0) goto Lc0
                r1 = r5
            L49:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> Lc1
                long r4 = r12.m9605getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> Lc1
                r12 = r11
                h.c.e r12 = (h.c.e) r12     // Catch: java.util.concurrent.CancellationException -> Lc1
                r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> Lc1
                r11.label = r3     // Catch: java.util.concurrent.CancellationException -> Lc1
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m2189awaitLongPressOrCancellationrnUCldI(r1, r4, r12)     // Catch: java.util.concurrent.CancellationException -> Lc1
                if (r12 == r0) goto Lc0
            L5c:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> Lc1
                if (r12 == 0) goto Lbd
                h.g.a.l<androidx.compose.ui.geometry.Offset, h.ab> r3 = r11.$onDragStart     // Catch: java.util.concurrent.CancellationException -> Lc1
                long r4 = r12.m9608getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Lc1
                androidx.compose.ui.geometry.Offset r4 = androidx.compose.ui.geometry.Offset.m7969boximpl(r4)     // Catch: java.util.concurrent.CancellationException -> Lc1
                r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> Lc1
                long r3 = r12.m9605getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> Lc1
                h.g.a.p<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, h.ab> r12 = r11.$onDrag     // Catch: java.util.concurrent.CancellationException -> Lc1
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$$ExternalSyntheticLambda0 r5 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$$ExternalSyntheticLambda0     // Catch: java.util.concurrent.CancellationException -> Lc1
                r5.<init>()     // Catch: java.util.concurrent.CancellationException -> Lc1
                r12 = r11
                h.c.e r12 = (h.c.e) r12     // Catch: java.util.concurrent.CancellationException -> Lc1
                r11.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> Lc1
                r11.label = r2     // Catch: java.util.concurrent.CancellationException -> Lc1
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m2199dragjO51t88(r1, r3, r5, r12)     // Catch: java.util.concurrent.CancellationException -> Lc1
                if (r12 == r0) goto Lc0
                r0 = r1
            L86:
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> Lc1
                boolean r12 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Lc1
                if (r12 == 0) goto Lb8
                androidx.compose.ui.input.pointer.PointerEvent r12 = r0.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> Lc1
                java.util.List r12 = r12.getChanges()     // Catch: java.util.concurrent.CancellationException -> Lc1
                r0 = r12
                java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.util.concurrent.CancellationException -> Lc1
                int r0 = r0.size()     // Catch: java.util.concurrent.CancellationException -> Lc1
                r1 = 0
            L9e:
                if (r1 >= r0) goto Lb2
                java.lang.Object r2 = r12.get(r1)     // Catch: java.util.concurrent.CancellationException -> Lc1
                androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2     // Catch: java.util.concurrent.CancellationException -> Lc1
                boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r2)     // Catch: java.util.concurrent.CancellationException -> Lc1
                if (r3 == 0) goto Laf
                r2.consume()     // Catch: java.util.concurrent.CancellationException -> Lc1
            Laf:
                int r1 = r1 + 1
                goto L9e
            Lb2:
                h.g.a.a<h.ab> r12 = r11.$onDragEnd     // Catch: java.util.concurrent.CancellationException -> Lc1
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> Lc1
                goto Lbd
            Lb8:
                h.g.a.a<h.ab> r12 = r11.$onDragCancel     // Catch: java.util.concurrent.CancellationException -> Lc1
                r12.invoke()     // Catch: java.util.concurrent.CancellationException -> Lc1
            Lbd:
                h.ab r11 = h.ab.f48028a
                return r11
            Lc0:
                return r0
            Lc1:
                r0 = move-exception
                r12 = r0
                h.g.a.a<h.ab> r11 = r11.$onDragCancel
                r11.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    final class C02325 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ a<ab> $onDragCancel;
        final /* synthetic */ a<ab> $onDragEnd;
        final /* synthetic */ l<Offset, ab> $onDragStart;
        final /* synthetic */ p<PointerInputChange, Float, ab> $onHorizontalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02325(l<? super Offset, ab> lVar, p<? super PointerInputChange, ? super Float, ab> pVar, a<ab> aVar, a<ab> aVar2, e<? super C02325> eVar) {
            super(2, eVar);
            this.$onDragStart = lVar;
            this.$onHorizontalDrag = pVar;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
        }

        static final ab invokeSuspend$lambda$0(an anVar, PointerInputChange pointerInputChange, float f2) {
            pointerInputChange.consume();
            anVar.f48102a = f2;
            return ab.f48028a;
        }

        static final ab invokeSuspend$lambda$1(p pVar, PointerInputChange pointerInputChange) {
            pVar.invoke(pointerInputChange, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) >> 32))));
            pointerInputChange.consume();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02325 c02325 = new C02325(this.$onDragStart, this.$onHorizontalDrag, this.$onDragEnd, this.$onDragCancel, eVar);
            c02325.L$0 = obj;
            return c02325;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((C02325) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
        
            if (r12 != r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                e.b.c.b(r12)
                goto La7
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1c:
                java.lang.Object r1 = r11.L$1
                h.g.b.an r1 = (h.g.b.an) r1
                java.lang.Object r3 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                e.b.c.b(r12)
                goto L6f
            L28:
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r12)
                r4 = r1
                goto L4b
            L31:
                e.b.c.b(r12)
                java.lang.Object r12 = r11.L$0
                r5 = r12
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r8 = r11
                h.c.e r8 = (h.c.e) r8
                r11.L$0 = r5
                r11.label = r4
                r9 = 2
                r10 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 == r0) goto Lbd
                r4 = r5
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                h.g.b.an r1 = new h.g.b.an
                r1.<init>()
                long r5 = r12.m9605getIdJ3iCeTQ()
                int r7 = r12.m9611getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$$ExternalSyntheticLambda0 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$$ExternalSyntheticLambda0
                r8.<init>()
                r9 = r11
                h.c.e r9 = (h.c.e) r9
                r11.L$0 = r4
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m2187awaitHorizontalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
                if (r12 == r0) goto Lbd
                r3 = r4
            L6f:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                if (r12 == 0) goto Lba
                h.g.a.l<androidx.compose.ui.geometry.Offset, h.ab> r4 = r11.$onDragStart
                long r5 = r12.m9608getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m7969boximpl(r5)
                r4.invoke(r5)
                h.g.a.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, h.ab> r4 = r11.$onHorizontalDrag
                float r1 = r1.f48102a
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r12, r5)
                h.g.a.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, h.ab> r1 = r11.$onHorizontalDrag
                long r4 = r12.m9605getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$$ExternalSyntheticLambda1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$5$$ExternalSyntheticLambda1
                r12.<init>()
                r1 = r11
                h.c.e r1 = (h.c.e) r1
                r6 = 0
                r11.L$0 = r6
                r11.L$1 = r6
                r11.label = r2
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m2200horizontalDragjO51t88(r3, r4, r12, r1)
                if (r12 == r0) goto Lbd
            La7:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb5
                h.g.a.a<h.ab> r11 = r11.$onDragEnd
                r11.invoke()
                goto Lba
            Lb5:
                h.g.a.a<h.ab> r11 = r11.$onDragCancel
                r11.invoke()
            Lba:
                h.ab r11 = h.ab.f48028a
                return r11
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C02325.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5, reason: invalid class name and case insensitive filesystem */
    final class C02335 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ a<ab> $onDragCancel;
        final /* synthetic */ a<ab> $onDragEnd;
        final /* synthetic */ l<Offset, ab> $onDragStart;
        final /* synthetic */ p<PointerInputChange, Float, ab> $onVerticalDrag;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02335(l<? super Offset, ab> lVar, p<? super PointerInputChange, ? super Float, ab> pVar, a<ab> aVar, a<ab> aVar2, e<? super C02335> eVar) {
            super(2, eVar);
            this.$onDragStart = lVar;
            this.$onVerticalDrag = pVar;
            this.$onDragEnd = aVar;
            this.$onDragCancel = aVar2;
        }

        static final ab invokeSuspend$lambda$0(an anVar, PointerInputChange pointerInputChange, float f2) {
            pointerInputChange.consume();
            anVar.f48102a = f2;
            return ab.f48028a;
        }

        static final ab invokeSuspend$lambda$1(p pVar, PointerInputChange pointerInputChange) {
            pVar.invoke(pointerInputChange, Float.valueOf(Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) & MuxerUtil.UNSIGNED_INT_MAX_VALUE))));
            pointerInputChange.consume();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02335 c02335 = new C02335(this.$onDragStart, this.$onVerticalDrag, this.$onDragEnd, this.$onDragCancel, eVar);
            c02335.L$0 = obj;
            return c02335;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((C02335) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
        
            if (r12 != r0) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                e.b.c.b(r12)
                goto La7
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1c:
                java.lang.Object r1 = r11.L$1
                h.g.b.an r1 = (h.g.b.an) r1
                java.lang.Object r3 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                e.b.c.b(r12)
                goto L6f
            L28:
                java.lang.Object r1 = r11.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r12)
                r4 = r1
                goto L4b
            L31:
                e.b.c.b(r12)
                java.lang.Object r12 = r11.L$0
                r5 = r12
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                r8 = r11
                h.c.e r8 = (h.c.e) r8
                r11.L$0 = r5
                r11.label = r4
                r9 = 2
                r10 = 0
                r6 = 0
                r7 = 0
                java.lang.Object r12 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                if (r12 == r0) goto Lbd
                r4 = r5
            L4b:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                h.g.b.an r1 = new h.g.b.an
                r1.<init>()
                long r5 = r12.m9605getIdJ3iCeTQ()
                int r7 = r12.m9611getTypeT8wyACA()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$$ExternalSyntheticLambda0 r8 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$$ExternalSyntheticLambda0
                r8.<init>()
                r9 = r11
                h.c.e r9 = (h.c.e) r9
                r11.L$0 = r4
                r11.L$1 = r1
                r11.label = r3
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m2195awaitVerticalPointerSlopOrCancellationgDDlDlE(r4, r5, r7, r8, r9)
                if (r12 == r0) goto Lbd
                r3 = r4
            L6f:
                androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
                if (r12 == 0) goto Lba
                h.g.a.l<androidx.compose.ui.geometry.Offset, h.ab> r4 = r11.$onDragStart
                long r5 = r12.m9608getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r5 = androidx.compose.ui.geometry.Offset.m7969boximpl(r5)
                r4.invoke(r5)
                h.g.a.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, h.ab> r4 = r11.$onVerticalDrag
                float r1 = r1.f48102a
                java.lang.Float r5 = new java.lang.Float
                r5.<init>(r1)
                r4.invoke(r12, r5)
                h.g.a.p<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float, h.ab> r1 = r11.$onVerticalDrag
                long r4 = r12.m9605getIdJ3iCeTQ()
                androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$$ExternalSyntheticLambda1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$5$$ExternalSyntheticLambda1
                r12.<init>()
                r1 = r11
                h.c.e r1 = (h.c.e) r1
                r6 = 0
                r11.L$0 = r6
                r11.L$1 = r6
                r11.label = r2
                java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m2203verticalDragjO51t88(r3, r4, r12, r1)
                if (r12 == r0) goto Lbd
            La7:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lb5
                h.g.a.a<h.ab> r11 = r11.$onDragEnd
                r11.invoke()
                goto Lba
            Lb5:
                h.g.a.a<h.ab> r11 = r11.$onDragCancel
                r11.invoke()
            Lba:
                h.ab r11 = h.ab.f48028a
                return r11
            Lbd:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.C02335.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$processDragGesture$1, reason: invalid class name and case insensitive filesystem */
    final class C02341 extends c {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C02341(e<? super C02341> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DragGestureDetectorKt.processDragGesture(null, null, null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Path cross not found for [B:32:0x00d3, B:38:0x00fa], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0098 -> B:23:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.ui.input.pointer.PointerInputChange r19, androidx.compose.ui.input.pointer.PointerEventPass r20, h.c.e<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2184awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2184awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.c.e):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m2185awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j2, l<? super PointerInputChange, Boolean> lVar, e<? super PointerInputChange> eVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        ap apVar = new ap();
        apVar.f48104a = j2;
        while (true) {
            PointerInputChange pointerInputChange3 = null;
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, eVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                if (Boolean.valueOf(PointerId.m9587equalsimpl0(pointerInputChange.m9605getIdJ3iCeTQ(), apVar.f48104a)).booleanValue()) {
                    break;
                }
                i3++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i2);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i2++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                apVar.f48104a = pointerInputChange5.m9605getIdJ3iCeTQ();
            } else if (lVar.invoke(pointerInputChange2).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) != 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2186awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2186awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0188 -> B:59:0x018c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2187awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, h.ab> r24, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2187awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0191 -> B:59:0x0196). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2188awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, h.ab> r23, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2188awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [h.g.b.aq] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2189awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$2
            h.g.b.am r9 = (h.g.b.am) r9
            java.lang.Object r10 = r0.L$1
            h.g.b.aq r10 = (h.g.b.aq) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            e.b.c.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            goto La8
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            e.b.c.b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m2201isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4b
            return r4
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L5b:
            if (r5 >= r2) goto L72
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m9605getIdJ3iCeTQ()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m9587equalsimpl0(r7, r10)
            if (r7 == 0) goto L6f
            goto L73
        L6f:
            int r5 = r5 + 1
            goto L5b
        L72:
            r6 = r4
        L73:
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L79
            return r4
        L79:
            h.g.b.aq r10 = new h.g.b.aq
            r10.<init>()
            h.g.b.aq r12 = new h.g.b.aq
            r12.<init>()
            r12.f48105a = r11
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            h.g.b.am r2 = new h.g.b.am     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r2.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            h.g.a.p r7 = (h.g.a.p) r7     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$0 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$1 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$2 = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            java.lang.Object r9 = r9.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 == r1) goto Lb5
            r9 = r2
        La8:
            boolean r9 = r9.f48101a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 == 0) goto Lb4
            java.lang.Object r9 = r10.f48105a     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 == 0) goto Lb3
            return r9
        Lb3:
            return r11
        Lb4:
            return r4
        Lb5:
            return r1
        Lb6:
            java.lang.Object r9 = r10.f48105a
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 == 0) goto Lbd
            r11 = r9
        Lbd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2189awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x018d -> B:60:0x0191). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2190awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, int r21, androidx.compose.foundation.gestures.Orientation r22, long r23, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, h.ab> r25, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2190awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.Orientation, long, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m2191awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Orientation orientation, long j3, p<? super PointerInputChange, ? super Offset, ab> pVar, e<? super PointerInputChange> eVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m2201isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float fM2202pointerSlopE8SPZFQ = m2202pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
        ap apVar = new ap();
        apVar.f48104a = j2;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j3, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, eVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i3);
                int i4 = i3;
                if (Boolean.valueOf(PointerId.m9587equalsimpl0(pointerInputChange.m9605getIdJ3iCeTQ(), apVar.f48104a)).booleanValue()) {
                    break;
                }
                i3 = i4 + 1;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i5);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i5++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                apVar.f48104a = pointerInputChange4.m9605getIdJ3iCeTQ();
            } else {
                long jM2335getPostSlopOffsetqto3Fdw = touchSlopDetector.m2335getPostSlopOffsetqto3Fdw(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3), fM2202pointerSlopE8SPZFQ, false | (!((4 & 4) == 0)));
                if ((9223372034707292159L & jM2335getPostSlopOffsetqto3Fdw) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    pVar.invoke(pointerInputChange3, Offset.m7969boximpl(jM2335getPostSlopOffsetqto3Fdw));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    TouchSlopDetector.m2333resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, eVar);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m2192awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j2, int i2, Orientation orientation, long j3, p pVar, e eVar, int i3, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long jM7996getZeroF1C5BW0 = (i3 & 8) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j3;
        long jM9605getIdJ3iCeTQ = j2;
        if (m2201isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM9605getIdJ3iCeTQ)) {
            return null;
        }
        float fM2202pointerSlopE8SPZFQ = m2202pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i2);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, jM7996getZeroF1C5BW0, null);
        while (true) {
            PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, eVar, 1, null);
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i5);
                if (PointerId.m9587equalsimpl0(pointerInputChange.m9605getIdJ3iCeTQ(), jM9605getIdJ3iCeTQ)) {
                    break;
                }
                i5++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i4);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                jM9605getIdJ3iCeTQ = pointerInputChange4.m9605getIdJ3iCeTQ();
            } else {
                long jM2335getPostSlopOffsetqto3Fdw = touchSlopDetector.m2335getPostSlopOffsetqto3Fdw(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange3), fM2202pointerSlopE8SPZFQ, false | (!((4 & 4) == 0)));
                if ((9223372034707292159L & jM2335getPostSlopOffsetqto3Fdw) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    pVar.invoke(pointerInputChange3, Offset.m7969boximpl(jM2335getPostSlopOffsetqto3Fdw));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    TouchSlopDetector.m2333resetk4lQ0M$default(touchSlopDetector, 0L, 1, null);
                } else {
                    awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Final, eVar);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0179 -> B:59:0x017e). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2193awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, h.ab> r21, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2193awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE)) != 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:22:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2194awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2194awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x018b -> B:59:0x018f). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2195awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, h.ab> r24, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2195awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, h.g.a.p, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0194 -> B:59:0x0199). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2196awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, h.ab> r23, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2196awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, final l<? super Offset, ab> lVar, final a<ab> aVar, a<ab> aVar2, p<? super PointerInputChange, ? super Offset, ab> pVar, e<? super ab> eVar) {
        Object objDetectDragGestures = detectDragGestures(pointerInputScope, null, new q() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda3
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DragGestureDetectorKt.detectDragGestures$lambda$3(lVar, (PointerInputChange) obj, (PointerInputChange) obj2, (Offset) obj3);
            }
        }, new l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DragGestureDetectorKt.detectDragGestures$lambda$4(aVar, (PointerInputChange) obj);
            }
        }, aVar2, new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return true;
            }
        }, pVar, eVar);
        return objDetectDragGestures == h.c.a.a.f48038a ? objDetectDragGestures : ab.f48028a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Orientation orientation, q qVar, l lVar, a aVar, a aVar2, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qVar = new q() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda6
                @Override // h.g.a.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ab.f48028a;
                }
            };
        }
        q qVar2 = qVar;
        if ((i2 & 4) != 0) {
            lVar = new l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda7
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        l lVar2 = lVar;
        if ((i2 & 8) != 0) {
            aVar = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda8
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        a aVar3 = aVar;
        if ((i2 & 16) != 0) {
            aVar2 = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda9
                @Override // h.g.a.a
                public final Object invoke() {
                    return true;
                }
            };
        }
        return detectDragGestures(pointerInputScope, orientation, qVar2, lVar2, aVar3, aVar2, pVar, eVar);
    }

    static final ab detectDragGestures$lambda$3(l lVar, PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
        lVar.invoke(Offset.m7969boximpl(pointerInputChange2.m9608getPositionF1C5BW0()));
        return ab.f48028a;
    }

    static final ab detectDragGestures$lambda$4(a aVar, PointerInputChange pointerInputChange) {
        aVar.invoke();
        return ab.f48028a;
    }

    static final boolean detectDragGestures$lambda$5() {
        return true;
    }

    static final boolean detectDragGestures$lambda$9() {
        return true;
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, l<? super Offset, ab> lVar, a<ab> aVar, a<ab> aVar2, p<? super PointerInputChange, ? super Offset, ab> pVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass5(lVar, aVar, aVar2, pVar, null), eVar);
        return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda10
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda11
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 4) != 0) {
            aVar2 = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda12
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectDragGesturesAfterLongPress(pointerInputScope, lVar, aVar, aVar3, pVar, eVar);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, l<? super Offset, ab> lVar, a<ab> aVar, a<ab> aVar2, p<? super PointerInputChange, ? super Float, ab> pVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C02325(lVar, pVar, aVar, aVar2, null), eVar);
        return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 4) != 0) {
            aVar2 = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectHorizontalDragGestures(pointerInputScope, lVar, aVar, aVar3, pVar, eVar);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, l<? super Offset, ab> lVar, a<ab> aVar, a<ab> aVar2, p<? super PointerInputChange, ? super Float, ab> pVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C02335(lVar, pVar, aVar, aVar2, null), eVar);
        return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda16
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda17
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 4) != 0) {
            aVar2 = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda18
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectVerticalDragGestures(pointerInputScope, lVar, aVar, aVar3, pVar, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
    
        if ((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r4 & androidx.media3.muxer.MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.ui.geometry.Offset.m7978getDistanceimpl(r4)) != 0.0f) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:34:0x00d0, B:45:0x00fd], limit reached: 67 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008a -> B:22:0x0090). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2197dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, h.g.a.l<? super androidx.compose.ui.input.pointer.PointerInputChange, h.ab> r22, androidx.compose.foundation.gestures.Orientation r23, h.g.a.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, h.c.e<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2197dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.l, androidx.compose.foundation.gestures.Orientation, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m2198dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j2, l<? super PointerInputChange, ab> lVar, Orientation orientation, l<? super PointerInputChange, Boolean> lVar2, e<? super PointerInputChange> eVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long jM9605getIdJ3iCeTQ = j2;
        if (!m2201isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), jM9605getIdJ3iCeTQ)) {
            while (true) {
                ap apVar = new ap();
                apVar.f48104a = jM9605getIdJ3iCeTQ;
                while (true) {
                    PointerEvent pointerEvent = (PointerEvent) AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, eVar, 1, null);
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        if (Boolean.valueOf(PointerId.m9587equalsimpl0(pointerInputChange.m9605getIdJ3iCeTQ(), apVar.f48104a)).booleanValue()) {
                            break;
                        }
                        i3++;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 == null) {
                        pointerInputChange2 = null;
                        break;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i2 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i2);
                            if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 == null) {
                            break;
                        }
                        apVar.f48104a = pointerInputChange4.m9605getIdJ3iCeTQ();
                    } else {
                        long jPositionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                        if (Boolean.valueOf((orientation == null ? Offset.m7978getDistanceimpl(jPositionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) : Float.intBitsToFloat((int) (jPositionChangeIgnoreConsumed >> 32))) != 0.0f).booleanValue()) {
                            break;
                        }
                    }
                }
                if (pointerInputChange2 == null || lVar2.invoke(pointerInputChange2).booleanValue()) {
                    return null;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    return pointerInputChange2;
                }
                lVar.invoke(pointerInputChange2);
                jM9605getIdJ3iCeTQ = pointerInputChange2.m9605getIdJ3iCeTQ();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0046 -> B:18:0x0049). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2199dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, h.g.a.l<? super androidx.compose.ui.input.pointer.PointerInputChange, h.ab> r7, h.c.e<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            h.g.a.l r4 = (h.g.a.l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            e.b.c.b(r8)
            r7 = r4
            r4 = r5
            goto L49
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            e.b.c.b(r8)
        L3c:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m2184awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L53
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L53:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L5e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L5e:
            r7.invoke(r8)
            long r5 = r8.m9605getIdJ3iCeTQ()
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2199dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (r0 != 0.0f) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c3, B:46:0x00ef], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:23:0x0087). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2200horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, h.g.a.l<? super androidx.compose.ui.input.pointer.PointerInputChange, h.ab> r20, h.c.e<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2200horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m2201isPointerUpDmW0f2w(PointerEvent pointerEvent, long j2) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i2);
            if (PointerId.m9587equalsimpl0(pointerInputChange.m9605getIdJ3iCeTQ(), j2)) {
                break;
            }
            i2++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        return pointerInputChange2 == null || !pointerInputChange2.getPressed();
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m2202pointerSlopE8SPZFQ(ViewConfiguration viewConfiguration, int i2) {
        return PointerType.m9682equalsimpl0(i2, PointerType.Companion.m9687getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x063d, code lost:
    
        if (m2201isPointerUpDmW0f2w(r10.getCurrentEvent(), r2) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x06e6, code lost:
    
        if (androidx.compose.ui.geometry.Offset.m7978getDistanceimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r3)) != 0.0f) goto L193;
     */
    /* JADX WARN: Path cross not found for [B:123:0x0523, B:125:0x052e], limit reached: 227 */
    /* JADX WARN: Path cross not found for [B:128:0x0535, B:123:0x0523], limit reached: 227 */
    /* JADX WARN: Path cross not found for [B:191:0x06db, B:180:0x06af], limit reached: 227 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0444 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x060d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0517 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0417  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x05e2 -> B:151:0x05eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0670 -> B:168:0x0672). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0256 -> B:74:0x03a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x02ea -> B:73:0x03a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0355 -> B:74:0x03a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0399 -> B:71:0x039b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x043b -> B:86:0x03e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object processDragGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope r27, androidx.compose.ui.input.pointer.PointerInputChange r28, h.g.a.a<java.lang.Boolean> r29, androidx.compose.foundation.gestures.Orientation r30, h.g.a.q<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, h.ab> r31, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, h.ab> r32, h.g.a.a<h.ab> r33, h.g.a.l<? super androidx.compose.ui.input.pointer.PointerInputChange, h.ab> r34, h.c.e<? super h.ab> r35) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, h.g.a.a, androidx.compose.foundation.gestures.Orientation, h.g.a.q, h.g.a.p, h.g.a.a, h.g.a.l, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (r0 != 0.0f) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:35:0x00c3, B:46:0x00ef], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:23:0x0087). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2203verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, h.g.a.l<? super androidx.compose.ui.input.pointer.PointerInputChange, h.ab> r20, h.c.e<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m2203verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Orientation orientation, q<? super PointerInputChange, ? super PointerInputChange, ? super Offset, ab> qVar, l<? super PointerInputChange, ab> lVar, a<ab> aVar, a<Boolean> aVar2, p<? super PointerInputChange, ? super Offset, ab> pVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass13(aVar2, orientation, qVar, pVar, aVar, lVar, null), eVar);
        return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda13
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda14
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 4) != 0) {
            aVar2 = new a() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$$ExternalSyntheticLambda15
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectDragGestures(pointerInputScope, lVar, aVar, aVar3, pVar, eVar);
    }
}
