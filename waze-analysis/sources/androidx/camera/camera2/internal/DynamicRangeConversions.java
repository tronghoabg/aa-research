package androidx.camera.camera2.internal;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.core.DynamicRange;
import androidx.media3.common.video.Frame;
import h.a.i;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeConversions {
    private static final Map<DynamicRange, List<Long>> DR_TO_PROFILE_MAP;
    public static final DynamicRangeConversions INSTANCE = new DynamicRangeConversions();
    private static final Map<Long, DynamicRange> PROFILE_TO_DR_MAP;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PROFILE_TO_DR_MAP = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        DR_TO_PROFILE_MAP = linkedHashMap2;
        linkedHashMap.put(1L, DynamicRange.SDR);
        linkedHashMap2.put(DynamicRange.SDR, i.d(1L));
        linkedHashMap.put(2L, DynamicRange.HLG_10_BIT);
        linkedHashMap2.put(linkedHashMap.get(2L), i.d(2L));
        linkedHashMap.put(4L, DynamicRange.HDR10_10_BIT);
        linkedHashMap2.put(DynamicRange.HDR10_10_BIT, i.d(4L));
        linkedHashMap.put(8L, DynamicRange.HDR10_PLUS_10_BIT);
        linkedHashMap2.put(DynamicRange.HDR10_PLUS_10_BIT, i.d(8L));
        List<Long> listI = i.i(64L, 128L, 16L, 32L);
        Iterator<Long> it = listI.iterator();
        while (it.hasNext()) {
            PROFILE_TO_DR_MAP.put(Long.valueOf(it.next().longValue()), DynamicRange.DOLBY_VISION_10_BIT);
        }
        DR_TO_PROFILE_MAP.put(DynamicRange.DOLBY_VISION_10_BIT, listI);
        List<Long> listI2 = i.i(1024L, Long.valueOf(Frame.USAGE_COMPOSER_OVERLAY), 256L, 512L);
        Iterator<Long> it2 = listI2.iterator();
        while (it2.hasNext()) {
            PROFILE_TO_DR_MAP.put(Long.valueOf(it2.next().longValue()), DynamicRange.DOLBY_VISION_8_BIT);
        }
        DR_TO_PROFILE_MAP.put(DynamicRange.DOLBY_VISION_8_BIT, listI2);
    }

    private DynamicRangeConversions() {
    }

    public final Long dynamicRangeToFirstSupportedProfile(DynamicRange dynamicRange, DynamicRangeProfiles dynamicRangeProfiles) {
        x.f(dynamicRange, "dynamicRange");
        x.f(dynamicRangeProfiles, "dynamicRangeProfiles");
        List<Long> list = DR_TO_PROFILE_MAP.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        x.e(supportedProfiles, "getSupportedProfiles(...)");
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            Long lValueOf = Long.valueOf(it.next().longValue());
            if (supportedProfiles.contains(lValueOf)) {
                return lValueOf;
            }
        }
        return null;
    }

    public final DynamicRange profileToDynamicRange(long j2) {
        return PROFILE_TO_DR_MAP.get(Long.valueOf(j2));
    }
}
