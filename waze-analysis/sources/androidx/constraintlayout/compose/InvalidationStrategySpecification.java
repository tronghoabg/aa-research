package androidx.constraintlayout.compose;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InvalidationStrategySpecification {
    public static final int $stable = 8;
    private int heightRateCount;
    private int widthRateCount;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 <= r7) goto L16;
     */
    /* renamed from: shouldInvalidateOnFixedHeight-SulIKG4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11547shouldInvalidateOnFixedHeightSulIKG4(long r3, long r5, int r7, int r8) {
        /*
            r2 = this;
            boolean r0 = androidx.compose.ui.unit.Constraints.m11104getHasFixedHeightimpl(r3)
            r1 = 0
            if (r0 == 0) goto L2b
            boolean r0 = androidx.compose.ui.unit.Constraints.m11104getHasFixedHeightimpl(r5)
            if (r0 == 0) goto L2b
            int r5 = androidx.compose.ui.unit.Constraints.m11106getMaxHeightimpl(r5)
            int r3 = androidx.compose.ui.unit.Constraints.m11106getMaxHeightimpl(r3)
            int r5 = r5 - r3
            int r3 = java.lang.Math.abs(r5)
            r4 = 1
            if (r3 < r8) goto L1e
            goto L28
        L1e:
            if (r3 == 0) goto L2d
            int r3 = r2.heightRateCount
            int r3 = r3 + r4
            r2.heightRateCount = r3
            if (r3 > r7) goto L28
            goto L2d
        L28:
            r2.heightRateCount = r1
            return r4
        L2b:
            r2.heightRateCount = r1
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.InvalidationStrategySpecification.m11547shouldInvalidateOnFixedHeightSulIKG4(long, long, int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3 <= r7) goto L16;
     */
    /* renamed from: shouldInvalidateOnFixedWidth-SulIKG4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11548shouldInvalidateOnFixedWidthSulIKG4(long r3, long r5, int r7, int r8) {
        /*
            r2 = this;
            boolean r0 = androidx.compose.ui.unit.Constraints.m11105getHasFixedWidthimpl(r3)
            r1 = 0
            if (r0 == 0) goto L2b
            boolean r0 = androidx.compose.ui.unit.Constraints.m11105getHasFixedWidthimpl(r5)
            if (r0 == 0) goto L2b
            int r5 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r5)
            int r3 = androidx.compose.ui.unit.Constraints.m11107getMaxWidthimpl(r3)
            int r5 = r5 - r3
            int r3 = java.lang.Math.abs(r5)
            r4 = 1
            if (r3 < r8) goto L1e
            goto L28
        L1e:
            if (r3 == 0) goto L2d
            int r3 = r2.widthRateCount
            int r3 = r3 + r4
            r2.widthRateCount = r3
            if (r3 > r7) goto L28
            goto L2d
        L28:
            r2.widthRateCount = r1
            return r4
        L2b:
            r2.widthRateCount = r1
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.InvalidationStrategySpecification.m11548shouldInvalidateOnFixedWidthSulIKG4(long, long, int, int):boolean");
    }
}
