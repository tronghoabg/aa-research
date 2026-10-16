package j$.time.format;

import com.waze.strings.DisplayStrings;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49945a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f49946b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f49945a = i2;
        this.f49946b = obj;
    }

    public static void a(StringBuilder sb, int i2) {
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i2) {
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        int i2 = this.f49945a;
        Object obj = this.f49946b;
        switch (i2) {
            case 0:
                Long lA = wVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA != null) {
                    sb.append("GMT");
                    int iE = j$.com.android.tools.r8.a.E(lA.longValue());
                    if (iE != 0) {
                        int iAbs = Math.abs((iE / DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED) % 100);
                        int iAbs2 = Math.abs((iE / 60) % 60);
                        int iAbs3 = Math.abs(iE % 60);
                        sb.append(iE < 0 ? "-" : "+");
                        if (((TextStyle) obj) != TextStyle.FULL) {
                            if (iAbs >= 10) {
                                sb.append((char) ((iAbs / 10) + 48));
                            }
                            sb.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs2);
                                if (iAbs3 != 0) {
                                    sb.append(':');
                                    a(sb, iAbs3);
                                    break;
                                }
                            }
                        } else {
                            a(sb, iAbs);
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) obj);
                break;
        }
        return true;
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        int i3;
        int iB;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f49945a;
        Object obj = this.f49946b;
        switch (i8) {
            case 0:
                int length = charSequence.length();
                if (uVar.g(charSequence, i2, "GMT", 0, 3)) {
                    int i9 = i2 + 3;
                    if (i9 == length) {
                        return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i9);
                    }
                    char cCharAt = charSequence.charAt(i9);
                    if (cCharAt == '+') {
                        i3 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i9);
                        }
                        i3 = -1;
                    }
                    int i10 = i2 + 4;
                    int i11 = 0;
                    if (((TextStyle) obj) == TextStyle.FULL) {
                        int i12 = i2 + 5;
                        int iB2 = b(charSequence, i10);
                        int i13 = i2 + 6;
                        int iB3 = b(charSequence, i12);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i14 = i2 + 7;
                            if (charSequence.charAt(i13) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i14);
                                i7 = i2 + 9;
                                int iB5 = b(charSequence, i2 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i6 = (iB4 * 10) + iB5;
                                    int i15 = i2 + 11;
                                    if (i15 < length && charSequence.charAt(i7) == ':') {
                                        int iB6 = b(charSequence, i2 + 10);
                                        int iB7 = b(charSequence, i15);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i11 = (iB6 * 10) + iB7;
                                            i7 = i2 + 12;
                                        }
                                    }
                                    i4 = i11;
                                    i5 = i7;
                                }
                            }
                        }
                    } else {
                        int i16 = i2 + 5;
                        iB = b(charSequence, i10);
                        if (iB >= 0) {
                            if (i16 < length) {
                                int iB8 = b(charSequence, i16);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i16 = i2 + 6;
                                }
                                int i17 = i16 + 2;
                                if (i17 < length && charSequence.charAt(i16) == ':' && i17 < length && charSequence.charAt(i16) == ':') {
                                    int iB9 = b(charSequence, i16 + 1);
                                    int iB10 = b(charSequence, i17);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i6 = (iB9 * 10) + iB10;
                                        int i18 = i16 + 3;
                                        int i19 = i16 + 5;
                                        if (i19 < length && charSequence.charAt(i18) == ':') {
                                            int iB11 = b(charSequence, i16 + 4);
                                            int iB12 = b(charSequence, i19);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i11 = (iB11 * 10) + iB12;
                                                i7 = i16 + 6;
                                                i4 = i11;
                                                i5 = i7;
                                            }
                                        }
                                        i5 = i18;
                                        i4 = 0;
                                    }
                                }
                            }
                            i4 = 0;
                            i5 = i16;
                            return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i11 * 60) + (iB * 3600) + i4) * i3, i2, i5);
                        }
                    }
                    i11 = i6;
                    return uVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i11 * 60) + (iB * 3600) + i4) * i3, i2, i5);
                }
                return ~i2;
            default:
                String str = (String) obj;
                if (i2 > charSequence.length() || i2 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !uVar.g(charSequence, i2, str, 0, str.length()) ? ~i2 : str.length() + i2;
        }
    }

    public final String toString() {
        int i2 = this.f49945a;
        Object obj = this.f49946b;
        switch (i2) {
            case 0:
                return j$.desugar.sun.nio.fs.h.a("LocalizedOffset(", String.valueOf((TextStyle) obj), ")");
            default:
                return j$.desugar.sun.nio.fs.h.a("'", ((String) obj).replace("'", "''"), "'");
        }
    }
}
