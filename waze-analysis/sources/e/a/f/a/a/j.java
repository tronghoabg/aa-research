package e.a.f.a.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f47520a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f47521b = new String[64];

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f47522c = new String[256];

    static {
        for (int i2 = 0; i2 < 256; i2++) {
            f47522c[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
        }
        String[] strArr = f47521b;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            String[] strArr2 = f47521b;
            strArr2[i4 | 8] = String.valueOf(strArr2[i4]).concat("|PADDED");
        }
        String[] strArr3 = f47521b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                String[] strArr4 = f47521b;
                strArr4[i9] = strArr4[i8] + "|" + strArr4[i6];
                strArr4[i9 | 8] = strArr4[i8] + "|" + strArr4[i6] + "|PADDED";
            }
        }
        for (int i10 = 0; i10 < 64; i10++) {
            String[] strArr5 = f47521b;
            if (strArr5[i10] == null) {
                strArr5[i10] = f47522c[i10];
            }
        }
    }

    j() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String a(boolean r8, int r9, int r10, byte r11, byte r12) {
        /*
            r0 = 10
            r1 = 0
            r2 = 1
            if (r11 >= r0) goto Lb
            java.lang.String[] r0 = e.a.f.a.a.j.f47520a
            r0 = r0[r11]
            goto L19
        Lb:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r0
            java.lang.String r0 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r0, r3)
        L19:
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            if (r12 != 0) goto L22
            java.lang.String r11 = ""
            goto L6d
        L22:
            if (r11 == r5) goto L69
            if (r11 == r4) goto L69
            if (r11 == r6) goto L5f
            r7 = 6
            if (r11 == r7) goto L5f
            r7 = 7
            if (r11 == r7) goto L69
            r7 = 8
            if (r11 == r7) goto L69
            r7 = 64
            if (r12 >= r7) goto L3b
            java.lang.String[] r7 = e.a.f.a.a.j.f47521b
            r7 = r7[r12]
            goto L3f
        L3b:
            java.lang.String[] r7 = e.a.f.a.a.j.f47522c
            r7 = r7[r12]
        L3f:
            if (r11 != r3) goto L4e
            r11 = r12 & 4
            if (r11 == 0) goto L5d
            java.lang.String r11 = "HEADERS"
            java.lang.String r12 = "PUSH_PROMISE"
            java.lang.String r11 = r7.replace(r11, r12)
            goto L6d
        L4e:
            if (r11 != 0) goto L5d
            r11 = r12 & 32
            if (r11 == 0) goto L5d
            java.lang.String r11 = "PRIORITY"
            java.lang.String r12 = "COMPRESSED"
            java.lang.String r11 = r7.replace(r11, r12)
            goto L6d
        L5d:
            r11 = r7
            goto L6d
        L5f:
            if (r12 != r2) goto L64
            java.lang.String r11 = "ACK"
            goto L6d
        L64:
            java.lang.String[] r11 = e.a.f.a.a.j.f47522c
            r11 = r11[r12]
            goto L6d
        L69:
            java.lang.String[] r11 = e.a.f.a.a.j.f47522c
            r11 = r11[r12]
        L6d:
            java.util.Locale r12 = java.util.Locale.US
            if (r2 == r8) goto L74
            java.lang.String r8 = ">>"
            goto L76
        L74:
            java.lang.String r8 = "<<"
        L76:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r8
            r3[r2] = r9
            r3[r5] = r10
            r3[r4] = r0
            r3[r6] = r11
            java.lang.String r8 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r8 = java.lang.String.format(r12, r8, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.a.a.j.a(boolean, int, int, byte, byte):java.lang.String");
    }
}
