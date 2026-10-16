package Xe;

import He.f;
import Oe.e;

/* loaded from: classes5.dex */
public abstract class b implements f, e {

    /* renamed from: a, reason: collision with root package name */
    public final f f16233a;

    /* renamed from: b, reason: collision with root package name */
    public ug.b f16234b;

    /* renamed from: c, reason: collision with root package name */
    public e f16235c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16236d;

    /* renamed from: e, reason: collision with root package name */
    public int f16237e;

    public b(f fVar) {
        this.f16233a = fVar;
    }

    @Override // Oe.d
    public int c(int i5) {
        e eVar = this.f16235c;
        if (eVar == null || (i5 & 4) != 0) {
            return 0;
        }
        int iC = eVar.c(i5);
        if (iC == 0) {
            return iC;
        }
        this.f16237e = iC;
        return iC;
    }

    @Override // ug.b
    public final void cancel() {
        this.f16234b.cancel();
    }

    @Override // Oe.h
    public final void clear() {
        this.f16235c.clear();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f16234b, bVar)) {
            this.f16234b = bVar;
            if (bVar instanceof e) {
                this.f16235c = (e) bVar;
            }
            this.f16233a.e(this);
        }
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f16235c.isEmpty();
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // He.f
    public void onComplete() {
        if (this.f16236d) {
            return;
        }
        this.f16236d = true;
        this.f16233a.onComplete();
    }

    @Override // He.f
    public void onError(Throwable th) {
        if (this.f16236d) {
            S3.f.A(th);
        } else {
            this.f16236d = true;
            this.f16233a.onError(th);
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        this.f16234b.request(j8);
    }
}
