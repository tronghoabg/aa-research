package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollingLogic2D$onScrollStopped$performFling$1 extends g implements p<Velocity, e<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic2D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic2D$onScrollStopped$performFling$1(ScrollingLogic2D scrollingLogic2D, e<? super ScrollingLogic2D$onScrollStopped$performFling$1> eVar) {
        super(2, eVar);
        this.this$0 = scrollingLogic2D;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ScrollingLogic2D$onScrollStopped$performFling$1 scrollingLogic2D$onScrollStopped$performFling$1 = new ScrollingLogic2D$onScrollStopped$performFling$1(this.this$0, eVar);
        scrollingLogic2D$onScrollStopped$performFling$1.J$0 = ((Velocity) obj).m11415unboximpl();
        return scrollingLogic2D$onScrollStopped$performFling$1;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, e<? super Velocity> eVar) {
        return m2329invokesFctU(velocity.m11415unboximpl(), eVar);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m2329invokesFctU(long j2, e<? super Velocity> eVar) {
        return ((ScrollingLogic2D$onScrollStopped$performFling$1) create(Velocity.m11397boximpl(j2), eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            long r1 = r0.J$1
            long r3 = r0.J$0
            e.b.c.b(r18)
            r0 = r18
            goto L8e
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L24:
            long r4 = r0.J$1
            long r6 = r0.J$0
            e.b.c.b(r18)
            r15 = r6
            r7 = r4
            r5 = r15
            r2 = r18
            goto L6d
        L31:
            long r5 = r0.J$0
            e.b.c.b(r18)
            r2 = r18
            goto L52
        L39:
            e.b.c.b(r18)
            long r6 = r0.J$0
            androidx.compose.foundation.gestures.ScrollingLogic2D r2 = r0.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = androidx.compose.foundation.gestures.ScrollingLogic2D.access$getNestedScrollDispatcher$p(r2)
            r8 = r0
            h.c.e r8 = (h.c.e) r8
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r2 = r2.m9459dispatchPreFlingQWom1Mo(r6, r8)
            if (r2 == r1) goto La1
            r5 = r6
        L52:
            androidx.compose.ui.unit.Velocity r2 = (androidx.compose.ui.unit.Velocity) r2
            long r7 = r2.m11415unboximpl()
            long r7 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r5, r7)
            androidx.compose.foundation.gestures.ScrollingLogic2D r2 = r0.this$0
            r9 = r0
            h.c.e r9 = (h.c.e) r9
            r0.J$0 = r5
            r0.J$1 = r7
            r0.label = r4
            java.lang.Object r2 = r2.mo2286doFlingAnimationQWom1Mo(r7, r9)
            if (r2 == r1) goto La1
        L6d:
            androidx.compose.ui.unit.Velocity r2 = (androidx.compose.ui.unit.Velocity) r2
            long r12 = r2.m11415unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic2D r2 = r0.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r9 = androidx.compose.foundation.gestures.ScrollingLogic2D.access$getNestedScrollDispatcher$p(r2)
            long r10 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r7, r12)
            r14 = r0
            h.c.e r14 = (h.c.e) r14
            r0.J$0 = r5
            r0.J$1 = r12
            r0.label = r3
            java.lang.Object r0 = r9.m9457dispatchPostFlingRZ2iAVY(r10, r12, r14)
            if (r0 == r1) goto La1
            r3 = r5
            r1 = r12
        L8e:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r5 = r0.m11415unboximpl()
            long r0 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r1, r5)
            long r0 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r3, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m11397boximpl(r0)
            return r0
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
