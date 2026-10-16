package Re;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class A extends AtomicInteger implements He.f, ug.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10615b;

    /* renamed from: g, reason: collision with root package name */
    public final Le.c f10620g;

    /* renamed from: i, reason: collision with root package name */
    public ug.b f10622i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f10623j;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f10616c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    public final Je.a f10617d = new Je.a(0);

    /* renamed from: f, reason: collision with root package name */
    public final Ze.b f10619f = new Ze.b();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f10618e = new AtomicInteger(1);

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f10621h = new AtomicReference();

    public A(He.f fVar, Le.c cVar, int i5) {
        this.f10614a = fVar;
        this.f10620g = cVar;
        this.f10615b = i5;
    }

    public final void a() {
        Ve.b bVar = (Ve.b) this.f10621h.get();
        if (bVar != null) {
            bVar.clear();
        }
    }

    @Override // He.f
    public final void b(Object obj) {
        try {
            Object objApply = this.f10620g.apply(obj);
            Ne.b.a(objApply, "The mapper returned a null MaybeSource");
            He.g gVar = (He.g) objApply;
            this.f10618e.getAndIncrement();
            Se.c cVar = new Se.c(this, 1);
            if (this.f10623j || !this.f10617d.a(cVar)) {
                return;
            }
            gVar.b(cVar);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f10622i.cancel();
            onError(th);
        }
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    @Override // ug.b
    public final void cancel() {
        this.f10623j = true;
        this.f10622i.cancel();
        this.f10617d.dispose();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10622i, bVar)) {
            this.f10622i = bVar;
            this.f10614a.e(this);
            int i5 = this.f10615b;
            if (i5 == Integer.MAX_VALUE) {
                bVar.request(Long.MAX_VALUE);
            } else {
                bVar.request(i5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r10 != r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r17.f10623j == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008b, code lost:
    
        if (((java.lang.Throwable) r17.f10619f.get()) == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r2 = r17.f10619f;
        r2.getClass();
        r2 = Ze.d.b(r2);
        a();
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        if (r2.get() != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        r7 = (Ve.b) r3.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
    
        if (r7.isEmpty() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b5, code lost:
    
        if (r6 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:
    
        r2 = r17.f10619f;
        r2.getClass();
        r2 = Ze.d.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        r1.onError(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        r1.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ce, code lost:
    
        if (r10 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        Fe.e.P(r17.f10616c, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
    
        if (r17.f10615b == Integer.MAX_VALUE) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00dc, code lost:
    
        r17.f10622i.request(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        r5 = addAndGet(-r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.A.f():void");
    }

    public final Ve.b g() {
        while (true) {
            AtomicReference atomicReference = this.f10621h;
            Ve.b bVar = (Ve.b) atomicReference.get();
            if (bVar != null) {
                return bVar;
            }
            Ve.b bVar2 = new Ve.b(He.c.f5007a);
            while (!atomicReference.compareAndSet(null, bVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            return bVar2;
        }
    }

    @Override // He.f
    public final void onComplete() {
        this.f10618e.decrementAndGet();
        c();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        this.f10618e.decrementAndGet();
        Ze.b bVar = this.f10619f;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
        } else {
            this.f10617d.dispose();
            c();
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8)) {
            Fe.e.f(this.f10616c, j8);
            c();
        }
    }
}
