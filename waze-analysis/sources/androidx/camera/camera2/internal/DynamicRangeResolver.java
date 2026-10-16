package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.core.util.Preconditions;
import h.a.c;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeResolver {
    private final CameraMetadata cameraMetadata;
    private final DynamicRangeProfilesCompat dynamicRangesInfo;
    private final boolean is10BitSupported;

    /* compiled from: WazeSource */
    public final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final DynamicRange getRecommended10BitDynamicRange(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE;
            x.e(key, "REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE");
            Long l2 = (Long) cameraMetadata.get(key);
            if (l2 != null) {
                return DynamicRangeConversions.INSTANCE.profileToDynamicRange(l2.longValue());
            }
            return null;
        }
    }

    public DynamicRangeResolver(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        this.cameraMetadata = cameraMetadata;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        x.e(key, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) cameraMetadata.get(key);
        this.is10BitSupported = iArr != null ? c.ah(iArr, 18) : false;
        this.dynamicRangesInfo = DynamicRangeProfilesCompat.Companion.fromCameraMetaData(cameraMetadata);
    }

    private final boolean canResolveDynamicRange(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        if (!dynamicRange2.isFullySpecified()) {
            throw new IllegalStateException("Fully specified range " + dynamicRange2 + " not actually fully specified.");
        }
        if (dynamicRange.getEncoding() == 2 && dynamicRange2.getEncoding() == 1) {
            return false;
        }
        if (dynamicRange.getEncoding() == 2 || dynamicRange.getEncoding() == 0 || dynamicRange.getEncoding() == dynamicRange2.getEncoding()) {
            return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
        }
        return false;
    }

    private final boolean canResolveWithinConstraints(DynamicRange dynamicRange, DynamicRange dynamicRange2, Set<DynamicRange> set) {
        if (set.contains(dynamicRange2)) {
            return canResolveDynamicRange(dynamicRange, dynamicRange2);
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isDebugEnabled(Log.TAG)) {
            return false;
        }
        android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dynamicRange + "\nCandidate dynamic range:\n  " + dynamicRange2);
        return false;
    }

    private final DynamicRange findSupportedHdrMatch(DynamicRange dynamicRange, Collection<DynamicRange> collection, Set<DynamicRange> set) {
        if (dynamicRange.getEncoding() == 1) {
            return null;
        }
        for (DynamicRange dynamicRange2 : collection) {
            int encoding = dynamicRange2.getEncoding();
            if (!dynamicRange2.isFullySpecified()) {
                throw new IllegalStateException("Fully specified DynamicRange must have fully defined encoding.");
            }
            if (encoding != 1 && canResolveWithinConstraints(dynamicRange, dynamicRange2, set)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    private final boolean isFullyUnspecified(DynamicRange dynamicRange) {
        return x.n(dynamicRange, DynamicRange.UNSPECIFIED);
    }

    private final boolean isPartiallySpecified(DynamicRange dynamicRange) {
        if (dynamicRange.getEncoding() == 2) {
            return true;
        }
        if (dynamicRange.getEncoding() == 0 || dynamicRange.getBitDepth() != 0) {
            return dynamicRange.getEncoding() == 0 && dynamicRange.getBitDepth() != 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.core.DynamicRange resolveDynamicRange(androidx.camera.core.DynamicRange r8, java.util.Set<androidx.camera.core.DynamicRange> r9, java.util.Set<androidx.camera.core.DynamicRange> r10, java.util.Set<androidx.camera.core.DynamicRange> r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.DynamicRangeResolver.resolveDynamicRange(androidx.camera.core.DynamicRange, java.util.Set, java.util.Set, java.util.Set, java.lang.String):androidx.camera.core.DynamicRange");
    }

    private final DynamicRange resolveDynamicRangeAndUpdateConstraints(Set<DynamicRange> set, Set<DynamicRange> set2, Set<DynamicRange> set3, UseCaseConfig<?> useCaseConfig, Set<DynamicRange> set4) {
        DynamicRange dynamicRange = useCaseConfig.getDynamicRange();
        x.e(dynamicRange, "getDynamicRange(...)");
        String targetName = useCaseConfig.getTargetName();
        x.e(targetName, "getTargetName(...)");
        DynamicRange dynamicRangeResolveDynamicRange = resolveDynamicRange(dynamicRange, set4, set2, set3, targetName);
        if (dynamicRangeResolveDynamicRange != null) {
            updateConstraints(set4, dynamicRangeResolveDynamicRange, this.dynamicRangesInfo);
            return dynamicRangeResolveDynamicRange;
        }
        throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + useCaseConfig.getTargetName() + "\nRequested dynamic range:\n  " + dynamicRange + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + set4);
    }

    private final void updateConstraints(Set<DynamicRange> set, DynamicRange dynamicRange, DynamicRangeProfilesCompat dynamicRangeProfilesCompat) {
        Set<DynamicRange> set2 = set;
        Preconditions.checkState(!set2.isEmpty(), "Cannot update already-empty constraints.");
        Set<DynamicRange> dynamicRangeCaptureRequestConstraints = dynamicRangeProfilesCompat.getDynamicRangeCaptureRequestConstraints(dynamicRange);
        Set<DynamicRange> set3 = dynamicRangeCaptureRequestConstraints;
        if (set3.isEmpty()) {
            return;
        }
        Set setAu = i.au(set);
        set.retainAll(set3);
        if (set2.isEmpty()) {
            throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + dynamicRange + "\nConstraints:\n  " + dynamicRangeCaptureRequestConstraints + "\nExisting constraints:\n  " + setAu);
        }
    }

    public final CameraMetadata getCameraMetadata() {
        return this.cameraMetadata;
    }

    public final boolean is10BitDynamicRangeSupported() {
        return this.is10BitSupported;
    }

    public final Map<UseCaseConfig<?>, DynamicRange> resolveAndValidateDynamicRanges(List<? extends AttachedSurfaceInfo> list, List<? extends UseCaseConfig<?>> list2, List<Integer> list3) {
        x.f(list, "existingSurfaces");
        x.f(list2, "newUseCaseConfigs");
        x.f(list3, "useCasePriorityOrder");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange = it.next().getDynamicRange();
            x.e(dynamicRange, "getDynamicRange(...)");
            linkedHashSet.add(dynamicRange);
        }
        Set<DynamicRange> supportedDynamicRanges = this.dynamicRangesInfo.getSupportedDynamicRanges();
        Set<DynamicRange> setAt = i.at(supportedDynamicRanges);
        Iterator<DynamicRange> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            updateConstraints(setAt, it2.next(), this.dynamicRangesInfo);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            UseCaseConfig<?> useCaseConfig = list2.get(it3.next().intValue());
            DynamicRange dynamicRange2 = useCaseConfig.getDynamicRange();
            x.e(dynamicRange2, "getDynamicRange(...)");
            if (isFullyUnspecified(dynamicRange2)) {
                arrayList3.add(useCaseConfig);
            } else if (isPartiallySpecified(dynamicRange2)) {
                arrayList2.add(useCaseConfig);
            } else {
                arrayList.add(useCaseConfig);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<UseCaseConfig<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (UseCaseConfig<?> useCaseConfig2 : arrayList4) {
            DynamicRangeResolver dynamicRangeResolver = this;
            LinkedHashSet linkedHashSet3 = linkedHashSet2;
            DynamicRange dynamicRangeResolveDynamicRangeAndUpdateConstraints = dynamicRangeResolver.resolveDynamicRangeAndUpdateConstraints(supportedDynamicRanges, linkedHashSet, linkedHashSet3, useCaseConfig2, setAt);
            linkedHashMap.put(useCaseConfig2, dynamicRangeResolveDynamicRangeAndUpdateConstraints);
            if (!linkedHashSet.contains(dynamicRangeResolveDynamicRangeAndUpdateConstraints)) {
                linkedHashSet3.add(dynamicRangeResolveDynamicRangeAndUpdateConstraints);
            }
            this = dynamicRangeResolver;
            linkedHashSet2 = linkedHashSet3;
        }
        return linkedHashMap;
    }
}
