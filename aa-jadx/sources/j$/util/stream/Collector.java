package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public interface Collector<T, A, R> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public static final class Characteristics {
        public static final j$.util.stream.Collector.Characteristics CONCURRENT;
        public static final j$.util.stream.Collector.Characteristics IDENTITY_FINISH;
        public static final j$.util.stream.Collector.Characteristics UNORDERED;
        public static final /* synthetic */ j$.util.stream.Collector.Characteristics[] a;

        static {
            j$.util.stream.Collector.Characteristics characteristics = new j$.util.stream.Collector.Characteristics("CONCURRENT", 0);
            CONCURRENT = characteristics;
            j$.util.stream.Collector.Characteristics characteristics2 = new j$.util.stream.Collector.Characteristics("UNORDERED", 1);
            UNORDERED = characteristics2;
            j$.util.stream.Collector.Characteristics characteristics3 = new j$.util.stream.Collector.Characteristics("IDENTITY_FINISH", 2);
            IDENTITY_FINISH = characteristics3;
            a = new j$.util.stream.Collector.Characteristics[]{characteristics, characteristics2, characteristics3};
        }

        public static j$.util.stream.Collector.Characteristics valueOf(java.lang.String str) {
            return (j$.util.stream.Collector.Characteristics) java.lang.Enum.valueOf(j$.util.stream.Collector.Characteristics.class, str);
        }

        public static j$.util.stream.Collector.Characteristics[] values() {
            return (j$.util.stream.Collector.Characteristics[]) a.clone();
        }
    }

    java.util.function.BiConsumer accumulator();

    java.util.Set characteristics();

    java.util.function.BinaryOperator combiner();

    java.util.function.Function finisher();

    java.util.function.Supplier supplier();

    /* JADX INFO: renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public final /* synthetic */ class CC {
        public static <T, A, R> j$.util.stream.Collector<T, A, R> of(java.util.function.Supplier<A> supplier, java.util.function.BiConsumer<A, T> biConsumer, java.util.function.BinaryOperator<A> binaryOperator, java.util.function.Function<A, R> function, j$.util.stream.Collector.Characteristics... characteristicsArr) {
            supplier.getClass();
            biConsumer.getClass();
            binaryOperator.getClass();
            function.getClass();
            characteristicsArr.getClass();
            java.util.Set setUnmodifiableSet = j$.util.stream.Collectors.c;
            if (characteristicsArr.length > 0) {
                java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(j$.util.stream.Collector.Characteristics.class);
                java.util.Collections.addAll(enumSetNoneOf, characteristicsArr);
                setUnmodifiableSet = java.util.Collections.unmodifiableSet(enumSetNoneOf);
            }
            return new j$.util.stream.f(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
        }

        public static <T, R> j$.util.stream.Collector<T, R, R> of(java.util.function.Supplier<R> supplier, java.util.function.BiConsumer<R, T> biConsumer, java.util.function.BinaryOperator<R> binaryOperator, j$.util.stream.Collector.Characteristics... characteristicsArr) {
            java.util.Set setUnmodifiableSet;
            supplier.getClass();
            biConsumer.getClass();
            binaryOperator.getClass();
            characteristicsArr.getClass();
            if (characteristicsArr.length == 0) {
                setUnmodifiableSet = j$.util.stream.Collectors.a;
            } else {
                setUnmodifiableSet = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(j$.util.stream.Collector.Characteristics.IDENTITY_FINISH, characteristicsArr));
            }
            return new j$.util.stream.f(supplier, biConsumer, binaryOperator, setUnmodifiableSet);
        }
    }
}
