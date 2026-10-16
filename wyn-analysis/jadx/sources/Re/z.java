package Re;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;
import za.C4658a;

/* loaded from: classes5.dex */
public final class z extends AtomicInteger implements He.f, ug.b {

    /* renamed from: q, reason: collision with root package name */
    public static final y[] f10778q = new y[0];

    /* renamed from: r, reason: collision with root package name */
    public static final y[] f10779r = new y[0];

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10780a;

    /* renamed from: b, reason: collision with root package name */
    public final C4658a f10781b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10782c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10783d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Oe.g f10784e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10785f;

    /* renamed from: g, reason: collision with root package name */
    public final Ze.b f10786g = new Ze.b();

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10787h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f10788i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f10789j;
    public ug.b k;

    /* renamed from: l, reason: collision with root package name */
    public long f10790l;

    /* renamed from: m, reason: collision with root package name */
    public long f10791m;

    /* renamed from: n, reason: collision with root package name */
    public int f10792n;

    /* renamed from: o, reason: collision with root package name */
    public int f10793o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10794p;

    public z(He.f fVar, C4658a c4658a, int i5, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        this.f10788i = atomicReference;
        this.f10789j = new AtomicLong();
        this.f10780a = fVar;
        this.f10781b = c4658a;
        this.f10782c = i5;
        this.f10783d = i10;
        this.f10794p = Math.max(1, i5 >> 1);
        atomicReference.lazySet(f10778q);
    }

    public final boolean a() {
        if (this.f10787h) {
            Oe.g gVar = this.f10784e;
            if (gVar != null) {
                gVar.clear();
                return true;
            }
        } else {
            if (this.f10786g.get() == null) {
                return false;
            }
            Oe.g gVar2 = this.f10784e;
            if (gVar2 != null) {
                gVar2.clear();
            }
            Ze.b bVar = this.f10786g;
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            if (thB != Ze.d.f17085a) {
                this.f10780a.onError(thB);
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // He.f
    public final void b(Object obj) {
        if (this.f10785f) {
            return;
        }
        try {
            this.f10781b.getClass();
            Ne.b.a(obj, "The mapper returned a null Publisher");
            ug.a aVar = (ug.a) obj;
            if (!(aVar instanceof Callable)) {
                long j8 = this.f10790l;
                this.f10790l = 1 + j8;
                y yVar = new y(this, j8);
                while (true) {
                    AtomicReference atomicReference = this.f10788i;
                    y[] yVarArr = (y[]) atomicReference.get();
                    if (yVarArr == f10779r) {
                        Ye.f.a(yVar);
                        return;
                    }
                    int length = yVarArr.length;
                    y[] yVarArr2 = new y[length + 1];
                    System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
                    yVarArr2[length] = yVar;
                    while (!atomicReference.compareAndSet(yVarArr, yVarArr2)) {
                        if (atomicReference.get() != yVarArr) {
                            break;
                        }
                    }
                    aVar.a(yVar);
                    return;
                }
            }
            try {
                Object objCall = ((Callable) aVar).call();
                if (objCall == null) {
                    if (this.f10782c == Integer.MAX_VALUE || this.f10787h) {
                        return;
                    }
                    int i5 = this.f10793o + 1;
                    this.f10793o = i5;
                    int i10 = this.f10794p;
                    if (i5 == i10) {
                        this.f10793o = 0;
                        this.k.request(i10);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j10 = this.f10789j.get();
                    Oe.g gVarG = this.f10784e;
                    if (j10 == 0 || !(gVarG == null || gVarG.isEmpty())) {
                        if (gVarG == null) {
                            gVarG = g();
                        }
                        if (!gVarG.offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    } else {
                        this.f10780a.b(objCall);
                        if (j10 != Long.MAX_VALUE) {
                            this.f10789j.decrementAndGet();
                        }
                        if (this.f10782c != Integer.MAX_VALUE && !this.f10787h) {
                            int i11 = this.f10793o + 1;
                            this.f10793o = i11;
                            int i12 = this.f10794p;
                            if (i11 == i12) {
                                this.f10793o = 0;
                                this.k.request(i12);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!g().offer(objCall)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                f();
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                Ze.b bVar = this.f10786g;
                bVar.getClass();
                Ze.d.a(bVar, th);
                c();
            }
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            this.k.cancel();
            onError(th2);
        }
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    @Override // ug.b
    public final void cancel() {
        Oe.g gVar;
        y[] yVarArr;
        if (this.f10787h) {
            return;
        }
        this.f10787h = true;
        this.k.cancel();
        AtomicReference atomicReference = this.f10788i;
        y[] yVarArr2 = (y[]) atomicReference.get();
        y[] yVarArr3 = f10779r;
        if (yVarArr2 != yVarArr3 && (yVarArr = (y[]) atomicReference.getAndSet(yVarArr3)) != yVarArr3) {
            for (y yVar : yVarArr) {
                yVar.getClass();
                Ye.f.a(yVar);
            }
            Ze.b bVar = this.f10786g;
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            if (thB != null && thB != Ze.d.f17085a) {
                S3.f.A(thB);
            }
        }
        if (getAndIncrement() != 0 || (gVar = this.f10784e) == null) {
            return;
        }
        gVar.clear();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.k, bVar)) {
            this.k = bVar;
            this.f10780a.e(this);
            if (this.f10787h) {
                return;
            }
            int i5 = this.f10782c;
            if (i5 == Integer.MAX_VALUE) {
                bVar.request(Long.MAX_VALUE);
            } else {
                bVar.request(i5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.z.f():void");
    }

    public final Oe.g g() {
        Oe.g bVar = this.f10784e;
        if (bVar == null) {
            bVar = this.f10782c == Integer.MAX_VALUE ? new Ve.b(this.f10783d) : new Ve.a(this.f10782c);
            this.f10784e = bVar;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(y yVar) {
        y[] yVarArr;
        while (true) {
            AtomicReference atomicReference = this.f10788i;
            y[] yVarArr2 = (y[]) atomicReference.get();
            int length = yVarArr2.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                } else if (yVarArr2[i5] == yVar) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 < 0) {
                return;
            }
            if (length == 1) {
                yVarArr = f10778q;
            } else {
                y[] yVarArr3 = new y[length - 1];
                System.arraycopy(yVarArr2, 0, yVarArr3, 0, i5);
                System.arraycopy(yVarArr2, i5 + 1, yVarArr3, i5, (length - i5) - 1);
                yVarArr = yVarArr3;
            }
            while (!atomicReference.compareAndSet(yVarArr2, yVarArr)) {
                if (atomicReference.get() != yVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // He.f
    public final void onComplete() {
        if (this.f10785f) {
            return;
        }
        this.f10785f = true;
        c();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        if (this.f10785f) {
            S3.f.A(th);
            return;
        }
        Ze.b bVar = this.f10786g;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
        } else {
            this.f10785f = true;
            c();
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8)) {
            Fe.e.f(this.f10789j, j8);
            c();
        }
    }
}
