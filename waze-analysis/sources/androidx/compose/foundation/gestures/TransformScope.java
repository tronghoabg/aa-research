package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TransformScope {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
        public static /* synthetic */ void m2346transformByd4ec7I$default(TransformScope transformScope, float f2, long j2, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
            }
            if (1 == (i2 & 1)) {
                f2 = 1.0f;
            }
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            if ((i2 & 4) != 0) {
                f3 = 0.0f;
            }
            transformScope.mo2170transformByd4ec7I(f2, j2, f3);
        }

        /* renamed from: transformByWithCentroid-IEwrmTk$default, reason: not valid java name */
        public static /* synthetic */ void m2347transformByWithCentroidIEwrmTk$default(TransformScope transformScope, long j2, float f2, long j3, float f3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformByWithCentroid-IEwrmTk");
            }
            if ((i2 & 1) != 0) {
                j2 = Offset.Companion.m7995getUnspecifiedF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 2) != 0) {
                f2 = 1.0f;
            }
            float f4 = f2;
            if ((i2 & 4) != 0) {
                j3 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            long j5 = j3;
            if ((i2 & 8) != 0) {
                f3 = 0.0f;
            }
            transformScope.mo2171transformByWithCentroidIEwrmTk(j4, f4, j5, f3);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: transformByWithCentroid-IEwrmTk, reason: not valid java name */
        public static void m2349transformByWithCentroidIEwrmTk(TransformScope transformScope, long j2, float f2, long j3, float f3) {
            transformScope.mo2170transformByd4ec7I(f2, j3, f3);
        }
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo2170transformByd4ec7I(float f2, long j2, float f3);

    /* renamed from: transformByWithCentroid-IEwrmTk */
    void mo2171transformByWithCentroidIEwrmTk(long j2, float f2, long j3, float f3);
}
