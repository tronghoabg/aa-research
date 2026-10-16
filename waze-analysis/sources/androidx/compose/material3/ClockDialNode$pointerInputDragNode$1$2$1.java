package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ClockDialNode$pointerInputDragNode$1$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Offset $dragAmount;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputDragNode$1$2$1(ClockDialNode clockDialNode, Offset offset, e<? super ClockDialNode$pointerInputDragNode$1$2$1> eVar) {
        super(2, eVar);
        this.this$0 = clockDialNode;
        this.$dragAmount = offset;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ClockDialNode$pointerInputDragNode$1$2$1(this.this$0, this.$dragAmount, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ClockDialNode$pointerInputDragNode$1$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.this$0.offsetX += Float.intBitsToFloat((int) (this.$dragAmount.m7990unboximpl() >> 32));
            this.this$0.offsetY += Float.intBitsToFloat((int) (this.$dragAmount.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            ClockDialNode clockDialNode = this.this$0;
            AnalogTimePickerState analogTimePickerState = clockDialNode.state;
            float fM11297getYimpl = clockDialNode.offsetY - IntOffset.m11297getYimpl(clockDialNode.m4532getCenternOccac());
            float fM11296getXimpl = this.this$0.offsetX - IntOffset.m11296getXimpl(r11.m4532getCenternOccac());
            ClockDialNode clockDialNode2 = this.this$0;
            this.label = 1;
            if (analogTimePickerState.rotateTo(TimePickerKt.atan(fM11297getYimpl, fM11296getXimpl), clockDialNode2.animationSpec, false & ((4 & 4) == 0), this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        AnalogTimePickerState analogTimePickerState2 = this.this$0.state;
        ClockDialNode clockDialNode3 = this.this$0;
        TimePickerKt.m5883moveSelectord3b8Pxo(analogTimePickerState2, clockDialNode3.offsetX, clockDialNode3.offsetY, clockDialNode3.getMaxDist(), clockDialNode3.m4532getCenternOccac());
        return ab.f48028a;
    }
}
