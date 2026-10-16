package j$.time.format;

import j$.util.Objects;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes2.dex */
final class j implements f {

    /* renamed from: d, reason: collision with root package name */
    static final String[] f37582d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    static final j f37583e = new j("+HH:MM:ss", "Z");

    /* renamed from: f, reason: collision with root package name */
    static final j f37584f = new j("+HH:MM:ss", "0");

    /* renamed from: a, reason: collision with root package name */
    private final String f37585a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37586b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37587c;

    j(String str, String str2) {
        Objects.requireNonNull(str, MimeTypesReaderMetKeys.PATTERN_ATTR);
        Objects.requireNonNull(str2, "noOffsetText");
        int i5 = 0;
        while (true) {
            String[] strArr = f37582d;
            if (i5 < 22) {
                if (strArr[i5].equals(str)) {
                    this.f37586b = i5;
                    this.f37587c = i5 % 11;
                    this.f37585a = str2;
                    return;
                }
                i5++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb2) {
        Long lE = tVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z2 = false;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int i5 = (int) jLongValue;
        if (jLongValue != i5) {
            throw new ArithmeticException();
        }
        String str = this.f37585a;
        if (i5 == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((i5 / 3600) % 100);
        int iAbs2 = Math.abs((i5 / 60) % 60);
        int iAbs3 = Math.abs(i5 % 60);
        int length = sb2.length();
        sb2.append(i5 < 0 ? "-" : "+");
        if (this.f37586b >= 11 && iAbs < 10) {
            sb2.append((char) (iAbs + 48));
        } else {
            a(false, iAbs, sb2);
        }
        int i10 = this.f37587c;
        if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
            a(i10 > 0 && i10 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                if (i10 > 0 && i10 % 2 == 0) {
                    z2 = true;
                }
                a(z2, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    private static void a(boolean z2, int i5, StringBuilder sb2) {
        sb2.append(z2 ? TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER : "");
        sb2.append((char) ((i5 / 10) + 48));
        sb2.append((char) ((i5 % 10) + 48));
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        CharSequence charSequence2;
        int i10;
        int i11;
        int i12;
        int i13;
        int length = charSequence.length();
        int length2 = this.f37585a.length();
        if (length2 == 0) {
            if (i5 == length) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i5);
            }
            charSequence2 = charSequence;
        } else {
            if (i5 == length) {
                return ~i5;
            }
            charSequence2 = charSequence;
            if (qVar.r(charSequence2, i5, this.f37585a, 0, length2)) {
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i5 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i5);
        if (cCharAt == '+' || cCharAt == '-') {
            int i14 = cCharAt == '-' ? -1 : 1;
            int i15 = this.f37587c;
            boolean z2 = i15 > 0 && i15 % 2 == 0;
            int i16 = this.f37586b;
            boolean z10 = i16 < 11;
            int[] iArr = new int[4];
            iArr[0] = i5 + 1;
            if (!qVar.k()) {
                if (z10) {
                    if (z2 || (i16 == 0 && length > (i13 = i5 + 3) && charSequence2.charAt(i13) == ':')) {
                        i16 = 10;
                        z2 = true;
                    } else {
                        i16 = 9;
                    }
                } else if (z2 || (i16 == 11 && length > (i12 = i5 + 3) && (charSequence2.charAt(i5 + 2) == ':' || charSequence2.charAt(i12) == ':'))) {
                    i16 = 21;
                    z2 = true;
                } else {
                    i16 = 20;
                }
            }
            switch (i16) {
                case 0:
                case 11:
                    c(charSequence2, z10, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z10, iArr);
                    d(charSequence2, z2, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z10, iArr);
                    d(charSequence2, z2, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z10, iArr);
                    d(charSequence2, z2, true, iArr);
                    b(charSequence2, z2, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z10, iArr);
                    d(charSequence2, z2, true, iArr);
                    if (!b(charSequence2, z2, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z10, iArr);
                    if (b(charSequence2, z2, 2, iArr)) {
                        b(charSequence2, z2, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i17 = iArr[0];
            if (i17 > 0) {
                int i18 = iArr[1];
                if (i18 > 23 || (i10 = iArr[2]) > 59 || (i11 = iArr[3]) > 59) {
                    throw new j$.time.c("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return qVar.n(j$.time.temporal.a.OFFSET_SECONDS, ((i10 * 60) + (i18 * 3600) + i11) * i14, i5, i17);
            }
        }
        return length2 == 0 ? qVar.n(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i5) : ~i5;
    }

    private static void c(CharSequence charSequence, boolean z2, int[] iArr) {
        if (z2) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    private static void d(CharSequence charSequence, boolean z2, boolean z10, int[] iArr) {
        if (b(charSequence, z2, 2, iArr) || !z10) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(java.lang.CharSequence r5, boolean r6, int r7, int[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            r2 = 1
            if (r1 >= 0) goto L7
            return r2
        L7:
            if (r6 == 0) goto L1d
            if (r7 == r2) goto L1d
            int r6 = r1 + 1
            int r3 = r5.length()
            if (r6 > r3) goto L4e
            char r1 = r5.charAt(r1)
            r3 = 58
            if (r1 == r3) goto L1c
            goto L4e
        L1c:
            r1 = r6
        L1d:
            int r6 = r1 + 2
            int r3 = r5.length()
            if (r6 <= r3) goto L26
            goto L4e
        L26:
            int r3 = r1 + 1
            char r1 = r5.charAt(r1)
            char r5 = r5.charAt(r3)
            r3 = 48
            if (r1 < r3) goto L4e
            r4 = 57
            if (r1 > r4) goto L4e
            if (r5 < r3) goto L4e
            if (r5 <= r4) goto L3d
            goto L4e
        L3d:
            int r1 = r1 - r3
            int r1 = r1 * 10
            int r5 = r5 - r3
            int r5 = r5 + r1
            if (r5 < 0) goto L4e
            r1 = 59
            if (r5 <= r1) goto L49
            goto L4e
        L49:
            r8[r7] = r5
            r8[r0] = r6
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.j.b(java.lang.CharSequence, boolean, int, int[]):boolean");
    }

    private static void e(CharSequence charSequence, int i5, int i10, int[] iArr) {
        int i11;
        char cCharAt;
        int i12 = iArr[0];
        char[] cArr = new char[i10];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10 && (i11 = i12 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i12)) >= '0' && cCharAt <= '9') {
            cArr[i13] = cCharAt;
            i14++;
            i13++;
            i12 = i11;
        }
        if (i14 < i5) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i14) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i12;
    }

    public final String toString() {
        String strReplace = this.f37585a.replace("'", "''");
        return "Offset(" + f37582d[this.f37586b] + ",'" + strReplace + "')";
    }
}
