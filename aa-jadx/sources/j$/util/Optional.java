package j$.util;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class Optional<T> {
    public static final j$.util.Optional b = new j$.util.Optional();
    public final java.lang.Object a;

    public Optional(java.lang.Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public static <T> j$.util.Optional<T> empty() {
        return b;
    }

    public static <T> j$.util.Optional<T> of(T t) {
        return new j$.util.Optional<>(t);
    }

    public static <T> j$.util.Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.util.Optional) {
            return j$.util.Objects.equals(this.a, ((j$.util.Optional) obj).a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public int hashCode() {
        return j$.util.Objects.hashCode(this.a);
    }

    public void ifPresentOrElse(java.util.function.Consumer<? super T> consumer, java.lang.Runnable runnable) {
        defpackage.aaac aaacVar = (java.lang.Object) this.a;
        if (aaacVar != null) {
            consumer.accept(aaacVar);
        } else {
            runnable.run();
        }
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public j$.util.Optional<T> or(java.util.function.Supplier<? extends j$.util.Optional<? extends T>> supplier) {
        supplier.getClass();
        if (isPresent()) {
            return this;
        }
        j$.util.Optional<? extends T> optional = supplier.get();
        optional.getClass();
        return optional;
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public T orElseThrow() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public j$.util.stream.Stream<T> stream() {
        return !isPresent() ? j$.util.stream.Stream.CC.empty() : j$.util.stream.Stream.CC.of(this.a);
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.a;
        return obj != null ? java.lang.String.format("Optional[%s]", obj) : "Optional.empty";
    }

    public Optional() {
        this.a = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends java.lang.Throwable> T orElseThrow(java.util.function.Supplier<? extends X> supplier) throws X {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }
}
