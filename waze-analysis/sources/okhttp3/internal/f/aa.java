package okhttp3.internal.f;

import k.al;
import k.ao;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aa implements al {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f56101a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f56102b;

    /* renamed from: c, reason: collision with root package name */
    private final k.h f56103c = new k.h();

    /* renamed from: d, reason: collision with root package name */
    private boolean f56104d;

    public aa(ad adVar, boolean z) {
        this.f56101a = adVar;
        this.f56102b = z;
    }

    /* JADX WARN: Finally extract failed */
    private final void c(boolean z) {
        long jMin;
        boolean z2;
        ad adVar = this.f56101a;
        synchronized (adVar) {
            adVar.m().l();
            while (adVar.e() >= adVar.d() && !this.f56102b && !this.f56104d && adVar.h() == null) {
                try {
                    adVar.B();
                } catch (Throwable th) {
                    adVar.m().b();
                    throw th;
                }
            }
            adVar.m().b();
            adVar.s();
            long jD = adVar.d() - adVar.e();
            k.h hVar = this.f56103c;
            jMin = Math.min(jD, hVar.q());
            adVar.A(adVar.e() + jMin);
            boolean z3 = false;
            if (z && jMin == hVar.q()) {
                z3 = true;
            }
            z2 = z3;
        }
        ad adVar2 = this.f56101a;
        adVar2.m().l();
        try {
            adVar2.i().F(adVar2.a(), z2, this.f56103c, jMin);
        } finally {
            this.f56101a.m().b();
        }
    }

    public final boolean a() {
        return this.f56104d;
    }

    public final boolean b() {
        return this.f56102b;
    }

    @Override // k.al, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = okhttp3.internal.b.f55955a;
        ad adVar = this.f56101a;
        synchronized (adVar) {
            if (this.f56104d) {
                return;
            }
            b bVarH = adVar.h();
            ad adVar2 = this.f56101a;
            if (!adVar2.j().f56102b) {
                k.h hVar = this.f56103c;
                if (hVar.q() > 0) {
                    while (hVar.q() > 0) {
                        c(true);
                    }
                } else if (bVarH == null) {
                    adVar2.i().F(adVar2.a(), true, null, 0L);
                }
            }
            synchronized (adVar2) {
                this.f56104d = true;
            }
            ad adVar3 = this.f56101a;
            adVar3.i().y();
            adVar3.r();
        }
    }

    @Override // k.al, java.io.Flushable
    public final void flush() {
        byte[] bArr = okhttp3.internal.b.f55955a;
        ad adVar = this.f56101a;
        synchronized (adVar) {
            adVar.s();
        }
        while (this.f56103c.q() > 0) {
            c(false);
            this.f56101a.i().y();
        }
    }

    @Override // k.al
    public final ao h() {
        return this.f56101a.m();
    }

    @Override // k.al
    public final void l(k.h hVar, long j2) {
        h.g.b.x.f(hVar, "source");
        byte[] bArr = okhttp3.internal.b.f55955a;
        k.h hVar2 = this.f56103c;
        hVar2.l(hVar, j2);
        while (hVar2.q() >= 16384) {
            c(false);
        }
    }
}
