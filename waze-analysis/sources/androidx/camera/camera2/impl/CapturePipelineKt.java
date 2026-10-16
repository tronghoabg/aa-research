package androidx.camera.camera2.impl;

import androidx.media3.common.C;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineKt {
    private static final long CHECK_3A_TIMEOUT_IN_NS;
    private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
    private static final long CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS;
    private static final long CHECK_FLASH_REQUIRED_TIMEOUT_IN_NS;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CHECK_FLASH_REQUIRED_TIMEOUT_IN_NS = C.NANOS_PER_SECOND;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        CHECK_3A_TIMEOUT_IN_NS = C.NANOS_PER_SECOND;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = 5000000000L;
        TimeUnit timeUnit4 = TimeUnit.SECONDS;
        CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS = 2000000000L;
    }
}
