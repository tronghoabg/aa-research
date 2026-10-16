package rd;

/* renamed from: rd.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3972g {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f44784a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f44785b = new String[64];

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f44786c = new String[256];

    static {
        int i5 = 0;
        int i10 = 0;
        while (true) {
            String[] strArr = f44786c;
            if (i10 >= strArr.length) {
                break;
            }
            strArr[i10] = String.format("%8s", Integer.toBinaryString(i10)).replace(' ', '0');
            i10++;
        }
        String[] strArr2 = f44785b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = wg.b.c(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f44785b;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append('|');
            strArr3[i15 | 8] = wg.b.c(sb2, strArr3[i13], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f44785b;
            if (i5 >= strArr4.length) {
                return;
            }
            if (strArr4[i5] == null) {
                strArr4[i5] = f44786c[i5];
            }
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(boolean r9, int r10, int r11, byte r12, byte r13) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            r6 = 10
            if (r12 >= r6) goto Lf
            java.lang.String[] r6 = rd.AbstractC3972g.f44784a
            r6 = r6[r12]
            goto L1d
        Lf:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r12)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r3] = r6
            java.lang.String r6 = "0x%02x"
            java.lang.String r6 = java.lang.String.format(r6, r7)
        L1d:
            if (r13 != 0) goto L22
            java.lang.String r12 = ""
            goto L69
        L22:
            java.lang.String[] r7 = rd.AbstractC3972g.f44786c
            if (r12 == r2) goto L67
            if (r12 == r1) goto L67
            if (r12 == r4) goto L5f
            r8 = 6
            if (r12 == r8) goto L5f
            r8 = 7
            if (r12 == r8) goto L67
            r8 = 8
            if (r12 == r8) goto L67
            r8 = 64
            if (r13 >= r8) goto L3d
            java.lang.String[] r7 = rd.AbstractC3972g.f44785b
            r7 = r7[r13]
            goto L3f
        L3d:
            r7 = r7[r13]
        L3f:
            if (r12 != r0) goto L4e
            r8 = r13 & 4
            if (r8 == 0) goto L4e
            java.lang.String r12 = "HEADERS"
            java.lang.String r13 = "PUSH_PROMISE"
            java.lang.String r12 = r7.replace(r12, r13)
            goto L69
        L4e:
            if (r12 != 0) goto L5d
            r12 = r13 & 32
            if (r12 == 0) goto L5d
            java.lang.String r12 = "PRIORITY"
            java.lang.String r13 = "COMPRESSED"
            java.lang.String r12 = r7.replace(r12, r13)
            goto L69
        L5d:
            r12 = r7
            goto L69
        L5f:
            if (r13 != r5) goto L64
            java.lang.String r12 = "ACK"
            goto L69
        L64:
            r12 = r7[r13]
            goto L69
        L67:
            r12 = r7[r13]
        L69:
            java.util.Locale r13 = java.util.Locale.US
            if (r9 == 0) goto L70
            java.lang.String r9 = "<<"
            goto L72
        L70:
            java.lang.String r9 = ">>"
        L72:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r9
            r0[r5] = r10
            r0[r2] = r11
            r0[r1] = r6
            r0[r4] = r12
            java.lang.String r9 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r9 = java.lang.String.format(r13, r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rd.AbstractC3972g.a(boolean, int, int, byte, byte):java.lang.String");
    }
}
