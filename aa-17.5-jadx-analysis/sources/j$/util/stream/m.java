package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class m extends b {
    public final k j;
    public final boolean k;

    public m(m mVar, Spliterator spliterator) {
        super(mVar, spliterator);
        this.k = mVar.k;
        this.j = mVar.j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.a;
        u4 u4Var = (u4) this.j.d.get();
        aVar.s(this.b, u4Var);
        Object obj = u4Var.get();
        if (this.k) {
            if (obj != null) {
                if (!c()) {
                    i();
                    return obj;
                }
                AtomicReference atomicReference = this.h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new m(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return this.j.b;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            m mVar = (m) this.d;
            m mVar2 = null;
            while (true) {
                if (mVar == mVar2) {
                    break;
                }
                Object objK = mVar.k();
                if (objK == null || !this.j.c.test(objK)) {
                    mVar2 = mVar;
                    mVar = (m) this.e;
                } else {
                    f(objK);
                    if (c()) {
                        AtomicReference atomicReference = this.h;
                        while (!atomicReference.compareAndSet(null, objK) && atomicReference.get() == null) {
                        }
                    } else {
                        i();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }

    public m(k kVar, boolean z, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.k = z;
        this.j = kVar;
    }
}
