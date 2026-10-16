package androidx.compose.material3.carousel;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i2, float f2, int i3, float f3, int i4, float f4, int i5) {
        this.priority = i2;
        this.smallSize = f2;
        this.smallCount = i3;
        this.mediumSize = f3;
        this.mediumCount = i4;
        this.largeSize = f4;
        this.largeCount = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float f2) {
        if (!isValid()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f2 - this.largeSize) * this.priority;
    }

    private final boolean isValid() {
        int i2 = this.largeCount;
        if (i2 <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i2 <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f2 = this.largeSize;
        float f3 = this.mediumSize;
        return f2 > f3 && f3 > this.smallSize;
    }

    public final int getLargeCount() {
        return this.largeCount;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    public final int getMediumCount() {
        return this.mediumCount;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final int getSmallCount() {
        return this.smallCount;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final int itemCount() {
        return this.largeCount + this.mediumCount + this.smallCount;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final float calculateLargeSize(float f2, int i2, float f3, int i3, int i4) {
            float f4 = i3 / 2.0f;
            return (f2 - ((i2 + f4) * f3)) / (i4 + f4);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final androidx.compose.material3.carousel.Arrangement fit(int r11, float r12, float r13, int r14, float r15, float r16, float r17, int r18, float r19, int r20, float r21) {
            /*
                r10 = this;
                r4 = r18
                r5 = r20
                float r0 = h.k.n.g(r15, r16, r17)
                float r1 = (float) r14
                float r2 = r0 * r1
                int r3 = r5 + r4
                int r3 = r3 + r14
                float r6 = (float) r4
                float r7 = (float) r5
                float r8 = r21 * r7
                float r9 = r19 * r6
                float r8 = r8 + r9
                int r3 = r3 + (-1)
                float r3 = (float) r3
                float r3 = r3 * r13
                float r12 = r12 - r3
                float r8 = r8 + r2
                float r13 = r12 - r8
                r8 = 0
                if (r14 <= 0) goto L2d
                int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r2 <= 0) goto L2d
                float r13 = r13 / r1
                float r1 = r17 - r0
                float r13 = java.lang.Math.min(r13, r1)
            L2b:
                float r0 = r0 + r13
                goto L3b
            L2d:
                if (r14 <= 0) goto L3b
                int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r2 >= 0) goto L3b
                float r13 = r13 / r1
                float r1 = r16 - r0
                float r13 = java.lang.Math.max(r13, r1)
                goto L2b
            L3b:
                if (r14 > 0) goto L42
                r3 = r8
                r0 = r10
                r1 = r12
                r2 = r14
                goto L46
            L42:
                r3 = r0
                r1 = r12
                r2 = r14
                r0 = r10
            L46:
                float r10 = r0.calculateLargeSize(r1, r2, r3, r4, r5)
                r2 = r3
                float r3 = r10 + r2
                r12 = 1073741824(0x40000000, float:2.0)
                float r3 = r3 / r12
                if (r18 <= 0) goto L75
                int r12 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
                if (r12 == 0) goto L75
                float r12 = r21 - r10
                r13 = 1036831949(0x3dcccccd, float:0.1)
                float r13 = r13 * r3
                float r12 = r12 * r7
                float r13 = r13 * r6
                float r0 = java.lang.Math.abs(r12)
                float r13 = java.lang.Math.min(r0, r13)
                int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r12 <= 0) goto L70
                float r12 = r13 / r6
                float r3 = r3 - r12
                float r13 = r13 / r7
                float r10 = r10 + r13
                goto L75
            L70:
                float r12 = r13 / r6
                float r3 = r3 + r12
                float r13 = r13 / r7
                float r10 = r10 - r13
            L75:
                r6 = r10
                r4 = r3
                androidx.compose.material3.carousel.Arrangement r0 = new androidx.compose.material3.carousel.Arrangement
                r1 = r11
                r3 = r14
                r5 = r18
                r7 = r20
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.Arrangement.Companion.fit(int, float, float, int, float, float, float, int, float, int, float):androidx.compose.material3.carousel.Arrangement");
        }

        public final Arrangement findLowestCostArrangement(float f2, float f3, float f4, float f5, float f6, int[] iArr, float f7, int[] iArr2, float f8, int[] iArr3) {
            int[] iArr4 = iArr;
            int length = iArr3.length;
            int i2 = 1;
            Arrangement arrangement = null;
            int i3 = 0;
            while (i3 < length) {
                int i4 = iArr3[i3];
                int length2 = iArr2.length;
                int i5 = 0;
                while (i5 < length2) {
                    int i6 = iArr2[i5];
                    int length3 = iArr4.length;
                    Arrangement arrangement2 = arrangement;
                    int i7 = i2;
                    Arrangement arrangement3 = arrangement2;
                    int i8 = 0;
                    while (i8 < length3) {
                        int i9 = i5;
                        int i10 = iArr4[i8];
                        Arrangement arrangement4 = arrangement3;
                        int i11 = i3;
                        int i12 = length2;
                        int i13 = length3;
                        int i14 = i8;
                        Arrangement arrangementFit = fit(i7, f2, f3, i10, f4, f5, f6, i6, f7, i4, f8);
                        if (arrangement4 != null && arrangementFit.cost(f8) >= arrangement4.cost(f8)) {
                            arrangement3 = arrangement4;
                        } else {
                            if (arrangementFit.cost(f8) == 0.0f) {
                                return arrangementFit;
                            }
                            arrangement3 = arrangementFit;
                        }
                        i7++;
                        i8 = i14 + 1;
                        iArr4 = iArr;
                        i3 = i11;
                        length2 = i12;
                        i5 = i9;
                        length3 = i13;
                    }
                    Arrangement arrangement5 = arrangement3;
                    i5++;
                    i2 = i7;
                    arrangement = arrangement5;
                    iArr4 = iArr;
                }
                i3++;
                iArr4 = iArr;
            }
            return arrangement;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
