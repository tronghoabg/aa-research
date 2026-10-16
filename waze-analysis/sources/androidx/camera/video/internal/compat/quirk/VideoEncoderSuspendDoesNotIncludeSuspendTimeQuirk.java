package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk implements Quirk {
    static boolean load() {
        "Samsung".equalsIgnoreCase(Build.BRAND);
        return false;
    }
}
