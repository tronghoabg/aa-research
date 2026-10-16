package androidx.media3.common;

import android.util.Pair;
import androidx.media3.common.util.Size;
import j$.util.Objects;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface VideoCompositorSettings {
    public static final VideoCompositorSettings DEFAULT = new VideoCompositorSettings() { // from class: androidx.media3.common.VideoCompositorSettings.1
        @Override // androidx.media3.common.VideoCompositorSettings
        public Size getOutputSize(List<Size> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.VideoCompositorSettings
        public OverlaySettings getOverlaySettings(int i2, long j2) {
            return new OverlaySettings(this) { // from class: androidx.media3.common.VideoCompositorSettings.1.1
                {
                    Objects.requireNonNull(this);
                }

                @Override // androidx.media3.common.OverlaySettings
                public /* synthetic */ float getAlphaScale() {
                    return 1.0f;
                }

                @Override // androidx.media3.common.OverlaySettings
                public /* synthetic */ Pair getBackgroundFrameAnchor() {
                    return OverlaySettings.DEFAULT_BACKGROUND_FRAME_ANCHOR;
                }

                @Override // androidx.media3.common.OverlaySettings
                public /* synthetic */ float getHdrLuminanceMultiplier() {
                    return 1.0f;
                }

                @Override // androidx.media3.common.OverlaySettings
                public /* synthetic */ Pair getOverlayFrameAnchor() {
                    return OverlaySettings.DEFAULT_OVERLAY_FRAME_ANCHOR;
                }

                @Override // androidx.media3.common.OverlaySettings
                public /* synthetic */ float getRotationDegrees() {
                    return 0.0f;
                }

                @Override // androidx.media3.common.OverlaySettings
                public /* synthetic */ Pair getScale() {
                    return OverlaySettings.DEFAULT_SCALE;
                }
            };
        }
    };

    Size getOutputSize(List<Size> list);

    OverlaySettings getOverlaySettings(int i2, long j2);
}
