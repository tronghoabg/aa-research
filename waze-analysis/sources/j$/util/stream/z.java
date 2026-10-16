package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class z implements r8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f50712a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f50713b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f50714c;

    /* renamed from: d, reason: collision with root package name */
    public final Supplier f50715d;

    public z(boolean z, k7 k7Var, Object obj, Predicate predicate, Supplier supplier) {
        this.f50712a = (z ? 0 : j7.r) | j7.u;
        this.f50713b = obj;
        this.f50714c = predicate;
        this.f50715d = supplier;
    }

    @Override // j$.util.stream.r8
    public final Object a(a aVar, Spliterator spliterator) {
        s8 s8Var = (s8) this.f50715d.get();
        aVar.Q(spliterator, s8Var);
        Object obj = s8Var.get();
        return obj != null ? obj : this.f50713b;
    }

    @Override // j$.util.stream.r8
    public final Object b(a aVar, Spliterator spliterator) {
        return new f0(this, j7.ORDERED.k(aVar.f50316f), aVar, spliterator).invoke();
    }

    @Override // j$.util.stream.r8
    public final int c() {
        return this.f50712a;
    }
}
