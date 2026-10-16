package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PagerWrapperFlingBehavior implements FlingBehavior {
    private final TargetedFlingBehavior originalFlingBehavior;
    private final PagerState pagerState;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1, reason: invalid class name */
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
            return PagerWrapperFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab performFling$lambda$0$0(PagerWrapperFlingBehavior pagerWrapperFlingBehavior, ScrollScope scrollScope, float f2) {
        pagerWrapperFlingBehavior.pagerState.updateTargetPage(scrollScope, a.b(pagerWrapperFlingBehavior.pagerState.getPageSizeWithSpacing$foundation() != 0 ? f2 / pagerWrapperFlingBehavior.pagerState.getPageSizeWithSpacing$foundation() : 0.0f) + pagerWrapperFlingBehavior.pagerState.getCurrentPage());
        return ab.f48028a;
    }

    public final TargetedFlingBehavior getOriginalFlingBehavior() {
        return this.originalFlingBehavior;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performFling(final androidx.compose.foundation.gestures.ScrollScope r5, float r6, h.c.e<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.foundation.pager.PagerWrapperFlingBehavior.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = (androidx.compose.foundation.pager.PagerWrapperFlingBehavior.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 r0 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            androidx.compose.foundation.gestures.TargetedFlingBehavior r7 = r4.originalFlingBehavior
            androidx.compose.foundation.pager.PagerWrapperFlingBehavior$$ExternalSyntheticLambda0 r2 = new androidx.compose.foundation.pager.PagerWrapperFlingBehavior$$ExternalSyntheticLambda0
            r2.<init>()
            r0.label = r3
            java.lang.Object r7 = r7.performFling(r5, r6, r2, r0)
            if (r7 == r1) goto L84
        L41:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            androidx.compose.foundation.pager.PagerState r6 = r4.pagerState
            float r6 = r6.getCurrentPageOffsetFraction()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L53
            goto L73
        L53:
            androidx.compose.foundation.pager.PagerState r6 = r4.pagerState
            float r6 = r6.getCurrentPageOffsetFraction()
            float r6 = java.lang.Math.abs(r6)
            double r0 = (double) r6
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L73
            androidx.compose.foundation.pager.PagerState r4 = r4.pagerState
            int r6 = r4.getCurrentPage()
            r0 = 2
            r1 = 0
            androidx.compose.foundation.pager.PagerState.requestScrollToPage$default(r4, r6, r7, r0, r1)
            goto L7e
        L73:
            androidx.compose.foundation.pager.PagerState r4 = r4.pagerState
            float r4 = r4.getCurrentPageOffsetFraction()
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
        L7e:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r5)
            return r4
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerWrapperFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, h.c.e):java.lang.Object");
    }
}
