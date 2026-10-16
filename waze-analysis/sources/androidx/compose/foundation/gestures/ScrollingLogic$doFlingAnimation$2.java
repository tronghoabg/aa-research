package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollingLogic$doFlingAnimation$2 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ ap $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, ap apVar, long j2, e<? super ScrollingLogic$doFlingAnimation$2> eVar) {
        super(2, eVar);
        this.this$0 = scrollingLogic;
        this.$result = apVar;
        this.$available = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, eVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // h.g.a.p
    public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        final ScrollingLogic scrollingLogic;
        ap apVar;
        long j2;
        ScrollingLogic scrollingLogic2;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            scrollingLogic = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f2) {
                    if (Math.abs(f2) != 0.0f && !((Boolean) scrollingLogic.isScrollableNodeAttached.invoke()).booleanValue()) {
                        throw new FlingCancellationException();
                    }
                    ScrollingLogic scrollingLogic3 = scrollingLogic;
                    return scrollingLogic3.reverseIfNeeded(scrollingLogic3.m2318toFloatk4lQ0M(nestedScrollScope.mo2256scrollByWithOverscrollOzD1aCk(scrollingLogic3.m2316reverseIfNeededMKHz9U(scrollingLogic3.m2319toOffsettuRUvjQ(f2)), NestedScrollSource.Companion.m9475getSideEffectWNlRxjI())));
                }
            };
            ap apVar2 = this.$result;
            long j3 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.flingBehavior;
            long j4 = apVar2.f48104a;
            float fReverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m2313toFloatTH1AsA0(j3));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = apVar2;
            this.J$0 = j4;
            this.label = 1;
            Object objPerformFling = flingBehavior.performFling(scrollScope, fReverseIfNeeded, this);
            if (objPerformFling == aVar) {
                return aVar;
            }
            apVar = apVar2;
            j2 = j4;
            obj = objPerformFling;
            scrollingLogic2 = scrollingLogic;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            apVar = (ap) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            c.b(obj);
        }
        apVar.f48104a = scrollingLogic.m2314updateQWom1Mo(j2, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return ab.f48028a;
    }
}
