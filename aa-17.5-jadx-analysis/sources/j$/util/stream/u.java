package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class u extends a implements LongStream {
    @Override // j$.util.stream.a
    public final j0 f(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jG = aVar.g(spliterator);
        if (jG >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jG >= 2147483639) {
                j$.time.g.a("Stream size exceeds max array size");
                return null;
            }
            long[] jArr = new long[(int) jG];
            new r1(spliterator, aVar, jArr).invoke();
            return new n1(jArr);
        }
        h0 h0Var = (h0) new o0(aVar, spliterator, new i((byte) 12), new i((byte) 13)).invoke();
        if (!z || h0Var.l() <= 0) {
            return h0Var;
        }
        long jCount = h0Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.a("Stream size exceeds max array size");
            return null;
        }
        long[] jArr2 = new long[(int) jCount];
        new w1(h0Var, jArr2).invoke();
        return new n1(jArr2);
    }

    @Override // j$.util.stream.a
    public final boolean h(Spliterator spliterator, z2 z2Var) {
        LongConsumer a0Var;
        boolean zS;
        if (!(spliterator instanceof Spliterator.OfLong)) {
            if (!v4.a) {
                throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            v4.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) spliterator;
        if (z2Var instanceof LongConsumer) {
            a0Var = (LongConsumer) z2Var;
        } else {
            if (v4.a) {
                v4.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            z2Var.getClass();
            a0Var = new j$.util.a0(z2Var, (byte) 1);
        }
        do {
            zS = z2Var.s();
            if (zS) {
                break;
            }
        } while (ofLong.tryAdvance(a0Var));
        return zS;
    }

    @Override // j$.util.stream.a
    public final v3 i() {
        return v3.LONG_VALUE;
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator<Long> iterator() {
        Spliterator spliterator = spliterator();
        if (spliterator instanceof Spliterator.OfLong) {
            return new j$.util.p0((Spliterator.OfLong) spliterator);
        }
        if (!v4.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        v4.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final b0 j(long j, IntFunction intFunction) {
        return a2.F(j);
    }

    @Override // j$.util.stream.a
    public final Spliterator r(a aVar, Supplier supplier, boolean z) {
        return new c4(aVar, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return ((Long) d(new b2(v3.LONG_VALUE, new i((byte) 7), (byte) 0))).longValue();
    }
}
