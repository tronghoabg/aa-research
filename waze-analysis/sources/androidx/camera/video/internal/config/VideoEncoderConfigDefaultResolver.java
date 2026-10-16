package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.core.util.Supplier;
import com.waze.strings.DisplayStrings;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoEncoderConfigDefaultResolver implements Supplier<VideoEncoderConfig> {
    private static final String TAG = "VidEncCfgDefaultRslvr";
    private static final int VIDEO_BITRATE_BASE = 14000000;
    private static final int VIDEO_BIT_DEPTH_BASE = 8;
    private static final int VIDEO_FRAME_RATE_BASE = 30;
    private final DynamicRange dynamicRange;
    private final Range<Integer> expectedFrameRateRange;
    private final Timebase inputTimebase;
    private final String mimeType;
    private final Size surfaceSize;
    private final VideoSpec videoSpec;
    public static final Companion Companion = new Companion(null);
    private static final Size VIDEO_SIZE_BASE = new Size(DisplayStrings.DS_LOCATION_PREVIEW_TEMPORARILY_CLOSED, DisplayStrings.DS_KM_PD);

    public VideoEncoderConfigDefaultResolver(String str, Timebase timebase, VideoSpec videoSpec, Size size, DynamicRange dynamicRange, Range<Integer> range) {
        x.f(str, "mimeType");
        x.f(timebase, "inputTimebase");
        x.f(videoSpec, "videoSpec");
        x.f(size, "surfaceSize");
        x.f(dynamicRange, "dynamicRange");
        x.f(range, "expectedFrameRateRange");
        this.mimeType = str;
        this.inputTimebase = timebase;
        this.videoSpec = videoSpec;
        this.surfaceSize = size;
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
            Logger.d(TAG, "Using fallback VIDEO bitrate");
            int bitDepth = this.dynamicRange.getBitDepth();
            int encodeRate = captureEncodeRatesResolveFrameRates$camera_video.getEncodeRate();
            int width = this.surfaceSize.getWidth();
            Size size = VIDEO_SIZE_BASE;
            bitrate = VideoConfigUtil.scaleBitrate(VIDEO_BITRATE_BASE, bitDepth, 8, encodeRate, 30, width, size.getWidth(), this.surfaceSize.getHeight(), size.getHeight());
        }
        String str = this.mimeType;
        int iDynamicRangeToCodecProfileLevelForMime = DynamicRangeUtil.dynamicRangeToCodecProfileLevelForMime(str, this.dynamicRange);
        VideoEncoderDataSpace videoEncoderDataSpaceMimeAndProfileToEncoderDataSpace = VideoConfigUtil.INSTANCE.mimeAndProfileToEncoderDataSpace(str, iDynamicRangeToCodecProfileLevelForMime);
        String str2 = this.mimeType;
        VideoEncoderConfig.Builder builder = VideoEncoderConfig.builder();
        builder.setMimeType(str2);
        builder.setInputTimebase(this.inputTimebase);
        builder.setResolution(this.surfaceSize);
        builder.setBitrate(bitrate);
        builder.setCaptureFrameRate(captureEncodeRatesResolveFrameRates$camera_video.getCaptureRate());
        builder.setEncodeFrameRate(captureEncodeRatesResolveFrameRates$camera_video.getEncodeRate());
        builder.setProfile(iDynamicRangeToCodecProfileLevelForMime);
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
