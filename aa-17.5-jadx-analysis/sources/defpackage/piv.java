package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class piv {
    public final Executor d;
    private static final yob f = yob.c("com/google/android/apps/gmm/kits/mapcore/gesture/CompositePickHandlerImpl");
    public static final piy a = new pit();
    public final Map b = new ConcurrentHashMap();
    public aace e = null;
    public piy c = a;

    public piv(Executor executor) {
        this.d = executor;
    }

    public final void a(tsc tscVar) {
        this.b.remove(piu.d(tscVar));
    }

    public final void b(tsc tscVar, pix pixVar) {
        this.b.put(piu.d(tscVar), pixVar);
    }
}
