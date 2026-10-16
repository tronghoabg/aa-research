package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a2 extends b {

    /* renamed from: j, reason: collision with root package name */
    public final j$.nio.file.z f50330j;

    public a2(a2 a2Var, Spliterator spliterator) {
        super(a2Var, spliterator);
        this.f50330j = a2Var.f50330j;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        a aVar = this.f50361a;
        y1 y1Var = (y1) ((Supplier) this.f50330j.f49786c).get();
        aVar.Q(this.f50362b, y1Var);
        boolean z = y1Var.f50705b;
        if (z == ((z1) this.f50330j.f49785b).f50727b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.f50336h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d
    public final d e(Spliterator spliterator) {
        return new a2(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object j() {
        return Boolean.valueOf(!((z1) this.f50330j.f49785b).f50727b);
    }

    public a2(j$.nio.file.z zVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.f50330j = zVar;
    }
}
