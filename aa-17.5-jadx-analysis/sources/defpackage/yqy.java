package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class yqy extends yqr {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile ypp g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public yqy(String str) {
        super(str);
        if (a || b) {
            this.g = new yqs().a(f());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        yra yraVar = yrc.c;
        String str2 = yraVar.a;
        boolean z = yraVar.b;
        int i = yraVar.f;
        this.g = new yra(str2, z, 2, Level.OFF, yraVar.d, yraVar.e).a(f());
    }

    public static void c() {
        while (true) {
            yqy yqyVar = (yqy) yqx.a.poll();
            if (yqyVar == null) {
                d();
                return;
            }
            yqyVar.g = ((yqt) d.get()).a(yqyVar.f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ypo] */
    private static void d() {
        while (true) {
            rju rjuVar = (rju) f.poll();
            if (rjuVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = rjuVar.b;
            Object obj = rjuVar.a;
            if (!r1.h()) {
                if (((ypp) obj).b(r1.g())) {
                }
            }
            ((ypp) obj).a(r1);
        }
    }

    @Override // defpackage.ypp
    public final void a(ypo ypoVar) {
        if (this.g != null) {
            this.g.a(ypoVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new rju(this, ypoVar));
        if (this.g != null) {
            d();
        }
    }

    @Override // defpackage.ypp
    public final boolean b(Level level) {
        return this.g == null || this.g.b(level);
    }

    @Override // defpackage.yqr, defpackage.ypp
    public final void g(RuntimeException runtimeException, ypo ypoVar) {
        if (this.g != null) {
            this.g.g(runtimeException, ypoVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
