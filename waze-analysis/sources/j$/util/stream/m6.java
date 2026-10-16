package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class m6 extends w implements e9 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6(a aVar, int i2, int i3) {
        super(aVar, i2, 0);
        this.m = i3;
    }

    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        switch (this.m) {
            case 0:
                if (j7.SORTED.k(aVar.f50316f)) {
                    return aVar.j(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((g2) aVar.j(spliterator, true, intFunction)).b();
                Arrays.sort(dArr);
                return new y2(dArr);
            case 1:
                return (m2) new h9(this, aVar, spliterator, intFunction).invoke();
            default:
                return (m2) new g9(this, aVar, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public Spliterator K(a aVar, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return j7.ORDERED.k(aVar.f50316f) ? J(aVar, spliterator, new d8(5)).spliterator() : new i9((j$.util.s0) aVar.S(spliterator), 1);
            case 2:
                return j7.ORDERED.k(aVar.f50316f) ? J(aVar, spliterator, new d8(6)).spliterator() : new i9((j$.util.s0) aVar.S(spliterator), 0);
            default:
                return super.K(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        switch (this.m) {
            case 0:
                Objects.requireNonNull(t5Var);
                if (j7.SORTED.k(i2)) {
                    return t5Var;
                }
                return j7.SIZED.k(i2) ? new r6(t5Var) : new j6(t5Var);
            case 1:
                c9 c9Var = new c9(t5Var);
                c9Var.f50359b = true;
                return c9Var;
            default:
                return new d9(t5Var);
        }
    }

    @Override // j$.util.stream.e9
    public f9 e(t5 t5Var, boolean z) {
        return new d9(t5Var);
    }
}
