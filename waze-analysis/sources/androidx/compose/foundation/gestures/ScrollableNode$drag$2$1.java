package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ScrollableNode$drag$2$1 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
    final /* synthetic */ p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> $forEachDelta;
    final /* synthetic */ ScrollingLogic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ScrollableNode$drag$2$1(p<? super l<? super DragEvent.DragDelta, ab>, ? super e<? super ab>, ? extends Object> pVar, ScrollingLogic scrollingLogic, e<? super ScrollableNode$drag$2$1> eVar) {
        super(2, eVar);
        this.$forEachDelta = pVar;
        this.$this_with = scrollingLogic;
    }

    static final ab invokeSuspend$lambda$0(NestedScrollScope nestedScrollScope, ScrollingLogic scrollingLogic, DragEvent.DragDelta dragDelta) {
        nestedScrollScope.mo2256scrollByWithOverscrollOzD1aCk(Offset.m7987timestuRUvjQ(scrollingLogic.m2317singleAxisOffsetMKHz9U(dragDelta.m2180getDeltaF1C5BW0()), true != dragDelta.isIndirectPointerEvent() ? 1.0f : -1.0f), NestedScrollSource.Companion.m9476getUserInputWNlRxjI());
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        ScrollableNode$drag$2$1 scrollableNode$drag$2$1 = new ScrollableNode$drag$2$1(this.$forEachDelta, this.$this_with, eVar);
        scrollableNode$drag$2$1.L$0 = obj;
        return scrollableNode$drag$2$1;
    }

    @Override // h.g.a.p
    public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
        return ((ScrollableNode$drag$2$1) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            p<l<? super DragEvent.DragDelta, ab>, e<? super ab>, Object> pVar = this.$forEachDelta;
            final ScrollingLogic scrollingLogic = this.$this_with;
            l<? super DragEvent.DragDelta, ab> lVar = new l() { // from class: androidx.compose.foundation.gestures.ScrollableNode$drag$2$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return ScrollableNode$drag$2$1.invokeSuspend$lambda$0(nestedScrollScope, scrollingLogic, (DragEvent.DragDelta) obj2);
                }
            };
            this.label = 1;
            if (pVar.invoke(lVar, this) == aVar) {
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
