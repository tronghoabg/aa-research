package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.Metadata;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeKeys {
    public static final int CAMERA2_EXTENSION_MODE_AUTOMATIC = 0;
    public static final int CAMERA2_EXTENSION_MODE_BOKEH = 2;
    public static final int CAMERA2_EXTENSION_MODE_FACE_RETOUCH = 1;
    public static final int CAMERA2_EXTENSION_MODE_HDR = 3;
    public static final int CAMERA2_EXTENSION_MODE_NIGHT = 4;
    public static final CameraPipeKeys INSTANCE = new CameraPipeKeys();
    private static final Metadata.Key<Object> camera2CaptureRequestTag;
    private static final Metadata.Key<Integer> camera2ExtensionMode;
    private static final Metadata.Key<Boolean> ignore3ARequiredParameters;

    static {
        Metadata.Key.Companion companion = Metadata.Key.Companion;
        int i2 = ar.f48106a;
        camera2ExtensionMode = companion.create("androidx.camera.camera2.pipe.extensionMode", new m(Integer.class));
        camera2CaptureRequestTag = Metadata.Key.Companion.create("androidx.camera.camera2.pipe.captureRequestTag", new m(Object.class));
        ignore3ARequiredParameters = Metadata.Key.Companion.create("androidx.camera.camera2.pipe.ignore3ARequiredParameters", new m(Boolean.class));
    }

    private CameraPipeKeys() {
    }

    public final Metadata.Key<Object> getCamera2CaptureRequestTag() {
        return camera2CaptureRequestTag;
    }

    public final Metadata.Key<Integer> getCamera2ExtensionMode() {
        return camera2ExtensionMode;
    }

    public final Metadata.Key<Boolean> getIgnore3ARequiredParameters() {
        return ignore3ARequiredParameters;
    }
}
