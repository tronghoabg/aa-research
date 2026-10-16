package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import h.c.b.a.c;
import h.c.e;
import h.c.h;
import h.c.i;
import h.c.j;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final MonotonicFrameClock frameClock;
    private final Latch latch = new Latch();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1, reason: invalid class name */
    final class AnonymousClass1<R> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PausableMonotonicFrameClock.this.withFrameNanos(null, this);
        }
    }

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
    }

    @Override // h.c.j
    public /* bridge */ <R> R fold(R r, p<? super R, ? super h, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, pVar);
    }

    @Override // h.c.h, h.c.j
    public /* bridge */ <E extends h> E get(i<E> iVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, iVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, h.c.h
    public /* synthetic */ i getKey() {
        return MonotonicFrameClock.CC.$default$getKey(this);
    }

    public final boolean isPaused() {
        return !this.latch.isOpen();
    }

    @Override // h.c.j
    public /* bridge */ j minusKey(i<?> iVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, iVar);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    @Override // h.c.j
    public /* bridge */ j plus(j jVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, jVar);
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object withFrameNanos(h.g.a.l<? super java.lang.Long, ? extends R> r6, h.c.e<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.PausableMonotonicFrameClock.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r6 = r0.L$0
            h.g.a.l r6 = (h.g.a.l) r6
            e.b.c.b(r7)
            goto L49
        L3a:
            e.b.c.b(r7)
            androidx.compose.runtime.Latch r7 = r5.latch
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L58
        L49:
            androidx.compose.runtime.MonotonicFrameClock r5 = r5.frameClock
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = r5.withFrameNanos(r6, r0)
            if (r5 != r1) goto L57
            goto L58
        L57:
            return r5
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.withFrameNanos(h.g.a.l, h.c.e):java.lang.Object");
    }
}
