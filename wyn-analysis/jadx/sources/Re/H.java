package Re;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class H extends Xe.b {

    /* renamed from: f, reason: collision with root package name */
    public final Y9.c f10653f;

    public H(He.f fVar, Y9.c cVar) {
        super(fVar);
        this.f10653f = cVar;
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
            Object objApply = this.f10653f.apply(obj);
            Ne.b.a(objApply, "The mapper function returned a null value.");
            fVar.b(objApply);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f16234b.cancel();
            onError(th);
        }
    }

    @Override // Oe.h
    public final Object poll() {
        Object objPoll = this.f16235c.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.f10653f.apply(objPoll);
        Ne.b.a(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
