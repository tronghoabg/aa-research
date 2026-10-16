package androidx.camera.video.internal.encoder;

import android.util.Range;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwappedVideoEncoderInfo implements VideoEncoderInfo {
    private final VideoEncoderInfo videoEncoderInfo;

    public SwappedVideoEncoderInfo(VideoEncoderInfo videoEncoderInfo) {
        x.f(videoEncoderInfo, "videoEncoderInfo");
        this.videoEncoderInfo = videoEncoderInfo;
        if (!videoEncoderInfo.canSwapWidthHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return this.videoEncoderInfo.canSwapWidthHeight();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.videoEncoderInfo.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getMime() {
        return this.videoEncoderInfo.getMime();
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        return this.videoEncoderInfo.getName();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedBitrateRange() {
        return this.videoEncoderInfo.getSupportedBitrateRange();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeights() {
        return this.videoEncoderInfo.getSupportedWidths();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeightsFor(int i2) {
        return this.videoEncoderInfo.getSupportedWidthsFor(i2);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidths() {
        return this.videoEncoderInfo.getSupportedHeights();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidthsFor(int i2) {
        return this.videoEncoderInfo.getSupportedHeightsFor(i2);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.videoEncoderInfo.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i2, int i3) {
        return this.videoEncoderInfo.isSizeSupported(i3, i2);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupportedAllowSwapping(int i2, int i3) {
        return this.videoEncoderInfo.isSizeSupportedAllowSwapping(i3, i2);
    }
}
