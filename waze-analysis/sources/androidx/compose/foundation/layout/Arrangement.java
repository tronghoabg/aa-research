package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.a.c;
import h.ab;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public String toString() {
            return "Arrangement#End";
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i2, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
            return 0.0f;
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = 0.0f;

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo2446getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout(i2, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = 0.0f;

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo2446getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i2, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = 0.0f;

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo2446getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i2, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = 0.0f;

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i2, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i2, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo2446getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i2, iArr, iArr2, false);
        }
    };

    /* compiled from: WazeSource */
    public interface Horizontal {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.layout.Arrangement$Horizontal$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m2447$default$getSpacingD9Ej5fM(Horizontal horizontal) {
                return 0.0f;
            }

            /* renamed from: access$getSpacing-D9Ej5fM$jd, reason: not valid java name */
            public static /* synthetic */ float m2448access$getSpacingD9Ej5fM$jd(Horizontal horizontal) {
                return 0.0f;
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m2449getSpacingD9Ej5fM(Horizontal horizontal) {
                return 0.0f;
            }
        }

        void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        float mo2446getSpacingD9Ej5fM();
    }

    /* compiled from: WazeSource */
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.layout.Arrangement$HorizontalOrVertical$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m2450$default$getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return 0.0f;
            }

            /* renamed from: access$getSpacing-D9Ej5fM$jd, reason: not valid java name */
            public static /* synthetic */ float m2451access$getSpacingD9Ej5fM$jd(HorizontalOrVertical horizontalOrVertical) {
                return 0.0f;
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m2452getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return 0.0f;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        float mo2446getSpacingD9Ej5fM();
    }

    /* compiled from: WazeSource */
    public interface SpacingAlignmentCalculator {
        int align(int i2, LayoutDirection layoutDirection);
    }

    /* compiled from: WazeSource */
    public interface Vertical {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.layout.Arrangement$Vertical$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m2457$default$getSpacingD9Ej5fM(Vertical vertical) {
                return 0.0f;
            }

            /* renamed from: access$getSpacing-D9Ej5fM$jd, reason: not valid java name */
            public static /* synthetic */ float m2458access$getSpacingD9Ej5fM$jd(Vertical vertical) {
                return 0.0f;
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m2459getSpacingD9Ej5fM(Vertical vertical) {
                return 0.0f;
            }
        }

        void arrange(Density density, int i2, int[] iArr, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        float mo2446getSpacingD9Ej5fM();
    }

    private Arrangement() {
    }

    private final void forEachIndexed(int[] iArr, boolean z, p<? super Integer, ? super Integer, ab> pVar) {
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                pVar.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i2]));
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    public final Horizontal aligned(final Alignment.Horizontal horizontal) {
        return new SpacedAligned(0.0f, true, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$$ExternalSyntheticLambda2
            @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
            public final int align(int i2, LayoutDirection layoutDirection) {
                return horizontal.align(0, i2, layoutDirection);
            }
        }, null);
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public final void placeLeftOrTop$foundation_layout(int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i4] = i3;
                i3 += i5;
                i2++;
                i4++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i6 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i6;
        }
    }

    public final void placeRightOrBottom$foundation_layout(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int i6 = i2 - i4;
        if (!z) {
            int length = iArr.length;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i6;
            i6 += i9;
        }
    }

    public final void placeSpaceAround$foundation_layout(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int length = iArr.length;
        float f2 = length == 0 ? 0.0f : (i2 - i4) / length;
        float f3 = f2 / 2.0f;
        if (!z) {
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f3);
                f3 += i7 + f2;
                i3++;
                i6++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i8 = iArr[length];
            iArr2[length] = Math.round(f3);
            f3 += i8 + f2;
        }
    }

    public final void placeSpaceBetween$foundation_layout(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float fMax = (i2 - i4) / Math.max(c.y(iArr), 1);
        float f2 = 0.0f;
        if (z && iArr.length == 1) {
            f2 = fMax;
        }
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7 + fMax;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8 + fMax;
        }
    }

    public final void placeSpaceEvenly$foundation_layout(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        int length = iArr.length;
        float f2 = (i2 - i4) / (length + 1);
        if (z) {
            float f3 = f2;
            for (int i6 = length - 1; i6 >= 0; i6--) {
                int i7 = iArr[i6];
                iArr2[i6] = Math.round(f3);
                f3 += i7 + f2;
            }
            return;
        }
        float f4 = f2;
        int i8 = 0;
        while (i3 < length) {
            int i9 = iArr[i3];
            iArr2[i8] = Math.round(f4);
            f4 += i9 + f2;
            i3++;
            i8++;
        }
    }

    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m2440spacedBy0680j_4(float f2) {
        return new SpacedAligned(f2, true, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$$ExternalSyntheticLambda4
            @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
            public final int align(int i2, LayoutDirection layoutDirection) {
                return Alignment.Companion.getStart().align(0, i2, layoutDirection);
            }
        }, null);
    }

    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m2441spacedByD5KLDUw(float f2, final Alignment.Horizontal horizontal) {
        return new SpacedAligned(f2, true, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$$ExternalSyntheticLambda0
            @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
            public final int align(int i2, LayoutDirection layoutDirection) {
                return horizontal.align(0, i2, layoutDirection);
            }
        }, null);
    }

    /* compiled from: WazeSource */
    public final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;
        private final SpacingAlignmentCalculator alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        private SpacedAligned(float f2, boolean z, SpacingAlignmentCalculator spacingAlignmentCalculator) {
            this.space = f2;
            this.rtlMirror = z;
            this.alignment = spacingAlignmentCalculator;
            this.spacing = f2;
        }

        /* renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m2453copy8Feqmps$default(SpacedAligned spacedAligned, float f2, boolean z, SpacingAlignmentCalculator spacingAlignmentCalculator, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f2 = spacedAligned.space;
            }
            if ((i2 & 2) != 0) {
                z = spacedAligned.rtlMirror;
            }
            if ((i2 & 4) != 0) {
                spacingAlignmentCalculator = spacedAligned.alignment;
            }
            return spacedAligned.m2455copy8Feqmps(f2, z, spacingAlignmentCalculator);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i3;
            int length = iArr.length;
            if (length == 0) {
                return;
            }
            int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(this.space);
            boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            if (z) {
                int i4 = 0;
                int iMin = 0;
                int i5 = 0;
                while (i4 < length) {
                    int iMax = Math.max(0, i2 - iArr[i4]);
                    iArr2[i5] = iMax;
                    iMin = Math.min(iMo2121roundToPx0680j_4, iMax);
                    i2 = iArr2[i5] - iMin;
                    i4++;
                    i5++;
                }
                i3 = i2 + iMin;
            } else {
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i6 < length) {
                    int i10 = iArr[i6];
                    int iMin2 = Math.min(i7, i2 - i10);
                    iArr2[i9] = iMin2;
                    int iMin3 = Math.min(iMo2121roundToPx0680j_4, (i2 - iMin2) - i10);
                    int i11 = iArr2[i9] + i10 + iMin3;
                    i6++;
                    i8 = iMin3;
                    i7 = i11;
                    i9++;
                }
                i3 = i2 - (i7 - i8);
            }
            SpacingAlignmentCalculator spacingAlignmentCalculator = this.alignment;
            if (spacingAlignmentCalculator == null || i3 <= 0) {
                return;
            }
            int iAlign = spacingAlignmentCalculator.align(i3, layoutDirection);
            if (z) {
                iAlign -= i3;
            }
            if (iAlign != 0) {
                int length2 = iArr2.length;
                for (int i12 = 0; i12 < length2; i12++) {
                    iArr2[i12] = iArr2[i12] + iAlign;
                }
            }
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name */
        public final float m2454component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        public final SpacingAlignmentCalculator component3() {
            return this.alignment;
        }

        /* renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m2455copy8Feqmps(float f2, boolean z, SpacingAlignmentCalculator spacingAlignmentCalculator) {
            return new SpacedAligned(f2, z, spacingAlignmentCalculator, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.m11169equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && x.n(this.alignment, spacedAligned.alignment);
        }

        public final SpacingAlignmentCalculator getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m2456getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo2446getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int iM11170hashCodeimpl = Dp.m11170hashCodeimpl(this.space) * 31;
            SpacingAlignmentCalculator spacingAlignmentCalculator = this.alignment;
            return ((iM11170hashCodeimpl + Arrangement$SpacedAligned$$ExternalSyntheticBackport0.m(this.rtlMirror)) * 31) + (spacingAlignmentCalculator == null ? 0 : spacingAlignmentCalculator.hashCode());
        }

        public String toString() {
            return (true != this.rtlMirror ? "Absolute" : "") + "Arrangement#spacedAligned(" + ((Object) Dp.m11175toStringimpl(this.space)) + ", " + this.alignment + ')';
        }

        public /* synthetic */ SpacedAligned(float f2, boolean z, SpacingAlignmentCalculator spacingAlignmentCalculator, o oVar) {
            this(f2, z, spacingAlignmentCalculator);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i2, int[] iArr, int[] iArr2) {
            arrange(density, i2, iArr, LayoutDirection.Ltr, iArr2);
        }
    }

    /* compiled from: WazeSource */
    public final class Absolute {
        public static final int $stable = 0;
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i2, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i2, iArr, iArr2, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* renamed from: getSpacing-D9Ej5fM */
            public /* synthetic */ float mo2446getSpacingD9Ej5fM() {
                return 0.0f;
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        public final Horizontal aligned(final Alignment.Horizontal horizontal) {
            return new SpacedAligned(0.0f, false, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$$ExternalSyntheticLambda1
                @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
                public final int align(int i2, LayoutDirection layoutDirection) {
                    return horizontal.align(0, i2, layoutDirection);
                }
            }, null);
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m2443spacedBy0680j_4(float f2) {
            return new SpacedAligned(f2, false, null, 0 == true ? 1 : 0);
        }

        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m2444spacedByD5KLDUw(float f2, final Alignment.Horizontal horizontal) {
            return new SpacedAligned(f2, false, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$$ExternalSyntheticLambda2
                @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
                public final int align(int i2, LayoutDirection layoutDirection) {
                    return horizontal.align(0, i2, layoutDirection);
                }
            }, null);
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getLeft$annotations() {
        }

        public static /* synthetic */ void getRight$annotations() {
        }

        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m2445spacedByD5KLDUw(float f2, final Alignment.Vertical vertical) {
            return new SpacedAligned(f2, false, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$$ExternalSyntheticLambda0
                @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
                public final int align(int i2, LayoutDirection layoutDirection) {
                    return vertical.align(0, i2);
                }
            }, null);
        }
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getCenter$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m2442spacedByD5KLDUw(float f2, final Alignment.Vertical vertical) {
        return new SpacedAligned(f2, false, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$$ExternalSyntheticLambda1
            @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
            public final int align(int i2, LayoutDirection layoutDirection) {
                return vertical.align(0, i2);
            }
        }, null);
    }

    public final Vertical aligned(final Alignment.Vertical vertical) {
        return new SpacedAligned(0.0f, false, new SpacingAlignmentCalculator() { // from class: androidx.compose.foundation.layout.Arrangement$$ExternalSyntheticLambda3
            @Override // androidx.compose.foundation.layout.Arrangement.SpacingAlignmentCalculator
            public final int align(int i2, LayoutDirection layoutDirection) {
                return vertical.align(0, i2);
            }
        }, null);
    }
}
