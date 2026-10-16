package Re;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class P extends AtomicInteger implements He.f, Je.b {

    /* renamed from: i, reason: collision with root package name */
    public static final O[] f10685i = new O[0];

    /* renamed from: j, reason: collision with root package name */
    public static final O[] f10686j = new O[0];

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f10687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10688b;

    /* renamed from: f, reason: collision with root package name */
    public volatile Serializable f10692f;

    /* renamed from: g, reason: collision with root package name */
    public int f10693g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Oe.h f10694h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f10691e = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10689c = new AtomicReference(f10685i);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10690d = new AtomicBoolean();

    public P(AtomicReference atomicReference, int i5) {
        this.f10687a = atomicReference;
        this.f10688b = i5;
    }

    public final boolean a(Object obj, boolean z2) {
        int i5 = 0;
        if (obj != null) {
            Ze.f fVar = Ze.f.f17087a;
            O[] oArr = f10686j;
            AtomicReference atomicReference = this.f10689c;
            AtomicReference atomicReference2 = this.f10687a;
            if (obj != fVar) {
                Ze.e eVar = (Ze.e) obj;
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                O[] oArr2 = (O[]) atomicReference.getAndSet(oArr);
                int length = oArr2.length;
                Throwable th = eVar.f17086a;
                if (length != 0) {
                    int length2 = oArr2.length;
                    while (i5 < length2) {
                        oArr2[i5].f10682a.onError(th);
                        i5++;
                    }
                } else {
                    S3.f.A(th);
                }
                return true;
            }
            if (z2) {
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                O[] oArr3 = (O[]) atomicReference.getAndSet(oArr);
                int length3 = oArr3.length;
                while (i5 < length3) {
                    oArr3[i5].f10682a.onComplete();
                    i5++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10693g != 0 || this.f10694h.offer(obj)) {
            c();
        } else {
            onError(new Ke.c("Prefetch queue is full?!"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0124, code lost:
    
        r4 = r0;
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.P.c():void");
    }

    @Override // Je.b
    public final void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f10689c;
        Object obj = atomicReference2.get();
        Object obj2 = f10686j;
        if (obj == obj2 || ((O[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.f10687a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        Ye.f.a(this.f10691e);
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.b(this.f10691e, bVar)) {
            if (bVar instanceof Oe.e) {
                Oe.e eVar = (Oe.e) bVar;
                int iC = eVar.c(3);
                if (iC == 1) {
                    this.f10693g = iC;
                    this.f10694h = eVar;
                    this.f10692f = Ze.f.f17087a;
                    c();
                    return;
                }
                if (iC == 2) {
                    this.f10693g = iC;
                    this.f10694h = eVar;
                    bVar.request(this.f10688b);
                    return;
                }
            }
            this.f10694h = new Ve.a(this.f10688b);
            bVar.request(this.f10688b);
        }
    }

    public final boolean f() {
        return this.f10689c.get() == f10686j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(O o7) {
        O[] oArr;
        while (true) {
            AtomicReference atomicReference = this.f10689c;
            O[] oArr2 = (O[]) atomicReference.get();
            int length = oArr2.length;
            if (length == 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i5 = -1;
                    break;
                } else if (oArr2[i5].equals(o7)) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 < 0) {
                return;
            }
            if (length == 1) {
                oArr = f10685i;
            } else {
                O[] oArr3 = new O[length - 1];
                System.arraycopy(oArr2, 0, oArr3, 0, i5);
                System.arraycopy(oArr2, i5 + 1, oArr3, i5, (length - i5) - 1);
                oArr = oArr3;
            }
            while (!atomicReference.compareAndSet(oArr2, oArr)) {
                if (atomicReference.get() != oArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // He.f
    public final void onComplete() {
        if (this.f10692f == null) {
            this.f10692f = Ze.f.f17087a;
            c();
        }
    }

    @Override // He.f
    public final void onError(Throwable th) {
        if (this.f10692f != null) {
            S3.f.A(th);
        } else {
            this.f10692f = new Ze.e(th);
            c();
        }
    }
}
