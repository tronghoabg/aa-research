package com.google.l.b.a.a;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f12225a = DesugarTimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, IndexOutOfBoundsException -> 0x01e2, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0056, B:19:0x0066, B:20:0x0068, B:22:0x0074, B:23:0x0077, B:25:0x007d, B:29:0x0087, B:34:0x0097, B:36:0x009f, B:37:0x00a3, B:39:0x00a9, B:44:0x00b6, B:47:0x00c1, B:58:0x00eb, B:60:0x00f1, B:62:0x00f7, B:86:0x01a6, B:67:0x0103, B:68:0x011e, B:69:0x011f, B:71:0x012a, B:72:0x013b, B:74:0x0148, B:77:0x0151, B:79:0x0170, B:82:0x017f, B:83:0x01a1, B:85:0x01a4, B:88:0x01d8, B:89:0x01df, B:51:0x00d1, B:52:0x00d4, B:46:0x00bd), top: B:103:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, IndexOutOfBoundsException -> 0x01e2, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:17:0x0056, B:19:0x0066, B:20:0x0068, B:22:0x0074, B:23:0x0077, B:25:0x007d, B:29:0x0087, B:34:0x0097, B:36:0x009f, B:37:0x00a3, B:39:0x00a9, B:44:0x00b6, B:47:0x00c1, B:58:0x00eb, B:60:0x00f1, B:62:0x00f7, B:86:0x01a6, B:67:0x0103, B:68:0x011e, B:69:0x011f, B:71:0x012a, B:72:0x013b, B:74:0x0148, B:77:0x0151, B:79:0x0170, B:82:0x017f, B:83:0x01a1, B:85:0x01a4, B:88:0x01d8, B:89:0x01df, B:51:0x00d1, B:52:0x00d4, B:46:0x00bd), top: B:103:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.b.a.a.a.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int b(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i2, i3))));
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i2, i3))));
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }

    private static boolean c(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }
}
