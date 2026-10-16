package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean compareEquals(androidx.collection.MutableObjectIntMap<androidx.compose.ui.layout.AlignmentLine> r16, java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> r17) {
        /*
            r0 = 0
            if (r16 != 0) goto L4
            return r0
        L4:
            int r1 = r16.getSize()
            int r2 = r17.size()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            r1 = r16
            androidx.collection.ObjectIntMap r1 = (androidx.collection.ObjectIntMap) r1
            java.lang.Object[] r2 = r1.keys
            int[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L72
            r5 = r0
        L1f:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L6b
            int r8 = r5 - r4
            r9 = r0
        L32:
            int r10 = ~r8
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            if (r9 >= r10) goto L66
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r6
            r14 = 128(0x80, double:6.3E-322)
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 >= 0) goto L60
            int r10 = r5 << 3
            int r10 = r10 + r9
            r12 = r2[r10]
            r10 = r3[r10]
            androidx.compose.ui.layout.AlignmentLine r12 = (androidx.compose.ui.layout.AlignmentLine) r12
            r13 = r17
            java.lang.Object r12 = r13.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L58
            goto L5f
        L58:
            int r12 = r12.intValue()
            if (r12 != r10) goto L5f
            goto L62
        L5f:
            return r0
        L60:
            r13 = r17
        L62:
            long r6 = r6 >> r11
            int r9 = r9 + 1
            goto L32
        L66:
            r13 = r17
            if (r10 != r11) goto L72
            goto L6d
        L6b:
            r13 = r17
        L6d:
            if (r5 == r4) goto L72
            int r5 = r5 + 1
            goto L1f
        L72:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinatorKt.compareEquals(androidx.collection.MutableObjectIntMap, java.util.Map):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nextUntil-hw7D004, reason: not valid java name */
    public static final Modifier.Node m10065nextUntilhw7D004(DelegatableNode delegatableNode, int i2, int i3) {
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui != null && (child$ui.getAggregateChildKindSet$ui() & i2) != 0) {
            while (child$ui != null) {
                int kindSet$ui = child$ui.getKindSet$ui();
                if ((kindSet$ui & i3) != 0) {
                    return null;
                }
                if ((kindSet$ui & i2) != 0) {
                    return child$ui;
                }
                child$ui = child$ui.getChild$ui();
            }
        }
        return null;
    }
}
