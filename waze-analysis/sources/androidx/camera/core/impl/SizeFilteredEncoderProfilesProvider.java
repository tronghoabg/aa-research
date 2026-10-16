package androidx.camera.core.impl;

import android.util.Size;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SizeFilteredEncoderProfilesProvider implements EncoderProfilesProvider {
    private final Map<Integer, EncoderProfilesProxy> encoderProfilesCache;
    private final EncoderProfilesProvider provider;
    private final List<Size> supportedSizes;

    public SizeFilteredEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, List<Size> list) {
        x.f(encoderProfilesProvider, "provider");
        x.f(list, "supportedSizes");
        this.provider = encoderProfilesProvider;
        this.supportedSizes = list;
        this.encoderProfilesCache = new LinkedHashMap();
    }

    private final EncoderProfilesProxy findFirstAvailableProfile(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            EncoderProfilesProxy all = getAll(it.next().intValue());
            if (all != null) {
                return all;
            }
        }
        return null;
    }

    private final boolean isResolutionSupported(EncoderProfilesProxy encoderProfilesProxy) {
        if (this.supportedSizes.isEmpty() || encoderProfilesProxy.getVideoProfiles().isEmpty()) {
            return false;
        }
        return this.supportedSizes.contains(encoderProfilesProxy.getVideoProfiles().get(0).getResolution());
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public EncoderProfilesProxy getAll(int i2) {
        EncoderProfilesProxy encoderProfilesProxyFindFirstAvailableProfile = null;
        if (!this.provider.hasProfile(i2)) {
            return null;
        }
        Map<Integer, EncoderProfilesProxy> map = this.encoderProfilesCache;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return this.encoderProfilesCache.get(numValueOf);
        }
        EncoderProfilesProxy all = this.provider.getAll(i2);
        if (all == null || isResolutionSupported(all)) {
            encoderProfilesProxyFindFirstAvailableProfile = all;
        } else if (i2 == 0) {
            List<Integer> list = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
            x.e(list, "QUALITY_HIGH_TO_LOW");
            encoderProfilesProxyFindFirstAvailableProfile = findFirstAvailableProfile(i.ai(list));
        } else if (i2 == 1) {
            List<Integer> list2 = EncoderProfilesProvider.QUALITY_HIGH_TO_LOW;
            x.e(list2, "QUALITY_HIGH_TO_LOW");
            encoderProfilesProxyFindFirstAvailableProfile = findFirstAvailableProfile(list2);
        }
        this.encoderProfilesCache.put(numValueOf, encoderProfilesProxyFindFirstAvailableProfile);
        return encoderProfilesProxyFindFirstAvailableProfile;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i2) {
        return getAll(i2) != null;
    }
}
