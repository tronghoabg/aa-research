package aa;

import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f17452e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f17453f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f17454a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17455b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f17456c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f17457d = new Object();

    public k(SharedPreferences sharedPreferences) {
        this.f17454a = sharedPreferences;
    }

    public final j a() {
        j jVar;
        synchronized (this.f17456c) {
            int i5 = this.f17454a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f17454a.getLong("backoff_end_time_in_millis", -1L));
            jVar = new j();
            jVar.f17450a = i5;
            jVar.f17451b = date;
        }
        return jVar;
    }

    public final j b() {
        j jVar;
        synchronized (this.f17457d) {
            int i5 = this.f17454a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f17454a.getLong("realtime_backoff_end_time_in_millis", -1L));
            jVar = new j();
            jVar.f17450a = i5;
            jVar.f17451b = date;
        }
        return jVar;
    }

    public final void c(int i5, Date date) {
        synchronized (this.f17456c) {
            this.f17454a.edit().putInt("num_failed_fetches", i5).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(String str) {
        synchronized (this.f17455b) {
            this.f17454a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void e(int i5, Date date) {
        synchronized (this.f17457d) {
            this.f17454a.edit().putInt("num_failed_realtime_streams", i5).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void f() {
        synchronized (this.f17455b) {
            this.f17454a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void g() {
        synchronized (this.f17455b) {
            this.f17454a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
