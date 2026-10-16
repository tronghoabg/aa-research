package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3039x0 extends AbstractC2934c {

    /* renamed from: j, reason: collision with root package name */
    private final C3034w0 f38348j;

    C3039x0(C3034w0 c3034w0, AbstractC2929b abstractC2929b, Spliterator spliterator) {
        super(abstractC2929b, spliterator);
        this.f38348j = c3034w0;
    }

    C3039x0(C3039x0 c3039x0, Spliterator spliterator) {
        super(c3039x0, spliterator);
        this.f38348j = c3039x0.f38348j;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        return new C3039x0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final Object a() {
        AbstractC2929b abstractC2929b = this.f38172a;
        AbstractC3024u0 abstractC3024u0 = (AbstractC3024u0) this.f38348j.f38334b.get();
        abstractC2929b.S(this.f38173b, abstractC3024u0);
        boolean z2 = abstractC3024u0.f38318b;
        if (z2 == this.f38348j.f38333a.f38328b) {
            Boolean boolValueOf = Boolean.valueOf(z2);
            AtomicReference atomicReference = this.f38158h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC2934c
    protected final Object j() {
        return Boolean.valueOf(!this.f38348j.f38333a.f38328b);
    }
}
