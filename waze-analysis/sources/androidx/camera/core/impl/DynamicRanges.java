package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import e.c.d.a;
import h.g.b.x;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRanges {
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    private DynamicRanges() {
    }

    private final boolean canMatchBitDepth(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return dynamicRange.getBitDepth() == 0 || dynamicRange.getBitDepth() == dynamicRange2.getBitDepth();
    }

    private final boolean canMatchEncoding(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        Preconditions.checkState(dynamicRange2.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = dynamicRange.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = dynamicRange2.getEncoding();
        if (encoding == 2) {
            if (encoding2 != 1) {
                return true;
            }
            encoding2 = 1;
            encoding = 2;
        }
        return encoding == encoding2;
    }

    public static final boolean canResolve(DynamicRange dynamicRange, Set<DynamicRange> set) {
        Object next;
        x.f(dynamicRange, "dynamicRangeToTest");
        x.f(set, "fullySpecifiedDynamicRanges");
        if (dynamicRange.isFullySpecified()) {
            return set.contains(dynamicRange);
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, (DynamicRange) next)) {
                break;
            }
        }
        return next != null;
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
        return canMatchBitDepth(dynamicRange, dynamicRange2) && canMatchEncoding(dynamicRange, dynamicRange2);
    }

    public static final Set<DynamicRange> findAllPossibleMatches(Set<DynamicRange> set, Set<DynamicRange> set2) {
        x.f(set, "dynamicRangesToTest");
        x.f(set2, "fullySpecifiedDynamicRanges");
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        Set setM = a.m();
        for (DynamicRange dynamicRange : set) {
            if (!dynamicRange.isFullySpecified()) {
                for (DynamicRange dynamicRange2 : set2) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        setM.add(dynamicRange2);
                    }
                }
            } else if (set2.contains(dynamicRange)) {
                setM.add(dynamicRange);
            }
        }
        return a.l(setM);
    }
}
