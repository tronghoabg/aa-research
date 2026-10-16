package androidx.datastore.core.util;

import android.content.Context;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DirectBootUtil_androidKt {
    public static final Context requireDeviceProtectedStorageContext(Context context) {
        x.f(context, "<this>");
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        x.c(contextCreateDeviceProtectedStorageContext);
        return contextCreateDeviceProtectedStorageContext;
    }
}
