package defpackage;

/* loaded from: classes3.dex */
final class ahqc {
    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return partialIsValidUtf8(bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r8[r9] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r8[r9] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0082, code lost:
    
        if (r8[r7] <= (-65)) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
        /*
            if (r7 == 0) goto L86
            if (r9 < r10) goto L5
            return r7
        L5:
            byte r0 = (byte) r7
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1b
            r7 = -62
            if (r0 < r7) goto L1a
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r9 > r3) goto L1a
        L17:
            r9 = r7
            goto L86
        L1a:
            return r2
        L1b:
            int r4 = r7 >> 8
            int r4 = ~r4
            r5 = -16
            if (r0 >= r5) goto L4a
            byte r7 = (byte) r4
            if (r7 != 0) goto L34
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r7 >= r10) goto L2f
            r6 = r9
            r9 = r7
            r7 = r6
            goto L34
        L2f:
            int r7 = incompleteStateFor(r0, r9)
            return r7
        L34:
            if (r7 > r3) goto L49
            r4 = -96
            if (r0 != r1) goto L3c
            if (r7 < r4) goto L49
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r7 >= r4) goto L49
        L42:
            int r7 = r9 + 1
            r9 = r8[r9]
            if (r9 > r3) goto L49
            goto L17
        L49:
            return r2
        L4a:
            byte r1 = (byte) r4
            if (r1 != 0) goto L5a
            int r7 = r9 + 1
            r1 = r8[r9]
            if (r7 >= r10) goto L55
            r9 = 0
            goto L60
        L55:
            int r7 = incompleteStateFor(r0, r1)
            return r7
        L5a:
            int r7 = r7 >> 16
            byte r7 = (byte) r7
            r6 = r9
            r9 = r7
            r7 = r6
        L60:
            if (r9 != 0) goto L71
            int r9 = r7 + 1
            r7 = r8[r7]
            if (r9 >= r10) goto L6c
            r6 = r9
            r9 = r7
            r7 = r6
            goto L71
        L6c:
            int r7 = incompleteStateFor(r0, r1, r7)
            return r7
        L71:
            if (r1 > r3) goto L85
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L85
            if (r9 > r3) goto L85
            int r9 = r7 + 1
            r7 = r8[r7]
            if (r7 > r3) goto L85
            goto L86
        L85:
            return r2
        L86:
            int r7 = partialIsValidUtf8(r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahqc.partialIsValidUtf8(int, byte[], int, int):int");
    }

    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return incompleteStateFor(bArr, i3, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                        int i5 = i + 3;
                        if (bArr[i4] <= -65) {
                            i += 4;
                            if (bArr[i5] <= -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 1) {
                    return incompleteStateFor(bArr, i3, i2);
                }
                int i6 = i + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i += 3;
                    if (bArr[i6] > -65) {
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    private static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    private static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i, i2);
    }
}
