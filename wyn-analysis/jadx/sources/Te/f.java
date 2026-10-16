package Te;

import J9.T;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class f implements He.j, Oe.c {

    /* renamed from: a, reason: collision with root package name */
    public final He.j f11844a;

    /* renamed from: b, reason: collision with root package name */
    public Je.b f11845b;

    /* renamed from: c, reason: collision with root package name */
    public Oe.c f11846c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11848e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11849f;

    public f(He.j jVar, Object obj, int i5) {
        this.f11848e = i5;
        this.f11844a = jVar;
        this.f11849f = obj;
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        if (Me.a.f(this.f11845b, bVar)) {
            this.f11845b = bVar;
            if (bVar instanceof Oe.c) {
                this.f11846c = (Oe.c) bVar;
            }
            this.f11844a.a(this);
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        switch (this.f11848e) {
            case 0:
                He.j jVar = this.f11844a;
                try {
                    if (((T) this.f11849f).test(obj)) {
                        jVar.b(obj);
                        break;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    this.f11845b.dispose();
                    onError(th);
                    return;
                }
                break;
            default:
                if (!this.f11847d) {
                    He.j jVar2 = this.f11844a;
                    try {
                        Object objApply = ((Le.c) this.f11849f).apply(obj);
                        Ne.b.a(objApply, "The mapper function returned a null value.");
                        jVar2.b(objApply);
                        break;
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        this.f11845b.dispose();
                        onError(th2);
                    }
                }
                break;
        }
    }

    @Override // Oe.d
    public final int c(int i5) {
        switch (this.f11848e) {
        }
        return 0;
    }

    @Override // Oe.h
    public final void clear() {
        this.f11846c.clear();
    }

    @Override // Je.b
    public final void dispose() {
        this.f11845b.dispose();
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f11846c.isEmpty();
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // He.j
    public final void onComplete() {
        if (this.f11847d) {
            return;
        }
        this.f11847d = true;
        this.f11844a.onComplete();
    }

    @Override // He.j
    public final void onError(Throwable th) {
        if (this.f11847d) {
            S3.f.A(th);
        } else {
            this.f11847d = true;
            this.f11844a.onError(th);
        }
    }

    @Override // Oe.h
    public final Object poll() {
        Object objPoll;
        switch (this.f11848e) {
            case 0:
                break;
            default:
                Object objPoll2 = this.f11846c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((Le.c) this.f11849f).apply(objPoll2);
                Ne.b.a(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.f11846c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((T) this.f11849f).test(objPoll));
        return objPoll;
    }
}
