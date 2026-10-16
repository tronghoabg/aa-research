package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class F implements N3 {

    /* renamed from: a, reason: collision with root package name */
    final int f37980a;

    /* renamed from: b, reason: collision with root package name */
    final Object f37981b;

    /* renamed from: c, reason: collision with root package name */
    final Predicate f37982c;

    /* renamed from: d, reason: collision with root package name */
    final Supplier f37983d;

    F(boolean z2, EnumC2963h3 enumC2963h3, Object obj, Predicate predicate, Supplier supplier) {
        this.f37980a = (z2 ? 0 : EnumC2958g3.f38208r) | EnumC2958g3.f38211u;
        this.f37981b = obj;
        this.f37982c = predicate;
        this.f37983d = supplier;
    }

    @Override // j$.util.stream.N3
    public final int d() {
        return this.f37980a;
    }

    @Override // j$.util.stream.N3
    public final Object b(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        O3 o32 = (O3) this.f37983d.get();
        abstractC2929b.S(spliterator, o32);
        Object obj = o32.get();
        return obj != null ? obj : this.f37981b;
    }

    @Override // j$.util.stream.N3
    public final Object c(AbstractC2929b abstractC2929b, Spliterator spliterator) {
        return new L(this, EnumC2958g3.ORDERED.t(abstractC2929b.H()), abstractC2929b, spliterator).invoke();
    }
}
