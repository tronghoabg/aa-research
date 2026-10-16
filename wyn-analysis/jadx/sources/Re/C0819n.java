package Re;

import p7.AbstractC3772b;
import x9.C4504d;

/* renamed from: Re.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0819n extends Xe.a {

    /* renamed from: f, reason: collision with root package name */
    public final F5.d f10744f;

    /* renamed from: g, reason: collision with root package name */
    public final ya.b f10745g;

    /* renamed from: h, reason: collision with root package name */
    public final C4504d f10746h;

    /* renamed from: i, reason: collision with root package name */
    public final C4504d f10747i;

    public C0819n(Oe.a aVar, F5.d dVar, ya.b bVar, C4504d c4504d, C4504d c4504d2) {
        super(aVar);
        this.f10744f = dVar;
        this.f10745g = bVar;
        this.f10746h = c4504d;
        this.f10747i = c4504d2;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f16231d) {
            return;
        }
        int i5 = this.f16232e;
        Oe.a aVar = this.f16228a;
        if (i5 != 0) {
            aVar.b(null);
            return;
        }
        try {
            this.f10744f.accept(obj);
            aVar.b(obj);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // Oe.a
    public final boolean d(Object obj) {
        if (this.f16231d) {
            return false;
        }
        try {
            this.f10744f.accept(obj);
            return this.f16228a.d(obj);
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    @Override // Xe.a, He.f
    public final void onComplete() {
        if (this.f16231d) {
            return;
        }
        try {
            this.f10746h.getClass();
            this.f16231d = true;
            this.f16228a.onComplete();
            try {
                this.f10747i.getClass();
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                S3.f.A(th);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // Xe.a, He.f
    public final void onError(Throwable th) {
        Oe.a aVar = this.f16228a;
        if (this.f16231d) {
            S3.f.A(th);
            return;
        }
        this.f16231d = true;
        try {
            this.f10745g.getClass();
            aVar.onError(th);
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            aVar.onError(new Ke.b(th, th2));
        }
        try {
            this.f10747i.getClass();
        } catch (Throwable th3) {
            AbstractC3772b.U(th3);
            S3.f.A(th3);
        }
    }

    @Override // Oe.h
    public final Object poll() throws Exception {
        ya.b bVar = this.f10745g;
        try {
            Object objPoll = this.f16230c.poll();
            C4504d c4504d = this.f10747i;
            if (objPoll == null) {
                if (this.f16232e == 1) {
                    this.f10746h.getClass();
                    c4504d.getClass();
                }
                return objPoll;
            }
            try {
                this.f10744f.accept(objPoll);
                c4504d.getClass();
                return objPoll;
            } catch (Throwable th) {
                try {
                    AbstractC3772b.U(th);
                    try {
                        bVar.getClass();
                        Ze.c cVar = Ze.d.f17085a;
                        if (th instanceof Exception) {
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw new Ke.b(th, th2);
                    }
                } catch (Throwable th3) {
                    c4504d.getClass();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            AbstractC3772b.U(th4);
            try {
                bVar.getClass();
                Ze.c cVar2 = Ze.d.f17085a;
                if (th4 instanceof Exception) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                throw new Ke.b(th4, th5);
            }
        }
    }
}
