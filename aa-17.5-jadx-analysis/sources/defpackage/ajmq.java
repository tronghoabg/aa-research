package defpackage;

/* loaded from: classes2.dex */
public final class ajmq {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && ajiq.f(str.charAt(i + 1)) != -1 && ajiq.f(str.charAt(i3)) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6 A[LOOP:2: B:90:0x00f0->B:92:0x00f6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String b(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmq.b(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    public static /* synthetic */ String c(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        boolean z3 = z & ((i3 & 4) == 0);
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%') {
                z2 = z3;
            } else if (cCharAt != '+' || !z3) {
                iCharCount++;
            }
            ajmy ajmyVar = new ajmy();
            ajmyVar.S(str, i, iCharCount);
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt == 37) {
                    int i4 = iCharCount + 2;
                    if (i4 < i2) {
                        int iF = ajiq.f(str.charAt(iCharCount + 1));
                        int iF2 = ajiq.f(str.charAt(i4));
                        if (iF == -1 || iF2 == -1) {
                            iCodePointAt = 37;
                            ajmyVar.T(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            ajmyVar.N((iF << 4) + iF2);
                            iCharCount = Character.charCount(37) + i4;
                        }
                    } else {
                        iCodePointAt = 37;
                    }
                }
                if (iCodePointAt == 43 && z2) {
                    ajmyVar.N(32);
                    iCharCount++;
                } else {
                    ajmyVar.T(iCodePointAt);
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return ajmyVar.n();
        }
        String strSubstring = str.substring(i, i2);
        strSubstring.getClass();
        return strSubstring;
    }
}
