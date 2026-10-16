package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajtf {
    public static final java.lang.String[] a = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};
    public static final java.util.Date b;
    public static final java.util.TimeZone c;

    static {
        java.util.TimeZone timeZone = j$.util.DesugarTimeZone.getTimeZone("GMT");
        c = timeZone;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2000, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        b = calendar.getTime();
    }
}
