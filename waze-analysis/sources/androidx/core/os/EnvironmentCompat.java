package androidx.core.os;

import android.os.Environment;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class EnvironmentCompat {

    @Deprecated
    public static final String MEDIA_UNKNOWN = "unknown";

    private EnvironmentCompat() {
    }

    public static String getStorageState(File file) {
        return Environment.getExternalStorageState(file);
    }
}
