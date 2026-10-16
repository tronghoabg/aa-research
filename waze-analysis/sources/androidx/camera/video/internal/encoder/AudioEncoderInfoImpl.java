package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import android.util.Range;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioEncoderInfoImpl extends EncoderInfoImpl implements AudioEncoderInfo {
    private final MediaCodecInfo.AudioCapabilities audioCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEncoderInfoImpl(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        x.f(mediaCodecInfo, "codecInfo");
        x.f(str, "mime");
        MediaCodecInfo.AudioCapabilities audioCapabilities = getCodecCapabilities().getAudioCapabilities();
        x.c(audioCapabilities);
        this.audioCapabilities = audioCapabilities;
    }

    @Override // androidx.camera.video.internal.encoder.AudioEncoderInfo
    public Range<Integer> getBitrateRange() {
        Range<Integer> bitrateRange = this.audioCapabilities.getBitrateRange();
        x.e(bitrateRange, "getBitrateRange(...)");
        return bitrateRange;
    }
}
