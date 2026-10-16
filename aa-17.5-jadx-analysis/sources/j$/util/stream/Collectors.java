package j$.util.stream;

import j$.util.stream.Collector;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;
    public static final Set c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        c = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set setCharacteristics = collector.characteristics();
        Collector.Characteristics characteristics = Collector.Characteristics.IDENTITY_FINISH;
        if (setCharacteristics.contains(characteristics)) {
            if (setCharacteristics.size() == 1) {
                setCharacteristics = c;
            } else {
                EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setCharacteristics);
                enumSetCopyOf.remove(characteristics);
                setCharacteristics = Collections.unmodifiableSet(enumSetCopyOf);
            }
        }
        return new f(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo329andThen(function), setCharacteristics);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new f(new e(charSequence, charSequence2, charSequence3), new j$.desugar.sun.nio.fs.n((byte) 26), new j$.desugar.sun.nio.fs.n((byte) 27), new j$.desugar.sun.nio.fs.n((byte) 28), c);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new f(supplier, new j$.desugar.sun.nio.fs.n((byte) 16), new j$.desugar.sun.nio.fs.n((byte) 17), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new f(new j$.desugar.sun.nio.fs.n((byte) 18), new j$.desugar.sun.nio.fs.n((byte) 19), new j$.desugar.sun.nio.fs.n((byte) 24), a);
    }

    public static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2, BinaryOperator<U> binaryOperator, Supplier<M> supplier) {
        return new f(supplier, new e(function, function2, binaryOperator), new j$.desugar.sun.nio.fs.h((byte) 10, binaryOperator), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new f(new j$.desugar.sun.nio.fs.n((byte) 22), new j$.desugar.sun.nio.fs.n((byte) 23), new j$.desugar.sun.nio.fs.n((byte) 29), b);
    }

    public static Collector<CharSequence, ?, String> joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }
}
