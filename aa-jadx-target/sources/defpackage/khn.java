package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khn {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ygw b;

    static {
        defpackage.yqm.c("GH.CalEvtsQueryFactory");
        b = defpackage.ygw.B("calendar_id", "title", "begin", "end", "allDay", "eventLocation", "displayColor");
    }

    public static defpackage.eqp a(android.content.ContentResolver contentResolver, defpackage.eqp eqpVar) {
        return defpackage.ebo.g(eqpVar, new defpackage.kgo(contentResolver, 5));
    }

    public static defpackage.kfm b(long j, long j2, boolean z) {
        android.net.Uri.Builder builderBuildUpon = android.provider.CalendarContract.Instances.CONTENT_URI.buildUpon();
        android.content.ContentUris.appendId(builderBuildUpon, j);
        android.content.ContentUris.appendId(builderBuildUpon, j2);
        defpackage.xb xbVarA = defpackage.kfm.a();
        xbVarA.d(builderBuildUpon.build());
        xbVarA.b(b);
        xbVarA.b = java.lang.String.format(java.util.Locale.US, "(%s = ?) AND (%s = 1) AND (%s != ?)", "allDay", "visible", "selfAttendeeStatus");
        xbVarA.c(defpackage.ygw.r(java.lang.String.valueOf(z ? 1 : 0), "2"));
        return xbVarA.a();
    }

    public static void c() {
    }
}
