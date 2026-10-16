package kotlinx.coroutines.f;

import h.g.b.aq;
import h.g.b.x;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.e.ag;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public b f51932a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51933b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f51934c;

    /* renamed from: d, reason: collision with root package name */
    public final com.waze.push.j f51935d;

    /* renamed from: e, reason: collision with root package name */
    private final aq f51936e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.a.b f51937f;

    /* renamed from: g, reason: collision with root package name */
    private long f51938g;

    /* renamed from: h, reason: collision with root package name */
    private long f51939h;

    /* renamed from: i, reason: collision with root package name */
    private int f51940i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    public a(c cVar, int i2) {
        this.f51934c = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f51935d = new com.waze.push.j();
        this.f51936e = new aq();
        this.f51932a = b.f51944d;
        this.f51937f = h.e.b.f(0);
        this.nextParkedWorker = c.f51947a;
        int iNanoTime = (int) System.nanoTime();
        this.f51940i = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    private final i i() {
        int iB = b(2);
        c cVar = this.f51934c;
        if (iB == 0) {
            i iVar = (i) cVar.f51953g.f();
            return iVar != null ? iVar : (i) cVar.f51954h.f();
        }
        i iVar2 = (i) cVar.f51954h.f();
        return iVar2 != null ? iVar2 : (i) cVar.f51953g.f();
    }

    private final i j(int i2) {
        c cVar = this.f51934c;
        int iD = (int) (cVar.f51956j.d() & 2097151);
        if (iD < 2) {
            return null;
        }
        int iB = b(iD);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < iD; i3++) {
            iB++;
            if (iB > iD) {
                iB = 1;
            }
            a aVar = (a) cVar.f51952f.b(iB);
            if (aVar != null && aVar != this) {
                com.waze.push.j jVar = aVar.f51935d;
                aq aqVar = this.f51936e;
                long jD = jVar.d(i2, aqVar);
                if (jD == -1) {
                    i iVar = (i) aqVar.f48105a;
                    aqVar.f48105a = null;
                    return iVar;
                }
                if (jD > 0) {
                    jMin = Math.min(jMin, jD);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f51939h = jMin;
        return null;
    }

    private final boolean k() {
        return this.nextParkedWorker != c.f51947a;
    }

    public final int a() {
        return this.indexInArray;
    }

    public final int b(int i2) {
        int i3 = this.f51940i;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f51940i = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final kotlinx.a.b d() {
        return this.f51937f;
    }

    public final i e(boolean z) {
        i iVarI;
        i iVarI2;
        long jD;
        b bVar = this.f51932a;
        b bVar2 = b.f51941a;
        if (bVar != bVar2) {
            c cVar = this.f51934c;
            kotlinx.a.c cVar2 = cVar.f51956j;
            do {
                jD = cVar2.d();
                if (((int) ((9223367638808264704L & jD) >> 42)) == 0) {
                    i iVarG = this.f51935d.g();
                    return (iVarG == null && (iVarG = (i) cVar.f51954h.f()) == null) ? j(1) : iVarG;
                }
            } while (!cVar.f51956j.g(jD, (-4398046511104L) + jD));
            this.f51932a = bVar2;
        }
        if (z) {
            int i2 = this.f51934c.f51948b;
            boolean z2 = b(i2 + i2) == 0;
            if (z2 && (iVarI2 = i()) != null) {
                return iVarI2;
            }
            i iVarF = this.f51935d.f();
            if (iVarF != null) {
                return iVarF;
            }
            if (!z2 && (iVarI = i()) != null) {
                return iVarI;
            }
        } else {
            i iVarI3 = i();
            if (iVarI3 != null) {
                return iVarI3;
            }
        }
        return j(3);
    }

    public final void f(int i2) {
        String strValueOf = i2 == 0 ? "TERMINATED" : String.valueOf(i2);
        setName(this.f51934c.f51951e + "-worker-" + strValueOf);
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f51932a;
        boolean z = bVar2 == b.f51941a;
        if (z) {
            this.f51934c.f51956j.a(4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f51932a = bVar;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                c cVar = this.f51934c;
                if (!cVar.e()) {
                    b bVar = this.f51932a;
                    b bVar2 = b.f51945e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarE = e(this.f51933b);
                    if (iVarE != null) {
                        this.f51939h = 0L;
                        this.f51938g = 0L;
                        if (this.f51932a == b.f51943c) {
                            int i2 = ai.f51347a;
                            this.f51932a = b.f51942b;
                        }
                        if (iVarE.f51965g) {
                            if (h(b.f51942b)) {
                                cVar.d();
                            }
                            c.h(iVarE);
                            cVar.f51956j.a(-2097152L);
                            if (this.f51932a != bVar2) {
                                int i3 = ai.f51347a;
                                this.f51932a = b.f51944d;
                            }
                        } else {
                            c.h(iVarE);
                        }
                    } else {
                        this.f51933b = false;
                        if (this.f51939h != 0) {
                            if (z) {
                                h(b.f51943c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f51939h);
                                this.f51939h = 0L;
                                break;
                            }
                            z = true;
                        } else if (k()) {
                            kotlinx.a.b bVar3 = this.f51937f;
                            bVar3.f(-1);
                            while (k() && bVar3.d() == -1 && !cVar.e() && this.f51932a != bVar2) {
                                h(b.f51943c);
                                Thread.interrupted();
                                if (this.f51938g == 0) {
                                    this.f51938g = System.nanoTime() + cVar.f51950d;
                                }
                                LockSupport.parkNanos(cVar.f51950d);
                                if (System.nanoTime() - this.f51938g >= 0) {
                                    this.f51938g = 0L;
                                    ag agVar = cVar.f51952f;
                                    synchronized (agVar) {
                                        if (!cVar.e()) {
                                            if (((int) (cVar.f51956j.d() & 2097151)) > cVar.f51948b && bVar3.g(-1, 1)) {
                                                int i4 = this.indexInArray;
                                                f(0);
                                                cVar.c(this, i4, 0);
                                                int iB = (int) (2097151 & cVar.f51956j.b());
                                                if (iB != i4) {
                                                    Object objB = agVar.b(iB);
                                                    x.c(objB);
                                                    a aVar = (a) objB;
                                                    agVar.c(i4, aVar);
                                                    aVar.f(i4);
                                                    cVar.c(aVar, iB, i4);
                                                }
                                                agVar.c(iB, null);
                                                this.f51932a = bVar2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cVar.g(this);
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f51945e);
    }
}
