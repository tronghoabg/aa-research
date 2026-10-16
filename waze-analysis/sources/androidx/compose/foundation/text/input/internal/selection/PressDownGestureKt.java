package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PressDownGestureKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2, reason: invalid class name */
    final class AnonymousClass2 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ TapOnPosition $onDown;
        final /* synthetic */ a<ab> $onUp;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TapOnPosition tapOnPosition, a<ab> aVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$onDown = tapOnPosition;
            this.$onUp = aVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onDown, this.$onUp, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (r13 == r0) goto L29;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:18:0x0063). Please report as a decompilation issue!!! */
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
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r12.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                java.lang.Object r4 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                e.b.c.b(r13)
                goto L63
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L20:
                java.lang.Object r1 = r12.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                e.b.c.b(r13)
                goto L42
            L28:
                e.b.c.b(r13)
                java.lang.Object r13 = r12.L$0
                r4 = r13
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                r7 = r12
                h.c.e r7 = (h.c.e) r7
                r12.L$0 = r4
                r12.label = r3
                r8 = 2
                r9 = 0
                r5 = 0
                r6 = 0
                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r13 == r0) goto L99
                r1 = r4
            L42:
                androidx.compose.foundation.text.input.internal.selection.TapOnPosition r4 = r12.$onDown
                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                long r5 = r13.m9608getPositionF1C5BW0()
                r4.mo3737onEventk4lQ0M(r5)
                h.g.a.a<h.ab> r4 = r12.$onUp
                if (r4 == 0) goto L96
                r4 = r1
                r1 = r13
            L53:
                r13 = r12
                h.c.e r13 = (h.c.e) r13
                r12.L$0 = r4
                r12.L$1 = r1
                r12.label = r2
                r5 = 0
                java.lang.Object r13 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(r4, r5, r13, r3, r5)
                if (r13 == r0) goto L99
            L63:
                androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                java.util.List r13 = r13.getChanges()
                r5 = r13
                java.util.Collection r5 = (java.util.Collection) r5
                int r5 = r5.size()
                r6 = 0
            L71:
                if (r6 >= r5) goto L91
                java.lang.Object r7 = r13.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                long r8 = r7.m9605getIdJ3iCeTQ()
                long r10 = r1.m9605getIdJ3iCeTQ()
                boolean r8 = androidx.compose.ui.input.pointer.PointerId.m9587equalsimpl0(r8, r10)
                if (r8 == 0) goto L8e
                boolean r7 = r7.getPressed()
                if (r7 == 0) goto L8e
                goto L53
            L8e:
                int r6 = r6 + 1
                goto L71
            L91:
                h.g.a.a<h.ab> r12 = r12.$onUp
                r12.invoke()
            L96:
                h.ab r12 = h.ab.f48028a
                return r12
            L99:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectPressDownGesture(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, a<ab> aVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(tapOnPosition, aVar, null), eVar);
        return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static /* synthetic */ Object detectPressDownGesture$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, a aVar, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        return detectPressDownGesture(pointerInputScope, tapOnPosition, aVar, eVar);
    }
}
