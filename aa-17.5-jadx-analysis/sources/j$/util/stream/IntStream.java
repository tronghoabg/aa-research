package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.Spliterators;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public interface IntStream extends BaseStream<Integer, IntStream> {

    /* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
    /* renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.u0 u0Var = Spliterators.b;
                return new s(u0Var, u3.l(u0Var), false);
            }
            r4 r4Var = new r4(i, i2);
            return new s(r4Var, u3.l(r4Var), false);
        }
    }

    void forEach(IntConsumer intConsumer);

    <U> Stream<U> mapToObj(IntFunction<? extends U> intFunction);

    OptionalInt max();

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    int[] toArray();
}
