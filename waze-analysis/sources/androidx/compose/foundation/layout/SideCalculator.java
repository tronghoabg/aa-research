package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.layout.SideCalculator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(i2, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo2803consumedOffsetsMKHz9U(long j2) {
                return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo2804consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(Velocity.m11406getXimpl(j2) - f2, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f2, float f3) {
                return n.f(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f2, float f3) {
                return n.e(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return f2;
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(insets.left, i2, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo2803consumedOffsetsMKHz9U(long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                return (Float.floatToRawIntBits(0.0f) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fIntBitsToFloat));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo2804consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(0.0f, Velocity.m11407getYimpl(j2) - f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f2, float f3) {
                return n.f(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f2, float f3) {
                return n.e(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return f3;
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(insets.left, insets.top, i2, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo2803consumedOffsetsMKHz9U(long j2) {
                return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo2804consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(Velocity.m11406getXimpl(j2) + f2, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f2, float f3) {
                return n.f(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return -f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f2, float f3) {
                return n.e(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.right;
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i2) {
                return Insets.of(insets.left, insets.top, insets.right, i2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo2803consumedOffsetsMKHz9U(long j2) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                return (Float.floatToRawIntBits(0.0f) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fIntBitsToFloat));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo2804consumedVelocityQWom1Mo(long j2, float f2) {
                return VelocityKt.Velocity(0.0f, Velocity.m11407getYimpl(j2) + f2);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float hideMotion(float f2, float f3) {
                return n.f(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f2, float f3) {
                return -f3;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public /* synthetic */ float showMotion(float f2, float f3) {
                return n.e(motionOf(f2, f3), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.bottom;
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m2805chooseCalculatorni1skBw(int i2, LayoutDirection layoutDirection) {
            if (WindowInsetsSides.m2857equalsimpl0(i2, WindowInsetsSides.Companion.m2871getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m2857equalsimpl0(i2, WindowInsetsSides.Companion.m2874getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m2857equalsimpl0(i2, WindowInsetsSides.Companion.m2872getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m2857equalsimpl0(i2, WindowInsetsSides.Companion.m2868getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m2857equalsimpl0(i2, WindowInsetsSides.Companion.m2873getStartJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.m2857equalsimpl0(i2, WindowInsetsSides.Companion.m2869getEndJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    Insets adjustInsets(Insets insets, int i2);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo2803consumedOffsetsMKHz9U(long j2);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo2804consumedVelocityQWom1Mo(long j2, float f2);

    float hideMotion(float f2, float f3);

    float motionOf(float f2, float f3);

    float showMotion(float f2, float f3);

    int valueOf(Insets insets);
}
