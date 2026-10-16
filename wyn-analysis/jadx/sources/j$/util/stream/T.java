package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class T extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private Spliterator f38095a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3011r2 f38096b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2929b f38097c;

    /* renamed from: d, reason: collision with root package name */
    private long f38098d;

    T(AbstractC2929b abstractC2929b, Spliterator spliterator, InterfaceC3011r2 interfaceC3011r2) {
        super(null);
        this.f38096b = interfaceC3011r2;
        this.f38097c = abstractC2929b;
        this.f38095a = spliterator;
        this.f38098d = 0L;
    }

    T(T t10, Spliterator spliterator) {
        super(t10);
        this.f38095a = spliterator;
        this.f38096b = t10.f38096b;
        this.f38098d = t10.f38098d;
        this.f38097c = t10.f38097c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f38095a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f38098d;
        if (jG == 0) {
            jG = AbstractC2944e.g(jEstimateSize);
            this.f38098d = jG;
        }
        boolean zT = EnumC2958g3.SHORT_CIRCUIT.t(this.f38097c.H());
        InterfaceC3011r2 interfaceC3011r2 = this.f38096b;
        boolean z2 = false;
        T t10 = this;
        while (true) {
            if (zT && interfaceC3011r2.n()) {
                break;
            }
            if (jEstimateSize <= jG || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            T t11 = new T(t10, spliteratorTrySplit);
            t10.addToPendingCount(1);
            if (z2) {
                spliterator = spliteratorTrySplit;
            } else {
                T t12 = t10;
                t10 = t11;
                t11 = t12;
            }
            z2 = !z2;
            t10.fork();
            t10 = t11;
            jEstimateSize = spliterator.estimateSize();
        }
        t10.f38097c.x(spliterator, interfaceC3011r2);
        t10.f38095a = null;
        t10.propagateCompletion();
    }
}
