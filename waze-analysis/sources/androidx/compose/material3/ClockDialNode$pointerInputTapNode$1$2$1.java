package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
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
final class ClockDialNode$pointerInputTapNode$1$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Offset $it;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputTapNode$1$2$1(ClockDialNode clockDialNode, Offset offset, e<? super ClockDialNode$pointerInputTapNode$1$2$1> eVar) {
        super(2, eVar);
        this.this$0 = clockDialNode;
        this.$it = offset;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ClockDialNode$pointerInputTapNode$1$2$1(this.this$0, this.$it, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ClockDialNode$pointerInputTapNode$1$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            ClockDialNode clockDialNode = this.this$0;
            Offset offset = this.$it;
            AnalogTimePickerState analogTimePickerState = clockDialNode.state;
            long jM7990unboximpl = offset.m7990unboximpl() >> 32;
            Offset offset2 = this.$it;
            float fIntBitsToFloat = Float.intBitsToFloat((int) jM7990unboximpl);
            long jM7990unboximpl2 = offset2.m7990unboximpl() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            ClockDialNode clockDialNode2 = this.this$0;
            this.label = 1;
            if (TimePickerKt.m5885onTapuYHVD98(analogTimePickerState, fIntBitsToFloat, Float.intBitsToFloat((int) jM7990unboximpl2), clockDialNode2.getMaxDist(), clockDialNode2.autoSwitchToMinute, clockDialNode2.m4532getCenternOccac(), clockDialNode2.animationSpec, this) == aVar) {
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
