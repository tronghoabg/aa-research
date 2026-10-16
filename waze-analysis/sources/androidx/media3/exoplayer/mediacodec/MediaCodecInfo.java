package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    private float maxFrameRate;
    private int maxFrameRateHeight;
    private int maxFrameRateWidth;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        an.B(str);
        this.name = str;
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z;
        this.softwareOnly = z2;
        this.vendor = z3;
        this.adaptive = z4;
        this.tunneling = z5;
        this.secure = z6;
        this.detachedSurfaceSupported = z7;
        this.isVideo = MimeTypes.isVideo(str2);
        this.maxFrameRate = -3.4028235E38f;
        this.maxFrameRateWidth = -1;
        this.maxFrameRateHeight = -1;
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i2) {
        if (i2 > 1 || i2 > 0 || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || "audio/mp4a-latm".equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2)) {
            return i2;
        }
        int i3 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        Log.w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i2 + " to " + i3 + "]");
        return i3;
    }

    private static Point alignVideoSize(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i2, widthAlignment) * widthAlignment, Util.ceilDivide(i3, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point pointAlignVideoSize = alignVideoSize(videoCapabilities, i2, i3);
        int i4 = pointAlignVideoSize.x;
        int i5 = pointAlignVideoSize.y;
        if (d2 == -1.0d || d2 < 1.0d) {
            return videoCapabilities.isSizeSupported(i4, i5);
        }
        double dFloor = Math.floor(d2);
        if (!videoCapabilities.areSizeAndRateSupported(i4, i5, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i4, i5);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float computeMaxSupportedFrameRate(int i2, int i3) {
        float f2 = 1024.0f;
        if (isVideoSizeAndRateSupportedV21(i2, i3, 1024.0d)) {
            return 1024.0f;
        }
        float f3 = 0.0f;
        while (true) {
            float f4 = f2 - f3;
            if (Math.abs(f4) <= 5.0f) {
                return f3;
            }
            float f5 = (f4 / 2.0f) + f3;
            boolean zIsVideoSizeAndRateSupportedV21 = isVideoSizeAndRateSupportedV21(i2, i3, f5);
            if (true == zIsVideoSizeAndRateSupportedV21) {
                f3 = f5;
            }
            if (true != zIsVideoSizeAndRateSupportedV21) {
                f2 = f5;
            }
        }
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyAc4ProfileLevels(Context context, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int i2 = 8;
        if (codecCapabilities != null && (audioCapabilities = codecCapabilities.getAudioCapabilities()) != null && audioCapabilities.getMaxInputChannelCount() > 18) {
            i2 = 16;
        }
        return Util.isAutomotive(context) ? new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(1026, i2)} : new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(257, i2), MediaCodecUtil.createCodecProfileLevel(513, i2), MediaCodecUtil.createCodecProfileLevel(DisplayStrings.DS_REPORT_MENU_V2_ALERTER_SUCCESS_FEEDBACK_WITH_TYPE_PS, i2), MediaCodecUtil.createCodecProfileLevel(1026, i2), MediaCodecUtil.createCodecProfileLevel(1028, i2)};
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        return new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.createCodecProfileLevel(1, iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1)};
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean isCodecProfileAndLevelSupported(android.content.Context r10, androidx.media3.common.Format r11, boolean r12) {
        /*
            r9 = this;
            androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel r0 = androidx.media3.common.util.CodecSpecificDataUtil.getMediaCodecProfileAndLevel(r11)
            java.lang.String r1 = r11.sampleMimeType
            java.lang.String r2 = "video/hevc"
            r3 = 1
            if (r1 == 0) goto L2a
            java.lang.String r4 = "video/mv-hevc"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L2a
            java.lang.String r1 = r9.codecMimeType
            java.lang.String r1 = androidx.media3.common.MimeTypes.normalizeMimeType(r1)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L20
            return r3
        L20:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2a
            androidx.media3.common.util.CodecSpecificDataUtil$MediaCodecProfileAndLevel r0 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(r11)
        L2a:
            if (r0 != 0) goto L2d
            return r3
        L2d:
            boolean r1 = r0.isSupportableByMediaCodec()
            r4 = 0
            if (r1 != 0) goto L35
            return r4
        L35:
            int r1 = r0.getProfile()
            int r0 = r0.getLevel()
            java.lang.String r5 = r11.sampleMimeType
            java.lang.String r6 = "video/dolby-vision"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L7c
            java.lang.String r5 = r9.mimeType
            int r6 = r5.hashCode()
            r7 = -1662735862(0xffffffff9ce4aa0a, float:-1.5131728E-21)
            r8 = 2
            if (r6 == r7) goto L73
            r7 = -1662541442(0xffffffff9ce7a17e, float:-1.5328042E-21)
            if (r6 == r7) goto L6a
            r2 = 1331836730(0x4f62373a, float:3.7952701E9)
            if (r6 == r2) goto L5e
            goto L7c
        L5e:
            java.lang.String r2 = "video/avc"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L7c
            r1 = 8
            r0 = r4
            goto L7c
        L6a:
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L7c
        L70:
            r0 = r4
            r1 = r8
            goto L7c
        L73:
            java.lang.String r2 = "video/av01"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L7c
            goto L70
        L7c:
            boolean r2 = r9.isVideo
            java.lang.String r5 = "audio/ac4"
            if (r2 != 0) goto L90
            java.lang.String r2 = r9.mimeType
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L90
            r2 = 42
            if (r1 != r2) goto L8f
            goto L90
        L8f:
            return r3
        L90:
            android.media.MediaCodecInfo$CodecProfileLevel[] r2 = r9.getProfileLevels()
            java.lang.String r6 = r9.mimeType
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto La5
            int r5 = r2.length
            if (r5 != 0) goto La5
            android.media.MediaCodecInfo$CodecCapabilities r2 = r9.capabilities
            android.media.MediaCodecInfo$CodecProfileLevel[] r2 = estimateLegacyAc4ProfileLevels(r10, r2)
        La5:
            int r10 = r2.length
            r5 = r4
        La7:
            if (r5 >= r10) goto Lc1
            r6 = r2[r5]
            int r7 = r6.profile
            if (r7 != r1) goto Lbe
            int r6 = r6.level
            if (r6 >= r0) goto Lb5
            if (r12 != 0) goto Lbe
        Lb5:
            java.lang.String r6 = r9.mimeType
            boolean r6 = needsProfileExcludedWorkaround(r6, r1)
            if (r6 != 0) goto Lbe
            return r3
        Lbe:
            int r5 = r5 + 1
            goto La7
        Lc1:
            java.lang.String r10 = r11.codecs
            java.lang.String r11 = r9.codecMimeType
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "codec.profileLevel, "
            r12.<init>(r0)
            r12.append(r10)
            java.lang.String r10 = ", "
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            r9.logNoSupport(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecInfo.isCodecProfileAndLevelSupported(android.content.Context, androidx.media3.common.Format, boolean):boolean");
    }

    private boolean isCompressedAudioBitDepthSupported(Format format) {
        return (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_FLAC) && format.pcmEncoding == 22 && Build.VERSION.SDK_INT < 34 && this.name.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean isDetachedSurfaceSupported(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !needsDetachedSurfaceUnsupportedWorkaround();
    }

    private boolean isSampleMimeTypeSupported(Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        Log.d(TAG, "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private void logNoSupport(String str) {
        Log.d(TAG, "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + Util.DEVICE_DEBUG_INFO + "]");
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return MediaLibraryInfo.enableWorkarounds() && Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDetachedSurfaceUnsupportedWorkaround() {
        if (MediaLibraryInfo.enableWorkarounds() && Build.VERSION.SDK_INT <= 37) {
            return Build.MANUFACTURER.equals("Xiaomi") || Build.MANUFACTURER.equals("OPPO") || Build.MANUFACTURER.equals("realme") || Build.MANUFACTURER.equals("motorola") || Build.MANUFACTURER.equals("LENOVO") || Build.MANUFACTURER.equals("Fairphone");
        }
        return false;
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i2) {
        if (MediaLibraryInfo.enableWorkarounds() && MimeTypes.VIDEO_H265.equals(str) && i2 == 2) {
            return "sailfish".equals(Build.DEVICE) || "marlin".equals(Build.DEVICE);
        }
        return false;
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        if (MediaLibraryInfo.enableWorkarounds()) {
            return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
        }
        return false;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !isAdaptive(codecCapabilities)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z5 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    public Point alignVideoSizeV21(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i2, i3);
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        Format format3;
        Format format4;
        int i2;
        int i3 = true != Objects.equals(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i3 |= 1024;
            }
            boolean z = (format.width == format2.width && format.height == format2.height) ? false : true;
            if (!this.adaptive && z) {
                i3 |= 512;
            }
            if ((!ColorInfo.isEquivalentToAssumedSdrDefault(format.colorInfo) || !ColorInfo.isEquivalentToAssumedSdrDefault(format2.colorInfo)) && !Objects.equals(format.colorInfo, format2.colorInfo)) {
                i3 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i3 |= 2;
            }
            int i4 = format.decodedWidth;
            if (i4 != -1 && (i2 = format.decodedHeight) != -1 && i4 == format2.decodedWidth && i2 == format2.decodedHeight && z) {
                i3 |= 2;
            }
            if (i3 == 0 && Objects.equals(format2.sampleMimeType, MimeTypes.VIDEO_DOLBY_VISION)) {
                Pair<Integer, Integer> codecProfileAndLevel = CodecSpecificDataUtil.getCodecProfileAndLevel(format);
                Pair<Integer, Integer> codecProfileAndLevel2 = CodecSpecificDataUtil.getCodecProfileAndLevel(format2);
                if (codecProfileAndLevel == null || codecProfileAndLevel2 == null || !((Integer) codecProfileAndLevel.first).equals(codecProfileAndLevel2.first)) {
                    i3 = 2;
                }
            }
            if (i3 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, true == format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.channelCount != format4.channelCount) {
                i3 |= 4096;
            }
            if (format3.sampleRate != format4.sampleRate) {
                i3 |= 8192;
            }
            if (format3.pcmEncoding != format4.pcmEncoding) {
                i3 |= 16384;
            }
            if (i3 == 0 && (this.mimeType.equals("audio/mp4a-latm") || this.mimeType.equals(MimeTypes.AUDIO_AC4))) {
                Pair<Integer, Integer> codecProfileAndLevel3 = CodecSpecificDataUtil.getCodecProfileAndLevel(format3);
                Pair<Integer, Integer> codecProfileAndLevel4 = CodecSpecificDataUtil.getCodecProfileAndLevel(format4);
                if (codecProfileAndLevel3 != null && codecProfileAndLevel4 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel3.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                    if (this.mimeType.equals(MimeTypes.AUDIO_AC4) && codecProfileAndLevel3.equals(codecProfileAndLevel4)) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                }
            }
            if (i3 == 0 && (this.mimeType.equals(MimeTypes.AUDIO_E_AC3_JOC) || this.mimeType.equals(MimeTypes.AUDIO_E_AC3))) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
            }
            if (!format3.initializationDataEquals(format4)) {
                i3 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i3 |= 2;
            }
            if (i3 == 0) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format3, format4, 0, i3);
    }

    public float getMaxSupportedFrameRate(int i2, int i3) {
        if (!this.isVideo) {
            return -3.4028235E38f;
        }
        float f2 = this.maxFrameRate;
        if (f2 != -3.4028235E38f && this.maxFrameRateWidth == i2 && this.maxFrameRateHeight == i3) {
            return f2;
        }
        float fComputeMaxSupportedFrameRate = computeMaxSupportedFrameRate(i2, i3);
        this.maxFrameRate = fComputeMaxSupportedFrameRate;
        this.maxFrameRateWidth = i2;
        this.maxFrameRateHeight = i3;
        return fComputeMaxSupportedFrameRate;
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.capabilities.profileLevels;
    }

    public boolean isAudioChannelCountSupportedV21(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i2) {
            return true;
        }
        logNoSupport("channelCount.support, " + i2);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        logNoSupport("sampleRate.support, " + i2);
        return false;
    }

    public boolean isFormatFunctionallySupported(Context context, Format format) {
        return isSampleMimeTypeSupported(format) && isCodecProfileAndLevelSupported(context, format, false) && isCompressedAudioBitDepthSupported(format);
    }

    public boolean isFormatSupported(Context context, Format format) {
        int i2;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(context, format, true) || !isCompressedAudioBitDepthSupported(format)) {
            return false;
        }
        if (this.isVideo) {
            int i3 = format.width;
            if (i3 <= 0 || (i2 = format.height) <= 0) {
                return true;
            }
            return isVideoSizeAndRateSupportedV21(i3, i2, format.frameRate);
        }
        int i4 = format.sampleRate;
        if (i4 != -1 && !isAudioSampleRateSupportedV21(i4)) {
            return false;
        }
        int i5 = format.channelCount;
        return i5 == -1 || isAudioChannelCountSupportedV21(i5);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        CodecSpecificDataUtil.MediaCodecProfileAndLevel mediaCodecProfileAndLevel = CodecSpecificDataUtil.getMediaCodecProfileAndLevel(format);
        return mediaCodecProfileAndLevel != null && mediaCodecProfileAndLevel.isSupportableByMediaCodec() && mediaCodecProfileAndLevel.getProfile() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        int iAreResolutionAndFrameRateCovered = MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i2, i3, d2);
        if (iAreResolutionAndFrameRateCovered != 2) {
            if (iAreResolutionAndFrameRateCovered == 1) {
                logNoSupport("sizeAndRate.cover, " + i2 + "x" + i3 + "@" + d2);
                return false;
            }
            if (!areSizeAndRateSupported(videoCapabilities, i2, i3, d2)) {
                if (i2 >= i3 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i3, i2, d2)) {
                    logNoSupport("sizeAndRate.support, " + i2 + "x" + i3 + "@" + d2);
                    return false;
                }
                logAssumedSupport("sizeAndRate.rotated, " + i2 + "x" + i3 + "@" + d2);
            }
        }
        return true;
    }

    public String toString() {
        return this.name;
    }
}
