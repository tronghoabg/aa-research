package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DateRangePickerKt$customScrollActions$scrollUpAction$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ LazyListState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$customScrollActions$scrollUpAction$1$1(LazyListState lazyListState, e<? super DateRangePickerKt$customScrollActions$scrollUpAction$1$1> eVar) {
        super(2, eVar);
        this.$state = lazyListState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DateRangePickerKt$customScrollActions$scrollUpAction$1$1(this.$state, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DateRangePickerKt$customScrollActions$scrollUpAction$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            LazyListState lazyListState = this.$state;
            this.label = 1;
            if (LazyListState.scrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() - 1, 0, this, 2, null) == aVar) {
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
