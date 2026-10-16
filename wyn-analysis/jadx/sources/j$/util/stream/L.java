package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class L extends AbstractC2934c {

    /* renamed from: j, reason: collision with root package name */
    private final F f38028j;
    private final boolean k;

    L(F f10, boolean z2, AbstractC2929b abstractC2929b, Spliterator spliterator) {
        super(abstractC2929b, spliterator);
        this.k = z2;
        this.f38028j = f10;
    }

    L(L l10, Spliterator spliterator) {
        super(l10, spliterator);
        this.k = l10.k;
        this.f38028j = l10.f38028j;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        return new L(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2934c
    protected final Object j() {
        return this.f38028j.f37981b;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final Object a() {
        AbstractC2929b abstractC2929b = this.f38172a;
        O3 o32 = (O3) this.f38028j.f37983d.get();
        abstractC2929b.S(this.f38173b, o32);
        Object obj = o32.get();
        if (this.k) {
            if (obj != null) {
                AbstractC2944e abstractC2944e = this;
                while (abstractC2944e != null) {
                    AbstractC2944e abstractC2944e2 = (AbstractC2944e) abstractC2944e.getCompleter();
                    if (abstractC2944e2 != null && abstractC2944e2.f38175d != abstractC2944e) {
                        i();
                        return obj;
                    }
                    abstractC2944e = abstractC2944e2;
                }
                AtomicReference atomicReference = this.f38158h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f38158h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.k) {
            L l10 = (L) this.f38175d;
            L l11 = null;
            while (true) {
                if (l10 != l11) {
                    Object objC = l10.c();
                    if (objC != null && this.f38028j.f37982c.test(objC)) {
                        f(objC);
                        AbstractC2944e abstractC2944e = this;
                        while (true) {
                            if (abstractC2944e != null) {
                                AbstractC2944e abstractC2944e2 = (AbstractC2944e) abstractC2944e.getCompleter();
                                if (abstractC2944e2 != null && abstractC2944e2.f38175d != abstractC2944e) {
                                    i();
                                    break;
                                }
                                abstractC2944e = abstractC2944e2;
                            } else {
                                AtomicReference atomicReference = this.f38158h;
                                while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        l11 = l10;
                        l10 = (L) this.f38176e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
