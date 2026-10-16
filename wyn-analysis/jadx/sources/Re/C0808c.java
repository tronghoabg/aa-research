package Re;

import J9.C0663w;
import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* renamed from: Re.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0808c extends AbstractC0807b {

    /* renamed from: m, reason: collision with root package name */
    public final He.f f10714m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10715n;

    public C0808c(He.f fVar, C0663w c0663w, int i5, boolean z2) {
        super(c0663w, i5);
        this.f10714m = fVar;
        this.f10715n = z2;
    }

    @Override // Re.InterfaceC0811f
    public final void a(Throwable th) {
        Ze.b bVar = this.f10712j;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        if (!this.f10715n) {
            this.f10707e.cancel();
            this.f10710h = true;
        }
        this.k = false;
        f();
    }

    @Override // Re.InterfaceC0811f
    public final void c(Object obj) {
        this.f10714m.b(obj);
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
        if (getAndIncrement() == 0) {
            while (!this.f10711i) {
                if (!this.k) {
                    boolean z2 = this.f10710h;
                    if (z2 && !this.f10715n && ((Throwable) this.f10712j.get()) != null) {
                        He.f fVar = this.f10714m;
                        Ze.b bVar = this.f10712j;
                        bVar.getClass();
                        fVar.onError(Ze.d.b(bVar));
                        return;
                    }
                    try {
                        Object objPoll = this.f10709g.poll();
                        boolean z10 = objPoll == null;
                        if (z2 && z10) {
                            Ze.b bVar2 = this.f10712j;
                            bVar2.getClass();
                            Throwable thB = Ze.d.b(bVar2);
                            if (thB != null) {
                                this.f10714m.onError(thB);
                                return;
                            } else {
                                this.f10714m.onComplete();
                                return;
                            }
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
                                        } else if (this.f10703a.f10724g) {
                                            this.f10714m.b(objCall);
                                        } else {
                                            this.k = true;
                                            C0810e c0810e = this.f10703a;
                                            c0810e.g(new C0812g(c0810e, objCall));
                                        }
                                    } catch (Throwable th) {
                                        AbstractC3772b.U(th);
                                        this.f10707e.cancel();
                                        Ze.b bVar3 = this.f10712j;
                                        bVar3.getClass();
                                        Ze.d.a(bVar3, th);
                                        He.f fVar2 = this.f10714m;
                                        Ze.b bVar4 = this.f10712j;
                                        bVar4.getClass();
                                        fVar2.onError(Ze.d.b(bVar4));
                                        return;
                                    }
                                } else {
                                    this.k = true;
                                    aVar.a(this.f10703a);
                                }
                            } catch (Throwable th2) {
                                AbstractC3772b.U(th2);
                                this.f10707e.cancel();
                                Ze.b bVar5 = this.f10712j;
                                bVar5.getClass();
                                Ze.d.a(bVar5, th2);
                                He.f fVar3 = this.f10714m;
                                Ze.b bVar6 = this.f10712j;
                                bVar6.getClass();
                                fVar3.onError(Ze.d.b(bVar6));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC3772b.U(th3);
                        this.f10707e.cancel();
                        Ze.b bVar7 = this.f10712j;
                        bVar7.getClass();
                        Ze.d.a(bVar7, th3);
                        He.f fVar4 = this.f10714m;
                        Ze.b bVar8 = this.f10712j;
                        bVar8.getClass();
                        fVar4.onError(Ze.d.b(bVar8));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // Re.AbstractC0807b
    public final void g() {
        this.f10714m.e(this);
    }

    @Override // He.f
    public final void onError(Throwable th) {
        Ze.b bVar = this.f10712j;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
        } else {
            this.f10710h = true;
            f();
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        this.f10703a.request(j8);
    }
}
