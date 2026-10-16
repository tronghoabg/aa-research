package com.fasterxml.jackson.databind.util;

import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;
    private static final TimeZone TIMEZONE_Z = DesugarTimeZone.getTimeZone("UTC");

    private static boolean checkOffset(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i2 = offset / 60000;
            sb.append(String.format("%c%02d:%02d", Character.valueOf(offset < 0 ? '-' : '+'), Integer.valueOf(Math.abs(i2 / 60)), Integer.valueOf(Math.abs(i2 % 60))));
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return i2;
            }
            i2++;
        }
        return str.length();
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length;
        TimeZone timeZone;
        char cCharAt;
        Objects.requireNonNull(str);
        try {
            int index = parsePosition.getIndex();
            int i7 = index + 4;
            int i8 = parseInt(str, index, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = index + 5;
            }
            int i9 = i7 + 2;
            int i10 = parseInt(str, i7, i9);
            if (checkOffset(str, i9, '-')) {
                i9 = i7 + 3;
            }
            int i11 = i9 + 2;
            int i12 = parseInt(str, i9, i11);
            boolean zCheckOffset = checkOffset(str, i11, 'T');
            if (!zCheckOffset && str.length() <= i11) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i8, i10 - 1, i12);
                parsePosition.setIndex(i11);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i13 = i9 + 5;
                int i14 = parseInt(str, i9 + 3, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i9 + 6;
                }
                int i15 = i13 + 2;
                int i16 = parseInt(str, i13, i15);
                if (checkOffset(str, i15, ':')) {
                    i15 = i13 + 3;
                }
                if (str.length() <= i15 || (cCharAt = str.charAt(i15)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i11 = i15;
                    i3 = i14;
                    i4 = i16;
                    i5 = 0;
                    i6 = 0;
                } else {
                    int i17 = i15 + 2;
                    i6 = parseInt(str, i15, i17);
                    if (i6 > 59 && i6 < 63) {
                        i6 = 59;
                    }
                    if (checkOffset(str, i17, '.')) {
                        int i18 = i15 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i15 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i15 + 6);
                        int i19 = parseInt(str, i18, iMin);
                        int i20 = iMin - i18;
                        if (i20 == 1) {
                            i19 *= 100;
                        } else if (i20 == 2) {
                            i19 *= 10;
                        }
                        i3 = i14;
                        i11 = iIndexOfNonDigit;
                        i4 = i16;
                        i5 = i19;
                    } else {
                        i3 = i14;
                        i11 = i17;
                        i4 = i16;
                        i5 = 0;
                    }
                }
                i2 = 1;
            } else {
                i2 = 1;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            if (str.length() <= i11) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_Z;
                length = i11 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i11);
                length = i11 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    String str3 = "GMT" + strSubstring;
                    TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str3);
                    String id = timeZone2.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(i2, i8);
            gregorianCalendar2.set(2, i10 - 1);
            gregorianCalendar2.set(5, i12);
            gregorianCalendar2.set(11, i3);
            gregorianCalendar2.set(12, i4);
            gregorianCalendar2.set(13, i6);
            gregorianCalendar2.set(14, i5);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (Exception e2) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + "\"";
            }
            String message = e2.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e2.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date " + str2 + ": " + message, parsePosition.getIndex());
            parseException.initCause(e2);
            throw parseException;
        }
    }

    private static int parseInt(String str, int i2, int i3) {
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

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_Z);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_Z);
    }
}
