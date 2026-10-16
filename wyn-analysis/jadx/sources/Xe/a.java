package Xe;

import Oe.e;
import Ye.f;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public abstract class a implements Oe.a, e {

    /* renamed from: a, reason: collision with root package name */
    public final Oe.a f16228a;

    /* renamed from: b, reason: collision with root package name */
    public ug.b f16229b;

    /* renamed from: c, reason: collision with root package name */
    public e f16230c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16231d;

    /* renamed from: e, reason: collision with root package name */
    public int f16232e;

    public a(Oe.a aVar) {
        this.f16228a = aVar;
    }

    public final void a(Throwable th) {
        AbstractC3772b.U(th);
        this.f16229b.cancel();
        onError(th);
    }

    @Override // Oe.d
    public int c(int i5) {
        e eVar = this.f16230c;
        if (eVar == null || (i5 & 4) != 0) {
            return 0;
        }
        int iC = eVar.c(i5);
        if (iC == 0) {
            return iC;
        }
        this.f16232e = iC;
        return iC;
    }

    @Override // ug.b
    public final void cancel() {
        this.f16229b.cancel();
    }

    @Override // Oe.h
    public final void clear() {
        this.f16230c.clear();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (f.d(this.f16229b, bVar)) {
            this.f16229b = bVar;
            if (bVar instanceof e) {
                this.f16230c = (e) bVar;
            }
            this.f16228a.e(this);
        }
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f16230c.isEmpty();
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // He.f
    public void onComplete() {
        if (this.f16231d) {
            return;
        }
        this.f16231d = true;
        this.f16228a.onComplete();
    }

    @Override // He.f
    public void onError(Throwable th) {
        if (this.f16231d) {
            S3.f.A(th);
        } else {
            this.f16231d = true;
            this.f16228a.onError(th);
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        this.f16229b.request(j8);
    }
}
