package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes2.dex */
class R0 extends AbstractC2944e {

    /* renamed from: h, reason: collision with root package name */
    protected final AbstractC2929b f38069h;

    /* renamed from: i, reason: collision with root package name */
    protected final LongFunction f38070i;

    /* renamed from: j, reason: collision with root package name */
    protected final BinaryOperator f38071j;

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2944e abstractC2944e = this.f38175d;
        if (abstractC2944e != null) {
            f((K0) this.f38071j.apply((K0) ((R0) abstractC2944e).c(), (K0) ((R0) this.f38176e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    R0(AbstractC2929b abstractC2929b, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC2929b, spliterator);
        this.f38069h = abstractC2929b;
        this.f38070i = longFunction;
        this.f38071j = binaryOperator;
    }

    R0(R0 r02, Spliterator spliterator) {
        super(r02, spliterator);
        this.f38069h = r02.f38069h;
        this.f38070i = r02.f38070i;
        this.f38071j = r02.f38071j;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected AbstractC2944e e(Spliterator spliterator) {
        return new R0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2944e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final K0 a() {
        C0 c02 = (C0) this.f38070i.apply(this.f38069h.D(this.f38173b));
        this.f38069h.S(this.f38173b, c02);
        return c02.a();
    }
}
