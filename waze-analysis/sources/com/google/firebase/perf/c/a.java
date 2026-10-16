package com.google.firebase.perf.c;

import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f10297a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10298b = false;

    private a() {
        b.e();
    }

    public static a a() {
        if (f10297a == null) {
            synchronized (a.class) {
                if (f10297a == null) {
                    f10297a = new a();
                }
            }
        }
        return f10297a;
    }

    public final void b(String str) {
        if (this.f10298b) {
            b.a(str);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f10298b) {
            b.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void d(String str) {
        if (this.f10298b) {
            b.b(str);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f10298b) {
            b.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void f(String str) {
        if (this.f10298b) {
            b.c(str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f10298b) {
            b.c(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final void h(boolean z) {
        this.f10298b = z;
    }

    public final void i(String str) {
        if (this.f10298b) {
            b.d(str);
        }
    }

    public final void j(String str, Object... objArr) {
        if (this.f10298b) {
            b.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public final boolean k() {
        return this.f10298b;
    }
}
