package androidx.compose.material3;

import androidx.compose.ui.node.Ref;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimePickerKt$TimePicker$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ AnalogTimePickerState $analogState;
    final /* synthetic */ TimePickerState $state;
    final /* synthetic */ Ref<Boolean> $userOverride;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimePicker$1$1(Ref<Boolean> ref, AnalogTimePickerState analogTimePickerState, TimePickerState timePickerState, e<? super TimePickerKt$TimePicker$1$1> eVar) {
        super(2, eVar);
        this.$userOverride = ref;
        this.$analogState = analogTimePickerState;
        this.$state = timePickerState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TimePickerKt$TimePicker$1$1(this.$userOverride, this.$analogState, this.$state, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TimePickerKt$TimePicker$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (x.n(this.$userOverride.getValue(), true)) {
            this.$analogState.setHour(this.$state.getHour());
            this.$analogState.setMinute(this.$state.getMinute());
        }
        this.$userOverride.setValue(true);
        return ab.f48028a;
    }
}
