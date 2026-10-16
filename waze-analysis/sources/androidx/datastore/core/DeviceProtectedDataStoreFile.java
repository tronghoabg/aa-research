package androidx.datastore.core;

import android.content.Context;
import androidx.datastore.core.util.DirectBootUtil_androidKt;
import h.g.b.x;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DeviceProtectedDataStoreFile {
    public static final File deviceProtectedDataStoreFile(Context context, String str) {
        x.f(context, "<this>");
        x.f(str, "fileName");
        return new File(DirectBootUtil_androidKt.requireDeviceProtectedStorageContext(context).getFilesDir(), "datastore/".concat(String.valueOf(str)));
    }
}
