package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioMimeInfo implements MimeInfo {
    private final EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile;
    private final String mimeType;
    private final int profile;

    public AudioMimeInfo(String str, int i2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        x.f(str, "mimeType");
        this.mimeType = str;
        this.profile = i2;
        this.compatibleAudioProfile = audioProfileProxy;
    }

    public static /* synthetic */ AudioMimeInfo copy$default(AudioMimeInfo audioMimeInfo, String str, int i2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = audioMimeInfo.mimeType;
        }
        if ((i3 & 2) != 0) {
            i2 = audioMimeInfo.profile;
        }
        if ((i3 & 4) != 0) {
            audioProfileProxy = audioMimeInfo.compatibleAudioProfile;
        }
        return audioMimeInfo.copy(str, i2, audioProfileProxy);
    }

    public final String component1() {
        return this.mimeType;
    }

    public final int component2() {
        return this.profile;
    }

    public final EncoderProfilesProxy.AudioProfileProxy component3() {
        return this.compatibleAudioProfile;
    }

    public final AudioMimeInfo copy(String str, int i2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        x.f(str, "mimeType");
        return new AudioMimeInfo(str, i2, audioProfileProxy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioMimeInfo)) {
            return false;
        }
        AudioMimeInfo audioMimeInfo = (AudioMimeInfo) obj;
        return x.n(this.mimeType, audioMimeInfo.mimeType) && this.profile == audioMimeInfo.profile && x.n(this.compatibleAudioProfile, audioMimeInfo.compatibleAudioProfile);
    }

    public final EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile() {
        return this.compatibleAudioProfile;
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
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.compatibleAudioProfile;
        return ((iHashCode + this.profile) * 31) + (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo(mimeType=" + this.mimeType + ", profile=" + this.profile + ", compatibleAudioProfile=" + this.compatibleAudioProfile + ")";
    }

    public /* synthetic */ AudioMimeInfo(String str, int i2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, int i3, o oVar) {
        this(str, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : audioProfileProxy);
    }
}
