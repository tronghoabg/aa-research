package androidx.compose.animation.core;

import h.a.c;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ArcSpline {
    public static final int $stable = 8;
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;

    /* compiled from: WazeSource */
    public final class Arc {
        public static final int $stable = 8;
        private float arcDistance;
        private final float arcVelocity;
        public final float ellipseA;
        public final float ellipseB;
        public final float ellipseCenterX;
        public final float ellipseCenterY;
        public final boolean isLinear;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public Arc(int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
            this.time1 = f2;
            this.time2 = f3;
            this.x1 = f4;
            this.y1 = f5;
            this.x2 = f6;
            this.y2 = f7;
            float f8 = f7 - f5;
            boolean z = false;
            boolean z2 = i2 == 1 || (i2 == 4 ? f8 > 0.0f : !(i2 != 5 || f8 >= 0.0f));
            float f9 = f6 - f4;
            float f10 = true != z2 ? 1.0f : -1.0f;
            this.vertical = f10;
            float f11 = 1.0f / (f3 - f2);
            this.oneOverDeltaTime = f11;
            this.lut = new float[101];
            if (i2 == 3 || Math.abs(f9) < 0.001f || Math.abs(f8) < 0.001f) {
                float fHypot = (float) Math.hypot(f8, f9);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f11;
                this.ellipseCenterX = f9 * f11;
                this.ellipseCenterY = f8 * f11;
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
                z = true;
            } else {
                this.ellipseA = f9 * f10;
                this.ellipseB = f8 * (-f10);
                this.ellipseCenterX = z2 ? f6 : f4;
                this.ellipseCenterY = z2 ? f5 : f7;
                buildTable$animation_core(f4, f5, f6, f7);
                this.arcVelocity = this.arcDistance * f11;
            }
            this.isLinear = z;
        }

        private final float calcAngle(float f2) {
            return lookup((this.vertical == -1.0f ? this.time2 - f2 : f2 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
        }

        private final float lookup(float f2) {
            if (f2 <= 0.0f) {
                return 0.0f;
            }
            if (f2 >= 1.0f) {
                return 1.0f;
            }
            float f3 = f2 * 100.0f;
            float[] fArr = this.lut;
            int i2 = (int) f3;
            float f4 = fArr[i2];
            return f4 + ((f3 - i2) * (fArr[i2 + 1] - f4));
        }

        public final void buildTable$animation_core(float f2, float f3, float f4, float f5) {
            float f6;
            float fHypot;
            float[] fArr = ArcSplineKt.OurPercentCache;
            int length = fArr.length - 1;
            if (length > 0) {
                float f7 = f3 - f5;
                float f8 = f7;
                int i2 = 1;
                fHypot = 0.0f;
                float f9 = 0.0f;
                while (true) {
                    double d2 = (float) (((i2 * 90.0d) / length) * 0.017453292519943295d);
                    float fSin = (float) Math.sin(d2);
                    float fCos = ((float) Math.cos(d2)) * f7;
                    float f10 = (f4 - f2) * fSin;
                    double d3 = f10 - f9;
                    f6 = 0.0f;
                    fHypot += (float) Math.hypot(d3, fCos - f8);
                    fArr[i2] = fHypot;
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    f9 = f10;
                    f8 = fCos;
                }
            } else {
                f6 = 0.0f;
                fHypot = 0.0f;
            }
            this.arcDistance = fHypot;
            if (length > 0) {
                int i3 = 1;
                while (true) {
                    fArr[i3] = fArr[i3] / fHypot;
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            float[] fArr2 = this.lut;
            int length2 = fArr2.length;
            for (int i4 = 0; i4 < length2; i4++) {
                float f11 = length;
                float f12 = i4 / 100.0f;
                int iAm = c.am(fArr, f12);
                if (iAm >= 0) {
                    fArr2[i4] = iAm / f11;
                } else if (iAm == -1) {
                    fArr2[i4] = f6;
                } else {
                    int i5 = -iAm;
                    int i6 = i5 - 1;
                    int i7 = i5 - 2;
                    float f13 = fArr[i7];
                    fArr2[i4] = (i7 + ((f12 - f13) / (fArr[i6] - f13))) / f11;
                }
            }
        }

        public final float calcDX() {
            float f2 = this.ellipseA * this.tmpCosAngle;
            return f2 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f2, (-this.ellipseB) * this.tmpSinAngle)));
        }

        public final float calcDY() {
            float f2 = this.ellipseA * this.tmpCosAngle;
            float f3 = (-this.ellipseB) * this.tmpSinAngle;
            return f3 * this.vertical * (this.arcVelocity / ((float) Math.hypot(f2, f3)));
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        public final float getLinearDX$animation_core() {
            return this.ellipseCenterX;
        }

        public final float getLinearDY$animation_core() {
            return this.ellipseCenterY;
        }

        public final float getLinearX(float f2) {
            float f3 = this.x2;
            float f4 = this.x1;
            return f4 + ((f2 - this.time1) * this.oneOverDeltaTime * (f3 - f4));
        }

        public final float getLinearY(float f2) {
            float f3 = this.y2;
            float f4 = this.y1;
            return f4 + ((f2 - this.time1) * this.oneOverDeltaTime * (f3 - f4));
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final void setPoint(float f2) {
            double dLookup = lookup((this.vertical == -1.0f ? this.time2 - f2 : f2 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dLookup);
            this.tmpCosAngle = (float) Math.cos(dLookup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[PHI: r10
  0x0030: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x0018, B:11:0x0022, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcSpline(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r2 = 1
            r0.isExtrapolate = r2
            int r3 = r1.length
            int r3 = r3 + (-1)
            androidx.compose.animation.core.ArcSpline$Arc[][] r4 = new androidx.compose.animation.core.ArcSpline.Arc[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L13:
            if (r6 >= r3) goto L76
            r9 = r24[r6]
            r10 = 3
            if (r9 == 0) goto L30
            if (r9 == r2) goto L2d
            r11 = 2
            if (r9 == r11) goto L2b
            if (r9 == r10) goto L29
            r10 = 4
            if (r9 == r10) goto L30
            r10 = 5
            if (r9 == r10) goto L30
            r9 = r8
            goto L31
        L29:
            if (r7 != r2) goto L2d
        L2b:
            r7 = r11
            goto L2e
        L2d:
            r7 = r2
        L2e:
            r9 = r7
            goto L31
        L30:
            r9 = r10
        L31:
            r8 = r26[r6]
            int r16 = r6 + 1
            r17 = r26[r16]
            r10 = r1[r6]
            r11 = r1[r16]
            int r12 = r8.length
            int r13 = r12 >> 1
            r12 = r12 & r2
            int r12 = r12 + r13
            androidx.compose.animation.core.ArcSpline$Arc[] r13 = new androidx.compose.animation.core.ArcSpline.Arc[r12]
            r14 = r5
        L43:
            if (r14 >= r12) goto L6e
            int r15 = r14 + r14
            r18 = r8
            androidx.compose.animation.core.ArcSpline$Arc r8 = new androidx.compose.animation.core.ArcSpline$Arc
            r19 = r12
            r12 = r18[r15]
            int r20 = r15 + 1
            r21 = r13
            r13 = r18[r20]
            r15 = r17[r15]
            r20 = r17[r20]
            r22 = r20
            r20 = r14
            r14 = r15
            r15 = r22
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r21[r20] = r8
            int r14 = r20 + 1
            r8 = r18
            r12 = r19
            r13 = r21
            goto L43
        L6e:
            r21 = r13
            r4[r6] = r21
            r8 = r9
            r6 = r16
            goto L13
        L76:
            r0.arcs = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.<init>(int[], float[], float[][]):void");
    }

    public final void getPos(float f2, float[] fArr) {
        Arc[][] arcArr = this.arcs;
        int length = arcArr.length - 1;
        int i2 = 0;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[length][0].getTime2();
        boolean z = this.isExtrapolate;
        int length2 = fArr.length;
        if (!z) {
            f2 = Math.min(Math.max(f2, time1), time2);
        } else if (f2 < time1 || f2 > time2) {
            int i3 = length2 - 1;
            if (f2 > time2) {
                time1 = time2;
            }
            if (f2 <= time2) {
                length = 0;
            }
            float f3 = f2 - time1;
            int i4 = 0;
            while (i2 < i3) {
                int i5 = i2 + 1;
                Arc arc = arcArr[length][i4];
                if (arc.isLinear) {
                    fArr[i2] = arc.getLinearX(time1) + (arc.ellipseCenterX * f3);
                    fArr[i5] = arc.getLinearY(time1) + (arc.ellipseCenterY * f3);
                } else {
                    arc.setPoint(time1);
                    fArr[i2] = arc.ellipseCenterX + (arc.ellipseA * arc.tmpSinAngle) + (arc.calcDX() * f3);
                    fArr[i5] = arc.ellipseCenterY + (arc.ellipseB * arc.tmpCosAngle) + (arc.calcDY() * f3);
                }
                i2 += 2;
                i4++;
            }
            return;
        }
        boolean z2 = false;
        for (Arc[] arcArr2 : arcArr) {
            int i6 = 0;
            for (int i7 = 0; i7 < length2 - 1; i7 += 2) {
                Arc arc2 = arcArr2[i6];
                if (f2 <= arc2.getTime2()) {
                    int i8 = i7 + 1;
                    if (arc2.isLinear) {
                        fArr[i7] = arc2.getLinearX(f2);
                        fArr[i8] = arc2.getLinearY(f2);
                    } else {
                        arc2.setPoint(f2);
                        fArr[i7] = arc2.ellipseCenterX + (arc2.ellipseA * arc2.tmpSinAngle);
                        fArr[i8] = arc2.ellipseCenterY + (arc2.ellipseB * arc2.tmpCosAngle);
                    }
                    z2 = true;
                }
                i6++;
            }
            if (z2) {
                return;
            }
        }
    }

    public final void getSlope(float f2, float[] fArr) {
        Arc[][] arcArr = this.arcs;
        float time1 = arcArr[0][0].getTime1();
        float time2 = arcArr[arcArr.length - 1][0].getTime2();
        if (f2 < time1) {
            f2 = time1;
        }
        if (f2 <= time2) {
            time2 = f2;
        }
        int length = fArr.length;
        boolean z = false;
        for (Arc[] arcArr2 : arcArr) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < length - 1) {
                Arc arc = arcArr2[i3];
                if (time2 <= arc.getTime2()) {
                    int i4 = i2 + 1;
                    if (arc.isLinear) {
                        fArr[i2] = arc.ellipseCenterX;
                        fArr[i4] = arc.ellipseCenterY;
                    } else {
                        arc.setPoint(time2);
                        fArr[i2] = arc.calcDX();
                        fArr[i4] = arc.calcDY();
                    }
                    z = true;
                }
                i2 += 2;
                i3++;
            }
            if (z) {
                return;
            }
        }
    }
}
