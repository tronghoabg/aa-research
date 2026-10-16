package j$.time.format;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class h implements e {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ h(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    @Override // j$.time.format.e
    public final boolean h(x xVar, StringBuilder sb) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Long lA = xVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA != null) {
                    sb.append("GMT");
                    int iX = j$.desugar.sun.nio.fs.g.x(lA.longValue());
                    if (iX != 0) {
                        int iAbs = Math.abs((iX / 3600) % 100);
                        int iAbs2 = Math.abs((iX / 60) % 60);
                        int iAbs3 = Math.abs(iX % 60);
                        sb.append(iX < 0 ? "-" : "+");
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
    public final int k(v vVar, CharSequence charSequence, int i) {
        int i2;
        int iB;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int length = charSequence.length();
                if (vVar.g(charSequence, i, "GMT", 0, 3)) {
                    int i7 = i + 3;
                    if (i7 == length) {
                        return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i7);
                    }
                    char cCharAt = charSequence.charAt(i7);
                    if (cCharAt == '+') {
                        i2 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i7);
                        }
                        i2 = -1;
                    }
                    int i8 = i + 4;
                    int i9 = 0;
                    if (((TextStyle) obj) == TextStyle.FULL) {
                        int i10 = i + 5;
                        int iB2 = b(charSequence, i8);
                        int i11 = i + 6;
                        int iB3 = b(charSequence, i10);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i12 = i + 7;
                            if (charSequence.charAt(i11) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i12);
                                i6 = i + 9;
                                int iB5 = b(charSequence, i + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i5 = (iB4 * 10) + iB5;
                                    int i13 = i + 11;
                                    if (i13 < length && charSequence.charAt(i6) == ':') {
                                        int iB6 = b(charSequence, i + 10);
                                        int iB7 = b(charSequence, i13);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i9 = (iB6 * 10) + iB7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i3 = i9;
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i14 = i + 5;
                        iB = b(charSequence, i8);
                        if (iB >= 0) {
                            if (i14 < length) {
                                int iB8 = b(charSequence, i14);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i14 = i + 6;
                                }
                                int i15 = i14 + 2;
                                if (i15 < length && charSequence.charAt(i14) == ':' && i15 < length && charSequence.charAt(i14) == ':') {
                                    int iB9 = b(charSequence, i14 + 1);
                                    int iB10 = b(charSequence, i15);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i5 = (iB9 * 10) + iB10;
                                        int i16 = i14 + 3;
                                        int i17 = i14 + 5;
                                        if (i17 < length && charSequence.charAt(i16) == ':') {
                                            int iB11 = b(charSequence, i14 + 4);
                                            int iB12 = b(charSequence, i17);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i9 = (iB11 * 10) + iB12;
                                                i6 = i14 + 6;
                                                i3 = i9;
                                                i4 = i6;
                                            }
                                        }
                                        i4 = i16;
                                        i3 = 0;
                                    }
                                }
                            }
                            i3 = 0;
                            i4 = i14;
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i9 * 60) + (iB * 3600) + i3) * i2, i, i4);
                        }
                    }
                    i9 = i5;
                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i9 * 60) + (iB * 3600) + i3) * i2, i, i4);
                }
                return ~i;
            default:
                String str = (String) obj;
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !vVar.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return "LocalizedOffset(" + String.valueOf((TextStyle) obj) + ")";
            default:
                return "'" + ((String) obj).replace("'", "''") + "'";
        }
    }
}
