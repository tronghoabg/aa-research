package androidx.camera.video.internal;

import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    private static final String TAG = "BackupHdrProfileEncoderProfilesProvider";
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;
    private final VideoEncoderInfo.Finder mVideoEncoderInfoFinder;

    public BackupHdrProfileEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, VideoEncoderInfo.Finder finder) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mVideoEncoderInfoFinder = finder;
    }

    private EncoderProfilesProxy appendBackupVideoProfile(EncoderProfilesProxy encoderProfilesProxy, int i2, int i3) {
        EncoderProfilesProxy.VideoProfileProxy next;
        if (encoderProfilesProxy != null) {
            ArrayList arrayList = new ArrayList(encoderProfilesProxy.getVideoProfiles());
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getHdrFormat() == 0) {
                    break;
                }
            }
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxyValidateOrAdapt = validateOrAdapt(generateBackupProfile(next, i2, i3), this.mVideoEncoderInfoFinder);
            if (videoProfileProxyValidateOrAdapt != null) {
                arrayList.add(videoProfileProxyValidateOrAdapt);
            }
            if (!arrayList.isEmpty()) {
                return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
            }
        }
        return null;
    }

    private static int deriveCodec(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i2);
    }

    private static String deriveMediaType(int i2) {
        return EncoderProfilesProxy.CC.getVideoCodecMimeType(i2);
    }

    private static int deriveProfile(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4096;
        }
        if (i2 == 3) {
            return 8192;
        }
        if (i2 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i2);
    }

    private static EncoderProfilesProxy.VideoProfileProxy generateBackupProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i2, int i3) {
        if (videoProfileProxy == null) {
            return null;
        }
        int codec = videoProfileProxy.getCodec();
        String mediaType = videoProfileProxy.getMediaType();
        int profile = videoProfileProxy.getProfile();
        if (i2 != videoProfileProxy.getHdrFormat()) {
            deriveCodec(i2);
            profile = deriveProfile(i2);
            codec = 5;
            mediaType = deriveMediaType(5);
        }
        return EncoderProfilesProxy.VideoProfileProxy.create(codec, mediaType, scaleBitrate(videoProfileProxy.getBitrate(), i3, videoProfileProxy.getBitDepth()), videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), profile, i3, videoProfileProxy.getChromaSubsampling(), i2);
    }

    private EncoderProfilesProxy getProfilesInternal(int i2) {
        Map<Integer, EncoderProfilesProxy> map = this.mEncoderProfilesCache;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return this.mEncoderProfilesCache.get(numValueOf);
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i2)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyAppendBackupVideoProfile = appendBackupVideoProfile(this.mEncoderProfilesProvider.getAll(i2), 1, 10);
        this.mEncoderProfilesCache.put(numValueOf, encoderProfilesProxyAppendBackupVideoProfile);
        return encoderProfilesProxyAppendBackupVideoProfile;
    }

    private static EncoderProfilesProxy.VideoProfileProxy modifyBitrate(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, int i2) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), i2, videoProfileProxy.getFrameRate(), videoProfileProxy.getWidth(), videoProfileProxy.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    private static int scaleBitrate(int i2, int i3, int i4) {
        if (i3 == i4) {
            return i2;
        }
        int iDoubleValue = (int) (i2 * new Rational(i3, i4).doubleValue());
        if (Logger.isDebugEnabled(TAG)) {
            Logger.d(TAG, String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(iDoubleValue)));
        }
        return iDoubleValue;
    }

    static EncoderProfilesProxy.VideoProfileProxy validateOrAdapt(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, VideoEncoderInfo.Finder finder) {
        VideoEncoderInfo videoEncoderInfoFind;
        if (videoProfileProxy == null || (videoEncoderInfoFind = finder.find(videoProfileProxy.getMediaType())) == null || !videoEncoderInfoFind.isSizeSupportedAllowSwapping(videoProfileProxy.getWidth(), videoProfileProxy.getHeight())) {
            return null;
        }
        int bitrate = videoProfileProxy.getBitrate();
        int iIntValue = ((Integer) videoEncoderInfoFind.getSupportedBitrateRange().clamp(Integer.valueOf(bitrate))).intValue();
        return iIntValue == bitrate ? videoProfileProxy : modifyBitrate(videoProfileProxy, iIntValue);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i2) {
        return getProfilesInternal(i2);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i2) {
        return this.mEncoderProfilesProvider.hasProfile(i2) && getProfilesInternal(i2) != null;
    }
}
