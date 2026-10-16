package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class S extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2929b f38078a;

    /* renamed from: b, reason: collision with root package name */
    private Spliterator f38079b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38080c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f38081d;

    /* renamed from: e, reason: collision with root package name */
    private final Q f38082e;

    /* renamed from: f, reason: collision with root package name */
    private final S f38083f;

    /* renamed from: g, reason: collision with root package name */
    private K0 f38084g;

    protected S(AbstractC2929b abstractC2929b, Spliterator spliterator, Q q4) {
        super(null);
        this.f38078a = abstractC2929b;
        this.f38079b = spliterator;
        this.f38080c = AbstractC2944e.g(spliterator.estimateSize());
        this.f38081d = new ConcurrentHashMap(Math.max(16, AbstractC2944e.b() << 1));
        this.f38082e = q4;
        this.f38083f = null;
    }

    S(S s10, Spliterator spliterator, S s11) {
        super(s10);
        this.f38078a = s10.f38078a;
        this.f38079b = spliterator;
        this.f38080c = s10.f38080c;
        this.f38081d = s10.f38081d;
        this.f38082e = s10.f38082e;
        this.f38083f = s11;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f38079b;
        long j8 = this.f38080c;
        boolean z2 = false;
        S s10 = this;
        while (spliterator.estimateSize() > j8 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            S s11 = new S(s10, spliteratorTrySplit, s10.f38083f);
            S s12 = new S(s10, spliterator, s11);
            s10.addToPendingCount(1);
            s12.addToPendingCount(1);
            s10.f38081d.put(s11, s12);
            if (s10.f38083f != null) {
                s11.addToPendingCount(1);
                if (s10.f38081d.replace(s10.f38083f, s10, s11)) {
                    s10.addToPendingCount(-1);
                } else {
                    s11.addToPendingCount(-1);
                }
            }
            if (z2) {
                spliterator = spliteratorTrySplit;
                s10 = s11;
                s11 = s12;
            } else {
                s10 = s12;
            }
            z2 = !z2;
            s11.fork();
        }
        if (s10.getPendingCount() > 0) {
            r rVar = new r(5);
            AbstractC2929b abstractC2929b = s10.f38078a;
            C0 c0K = abstractC2929b.K(abstractC2929b.D(spliterator), rVar);
            s10.f38078a.S(spliterator, c0K);
            s10.f38084g = c0K.a();
            s10.f38079b = null;
        }
        s10.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        K0 k02 = this.f38084g;
        if (k02 != null) {
            k02.forEach(this.f38082e);
            this.f38084g = null;
        } else {
            Spliterator spliterator = this.f38079b;
            if (spliterator != null) {
                this.f38078a.S(spliterator, this.f38082e);
                this.f38079b = null;
            }
        }
        S s10 = (S) this.f38081d.remove(this);
        if (s10 != null) {
            s10.tryComplete();
        }
    }
}
