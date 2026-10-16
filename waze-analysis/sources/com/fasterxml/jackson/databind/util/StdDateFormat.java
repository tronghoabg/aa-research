package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.io.NumberInput;
import com.waze.strings.DisplayStrings;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class StdDateFormat extends DateFormat {
    protected static final String[] ALL_FORMATS;
    protected static final Calendar CALENDAR;
    protected static final DateFormat DATE_FORMAT_RFC1123;
    public static final String DATE_FORMAT_STR_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    protected static final String DATE_FORMAT_STR_PLAIN = "yyyy-MM-dd";
    protected static final String DATE_FORMAT_STR_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    protected static final Locale DEFAULT_LOCALE;
    protected static final TimeZone DEFAULT_TIMEZONE;
    protected static final Pattern PATTERN_ISO8601;
    public static final StdDateFormat instance;
    private transient Calendar _calendar;
    private transient DateFormat _formatRFC1123;
    protected Boolean _lenient;
    protected final Locale _locale;
    protected transient TimeZone _timezone;
    private boolean _tzSerializedWithColon;
    protected static final String PATTERN_PLAIN_STR = "\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d";
    protected static final Pattern PATTERN_PLAIN = Pattern.compile(PATTERN_PLAIN_STR);

    static {
        try {
            PATTERN_ISO8601 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            ALL_FORMATS = new String[]{DATE_FORMAT_STR_ISO8601, "yyyy-MM-dd'T'HH:mm:ss.SSS", DATE_FORMAT_STR_RFC1123, DATE_FORMAT_STR_PLAIN};
            TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
            DEFAULT_TIMEZONE = timeZone;
            Locale locale = Locale.US;
            DEFAULT_LOCALE = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_RFC1123, locale);
            DATE_FORMAT_RFC1123 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            instance = new StdDateFormat();
            CALENDAR = new GregorianCalendar(timeZone, locale);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    protected StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool, boolean z) {
        this._timezone = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z;
    }

    private static final DateFormat _cloneFormat(DateFormat dateFormat, String str, TimeZone timeZone, Locale locale, Boolean bool) {
        DateFormat simpleDateFormat;
        if (locale.equals(DEFAULT_LOCALE)) {
            simpleDateFormat = (DateFormat) dateFormat.clone();
            if (timeZone != null) {
                simpleDateFormat.setTimeZone(timeZone);
            }
        } else {
            simpleDateFormat = new SimpleDateFormat(str, locale);
            if (timeZone == null) {
                timeZone = DEFAULT_TIMEZONE;
            }
            simpleDateFormat.setTimeZone(timeZone);
        }
        if (bool != null) {
            simpleDateFormat.setLenient(bool.booleanValue());
        }
        return simpleDateFormat;
    }

    protected static <T> boolean _equals(T t, T t2) {
        if (t == t2) {
            return true;
        }
        return t != null && t.equals(t2);
    }

    private static int _parse2D(String str, int i2) {
        return ((str.charAt(i2) - '0') * 10) + (str.charAt(i2 + 1) - '0');
    }

    private static int _parse4D(String str, int i2) {
        return ((str.charAt(i2) - '0') * 1000) + ((str.charAt(i2 + 1) - '0') * 100) + ((str.charAt(i2 + 2) - '0') * 10) + (str.charAt(i2 + 3) - '0');
    }

    private Date _parseDateFromLong(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return new Date(NumberInput.parseLong(str));
        } catch (NumberFormatException unused) {
            throw new ParseException(String.format("Timestamp value %s out of 64-bit value range", str), parsePosition.getErrorIndex());
        }
    }

    public static TimeZone getDefaultTimeZone() {
        return DEFAULT_TIMEZONE;
    }

    @Deprecated
    public static DateFormat getISO8601Format(TimeZone timeZone, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_STR_ISO8601, locale);
        simpleDateFormat.setTimeZone(DEFAULT_TIMEZONE);
        return simpleDateFormat;
    }

    @Deprecated
    public static DateFormat getRFC1123Format(TimeZone timeZone, Locale locale) {
        return _cloneFormat(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, timeZone, locale, null);
    }

    private static void pad2(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 10;
        }
        stringBuffer.append((char) (i2 + 48));
    }

    private static void pad3(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i2 -= i3 * 100;
        }
        pad2(stringBuffer, i2);
    }

    private static void pad4(StringBuffer stringBuffer, int i2) {
        int i3 = i2 / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                pad2(stringBuffer, i3);
            }
            i2 -= i3 * 100;
        }
        pad2(stringBuffer, i2);
    }

    protected void _clearFormats() {
        this._formatRFC1123 = null;
    }

    protected void _format(TimeZone timeZone, Locale locale, Date date, StringBuffer stringBuffer) {
        Calendar calendar_getCalendar = _getCalendar(timeZone);
        calendar_getCalendar.setTime(date);
        int i2 = calendar_getCalendar.get(1);
        if (calendar_getCalendar.get(0) == 0) {
            _formatBCEYear(stringBuffer, i2);
        } else {
            if (i2 > 9999) {
                stringBuffer.append('+');
            }
            pad4(stringBuffer, i2);
        }
        stringBuffer.append('-');
        pad2(stringBuffer, calendar_getCalendar.get(2) + 1);
        stringBuffer.append('-');
        pad2(stringBuffer, calendar_getCalendar.get(5));
        stringBuffer.append('T');
        pad2(stringBuffer, calendar_getCalendar.get(11));
        stringBuffer.append(':');
        pad2(stringBuffer, calendar_getCalendar.get(12));
        stringBuffer.append(':');
        pad2(stringBuffer, calendar_getCalendar.get(13));
        stringBuffer.append('.');
        pad3(stringBuffer, calendar_getCalendar.get(14));
        int offset = timeZone.getOffset(calendar_getCalendar.getTimeInMillis());
        if (offset == 0) {
            if (this._tzSerializedWithColon) {
                stringBuffer.append("+00:00");
                return;
            } else {
                stringBuffer.append("+0000");
                return;
            }
        }
        int i3 = offset / 60000;
        char c2 = offset < 0 ? '-' : '+';
        int i4 = i3 % 60;
        int iAbs = Math.abs(i3 / 60);
        int iAbs2 = Math.abs(i4);
        stringBuffer.append(c2);
        pad2(stringBuffer, iAbs);
        if (this._tzSerializedWithColon) {
            stringBuffer.append(':');
        }
        pad2(stringBuffer, iAbs2);
    }

    protected void _formatBCEYear(StringBuffer stringBuffer, int i2) {
        if (i2 == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            pad4(stringBuffer, i2 - 1);
        }
    }

    protected Calendar _getCalendar(TimeZone timeZone) {
        Calendar calendar = this._calendar;
        if (calendar == null) {
            calendar = (Calendar) CALENDAR.clone();
            this._calendar = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    protected Date _parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        int i2;
        String str2;
        int i3;
        int i_parse2D;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int length = str.length();
        TimeZone timeZone = DEFAULT_TIMEZONE;
        if (this._timezone != null && str.charAt(length - 1) != 'Z') {
            timeZone = this._timezone;
        }
        Calendar calendar_getCalendar = _getCalendar(timeZone);
        calendar_getCalendar.clear();
        if (length > 10) {
            Matcher matcher = PATTERN_ISO8601.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i4 = iEnd - iStart;
                if (i4 > 1) {
                    int i_parse2D2 = _parse2D(str, iStart + 1) * DisplayStrings.DS_CONVERSATIONAL_REPORTING_TTS_HAZARD_REPORTED;
                    if (i4 >= 5) {
                        i_parse2D2 += _parse2D(str, iEnd - 2) * 60;
                    }
                    calendar_getCalendar.set(15, str.charAt(iStart) == '-' ? i_parse2D2 * (-1000) : i_parse2D2 * 1000);
                    calendar_getCalendar.set(16, 0);
                }
                int i_parse4D = _parse4D(str, 0);
                int i_parse2D3 = _parse2D(str, 5) - 1;
                int i_parse2D4 = _parse2D(str, 8);
                int i_parse2D5 = _parse2D(str, 11);
                int i_parse2D6 = _parse2D(str, 14);
                if (length <= 16 || str.charAt(16) != ':') {
                    i3 = 0;
                    i_parse2D = 0;
                } else {
                    i_parse2D = _parse2D(str, 17);
                    i3 = 0;
                }
                calendar_getCalendar.set(i_parse4D, i_parse2D3, i_parse2D4, i_parse2D5, i_parse2D6, i_parse2D);
                int iStart2 = matcher.start(1);
                int i5 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i5 >= iEnd2) {
                    calendar_getCalendar.set(14, i3);
                } else {
                    int i6 = iEnd2 - i5;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 == 2) {
                                iCharAt3 = i3;
                            } else {
                                if (i6 != 3 && i6 > 9) {
                                    String strSubstring = matcher.group(1).substring(1);
                                    Object[] objArr = new Object[2];
                                    objArr[i3] = str;
                                    objArr[1] = strSubstring;
                                    throw new ParseException(String.format("Cannot parse date \"%s\": invalid fractional seconds '%s'; can use at most 9 digits", objArr), i5);
                                }
                                iCharAt3 = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt2 = iCharAt3 + ((str.charAt(iStart2 + 2) - '0') * 10);
                        } else {
                            iCharAt2 = i3;
                        }
                        iCharAt = iCharAt2 + ((str.charAt(i5) - '0') * 100);
                    } else {
                        iCharAt = i3;
                    }
                    calendar_getCalendar.set(14, iCharAt);
                }
                return calendar_getCalendar.getTime();
            }
            i2 = 0;
            str2 = DATE_FORMAT_STR_ISO8601;
        } else {
            if (PATTERN_PLAIN.matcher(str).matches()) {
                calendar_getCalendar.set(_parse4D(str, 0), _parse2D(str, 5) - 1, _parse2D(str, 8), 0, 0, 0);
                calendar_getCalendar.set(14, 0);
                return calendar_getCalendar.getTime();
            }
            i2 = 0;
            str2 = DATE_FORMAT_STR_PLAIN;
        }
        Boolean bool = this._lenient;
        Object[] objArr2 = new Object[3];
        objArr2[i2] = str;
        objArr2[1] = str2;
        objArr2[2] = bool;
        throw new ParseException(String.format("Cannot parse date \"%s\": while it seems to fit format '%s', parsing fails (leniency? %s)", objArr2), i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r0 >= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r5.charAt(0) == '-') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (com.fasterxml.jackson.core.io.NumberInput.inLongRange(r5, false) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        return _parseDateFromLong(r5, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.Date _parseDate(java.lang.String r5, java.text.ParsePosition r6) {
        /*
            r4 = this;
            boolean r0 = r4.looksLikeISO8601(r5)
            if (r0 == 0) goto Lb
            java.util.Date r4 = r4.parseAsISO8601(r5, r6)
            return r4
        Lb:
            int r0 = r5.length()
        Lf:
            int r0 = r0 + (-1)
            r1 = 45
            if (r0 < 0) goto L26
            char r2 = r5.charAt(r0)
            r3 = 48
            if (r2 < r3) goto L21
            r3 = 57
            if (r2 <= r3) goto Lf
        L21:
            if (r0 > 0) goto L26
            if (r2 == r1) goto Lf
            goto L3a
        L26:
            if (r0 >= 0) goto L3a
            r0 = 0
            char r2 = r5.charAt(r0)
            if (r2 == r1) goto L35
            boolean r0 = com.fasterxml.jackson.core.io.NumberInput.inLongRange(r5, r0)
            if (r0 == 0) goto L3a
        L35:
            java.util.Date r4 = r4._parseDateFromLong(r5, r6)
            return r4
        L3a:
            java.util.Date r4 = r4.parseAsRFC1123(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.StdDateFormat._parseDate(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat, java.text.Format
    public StdDateFormat clone() {
        return new StdDateFormat(this._timezone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    @Override // java.text.DateFormat
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this._timezone;
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        _format(timeZone, this._locale, date, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public TimeZone getTimeZone() {
        return this._timezone;
    }

    @Override // java.text.DateFormat
    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean isColonIncludedInTimeZone() {
        return this._tzSerializedWithColon;
    }

    @Override // java.text.DateFormat
    public boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    protected boolean looksLikeISO8601(String str) {
        return str.length() >= 7 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-' && Character.isDigit(str.charAt(5));
    }

    @Override // java.text.DateFormat
    public Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date date_parseDate = _parseDate(strTrim, parsePosition);
        if (date_parseDate != null) {
            return date_parseDate;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : ALL_FORMATS) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            }
            sb.append(str2);
        }
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, sb.toString()), parsePosition.getErrorIndex());
    }

    protected Date parseAsISO8601(String str, ParsePosition parsePosition) throws ParseException {
        try {
            return _parseAsISO8601(str, parsePosition);
        } catch (IllegalArgumentException e2) {
            throw new ParseException(String.format("Cannot parse date \"%s\", problem: %s", str, e2.getMessage()), parsePosition.getErrorIndex());
        }
    }

    protected Date parseAsRFC1123(String str, ParsePosition parsePosition) {
        DateFormat dateFormat_cloneFormat = this._formatRFC1123;
        if (dateFormat_cloneFormat == null) {
            dateFormat_cloneFormat = _cloneFormat(DATE_FORMAT_RFC1123, DATE_FORMAT_STR_RFC1123, this._timezone, this._locale, this._lenient);
            this._formatRFC1123 = dateFormat_cloneFormat;
        }
        return dateFormat_cloneFormat.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        if (_equals(boolValueOf, this._lenient)) {
            return;
        }
        this._lenient = boolValueOf;
        _clearFormats();
    }

    @Override // java.text.DateFormat
    public void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this._timezone)) {
            return;
        }
        _clearFormats();
        this._timezone = timeZone;
    }

    public String toPattern() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' (");
        sb.append(true != Boolean.FALSE.equals(this._lenient) ? "lenient" : "strict");
        sb.append(")]");
        return sb.toString();
    }

    public String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", getClass().getName(), this._timezone, this._locale, this._lenient);
    }

    public StdDateFormat withColonInTimeZone(boolean z) {
        return this._tzSerializedWithColon == z ? this : new StdDateFormat(this._timezone, this._locale, this._lenient, z);
    }

    public StdDateFormat withLenient(Boolean bool) {
        return _equals(bool, this._lenient) ? this : new StdDateFormat(this._timezone, this._locale, bool, this._tzSerializedWithColon);
    }

    public StdDateFormat withLocale(Locale locale) {
        return locale.equals(this._locale) ? this : new StdDateFormat(this._timezone, locale, this._lenient, this._tzSerializedWithColon);
    }

    public StdDateFormat withTimeZone(TimeZone timeZone) {
        if (timeZone == null) {
            timeZone = DEFAULT_TIMEZONE;
        }
        TimeZone timeZone2 = this._timezone;
        return (timeZone == timeZone2 || timeZone.equals(timeZone2)) ? this : new StdDateFormat(timeZone, this._locale, this._lenient, this._tzSerializedWithColon);
    }

    @Deprecated
    public StdDateFormat(TimeZone timeZone, Locale locale) {
        this._tzSerializedWithColon = true;
        this._timezone = timeZone;
        this._locale = locale;
    }

    protected StdDateFormat(TimeZone timeZone, Locale locale, Boolean bool) {
        this(timeZone, locale, bool, false);
    }

    public StdDateFormat() {
        this._tzSerializedWithColon = true;
        this._locale = DEFAULT_LOCALE;
    }

    @Override // java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return _parseDate(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
