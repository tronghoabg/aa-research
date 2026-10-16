package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.an;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollableKt$semanticsScrollBy$2 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ an $previousValue;
    final /* synthetic */ ScrollingLogic $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$semanticsScrollBy$2(ScrollingLogic scrollingLogic, long j2, an anVar, e<? super ScrollableKt$semanticsScrollBy$2> eVar) {
        super(2, eVar);
        this.$this_semanticsScrollBy = scrollingLogic;
        this.$offset = j2;
        this.$previousValue = anVar;
    }

    static final ab invokeSuspend$lambda$0(an anVar, ScrollingLogic scrollingLogic, NestedScrollScope nestedScrollScope, float f2, float f3) {
        anVar.f48102a += scrollingLogic.reverseIfNeeded(scrollingLogic.m2318toFloatk4lQ0M(nestedScrollScope.mo2255scrollByOzD1aCk(scrollingLogic.m2319toOffsettuRUvjQ(scrollingLogic.reverseIfNeeded(f2 - anVar.f48102a)), NestedScrollSource.Companion.m9476getUserInputWNlRxjI())));
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, eVar);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // h.g.a.p
    public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
        return ((ScrollableKt$semanticsScrollBy$2) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic = this.$this_semanticsScrollBy;
            long j2 = this.$offset;
            final an anVar = this.$previousValue;
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, scrollingLogic.m2318toFloatk4lQ0M(j2), 0.0f, null, new p() { // from class: androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return ScrollableKt$semanticsScrollBy$2.invokeSuspend$lambda$0(anVar, scrollingLogic, nestedScrollScope, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            }, this, 12, null) == aVar) {
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
