package androidx.compose.ui.node;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < intStack.getSize()) {
            int i5 = i2 + 2;
            int i6 = intStack.get(i2) - intStack.get(i5);
            int i7 = intStack.get(i2 + 1) - intStack.get(i5);
            i2 += 3;
            while (i3 < i6) {
                diffCallback.remove(i4, i3);
                i3++;
            }
            while (i4 < i7) {
                diffCallback.insert(i4);
                i4++;
            }
            for (int i8 = intStack.get(i5); i8 > 0; i8--) {
                diffCallback.same(i3, i4);
                i3++;
                i4++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean m10023backward4l5_RBY(int r17, int r18, int r19, int r20, androidx.compose.ui.node.DiffCallback r21, int[] r22, int[] r23, int r24, int[] r25) {
        /*
            r0 = r17
            r1 = r19
            r2 = r23
            r3 = r24
            int r4 = -r3
            r5 = r4
        La:
            r6 = 0
            if (r5 > r3) goto L86
            if (r5 == r4) goto L27
            int r7 = r5 + (-1)
            if (r5 == r3) goto L20
            int r8 = r5 + 1
            int r8 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r8)
            int r9 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r7)
            if (r8 >= r9) goto L20
            goto L27
        L20:
            int r7 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r7)
            int r8 = r7 + (-1)
            goto L2e
        L27:
            int r7 = r5 + 1
            int r7 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r7)
            r8 = r7
        L2e:
            int r9 = r18 - r8
            int r9 = r9 - r5
            int r9 = r20 - r9
            r10 = 1
            if (r3 == 0) goto L38
            r11 = r10
            goto L39
        L38:
            r11 = r6
        L39:
            if (r8 != r7) goto L3c
            r6 = r10
        L3c:
            r12 = r9
        L3d:
            if (r8 <= r0) goto L50
            if (r12 <= r1) goto L50
            int r13 = r8 + (-1)
            int r14 = r12 + (-1)
            r15 = r21
            boolean r16 = r15.areItemsTheSame(r13, r14)
            if (r16 == 0) goto L52
            r8 = r13
            r12 = r14
            goto L3d
        L50:
            r15 = r21
        L52:
            int r13 = r20 - r1
            int r14 = r18 - r0
            int r14 = r14 - r13
            r13 = r14 & 1
            r13 = r13 ^ r10
            androidx.compose.ui.node.CenteredArray.m9911setimpl(r2, r5, r8)
            if (r13 == 0) goto L81
            int r14 = r14 - r5
            if (r14 < r4) goto L81
            if (r14 > r3) goto L81
            r13 = r22
            int r14 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r13, r14)
            if (r14 >= r8) goto L6d
            goto L83
        L6d:
            r0 = r11 & r6
            int r9 = r9 + r0
            r0 = 1
            r22 = r25
            r21 = r0
            r19 = r7
            r17 = r8
            r20 = r9
            r18 = r12
            fillSnake(r17, r18, r19, r20, r21, r22)
            return r10
        L81:
            r13 = r22
        L83:
            int r5 = r5 + 2
            goto La
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MyersDiffKt.m10023backward4l5_RBY(int, int, int, int, androidx.compose.ui.node.DiffCallback, int[], int[], int, int[]):boolean");
    }

    private static final IntStack calculateDiff(int i2, int i3, DiffCallback diffCallback) {
        char c2 = 1;
        int i4 = ((i2 + i3) + 1) / 2;
        IntStack intStack = new IntStack(i4 * 3);
        IntStack intStack2 = new IntStack(i4 * 4);
        intStack2.pushRange(0, i2, 0, i3);
        int i5 = i4 + i4 + 1;
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[5];
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            if (m10025midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArr, iArr2, iArr3)) {
                char c3 = c2;
                if (Math.min(iArr3[2] - iArr3[0], iArr3[3] - iArr3[c2]) > 0) {
                    Snake.m10138addDiagonalToStackimpl(iArr3, intStack);
                }
                intStack2.pushRange(iPop4, iArr3[0], iPop2, iArr3[c3]);
                intStack2.pushRange(iArr3[2], iPop3, iArr3[3], iPop);
                c2 = c3;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i2, i3, 0);
        return intStack;
    }

    public static final void executeDiff(int i2, int i3, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i2, i3, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean m10024forward4l5_RBY(int r17, int r18, int r19, int r20, androidx.compose.ui.node.DiffCallback r21, int[] r22, int[] r23, int r24, int[] r25) {
        /*
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r24
            int r4 = r0 - r17
            int r5 = r1 - r19
            int r4 = r4 - r5
            int r5 = java.lang.Math.abs(r4)
            r6 = 1
            r5 = r5 & r6
            int r7 = -r3
            r8 = r7
        L15:
            r9 = 0
            if (r8 > r3) goto L97
            if (r8 == r7) goto L32
            int r10 = r8 + (-1)
            if (r8 == r3) goto L2b
            int r11 = r8 + 1
            int r11 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r11)
            int r12 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r10)
            if (r11 <= r12) goto L2b
            goto L32
        L2b:
            int r10 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r10)
            int r11 = r10 + 1
            goto L39
        L32:
            int r10 = r8 + 1
            int r10 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r2, r10)
            r11 = r10
        L39:
            int r12 = r11 - r17
            int r12 = r19 + r12
            if (r3 == 0) goto L41
            r13 = r6
            goto L42
        L41:
            r13 = r9
        L42:
            if (r11 != r10) goto L45
            r9 = r6
        L45:
            int r12 = r12 - r8
            r14 = r12
        L47:
            if (r11 >= r0) goto L58
            if (r14 >= r1) goto L58
            r15 = r21
            boolean r16 = r15.areItemsTheSame(r11, r14)
            if (r16 == 0) goto L5a
            int r11 = r11 + 1
            int r14 = r14 + 1
            goto L47
        L58:
            r15 = r21
        L5a:
            androidx.compose.ui.node.CenteredArray.m9911setimpl(r2, r8, r11)
            if (r5 == 0) goto L8b
            r16 = r6
            int r6 = r4 - r8
            int r0 = r7 + 1
            if (r6 < r0) goto L88
            int r0 = r3 + (-1)
            if (r6 > r0) goto L88
            r0 = r23
            int r6 = androidx.compose.ui.node.CenteredArray.m9908getimpl(r0, r6)
            if (r6 <= r11) goto L74
            goto L8f
        L74:
            r0 = r13 & r9
            int r12 = r12 - r0
            r0 = 0
            r22 = r25
            r21 = r0
            r17 = r10
            r19 = r11
            r18 = r12
            r20 = r14
            fillSnake(r17, r18, r19, r20, r21, r22)
            return r16
        L88:
            r0 = r23
            goto L8f
        L8b:
            r0 = r23
            r16 = r6
        L8f:
            int r8 = r8 + 2
            r0 = r18
            r6 = r16
            goto L15
        L97:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.MyersDiffKt.m10024forward4l5_RBY(int, int, int, int, androidx.compose.ui.node.DiffCallback, int[], int[], int, int[]):boolean");
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m10025midPointq5eDKzI(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i6;
        int i7 = i3 - i2;
        if (i7 > 0 && (i6 = i5 - i4) > 0) {
            int i8 = i7 + i6;
            int[] iArr4 = iArr;
            CenteredArray.m9911setimpl(iArr4, 1, i2);
            int[] iArr5 = iArr2;
            CenteredArray.m9911setimpl(iArr5, 1, i3);
            int i9 = 0;
            while (i9 < (i8 + 1) / 2) {
                if (m10024forward4l5_RBY(i2, i3, i4, i5, diffCallback, iArr4, iArr5, i9, iArr3) || m10023backward4l5_RBY(i2, i3, i4, i5, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i9++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }
}
