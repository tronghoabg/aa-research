package com.waze;

import com.waze.OfflineNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class jd {
    public static final int $stable = 0;

    static final void onCalendarUpdateProtobufJNI$lambda$0(jd jdVar, Object obj, String str) {
        h.g.b.x.d(jdVar, "null cannot be cast to non-null type com.waze.OfflineNativeManager");
        ((OfflineNativeManager) jdVar).onCalendarUpdateProtobuf(obj, str);
    }

    public void getCalendarUpdateProtobuf(OfflineNativeManager.CalendarUpdateProtobufListener calendarUpdateProtobufListener) {
        ((OfflineNativeManager) this).getCalendarUpdateProtobufNTV(calendarUpdateProtobufListener);
    }

    protected final String getInstallationUUIDJNI() {
        return ((OfflineNativeManager) this).getInstallationUUID();
    }

    protected final void onCalendarUpdateProtobufJNI(Object obj, String str) {
        NativeManager.runMainThreadTask(new ft(this, obj, str, 6));
    }
}
