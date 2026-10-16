package c2;

import P2.i;
import P2.l;
import Q1.k;
import com.applovin.shadow.okio.Segment;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547b implements P2.e, T1.b {

    /* renamed from: a, reason: collision with root package name */
    public final H4.a f19543a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19544b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f19545c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f19546d;

    /* renamed from: e, reason: collision with root package name */
    public final T1.d[] f19547e;

    /* renamed from: f, reason: collision with root package name */
    public final T1.e[] f19548f;

    /* renamed from: g, reason: collision with root package name */
    public int f19549g;

    /* renamed from: h, reason: collision with root package name */
    public int f19550h;

    /* renamed from: i, reason: collision with root package name */
    public T1.d f19551i;

    /* renamed from: j, reason: collision with root package name */
    public H5.f f19552j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19553l;

    /* renamed from: m, reason: collision with root package name */
    public long f19554m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f19555n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f19556o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1547b(l lVar) {
        this(new i[2], new P2.c[2]);
        this.f19555n = 1;
        int i5 = this.f19549g;
        T1.d[] dVarArr = this.f19547e;
        k.g(i5 == dVarArr.length);
        for (T1.d dVar : dVarArr) {
            dVar.r(Segment.SHARE_MINIMUM);
        }
        this.f19556o = lVar;
    }

    @Override // T1.b
    public final Object c() {
        T1.d dVar;
        synchronized (this.f19544b) {
            try {
                H5.f fVar = this.f19552j;
                if (fVar != null) {
                    throw fVar;
                }
                k.g(this.f19551i == null);
                int i5 = this.f19549g;
                if (i5 == 0) {
                    dVar = null;
                } else {
                    T1.d[] dVarArr = this.f19547e;
                    int i10 = i5 - 1;
                    this.f19549g = i10;
                    dVar = dVarArr[i10];
                }
                this.f19551i = dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // T1.b
    public final void e(long j8) {
        synchronized (this.f19544b) {
            try {
                k.g(this.f19549g == this.f19547e.length || this.k);
                this.f19554m = j8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H5.f f(Throwable th) {
        switch (this.f19555n) {
            case 0:
                return new d("Unexpected decode error", th);
            default:
                return new P2.f("Unexpected decode error", th);
        }
    }

    @Override // T1.b
    public final void flush() {
        synchronized (this.f19544b) {
            try {
                this.k = true;
                T1.d dVar = this.f19551i;
                if (dVar != null) {
                    dVar.o();
                    int i5 = this.f19549g;
                    this.f19549g = i5 + 1;
                    this.f19547e[i5] = dVar;
                    this.f19551i = null;
                }
                while (!this.f19545c.isEmpty()) {
                    T1.d dVar2 = (T1.d) this.f19545c.removeFirst();
                    dVar2.o();
                    int i10 = this.f19549g;
                    this.f19549g = i10 + 1;
                    this.f19547e[i10] = dVar2;
                }
                while (!this.f19546d.isEmpty()) {
                    ((T1.e) this.f19546d.removeFirst()).q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final H5.f g(T1.d dVar, T1.e eVar, boolean z2) {
        switch (this.f19555n) {
            case 0:
                C1546a c1546a = (C1546a) eVar;
                try {
                    ByteBuffer byteBuffer = dVar.f11358e;
                    byteBuffer.getClass();
                    k.g(byteBuffer.hasArray());
                    k.c(byteBuffer.arrayOffset() == 0);
                    V1.c cVar = (V1.c) this.f19556o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    cVar.getClass();
                    c1546a.f19541e = V1.c.b(iRemaining, bArrArray);
                    c1546a.f11363c = dVar.f11360g;
                    return null;
                } catch (d e7) {
                    return e7;
                }
            default:
                i iVar = (i) dVar;
                P2.c cVar2 = (P2.c) eVar;
                try {
                    ByteBuffer byteBuffer2 = iVar.f11358e;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    l lVar = (l) this.f19556o;
                    if (z2) {
                        lVar.reset();
                    }
                    P2.d dVarH = lVar.H(0, iLimit, bArrArray2);
                    long j8 = iVar.f11360g;
                    long j10 = iVar.f9078j;
                    cVar2.f11363c = j8;
                    cVar2.f9062e = dVarH;
                    if (j10 != Long.MAX_VALUE) {
                        j8 = j10;
                    }
                    cVar2.f9063f = j8;
                    cVar2.f11364d = false;
                    return null;
                } catch (P2.f e10) {
                    return e10;
                }
        }
    }

    public final boolean h() {
        H5.f fVarF;
        synchronized (this.f19544b) {
            while (!this.f19553l) {
                try {
                    if (!this.f19545c.isEmpty() && this.f19550h > 0) {
                        break;
                    }
                    this.f19544b.wait();
                } finally {
                }
            }
            if (this.f19553l) {
                return false;
            }
            T1.d dVar = (T1.d) this.f19545c.removeFirst();
            T1.e[] eVarArr = this.f19548f;
            int i5 = this.f19550h - 1;
            this.f19550h = i5;
            T1.e eVar = eVarArr[i5];
            boolean z2 = this.k;
            this.k = false;
            if (dVar.h(4)) {
                eVar.b(4);
            } else {
                eVar.f11363c = dVar.f11360g;
                if (dVar.h(134217728)) {
                    eVar.b(134217728);
                }
                if (!j(dVar.f11360g)) {
                    eVar.f11364d = true;
                }
                try {
                    fVarF = g(dVar, eVar, z2);
                } catch (OutOfMemoryError e7) {
                    fVarF = f(e7);
                } catch (RuntimeException e10) {
                    fVarF = f(e10);
                }
                if (fVarF != null) {
                    synchronized (this.f19544b) {
                        this.f19552j = fVarF;
                    }
                    return false;
                }
            }
            synchronized (this.f19544b) {
                try {
                    if (this.k || eVar.f11364d) {
                        eVar.q();
                    } else {
                        this.f19546d.addLast(eVar);
                    }
                    dVar.o();
                    int i10 = this.f19549g;
                    this.f19549g = i10 + 1;
                    this.f19547e[i10] = dVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // T1.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final T1.e b() {
        synchronized (this.f19544b) {
            try {
                H5.f fVar = this.f19552j;
                if (fVar != null) {
                    throw fVar;
                }
                if (this.f19546d.isEmpty()) {
                    return null;
                }
                return (T1.e) this.f19546d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(long j8) {
        boolean z2;
        synchronized (this.f19544b) {
            long j10 = this.f19554m;
            z2 = j10 == -9223372036854775807L || j8 >= j10;
        }
        return z2;
    }

    @Override // T1.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void d(T1.d dVar) {
        synchronized (this.f19544b) {
            try {
                H5.f fVar = this.f19552j;
                if (fVar != null) {
                    throw fVar;
                }
                k.c(dVar == this.f19551i);
                this.f19545c.addLast(dVar);
                if (!this.f19545c.isEmpty() && this.f19550h > 0) {
                    this.f19544b.notify();
                }
                this.f19551i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(T1.e eVar) {
        synchronized (this.f19544b) {
            eVar.o();
            int i5 = this.f19550h;
            this.f19550h = i5 + 1;
            this.f19548f[i5] = eVar;
            if (!this.f19545c.isEmpty() && this.f19550h > 0) {
                this.f19544b.notify();
            }
        }
    }

    @Override // T1.b
    public final void release() throws InterruptedException {
        synchronized (this.f19544b) {
            this.f19553l = true;
            this.f19544b.notify();
        }
        try {
            this.f19543a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public C1547b(T1.d[] dVarArr, T1.e[] eVarArr) {
        T1.e c1546a;
        T1.d dVar;
        this.f19544b = new Object();
        this.f19554m = -9223372036854775807L;
        this.f19545c = new ArrayDeque();
        this.f19546d = new ArrayDeque();
        this.f19547e = dVarArr;
        this.f19549g = dVarArr.length;
        for (int i5 = 0; i5 < this.f19549g; i5++) {
            T1.d[] dVarArr2 = this.f19547e;
            switch (this.f19555n) {
                case 0:
                    dVar = new T1.d(1);
                    break;
                default:
                    dVar = new i(1);
                    break;
            }
            dVarArr2[i5] = dVar;
        }
        this.f19548f = eVarArr;
        this.f19550h = eVarArr.length;
        for (int i10 = 0; i10 < this.f19550h; i10++) {
            T1.e[] eVarArr2 = this.f19548f;
            switch (this.f19555n) {
                case 0:
                    c1546a = new C1546a(this);
                    break;
                default:
                    c1546a = new P2.c(this);
                    break;
            }
            eVarArr2[i10] = c1546a;
        }
        H4.a aVar = new H4.a(this, 2);
        this.f19543a = aVar;
        aVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1547b(V1.c cVar) {
        this(new T1.d[1], new C1546a[1]);
        this.f19555n = 0;
        this.f19556o = cVar;
    }

    @Override // P2.e
    public void a(long j8) {
    }
}
