package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final Optional f37762b = new Optional();

    /* renamed from: a, reason: collision with root package name */
    private final Object f37763a;

    private Optional() {
        this.f37763a = null;
    }

    public static <T> Optional<T> empty() {
        return f37762b;
    }

    private Optional(Object obj) {
        this.f37763a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> of(T t10) {
        return new Optional<>(t10);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        return t10 == null ? empty() : of(t10);
    }

    public T get() {
        T t10 = (T) this.f37763a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f37763a != null;
    }

    public T orElse(T t10) {
        T t11 = (T) this.f37763a;
        return t11 != null ? t11 : t10;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        T t10 = (T) this.f37763a;
        if (t10 != null) {
            return t10;
        }
        throw supplier.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f37763a, ((Optional) obj).f37763a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37763a);
    }

    public final String toString() {
        Object obj = this.f37763a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
