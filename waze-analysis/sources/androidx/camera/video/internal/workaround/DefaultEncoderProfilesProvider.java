package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultEncoderProfilesProvider implements EncoderProfilesProvider {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_AUDIO_BITRATE = 96000;
    public static final int DEFAULT_AUDIO_CHANNELS = 1;
    public static final int DEFAULT_AUDIO_CODEC = 3;
    public static final String DEFAULT_AUDIO_MIME_TYPE = "audio/mp4a-latm";
    public static final int DEFAULT_AUDIO_PROFILE = 2;
    public static final int DEFAULT_AUDIO_SAMPLE_RATE = 44100;
    public static final int DEFAULT_DURATION_SECONDS = 60;
    public static final int DEFAULT_OUTPUT_FORMAT = 2;
    public static final int DEFAULT_VIDEO_BITRATE_FHD = 10000000;
    public static final int DEFAULT_VIDEO_BITRATE_HD = 4000000;
    public static final int DEFAULT_VIDEO_BITRATE_QHD = 18000000;
    public static final int DEFAULT_VIDEO_BITRATE_SD = 2000000;
    public static final int DEFAULT_VIDEO_BITRATE_UHD = 40000000;
    public static final int DEFAULT_VIDEO_BIT_DEPTH = 8;
    public static final int DEFAULT_VIDEO_CHROMA_SUBSAMPLING = 0;
    public static final int DEFAULT_VIDEO_CODEC = 2;
    public static final int DEFAULT_VIDEO_FRAME_RATE = 30;
    public static final int DEFAULT_VIDEO_HDR_FORMAT = 0;
    public static final String DEFAULT_VIDEO_MIME_TYPE = "video/avc";
    public static final int DEFAULT_VIDEO_PROFILE = -1;
    private final CameraInfoInternal cameraInfo;
    private final Map<Integer, EncoderProfilesProxy> encoderProfilesMap;
    private final f supportedSizes$delegate;
    private final List<Quality> targetQualities;
    private final VideoEncoderInfo.Finder videoEncoderInfoFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultEncoderProfilesProvider(CameraInfoInternal cameraInfoInternal, List<? extends Quality> list, VideoEncoderInfo.Finder finder) {
        x.f(cameraInfoInternal, "cameraInfo");
        x.f(list, "targetQualities");
        x.f(finder, "videoEncoderInfoFinder");
        this.cameraInfo = cameraInfoInternal;
        this.targetQualities = list;
        this.videoEncoderInfoFinder = finder;
        this.supportedSizes$delegate = g.a(new a() { // from class: androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.cameraInfo.getSupportedResolutions(34);
            }
        });
        this.encoderProfilesMap = new LinkedHashMap();
    }

    private final EncoderProfilesProxy.AudioProfileProxy createDefaultAudioProfile(int i2, String str, int i3, int i4, int i5, int i6) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxyCreate = EncoderProfilesProxy.AudioProfileProxy.create(i2, str, i3, i4, i5, i6);
        x.e(audioProfileProxyCreate, "create(...)");
        return audioProfileProxyCreate;
    }

    static /* synthetic */ EncoderProfilesProxy.AudioProfileProxy createDefaultAudioProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i2, String str, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if (1 == (i7 & 1)) {
            i2 = 3;
        }
        if ((i7 & 2) != 0) {
            str = "audio/mp4a-latm";
        }
        if ((i7 & 4) != 0) {
            i3 = DEFAULT_AUDIO_BITRATE;
        }
        if ((i7 & 8) != 0) {
            i4 = 44100;
        }
        if ((i7 & 16) != 0) {
            i5 = 1;
        }
        if ((i7 & 32) != 0) {
            i6 = 2;
        }
        return defaultEncoderProfilesProvider.createDefaultAudioProfile(i2, str, i3, i4, i5, i6);
    }

    private final EncoderProfilesProxy createDefaultEncoderProfiles(int i2, int i3, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyCreate = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(i2, i3, i.d(audioProfileProxy), i.d(videoProfileProxy));
        x.e(immutableEncoderProfilesProxyCreate, "create(...)");
        return immutableEncoderProfilesProxyCreate;
    }

    static /* synthetic */ EncoderProfilesProxy createDefaultEncoderProfiles$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i2, int i3, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i4, Object obj) {
        if (1 == (i4 & 1)) {
            i2 = 60;
        }
        if ((i4 & 2) != 0) {
            i3 = 2;
        }
        return defaultEncoderProfilesProvider.createDefaultEncoderProfiles(i2, i3, videoProfileProxy, audioProfileProxy);
    }

    private final EncoderProfilesProxy.VideoProfileProxy createDefaultVideoProfile(int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreate = EncoderProfilesProxy.VideoProfileProxy.create(i2, str, i5, i6, i3, i4, i7, i8, i9, i10);
        x.e(videoProfileProxyCreate, "create(...)");
        return videoProfileProxyCreate;
    }

    static /* synthetic */ EncoderProfilesProxy.VideoProfileProxy createDefaultVideoProfile$default(DefaultEncoderProfilesProvider defaultEncoderProfilesProvider, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str2;
        DefaultEncoderProfilesProvider defaultEncoderProfilesProvider2;
        if (1 == (i11 & 1)) {
            i2 = 2;
        }
        if ((i11 & 2) != 0) {
            str = "video/avc";
        }
        if ((i11 & 32) != 0) {
            i6 = 30;
        }
        if ((i11 & 64) != 0) {
            i7 = -1;
        }
        if ((i11 & 128) != 0) {
            i8 = 8;
        }
        if ((i11 & 256) != 0) {
            i9 = 0;
        }
        if ((i11 & 512) != 0) {
            i12 = 0;
            i15 = i8;
            i13 = i9;
            i17 = i6;
            i14 = i7;
            i19 = i4;
            i16 = i5;
            str2 = str;
            i18 = i3;
            defaultEncoderProfilesProvider2 = defaultEncoderProfilesProvider;
            i20 = i2;
        } else {
            i12 = i10;
            i13 = i9;
            i14 = i7;
            i15 = i8;
            i16 = i5;
            i17 = i6;
            i18 = i3;
            i19 = i4;
            i20 = i2;
            str2 = str;
            defaultEncoderProfilesProvider2 = defaultEncoderProfilesProvider;
        }
        return defaultEncoderProfilesProvider2.createDefaultVideoProfile(i20, str2, i18, i19, i16, i17, i14, i15, i13, i12);
    }

    private final Quality.ConstantQuality find(List<? extends Quality> list, int i2) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Quality quality = (Quality) next;
            x.d(quality, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
            if (((Quality.ConstantQuality) quality).getQualityValue(1) == i2) {
                break;
            }
        }
        if (next instanceof Quality.ConstantQuality) {
            return (Quality.ConstantQuality) next;
        }
        return null;
    }

    private final EncoderProfilesProxy generateEncoderProfiles(int i2) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyGenerateVideoProfiles = generateVideoProfiles(i2);
        if (videoProfileProxyGenerateVideoProfiles == null) {
            return null;
        }
        return createDefaultEncoderProfiles$default(this, 0, 0, videoProfileProxyGenerateVideoProfiles, createDefaultAudioProfile$default(this, 0, null, 0, 0, 0, 0, 63, null), 3, null);
    }

    private final EncoderProfilesProxy.VideoProfileProxy generateVideoProfiles(int i2) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyResolveVideoProfile;
        Quality.ConstantQuality constantQualityFind = find(this.targetQualities, i2);
        if (constantQualityFind == null) {
            return null;
        }
        for (Size size : constantQualityFind.getTypicalSizes()) {
            if (getSupportedSizes().contains(size) && (videoProfileProxyResolveVideoProfile = resolveVideoProfile(size.getWidth(), size.getHeight(), getTypicalBitrate(constantQualityFind))) != null) {
                return videoProfileProxyResolveVideoProfile;
            }
        }
        return null;
    }

    private final EncoderProfilesProxy getProfileInternal(int i2) {
        Map<Integer, EncoderProfilesProxy> map = this.encoderProfilesMap;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return this.encoderProfilesMap.get(numValueOf);
        }
        EncoderProfilesProxy encoderProfilesProxyGenerateEncoderProfiles = generateEncoderProfiles(i2);
        this.encoderProfilesMap.put(numValueOf, encoderProfilesProxyGenerateEncoderProfiles);
        return encoderProfilesProxyGenerateEncoderProfiles;
    }

    private final List<Size> getSupportedSizes() {
        return (List) this.supportedSizes$delegate.getValue();
    }

    private final int getTypicalBitrate(Quality quality) {
        if (x.n(quality, Quality.UHD)) {
            return DEFAULT_VIDEO_BITRATE_UHD;
        }
        if (x.n(quality, Quality.QHD)) {
            return DEFAULT_VIDEO_BITRATE_QHD;
        }
        if (x.n(quality, Quality.FHD)) {
            return DEFAULT_VIDEO_BITRATE_FHD;
        }
        if (x.n(quality, Quality.HD)) {
            return DEFAULT_VIDEO_BITRATE_HD;
        }
        if (x.n(quality, Quality.SD)) {
            return DEFAULT_VIDEO_BITRATE_SD;
        }
        Objects.toString(quality);
        throw new IllegalArgumentException("Undefined bitrate for quality: ".concat(String.valueOf(quality)));
    }

    private final EncoderProfilesProxy.VideoProfileProxy resolveVideoProfile(int i2, int i3, int i4) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreateDefaultVideoProfile$default = createDefaultVideoProfile$default(this, 0, null, i2, i3, i4, 0, 0, 0, 0, 0, DisplayStrings.DS_WESRE_DETECTING_A_SLOW_DOWN, null);
        String mediaType = videoProfileProxyCreateDefaultVideoProfile$default.getMediaType();
        x.e(mediaType, "getMediaType(...)");
        VideoEncoderInfo videoEncoderInfoFind = this.videoEncoderInfoFinder.find(mediaType);
        if (videoEncoderInfoFind == null || !videoEncoderInfoFind.isSizeSupportedAllowSwapping(i2, i3)) {
            return null;
        }
        Integer num = (Integer) videoEncoderInfoFind.getSupportedBitrateRange().clamp(Integer.valueOf(i4));
        if (num != null && num.intValue() == i4) {
            return videoProfileProxyCreateDefaultVideoProfile$default;
        }
        x.c(num);
        return createDefaultVideoProfile$default(this, 0, null, i2, i3, num.intValue(), 0, 0, 0, 0, 0, DisplayStrings.DS_WESRE_DETECTING_A_SLOW_DOWN, null);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i2) {
        return getProfileInternal(i2);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i2) {
        return getProfileInternal(i2) != null;
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
