package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimePickerKt$TimePickerTextField$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ int $selection;
    final /* synthetic */ TimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerKt$TimePickerTextField$2$1(TimePickerState timePickerState, int i2, FocusRequester focusRequester, e<? super TimePickerKt$TimePickerTextField$2$1> eVar) {
        super(2, eVar);
        this.$state = timePickerState;
        this.$selection = i2;
        this.$focusRequester = focusRequester;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TimePickerKt$TimePickerTextField$2$1(this.$state, this.$selection, this.$focusRequester, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TimePickerKt$TimePickerTextField$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        TimePickerState timePickerState = this.$state;
        if (TimePickerSelectionMode.m5901equalsimpl0(timePickerState.mo4331getSelectionyecRtBI(), this.$selection)) {
            FocusRequester.m7885requestFocus3ESFkO8$default(this.$focusRequester, 0, 1, null);
        }
        return ab.f48028a;
    }
}
