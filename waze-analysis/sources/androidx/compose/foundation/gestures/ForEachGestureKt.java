package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.c.j;
import h.g.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ForEachGestureKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2, reason: invalid class name */
    final class AnonymousClass2 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (ForEachGestureKt.awaitAllPointersUp$default((AwaitPointerEventScope) this.L$0, null, this, 1, null) == aVar) {
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

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3, reason: invalid class name */
    final class AnonymousClass3 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp(null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2, reason: invalid class name and case insensitive filesystem */
    final class C02382 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ p<AwaitPointerEventScope, e<? super ab>, Object> $block;
        final /* synthetic */ j $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C02382(j jVar, p<? super AwaitPointerEventScope, ? super e<? super ab>, ? extends Object> pVar, e<? super C02382> eVar) {
            super(2, eVar);
            this.$currentContext = jVar;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C02382 c02382 = new C02382(this.$currentContext, this.$block, eVar);
            c02382.L$0 = obj;
            return c02382;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((C02382) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: CancellationException -> 0x0030, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:21:0x0042, B:23:0x004e, B:11:0x0024, B:14:0x002c), top: B:35:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:19:0x003a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006f -> B:19:0x003a). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r7.label
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r8)
                goto L3a
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L20:
                java.lang.Object r1 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r8)     // Catch: java.util.concurrent.CancellationException -> L30
                goto L3a
            L28:
                java.lang.Object r1 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r8)     // Catch: java.util.concurrent.CancellationException -> L30
                goto L4e
            L30:
                r8 = move-exception
                goto L5c
            L32:
                e.b.c.b(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            L3a:
                h.c.j r8 = r7.$currentContext
                boolean r8 = h.g.b.o.h(r8)
                if (r8 == 0) goto L74
                h.g.a.p<androidx.compose.ui.input.pointer.AwaitPointerEventScope, h.c.e<? super h.ab>, java.lang.Object> r8 = r7.$block     // Catch: java.util.concurrent.CancellationException -> L30
                r7.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L30
                r7.label = r5     // Catch: java.util.concurrent.CancellationException -> L30
                java.lang.Object r8 = r8.invoke(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L30
                if (r8 == r0) goto L72
            L4e:
                r8 = r7
                h.c.e r8 = (h.c.e) r8     // Catch: java.util.concurrent.CancellationException -> L30
                r7.L$0 = r1     // Catch: java.util.concurrent.CancellationException -> L30
                r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L30
                java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L30
                if (r8 != r0) goto L3a
                goto L72
            L5c:
                h.c.j r6 = r7.$currentContext
                boolean r6 = h.g.b.o.h(r6)
                if (r6 == 0) goto L73
                r8 = r7
                h.c.e r8 = (h.c.e) r8
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp$default(r1, r4, r8, r5, r4)
                if (r8 == r0) goto L72
                goto L3a
            L72:
                return r0
            L73:
                throw r8
            L74:
                h.ab r7 = h.ab.f48028a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.C02382.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (changes.get(i2).getPressed()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (allPointersUp(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:19:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.ui.input.pointer.PointerEventPass r8, h.c.e<? super h.ab> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.input.pointer.PointerEventPass r7 = (androidx.compose.ui.input.pointer.PointerEventPass) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            e.b.c.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L50
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            e.b.c.b(r9)
            boolean r9 = allPointersUp(r7)
            if (r9 != 0) goto L70
        L43:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r9 = r7.awaitPointerEvent(r8, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r9 = r9.getChanges()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L5e:
            if (r4 >= r2) goto L70
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L6d
            goto L43
        L6d:
            int r4 = r4 + 1
            goto L5e
        L70:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pointerEventPass = PointerEventPass.Final;
        }
        return awaitAllPointersUp(awaitPointerEventScope, pointerEventPass, eVar);
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, p<? super AwaitPointerEventScope, ? super e<? super ab>, ? extends Object> pVar, e<? super ab> eVar) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C02382(eVar.getContext(), pVar, null), eVar);
        return objAwaitPointerEventScope == a.f48038a ? objAwaitPointerEventScope : ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[Catch: CancellationException -> 0x0061, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:27:0x0072, B:29:0x0080, B:17:0x004d, B:20:0x005d), top: B:41:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h.c.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [h.c.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008c -> B:25:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a1 -> B:25:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope r7, h.g.a.p<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r8, h.c.e<? super h.ab> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L63
            if (r2 == r5) goto L51
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.L$2
            h.c.j r7 = (h.c.j) r7
            java.lang.Object r8 = r0.L$1
            h.g.a.p r8 = (h.g.a.p) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            e.b.c.b(r9)
            goto L6c
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.L$2
            h.c.j r7 = (h.c.j) r7
            java.lang.Object r8 = r0.L$1
            h.g.a.p r8 = (h.g.a.p) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            e.b.c.b(r9)     // Catch: java.util.concurrent.CancellationException -> L61
            goto L6c
        L51:
            java.lang.Object r7 = r0.L$2
            h.c.j r7 = (h.c.j) r7
            java.lang.Object r8 = r0.L$1
            h.g.a.p r8 = (h.g.a.p) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r2 = (androidx.compose.ui.input.pointer.PointerInputScope) r2
            e.b.c.b(r9)     // Catch: java.util.concurrent.CancellationException -> L61
            goto L80
        L61:
            r9 = move-exception
            goto L8f
        L63:
            e.b.c.b(r9)
            h.c.j r9 = r0.getContext()
            r2 = r7
            r7 = r9
        L6c:
            boolean r9 = h.g.b.o.h(r7)
            if (r9 == 0) goto La6
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L61
            r0.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L61
            r0.L$2 = r7     // Catch: java.util.concurrent.CancellationException -> L61
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r9 = r8.invoke(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L61
            if (r9 == r1) goto La4
        L80:
            r0.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L61
            r0.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L61
            r0.L$2 = r7     // Catch: java.util.concurrent.CancellationException -> L61
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L61
            java.lang.Object r9 = awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L61
            if (r9 != r1) goto L6c
            goto La4
        L8f:
            boolean r6 = h.g.b.o.h(r7)
            if (r6 == 0) goto La5
            r0.L$0 = r2
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r9 = awaitAllPointersUp(r2, r0)
            if (r9 == r1) goto La4
            goto L6c
        La4:
            return r1
        La5:
            throw r9
        La6:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, h.g.a.p, h.c.e):java.lang.Object");
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass2(null), eVar);
        return objAwaitPointerEventScope == a.f48038a ? objAwaitPointerEventScope : ab.f48028a;
    }
}
