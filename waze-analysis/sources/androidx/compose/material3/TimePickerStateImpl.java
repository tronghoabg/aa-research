package androidx.compose.material3;

import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TimePickerStateImpl implements TimePickerState {
    public static final Companion Companion = new Companion(null);
    private final MutableIntState hourInputState;
    private final MutableIntState hourState;
    private boolean is24hour;
    private final MutableIntState minuteInputState;
    private final MutableIntState minuteState;
    private final MutableState selection$delegate;

    public TimePickerStateImpl(int i2, int i3, boolean z) {
        if (i2 < 0 || i2 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i3 < 0 || i3 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.is24hour = z;
        this.selection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TimePickerSelectionMode.m5898boximpl(TimePickerSelectionMode.Companion.m5905getHouryecRtBI()), null, 2, null);
        this.hourState = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.minuteState = SnapshotIntStateKt.mutableIntStateOf(i3);
        this.hourInputState = SnapshotIntStateKt.mutableIntStateOf(i2);
        this.minuteInputState = SnapshotIntStateKt.mutableIntStateOf(i3);
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.hourState.getIntValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHourInput() {
        return this.hourInputState.getIntValue();
    }

    public final MutableIntState getHourInputState() {
        return this.hourInputState;
    }

    public final MutableIntState getHourState() {
        return this.hourState;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.minuteState.getIntValue();
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinuteInput() {
        return this.minuteInputState.getIntValue();
    }

    public final MutableIntState getMinuteInputState() {
        return this.minuteInputState;
    }

    public final MutableIntState getMinuteState() {
        return this.minuteState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: getSelection-yecRtBI */
    public int mo4331getSelectionyecRtBI() {
        return ((TimePickerSelectionMode) this.selection$delegate.getValue()).m5904unboximpl();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.is24hour;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z) {
        this.is24hour = z;
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i2) {
        this.hourState.setIntValue(i2);
        this.hourInputState.setIntValue(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHourInput(int i2) {
        TimePickerState.CC.$default$setHourInput(this, i2);
        this.hourInputState.setIntValue(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i2) {
        this.minuteState.setIntValue(i2);
        this.minuteInputState.setIntValue(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinuteInput(int i2) {
        TimePickerState.CC.$default$setMinuteInput(this, i2);
        this.minuteInputState.setIntValue(i2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* renamed from: setSelection-6_8s6DQ */
    public void mo4333setSelection6_8s6DQ(int i2) {
        this.selection$delegate.setValue(TimePickerSelectionMode.m5898boximpl(i2));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final TimePickerStateImpl Saver$lambda$1(List list) {
            Object obj = list.get(0);
            x.d(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            x.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = list.get(2);
            x.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new TimePickerStateImpl(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
        }

        public final Saver<TimePickerStateImpl, ?> Saver() {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    TimePickerStateImpl timePickerStateImpl = (TimePickerStateImpl) obj2;
                    return i.i(Integer.valueOf(timePickerStateImpl.getHour()), Integer.valueOf(timePickerStateImpl.getMinute()), Boolean.valueOf(timePickerStateImpl.is24hour()));
                }
            }, new l() { // from class: androidx.compose.material3.TimePickerStateImpl$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TimePickerStateImpl.Companion.Saver$lambda$1((List) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
