package androidx.compose.material3;

import androidx.compose.animation.core.SnapSpec;
import androidx.compose.runtime.MutableState;
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
final class TimePickerKt$ClockText$onClockTextClick$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ MutableState<Offset> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ MutableState<IntOffset> $parentCenter$delegate;
    final /* synthetic */ AnalogTimePickerState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimePickerKt$ClockText$onClockTextClick$1$1$1(AnalogTimePickerState analogTimePickerState, float f2, boolean z, MutableState<Offset> mutableState, MutableState<IntOffset> mutableState2, e<? super TimePickerKt$ClockText$onClockTextClick$1$1$1> eVar) {
        super(2, eVar);
        this.$state = analogTimePickerState;
        this.$maxDist = f2;
        this.$autoSwitchToMinute = z;
        this.$center$delegate = mutableState;
        this.$parentCenter$delegate = mutableState2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TimePickerKt$ClockText$onClockTextClick$1$1$1(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, this.$parentCenter$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TimePickerKt$ClockText$onClockTextClick$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            AnalogTimePickerState analogTimePickerState = this.$state;
            long jClockText$lambda$2 = TimePickerKt.ClockText$lambda$2(this.$center$delegate) >> 32;
            MutableState<Offset> mutableState = this.$center$delegate;
            float fIntBitsToFloat = Float.intBitsToFloat((int) jClockText$lambda$2);
            long jClockText$lambda$22 = TimePickerKt.ClockText$lambda$2(mutableState) & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
            float f2 = this.$maxDist;
            boolean z = this.$autoSwitchToMinute;
            MutableState<IntOffset> mutableState2 = this.$parentCenter$delegate;
            this.label = 1;
            if (TimePickerKt.m5885onTapuYHVD98(analogTimePickerState, fIntBitsToFloat, Float.intBitsToFloat((int) jClockText$lambda$22), f2, z, TimePickerKt.ClockText$lambda$5(mutableState2), new SnapSpec(0, 1, null), this) == aVar) {
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
