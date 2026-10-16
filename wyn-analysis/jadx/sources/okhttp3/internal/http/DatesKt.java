package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DatesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DatesKt$STANDARD_DATE_FORMAT$1 f42637a = new ThreadLocal<DateFormat>() { // from class: okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.f42442e);
            return simpleDateFormat;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f42638b;

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f42639c;

    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http.DatesKt$STANDARD_DATE_FORMAT$1] */
    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f42638b = strArr;
        f42639c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        AbstractC3340k.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f42637a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f42638b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i5 = 0;
                while (i5 < length) {
                    int i10 = i5 + 1;
                    DateFormat[] dateFormatArr = f42639c;
                    DateFormat simpleDateFormat = dateFormatArr[i5];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f42638b[i5], Locale.US);
                        simpleDateFormat.setTimeZone(Util.f42442e);
                        dateFormatArr[i5] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                    i5 = i10;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
