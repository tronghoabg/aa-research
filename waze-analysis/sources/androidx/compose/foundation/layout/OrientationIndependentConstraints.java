package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m2721boximpl(long j2) {
        return new OrientationIndependentConstraints(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2724constructorimpl(long j2, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m2722constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m11109getMinWidthimpl(j2) : Constraints.m11108getMinHeightimpl(j2), layoutOrientation == layoutOrientation2 ? Constraints.m11107getMaxWidthimpl(j2) : Constraints.m11106getMaxHeightimpl(j2), layoutOrientation == layoutOrientation2 ? Constraints.m11108getMinHeightimpl(j2) : Constraints.m11109getMinWidthimpl(j2), layoutOrientation == layoutOrientation2 ? Constraints.m11106getMaxHeightimpl(j2) : Constraints.m11107getMaxWidthimpl(j2));
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m2725copyyUG9Ft0(long j2, int i2, int i3, int i4, int i5) {
        return m2722constructorimpl(i2, i3, i4, i5);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m2726copyyUG9Ft0$default(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = Constraints.m11109getMinWidthimpl(j2);
        }
        int i7 = i2;
        if ((i6 & 2) != 0) {
            i3 = Constraints.m11107getMaxWidthimpl(j2);
        }
        int i8 = i3;
        if ((i6 & 4) != 0) {
            i4 = Constraints.m11108getMinHeightimpl(j2);
        }
        int i9 = i4;
        if ((i6 & 8) != 0) {
            i5 = Constraints.m11106getMaxHeightimpl(j2);
        }
        return m2725copyyUG9Ft0(j2, i7, i8, i9, i5);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2727equalsimpl(long j2, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m11100equalsimpl0(j2, ((OrientationIndependentConstraints) obj).m2739unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2728equalsimpl0(long j2, long j3) {
        return Constraints.m11100equalsimpl0(j2, j3);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m2729getCrossAxisMaximpl(long j2) {
        return Constraints.m11106getMaxHeightimpl(j2);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m2730getCrossAxisMinimpl(long j2) {
        return Constraints.m11108getMinHeightimpl(j2);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m2731getMainAxisMaximpl(long j2) {
        return Constraints.m11107getMaxWidthimpl(j2);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m2732getMainAxisMinimpl(long j2) {
        return Constraints.m11109getMinWidthimpl(j2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2733hashCodeimpl(long j2) {
        return Constraints.m11110hashCodeimpl(j2);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m2734maxHeightimpl(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m11106getMaxHeightimpl(j2) : Constraints.m11107getMaxWidthimpl(j2);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m2735maxWidthimpl(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m11107getMaxWidthimpl(j2) : Constraints.m11106getMaxHeightimpl(j2);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m2736stretchCrossAxisq4ezo7Y(long j2) {
        return m2722constructorimpl(Constraints.m11109getMinWidthimpl(j2), Constraints.m11107getMaxWidthimpl(j2), Constraints.m11106getMaxHeightimpl(j2) != Integer.MAX_VALUE ? Constraints.m11106getMaxHeightimpl(j2) : Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m2737toBoxConstraintsOenEA2s(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m11109getMinWidthimpl(j2), Constraints.m11107getMaxWidthimpl(j2), Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2)) : ConstraintsKt.Constraints(Constraints.m11108getMinHeightimpl(j2), Constraints.m11106getMaxHeightimpl(j2), Constraints.m11109getMinWidthimpl(j2), Constraints.m11107getMaxWidthimpl(j2));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2738toStringimpl(long j2) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m11112toStringimpl(j2)) + ')';
    }

    public boolean equals(Object obj) {
        return m2727equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2733hashCodeimpl(this.value);
    }

    public String toString() {
        return m2738toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2739unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2722constructorimpl(int i2, int i3, int i4, int i5) {
        return ConstraintsKt.Constraints(i2, i3, i4, i5);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m2723constructorimpl(long j2) {
        return j2;
    }
}
