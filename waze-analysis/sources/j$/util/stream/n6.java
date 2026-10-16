package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class n6 extends k1 {
    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        if (j7.SORTED.k(aVar.f50316f)) {
            return aVar.j(spliterator, false, intFunction);
        }
        int[] iArr = (int[]) ((i2) aVar.j(spliterator, true, intFunction)).b();
        Arrays.sort(iArr);
        return new h3(iArr);
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        Objects.requireNonNull(t5Var);
        return j7.SORTED.k(i2) ? t5Var : j7.SIZED.k(i2) ? new s6(t5Var) : new k6(t5Var);
    }
}
