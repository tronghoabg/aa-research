package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[PHI: r16 r17
  0x0047: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:20:0x0045, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r17v3 boolean) = (r17v1 boolean), (r17v7 boolean) binds: [B:20:0x0045, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[PHI: r16 r17
  0x0049: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:20:0x0045, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r17v5 boolean) = (r17v1 boolean), (r17v7 boolean) binds: [B:20:0x0045, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f9 A[PHI: r6
  0x04f9: PHI (r6v19 androidx.constraintlayout.core.SolverVariable) = (r6v18 androidx.constraintlayout.core.SolverVariable), (r6v25 androidx.constraintlayout.core.SolverVariable) binds: [B:294:0x04ed, B:297:0x04f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /* JADX WARN: Type inference failed for: r3v56, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r37, androidx.constraintlayout.core.LinearSystem r38, int r39, int r40, androidx.constraintlayout.core.widgets.ChainHead r41) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i2) {
        int i3;
        ChainHead[] chainHeadArr;
        int i4;
        if (i2 == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i4 = 0;
        } else {
            i3 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i4 = 2;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (arrayList == null || arrayList.contains(chainHead.mFirst)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i2, i4, chainHead);
            }
        }
    }
}
