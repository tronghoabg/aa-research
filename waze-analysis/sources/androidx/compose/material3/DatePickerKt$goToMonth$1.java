package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.focus.FocusManager;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DatePickerKt$goToMonth$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ int $month;
    final /* synthetic */ LazyListState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DatePickerKt$goToMonth$1(LazyListState lazyListState, int i2, FocusManager focusManager, int i3, e<? super DatePickerKt$goToMonth$1> eVar) {
        super(2, eVar);
        this.$state = lazyListState;
        this.$month = i2;
        this.$focusManager = focusManager;
        this.$focusDirection = i3;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DatePickerKt$goToMonth$1(this.$state, this.$month, this.$focusManager, this.$focusDirection, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DatePickerKt$goToMonth$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            LazyListState lazyListState = this.$state;
            int i3 = this.$month;
            this.label = 1;
            if (LazyListState.animateScrollToItem$default(lazyListState, lazyListState.getFirstVisibleItemIndex() + i3, 0, this, 2, null) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        this.$focusManager.mo7869moveFocus3ESFkO8(this.$focusDirection);
        return ab.f48028a;
    }
}
