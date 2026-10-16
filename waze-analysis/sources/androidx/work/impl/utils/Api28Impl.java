package androidx.work.impl.utils;

import android.app.Application;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final String getProcessName() {
        String processName = Application.getProcessName();
        x.e(processName, "getProcessName(...)");
        return processName;
    }
}
