package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $timeMillis;
    int label;
    final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(long j2, SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, e<? super SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1> eVar) {
        super(2, eVar);
        this.$timeMillis = j2;
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(this.$timeMillis, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (kotlinx.coroutines.aj.q(8, r8) != r0) goto L15;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r9)
            goto L3d
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L18:
            e.b.c.b(r9)
            goto L30
        L1c:
            e.b.c.b(r9)
            long r4 = r8.$timeMillis
            r6 = -8
            long r4 = r4 + r6
            r9 = r8
            h.c.e r9 = (h.c.e) r9
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.aj.q(r4, r9)
            if (r9 != r0) goto L30
            goto L5a
        L30:
            r9 = r8
            h.c.e r9 = (h.c.e) r9
            r8.label = r2
            r1 = 8
            java.lang.Object r9 = kotlinx.coroutines.aj.q(r1, r9)
            if (r9 == r0) goto L5a
        L3d:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine<R> r9 = r8.this$0
            kotlinx.coroutines.k r9 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.access$getPointerAwaiter$p(r9)
            if (r9 == 0) goto L57
            long r0 = r8.$timeMillis
            h.c.e r9 = (h.c.e) r9
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r8 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r8.<init>(r0)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r8 = e.b.c.a(r8)
            r9.resumeWith(r8)
        L57:
            h.ab r8 = h.ab.f48028a
            return r8
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
