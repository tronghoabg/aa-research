package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CaptureSequenceProcessorKt {
    private static final boolean REQUIRE_SURFACE_FOR_ALL_STREAMS = false;
    private static final kotlinx.a.b captureSequenceProcessorDebugIds = h.e.b.f(0);
    private static final kotlinx.a.c captureSequenceDebugIds = h.e.b.g(0);
    private static final kotlinx.a.c requestTags = h.e.b.g(0);

    public static final kotlinx.a.c getCaptureSequenceDebugIds() {
        return captureSequenceDebugIds;
    }

    public static final kotlinx.a.b getCaptureSequenceProcessorDebugIds() {
        return captureSequenceProcessorDebugIds;
    }

    public static final kotlinx.a.c getRequestTags() {
        return requestTags;
    }

    public static final long nextRequestNumber() {
        return requestTags.e();
    }
}
