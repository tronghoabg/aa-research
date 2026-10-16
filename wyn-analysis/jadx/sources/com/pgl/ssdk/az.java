package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a3;

/* loaded from: classes4.dex */
public class az {

    /* renamed from: a, reason: collision with root package name */
    private final a2<a0> f32553a;

    /* renamed from: b, reason: collision with root package name */
    private a3 f32554b;

    /* renamed from: c, reason: collision with root package name */
    private a3 f32555c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final az f32556a = new az();
    }

    private az() {
        this.f32553a = a2.a(2);
    }

    private a0 a(a3.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a0(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a3 b() {
        if (this.f32555c == null) {
            synchronized (az.class) {
                try {
                    if (this.f32555c == null) {
                        this.f32555c = a("pags_net_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32555c;
    }

    public a3 c() {
        if (this.f32554b == null) {
            synchronized (az.class) {
                try {
                    if (this.f32554b == null) {
                        this.f32554b = a("pags_ssdk_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f32554b;
    }

    public a3 a(String str) {
        return b(null, str);
    }

    public a3 b(a3.a aVar, String str) {
        a0 a0Var = (a0) this.f32553a.a();
        if (a0Var == null) {
            return a(aVar, str);
        }
        a0Var.a(aVar);
        a0Var.a(str);
        return a0Var;
    }

    public static az a() {
        return b.f32556a;
    }
}
