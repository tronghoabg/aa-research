package androidx.camera.camera2.compat;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DynamicRangeProfilesCompatBaseImpl implements DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl {
    public static final Companion Companion = new Companion(null);
    private static final DynamicRangeProfilesCompat COMPAT_INSTANCE = new DynamicRangeProfilesCompat(new DynamicRangeProfilesCompatBaseImpl());
    private static final Set<DynamicRange> SDR_ONLY = a.o(DynamicRange.SDR);

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getDynamicRangeCaptureRequestConstraints(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        boolean zN = x.n(DynamicRange.SDR, dynamicRange);
        Objects.toString(dynamicRange);
        Preconditions.checkArgument(zN, "DynamicRange is not supported: ".concat(String.valueOf(dynamicRange)));
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return SDR_ONLY;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public boolean isExtraLatencyPresent(DynamicRange dynamicRange) {
        x.f(dynamicRange, "dynamicRange");
        boolean zN = x.n(DynamicRange.SDR, dynamicRange);
        Objects.toString(dynamicRange);
        Preconditions.checkArgument(zN, "DynamicRange is not supported: ".concat(String.valueOf(dynamicRange)));
        return false;
    }

    @Override // androidx.camera.camera2.compat.DynamicRangeProfilesCompat.DynamicRangeProfilesCompatImpl
    public DynamicRangeProfiles unwrap() {
        return null;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final DynamicRangeProfilesCompat getCOMPAT_INSTANCE() {
            return DynamicRangeProfilesCompatBaseImpl.COMPAT_INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
