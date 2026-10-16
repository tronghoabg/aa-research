package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z0 implements Consumer, q0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f50716a;

    /* renamed from: b, reason: collision with root package name */
    public Object f50717b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Supplier f50719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Supplier f50720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f50721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0 f50722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w0 f50723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function f50724i;

    public z0(Supplier supplier, Supplier supplier2, BiConsumer biConsumer, t0 t0Var, w0 w0Var, Function function) {
        this.f50719d = supplier;
        this.f50720e = supplier2;
        this.f50721f = biConsumer;
        this.f50722g = t0Var;
        this.f50723h = w0Var;
        this.f50724i = function;
        e1 e1Var = e1.DEFAULT;
        e1Var.getClass();
        if (supplier != e1Var) {
            this.f50716a = supplier.get();
        }
        this.f50717b = supplier2.get();
        this.f50718c = true;
    }

    public final void a(Spliterator spliterator) {
        while (this.f50718c && spliterator.tryAdvance(this)) {
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (((r0) this.f50722g).a(this.f50716a, obj, this)) {
            return;
        }
        this.f50718c = false;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final Object b() {
        BiConsumer biConsumerD = ((u0) this.f50723h).d();
        e1 e1Var = e1.DEFAULT;
        e1Var.getClass();
        if (biConsumerD != e1Var) {
            biConsumerD.accept(this.f50716a, this);
        }
        Object obj = this.f50717b;
        Function function = this.f50724i;
        return function == null ? obj : function.apply(obj);
    }

    @Override // j$.util.stream.q0
    public final boolean isRejecting() {
        return false;
    }

    @Override // j$.util.stream.q0
    public final boolean push(Object obj) {
        this.f50721f.accept(this.f50717b, obj);
        return true;
    }
}
