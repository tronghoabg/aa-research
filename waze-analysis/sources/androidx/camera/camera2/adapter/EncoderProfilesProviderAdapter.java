package androidx.camera.camera2.adapter;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.compat.EncoderProfilesProxyCompat;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EncoderProfilesProviderAdapter implements EncoderProfilesProvider {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "EncoderProfilesProviderAdapter";
    private final int cameraId;
    private final String cameraIdString;
    private final Quirks cameraQuirks;
    private final boolean hasValidCameraId;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache;

    /* compiled from: WazeSource */
    public final class Api31Impl {
        public static final Api31Impl INSTANCE = new Api31Impl();

        private Api31Impl() {
        }

        public final EncoderProfiles getAll(String str, int i2) {
            x.f(str, "cameraId");
            return CamcorderProfile.getAll(str, i2);
        }
    }

    public EncoderProfilesProviderAdapter(String str, Quirks quirks) throws NumberFormatException {
        int i2;
        boolean z;
        x.f(str, "cameraIdString");
        x.f(quirks, "cameraQuirks");
        this.cameraIdString = str;
        this.cameraQuirks = quirks;
        this.mEncoderProfilesCache = new LinkedHashMap();
        try {
            i2 = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            Logger.w(TAG, "Camera id is not an integer:  " + this.cameraIdString + ", unable to create EncoderProfilesProviderAdapter.");
            i2 = -1;
            z = false;
        }
        this.hasValidCameraId = z;
        this.cameraId = i2;
    }

    private final EncoderProfilesProxy createProfilesFromCamcorderProfile(int i2) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.cameraId, i2);
        } catch (RuntimeException e2) {
            Logger.w(TAG, "Unable to get CamcorderProfile by quality: " + i2, e2);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return EncoderProfilesProxyCompat.from(camcorderProfile);
        }
        return null;
    }

    private final EncoderProfilesProxy findHighestQualityProfiles() {
        for (Integer num : EncoderProfilesProvider.QUALITY_HIGH_TO_LOW) {
            x.c(num);
            EncoderProfilesProxy all = getAll(num.intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private final EncoderProfilesProxy findLowestQualityProfiles() {
        List<Integer> list = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
        x.e(list, "QUALITY_HIGH_TO_LOW");
        for (int iE = i.e(list); iE >= 0; iE--) {
            Integer num = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW.get(iE);
            x.e(num, "get(...)");
            EncoderProfilesProxy all = getAll(num.intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private final EncoderProfilesProxy getProfilesInternal(int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles all = Api31Impl.INSTANCE.getAll(this.cameraIdString, i2);
            if (all == null) {
                return null;
            }
            if (DeviceQuirks.INSTANCE.get(InvalidVideoProfilesQuirk.class) != null) {
                Logger.d(TAG, "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return EncoderProfilesProxyCompat.from(all);
                } catch (NullPointerException unused) {
                    Logger.d(TAG, "Unable to create EncoderProfilesProxy. Fall back to CamcorderProfile.");
                }
            }
        }
        return this.createProfilesFromCamcorderProfile(i2);
    }

    private final boolean isEncoderProfilesResolutionValidInQuirk(EncoderProfilesProxy encoderProfilesProxy) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.cameraQuirks.get(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = encoderProfilesProxy.getVideoProfiles();
        x.e(videoProfiles, "getVideoProfiles(...)");
        if (videoProfiles.isEmpty()) {
            return true;
        }
        return camcorderProfileResolutionQuirk.getSupportedResolutions().contains(videoProfiles.get(0).getResolution());
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i2) {
        EncoderProfilesProxy encoderProfilesProxyFindLowestQualityProfiles = null;
        if (!this.hasValidCameraId || !CamcorderProfile.hasProfile(this.cameraId, i2)) {
            return null;
        }
        Map<Integer, EncoderProfilesProxy> map = this.mEncoderProfilesCache;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return this.mEncoderProfilesCache.get(numValueOf);
        }
        EncoderProfilesProxy profilesInternal = getProfilesInternal(i2);
        if (profilesInternal == null || isEncoderProfilesResolutionValidInQuirk(profilesInternal)) {
            encoderProfilesProxyFindLowestQualityProfiles = profilesInternal;
        } else if (i2 == 0) {
            encoderProfilesProxyFindLowestQualityProfiles = findLowestQualityProfiles();
        } else if (i2 == 1) {
            encoderProfilesProxyFindLowestQualityProfiles = findHighestQualityProfiles();
        }
        this.mEncoderProfilesCache.put(numValueOf, encoderProfilesProxyFindLowestQualityProfiles);
        return encoderProfilesProxyFindLowestQualityProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i2) {
        return this.hasValidCameraId && getAll(i2) != null;
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
