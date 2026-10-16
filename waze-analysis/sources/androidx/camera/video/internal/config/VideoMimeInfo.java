package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoMimeInfo implements MimeInfo {
    private final EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
    private final String mimeType;
    private final int profile;

    public VideoMimeInfo(String str, int i2, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        x.f(str, "mimeType");
        this.mimeType = str;
        this.profile = i2;
        this.compatibleVideoProfile = videoProfileProxy;
    }

    public static /* synthetic */ VideoMimeInfo copy$default(VideoMimeInfo videoMimeInfo, String str, int i2, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = videoMimeInfo.mimeType;
        }
        if ((i3 & 2) != 0) {
            i2 = videoMimeInfo.profile;
        }
        if ((i3 & 4) != 0) {
            videoProfileProxy = videoMimeInfo.compatibleVideoProfile;
        }
        return videoMimeInfo.copy(str, i2, videoProfileProxy);
    }

    public final String component1() {
        return this.mimeType;
    }

    public final int component2() {
        return this.profile;
    }

    public final EncoderProfilesProxy.VideoProfileProxy component3() {
        return this.compatibleVideoProfile;
    }

    public final VideoMimeInfo copy(String str, int i2, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        x.f(str, "mimeType");
        return new VideoMimeInfo(str, i2, videoProfileProxy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        return x.n(this.mimeType, videoMimeInfo.mimeType) && this.profile == videoMimeInfo.profile && x.n(this.compatibleVideoProfile, videoMimeInfo.compatibleVideoProfile);
    }

    public final EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
        return this.compatibleVideoProfile;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int iHashCode = this.mimeType.hashCode() * 31;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.compatibleVideoProfile;
        return ((iHashCode + this.profile) * 31) + (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo(mimeType=" + this.mimeType + ", profile=" + this.profile + ", compatibleVideoProfile=" + this.compatibleVideoProfile + ")";
    }

    public /* synthetic */ VideoMimeInfo(String str, int i2, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i3, o oVar) {
        this(str, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : videoProfileProxy);
    }
}
