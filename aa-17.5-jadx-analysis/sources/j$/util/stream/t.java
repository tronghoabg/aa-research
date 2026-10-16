package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class t extends a implements IntStream {
    public static Spliterator.OfInt v(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (!v4.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        v4.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    public void forEach(IntConsumer intConsumer) {
        intConsumer.getClass();
        d(new n(intConsumer));
    }

    @Override // j$.util.stream.a
    public final boolean h(Spliterator spliterator, z2 z2Var) {
        IntConsumer zVar;
        boolean zS;
        Spliterator.OfInt ofIntV = v(spliterator);
        if (z2Var instanceof IntConsumer) {
            zVar = (IntConsumer) z2Var;
        } else {
            if (v4.a) {
                v4.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            z2Var.getClass();
            zVar = new j$.util.z(z2Var, (byte) 1);
        }
        do {
            zS = z2Var.s();
            if (zS) {
                break;
            }
        } while (ofIntV.tryAdvance(zVar));
        return zS;
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator<Integer> iterator() {
        return new j$.util.o0(v(spliterator()));
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new r(this, u3.o | u3.n, intFunction, (byte) 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return (OptionalInt) d(new b2(v3.INT_VALUE, new i((byte) 6), (byte) 2));
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return ((Integer) d(new k2(v3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) a2.D((f0) e(new i((byte) 5))).b();
    }
}
