package com.google.firebase.perf.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.ac;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10326a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static x f10327b;

    /* renamed from: c, reason: collision with root package name */
    private volatile SharedPreferences f10328c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f10329d;

    public x(ExecutorService executorService) {
        this.f10329d = executorService;
    }

    public static synchronized x a() {
        x xVar;
        xVar = f10327b;
        if (xVar == null) {
            xVar = new x(Executors.newSingleThreadExecutor());
            f10327b = xVar;
        }
        return xVar;
    }

    public static /* synthetic */ void f(x xVar, Context context) {
        if (xVar.f10328c == null) {
            xVar.f10328c = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    private static final Context l() {
        try {
            com.google.firebase.e.b();
            return com.google.firebase.e.b().a();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.e.f b(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Le
            com.google.firebase.perf.c.a r3 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r4 = "Key is null when getting boolean value on device cache."
            r3.b(r4)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        Le:
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            android.content.Context r0 = l()
            r3.g(r0)
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            goto L4f
        L1e:
            android.content.SharedPreferences r0 = r3.f10328c
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L4f
            r0 = 0
            android.content.SharedPreferences r3 = r3.f10328c     // Catch: java.lang.ClassCastException -> L36
            boolean r3 = r3.getBoolean(r4, r0)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.ClassCastException -> L36
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.c(r3)     // Catch: java.lang.ClassCastException -> L36
            return r3
        L36:
            r3 = move-exception
            com.google.firebase.perf.c.a r1 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r3 = r3.getMessage()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "Key %s from sharedPreferences has type other than long: %s"
            r1.c(r3, r2)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        L4f:
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.x.b(java.lang.String):com.google.firebase.perf.e.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.e.f c(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Le
            com.google.firebase.perf.c.a r3 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r4 = "Key is null when getting double value on device cache."
            r3.b(r4)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        Le:
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            android.content.Context r0 = l()
            r3.g(r0)
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            goto L6d
        L1e:
            android.content.SharedPreferences r0 = r3.f10328c
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L6d
            android.content.SharedPreferences r0 = r3.f10328c     // Catch: java.lang.ClassCastException -> L3b
            r1 = 0
            long r0 = r0.getLong(r4, r1)     // Catch: java.lang.ClassCastException -> L3b
            double r0 = java.lang.Double.longBitsToDouble(r0)     // Catch: java.lang.ClassCastException -> L3b
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.ClassCastException -> L3b
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.c(r0)     // Catch: java.lang.ClassCastException -> L3b
            return r3
        L3b:
            android.content.SharedPreferences r3 = r3.f10328c     // Catch: java.lang.ClassCastException -> L53
            r0 = 0
            float r3 = r3.getFloat(r4, r0)     // Catch: java.lang.ClassCastException -> L53
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.ClassCastException -> L53
            double r0 = r3.doubleValue()     // Catch: java.lang.ClassCastException -> L53
            java.lang.Double r3 = java.lang.Double.valueOf(r0)     // Catch: java.lang.ClassCastException -> L53
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.c(r3)     // Catch: java.lang.ClassCastException -> L53
            return r3
        L53:
            r3 = move-exception
            com.google.firebase.perf.c.a r0 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r3 = r3.getMessage()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Key %s from sharedPreferences has type other than double: %s"
            r0.c(r3, r1)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        L6d:
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.x.c(java.lang.String):com.google.firebase.perf.e.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.e.f d(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Le
            com.google.firebase.perf.c.a r3 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r4 = "Key is null when getting long value on device cache."
            r3.b(r4)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        Le:
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            android.content.Context r0 = l()
            r3.g(r0)
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            goto L51
        L1e:
            android.content.SharedPreferences r0 = r3.f10328c
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L51
            android.content.SharedPreferences r3 = r3.f10328c     // Catch: java.lang.ClassCastException -> L37
            r0 = 0
            long r0 = r3.getLong(r4, r0)     // Catch: java.lang.ClassCastException -> L37
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.ClassCastException -> L37
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.c(r3)     // Catch: java.lang.ClassCastException -> L37
            return r3
        L37:
            r3 = move-exception
            com.google.firebase.perf.c.a r0 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r3 = r3.getMessage()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Key %s from sharedPreferences has type other than long: %s"
            r0.c(r3, r1)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        L51:
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.x.d(java.lang.String):com.google.firebase.perf.e.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.firebase.perf.e.f e(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 != 0) goto Le
            com.google.firebase.perf.c.a r3 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r4 = "Key is null when getting String value on device cache."
            r3.b(r4)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        Le:
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            android.content.Context r0 = l()
            r3.g(r0)
            android.content.SharedPreferences r0 = r3.f10328c
            if (r0 != 0) goto L1e
            goto L4d
        L1e:
            android.content.SharedPreferences r0 = r3.f10328c
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L4d
            android.content.SharedPreferences r3 = r3.f10328c     // Catch: java.lang.ClassCastException -> L33
            java.lang.String r0 = ""
            java.lang.String r3 = r3.getString(r4, r0)     // Catch: java.lang.ClassCastException -> L33
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.c(r3)     // Catch: java.lang.ClassCastException -> L33
            return r3
        L33:
            r3 = move-exception
            com.google.firebase.perf.c.a r0 = com.google.firebase.perf.config.x.f10326a
            java.lang.String r3 = r3.getMessage()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "Key %s from sharedPreferences has type other than String: %s"
            r0.c(r3, r1)
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        L4d:
            com.google.firebase.perf.e.f r3 = com.google.firebase.perf.e.f.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.x.e(java.lang.String):com.google.firebase.perf.e.f");
    }

    public final synchronized void g(Context context) {
        if (this.f10328c != null || context == null) {
            return;
        }
        this.f10329d.execute(new ac(this, context, 13));
    }

    public final void h(String str, double d2) {
        if (this.f10328c == null) {
            g(l());
            if (this.f10328c == null) {
                return;
            }
        }
        this.f10328c.edit().putLong(str, Double.doubleToRawLongBits(d2)).apply();
    }

    public final void i(String str, long j2) {
        if (this.f10328c == null) {
            g(l());
            if (this.f10328c == null) {
                return;
            }
        }
        this.f10328c.edit().putLong(str, j2).apply();
    }

    public final void j(String str, String str2) {
        if (this.f10328c == null) {
            g(l());
            if (this.f10328c == null) {
                return;
            }
        }
        this.f10328c.edit().putString(str, str2).apply();
    }

    public final void k(String str, boolean z) {
        if (this.f10328c == null) {
            g(l());
            if (this.f10328c == null) {
                return;
            }
        }
        this.f10328c.edit().putBoolean(str, z).apply();
    }
}
