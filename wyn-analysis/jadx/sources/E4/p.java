package E4;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2949a;

    /* renamed from: b, reason: collision with root package name */
    public final U4.d f2950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2951c;

    public /* synthetic */ p(s sVar, U4.d dVar, int i5) {
        this.f2949a = i5;
        this.f2951c = sVar;
        this.f2950b = dVar;
    }

    private final void a() {
        U4.d dVar = this.f2950b;
        dVar.f12286b.a();
        synchronized (dVar.f12287c) {
            synchronized (this.f2951c) {
                try {
                    r rVar = this.f2951c.f2956a;
                    U4.d dVar2 = this.f2950b;
                    rVar.getClass();
                    if (rVar.f2954a.contains(new q(dVar2, Y4.h.f16692b))) {
                        s sVar = this.f2951c;
                        U4.d dVar3 = this.f2950b;
                        sVar.getClass();
                        try {
                            dVar3.i(sVar.f2971q, 5);
                        } catch (Throwable th) {
                            throw new C0435d(th);
                        }
                    }
                    this.f2951c.d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2949a) {
            case 0:
                a();
                return;
            default:
                U4.d dVar = this.f2950b;
                dVar.f12286b.a();
                synchronized (dVar.f12287c) {
                    synchronized (this.f2951c) {
                        try {
                            r rVar = this.f2951c.f2956a;
                            U4.d dVar2 = this.f2950b;
                            rVar.getClass();
                            if (rVar.f2954a.contains(new q(dVar2, Y4.h.f16692b))) {
                                this.f2951c.f2973s.c();
                                s sVar = this.f2951c;
                                U4.d dVar3 = this.f2950b;
                                sVar.getClass();
                                try {
                                    dVar3.j(sVar.f2973s, sVar.f2969o);
                                    this.f2951c.j(this.f2950b);
                                } catch (Throwable th) {
                                    throw new C0435d(th);
                                }
                            }
                            this.f2951c.d();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
        }
    }
}
