package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class x0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final long f50667a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f50668b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f50669c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f50670d;

    /* renamed from: e, reason: collision with root package name */
    public Spliterator f50671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function f50672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f50673g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t0 f50674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f50675i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Supplier f50676j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Supplier f50677k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d1 f50678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(d1 d1Var, Spliterator spliterator, Function function, w0 w0Var, t0 t0Var, BiConsumer biConsumer, Supplier supplier, Supplier supplier2) {
        super(null);
        this.f50672f = function;
        this.f50673g = w0Var;
        this.f50674h = t0Var;
        this.f50675i = biConsumer;
        this.f50676j = supplier;
        this.f50677k = supplier2;
        this.f50678l = d1Var;
        if (d1.n == 0) {
            synchronized (d1.class) {
                try {
                    if (d1.n == 0) {
                        d1.n = d1.m.a(x0.class, "next");
                    }
                } finally {
                }
            }
        }
        this.f50671e = spliterator;
        this.f50667a = d.g(spliterator.estimateSize());
        this.f50670d = new z0(supplier2, supplier, biConsumer, t0Var, w0Var, function);
        this.f50669c = new AtomicBoolean(false);
        this.f50668b = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50671e;
        long j2 = this.f50667a;
        boolean z = false;
        x0 x0Var = this;
        Spliterator spliterator2 = spliterator;
        while (!this.f50669c.get() && spliterator2.estimateSize() > j2 && (spliteratorTrySplit = spliterator2.trySplit()) != null) {
            x0 x0Var2 = new x0(this.f50678l, x0Var, spliteratorTrySplit, x0Var.f50668b, this.f50672f, this.f50673g, this.f50674h, this.f50675i, this.f50676j, this.f50677k);
            x0 x0Var3 = new x0(this.f50678l, x0Var, spliterator2, x0Var2, this.f50672f, this.f50673g, this.f50674h, this.f50675i, this.f50676j, this.f50677k);
            x0Var.addToPendingCount(1);
            x0Var3.addToPendingCount(1);
            if (x0Var.f50668b != null) {
                x0Var2.addToPendingCount(1);
                boolean zK = j$.com.android.tools.r8.a.K(d1.m.f49788a, x0Var.f50668b, d1.n, x0Var, x0Var2);
                x0Var2 = x0Var2;
                if (zK) {
                    x0Var.addToPendingCount(-1);
                } else {
                    x0Var2.addToPendingCount(-1);
                }
            }
            if (z) {
                x0Var3.fork();
                spliterator2 = spliteratorTrySplit;
                x0Var = x0Var2;
            } else {
                x0Var2.fork();
                x0Var = x0Var3;
            }
            z = !z;
        }
        x0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return this.f50670d;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object objectVolatile;
        Spliterator spliterator = this.f50671e;
        this.f50671e = null;
        if (spliterator != null && !this.f50669c.get()) {
            z0 z0Var = this.f50670d;
            z0Var.a(spliterator);
            if (!z0Var.f50718c) {
                this.f50669c.set(true);
            }
        }
        j$.sun.misc.a aVar = d1.m;
        long j2 = d1.n;
        while (true) {
            objectVolatile = aVar.f49788a.getObjectVolatile(this, j2);
            x0 x0Var = this;
            if (j$.com.android.tools.r8.a.K(aVar.f49788a, x0Var, j2, objectVolatile, null)) {
                break;
            } else {
                this = x0Var;
            }
        }
        x0 x0Var2 = (x0) objectVolatile;
        if (x0Var2 != null) {
            x0Var2.tryComplete();
        }
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (((z0) obj) != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(d1 d1Var, x0 x0Var, Spliterator spliterator, x0 x0Var2, Function function, w0 w0Var, t0 t0Var, BiConsumer biConsumer, Supplier supplier, Supplier supplier2) {
        super(x0Var);
        this.f50672f = function;
        this.f50673g = w0Var;
        this.f50674h = t0Var;
        this.f50675i = biConsumer;
        this.f50676j = supplier;
        this.f50677k = supplier2;
        this.f50678l = d1Var;
        if (d1.n == 0) {
            synchronized (d1.class) {
                try {
                    if (d1.n == 0) {
                        d1.n = d1.m.a(x0.class, "next");
                    }
                } finally {
                }
            }
        }
        this.f50671e = spliterator;
        this.f50667a = x0Var.f50667a;
        this.f50670d = x0Var.f50670d;
        this.f50669c = x0Var.f50669c;
        this.f50668b = x0Var2;
    }
}
