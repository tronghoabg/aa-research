package androidx.compose.ui.layout;

import androidx.compose.ui.layout.ScaleFactor;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ContentScale {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    long mo9734computeScaleFactorH7hwNQA(long j2, long j3);

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo9734computeScaleFactorH7hwNQA(long j2, long j3) {
                float fM9738computeFillMaxDimensioniLBOSCw = ContentScaleKt.m9738computeFillMaxDimensioniLBOSCw(j2, j3);
                long jFloatToRawIntBits = Float.floatToRawIntBits(fM9738computeFillMaxDimensioniLBOSCw);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM9738computeFillMaxDimensioniLBOSCw);
                ScaleFactor.Companion companion = ScaleFactor.Companion;
                return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }
        };
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo9734computeScaleFactorH7hwNQA(long j2, long j3) {
                float fM9739computeFillMinDimensioniLBOSCw = ContentScaleKt.m9739computeFillMinDimensioniLBOSCw(j2, j3);
                long jFloatToRawIntBits = Float.floatToRawIntBits(fM9739computeFillMinDimensioniLBOSCw);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM9739computeFillMinDimensioniLBOSCw);
                ScaleFactor.Companion companion = ScaleFactor.Companion;
                return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            }
        };
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo9734computeScaleFactorH7hwNQA(long j2, long j3) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                ScaleFactor.Companion companion = ScaleFactor.Companion;
                return (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
            }
        };
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo9734computeScaleFactorH7hwNQA(long j2, long j3) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                ScaleFactor.Companion companion = ScaleFactor.Companion;
                return (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
            }
        };
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public long mo9734computeScaleFactorH7hwNQA(long r8, long r10) {
                /*
                    r7 = this;
                    r7 = 32
                    long r0 = r10 >> r7
                    int r0 = (int) r0
                    long r1 = r8 >> r7
                    int r1 = (int) r1
                    float r1 = java.lang.Float.intBitsToFloat(r1)
                    float r0 = java.lang.Float.intBitsToFloat(r0)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
                    if (r0 > 0) goto L3f
                    long r3 = r8 & r1
                    long r5 = r10 & r1
                    int r0 = (int) r5
                    int r3 = (int) r3
                    float r3 = java.lang.Float.intBitsToFloat(r3)
                    float r0 = java.lang.Float.intBitsToFloat(r0)
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 > 0) goto L3f
                    r8 = 1065353216(0x3f800000, float:1.0)
                    int r9 = java.lang.Float.floatToRawIntBits(r8)
                    long r9 = (long) r9
                    int r8 = java.lang.Float.floatToRawIntBits(r8)
                    long r3 = (long) r8
                    long r7 = r9 << r7
                    long r9 = r3 & r1
                    androidx.compose.ui.layout.ScaleFactor$Companion r11 = androidx.compose.ui.layout.ScaleFactor.Companion
                L3d:
                    long r7 = r7 | r9
                    return r7
                L3f:
                    float r8 = androidx.compose.ui.layout.ContentScaleKt.m9736access$computeFillMinDimensioniLBOSCw(r8, r10)
                    int r9 = java.lang.Float.floatToRawIntBits(r8)
                    long r9 = (long) r9
                    int r8 = java.lang.Float.floatToRawIntBits(r8)
                    long r3 = (long) r8
                    long r7 = r9 << r7
                    long r9 = r3 & r1
                    androidx.compose.ui.layout.ScaleFactor$Companion r11 = androidx.compose.ui.layout.ScaleFactor.Companion
                    goto L3d
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.ContentScale$Companion$Inside$1.mo9734computeScaleFactorH7hwNQA(long, long):long");
            }
        };
        private static final FixedScale None = new FixedScale(1.0f);
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo9734computeScaleFactorH7hwNQA(long j2, long j3) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) / Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
                ScaleFactor.Companion companion = ScaleFactor.Companion;
                return (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (jFloatToRawIntBits << 32);
            }
        };

        private Companion() {
        }

        public final ContentScale getCrop() {
            return Crop;
        }

        public final ContentScale getFillBounds() {
            return FillBounds;
        }

        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        public final ContentScale getFit() {
            return Fit;
        }

        public final ContentScale getInside() {
            return Inside;
        }

        public final FixedScale getNone() {
            return None;
        }

        public static /* synthetic */ void getCrop$annotations() {
        }

        public static /* synthetic */ void getFillBounds$annotations() {
        }

        public static /* synthetic */ void getFillHeight$annotations() {
        }

        public static /* synthetic */ void getFillWidth$annotations() {
        }

        public static /* synthetic */ void getFit$annotations() {
        }

        public static /* synthetic */ void getInside$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
