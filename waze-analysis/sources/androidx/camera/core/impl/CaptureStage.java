package androidx.camera.core.impl;

import androidx.camera.core.impl.CaptureConfig;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CaptureStage {

    /* compiled from: WazeSource */
    public final class DefaultCaptureStage implements CaptureStage {
        private final CaptureConfig mCaptureConfig = new CaptureConfig.Builder().build();

        @Override // androidx.camera.core.impl.CaptureStage
        public CaptureConfig getCaptureConfig() {
            return this.mCaptureConfig;
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public int getId() {
            return 0;
        }
    }

    CaptureConfig getCaptureConfig();

    int getId();
}
