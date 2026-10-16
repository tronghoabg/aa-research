package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface LayoutCoordinates {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.LayoutCoordinates$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getIntroducesMotionFrameOfReference(LayoutCoordinates layoutCoordinates) {
            return false;
        }

        /* renamed from: $default$localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m9753$default$localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z) {
            throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
        }

        /* renamed from: $default$localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m9754$default$localToScreenMKHz9U(LayoutCoordinates layoutCoordinates, long j2) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }

        /* renamed from: $default$screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m9755$default$screenToLocalMKHz9U(LayoutCoordinates layoutCoordinates, long j2) {
            return Offset.Companion.m7995getUnspecifiedF1C5BW0();
        }

        /* renamed from: $default$transformToScreen-58bKbWc, reason: not valid java name */
        public static void m9757$default$transformToScreen58bKbWc(LayoutCoordinates layoutCoordinates, float[] fArr) {
            throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
        }

        public static /* synthetic */ boolean access$getIntroducesMotionFrameOfReference$jd(LayoutCoordinates layoutCoordinates) {
            return false;
        }

        public static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z, int i2, Object obj) {
            if (obj == null) {
                return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z | (!((i2 & 2) == 0)));
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }

        /* renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
        public static /* synthetic */ long m9763localPositionOfS_NoaFU$default(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
            }
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m7996getZeroF1C5BW0();
            }
            return layoutCoordinates.mo9745localPositionOfS_NoaFU(layoutCoordinates2, j2, z | (!((i2 & 4) == 0)));
        }
    }

    int get(AlignmentLine alignmentLine);

    boolean getIntroducesMotionFrameOfReference();

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo9743getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z);

    /* renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo9744localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j2);

    /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    long mo9745localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j2, boolean z);

    /* renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo9746localToRootMKHz9U(long j2);

    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    long mo9747localToScreenMKHz9U(long j2);

    /* renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo9748localToWindowMKHz9U(long j2);

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    long mo9749screenToLocalMKHz9U(long j2);

    /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    void mo9750transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr);

    /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    void mo9751transformToScreen58bKbWc(float[] fArr);

    /* renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo9752windowToLocalMKHz9U(long j2);

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(LayoutCoordinates layoutCoordinates) {
            return false;
        }

        @Deprecated
        /* renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m9764localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j2, boolean z) {
            return CC.m9753$default$localPositionOfS_NoaFU(layoutCoordinates, layoutCoordinates2, j2, z);
        }

        @Deprecated
        /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m9766localToScreenMKHz9U(LayoutCoordinates layoutCoordinates, long j2) {
            return CC.m9754$default$localToScreenMKHz9U(layoutCoordinates, j2);
        }

        @Deprecated
        /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m9767screenToLocalMKHz9U(LayoutCoordinates layoutCoordinates, long j2) {
            return CC.m9755$default$screenToLocalMKHz9U(layoutCoordinates, j2);
        }

        @Deprecated
        /* renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m9768transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, float[] fArr) {
            InlineClassHelperKt.throwUnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
        }

        @Deprecated
        /* renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m9769transformToScreen58bKbWc(LayoutCoordinates layoutCoordinates, float[] fArr) {
            CC.m9757$default$transformToScreen58bKbWc(layoutCoordinates, fArr);
        }

        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }
    }
}
