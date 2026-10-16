package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModel;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.k.j;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DateRangePickerKt$VerticalMonthsList$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ CalendarModel $calendarModel;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ l<Long, ab> $onDisplayedMonthChange;
    final /* synthetic */ j $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DateRangePickerKt$VerticalMonthsList$2$1(LazyListState lazyListState, l<? super Long, ab> lVar, CalendarModel calendarModel, j jVar, e<? super DateRangePickerKt$VerticalMonthsList$2$1> eVar) {
        super(2, eVar);
        this.$lazyListState = lazyListState;
        this.$onDisplayedMonthChange = lVar;
        this.$calendarModel = calendarModel;
        this.$yearRange = jVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DateRangePickerKt$VerticalMonthsList$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (DatePickerKt.updateDisplayedMonth(this.$lazyListState, this.$onDisplayedMonthChange, this.$calendarModel, this.$yearRange, this) == aVar) {
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
