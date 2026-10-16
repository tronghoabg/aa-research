package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ajjp {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final Object e;

    public ajjp(ajix ajixVar, TimeUnit timeUnit, ajjc ajjcVar) {
        this.b = ajjcVar;
        this.a = timeUnit.toNanos(5L);
        this.c = ajixVar.b();
        this.e = new ajjo(this, String.valueOf(ajis.b).concat(" ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final void a() {
        ((ajiw) this.c).f((ajiu) this.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void b(gjv gjvVar) {
        Runnable runnable;
        gjvVar.getClass();
        synchronized (this.b) {
            runnable = (Runnable) this.e.remove(gjvVar);
        }
        if (runnable != null) {
            ((gjv) this.d).i(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void c(gjv gjvVar) {
        esx esxVar = new esx(this, gjvVar, 9, (char[]) null);
        synchronized (this.b) {
        }
        ((gjv) this.d).j(this.a, esxVar);
    }

    public ajjp(gjv gjvVar, sx sxVar, long j) {
        this.d = gjvVar;
        this.c = sxVar;
        this.a = j;
        this.b = new Object();
        this.e = new LinkedHashMap();
    }
}
