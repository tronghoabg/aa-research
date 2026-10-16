package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2937c2 extends AbstractC2944e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3044y0 f38160h;

    @Override // j$.util.stream.AbstractC2944e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC2944e abstractC2944e = this.f38175d;
        if (abstractC2944e != null) {
            V1 v1 = (V1) ((C2937c2) abstractC2944e).c();
            v1.g((V1) ((C2937c2) this.f38176e).c());
            f(v1);
        }
        super.onCompletion(countedCompleter);
    }

    C2937c2(AbstractC3044y0 abstractC3044y0, AbstractC2929b abstractC2929b, Spliterator spliterator) {
        super(abstractC2929b, spliterator);
        this.f38160h = abstractC3044y0;
    }

    C2937c2(C2937c2 c2937c2, Spliterator spliterator) {
        super(c2937c2, spliterator);
        this.f38160h = c2937c2.f38160h;
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final AbstractC2944e e(Spliterator spliterator) {
        return new C2937c2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2944e
    protected final Object a() {
        AbstractC2929b abstractC2929b = this.f38172a;
        V1 v1T = this.f38160h.T();
        abstractC2929b.S(this.f38173b, v1T);
        return v1T;
    }
}
