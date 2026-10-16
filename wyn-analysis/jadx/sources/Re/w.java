package Re;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class w extends Xe.b implements Oe.a {

    /* renamed from: f, reason: collision with root package name */
    public final Le.d f10767f;

    public w(He.f fVar, Le.d dVar) {
        super(fVar);
        this.f10767f = dVar;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (d(obj)) {
            return;
        }
        this.f16234b.request(1L);
    }

    @Override // Oe.a
    public final boolean d(Object obj) {
        if (this.f16236d) {
            return false;
        }
        int i5 = this.f16237e;
        He.f fVar = this.f16233a;
        if (i5 != 0) {
            fVar.b(null);
            return true;
        }
        try {
            boolean zTest = this.f10767f.test(obj);
            if (zTest) {
                fVar.b(obj);
            }
            return zTest;
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f16234b.cancel();
            onError(th);
            return true;
        }
    }

    @Override // Oe.h
    public final Object poll() {
        Oe.e eVar = this.f16235c;
        while (true) {
            Object objPoll = eVar.poll();
            if (objPoll == null) {
                return null;
            }
            if (this.f10767f.test(objPoll)) {
                return objPoll;
            }
            if (this.f16237e == 2) {
                eVar.request(1L);
            }
        }
    }
}
