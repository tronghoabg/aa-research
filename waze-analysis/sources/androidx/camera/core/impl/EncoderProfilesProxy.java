package androidx.camera.core.impl;

import android.util.Size;
import androidx.media3.common.MimeTypes;
import j$.util.DesugarCollections;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.EncoderProfilesProxy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String getAudioCodecMimeType(int i2) {
            switch (i2) {
                case 1:
                    return MimeTypes.AUDIO_AMR_NB;
                case 2:
                    return MimeTypes.AUDIO_AMR_WB;
                case 3:
                case 4:
                case 5:
                    return "audio/mp4a-latm";
                case 6:
                    return MimeTypes.AUDIO_VORBIS;
                case 7:
                    return MimeTypes.AUDIO_OPUS;
                default:
                    return AudioProfileProxy.MEDIA_TYPE_NONE;
            }
        }

        public static int getRequiredAudioProfile(int i2) {
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? -1 : 39;
            }
            return 5;
        }

        public static String getVideoCodecMimeType(int i2) {
            switch (i2) {
                case 1:
                    return MimeTypes.VIDEO_H263;
                case 2:
                    return "video/avc";
                case 3:
                    return MimeTypes.VIDEO_MP4V;
                case 4:
                    return MimeTypes.VIDEO_VP8;
                case 5:
                    return MimeTypes.VIDEO_H265;
                case 6:
                    return MimeTypes.VIDEO_VP9;
                case 7:
                    return MimeTypes.VIDEO_DOLBY_VISION;
                case 8:
                    return MimeTypes.VIDEO_AV1;
                default:
                    return VideoProfileProxy.MEDIA_TYPE_NONE;
            }
        }
    }

    /* compiled from: WazeSource */
    public abstract class AudioProfileProxy {
        public static final String MEDIA_TYPE_NONE = "audio/none";

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        public static AudioProfileProxy create(int i2, String str, int i3, int i4, int i5, int i6) {
            return new AutoValue_EncoderProfilesProxy_AudioProfileProxy(i2, str, i3, i4, i5, i6);
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();
    }

    /* compiled from: WazeSource */
    public abstract class ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
        public static ImmutableEncoderProfilesProxy create(int i2, int i3, List<AudioProfileProxy> list, List<VideoProfileProxy> list2) {
            return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i2, i3, DesugarCollections.unmodifiableList(new ArrayList(list)), DesugarCollections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* compiled from: WazeSource */
    public abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final String MEDIA_TYPE_NONE = "video/none";

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        public static VideoProfileProxy create(int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i2, str, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        public abstract String getMediaType();

        public abstract int getProfile();

        public Size getResolution() {
            return new Size(getWidth(), getHeight());
        }

        public abstract int getWidth();
    }

    List<AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    List<VideoProfileProxy> getVideoProfiles();
}
