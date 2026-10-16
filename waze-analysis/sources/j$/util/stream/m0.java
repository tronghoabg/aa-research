package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final a f50510a;

    /* renamed from: b, reason: collision with root package name */
    public Spliterator f50511b;

    /* renamed from: c, reason: collision with root package name */
    public final long f50512c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f50513d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f50514e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f50515f;

    /* renamed from: g, reason: collision with root package name */
    public m2 f50516g;

    public m0(a aVar, Spliterator spliterator, l0 l0Var) {
        super(null);
        this.f50510a = aVar;
        this.f50511b = spliterator;
        this.f50512c = d.g(spliterator.estimateSize());
        this.f50513d = new ConcurrentHashMap(Math.max(16, d.f50360g << 1));
        this.f50514e = l0Var;
        this.f50515f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50511b;
        long j2 = this.f50512c;
        boolean z = false;
        while (spliterator.estimateSize() > j2 && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            m0 m0Var = new m0(this, spliteratorTrySplit, this.f50515f);
            m0 m0Var2 = new m0(this, spliterator, m0Var);
            this.addToPendingCount(1);
            m0Var2.addToPendingCount(1);
            this.f50513d.put(m0Var, m0Var2);
            if (this.f50515f != null) {
                m0Var.addToPendingCount(1);
                if (this.f50513d.replace(this.f50515f, this, m0Var)) {
                    this.addToPendingCount(-1);
                } else {
                    m0Var.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = spliteratorTrySplit;
                this = m0Var;
                m0Var = m0Var2;
            } else {
                this = m0Var2;
            }
            z = !z;
            m0Var.fork();
        }
        if (this.getPendingCount() > 0) {
            n nVar = new n(19);
            a aVar = this.f50510a;
            e2 e2VarI = aVar.I(aVar.r(spliterator), nVar);
            this.f50510a.Q(spliterator, e2VarI);
            this.f50516g = e2VarI.build();
            this.f50511b = null;
        }
        this.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        m2 m2Var = this.f50516g;
        if (m2Var != null) {
            m2Var.forEach(this.f50514e);
            this.f50516g = null;
        } else {
            Spliterator spliterator = this.f50511b;
            if (spliterator != null) {
                this.f50510a.Q(spliterator, this.f50514e);
                this.f50511b = null;
            }
        }
        m0 m0Var = (m0) this.f50513d.remove(this);
        if (m0Var != null) {
            m0Var.tryComplete();
        }
    }

    public m0(m0 m0Var, Spliterator spliterator, m0 m0Var2) {
        super(m0Var);
        this.f50510a = m0Var.f50510a;
        this.f50511b = spliterator;
        this.f50512c = m0Var.f50512c;
        this.f50513d = m0Var.f50513d;
        this.f50514e = m0Var.f50514e;
        this.f50515f = m0Var2;
    }
}
