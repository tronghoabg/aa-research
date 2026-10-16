package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class ajsf {
    public static final String[] a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    public static final Date b;
    public static final TimeZone c;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        c = timeZone;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        b = calendar.getTime();
    }
}
