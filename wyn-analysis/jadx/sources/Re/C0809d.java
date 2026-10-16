package Re;

import J9.C0663w;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p7.AbstractC3772b;

/* renamed from: Re.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0809d extends AbstractC0807b {

    /* renamed from: m, reason: collision with root package name */
    public final He.f f10716m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f10717n;

    public C0809d(He.f fVar, C0663w c0663w, int i5) {
        super(c0663w, i5);
        this.f10716m = fVar;
        this.f10717n = new AtomicInteger();
    }

    @Override // Re.InterfaceC0811f
    public final void a(Throwable th) {
        Ze.b bVar = this.f10712j;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        this.f10707e.cancel();
        if (getAndIncrement() == 0) {
            this.f10716m.onError(Ze.d.b(bVar));
        }
    }

    @Override // Re.InterfaceC0811f
    public final void c(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            He.f fVar = this.f10716m;
            fVar.b(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            Ze.b bVar = this.f10712j;
            bVar.getClass();
            fVar.onError(Ze.d.b(bVar));
        }
    }

    @Override // ug.b
    public final void cancel() {
        if (this.f10711i) {
            return;
        }
        this.f10711i = true;
        this.f10703a.cancel();
        this.f10707e.cancel();
    }

    @Override // Re.AbstractC0807b
    public final void f() {
        if (this.f10717n.getAndIncrement() == 0) {
            while (!this.f10711i) {
                if (!this.k) {
                    boolean z2 = this.f10710h;
                    try {
                        Object objPoll = this.f10709g.poll();
                        boolean z10 = objPoll == null;
                        if (z2 && z10) {
                            this.f10716m.onComplete();
                            return;
                        }
                        if (!z10) {
                            try {
                                ug.a aVar = (ug.a) this.f10704b.apply(objPoll);
                                if (this.f10713l != 1) {
                                    int i5 = this.f10708f + 1;
                                    if (i5 == this.f10706d) {
                                        this.f10708f = 0;
                                        this.f10707e.request(i5);
                                    } else {
                                        this.f10708f = i5;
                                    }
                                }
                                if (aVar instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) aVar).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (!this.f10703a.f10724g) {
                                            this.k = true;
                                            C0810e c0810e = this.f10703a;
                                            c0810e.g(new C0812g(c0810e, objCall));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.f10716m.b(objCall);
                                            if (!compareAndSet(1, 0)) {
                                                He.f fVar = this.f10716m;
                                                Ze.b bVar = this.f10712j;
                                                bVar.getClass();
                                                fVar.onError(Ze.d.b(bVar));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        AbstractC3772b.U(th);
                                        this.f10707e.cancel();
                                        Ze.b bVar2 = this.f10712j;
                                        bVar2.getClass();
                                        Ze.d.a(bVar2, th);
                                        He.f fVar2 = this.f10716m;
                                        Ze.b bVar3 = this.f10712j;
                                        bVar3.getClass();
                                        fVar2.onError(Ze.d.b(bVar3));
                                        return;
                                    }
                                } else {
                                    this.k = true;
                                    aVar.a(this.f10703a);
                                }
                            } catch (Throwable th2) {
                                AbstractC3772b.U(th2);
                                this.f10707e.cancel();
                                Ze.b bVar4 = this.f10712j;
                                bVar4.getClass();
                                Ze.d.a(bVar4, th2);
                                He.f fVar3 = this.f10716m;
                                Ze.b bVar5 = this.f10712j;
                                bVar5.getClass();
                                fVar3.onError(Ze.d.b(bVar5));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC3772b.U(th3);
                        this.f10707e.cancel();
                        Ze.b bVar6 = this.f10712j;
                        bVar6.getClass();
                        Ze.d.a(bVar6, th3);
                        He.f fVar4 = this.f10716m;
                        Ze.b bVar7 = this.f10712j;
                        bVar7.getClass();
                        fVar4.onError(Ze.d.b(bVar7));
                        return;
                    }
                }
                if (this.f10717n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // Re.AbstractC0807b
    public final void g() {
        this.f10716m.e(this);
    }

    @Override // He.f
    public final void onError(Throwable th) {
        Ze.b bVar = this.f10712j;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        this.f10703a.cancel();
        if (getAndIncrement() == 0) {
            bVar.getClass();
            this.f10716m.onError(Ze.d.b(bVar));
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        this.f10703a.request(j8);
    }
}
