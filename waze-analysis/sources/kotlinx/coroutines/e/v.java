package kotlinx.coroutines.e;

import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends kotlinx.coroutines.ab implements kotlinx.coroutines.ao {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.ao f51918b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.ab f51919c;

    /* renamed from: d, reason: collision with root package name */
    private final int f51920d;

    /* renamed from: e, reason: collision with root package name */
    private final String f51921e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.a.b f51922f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f51923g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.bl.b.c.a f51924h;

    /* JADX WARN: Multi-variable type inference failed */
    public v(kotlinx.coroutines.ab abVar, int i2, String str) {
        kotlinx.coroutines.ao aoVar = abVar instanceof kotlinx.coroutines.ao ? (kotlinx.coroutines.ao) abVar : null;
        this.f51918b = aoVar == null ? kotlinx.coroutines.al.a() : aoVar;
        this.f51919c = abVar;
        this.f51920d = i2;
        this.f51921e = str;
        this.f51922f = h.e.b.f(0);
        this.f51924h = new com.waze.bl.b.c.a(null, null, null);
        this.f51923g = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable g() {
        while (true) {
            com.waze.bl.b.c.a aVar = this.f51924h;
            Runnable runnable = (Runnable) aVar.f();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f51923g) {
                kotlinx.a.b bVar = this.f51922f;
                bVar.a();
                if (aVar.e() == 0) {
                    return null;
                }
                bVar.e();
            }
        }
    }

    private final boolean h() {
        synchronized (this.f51923g) {
            kotlinx.a.b bVar = this.f51922f;
            if (bVar.d() >= this.f51920d) {
                return false;
            }
            bVar.e();
            return true;
        }
    }

    @Override // kotlinx.coroutines.ao
    public final ax b(long j2, Runnable runnable, h.c.j jVar) {
        return this.f51918b.b(j2, runnable, jVar);
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        Runnable runnableG;
        this.f51924h.h(runnable);
        if (this.f51922f.d() >= this.f51920d || !h() || (runnableG = g()) == null) {
            return;
        }
        try {
            k.c(this.f51919c, this, new u(this, runnableG));
        } catch (Throwable th) {
            this.f51922f.a();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatchYield(h.c.j jVar, Runnable runnable) {
        Runnable runnableG;
        this.f51924h.h(runnable);
        if (this.f51922f.d() >= this.f51920d || !h() || (runnableG = g()) == null) {
            return;
        }
        try {
            this.f51919c.dispatchYield(this, new u(this, runnableG));
        } catch (Throwable th) {
            this.f51922f.a();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.ao
    public final void f(long j2, kotlinx.coroutines.k kVar) {
        this.f51918b.f(j2, kVar);
    }

    @Override // kotlinx.coroutines.ab
    public final kotlinx.coroutines.ab limitedParallelism(int i2, String str) {
        h.g.b.au.m(i2);
        return i2 >= this.f51920d ? h.g.b.au.l(this, str) : super.limitedParallelism(i2, str);
    }

    @Override // kotlinx.coroutines.ab
    public final String toString() {
        String str = this.f51921e;
        if (str != null) {
            return str;
        }
        return this.f51919c + ".limitedParallelism(" + this.f51920d + ")";
    }
}
