package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class b extends d {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f50336h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f50337i;

    public b(a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.f50336h = new AtomicReference(null);
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objJ;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50362b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f50363c;
        if (jG == 0) {
            jG = d.g(jEstimateSize);
            this.f50363c = jG;
        }
        AtomicReference atomicReference = this.f50336h;
        boolean z = false;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z2 = this.f50337i;
            if (!z2) {
                CountedCompleter<?> completer = this.getCompleter();
                while (true) {
                    b bVar = (b) ((d) completer);
                    if (z2 || bVar == null) {
                        break;
                    }
                    z2 = bVar.f50337i;
                    completer = bVar.getCompleter();
                }
            }
            if (z2) {
                objJ = this.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            b bVar2 = (b) this.e(spliteratorTrySplit);
            this.f50364d = bVar2;
            b bVar3 = (b) this.e(spliterator);
            this.f50365e = bVar3;
            this.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                this = bVar2;
                bVar2 = bVar3;
            } else {
                this = bVar3;
            }
            z = !z;
            bVar2.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objJ = this.a();
        this.f(objJ);
        this.tryComplete();
    }

    @Override // j$.util.stream.d
    public final void f(Object obj) {
        if (!d()) {
            this.f50366f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f50336h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return k();
    }

    public void h() {
        this.f50337i = true;
    }

    public final void i() {
        d dVarB = b();
        while (true) {
            b bVar = (b) dVarB;
            b bVar2 = this;
            this = bVar;
            if (this == null) {
                return;
            }
            if (this.f50364d == bVar2) {
                b bVar3 = (b) this.f50365e;
                if (!bVar3.f50337i) {
                    bVar3.h();
                }
            }
            dVarB = this.b();
        }
    }

    public abstract Object j();

    public final Object k() {
        if (!d()) {
            return this.f50366f;
        }
        Object obj = this.f50336h.get();
        return obj == null ? j() : obj;
    }

    public b(b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.f50336h = bVar.f50336h;
    }
}
