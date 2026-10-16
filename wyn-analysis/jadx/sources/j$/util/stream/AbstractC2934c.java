package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2934c extends AbstractC2944e {

    /* renamed from: h, reason: collision with root package name */
    protected final AtomicReference f38158h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f38159i;

    protected abstract Object j();

    protected AbstractC2934c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        super(abstractC2929b, spliterator);
        this.f38158h = new AtomicReference(null);
    }

    protected AbstractC2934c(AbstractC2934c abstractC2934c, Spliterator spliterator) {
        super(abstractC2934c, spliterator);
        this.f38158h = abstractC2934c.f38158h;
    }

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objJ;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f38173b;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f38174c;
        if (jG == 0) {
            jG = AbstractC2944e.g(jEstimateSize);
            this.f38174c = jG;
        }
        AtomicReference atomicReference = this.f38158h;
        boolean z2 = false;
        AbstractC2934c abstractC2934c = this;
        while (true) {
            objJ = atomicReference.get();
            if (objJ != null) {
                break;
            }
            boolean z10 = abstractC2934c.f38159i;
            if (!z10) {
                CountedCompleter<?> completer = abstractC2934c.getCompleter();
                while (true) {
                    AbstractC2934c abstractC2934c2 = (AbstractC2934c) ((AbstractC2944e) completer);
                    if (z10 || abstractC2934c2 == null) {
                        break;
                    }
                    z10 = abstractC2934c2.f38159i;
                    completer = abstractC2934c2.getCompleter();
                }
            }
            if (z10) {
                objJ = abstractC2934c.j();
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC2934c abstractC2934c3 = (AbstractC2934c) abstractC2934c.e(spliteratorTrySplit);
            abstractC2934c.f38175d = abstractC2934c3;
            AbstractC2934c abstractC2934c4 = (AbstractC2934c) abstractC2934c.e(spliterator);
            abstractC2934c.f38176e = abstractC2934c4;
            abstractC2934c.setPendingCount(1);
            if (z2) {
                spliterator = spliteratorTrySplit;
                abstractC2934c = abstractC2934c3;
                abstractC2934c3 = abstractC2934c4;
            } else {
                abstractC2934c = abstractC2934c4;
            }
            z2 = !z2;
            abstractC2934c3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objJ = abstractC2934c.a();
        abstractC2934c.f(objJ);
        abstractC2934c.tryComplete();
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f38158h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    @Override // j$.util.stream.AbstractC2944e
    public final Object c() {
        if (d()) {
            Object obj = this.f38158h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    protected void h() {
        this.f38159i = true;
    }

    protected final void i() {
        AbstractC2934c abstractC2934c = this;
        for (AbstractC2934c abstractC2934c2 = (AbstractC2934c) ((AbstractC2944e) getCompleter()); abstractC2934c2 != null; abstractC2934c2 = (AbstractC2934c) ((AbstractC2944e) abstractC2934c2.getCompleter())) {
            if (abstractC2934c2.f38175d == abstractC2934c) {
                AbstractC2934c abstractC2934c3 = (AbstractC2934c) abstractC2934c2.f38176e;
                if (!abstractC2934c3.f38159i) {
                    abstractC2934c3.h();
                }
            }
            abstractC2934c = abstractC2934c2;
        }
    }
}
