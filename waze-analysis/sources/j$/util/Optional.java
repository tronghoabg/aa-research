package j$.util;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class Optional<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Optional f50120b = new Optional();

    /* renamed from: a, reason: collision with root package name */
    public final Object f50121a;

    public Optional(Object obj) {
        this.f50121a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> empty() {
        return f50120b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f50121a, ((Optional) obj).f50121a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.f50121a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        return Objects.hashCode(this.f50121a);
    }

    public boolean isEmpty() {
        return this.f50121a == null;
    }

    public T orElse(T t) {
        T t2 = (T) this.f50121a;
        return t2 != null ? t2 : t;
    }

    public final String toString() {
        Object obj = this.f50121a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    public Optional() {
        this.f50121a = null;
    }
}
