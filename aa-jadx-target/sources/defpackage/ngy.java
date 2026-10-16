package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ngy implements defpackage.lhn {
    public final android.content.SharedPreferences a;
    private final java.lang.Object b;
    private boolean c;

    public ngy(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("system_user_education", 0);
        this.b = new java.lang.Object();
        this.a = sharedPreferences;
    }

    public static defpackage.ngy g() {
        return (defpackage.ngy) defpackage.mkp.a.i(defpackage.ngy.class);
    }

    private static java.lang.String o(java.lang.String str) {
        return java.lang.String.format(java.util.Locale.US, "%s_%s", "education_category_seen", str);
    }

    private static java.lang.String p(java.lang.String str) {
        return java.lang.String.format(java.util.Locale.US, "%s_%s", "education_category_seen_session", str);
    }

    private static java.lang.String q(ngw ngwVar) {
        return java.lang.String.format(java.util.Locale.US, "%s_%s_%s", "destination_last_visit", ngwVar.a(), ngwVar.b());
    }

    private static java.lang.String r(java.lang.String str, java.lang.String str2) {
        return java.lang.String.format(java.util.Locale.US, "%s_%s_%s", "education_seen", str, str2);
    }

    private static java.lang.String s(ngx ngxVar) {
        return java.lang.String.format(java.util.Locale.US, "%s_%s_%s", "education_seen_count", ngxVar.c(), ngxVar.d());
    }

    public final long a() {
        long j;
        synchronized (this.b) {
            j = this.a.getLong("session_count", 0L);
        }
        return j;
    }

    public final long b(ngx ngxVar) {
        return this.a.getLong(s(ngxVar), 0L);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.c = false;
    }

    public final long e(ngw ngwVar) {
        return this.a.getLong(q(ngwVar), -1L);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.c) {
            return;
        }
        synchronized (this.b) {
            this.a.edit().putLong("session_count", a() + 1).apply();
        }
        this.c = true;
    }

    public final long f(ngw ngwVar) {
        long jE = e(ngwVar);
        return jE == -1 ? a() : a() - jE;
    }

    public final void h(ngw ngwVar) {
        this.a.edit().putLong(q(ngwVar), a()).apply();
    }

    public final void i(ngx ngxVar) {
        android.content.SharedPreferences.Editor editorPutLong = this.a.edit().putLong(r(ngxVar.c(), ngxVar.d()), a()).putLong(s(ngxVar), b(ngxVar) + 1);
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "%s_%s_%s", "education_seen_time", ngxVar.c(), ngxVar.d());
        defpackage.ojm.a();
        android.content.SharedPreferences.Editor editorPutLong2 = editorPutLong.putLong(str, j$.time.Instant.now().toEpochMilli()).putBoolean(o(ngxVar.c()), true).putLong(p(ngxVar.c()), a());
        java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "%s_%s", "education_category_seen_time", ngxVar.c());
        defpackage.ojm.a();
        editorPutLong2.putLong(str2, j$.time.Instant.now().toEpochMilli()).apply();
    }

    public final boolean j(ngx ngxVar) {
        return k(ngxVar.c(), ngxVar.d());
    }

    public final boolean k(java.lang.String str, java.lang.String str2) {
        return this.a.getLong(r(str, str2), -1L) > 0;
    }

    public final boolean l(ngx ngxVar) {
        return this.a.getBoolean(o(ngxVar.c()), false);
    }

    public final boolean m(ngw ngwVar) {
        return e(ngwVar) > 0;
    }

    public final long n() {
        return this.a.getLong(p("quick_feedback_category"), -1L);
    }
}
