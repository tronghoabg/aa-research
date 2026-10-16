package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.video.internal.DynamicRangeMatchedEncoderProfilesProvider;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import e.c.d.a;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EncoderProfilesResolver {
    public static final Companion Companion = new Companion(null);
    public static final EncoderProfilesResolver EMPTY;
    private final Map<DynamicRange, CapabilitiesByQuality> fullySpecifiedMap;
    private final EncoderProfilesProvider hostProfilesProvider;
    private final Map<DynamicRange, CapabilitiesByQuality> nonFullySpecifiedMap;
    private final int qualitySource;
    private final Set<DynamicRange> supportedDynamicRanges;

    static {
        EncoderProfilesProvider encoderProfilesProvider = EncoderProfilesProvider.EMPTY;
        x.e(encoderProfilesProvider, "EMPTY");
        EMPTY = new EncoderProfilesResolver(encoderProfilesProvider, 1, a.p());
    }

    public EncoderProfilesResolver(EncoderProfilesProvider encoderProfilesProvider, int i2, Set<DynamicRange> set) {
        x.f(encoderProfilesProvider, "hostProfilesProvider");
        x.f(set, "supportedDynamicRanges");
        this.hostProfilesProvider = encoderProfilesProvider;
        this.qualitySource = i2;
        this.fullySpecifiedMap = new LinkedHashMap();
        this.nonFullySpecifiedMap = new LinkedHashMap();
        for (DynamicRange dynamicRange : set) {
            CapabilitiesByQuality capabilitiesByQuality = new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.hostProfilesProvider, dynamicRange), this.qualitySource);
            List<Quality> supportedQualities = capabilitiesByQuality.getSupportedQualities();
            x.e(supportedQualities, "getSupportedQualities(...)");
            if (!supportedQualities.isEmpty()) {
                this.fullySpecifiedMap.put(dynamicRange, capabilitiesByQuality);
            }
        }
        this.supportedDynamicRanges = this.fullySpecifiedMap.keySet();
    }

    private final CapabilitiesByQuality getCapabilities(DynamicRange dynamicRange) {
        if (dynamicRange.isFullySpecified()) {
            return this.fullySpecifiedMap.get(dynamicRange);
        }
        Map<DynamicRange, CapabilitiesByQuality> map = this.nonFullySpecifiedMap;
        CapabilitiesByQuality capabilitiesByQuality = map.get(dynamicRange);
        if (capabilitiesByQuality == null) {
            capabilitiesByQuality = DynamicRanges.canResolve(dynamicRange, this.fullySpecifiedMap.keySet()) ? new CapabilitiesByQuality(new DynamicRangeMatchedEncoderProfilesProvider(this.hostProfilesProvider, dynamicRange), this.qualitySource) : null;
            map.put(dynamicRange, capabilitiesByQuality);
        }
        return capabilitiesByQuality;
    }

    public final VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor(Size size, DynamicRange dynamicRange) {
        x.f(size, "size");
        x.f(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.findNearestHigherSupportedEncoderProfilesFor(size);
        }
        return null;
    }

    public final Quality findNearestHigherSupportedQualityFor(Size size, DynamicRange dynamicRange) {
        Quality qualityFindNearestHigherSupportedQualityFor;
        x.f(size, "size");
        x.f(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null && (qualityFindNearestHigherSupportedQualityFor = capabilities.findNearestHigherSupportedQualityFor(size)) != null) {
            return qualityFindNearestHigherSupportedQualityFor;
        }
        Quality quality = Quality.NONE;
        x.e(quality, "NONE");
        return quality;
    }

    public final VideoValidatedEncoderProfilesProxy getProfiles(Quality quality, DynamicRange dynamicRange) {
        x.f(quality, "quality");
        x.f(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.getProfiles(quality);
        }
        return null;
    }

    public final Size getResolution(Quality quality, DynamicRange dynamicRange) {
        x.f(quality, "quality");
        x.f(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.getResolution(quality);
        }
        return null;
    }

    public final Set<DynamicRange> getSupportedDynamicRanges() {
        return this.supportedDynamicRanges;
    }

    public final List<Quality> getSupportedQualities(DynamicRange dynamicRange) {
        List<Quality> supportedQualities;
        x.f(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        return (capabilities == null || (supportedQualities = capabilities.getSupportedQualities()) == null) ? i.h() : supportedQualities;
    }

    public final boolean isQualitySupported(Quality quality, DynamicRange dynamicRange) {
        x.f(quality, "quality");
        x.f(dynamicRange, "dynamicRange");
        CapabilitiesByQuality capabilities = getCapabilities(dynamicRange);
        if (capabilities != null) {
            return capabilities.isQualitySupported(quality);
        }
        return false;
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
