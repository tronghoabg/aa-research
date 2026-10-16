package androidx.camera.video.internal.utils;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.VideoConfigUtil;
import h.a.i;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EncoderProfilesUtil {
    public static final EncoderProfilesUtil INSTANCE = new EncoderProfilesUtil();

    private EncoderProfilesUtil() {
    }

    public static final EncoderProfilesProxy.VideoProfileProxy deriveVideoProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, Size size, Range<Integer> range) {
        x.f(videoProfileProxy, "baseVideoProfile");
        x.f(size, "newResolution");
        x.f(range, "bitrateRangeToClamp");
        Object objClamp = range.clamp(Integer.valueOf(VideoConfigUtil.scaleBitrate(videoProfileProxy.getBitrate(), videoProfileProxy.getBitDepth(), videoProfileProxy.getBitDepth(), videoProfileProxy.getFrameRate(), videoProfileProxy.getFrameRate(), size.getWidth(), videoProfileProxy.getWidth(), size.getHeight(), videoProfileProxy.getHeight())));
        x.e(objClamp, "clamp(...)");
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyCreate = EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), ((Number) objClamp).intValue(), videoProfileProxy.getFrameRate(), size.getWidth(), size.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
        x.e(videoProfileProxyCreate, "create(...)");
        return videoProfileProxyCreate;
    }

    public static final EncoderProfilesProxy.VideoProfileProxy getFirstVideoProfile(EncoderProfilesProxy encoderProfilesProxy) {
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles;
        if (encoderProfilesProxy == null || (videoProfiles = encoderProfilesProxy.getVideoProfiles()) == null) {
            return null;
        }
        return (EncoderProfilesProxy.VideoProfileProxy) i.R(videoProfiles);
    }
}
