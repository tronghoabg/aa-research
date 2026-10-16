package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class b3 extends v2 {
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(w2 w2Var, int i, long j, long j2) {
        super(w2Var, i, (byte) 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.a
    public final j0 l(a aVar, Spliterator spliterator, IntFunction intFunction) {
        long j;
        Spliterator h4Var;
        long jG = aVar.g(spliterator);
        long jMin = this.n;
        if (jG <= 0 || !spliterator.hasCharacteristics(16384)) {
            if (u3.ORDERED.p(aVar.f)) {
                return (j0) new d3(this, aVar, spliterator, intFunction, this.m, this.n).invoke();
            }
            Spliterator spliteratorU = aVar.u(spliterator);
            long j2 = this.m;
            if (j2 <= jG) {
                long j3 = jG - j2;
                jMin = jMin >= 0 ? Math.min(jMin, j3) : j3;
                j = 0;
            } else {
                j = j2;
            }
            return a2.y(this, new j4(spliteratorU, j, jMin), true, intFunction);
        }
        a aVar2 = aVar;
        while (aVar2.e > 0) {
            aVar2 = aVar2.b;
        }
        v3 v3VarI = aVar2.i();
        long j4 = this.m;
        long j5 = jMin >= 0 ? jMin + j4 : Long.MAX_VALUE;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        int i = c3.a[v3VarI.ordinal()];
        if (i == 1) {
            h4Var = new h4(spliterator, j4, j6);
        } else if (i == 2) {
            h4Var = new e4((Spliterator.OfInt) spliterator, j4, j6);
        } else if (i == 3) {
            h4Var = new f4((Spliterator.OfLong) spliterator, j4, j6);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape ".concat(String.valueOf(v3VarI)));
            }
            h4Var = new d4((j$.util.e0) spliterator, j4, j6);
        }
        return a2.y(aVar, h4Var, true, intFunction);
    }

    @Override // j$.util.stream.a
    public final Spliterator m(a aVar, Spliterator spliterator) {
        long j;
        long jG = aVar.g(spliterator);
        long jMin = this.n;
        if (jG > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorU = aVar.u(spliterator);
            long j2 = this.m;
            long j3 = jMin >= 0 ? jMin + j2 : Long.MAX_VALUE;
            return new h4(spliteratorU, j2, j3 >= 0 ? j3 : Long.MAX_VALUE);
        }
        if (u3.ORDERED.p(aVar.f)) {
            return ((j0) new d3(this, aVar, spliterator, new i((byte) 9), this.m, this.n).invoke()).spliterator();
        }
        Spliterator spliteratorU2 = aVar.u(spliterator);
        long j4 = this.m;
        if (j4 <= jG) {
            long j5 = jG - j4;
            jMin = jMin >= 0 ? Math.min(jMin, j5) : j5;
            j = 0;
        } else {
            j = j4;
        }
        return new j4(spliteratorU2, j, jMin);
    }

    @Override // j$.util.stream.a
    public final z2 o(int i, z2 z2Var) {
        return new a3(z2Var, this.m, this.n);
    }
}
