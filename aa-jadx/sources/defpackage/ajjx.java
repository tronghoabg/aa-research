package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajjx {
    public static final defpackage.ajjx a;
    private static final java.util.logging.Logger e;
    public final java.util.logging.Logger b;
    public int c;
    public final defpackage.erh d;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private final java.util.List j;
    private final java.util.List k;
    private final java.lang.Runnable l;

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.ajjx.class.getName());
        logger.getClass();
        e = logger;
        a = new defpackage.ajjx(new defpackage.erh((java.util.concurrent.ThreadFactory) new defpackage.ajjr(java.lang.String.valueOf(defpackage.ajjs.b).concat(" TaskRunner"), true)), logger);
    }

    public ajjx(defpackage.erh erhVar, java.util.logging.Logger logger) {
        logger.getClass();
        this.d = erhVar;
        this.b = logger;
        this.f = 10000;
        this.j = new java.util.ArrayList();
        this.k = new java.util.ArrayList();
        this.l = new defpackage.adxw(this, 16);
    }

    private final void e() {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        int i = this.i;
        if (i > this.c) {
            return;
        }
        this.i = i + 1;
        defpackage.erh erhVar = this.d;
        java.lang.Runnable runnable = this.l;
        runnable.getClass();
        ((java.util.concurrent.ThreadPoolExecutor) erhVar.a).execute(runnable);
    }

    public final defpackage.ajju a() {
        boolean z;
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        while (true) {
            java.util.List list = this.k;
            if (list.isEmpty()) {
                return null;
            }
            long jNanoTime = java.lang.System.nanoTime();
            java.util.Iterator it = list.iterator();
            long jMin = Long.MAX_VALUE;
            defpackage.ajju ajjuVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                defpackage.ajju ajjuVar2 = (defpackage.ajju) ((defpackage.ajjw) it.next()).e.get(0);
                long jMax = java.lang.Math.max(0L, ajjuVar2.c - jNanoTime);
                if (jMax > 0) {
                    jMin = java.lang.Math.min(jMax, jMin);
                } else {
                    if (ajjuVar != null) {
                        z = true;
                        break;
                    }
                    ajjuVar = ajjuVar2;
                }
            }
            if (ajjuVar != null) {
                ajjuVar.c = -1L;
                defpackage.ajjw ajjwVar = ajjuVar.b;
                ajjwVar.getClass();
                ajjwVar.e.remove(ajjuVar);
                java.util.List list2 = this.k;
                list2.remove(ajjwVar);
                ajjwVar.d = ajjuVar;
                this.j.add(ajjwVar);
                if (z || (!this.g && !list2.isEmpty())) {
                    e();
                }
                return ajjuVar;
            }
            if (this.g) {
                if (jMin < this.h - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.g = true;
            this.h = jNanoTime + jMin;
            if (jMin > 0) {
                try {
                    try {
                        long j = jMin / 1000000;
                        java.lang.Long.signum(j);
                        wait(j, (int) (jMin - (1000000 * j)));
                    } catch (java.lang.InterruptedException unused) {
                        java.util.List list3 = this.j;
                        int size = list3.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((defpackage.ajjw) list3.get(size)).c();
                        }
                        java.util.List list4 = this.k;
                        int size2 = list4.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            defpackage.ajjw ajjwVar2 = (defpackage.ajjw) list4.get(size2);
                            ajjwVar2.c();
                            if (ajjwVar2.e.isEmpty()) {
                                list4.remove(size2);
                            }
                        }
                        this.g = false;
                    }
                } catch (java.lang.Throwable th) {
                    this.g = false;
                    throw th;
                }
            }
            this.g = false;
        }
    }

    public final defpackage.ajjw b() {
        int i;
        synchronized (this) {
            i = this.f;
            this.f = i + 1;
        }
        return new defpackage.ajjw(this, defpackage.a.bo(i, "Q"));
    }

    public final void c(defpackage.ajju ajjuVar, long j, boolean z) {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        defpackage.ajjw ajjwVar = ajjuVar.b;
        ajjwVar.getClass();
        if (ajjwVar.d != ajjuVar) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        boolean z2 = ajjwVar.f;
        ajjwVar.f = false;
        ajjwVar.d = null;
        this.j.remove(ajjwVar);
        if (j != -1 && !z2 && !ajjwVar.c) {
            ajjwVar.d(ajjuVar, j, true);
        }
        if (ajjwVar.e.isEmpty()) {
            return;
        }
        this.k.add(ajjwVar);
        if (z) {
            return;
        }
        e();
    }

    public final void d(defpackage.ajjw ajjwVar) {
        java.util.TimeZone timeZone = defpackage.ajjs.a;
        if (ajjwVar.d == null) {
            boolean zIsEmpty = ajjwVar.e.isEmpty();
            java.util.List list = this.k;
            if (zIsEmpty) {
                list.remove(ajjwVar);
            } else {
                int i = defpackage.ajjq.a;
                if (!list.contains(ajjwVar)) {
                    list.add(ajjwVar);
                }
            }
        }
        if (this.g) {
            notify();
        } else {
            e();
        }
    }
}
