package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.ProfileAwareVideoEncoderInfo;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoEncoderInfoImpl extends EncoderInfoImpl implements VideoEncoderInfo {
    public static final Companion Companion = new Companion(null);
    public static final VideoEncoderInfo.Finder FINDER = new VideoEncoderInfo.Finder() { // from class: androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0
        @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo.Finder
        public final VideoEncoderInfo find(String str) {
            return VideoEncoderInfoImpl.FINDER$lambda$0(str);
        }
    };
    private static final String TAG = "VideoEncoderInfoImpl";
    private final MediaCodecInfo.VideoCapabilities videoCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        x.f(mediaCodecInfo, "codecInfo");
        x.f(str, "mime");
        MediaCodecInfo.VideoCapabilities videoCapabilities = getCodecCapabilities().getVideoCapabilities();
        x.c(videoCapabilities);
        this.videoCapabilities = videoCapabilities;
    }

    static final VideoEncoderInfo FINDER$lambda$0(String str) {
        x.f(str, "mimeType");
        try {
            return ProfileAwareVideoEncoderInfo.Companion.from(new VideoEncoderInfoImpl(CodecUtil.findCodecAndGetCodecInfo(str), str));
        } catch (InvalidConfigException e2) {
            Logger.w(TAG, "Unable to find a VideoEncoderInfoImpl", e2);
            return null;
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean canSwapWidthHeight() {
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getHeightAlignment() {
        return this.videoCapabilities.getHeightAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedBitrateRange() {
        Range<Integer> bitrateRange = this.videoCapabilities.getBitrateRange();
        x.e(bitrateRange, "getBitrateRange(...)");
        return bitrateRange;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeights() {
        Range<Integer> supportedHeights = this.videoCapabilities.getSupportedHeights();
        x.e(supportedHeights, "getSupportedHeights(...)");
        return supportedHeights;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedHeightsFor(int i2) {
        try {
            Range<Integer> supportedHeightsFor = this.videoCapabilities.getSupportedHeightsFor(i2);
            x.c(supportedHeightsFor);
            return supportedHeightsFor;
        } catch (Throwable th) {
            throw Companion.toIllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidths() {
        Range<Integer> supportedWidths = this.videoCapabilities.getSupportedWidths();
        x.e(supportedWidths, "getSupportedWidths(...)");
        return supportedWidths;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public Range<Integer> getSupportedWidthsFor(int i2) {
        try {
            Range<Integer> supportedWidthsFor = this.videoCapabilities.getSupportedWidthsFor(i2);
            x.c(supportedWidthsFor);
            return supportedWidthsFor;
        } catch (Throwable th) {
            throw Companion.toIllegalArgumentException(th);
        }
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public int getWidthAlignment() {
        return this.videoCapabilities.getWidthAlignment();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public boolean isSizeSupported(int i2, int i3) {
        return this.videoCapabilities.isSizeSupported(i2, i3);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    public /* synthetic */ boolean isSizeSupportedAllowSwapping(int i2, int i3) {
        return VideoEncoderInfo.CC.$default$isSizeSupportedAllowSwapping(this, i2, i3);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IllegalArgumentException toIllegalArgumentException(Throwable th) {
            IllegalArgumentException illegalArgumentException = th instanceof IllegalArgumentException ? (IllegalArgumentException) th : null;
            return illegalArgumentException == null ? new IllegalArgumentException(th) : illegalArgumentException;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
