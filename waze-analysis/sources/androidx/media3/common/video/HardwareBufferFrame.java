package androidx.media3.common.video;

import android.hardware.HardwareBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface HardwareBufferFrame extends Frame {

    /* compiled from: WazeSource */
    public interface Builder {
        HardwareBufferFrame build();

        Builder setContentTimeUs(long j2);

        Builder setMetadata(Map<String, Object> map);
    }

    Builder buildUpon();

    HardwareBuffer getHardwareBuffer();
}
