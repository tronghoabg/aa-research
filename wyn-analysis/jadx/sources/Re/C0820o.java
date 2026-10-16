package Re;

import p7.AbstractC3772b;
import x9.C4504d;

/* renamed from: Re.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0820o extends Xe.b {

    /* renamed from: f, reason: collision with root package name */
    public final F5.d f10748f;

    /* renamed from: g, reason: collision with root package name */
    public final ya.b f10749g;

    /* renamed from: h, reason: collision with root package name */
    public final C4504d f10750h;

    /* renamed from: i, reason: collision with root package name */
    public final C4504d f10751i;

    public C0820o(He.f fVar, F5.d dVar, ya.b bVar, C4504d c4504d, C4504d c4504d2) {
        super(fVar);
        this.f10748f = dVar;
        this.f10749g = bVar;
        this.f10750h = c4504d;
        this.f10751i = c4504d2;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f16236d) {
            return;
        }
        int i5 = this.f16237e;
        He.f fVar = this.f16233a;
        if (i5 != 0) {
            fVar.b(null);
            return;
        }
        try {
            this.f10748f.accept(obj);
            fVar.b(obj);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f16234b.cancel();
            onError(th);
        }
    }

    @Override // Xe.b, He.f
    public final void onComplete() {
        if (this.f16236d) {
            return;
        }
        try {
            this.f10750h.getClass();
            this.f16236d = true;
            this.f16233a.onComplete();
            try {
                this.f10751i.getClass();
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                S3.f.A(th);
            }
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            this.f16234b.cancel();
            onError(th2);
        }
    }

    @Override // Xe.b, He.f
    public final void onError(Throwable th) {
        He.f fVar = this.f16233a;
        if (this.f16236d) {
            S3.f.A(th);
            return;
        }
        this.f16236d = true;
        try {
            this.f10749g.getClass();
            fVar.onError(th);
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            fVar.onError(new Ke.b(th, th2));
        }
        try {
            this.f10751i.getClass();
        } catch (Throwable th3) {
            AbstractC3772b.U(th3);
            S3.f.A(th3);
        }
    }

    @Override // Oe.h
    public final Object poll() throws Exception {
        ya.b bVar = this.f10749g;
        try {
            Object objPoll = this.f16235c.poll();
            C4504d c4504d = this.f10751i;
            if (objPoll == null) {
                if (this.f16237e == 1) {
                    this.f10750h.getClass();
                    c4504d.getClass();
                }
                return objPoll;
            }
            try {
                this.f10748f.accept(objPoll);
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
