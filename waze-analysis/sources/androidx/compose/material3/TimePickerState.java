package androidx.compose.material3;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TimePickerState {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.TimePickerState$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setHourInput(TimePickerState timePickerState, int i2) {
            if (i2 < 0 || i2 >= 24) {
                return;
            }
            timePickerState.setHour(i2);
        }

        public static void $default$setMinuteInput(TimePickerState timePickerState, int i2) {
            if (i2 < 0 || i2 >= 60) {
                return;
            }
            timePickerState.setMinute(i2);
        }
    }

    int getHour();

    int getHourInput();

    int getMinute();

    int getMinuteInput();

    /* renamed from: getSelection-yecRtBI */
    int mo4331getSelectionyecRtBI();

    boolean is24hour();

    void set24hour(boolean z);

    void setHour(int i2);

    void setHourInput(int i2);

    void setMinute(int i2);

    void setMinuteInput(int i2);

    /* renamed from: setSelection-6_8s6DQ */
    void mo4333setSelection6_8s6DQ(int i2);
}
