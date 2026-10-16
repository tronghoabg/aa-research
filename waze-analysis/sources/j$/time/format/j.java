package j$.time.format;

import com.waze.strings.DisplayStrings;
import j$.util.Objects;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class j implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f49953d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    public static final j f49954e = new j("+HH:MM:ss", "Z");

    /* renamed from: f, reason: collision with root package name */
    public static final j f49955f = new j("+HH:MM:ss", "0");

    /* renamed from: a, reason: collision with root package name */
    public final String f49956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49958c;

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        for (int i2 = 0; i2 < 22; i2++) {
            if (f49953d[i2].equals(str)) {
                this.f49957b = i2;
                this.f49958c = i2 % 11;
                this.f49956a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
    }

    public static void a(boolean z, int i2, StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.CharSequence r5, boolean r6, int r7, int[] r8) {
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

    public static void c(CharSequence charSequence, boolean z, int[] iArr) {
        if (!z) {
            e(charSequence, 1, 2, iArr);
        } else {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
        }
    }

    public static void d(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    public static void e(CharSequence charSequence, int i2, int i3, int[] iArr) {
        int i4;
        char cCharAt;
        int i5 = iArr[0];
        char[] cArr = new char[i3];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3 && (i4 = i5 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i5)) >= '0' && cCharAt <= '9') {
            cArr[i6] = cCharAt;
            i7++;
            i6++;
            i5 = i4;
        }
        if (i7 < i2) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i7) {
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
        iArr[0] = i5;
    }

    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        Long lA = wVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z = false;
        if (lA == null) {
            return false;
        }
        int iE = j$.com.android.tools.r8.a.E(lA.longValue());
        String str = this.f49956a;
        if (iE == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((iE / DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED) % 100);
        int iAbs2 = Math.abs((iE / 60) % 60);
        int iAbs3 = Math.abs(iE % 60);
        int length = sb.length();
        sb.append(iE < 0 ? "-" : "+");
        if (this.f49957b >= 11 && iAbs < 10) {
            sb.append((char) (iAbs + 48));
        } else {
            a(false, iAbs, sb);
        }
        int i2 = this.f49958c;
        if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && iAbs3 > 0) || (i2 >= 1 && iAbs2 > 0))) {
            a(i2 > 0 && i2 % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i2 == 7 || i2 == 8 || (i2 >= 5 && iAbs3 > 0)) {
                if (i2 > 0 && i2 % 2 == 0) {
                    z = true;
                }
                a(z, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        CharSequence charSequence2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length = charSequence.length();
        String str = this.f49956a;
        int length2 = str.length();
        if (length2 == 0) {
            if (i2 == length) {
                return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i2);
            }
            charSequence2 = charSequence;
        } else {
            if (i2 == length) {
                return ~i2;
            }
            charSequence2 = charSequence;
            if (uVar.g(charSequence2, i2, str, 0, length2)) {
                return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i2 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == '+' || cCharAt == '-') {
            int i8 = cCharAt == '-' ? -1 : 1;
            int i9 = this.f49958c;
            boolean z = i9 > 0 && i9 % 2 == 0;
            int i10 = this.f49957b;
            boolean z2 = i10 < 11;
            int[] iArr = new int[4];
            iArr[0] = i2 + 1;
            if (!uVar.f49992c) {
                if (z2) {
                    if (z || (i10 == 0 && length > (i7 = i2 + 3) && charSequence2.charAt(i7) == ':')) {
                        i10 = 10;
                        z = true;
                    } else {
                        i10 = 9;
                    }
                } else if (z || (i10 == 11 && length > (i6 = i2 + 3) && (charSequence2.charAt(i2 + 2) == ':' || charSequence2.charAt(i6) == ':'))) {
                    i10 = 21;
                    z = true;
                } else {
                    i10 = 20;
                }
            }
            switch (i10) {
                case 0:
                case 11:
                    c(charSequence2, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, true, iArr);
                    b(charSequence2, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, true, iArr);
                    if (!b(charSequence2, z, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z2, iArr);
                    if (b(charSequence2, z, 2, iArr)) {
                        b(charSequence2, z, 3, iArr);
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
            i3 = length2;
            int i11 = iArr[0];
            if (i11 > 0) {
                int i12 = iArr[1];
                if (i12 <= 23 && (i4 = iArr[2]) <= 59 && (i5 = iArr[3]) <= 59) {
                    return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i4 * 60) + (i12 * 3600) + i5) * i8, i2, i11);
                }
                j$.time.f.h("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                return 0;
            }
        } else {
            i3 = length2;
        }
        return i3 == 0 ? uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i2) : ~i2;
    }

    public final String toString() {
        String strReplace = this.f49956a.replace("'", "''");
        return "Offset(" + f49953d[this.f49957b] + ",'" + strReplace + "')";
    }
}
