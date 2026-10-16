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
final class DateRangePickerKt$DateRangePickerContent$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ int $monthIndex;
    final /* synthetic */ LazyListState $monthsListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateRangePickerKt$DateRangePickerContent$1$1(LazyListState lazyListState, int i2, e<? super DateRangePickerKt$DateRangePickerContent$1$1> eVar) {
        super(2, eVar);
        this.$monthsListState = lazyListState;
        this.$monthIndex = i2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DateRangePickerKt$DateRangePickerContent$1$1(this.$monthsListState, this.$monthIndex, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DateRangePickerKt$DateRangePickerContent$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            LazyListState lazyListState = this.$monthsListState;
            int i3 = this.$monthIndex;
            if (lazyListState.getFirstVisibleItemIndex() != i3) {
                this.label = 1;
                if (LazyListState.scrollToItem$default(this.$monthsListState, i3, 0, this, 2, null) == aVar) {
                    return aVar;
                }
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
