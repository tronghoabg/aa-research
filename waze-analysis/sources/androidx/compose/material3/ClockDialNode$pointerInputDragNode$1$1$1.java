package androidx.compose.material3;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ClockDialNode$pointerInputDragNode$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputDragNode$1$1$1(ClockDialNode clockDialNode, e<? super ClockDialNode$pointerInputDragNode$1$1$1> eVar) {
        super(2, eVar);
        this.this$0 = clockDialNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ClockDialNode$pointerInputDragNode$1$1$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ClockDialNode$pointerInputDragNode$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (this.this$0.autoSwitchToMinute) {
                this.this$0.state.mo4333setSelection6_8s6DQ(TimePickerSelectionMode.Companion.m5906getMinuteyecRtBI());
            }
            ClockDialNode clockDialNode = this.this$0;
            this.label = 1;
            if (clockDialNode.state.onGestureEnd(clockDialNode.animationSpec, this) == aVar) {
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
