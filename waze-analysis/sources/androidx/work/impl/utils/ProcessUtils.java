package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ProcessUtils {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ProcessUtils");
        x.e(strTagWithPrefix, "tagWithPrefix(...)");
        TAG = strTagWithPrefix;
    }

    private static final String getProcessName(Context context) {
        return Api28Impl.INSTANCE.getProcessName();
    }

    public static final boolean isDefaultProcess(Context context, Configuration configuration) {
        x.f(context, "context");
        x.f(configuration, "configuration");
        String processName = getProcessName(context);
        String defaultProcessName = configuration.getDefaultProcessName();
        return (defaultProcessName == null || defaultProcessName.length() == 0) ? x.n(processName, context.getApplicationInfo().processName) : x.n(processName, configuration.getDefaultProcessName());
    }
}
