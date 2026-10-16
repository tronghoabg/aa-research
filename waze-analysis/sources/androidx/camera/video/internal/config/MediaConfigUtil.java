package androidx.camera.video.internal.config;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.MediaConstants;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.internal.utils.CodecUtil;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MediaConfigUtil {
    public static final MediaConfigUtil INSTANCE = new MediaConfigUtil();
    private static final int OUTPUT_FORMAT_DEFAULT = 0;
    private static final String TAG = "MediaConfigUtil";
    private static List<String> supportedAudioEncoderMimesOverride;
    private static List<String> supportedVideoEncoderMimesOverride;

    private MediaConfigUtil() {
    }

    public static final boolean canWriteOrientationMetadata(int i2) {
        return i2 == 0;
    }

    private final List<String> getSupportedAudioEncoderMimes() {
        List<String> list = supportedAudioEncoderMimesOverride;
        return list == null ? CodecUtil.getAudioEncoderMimeTypes() : list;
    }

    private final List<String> getSupportedVideoEncoderMimes() {
        List<String> list = supportedVideoEncoderMimesOverride;
        return list == null ? CodecUtil.getVideoEncoderMimeTypes() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int mediaRecorderFormatToOutputFormat(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 0;
        }
        return i2 != 9 ? -1 : 1;
    }

    public static final int outputFormatToMuxerFormat(int i2) {
        return i2 == 1 ? 1 : 0;
    }

    private final MediaInfo resolveByDefault(EncoderProfilesProxy encoderProfilesProxy, DynamicRange dynamicRange, int i2, String str, String str2) {
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        String dynamicRangeDefaultMime = true == x.n(str, MediaConstants.MIME_TYPE_UNSPECIFIED) ? null : str;
        if (dynamicRangeDefaultMime == null && (dynamicRangeDefaultMime = VideoConfigUtil.INSTANCE.getDynamicRangeDefaultMime(dynamicRange)) == null) {
            dynamicRangeDefaultMime = VideoConfigUtil.INSTANCE.outputFormatToVideoMime(i2);
        }
        String str3 = dynamicRangeDefaultMime;
        String strOutputFormatToAudioMime = str2;
        if (true == x.n(strOutputFormatToAudioMime, MediaConstants.MIME_TYPE_UNSPECIFIED)) {
            strOutputFormatToAudioMime = null;
        }
        if (strOutputFormatToAudioMime == null) {
            strOutputFormatToAudioMime = AudioConfigUtil.INSTANCE.outputFormatToAudioMime(i2);
        }
        String str4 = strOutputFormatToAudioMime;
        CompatibleProfiles compatibleProfilesResolveCompatibleProfiles = resolveCompatibleProfiles(encoderProfilesProxy, dynamicRange, iIntValue, str3, str4);
        MediaInfo mediaInfo = new MediaInfo(new ContainerInfo(iIntValue, compatibleProfilesResolveCompatibleProfiles.getEncoderProfiles()), new VideoMimeInfo(str3, 0, compatibleProfilesResolveCompatibleProfiles.getVideoProfile(), 2, null), new AudioMimeInfo(str4, AudioConfigUtil.INSTANCE.audioMimeToAudioProfile(str4), compatibleProfilesResolveCompatibleProfiles.getAudioProfile()));
        mediaInfo.toString();
        Logger.d(TAG, "Resolved MediaInfo by Default: ".concat(mediaInfo.toString()));
        return mediaInfo;
    }

    private final MediaInfo resolveByEncoderProfiles(EncoderProfilesProxy encoderProfilesProxy, DynamicRange dynamicRange, int i2, String str, String str2) {
        CompatibleProfiles compatibleProfilesResolveCompatibleProfiles = resolveCompatibleProfiles(encoderProfilesProxy, dynamicRange, i2, str, str2);
        Objects.toString(compatibleProfilesResolveCompatibleProfiles);
        Logger.d(TAG, "Resolved CompatibleProfiles: ".concat(String.valueOf(compatibleProfilesResolveCompatibleProfiles)));
        if (true != compatibleProfilesResolveCompatibleProfiles.isFullyCompatible()) {
            compatibleProfilesResolveCompatibleProfiles = null;
        }
        if (compatibleProfilesResolveCompatibleProfiles == null) {
            return null;
        }
        MediaInfo mediaInfo = compatibleProfilesResolveCompatibleProfiles.toMediaInfo();
        Objects.toString(mediaInfo);
        Logger.d(TAG, "Resolved MediaInfo by CompatibleProfiles: ".concat(mediaInfo.toString()));
        return mediaInfo;
    }

    private final MediaInfo resolveByFormatCombo(EncoderProfilesProxy encoderProfilesProxy, DynamicRange dynamicRange, int i2, String str, String str2) {
        FormatCombo formatComboResolveFormatCombo = resolveFormatCombo(i2, str, str2, dynamicRange, getSupportedVideoEncoderMimes(), getSupportedAudioEncoderMimes());
        Objects.toString(formatComboResolveFormatCombo);
        Logger.d(TAG, "Resolved FormatCombo: ".concat(String.valueOf(formatComboResolveFormatCombo)));
        if (formatComboResolveFormatCombo == null) {
            return null;
        }
        int container = formatComboResolveFormatCombo.getContainer();
        String videoMime = formatComboResolveFormatCombo.getVideoMime();
        x.c(videoMime);
        String audioMime = formatComboResolveFormatCombo.getAudioMime();
        if (audioMime == null) {
            audioMime = MediaConstants.MIME_TYPE_UNSPECIFIED;
        }
        CompatibleProfiles compatibleProfilesResolveCompatibleProfiles = resolveCompatibleProfiles(encoderProfilesProxy, dynamicRange, container, videoMime, audioMime);
        ContainerInfo containerInfo = new ContainerInfo(formatComboResolveFormatCombo.getContainer(), compatibleProfilesResolveCompatibleProfiles.getEncoderProfiles());
        VideoMimeInfo videoMimeInfo = new VideoMimeInfo(formatComboResolveFormatCombo.getVideoMime(), 0, compatibleProfilesResolveCompatibleProfiles.getVideoProfile(), 2, null);
        String audioMime2 = formatComboResolveFormatCombo.getAudioMime();
        MediaInfo mediaInfo = new MediaInfo(containerInfo, videoMimeInfo, audioMime2 != null ? new AudioMimeInfo(audioMime2, AudioConfigUtil.INSTANCE.audioMimeToAudioProfile(audioMime2), compatibleProfilesResolveCompatibleProfiles.getAudioProfile()) : null);
        mediaInfo.toString();
        Logger.d(TAG, "Resolved MediaInfo by FormatCombo: ".concat(mediaInfo.toString()));
        return mediaInfo;
    }

    private final EncoderProfilesProxy resolveCompatibleEncoderProfiles(int i2, EncoderProfilesProxy encoderProfilesProxy) {
        if (encoderProfilesProxy == null) {
            return null;
        }
        if (i2 == -1 || i2 == INSTANCE.mediaRecorderFormatToOutputFormat(encoderProfilesProxy.getRecommendedFileFormat())) {
            return encoderProfilesProxy;
        }
        return null;
    }

    private final CompatibleProfiles resolveCompatibleProfiles(EncoderProfilesProxy encoderProfilesProxy, DynamicRange dynamicRange, int i2, String str, String str2) {
        if (encoderProfilesProxy == null) {
            return CompatibleProfiles.Companion.getEMPTY();
        }
        EncoderProfilesProxy encoderProfilesProxyResolveCompatibleEncoderProfiles = resolveCompatibleEncoderProfiles(i2, encoderProfilesProxy);
        VideoConfigUtil videoConfigUtil = VideoConfigUtil.INSTANCE;
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        x.e(videoProfiles, "getVideoProfiles(...)");
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyResolveCompatibleVideoProfile = videoConfigUtil.resolveCompatibleVideoProfile(str, dynamicRange, videoProfiles);
        AudioConfigUtil audioConfigUtil = AudioConfigUtil.INSTANCE;
        List<EncoderProfilesProxy.AudioProfileProxy> audioProfiles = encoderProfilesProxy.getAudioProfiles();
        x.e(audioProfiles, "getAudioProfiles(...)");
        return new CompatibleProfiles(encoderProfilesProxyResolveCompatibleEncoderProfiles, videoProfileProxyResolveCompatibleVideoProfile, audioConfigUtil.resolveCompatibleAudioProfile(str2, audioProfiles));
    }

    private final FormatCombo resolveFormatCombo(int i2, String str, String str2, DynamicRange dynamicRange, List<String> list, List<String> list2) {
        Object next;
        Logger.d(TAG, "resolveFormatCombo - supportedVideoEncoderMimes: " + list + ", supportedAudioEncoderMimes: " + list2);
        FormatComboRegistry registry = DynamicRangeFormatComboRegistry.INSTANCE.getRegistry(dynamicRange);
        Object obj = null;
        if (registry == null) {
            return null;
        }
        List<FormatCombo> combos = registry.getCombos(i2, str, str2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : combos) {
            if (((FormatCombo) obj2).getVideoMime() != null) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = arrayList;
        arrayList2.toString();
        Logger.d(TAG, "eligibleFormatCombos: ".concat(arrayList2.toString()));
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = arrayList2;
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            FormatCombo formatCombo = (FormatCombo) next;
            if (i.ax(list, formatCombo.getVideoMime()) && i.ax(list2, formatCombo.getAudioMime())) {
                break;
            }
        }
        FormatCombo formatCombo2 = (FormatCombo) next;
        if (formatCombo2 != null) {
            return formatCombo2;
        }
        Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            FormatCombo formatCombo3 = (FormatCombo) next2;
            if (i.ax(list, formatCombo3.getVideoMime()) && formatCombo3.getAudioMime() == null) {
                obj = next2;
                break;
            }
        }
        FormatCombo formatCombo4 = (FormatCombo) obj;
        return formatCombo4 == null ? (FormatCombo) i.R(arrayList2) : formatCombo4;
    }

    public static final MediaInfo resolveMediaInfo(MediaSpec mediaSpec, DynamicRange dynamicRange, EncoderProfilesProxy encoderProfilesProxy) {
        x.f(mediaSpec, "mediaSpec");
        x.f(dynamicRange, "dynamicRange");
        Logger.d(TAG, "Resolving MediaInfo for MediaSpec: " + mediaSpec + ", DynamicRange: " + dynamicRange + ", EncoderProfiles: " + encoderProfilesProxy);
        int outputFormat = mediaSpec.getOutputFormat();
        String mimeType = mediaSpec.getVideoSpec().getMimeType();
        String mimeType2 = mediaSpec.getAudioSpec().getMimeType();
        MediaConfigUtil mediaConfigUtil = INSTANCE;
        MediaInfo mediaInfoResolveByEncoderProfiles = mediaConfigUtil.resolveByEncoderProfiles(encoderProfilesProxy, dynamicRange, outputFormat, mimeType, mimeType2);
        if (mediaInfoResolveByEncoderProfiles != null) {
            return mediaInfoResolveByEncoderProfiles;
        }
        MediaInfo mediaInfoResolveByFormatCombo = mediaConfigUtil.resolveByFormatCombo(encoderProfilesProxy, dynamicRange, outputFormat, mimeType, mimeType2);
        return mediaInfoResolveByFormatCombo != null ? mediaInfoResolveByFormatCombo : mediaConfigUtil.resolveByDefault(encoderProfilesProxy, dynamicRange, outputFormat, mimeType, mimeType2);
    }

    public final void setSupportedEncoderMimeTypes(List<String> list, List<String> list2) {
        supportedVideoEncoderMimesOverride = list;
        supportedAudioEncoderMimesOverride = list2;
    }

    /* compiled from: WazeSource */
    final class CompatibleProfiles {
        public static final Companion Companion = new Companion(null);
        private static final CompatibleProfiles EMPTY = new CompatibleProfiles(null, null, null, 7, null);
        private final EncoderProfilesProxy.AudioProfileProxy audioProfile;
        private final EncoderProfilesProxy encoderProfiles;
        private final EncoderProfilesProxy.VideoProfileProxy videoProfile;

        public /* synthetic */ CompatibleProfiles(EncoderProfilesProxy encoderProfilesProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i2, o oVar) {
            this(1 == (i2 & 1) ? null : encoderProfilesProxy, (i2 & 2) != 0 ? null : videoProfileProxy, (i2 & 4) != 0 ? null : audioProfileProxy);
        }

        public static /* synthetic */ CompatibleProfiles copy$default(CompatibleProfiles compatibleProfiles, EncoderProfilesProxy encoderProfilesProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                encoderProfilesProxy = compatibleProfiles.encoderProfiles;
            }
            if ((i2 & 2) != 0) {
                videoProfileProxy = compatibleProfiles.videoProfile;
            }
            if ((i2 & 4) != 0) {
                audioProfileProxy = compatibleProfiles.audioProfile;
            }
            return compatibleProfiles.copy(encoderProfilesProxy, videoProfileProxy, audioProfileProxy);
        }

        public final EncoderProfilesProxy component1() {
            return this.encoderProfiles;
        }

        public final EncoderProfilesProxy.VideoProfileProxy component2() {
            return this.videoProfile;
        }

        public final EncoderProfilesProxy.AudioProfileProxy component3() {
            return this.audioProfile;
        }

        public final CompatibleProfiles copy(EncoderProfilesProxy encoderProfilesProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            return new CompatibleProfiles(encoderProfilesProxy, videoProfileProxy, audioProfileProxy);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompatibleProfiles)) {
                return false;
            }
            CompatibleProfiles compatibleProfiles = (CompatibleProfiles) obj;
            return x.n(this.encoderProfiles, compatibleProfiles.encoderProfiles) && x.n(this.videoProfile, compatibleProfiles.videoProfile) && x.n(this.audioProfile, compatibleProfiles.audioProfile);
        }

        public final EncoderProfilesProxy.AudioProfileProxy getAudioProfile() {
            return this.audioProfile;
        }

        public final EncoderProfilesProxy getEncoderProfiles() {
            return this.encoderProfiles;
        }

        public final EncoderProfilesProxy.VideoProfileProxy getVideoProfile() {
            return this.videoProfile;
        }

        public int hashCode() {
            EncoderProfilesProxy encoderProfilesProxy = this.encoderProfiles;
            int iHashCode = encoderProfilesProxy == null ? 0 : encoderProfilesProxy.hashCode();
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.videoProfile;
            int iHashCode2 = videoProfileProxy == null ? 0 : videoProfileProxy.hashCode();
            int i2 = iHashCode * 31;
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.audioProfile;
            return ((i2 + iHashCode2) * 31) + (audioProfileProxy != null ? audioProfileProxy.hashCode() : 0);
        }

        public final boolean isFullyCompatible() {
            return (this.encoderProfiles == null || this.videoProfile == null || this.audioProfile == null) ? false : true;
        }

        public final MediaInfo toMediaInfo() {
            if (!isFullyCompatible()) {
                throw new IllegalStateException("Check failed.");
            }
            EncoderProfilesProxy encoderProfilesProxy = this.encoderProfiles;
            MediaConfigUtil mediaConfigUtil = MediaConfigUtil.INSTANCE;
            x.c(encoderProfilesProxy);
            ContainerInfo containerInfo = new ContainerInfo(mediaConfigUtil.mediaRecorderFormatToOutputFormat(encoderProfilesProxy.getRecommendedFileFormat()), this.encoderProfiles);
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.videoProfile;
            x.c(videoProfileProxy);
            String mediaType = videoProfileProxy.getMediaType();
            x.e(mediaType, "getMediaType(...)");
            VideoMimeInfo videoMimeInfo = new VideoMimeInfo(mediaType, 0, this.videoProfile, 2, null);
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.audioProfile;
            x.c(audioProfileProxy);
            String mediaType2 = audioProfileProxy.getMediaType();
            x.e(mediaType2, "getMediaType(...)");
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy2 = this.audioProfile;
            return new MediaInfo(containerInfo, videoMimeInfo, new AudioMimeInfo(mediaType2, audioProfileProxy2.getProfile(), audioProfileProxy2));
        }

        public String toString() {
            return "CompatibleProfiles(encoderProfiles=" + this.encoderProfiles + ", videoProfile=" + this.videoProfile + ", audioProfile=" + this.audioProfile + ")";
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final CompatibleProfiles getEMPTY() {
                return CompatibleProfiles.EMPTY;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public CompatibleProfiles(EncoderProfilesProxy encoderProfilesProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            this.encoderProfiles = encoderProfilesProxy;
            this.videoProfile = videoProfileProxy;
            this.audioProfile = audioProfileProxy;
        }

        public CompatibleProfiles() {
            this(null, null, null, 7, null);
        }
    }
}
