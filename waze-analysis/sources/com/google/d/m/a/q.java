package com.google.d.m.a;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q extends l {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f8078a;

    /* renamed from: b, reason: collision with root package name */
    static final long f8079b;

    /* renamed from: c, reason: collision with root package name */
    static final long f8080c;

    /* renamed from: d, reason: collision with root package name */
    static final long f8081d;

    /* renamed from: e, reason: collision with root package name */
    static final long f8082e;

    /* renamed from: f, reason: collision with root package name */
    static final long f8083f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8084g = 0;

    static {
        Unsafe unsafeG;
        try {
            try {
                unsafeG = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeG = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new p());
                } catch (Exception unused2) {
                    unsafeG = com.waze.c.c.e.g();
                    Unsafe unsafe = unsafeG;
                }
            }
            try {
                f8080c = unsafeG.objectFieldOffset(s.class.getDeclaredField("waitersField"));
                f8079b = unsafeG.objectFieldOffset(s.class.getDeclaredField("listenersField"));
                f8081d = unsafeG.objectFieldOffset(s.class.getDeclaredField("valueField"));
                f8082e = unsafeG.objectFieldOffset(r.class.getDeclaredField("thread"));
                f8083f = unsafeG.objectFieldOffset(r.class.getDeclaredField("next"));
                f8078a = unsafeG;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3);
        }
    }

    @Override // com.google.d.m.a.l
    final h a(s sVar, h hVar) {
        h hVar2;
        do {
            hVar2 = sVar.listenersField;
            if (hVar == hVar2) {
                break;
            }
        } while (!e(sVar, hVar2, hVar));
        return hVar2;
    }

    @Override // com.google.d.m.a.l
    final r b(s sVar, r rVar) {
        r rVar2;
        do {
            rVar2 = sVar.waitersField;
            if (rVar == rVar2) {
                break;
            }
        } while (!g(sVar, rVar2, rVar));
        return rVar2;
    }

    @Override // com.google.d.m.a.l
    final void c(r rVar, r rVar2) {
        f8078a.putObject(rVar, f8083f, rVar2);
    }

    @Override // com.google.d.m.a.l
    final void d(r rVar, Thread thread) {
        f8078a.putObject(rVar, f8082e, thread);
    }

    @Override // com.google.d.m.a.l
    final boolean e(s sVar, h hVar, h hVar2) {
        return o.a(f8078a, sVar, f8079b, hVar, hVar2);
    }

    @Override // com.google.d.m.a.l
    final boolean f(s sVar, Object obj, Object obj2) {
        return o.a(f8078a, sVar, f8081d, obj, obj2);
    }

    @Override // com.google.d.m.a.l
    final boolean g(s sVar, r rVar, r rVar2) {
        return o.a(f8078a, sVar, f8080c, rVar, rVar2);
    }
}
