package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class y0 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public Spliterator f50692a;

    /* renamed from: b, reason: collision with root package name */
    public y0 f50693b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f50694c;

    /* renamed from: d, reason: collision with root package name */
    public z0 f50695d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f50696e;

    /* renamed from: f, reason: collision with root package name */
    public long f50697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function f50698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f50699h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t0 f50700i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f50701j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Supplier f50702k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Supplier f50703l;
    public final /* synthetic */ BinaryOperator m;
    public final /* synthetic */ BinaryOperator n;
    public final /* synthetic */ d1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(d1 d1Var, Spliterator spliterator, Function function, w0 w0Var, t0 t0Var, BiConsumer biConsumer, Supplier supplier, Supplier supplier2, BinaryOperator binaryOperator, BinaryOperator binaryOperator2) {
        super(null);
        this.f50698g = function;
        this.f50699h = w0Var;
        this.f50700i = t0Var;
        this.f50701j = biConsumer;
        this.f50702k = supplier;
        this.f50703l = supplier2;
        this.m = binaryOperator;
        this.n = binaryOperator2;
        this.o = d1Var;
        this.f50697f = 0L;
        this.f50692a = spliterator;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        boolean z;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f50692a;
        long jEstimateSize = spliterator.estimateSize();
        long jG = this.f50697f;
        if (jG == 0) {
            jG = d.g(jEstimateSize);
            this.f50697f = jG;
        }
        boolean z2 = false;
        y0 y0Var = this;
        Spliterator spliterator2 = spliterator;
        while (true) {
            z = y0Var.f50696e;
            if (!z) {
                for (y0 y0Var2 = (y0) y0Var.getCompleter(); !z && y0Var2 != null; y0Var2 = (y0) y0Var2.getCompleter()) {
                    z = y0Var2.f50696e;
                }
            }
            if (z || jEstimateSize <= jG || (spliteratorTrySplit = spliterator2.trySplit()) == null) {
                break;
            }
            y0 y0Var3 = new y0(this.o, y0Var, spliteratorTrySplit, this.f50698g, this.f50699h, this.f50700i, this.f50701j, this.f50702k, this.f50703l, this.m, this.n);
            y0Var.f50693b = y0Var3;
            y0 y0Var4 = new y0(this.o, y0Var, spliterator2, this.f50698g, this.f50699h, this.f50700i, this.f50701j, this.f50702k, this.f50703l, this.m, this.n);
            y0Var.f50694c = y0Var4;
            y0Var.setPendingCount(1);
            if (z2) {
                y0Var4.fork();
                y0Var = y0Var3;
                spliterator2 = spliteratorTrySplit;
            } else {
                y0Var3.fork();
                y0Var = y0Var4;
            }
            z2 = !z2;
            jEstimateSize = spliterator2.estimateSize();
        }
        if (!z) {
            z0 z0Var = new z0(y0Var.f50703l, y0Var.f50702k, y0Var.f50701j, y0Var.f50700i, y0Var.f50699h, y0Var.f50698g);
            y0Var.f50695d = z0Var;
            z0Var.a(y0Var.f50692a);
            if (!z0Var.f50718c) {
                y0 y0Var5 = y0Var;
                for (y0 y0Var6 = (y0) y0Var.getCompleter(); y0Var6 != null; y0Var6 = (y0) y0Var6.getCompleter()) {
                    if (y0Var6.f50693b == y0Var5) {
                        y0Var6.f50694c.f50696e = true;
                    }
                    y0Var5 = y0Var6;
                }
            }
        }
        y0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return this.f50695d;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        this.f50692a = null;
        y0 y0Var = this.f50693b;
        if (y0Var != null) {
            z0 z0Var = y0Var.f50695d;
            z0 z0Var2 = this.f50694c.f50695d;
            if (z0Var != null && z0Var2 != null && z0Var.f50718c) {
                z0Var.f50716a = this.m.apply(z0Var.f50716a, z0Var2.f50716a);
                z0Var.f50717b = this.n.apply(z0Var.f50717b, z0Var2.f50717b);
                z0Var.f50718c = z0Var2.f50718c;
            } else if (z0Var == null) {
                z0Var = z0Var2;
            }
            this.f50695d = z0Var;
            this.f50694c = null;
            this.f50693b = null;
        }
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (((z0) obj) != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(d1 d1Var, y0 y0Var, Spliterator spliterator, Function function, w0 w0Var, t0 t0Var, BiConsumer biConsumer, Supplier supplier, Supplier supplier2, BinaryOperator binaryOperator, BinaryOperator binaryOperator2) {
        super(y0Var);
        this.f50698g = function;
        this.f50699h = w0Var;
        this.f50700i = t0Var;
        this.f50701j = biConsumer;
        this.f50702k = supplier;
        this.f50703l = supplier2;
        this.m = binaryOperator;
        this.n = binaryOperator2;
        this.o = d1Var;
        this.f50697f = y0Var.f50697f;
        this.f50692a = spliterator;
    }
}
