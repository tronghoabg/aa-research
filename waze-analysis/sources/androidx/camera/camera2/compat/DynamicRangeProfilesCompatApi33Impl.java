package androidx.camera.camera2.compat;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.internal.DynamicRangeConversions;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import e.c.d.a;
import h.g.b.x;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeProfilesCompatApi33Impl implements DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl {
    private final DynamicRangeProfiles dynamicRangeProfiles;

    public DynamicRangeProfilesCompatApi33Impl(DynamicRangeProfiles dynamicRangeProfiles) {
        x.f(dynamicRangeProfiles, "dynamicRangeProfiles");
        this.dynamicRangeProfiles = dynamicRangeProfiles;
    }

    private final Long dynamicRangeToFirstSupportedProfile(DynamicRange dynamicRange) {
        return DynamicRangeConversions.INSTANCE.dynamicRangeToFirstSupportedProfile(dynamicRange, this.dynamicRangeProfiles);
    }

    private final Set<DynamicRange> profileSetToDynamicRangeSet(Set<Long> set) {
        if (set.isEmpty()) {
            return a.p();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRangeProfileToDynamicRange = profileToDynamicRange(it.next().longValue());
            if (dynamicRangeProfileToDynamicRange != null) {
                linkedHashSet.add(dynamicRangeProfileToDynamicRange);
            }
        }
        Set<DynamicRange> setUnmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        x.e(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    private final DynamicRange profileToDynamicRange(long j2) {
        DynamicRange dynamicRangeProfileToDynamicRange = DynamicRangeConversions.INSTANCE.profileToDynamicRange(j2);
        if (dynamicRangeProfileToDynamicRange != null) {
            return dynamicRangeProfileToDynamicRange;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled(Log.TAG)) {
            return dynamicRangeProfileToDynamicRange;
        }
        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Dynamic range profile cannot be converted to a DynamicRange object: " + j2);
        return null;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        Long lDynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        if (lDynamicRangeToFirstSupportedProfile == null) {
            Objects.toString(dynamicRange);
            throw new IllegalArgumentException("DynamicRange is not supported: ".concat(String.valueOf(dynamicRange)));
        }
        Set<Long> profileCaptureRequestConstraints = this.dynamicRangeProfiles.getProfileCaptureRequestConstraints(lDynamicRangeToFirstSupportedProfile.longValue());
        x.e(profileCaptureRequestConstraints, "getProfileCaptureRequestConstraints(...)");
        return profileSetToDynamicRangeSet(profileCaptureRequestConstraints);
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getSupportedDynamicRanges() {
        Set<Long> supportedProfiles = this.dynamicRangeProfiles.getSupportedProfiles();
        x.e(supportedProfiles, "getSupportedProfiles(...)");
        return profileSetToDynamicRangeSet(supportedProfiles);
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        Long lDynamicRangeToFirstSupportedProfile = dynamicRangeToFirstSupportedProfile(dynamicRange);
        if (lDynamicRangeToFirstSupportedProfile != null) {
            return this.dynamicRangeProfiles.isExtraLatencyPresent(lDynamicRangeToFirstSupportedProfile.longValue());
        }
        Objects.toString(dynamicRange);
        throw new IllegalArgumentException("DynamicRange is not supported: ".concat(String.valueOf(dynamicRange)));
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public DynamicRangeProfiles unwrap() {
        return this.dynamicRangeProfiles;
    }
}
