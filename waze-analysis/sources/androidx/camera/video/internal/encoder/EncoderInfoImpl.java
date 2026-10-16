package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class EncoderInfoImpl implements EncoderInfo {
    private final MediaCodecInfo.CodecCapabilities codecCapabilities;
    private final MediaCodecInfo mediaCodecInfo;
    private final String mime;

    public EncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) throws InvalidConfigException {
        x.f(mediaCodecInfo, "mediaCodecInfo");
        x.f(str, "mime");
        this.mediaCodecInfo = mediaCodecInfo;
        this.mime = str;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(getMime());
            x.e(capabilitiesForType, "getCapabilitiesForType(...)");
            this.codecCapabilities = capabilitiesForType;
        } catch (RuntimeException e2) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: ".concat(String.valueOf(getMime())), e2);
        }
    }

    protected final MediaCodecInfo.CodecCapabilities getCodecCapabilities() {
        return this.codecCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getMime() {
        return this.mime;
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    public String getName() {
        String name = this.mediaCodecInfo.getName();
        x.e(name, "getName(...)");
        return name;
    }
}
