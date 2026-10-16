package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.core.util.Supplier;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoEncoderConfigVideoProfileResolver implements Supplier<VideoEncoderConfig> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VidEncVdPrflRslvr";
    private final DynamicRange dynamicRange;
    private final Range<Integer> expectedFrameRateRange;
    private final Timebase inputTimebase;
    private final String mimeType;
    private final Size surfaceSize;
    private final EncoderProfilesProxy.VideoProfileProxy videoProfile;
    private final VideoSpec videoSpec;

    public VideoEncoderConfigVideoProfileResolver(String str, Timebase timebase, VideoSpec videoSpec, Size size, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, DynamicRange dynamicRange, Range<Integer> range) {
        x.f(str, "mimeType");
        x.f(timebase, "inputTimebase");
        x.f(videoSpec, "videoSpec");
        x.f(size, "surfaceSize");
        x.f(videoProfileProxy, "videoProfile");
        x.f(dynamicRange, "dynamicRange");
        x.f(range, "expectedFrameRateRange");
        this.mimeType = str;
        this.inputTimebase = timebase;
        this.videoSpec = videoSpec;
        this.surfaceSize = size;
        this.videoProfile = videoProfileProxy;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public VideoEncoderConfig get() {
        CaptureEncodeRates captureEncodeRatesResolveFrameRates$camera_video = VideoConfigUtil.INSTANCE.resolveFrameRates$camera_video(this.videoSpec, this.expectedFrameRateRange);
        Logger.d(TAG, "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesResolveFrameRates$camera_video.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesResolveFrameRates$camera_video.getEncodeRate() + "fps.");
        int bitrate = this.videoSpec.getBitrate();
        if (bitrate == 0) {
            Logger.d(TAG, "Using resolved VIDEO bitrate from EncoderProfiles");
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.videoProfile;
            DynamicRange dynamicRange = this.dynamicRange;
            int bitrate2 = videoProfileProxy.getBitrate();
            int bitDepth = dynamicRange.getBitDepth();
            int bitDepth2 = videoProfileProxy.getBitDepth();
            int encodeRate = captureEncodeRatesResolveFrameRates$camera_video.getEncodeRate();
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy2 = this.videoProfile;
            Size size = this.surfaceSize;
            bitrate = VideoConfigUtil.scaleBitrate(bitrate2, bitDepth, bitDepth2, encodeRate, videoProfileProxy2.getFrameRate(), size.getWidth(), videoProfileProxy2.getWidth(), size.getHeight(), videoProfileProxy2.getHeight());
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy3 = this.videoProfile;
        String str = this.mimeType;
        int profile = videoProfileProxy3.getProfile();
        VideoEncoderDataSpace videoEncoderDataSpaceMimeAndProfileToEncoderDataSpace = VideoConfigUtil.INSTANCE.mimeAndProfileToEncoderDataSpace(str, profile);
        String str2 = this.mimeType;
        VideoEncoderConfig.Builder builder = VideoEncoderConfig.builder();
        builder.setMimeType(str2);
        builder.setInputTimebase(this.inputTimebase);
        builder.setResolution(this.surfaceSize);
        builder.setBitrate(bitrate);
        builder.setCaptureFrameRate(captureEncodeRatesResolveFrameRates$camera_video.getCaptureRate());
        builder.setEncodeFrameRate(captureEncodeRatesResolveFrameRates$camera_video.getEncodeRate());
        builder.setProfile(profile);
        builder.setDataSpace(videoEncoderDataSpaceMimeAndProfileToEncoderDataSpace);
        VideoEncoderConfig videoEncoderConfigBuild = builder.build();
        x.e(videoEncoderConfigBuild, "build(...)");
        return videoEncoderConfigBuild;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
