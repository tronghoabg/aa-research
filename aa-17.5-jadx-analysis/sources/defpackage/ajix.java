package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ajix {
    public static final ajix a;
    private static final Logger e;
    public final Logger b;
    public int c;
    public final erb d;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private final List j;
    private final List k;
    private final Runnable l;

    static {
        Logger logger = Logger.getLogger(ajix.class.getName());
        logger.getClass();
        e = logger;
        a = new ajix(new erb((ThreadFactory) new ajir(String.valueOf(ajis.b).concat(" TaskRunner"), true)), logger);
    }

    public ajix(erb erbVar, Logger logger) {
        logger.getClass();
        this.d = erbVar;
        this.b = logger;
        this.f = 10000;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new adyj(this, 7);
    }

    private final void e() {
        TimeZone timeZone = ajis.a;
        int i = this.i;
        if (i > this.c) {
            return;
        }
        this.i = i + 1;
        erb erbVar = this.d;
        Runnable runnable = this.l;
        runnable.getClass();
        ((ThreadPoolExecutor) erbVar.a).execute(runnable);
    }

    public final ajiu a() {
        boolean z;
        TimeZone timeZone = ajis.a;
        while (true) {
            List list = this.k;
            if (list.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = list.iterator();
            long jMin = Long.MAX_VALUE;
            ajiu ajiuVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ajiu ajiuVar2 = (ajiu) ((ajiw) it.next()).e.get(0);
                long jMax = Math.max(0L, ajiuVar2.c - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (ajiuVar != null) {
                        z = true;
                        break;
                    }
                    ajiuVar = ajiuVar2;
                }
            }
            if (ajiuVar != null) {
                ajiuVar.c = -1L;
                ajiw ajiwVar = ajiuVar.b;
                ajiwVar.getClass();
                ajiwVar.e.remove(ajiuVar);
                List list2 = this.k;
                list2.remove(ajiwVar);
                ajiwVar.d = ajiuVar;
                this.j.add(ajiwVar);
                if (z || (!this.g && !list2.isEmpty())) {
                    e();
                }
                return ajiuVar;
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
                    long j = jMin / 1000000;
                    Long.signum(j);
                    wait(j, (int) (jMin - (1000000 * j)));
                } catch (InterruptedException unused) {
                    List list3 = this.j;
                    int size = list3.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ((ajiw) list3.get(size)).c();
                    }
                    List list4 = this.k;
                    int size2 = list4.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        ajiw ajiwVar2 = (ajiw) list4.get(size2);
                        ajiwVar2.c();
                        if (ajiwVar2.e.isEmpty()) {
                            list4.remove(size2);
                        }
                    }
                } finally {
                    this.g = false;
                }
            }
        }
    }

    public final ajiw b() {
        int i;
        synchronized (this) {
            i = this.f;
            this.f = i + 1;
        }
        return new ajiw(this, a.bp(i, "Q"));
    }

    public final void c(ajiu ajiuVar, long j, boolean z) {
        TimeZone timeZone = ajis.a;
        ajiw ajiwVar = ajiuVar.b;
        ajiwVar.getClass();
        if (ajiwVar.d != ajiuVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = ajiwVar.f;
        ajiwVar.f = false;
        ajiwVar.d = null;
        this.j.remove(ajiwVar);
        if (j != -1 && !z2 && !ajiwVar.c) {
            ajiwVar.d(ajiuVar, j, true);
        }
        if (ajiwVar.e.isEmpty()) {
            return;
        }
        this.k.add(ajiwVar);
        if (z) {
            return;
        }
        e();
    }

    public final void d(ajiw ajiwVar) {
        TimeZone timeZone = ajis.a;
        if (ajiwVar.d == null) {
            boolean zIsEmpty = ajiwVar.e.isEmpty();
            List list = this.k;
            if (zIsEmpty) {
                list.remove(ajiwVar);
            } else {
                int i = ajiq.a;
                if (!list.contains(ajiwVar)) {
                    list.add(ajiwVar);
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
