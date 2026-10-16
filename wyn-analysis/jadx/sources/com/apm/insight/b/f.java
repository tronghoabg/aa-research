package com.apm.insight.b;

import android.content.Context;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f20222a;

    /* renamed from: c, reason: collision with root package name */
    private static g f20223c;

    /* renamed from: b, reason: collision with root package name */
    private final b f20224b;

    private f(Context context) {
        this.f20224b = new b(context);
        g gVar = new g();
        f20223c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f20222a == null) {
            synchronized (f.class) {
                try {
                    if (f20222a == null) {
                        f20222a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f20222a;
    }

    public static g b() {
        return f20223c;
    }

    public final void c() {
        this.f20224b.a();
    }

    public final void d() {
        this.f20224b.b();
    }

    public final b a() {
        return this.f20224b;
    }
}
