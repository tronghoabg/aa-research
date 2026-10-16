package Re;

import java.util.concurrent.atomic.AtomicLong;
import p7.AbstractC3772b;
import x9.C4504d;

/* loaded from: classes5.dex */
public final class L extends Ye.a implements He.f {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10668a;

    /* renamed from: b, reason: collision with root package name */
    public final Oe.g f10669b;

    /* renamed from: c, reason: collision with root package name */
    public final C4504d f10670c;

    /* renamed from: d, reason: collision with root package name */
    public ug.b f10671d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10672e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10673f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f10674g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f10675h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    public boolean f10676i;

    public L(He.f fVar, int i5, boolean z2, C4504d c4504d) {
        this.f10668a = fVar;
        this.f10670c = c4504d;
        this.f10669b = z2 ? new Ve.b(i5) : new Ve.a(i5);
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10669b.offer(obj)) {
            if (this.f10676i) {
                this.f10668a.b(null);
                return;
            } else {
                g();
                return;
            }
        }
        this.f10671d.cancel();
        Ke.c cVar = new Ke.c("Buffer is full");
        try {
            this.f10670c.getClass();
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            cVar.initCause(th);
        }
        onError(cVar);
    }

    @Override // Oe.d
    public final int c(int i5) {
        this.f10676i = true;
        return 2;
    }

    @Override // ug.b
    public final void cancel() {
        if (this.f10672e) {
            return;
        }
        this.f10672e = true;
        this.f10671d.cancel();
        if (getAndIncrement() == 0) {
            this.f10669b.clear();
        }
    }

    @Override // Oe.h
    public final void clear() {
        this.f10669b.clear();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10671d, bVar)) {
            this.f10671d = bVar;
            this.f10668a.e(this);
            bVar.request(Long.MAX_VALUE);
        }
    }

    public final boolean f(boolean z2, boolean z10, He.f fVar) {
        if (this.f10672e) {
            this.f10669b.clear();
            return true;
        }
        if (!z2) {
            return false;
        }
        Throwable th = this.f10674g;
        if (th != null) {
            this.f10669b.clear();
            fVar.onError(th);
            return true;
        }
        if (!z10) {
            return false;
        }
        fVar.onComplete();
        return true;
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            Oe.g gVar = this.f10669b;
            He.f fVar = this.f10668a;
            int iAddAndGet = 1;
            while (!f(this.f10673f, gVar.isEmpty(), fVar)) {
                long j8 = this.f10675h.get();
                long j10 = 0;
                while (j10 != j8) {
                    boolean z2 = this.f10673f;
                    Object objPoll = gVar.poll();
                    boolean z10 = objPoll == null;
                    if (f(z2, z10, fVar)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    fVar.b(objPoll);
                    j10++;
                }
                if (j10 == j8 && f(this.f10673f, gVar.isEmpty(), fVar)) {
                    return;
                }
                if (j10 != 0 && j8 != Long.MAX_VALUE) {
                    this.f10675h.addAndGet(-j10);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f10669b.isEmpty();
    }

    @Override // He.f
    public final void onComplete() {
        this.f10673f = true;
        if (this.f10676i) {
            this.f10668a.onComplete();
        } else {
            g();
        }
    }

    @Override // He.f
    public final void onError(Throwable th) {
        this.f10674g = th;
        this.f10673f = true;
        if (this.f10676i) {
            this.f10668a.onError(th);
        } else {
            g();
        }
    }

    @Override // Oe.h
    public final Object poll() {
        return this.f10669b.poll();
    }

    @Override // ug.b
    public final void request(long j8) {
        if (this.f10676i || !Ye.f.c(j8)) {
            return;
        }
        Fe.e.f(this.f10675h, j8);
        g();
    }
}
