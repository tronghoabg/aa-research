package okhttp3.internal.b;

import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f55973a = new e(new com.waze.shared_infra.s.c(okhttp3.internal.b.q(String.valueOf(okhttp3.internal.b.f55959e).concat(" TaskRunner"), true)));

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f55974b;

    /* renamed from: c, reason: collision with root package name */
    private int f55975c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55976d;

    /* renamed from: e, reason: collision with root package name */
    private long f55977e;

    /* renamed from: f, reason: collision with root package name */
    private final List f55978f;

    /* renamed from: g, reason: collision with root package name */
    private final List f55979g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f55980h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.s.c f55981i;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        x.e(logger, "getLogger(...)");
        f55974b = logger;
    }

    public e(com.waze.shared_infra.s.c cVar) {
        x.f(cVar, "backend");
        this.f55981i = cVar;
        this.f55975c = 10000;
        this.f55978f = new ArrayList();
        this.f55979g = new ArrayList();
        this.f55980h = new d(this);
    }

    public static final /* synthetic */ void d(e eVar, a aVar) {
        byte[] bArr = okhttp3.internal.b.f55955a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.c());
        try {
            long jB = aVar.b();
            synchronized (eVar) {
                eVar.g(aVar, jB);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (eVar) {
                eVar.g(aVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    private final void g(a aVar, long j2) {
        byte[] bArr = okhttp3.internal.b.f55955a;
        c cVarD = aVar.d();
        x.c(cVarD);
        if (cVarD.c() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zH = cVarD.h();
        cVarD.k();
        cVarD.e(null);
        this.f55978f.remove(cVarD);
        if (j2 != -1 && !zH && !cVarD.i()) {
            cVarD.j(aVar, j2, true);
        }
        if (cVarD.b().isEmpty()) {
            return;
        }
        this.f55979g.add(cVarD);
    }

    public final a b() {
        boolean z;
        byte[] bArr = okhttp3.internal.b.f55955a;
        while (true) {
            List list = this.f55979g;
            if (list.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = list.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).b().get(0);
                long jMax = Math.max(0L, aVar2.a() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                aVar.f(-1L);
                c cVarD = aVar.d();
                x.c(cVarD);
                cVarD.b().remove(aVar);
                List list2 = this.f55979g;
                list2.remove(cVarD);
                cVarD.e(aVar);
                this.f55978f.add(cVarD);
                if (z || (!this.f55976d && !list2.isEmpty())) {
                    this.f55981i.h(this.f55980h);
                }
                return aVar;
            }
            if (this.f55976d) {
                if (jMin < this.f55977e - jNanoTime) {
                    com.waze.shared_infra.s.c.i(this);
                }
                return null;
            }
            this.f55976d = true;
            this.f55977e = jNanoTime + jMin;
            try {
                x.f(this, "taskRunner");
                long j2 = jMin / 1000000;
                if (j2 > 0 || jMin > 0) {
                    wait(j2, (int) (jMin - (1000000 * j2)));
                }
            } catch (InterruptedException unused) {
                List list3 = this.f55978f;
                int size = list3.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((c) list3.get(size)).g();
                }
                List list4 = this.f55979g;
                int size2 = list4.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    }
                    c cVar = (c) list4.get(size2);
                    cVar.g();
                    if (cVar.b().isEmpty()) {
                        list4.remove(size2);
                    }
                }
            } finally {
                this.f55976d = false;
            }
        }
    }

    public final c c() {
        int i2;
        synchronized (this) {
            i2 = this.f55975c;
            this.f55975c = i2 + 1;
        }
        return new c(this, "Q" + i2);
    }

    public final void e(c cVar) {
        x.f(cVar, "taskQueue");
        byte[] bArr = okhttp3.internal.b.f55955a;
        if (cVar.c() == null) {
            boolean zIsEmpty = cVar.b().isEmpty();
            List list = this.f55979g;
            if (zIsEmpty) {
                list.remove(cVar);
            } else {
                x.f(list, "<this>");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            }
        }
        if (this.f55976d) {
            com.waze.shared_infra.s.c.i(this);
        } else {
            this.f55981i.h(this.f55980h);
        }
    }

    public final com.waze.shared_infra.s.c f() {
        return this.f55981i;
    }
}
