package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_ABOVE = 5;
    public static final int ARC_BELOW = 4;
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int DOWN_ARC = 4;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    private static final int UP_ARC = 5;
    Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* compiled from: WazeSource */
    class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] sOurPercent = new double[91];
        double mArcDistance;
        double mArcVelocity;
        double mEllipseA;
        double mEllipseB;
        double mEllipseCenterX;
        double mEllipseCenterY;
        boolean mLinear;
        double[] mLut;
        double mOneOverDeltaTime;
        double mTime1;
        double mTime2;
        double mTmpCosAngle;
        double mTmpSinAngle;
        boolean mVertical;
        double mX1;
        double mX2;
        double mY1;
        double mY2;

        /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        Arc(int r15, double r16, double r18, double r20, double r22, double r24, double r26) {
            /*
                Method dump skipped, instructions count: 191
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc.<init>(int, double, double, double, double, double, double):void");
        }

        private void buildTable(double d2, double d3, double d4, double d5) {
            int i2 = 0;
            double dHypot = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d6 = AudioStats.AUDIO_AMPLITUDE_NONE;
            double d7 = AudioStats.AUDIO_AMPLITUDE_NONE;
            while (true) {
                if (i2 >= sOurPercent.length) {
                    break;
                }
                double radians = Math.toRadians((i2 * 90.0d) / (r11 - 1));
                double dSin = (d4 - d2) * Math.sin(radians);
                double dCos = (d3 - d5) * Math.cos(radians);
                if (i2 > 0) {
                    dHypot += Math.hypot(dSin - d6, dCos - d7);
                    sOurPercent[i2] = dHypot;
                }
                i2++;
                d7 = dCos;
                d6 = dSin;
            }
            this.mArcDistance = dHypot;
            int i3 = 0;
            while (true) {
                double[] dArr = sOurPercent;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] / dHypot;
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= this.mLut.length) {
                    return;
                }
                double d8 = i4 / (r2 - 1);
                int iBinarySearch = Arrays.binarySearch(sOurPercent, d8);
                if (iBinarySearch >= 0) {
                    this.mLut[i4] = iBinarySearch / (sOurPercent.length - 1);
                } else if (iBinarySearch == -1) {
                    this.mLut[i4] = 0.0d;
                } else {
                    int i5 = -iBinarySearch;
                    int i6 = i5 - 1;
                    double[] dArr2 = sOurPercent;
                    int i7 = i5 - 2;
                    double d9 = dArr2[i7];
                    this.mLut[i4] = (i7 + ((d8 - d9) / (dArr2[i6] - d9))) / (dArr2.length - 1);
                }
                i4++;
            }
        }

        double getDX() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d2, (-this.mEllipseB) * this.mTmpSinAngle);
            return this.mVertical ? (-d2) * dHypot : d2 * dHypot;
        }

        double getDY() {
            double d2 = this.mEllipseA * this.mTmpCosAngle;
            double d3 = (-this.mEllipseB) * this.mTmpSinAngle;
            double dHypot = this.mArcVelocity / Math.hypot(d2, d3);
            return this.mVertical ? (-d3) * dHypot : d3 * dHypot;
        }

        public double getLinearDX(double d2) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d2) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mX1;
            return d4 + (d3 * (this.mX2 - d4));
        }

        public double getLinearY(double d2) {
            double d3 = (d2 - this.mTime1) * this.mOneOverDeltaTime;
            double d4 = this.mY1;
            return d4 + (d3 * (this.mY2 - d4));
        }

        double getX() {
            return this.mEllipseCenterX + (this.mEllipseA * this.mTmpSinAngle);
        }

        double getY() {
            return this.mEllipseCenterY + (this.mEllipseB * this.mTmpCosAngle);
        }

        double lookup(double d2) {
            if (d2 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
            if (d2 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d2 * (dArr.length - 1);
            int i2 = (int) length;
            double d3 = dArr[i2];
            return d3 + ((length - i2) * (dArr[i2 + 1] - d3));
        }

        void setPoint(double d2) {
            double dLookup = lookup((this.mVertical ? this.mTime2 - d2 : d2 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(dLookup);
            this.mTmpCosAngle = Math.cos(dLookup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ArcCurveFit(int[] r24, double[] r25, double[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r0.<init>()
            r2 = 1
            r0.mExtrapolate = r2
            r0.mTime = r1
            int r3 = r1.length
            int r3 = r3 + (-1)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r3 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit.Arc[r3]
            r0.mArcs = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L17:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r7 = r0.mArcs
            int r8 = r7.length
            if (r4 >= r8) goto L59
            r8 = r24[r4]
            r9 = 3
            if (r8 == 0) goto L36
            if (r8 == r2) goto L34
            r10 = 2
            if (r8 == r10) goto L32
            if (r8 == r9) goto L30
            r9 = 4
            if (r8 == r9) goto L36
            r9 = 5
            if (r8 == r9) goto L36
            r9 = r6
            goto L36
        L30:
            if (r5 != r2) goto L34
        L32:
            r5 = r10
            goto L35
        L34:
            r5 = r2
        L35:
            r9 = r5
        L36:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc r8 = new androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc
            r10 = r1[r4]
            int r6 = r4 + 1
            r12 = r1[r6]
            r14 = r26[r4]
            r15 = r14[r3]
            r17 = r14[r2]
            r14 = r26[r6]
            r19 = r14[r3]
            r21 = r14[r2]
            r14 = r15
            r16 = r17
            r18 = r19
            r20 = r21
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r8
            r4 = r6
            r6 = r9
            goto L17
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.<init>(int[], double[], double[][]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        boolean z = this.mExtrapolate;
        Arc[] arcArr = this.mArcs;
        if (z) {
            Arc arc = arcArr[0];
            double d3 = arc.mTime1;
            if (d2 < d3) {
                double d4 = d2 - d3;
                if (arc.mLinear) {
                    dArr[0] = arc.getLinearX(d3) + (this.mArcs[0].getLinearDX(d3) * d4);
                    dArr[1] = this.mArcs[0].getLinearY(d3) + (d4 * this.mArcs[0].getLinearDY(d3));
                    return;
                } else {
                    arc.setPoint(d3);
                    dArr[0] = this.mArcs[0].getX() + (this.mArcs[0].getDX() * d4);
                    dArr[1] = this.mArcs[0].getY() + (d4 * this.mArcs[0].getDY());
                    return;
                }
            }
            int length = arcArr.length - 1;
            Arc arc2 = arcArr[length];
            double d5 = arc2.mTime2;
            if (d2 > d5) {
                double d6 = d2 - d5;
                if (arc2.mLinear) {
                    dArr[0] = arc2.getLinearX(d5) + (this.mArcs[length].getLinearDX(d5) * d6);
                    dArr[1] = this.mArcs[length].getLinearY(d5) + (d6 * this.mArcs[length].getLinearDY(d5));
                    return;
                } else {
                    arc2.setPoint(d2);
                    dArr[0] = this.mArcs[length].getX() + (this.mArcs[length].getDX() * d6);
                    dArr[1] = this.mArcs[length].getY() + (d6 * this.mArcs[length].getDY());
                    return;
                }
            }
        } else {
            double d7 = arcArr[0].mTime1;
            if (d2 < d7) {
                d2 = d7;
            }
            double d8 = arcArr[arcArr.length - 1].mTime2;
            if (d2 > d8) {
                d2 = d8;
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return;
            }
            Arc arc3 = arcArr2[i2];
            if (d2 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    dArr[0] = arc3.getLinearX(d2);
                    dArr[1] = this.mArcs[i2].getLinearY(d2);
                    return;
                } else {
                    arc3.setPoint(d2);
                    dArr[0] = this.mArcs[i2].getX();
                    dArr[1] = this.mArcs[i2].getY();
                    return;
                }
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[PHI: r2
  0x000b: PHI (r2v8 double) = (r2v1 double), (r2v4 double) binds: [B:3:0x0009, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getSlope(double r6, double[] r8) {
        /*
            r5 = this;
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r0 = r5.mArcs
            r1 = 0
            r2 = r0[r1]
            double r2 = r2.mTime1
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto Ld
        Lb:
            r6 = r2
            goto L19
        Ld:
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            double r2 = r0.mTime2
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L19
            goto Lb
        L19:
            r0 = r1
        L1a:
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r2 = r5.mArcs
            int r3 = r2.length
            if (r0 >= r3) goto L58
            r2 = r2[r0]
            double r3 = r2.mTime2
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 > 0) goto L55
            boolean r3 = r2.mLinear
            r4 = 1
            if (r3 == 0) goto L3d
            double r2 = r2.getLinearDX(r6)
            r8[r1] = r2
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r5 = r5.mArcs
            r5 = r5[r0]
            double r5 = r5.getLinearDY(r6)
            r8[r4] = r5
            return
        L3d:
            r2.setPoint(r6)
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r6 = r5.mArcs
            r6 = r6[r0]
            double r6 = r6.getDX()
            r8[r1] = r6
            androidx.constraintlayout.core.motion.utils.ArcCurveFit$Arc[] r5 = r5.mArcs
            r5 = r5[r0]
            double r5 = r5.getDY()
            r8[r4] = r5
            return
        L55:
            int r0 = r0 + 1
            goto L1a
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.ArcCurveFit.getSlope(double, double[]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i2) {
        Arc[] arcArr = this.mArcs;
        int i3 = 0;
        double d3 = arcArr[0].mTime1;
        if (d2 < d3) {
            d2 = d3;
        }
        double d4 = arcArr[arcArr.length - 1].mTime2;
        if (d2 > d4) {
            d2 = d4;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i3 >= arcArr2.length) {
                return Double.NaN;
            }
            Arc arc = arcArr2[i3];
            if (d2 <= arc.mTime2) {
                if (arc.mLinear) {
                    if (i2 == 0) {
                        return arc.getLinearDX(d2);
                    }
                    return arc.getLinearDY(d2);
                }
                arc.setPoint(d2);
                Arc[] arcArr3 = this.mArcs;
                return i2 == 0 ? arcArr3[i3].getDX() : arcArr3[i3].getDY();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i2) {
        double linearY;
        double linearDY;
        double y;
        double dy;
        boolean z = this.mExtrapolate;
        Arc[] arcArr = this.mArcs;
        int i3 = 0;
        if (z) {
            Arc arc = arcArr[0];
            double d3 = arc.mTime1;
            if (d2 < d3) {
                double d4 = d2 - d3;
                if (!arc.mLinear) {
                    arc.setPoint(d3);
                    Arc[] arcArr2 = this.mArcs;
                    if (i2 == 0) {
                        y = arcArr2[0].getX();
                        dy = this.mArcs[0].getDX();
                    } else {
                        y = arcArr2[0].getY();
                        dy = this.mArcs[0].getDY();
                    }
                } else if (i2 == 0) {
                    y = arc.getLinearX(d3);
                    dy = this.mArcs[0].getLinearDX(d3);
                } else {
                    y = arc.getLinearY(d3);
                    dy = this.mArcs[0].getLinearDY(d3);
                }
                return y + (d4 * dy);
            }
            int length = arcArr.length - 1;
            Arc arc2 = arcArr[length];
            double d5 = arc2.mTime2;
            if (d2 > d5) {
                double d6 = d2 - d5;
                if (i2 == 0) {
                    linearY = arc2.getLinearX(d5);
                    linearDY = this.mArcs[length].getLinearDX(d5);
                } else {
                    linearY = arc2.getLinearY(d5);
                    linearDY = this.mArcs[length].getLinearDY(d5);
                }
                return linearY + (d6 * linearDY);
            }
        } else {
            double d7 = arcArr[0].mTime1;
            if (d2 < d7) {
                d2 = d7;
            } else {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                if (d2 > d8) {
                    d2 = d8;
                }
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i3 >= arcArr3.length) {
                return Double.NaN;
            }
            Arc arc3 = arcArr3[i3];
            if (d2 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    if (i2 == 0) {
                        return arc3.getLinearX(d2);
                    }
                    return arc3.getLinearY(d2);
                }
                arc3.setPoint(d2);
                Arc[] arcArr4 = this.mArcs;
                return i2 == 0 ? arcArr4[i3].getX() : arcArr4[i3].getY();
            }
            i3++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        boolean z = this.mExtrapolate;
        Arc[] arcArr = this.mArcs;
        if (z) {
            Arc arc = arcArr[0];
            double d3 = arc.mTime1;
            if (d2 < d3) {
                double d4 = d2 - d3;
                if (arc.mLinear) {
                    fArr[0] = (float) (arc.getLinearX(d3) + (this.mArcs[0].getLinearDX(d3) * d4));
                    fArr[1] = (float) (this.mArcs[0].getLinearY(d3) + (d4 * this.mArcs[0].getLinearDY(d3)));
                    return;
                } else {
                    arc.setPoint(d3);
                    fArr[0] = (float) (this.mArcs[0].getX() + (this.mArcs[0].getDX() * d4));
                    fArr[1] = (float) (this.mArcs[0].getY() + (d4 * this.mArcs[0].getDY()));
                    return;
                }
            }
            int length = arcArr.length - 1;
            Arc arc2 = arcArr[length];
            double d5 = arc2.mTime2;
            if (d2 > d5) {
                double d6 = d2 - d5;
                if (arc2.mLinear) {
                    fArr[0] = (float) (arc2.getLinearX(d5) + (this.mArcs[length].getLinearDX(d5) * d6));
                    fArr[1] = (float) (this.mArcs[length].getLinearY(d5) + (d6 * this.mArcs[length].getLinearDY(d5)));
                    return;
                } else {
                    arc2.setPoint(d2);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                }
            }
        } else {
            double d7 = arcArr[0].mTime1;
            if (d2 < d7) {
                d2 = d7;
            } else {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                if (d2 > d8) {
                    d2 = d8;
                }
            }
        }
        int i2 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i2 >= arcArr2.length) {
                return;
            }
            Arc arc3 = arcArr2[i2];
            if (d2 <= arc3.mTime2) {
                if (arc3.mLinear) {
                    fArr[0] = (float) arc3.getLinearX(d2);
                    fArr[1] = (float) this.mArcs[i2].getLinearY(d2);
                    return;
                } else {
                    arc3.setPoint(d2);
                    fArr[0] = (float) this.mArcs[i2].getX();
                    fArr[1] = (float) this.mArcs[i2].getY();
                    return;
                }
            }
            i2++;
        }
    }
}
