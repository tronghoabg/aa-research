package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GLProcessingStuckOnCodecFlushQuirk implements Quirk {
    public static final GLProcessingStuckOnCodecFlushQuirk INSTANCE = new GLProcessingStuckOnCodecFlushQuirk();

    private GLProcessingStuckOnCodecFlushQuirk() {
    }

    private final boolean isPositivoTwist2Pro() {
        return o.m("positivo", Build.BRAND, true) && o.m("twist 2 pro", Build.MODEL, true);
    }

    public static final boolean load() {
        return INSTANCE.isPositivoTwist2Pro();
    }
}
