package Se;

import Re.A;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class c extends AtomicReference implements Je.b, He.h, He.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11068a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11069b;

    public /* synthetic */ c(AtomicInteger atomicInteger, int i5) {
        this.f11068a = i5;
        this.f11069b = atomicInteger;
    }

    @Override // He.h
    public void a(Je.b bVar) {
        switch (this.f11068a) {
            case 1:
                Me.a.e(this, bVar);
                break;
            case 2:
                Me.a.e(this, bVar);
                break;
            default:
                Me.a.e(this, bVar);
                break;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f11068a) {
            case 0:
                Me.a.a(this);
                break;
            case 1:
                Me.a.a(this);
                break;
            case 2:
                Me.a.a(this);
                break;
            default:
                Me.a.a(this);
                break;
        }
    }

    @Override // He.h
    public final void onComplete() {
        Je.b bVar;
        switch (this.f11068a) {
            case 0:
                Object obj = get();
                Me.a aVar = Me.a.f7633a;
                if (obj == aVar || (bVar = (Je.b) getAndSet(aVar)) == aVar) {
                    return;
                }
                try {
                    ((He.h) this.f11069b).onComplete();
                    if (bVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            case 1:
                A a5 = (A) this.f11069b;
                a5.f10617d.c(this);
                int i5 = a5.get();
                AtomicInteger atomicInteger = a5.f10618e;
                int i10 = a5.f10615b;
                if (i5 == 0) {
                    if (a5.compareAndSet(0, 1)) {
                        boolean z2 = atomicInteger.decrementAndGet() == 0;
                        Ve.b bVar2 = (Ve.b) a5.f10621h.get();
                        if (!z2 || (bVar2 != null && !bVar2.isEmpty())) {
                            if (i10 != Integer.MAX_VALUE) {
                                a5.f10622i.request(1L);
                            }
                            if (a5.decrementAndGet() == 0) {
                                return;
                            }
                            a5.f();
                            return;
                        }
                        Ze.b bVar3 = a5.f10619f;
                        bVar3.getClass();
                        Throwable thB = Ze.d.b(bVar3);
                        He.f fVar = a5.f10614a;
                        if (thB != null) {
                            fVar.onError(thB);
                            return;
                        } else {
                            fVar.onComplete();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (i10 != Integer.MAX_VALUE) {
                    a5.f10622i.request(1L);
                }
                a5.c();
                return;
            case 2:
                Te.j jVar = (Te.j) this.f11069b;
                jVar.f11875d.c(this);
                jVar.onComplete();
                return;
            default:
                Te.k kVar = (Te.k) this.f11069b;
                kVar.f11881d.c(this);
                kVar.onComplete();
                return;
        }
    }

    @Override // He.h
    public final void onError(Throwable th) {
        Je.b bVar;
        switch (this.f11068a) {
            case 0:
                Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
                Object obj = get();
                Me.a aVar = Me.a.f7633a;
                if (obj == aVar || (bVar = (Je.b) getAndSet(aVar)) == aVar) {
                    S3.f.A(th);
                    return;
                }
                try {
                    ((He.h) this.f11069b).onError(nullPointerException);
                    if (bVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            case 1:
                A a5 = (A) this.f11069b;
                Je.a aVar2 = a5.f10617d;
                aVar2.c(this);
                Ze.b bVar2 = a5.f10619f;
                bVar2.getClass();
                if (!Ze.d.a(bVar2, th)) {
                    S3.f.A(th);
                    return;
                }
                a5.f10622i.cancel();
                aVar2.dispose();
                a5.f10618e.decrementAndGet();
                a5.c();
                return;
            case 2:
                Te.j jVar = (Te.j) this.f11069b;
                jVar.f11875d.c(this);
                jVar.onError(th);
                return;
            default:
                Te.k kVar = (Te.k) this.f11069b;
                kVar.f11881d.c(this);
                kVar.onError(th);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    @Override // He.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f11069b
            Re.A r0 = (Re.A) r0
            Je.a r1 = r0.f10617d
            r1.c(r6)
            int r1 = r0.get()
            if (r1 != 0) goto L81
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L81
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f10618e
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L20
            r1 = r2
        L20:
            java.util.concurrent.atomic.AtomicLong r2 = r0.f10616c
            long r2 = r2.get()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L6e
            He.f r2 = r0.f10614a
            r2.b(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r0.f10621h
            java.lang.Object r7 = r7.get()
            Ve.b r7 = (Ve.b) r7
            if (r1 == 0) goto L5a
            if (r7 == 0) goto L43
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5a
        L43:
            Ze.b r7 = r0.f10619f
            r7.getClass()
            java.lang.Throwable r7 = Ze.d.b(r7)
            if (r7 == 0) goto L54
            He.f r0 = r0.f10614a
            r0.onError(r7)
            return
        L54:
            He.f r7 = r0.f10614a
            r7.onComplete()
            return
        L5a:
            java.util.concurrent.atomic.AtomicLong r7 = r0.f10616c
            r1 = 1
            Fe.e.P(r7, r1)
            int r7 = r0.f10615b
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r3) goto L77
            ug.b r7 = r0.f10622i
            r7.request(r1)
            goto L77
        L6e:
            Ve.b r1 = r0.g()
            monitor-enter(r1)
            r1.offer(r7)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
        L77:
            int r7 = r0.decrementAndGet()
            if (r7 != 0) goto L96
            goto L95
        L7e:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            throw r7
        L81:
            Ve.b r1 = r0.g()
            monitor-enter(r1)
            r1.offer(r7)     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.atomic.AtomicInteger r7 = r0.f10618e
            r7.decrementAndGet()
            int r7 = r0.getAndIncrement()
            if (r7 == 0) goto L96
        L95:
            return
        L96:
            r0.f()
            return
        L9a:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Se.c.onSuccess(java.lang.Object):void");
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f11068a) {
            case 0:
                return c.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public c(He.h hVar) {
        this.f11068a = 0;
        this.f11069b = hVar;
    }
}
