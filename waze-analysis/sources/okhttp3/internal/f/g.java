package okhttp3.internal.f;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final k.k f56178a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f56179b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f56180c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f56181d;

    static {
        k.k kVar = k.k.f50843a;
        f56178a = okhttp3.internal.publicsuffix.a.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f56179b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f56180c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            h.g.b.x.e(binaryString, "toBinaryString(...)");
            strArr[i2] = h.n.o.ad(okhttp3.internal.b.j("%8s", binaryString), ' ', '0');
        }
        f56181d = strArr;
        String[] strArr2 = f56180c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f56180c;
            strArr3[i4 | 8] = String.valueOf(strArr3[i4]).concat("|PADDED");
        }
        String[] strArr4 = f56180c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                String[] strArr5 = f56180c;
                strArr5[i9] = strArr5[i8] + "|" + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + "|" + strArr5[i6] + "|PADDED";
            }
        }
        int length = f56180c.length;
        for (int i10 = 0; i10 < 64; i10++) {
            String[] strArr6 = f56180c;
            if (strArr6[i10] == null) {
                strArr6[i10] = f56181d[i10];
            }
        }
    }

    private g() {
    }

    public static final String a(int i2) {
        String[] strArr = f56179b;
        int length = strArr.length;
        return i2 < 10 ? strArr[i2] : okhttp3.internal.b.j("0x%02x", Integer.valueOf(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            java.lang.String r0 = a(r11)
            r1 = 5
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 4
            if (r12 != 0) goto Le
            java.lang.String r11 = ""
            goto L5d
        Le:
            if (r11 == r3) goto L59
            if (r11 == r2) goto L59
            if (r11 == r5) goto L4f
            r6 = 6
            if (r11 == r6) goto L4f
            r6 = 7
            if (r11 == r6) goto L59
            r6 = 8
            if (r11 == r6) goto L59
            java.lang.String[] r6 = okhttp3.internal.f.g.f56180c
            int r7 = r6.length
            r7 = 64
            if (r12 >= r7) goto L2b
            r6 = r6[r12]
            h.g.b.x.c(r6)
            goto L2f
        L2b:
            java.lang.String[] r6 = okhttp3.internal.f.g.f56181d
            r6 = r6[r12]
        L2f:
            if (r11 != r1) goto L3e
            r11 = r12 & 4
            if (r11 == 0) goto L4d
            java.lang.String r11 = "HEADERS"
            java.lang.String r12 = "PUSH_PROMISE"
            java.lang.String r11 = h.n.o.ac(r6, r11, r12)
            goto L5d
        L3e:
            if (r11 != 0) goto L4d
            r11 = r12 & 32
            if (r11 == 0) goto L4d
            java.lang.String r11 = "PRIORITY"
            java.lang.String r12 = "COMPRESSED"
            java.lang.String r11 = h.n.o.ac(r6, r11, r12)
            goto L5d
        L4d:
            r11 = r6
            goto L5d
        L4f:
            if (r12 != r4) goto L54
            java.lang.String r11 = "ACK"
            goto L5d
        L54:
            java.lang.String[] r11 = okhttp3.internal.f.g.f56181d
            r11 = r11[r12]
            goto L5d
        L59:
            java.lang.String[] r11 = okhttp3.internal.f.g.f56181d
            r11 = r11[r12]
        L5d:
            if (r4 == r8) goto L62
            java.lang.String r8 = ">>"
            goto L64
        L62:
            java.lang.String r8 = "<<"
        L64:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r1 = 0
            r12[r1] = r8
            r12[r4] = r9
            r12[r3] = r10
            r12[r2] = r0
            r12[r5] = r11
            java.lang.String r8 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r8 = okhttp3.internal.b.j(r8, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.f.g.b(boolean, int, int, int, int):java.lang.String");
    }
}
