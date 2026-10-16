package Te;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class h extends AtomicInteger implements Je.b, He.j {

    /* renamed from: o, reason: collision with root package name */
    public static final g[] f11855o = new g[0];

    /* renamed from: p, reason: collision with root package name */
    public static final g[] f11856p = new g[0];

    /* renamed from: a, reason: collision with root package name */
    public final He.j f11857a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.d f11858b;

    /* renamed from: d, reason: collision with root package name */
    public final int f11860d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Oe.g f11861e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11862f;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f11864h;

    /* renamed from: j, reason: collision with root package name */
    public Je.b f11866j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f11867l;

    /* renamed from: m, reason: collision with root package name */
    public int f11868m;

    /* renamed from: n, reason: collision with root package name */
    public int f11869n;

    /* renamed from: g, reason: collision with root package name */
    public final Ze.b f11863g = new Ze.b();

    /* renamed from: c, reason: collision with root package name */
    public final int f11859c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f11865i = new AtomicReference(f11855o);

    public h(He.j jVar, F5.d dVar, int i5) {
        this.f11857a = jVar;
        this.f11858b = dVar;
        this.f11860d = i5;
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        if (Me.a.f(this.f11866j, bVar)) {
            this.f11866j = bVar;
            this.f11857a.a(this);
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        if (this.f11862f) {
            return;
        }
        try {
            He.i iVar = (He.i) this.f11858b.apply(obj);
            if (this.f11859c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i5 = this.f11869n;
                        if (i5 == this.f11859c) {
                            throw null;
                        }
                        this.f11869n = i5 + 1;
                    } finally {
                    }
                }
            }
            h(iVar);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f11866j.dispose();
            onError(th);
        }
    }

    public final boolean c() {
        if (!this.f11864h) {
            if (((Throwable) this.f11863g.get()) == null) {
                return false;
            }
            d();
            Ze.b bVar = this.f11863g;
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            if (thB != Ze.d.f17085a) {
                this.f11857a.onError(thB);
            }
        }
        return true;
    }

    public final boolean d() {
        g[] gVarArr;
        this.f11866j.dispose();
        AtomicReference atomicReference = this.f11865i;
        g[] gVarArr2 = (g[]) atomicReference.get();
        g[] gVarArr3 = f11856p;
        if (gVarArr2 == gVarArr3 || (gVarArr = (g[]) atomicReference.getAndSet(gVarArr3)) == gVarArr3) {
            return false;
        }
        for (g gVar : gVarArr) {
            gVar.getClass();
            Me.a.a(gVar);
        }
        return true;
    }

    @Override // Je.b
    public final void dispose() {
        if (this.f11864h) {
            return;
        }
        this.f11864h = true;
        if (d()) {
            Ze.b bVar = this.f11863g;
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            if (thB == null || thB == Ze.d.f17085a) {
                return;
            }
            S3.f.A(thB);
        }
    }

    public final void e() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    public final void f() {
        He.j jVar = this.f11857a;
        int iAddAndGet = 1;
        while (!c()) {
            Oe.g gVar = this.f11861e;
            if (gVar != null) {
                while (!c()) {
                    Object objPoll = gVar.poll();
                    if (objPoll != null) {
                        jVar.b(objPoll);
                    } else if (objPoll == null) {
                    }
                }
                return;
            }
            boolean z2 = this.f11862f;
            Oe.g gVar2 = this.f11861e;
            g[] gVarArr = (g[]) this.f11865i.get();
            int length = gVarArr.length;
            boolean z10 = false;
            if (this.f11859c != Integer.MAX_VALUE) {
                synchronized (this) {
                    throw null;
                }
            }
            if (z2 && ((gVar2 == null || gVar2.isEmpty()) && length == 0)) {
                Ze.b bVar = this.f11863g;
                bVar.getClass();
                Throwable thB = Ze.d.b(bVar);
                if (thB != Ze.d.f17085a) {
                    if (thB == null) {
                        jVar.onComplete();
                        return;
                    } else {
                        jVar.onError(thB);
                        return;
                    }
                }
                return;
            }
            if (length != 0) {
                long j8 = this.f11867l;
                int i5 = this.f11868m;
                if (length <= i5 || gVarArr[i5].f11850a != j8) {
                    if (length <= i5) {
                        i5 = 0;
                    }
                    for (int i10 = 0; i10 < length && gVarArr[i5].f11850a != j8; i10++) {
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                    }
                    this.f11868m = i5;
                    this.f11867l = gVarArr[i5].f11850a;
                }
                int i11 = 0;
                boolean z11 = false;
                while (i11 < length) {
                    if (c()) {
                        return;
                    }
                    g gVar3 = gVarArr[i5];
                    while (!c()) {
                        Oe.h hVar = gVar3.f11853d;
                        if (hVar != null) {
                            do {
                                try {
                                    Object objPoll2 = hVar.poll();
                                    if (objPoll2 != null) {
                                        jVar.b(objPoll2);
                                    } else if (objPoll2 == null) {
                                    }
                                } catch (Throwable th) {
                                    AbstractC3772b.U(th);
                                    Me.a.a(gVar3);
                                    Ze.b bVar2 = this.f11863g;
                                    bVar2.getClass();
                                    Ze.d.a(bVar2, th);
                                    if (c()) {
                                        return;
                                    }
                                    g(gVar3);
                                    i11++;
                                    z11 = true;
                                }
                            } while (!c());
                            return;
                        }
                        boolean z12 = gVar3.f11852c;
                        Oe.h hVar2 = gVar3.f11853d;
                        if (z12 && (hVar2 == null || hVar2.isEmpty())) {
                            g(gVar3);
                            if (c()) {
                                return;
                            } else {
                                z11 = true;
                            }
                        }
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                        i11++;
                    }
                    return;
                }
                this.f11868m = i5;
                this.f11867l = gVarArr[i5].f11850a;
                z10 = z11;
            }
            if (!z10) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (this.f11859c != Integer.MAX_VALUE) {
                synchronized (this) {
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(g gVar) {
        g[] gVarArr;
        while (true) {
            AtomicReference atomicReference = this.f11865i;
            g[] gVarArr2 = (g[]) atomicReference.get();
            int length = gVarArr2.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                } else if (gVarArr2[i5] == gVar) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 < 0) {
                return;
            }
            if (length == 1) {
                gVarArr = f11855o;
            } else {
                g[] gVarArr3 = new g[length - 1];
                System.arraycopy(gVarArr2, 0, gVarArr3, 0, i5);
                System.arraycopy(gVarArr2, i5 + 1, gVarArr3, i5, (length - i5) - 1);
                gVarArr = gVarArr3;
            }
            while (!atomicReference.compareAndSet(gVarArr2, gVarArr)) {
                if (atomicReference.get() != gVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(He.i iVar) {
        if (!(iVar instanceof Callable)) {
            long j8 = this.k;
            this.k = 1 + j8;
            g gVar = new g(this, j8);
            while (true) {
                AtomicReference atomicReference = this.f11865i;
                g[] gVarArr = (g[]) atomicReference.get();
                if (gVarArr == f11856p) {
                    Me.a.a(gVar);
                    return;
                }
                int length = gVarArr.length;
                g[] gVarArr2 = new g[length + 1];
                System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
                gVarArr2[length] = gVar;
                while (!atomicReference.compareAndSet(gVarArr, gVarArr2)) {
                    if (atomicReference.get() != gVarArr) {
                        break;
                    }
                }
                iVar.c(gVar);
                return;
            }
        }
        try {
            Object objCall = ((Callable) iVar).call();
            if (objCall != null) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f11857a.b(objCall);
                    if (decrementAndGet() != 0) {
                        f();
                    }
                } else {
                    Oe.g bVar = this.f11861e;
                    if (bVar == null) {
                        bVar = this.f11859c == Integer.MAX_VALUE ? new Ve.b(this.f11860d) : new Ve.a(this.f11859c);
                        this.f11861e = bVar;
                    }
                    if (bVar.offer(objCall)) {
                        if (getAndIncrement() != 0) {
                            return;
                        }
                        f();
                    } else {
                        onError(new IllegalStateException("Scalar queue full?!"));
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            Ze.b bVar2 = this.f11863g;
            bVar2.getClass();
            Ze.d.a(bVar2, th);
            e();
        }
        if (this.f11859c == Integer.MAX_VALUE) {
            return;
        }
        synchronized (this) {
            throw null;
        }
    }

    @Override // He.j
    public final void onComplete() {
        if (this.f11862f) {
            return;
        }
        this.f11862f = true;
        e();
    }

    @Override // He.j
    public final void onError(Throwable th) {
        if (this.f11862f) {
            S3.f.A(th);
            return;
        }
        Ze.b bVar = this.f11863g;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
        } else {
            this.f11862f = true;
            e();
        }
    }
}
