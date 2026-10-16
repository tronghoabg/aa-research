package com.google.d.f.b.a;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j extends a {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f7705a;

    /* renamed from: b, reason: collision with root package name */
    static final boolean f7706b;

    /* renamed from: c, reason: collision with root package name */
    static final boolean f7707c;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference f7708d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLong f7709e;

    /* renamed from: f, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f7710f;

    /* renamed from: g, reason: collision with root package name */
    private volatile com.google.d.f.b.g f7711g;

    static {
        f7705a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        f7706b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        f7707c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        f7708d = new AtomicReference();
        f7709e = new AtomicLong();
        f7710f = new ConcurrentLinkedQueue();
    }

    private j(String str) {
        super(str);
        if (f7705a || f7706b) {
            this.f7711g = new b().a(a());
        } else if (f7707c) {
            this.f7711g = n.f().b().a(a());
        } else {
            this.f7711g = null;
        }
    }

    public static com.google.d.f.b.g e(String str) {
        AtomicReference atomicReference = f7708d;
        if (atomicReference.get() != null) {
            return ((c) atomicReference.get()).a(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace('$', '.');
                    break;
                }
            } else {
                break;
            }
        }
        j jVar = new j(str);
        ConcurrentLinkedQueue concurrentLinkedQueue = h.f7702a;
        concurrentLinkedQueue.offer(jVar);
        if (atomicReference.get() != null) {
            while (true) {
                j jVar2 = (j) concurrentLinkedQueue.poll();
                if (jVar2 == null) {
                    break;
                }
                jVar2.f7711g = ((c) atomicReference.get()).a(jVar2.a());
            }
            f();
        }
        return jVar;
    }

    private static void f() {
        while (true) {
            i iVar = (i) f7710f.poll();
            if (iVar == null) {
                return;
            }
            f7709e.getAndDecrement();
            com.google.d.f.b.g gVarB = iVar.b();
            com.google.d.f.b.f fVarA = iVar.a();
            if (fVarA.r() || gVarB.d(fVarA.m())) {
                gVarB.c(fVarA);
            }
        }
    }

    @Override // com.google.d.f.b.a.a, com.google.d.f.b.g
    public final void b(RuntimeException runtimeException, com.google.d.f.b.f fVar) {
        if (this.f7711g != null) {
            this.f7711g.b(runtimeException, fVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // com.google.d.f.b.g
    public final void c(com.google.d.f.b.f fVar) {
        if (this.f7711g != null) {
            this.f7711g.c(fVar);
            return;
        }
        if (f7709e.incrementAndGet() > 20) {
            f7710f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f7710f.offer(new i(this, fVar));
        if (this.f7711g != null) {
            f();
        }
    }

    @Override // com.google.d.f.b.g
    public final boolean d(Level level) {
        return this.f7711g == null || this.f7711g.d(level);
    }
}
