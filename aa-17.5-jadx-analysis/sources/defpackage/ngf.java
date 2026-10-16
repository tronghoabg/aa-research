package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.time.Instant;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ngf implements lhg {
    public final SharedPreferences a;
    private final Object b;
    private boolean c;

    public ngf(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("system_user_education", 0);
        this.b = new Object();
        this.a = sharedPreferences;
    }

    public static ngf g() {
        return (ngf) mki.a.i(ngf.class);
    }

    private static String o(String str) {
        return String.format(Locale.US, "%s_%s", "education_category_seen", str);
    }

    private static String p(String str) {
        return String.format(Locale.US, "%s_%s", "education_category_seen_session", str);
    }

    private static String q(ngd ngdVar) {
        return String.format(Locale.US, "%s_%s_%s", "destination_last_visit", ngdVar.a(), ngdVar.b());
    }

    private static String r(String str, String str2) {
        return String.format(Locale.US, "%s_%s_%s", "education_seen", str, str2);
    }

    private static String s(nge ngeVar) {
        return String.format(Locale.US, "%s_%s_%s", "education_seen_count", ngeVar.c(), ngeVar.d());
    }

    public final long a() {
        long j;
        synchronized (this.b) {
            j = this.a.getLong("session_count", 0L);
        }
        return j;
    }

    public final long b(nge ngeVar) {
        return this.a.getLong(s(ngeVar), 0L);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (this.c) {
            return;
        }
        synchronized (this.b) {
            this.a.edit().putLong("session_count", a() + 1).apply();
        }
        this.c = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        this.c = false;
    }

    public final long e(ngd ngdVar) {
        return this.a.getLong(q(ngdVar), -1L);
    }

    public final long f(ngd ngdVar) {
        long jE = e(ngdVar);
        return jE == -1 ? a() : a() - jE;
    }

    public final void h(ngd ngdVar) {
        this.a.edit().putLong(q(ngdVar), a()).apply();
    }

    public final void i(nge ngeVar) {
        SharedPreferences.Editor editorPutLong = this.a.edit().putLong(r(ngeVar.c(), ngeVar.d()), a()).putLong(s(ngeVar), b(ngeVar) + 1);
        String str = String.format(Locale.US, "%s_%s_%s", "education_seen_time", ngeVar.c(), ngeVar.d());
        oit.a();
        SharedPreferences.Editor editorPutLong2 = editorPutLong.putLong(str, Instant.now().toEpochMilli()).putBoolean(o(ngeVar.c()), true).putLong(p(ngeVar.c()), a());
        String str2 = String.format(Locale.US, "%s_%s", "education_category_seen_time", ngeVar.c());
        oit.a();
        editorPutLong2.putLong(str2, Instant.now().toEpochMilli()).apply();
    }

    public final boolean j(nge ngeVar) {
        return k(ngeVar.c(), ngeVar.d());
    }

    public final boolean k(String str, String str2) {
        return this.a.getLong(r(str, str2), -1L) > 0;
    }

    public final boolean l(nge ngeVar) {
        return this.a.getBoolean(o(ngeVar.c()), false);
    }

    public final boolean m(ngd ngdVar) {
        return e(ngdVar) > 0;
    }

    public final long n() {
        return this.a.getLong(p("quick_feedback_category"), -1L);
    }
}
