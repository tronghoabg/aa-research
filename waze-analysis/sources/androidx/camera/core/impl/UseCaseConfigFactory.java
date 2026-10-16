package androidx.camera.core.impl;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface UseCaseConfigFactory {
    public static final UseCaseConfigFactory EMPTY_INSTANCE = new UseCaseConfigFactory() { // from class: androidx.camera.core.impl.UseCaseConfigFactory.1
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public Config getConfig(CaptureType captureType, int i2) {
            return null;
        }
    };

    /* compiled from: WazeSource */
    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    /* compiled from: WazeSource */
    public interface Provider {
        UseCaseConfigFactory newInstance(Context context, boolean z);
    }

    Config getConfig(CaptureType captureType, int i2);
}
