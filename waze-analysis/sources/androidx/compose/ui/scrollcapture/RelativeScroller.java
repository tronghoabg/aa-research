package androidx.compose.ui.scrollcapture;

import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.p;
import h.h.a;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class RelativeScroller {
    private float scrollAmount;
    private final p<Float, e<? super Float>, Object> scrollBy;
    private final int viewportSize;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1, reason: invalid class name */
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
            return RelativeScroller.this.scrollBy(0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i2, p<? super Float, ? super e<? super Float>, ? extends Object> pVar) {
        this.viewportSize = i2;
        this.scrollBy = pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, h.c.e<? super h.ab> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            h.g.a.p<java.lang.Float, h.c.e<? super java.lang.Float>, java.lang.Object> r6 = r4.scrollBy
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.scrollAmount
            float r6 = r6 + r5
            r4.scrollAmount = r6
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.scrollBy(float, h.c.e):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int i2) {
        return n.j(i2 - a.b(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final Object scrollRangeToCenter(int i2, int i3, e<? super ab> eVar) {
        Object objScrollTo;
        if (i2 > i3) {
            throw new IllegalArgumentException("Expected min=" + i2 + " ≤ max=" + i3);
        }
        int i4 = this.viewportSize;
        int i5 = i3 - i2;
        if (i5 <= i4) {
            float f2 = i2;
            float f3 = this.scrollAmount;
            return ((f2 < f3 || ((float) i3) > f3 + ((float) i4)) && (objScrollTo = scrollTo((float) ((i2 + (i5 / 2)) - (i4 / 2)), eVar)) == h.c.a.a.f48038a) ? objScrollTo : ab.f48028a;
        }
        throw new IllegalArgumentException("Expected range (" + i5 + ") to be ≤ viewportSize=" + this.viewportSize);
    }

    public final Object scrollTo(float f2, e<? super ab> eVar) {
        Object objScrollBy = scrollBy(f2 - this.scrollAmount, eVar);
        return objScrollBy == h.c.a.a.f48038a ? objScrollBy : ab.f48028a;
    }
}
