package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class x5 extends k1 {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(l1 l1Var, int i2, long j2, long j3) {
        super(l1Var, i2, 0);
        this.m = j2;
        this.n = j3;
    }

    @Override // j$.util.stream.a
    public final m2 J(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j2;
        long jR = aVar.r(spliterator);
        if (jR > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar2 = aVar;
            while (aVar2.f50315e > 0) {
                aVar2 = aVar2.f50312b;
            }
            return d4.A(aVar, e6.h(aVar2.H(), spliterator, this.m, this.n), true);
        }
        if (j7.ORDERED.k(aVar.f50316f)) {
            return (m2) new d6(this, aVar, spliterator, intFunction, this.m, this.n).invoke();
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) aVar.S(spliterator);
        long j3 = this.m;
        long j4 = this.n;
        if (j3 <= jR) {
            long j5 = jR - j3;
            jMin = j4 >= 0 ? Math.min(j4, j5) : j5;
            j2 = 0;
        } else {
            jMin = j4;
            j2 = j3;
        }
        return d4.A(this, new h8(ofInt, j2, jMin), true);
    }

    @Override // j$.util.stream.a
    public final Spliterator K(a aVar, Spliterator spliterator) {
        long j2;
        long jR = aVar.r(spliterator);
        long jMin = this.n;
        if (jR > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator.OfInt ofInt = (Spliterator.OfInt) aVar.S(spliterator);
            long j3 = this.m;
            return new a8(ofInt, j3, e6.b(j3, jMin));
        }
        if (j7.ORDERED.k(aVar.f50316f)) {
            return ((m2) new d6(this, aVar, spliterator, new h1(26), this.m, this.n).invoke()).spliterator();
        }
        Spliterator.OfInt ofInt2 = (Spliterator.OfInt) aVar.S(spliterator);
        long j4 = this.m;
        if (j4 <= jR) {
            long j5 = jR - j4;
            jMin = jMin >= 0 ? Math.min(jMin, j5) : j5;
            j2 = 0;
        } else {
            j2 = j4;
        }
        return new h8(ofInt2, j2, jMin);
    }

    @Override // j$.util.stream.a
    public final t5 M(int i2, t5 t5Var) {
        return new w5(t5Var, this.m, this.n);
    }
}
