package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.SystemClock;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class pkx implements plg {
    public static final yob a = yob.c("com/google/android/apps/gmm/shared/cache/CacheManager");
    public final erb b;
    private final ConcurrentMap c;
    private final AtomicBoolean d;
    private final ComponentCallbacks2 e;

    public pkx(Context context, erb erbVar) {
        Runtime runtime = Runtime.getRuntime();
        yip yipVar = new yip();
        yipVar.h();
        this.c = yipVar.e();
        this.d = new AtomicBoolean(false);
        pkv pkvVar = new pkv(this);
        this.e = pkvVar;
        if (runtime.maxMemory() < 16777216) {
            ((ynz) ((ynz) ((ynz) a.g()).q(ypd.FULL)).ai(6759)).x("Device has lower than minimum required amount of RAM: %d", runtime.maxMemory());
        }
        this.b = erbVar;
        context.registerComponentCallbacks(pkvVar);
    }

    @Override // defpackage.plg
    public final String a() {
        return null;
    }

    public final void b(pkw pkwVar) {
        float f = 1.0f;
        switch (pkwVar.ordinal()) {
            case 0:
            case 4:
                f = 0.0f;
                break;
            case 1:
            case 5:
                f = 0.5f;
                break;
            case 2:
            case 3:
                break;
            case 6:
                f = 0.7f;
                break;
            case 7:
                f = 0.8f;
                break;
            default:
                throw new RuntimeException(null, null);
        }
        f(f);
    }

    public final void c(plg plgVar, vky vkyVar) {
        this.c.put(plgVar, vkyVar);
    }

    public final void d(plg plgVar, String str) {
        c(plgVar, new vky(str));
    }

    public final void e(plg plgVar) {
        this.c.remove(plgVar);
    }

    @Override // defpackage.plg
    @ResultIgnorabilityUnspecified
    public final void f(float f) {
        if (f != 1.0f && this.d.compareAndSet(false, true)) {
            ConcurrentMap concurrentMap = this.c;
            for (plg plgVar : concurrentMap.keySet()) {
                synchronized (plgVar) {
                    plgVar.f(f);
                    vky vkyVar = (vky) concurrentMap.get(plgVar);
                    if (vkyVar != null) {
                        prg.a("CacheManager_".concat(vkyVar.a), plgVar.a());
                    }
                }
            }
            this.d.set(false);
            SystemClock.elapsedRealtime();
        }
    }
}
