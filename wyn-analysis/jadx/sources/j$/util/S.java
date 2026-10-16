package j$.util;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class S {
    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return java.util.Optional.of(optional.get());
        }
        return java.util.Optional.empty();
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static OptionalDouble n(A a5) {
        if (a5 == null) {
            return null;
        }
        if (a5.c()) {
            return OptionalDouble.of(a5.b());
        }
        return OptionalDouble.empty();
    }

    public static A j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return A.d(optionalDouble.getAsDouble());
        }
        return A.a();
    }

    public static OptionalLong p(C c10) {
        if (c10 == null) {
            return null;
        }
        if (c10.c()) {
            return OptionalLong.of(c10.b());
        }
        return OptionalLong.empty();
    }

    public static C l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return C.d(optionalLong.getAsLong());
        }
        return C.a();
    }

    public static OptionalInt o(B b5) {
        if (b5 == null) {
            return null;
        }
        if (b5.c()) {
            return OptionalInt.of(b5.b());
        }
        return OptionalInt.empty();
    }

    public static B k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return B.d(optionalInt.getAsInt());
        }
        return B.a();
    }

    public static void q(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC3058y) {
            ((InterfaceC3058y) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i5) {
        return (spliterator.characteristics() & i5) == i5;
    }

    public static boolean g(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (t0.f38365a) {
            t0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return ofInt.tryAdvance((IntConsumer) new H(consumer));
    }

    public static void b(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else {
            if (t0.f38365a) {
                t0.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            ofInt.forEachRemaining((IntConsumer) new H(consumer));
        }
    }

    public static boolean h(a0 a0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return a0Var.tryAdvance((LongConsumer) consumer);
        }
        if (t0.f38365a) {
            t0.a(a0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return a0Var.tryAdvance((LongConsumer) new L(consumer));
    }

    public static void c(a0 a0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            a0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (t0.f38365a) {
                t0.a(a0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            a0Var.forEachRemaining((LongConsumer) new L(consumer));
        }
    }

    public static boolean f(V v2, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return v2.tryAdvance((DoubleConsumer) consumer);
        }
        if (t0.f38365a) {
            t0.a(v2.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v2.tryAdvance((DoubleConsumer) new D(consumer));
    }

    public static void a(V v2, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v2.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (t0.f38365a) {
                t0.a(v2.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v2.forEachRemaining((DoubleConsumer) new D(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
