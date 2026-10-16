package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
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
final class ScrollingLogic2D$doFlingAnimation$2 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ ap $result;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScrollingLogic2D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic2D$doFlingAnimation$2(ScrollingLogic2D scrollingLogic2D, long j2, ap apVar, e<? super ScrollingLogic2D$doFlingAnimation$2> eVar) {
        super(2, eVar);
        this.this$0 = scrollingLogic2D;
        this.$available = j2;
        this.$result = apVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ScrollingLogic2D$doFlingAnimation$2 scrollingLogic2D$doFlingAnimation$2 = new ScrollingLogic2D$doFlingAnimation$2(this.this$0, this.$available, this.$result, eVar);
        scrollingLogic2D$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic2D$doFlingAnimation$2;
    }

    @Override // h.g.a.p
    public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
        return ((ScrollingLogic2D$doFlingAnimation$2) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        ap apVar;
        long j2;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic2D scrollingLogic2D = this.this$0;
            final long j3 = this.$available;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2$flingScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f2) {
                    long jDoFlingAnimation_QWom1Mo$toDecomposedOffset = ScrollingLogic2D.doFlingAnimation_QWom1Mo$toDecomposedOffset(f2, j3);
                    if (Offset.m7977equalsimpl0(jDoFlingAnimation_QWom1Mo$toDecomposedOffset, Offset.Companion.m7996getZeroF1C5BW0()) || ((Boolean) scrollingLogic2D.isScrollableNodeAttached.invoke()).booleanValue()) {
                        return ScrollingLogic2D.doFlingAnimation_QWom1Mo$toMagnitudeFloat(nestedScrollScope.mo2256scrollByWithOverscrollOzD1aCk(jDoFlingAnimation_QWom1Mo$toDecomposedOffset, NestedScrollSource.Companion.m9475getSideEffectWNlRxjI()));
                    }
                    throw new FlingCancellationException();
                }
            };
            ap apVar2 = this.$result;
            float fM2292getMagnitudeTH1AsA0 = Scrollable2DKt.m2292getMagnitudeTH1AsA0(j3);
            this.L$0 = apVar2;
            this.J$0 = j3;
            this.label = 1;
            Object objPerformFling = scrollingLogic2D.flingBehavior.performFling(scrollScope, fM2292getMagnitudeTH1AsA0, this);
            if (objPerformFling == aVar) {
                return aVar;
            }
            obj = objPerformFling;
            apVar = apVar2;
            j2 = j3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            apVar = (ap) this.L$0;
            c.b(obj);
        }
        apVar.f48104a = ScrollingLogic2D.doFlingAnimation_QWom1Mo$toDecomposedVelocity(((Number) obj).floatValue(), j2);
        return ab.f48028a;
    }
}
