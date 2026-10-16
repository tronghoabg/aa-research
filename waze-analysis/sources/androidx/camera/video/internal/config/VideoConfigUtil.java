package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaConstants;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderDataSpace;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.media3.common.MimeTypes;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoConfigUtil {
    public static final VideoConfigUtil INSTANCE = new VideoConfigUtil();
    private static final Map<String, Map<Integer, VideoEncoderDataSpace>> MIME_TO_DATA_SPACE_MAP;
    private static final String TAG = "VideoConfigUtil";
    private static final String VIDEO_ENCODER_MIME_MPEG4_DEFAULT = "video/avc";
    private static final String VIDEO_ENCODER_MIME_WEBM_DEFAULT = "video/x-vnd.on2.vp8";
    public static final int VIDEO_FRAME_RATE_FIXED_DEFAULT = 30;

    static {
        Map mapK = r.k(new k(1, VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED), new k(2, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG), new k(4096, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ), new k(8192, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ));
        VideoEncoderDataSpace videoEncoderDataSpace = VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ;
        MIME_TO_DATA_SPACE_MAP = r.m(new k(MimeTypes.VIDEO_H265, mapK), new k(MimeTypes.VIDEO_AV1, r.k(new k(1, VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED), new k(2, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG), new k(4096, videoEncoderDataSpace), new k(8192, videoEncoderDataSpace))), new k(MimeTypes.VIDEO_VP9, r.k(new k(1, VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED), new k(4, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG), new k(4096, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ), new k(16384, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ), new k(2, VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED), new k(8, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG), new k(8192, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ), new k(32768, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_PQ))), new k(MimeTypes.VIDEO_DOLBY_VISION, r.k(new k(256, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT2020_HLG), new k(512, VideoEncoderDataSpace.ENCODER_DATA_SPACE_BT709))));
    }

    private VideoConfigUtil() {
    }

    public static final VideoEncoderConfig resolveVideoEncoderConfig(VideoMimeInfo videoMimeInfo, Timebase timebase, VideoSpec videoSpec, Size size, DynamicRange dynamicRange, Range<Integer> range) {
        x.f(videoMimeInfo, "videoMimeInfo");
        x.f(timebase, "inputTimebase");
        x.f(videoSpec, "videoSpec");
        x.f(size, "surfaceSize");
        x.f(dynamicRange, "dynamicRange");
        x.f(range, "expectedFrameRateRange");
        Object obj = (videoMimeInfo.getCompatibleVideoProfile() != null ? new VideoEncoderConfigVideoProfileResolver(videoMimeInfo.getMimeType(), timebase, videoSpec, size, videoMimeInfo.getCompatibleVideoProfile(), dynamicRange, range) : new VideoEncoderConfigDefaultResolver(videoMimeInfo.getMimeType(), timebase, videoSpec, size, dynamicRange, range)).get();
        x.e(obj, "get(...)");
        return (VideoEncoderConfig) obj;
    }

    public static final int scaleBitrate(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        String str;
        int iDoubleValue = (int) (i2 * new Rational(i3, i4).doubleValue() * new Rational(i5, i6).doubleValue() * new Rational(i7, i8).doubleValue() * new Rational(i9, i10).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            str = "Base Bitrate(" + i2 + "bps) * Bit Depth Ratio (" + i3 + " / " + i4 + ") * Frame Rate Ratio(" + i5 + " / " + i6 + ") * Width Ratio(" + i7 + " / " + i8 + ") * Height Ratio(" + i9 + " / " + i10 + ") = " + iDoubleValue;
        } else {
            str = "";
        }
        Logger.d(TAG, str);
        return iDoubleValue;
    }

    public static final VideoEncoderConfig workaroundDataSpaceIfRequired(VideoEncoderConfig videoEncoderConfig, boolean z) {
        x.f(videoEncoderConfig, "config");
        if (!x.n(videoEncoderConfig.getDataSpace(), VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED)) {
            return videoEncoderConfig;
        }
        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) DeviceQuirks.get(MediaCodecDefaultDataSpaceQuirk.class);
        if (!z || mediaCodecDefaultDataSpaceQuirk == null) {
            return videoEncoderConfig;
        }
        VideoEncoderDataSpace suggestedDataSpace = mediaCodecDefaultDataSpaceQuirk.getSuggestedDataSpace();
        x.e(suggestedDataSpace, "getSuggestedDataSpace(...)");
        VideoEncoderConfig videoEncoderConfigBuild = videoEncoderConfig.toBuilder().setDataSpace(suggestedDataSpace).build();
        x.e(videoEncoderConfigBuild, "build(...)");
        return videoEncoderConfigBuild;
    }

    public final String getDynamicRangeDefaultMime(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        int encoding = dynamicRange.getEncoding();
        if (encoding == 1) {
            return "video/avc";
        }
        if (encoding == 3 || encoding == 4 || encoding == 5) {
            return MimeTypes.VIDEO_H265;
        }
        if (encoding != 6) {
            return null;
        }
        return MimeTypes.VIDEO_DOLBY_VISION;
    }

    public final Set<DynamicRange> getDynamicRangesForMime(String str) {
        x.f(str, "mime");
        return DynamicRangeFormatComboRegistry.INSTANCE.getDynamicRangesForVideoMime(str);
    }

    public final VideoEncoderDataSpace mimeAndProfileToEncoderDataSpace(String str, int i2) {
        VideoEncoderDataSpace videoEncoderDataSpace;
        x.f(str, "mimeType");
        Map<Integer, VideoEncoderDataSpace> map = MIME_TO_DATA_SPACE_MAP.get(str);
        if (map != null && (videoEncoderDataSpace = map.get(Integer.valueOf(i2))) != null) {
            return videoEncoderDataSpace;
        }
        Logger.w(TAG, "Unsupported mime type " + str + " or profile level " + i2 + ". Data space is unspecified.");
        VideoEncoderDataSpace videoEncoderDataSpace2 = VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED;
        x.e(videoEncoderDataSpace2, "ENCODER_DATA_SPACE_UNSPECIFIED");
        return videoEncoderDataSpace2;
    }

    public final String outputFormatToVideoMime(int i2) {
        return i2 == 1 ? "video/x-vnd.on2.vp8" : "video/avc";
    }

    public final EncoderProfilesProxy.VideoProfileProxy resolveCompatibleVideoProfile(String str, DynamicRange dynamicRange, List<? extends EncoderProfilesProxy.VideoProfileProxy> list) {
        Object next;
        x.f(str, "videoMime");
        x.f(dynamicRange, "dynamicRange");
        x.f(list, "videoProfiles");
        Set<Integer> setDynamicRangeToVideoProfileHdrFormats = DynamicRangeUtil.dynamicRangeToVideoProfileHdrFormats(dynamicRange);
        x.e(setDynamicRangeToVideoProfileHdrFormats, "dynamicRangeToVideoProfileHdrFormats(...)");
        Set<Integer> setDynamicRangeToVideoProfileBitDepth = DynamicRangeUtil.dynamicRangeToVideoProfileBitDepth(dynamicRange);
        x.e(setDynamicRangeToVideoProfileBitDepth, "dynamicRangeToVideoProfileBitDepth(...)");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) next;
            if (setDynamicRangeToVideoProfileHdrFormats.contains(Integer.valueOf(videoProfileProxy.getHdrFormat())) && setDynamicRangeToVideoProfileBitDepth.contains(Integer.valueOf(videoProfileProxy.getBitDepth())) && (x.n(str, MediaConstants.MIME_TYPE_UNSPECIFIED) || x.n(videoProfileProxy.getMediaType(), str))) {
                break;
            }
        }
        return (EncoderProfilesProxy.VideoProfileProxy) next;
    }

    public final CaptureEncodeRates resolveFrameRates$camera_video(VideoSpec videoSpec, Range<Integer> range) {
        int iIntValue;
        x.f(videoSpec, "videoSpec");
        x.f(range, "expectedCaptureFrameRateRange");
        if (x.n(range, SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED)) {
            iIntValue = 30;
        } else {
            Object upper = range.getUpper();
            x.c(upper);
            iIntValue = ((Number) upper).intValue();
        }
        int encodeFrameRate = videoSpec.getEncodeFrameRate() != 0 ? videoSpec.getEncodeFrameRate() : iIntValue;
        Logger.d(TAG, "Resolved capture/encode frame rate " + iIntValue + "fps/" + encodeFrameRate + "fps, [Expected operating range: " + (x.n(range, SurfaceRequest.FRAME_RATE_RANGE_UNSPECIFIED) ? "<UNSPECIFIED>" : String.valueOf(range)) + "]");
        return new CaptureEncodeRates(iIntValue, encodeFrameRate);
    }
}
