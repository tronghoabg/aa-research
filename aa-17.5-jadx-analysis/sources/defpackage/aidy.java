package defpackage;

/* loaded from: classes3.dex */
final class aidy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean fallThrough;
    private final T value;

    private aidy(T t, boolean z) {
        this.value = t;
        this.fallThrough = z;
    }

    public static <T> aidy<T> fallThrough() {
        return new aidy<>(null, true);
    }

    public static <T> aidy<T> value(T t) {
        return new aidy<>(t, false);
    }

    public T getValue() {
        return this.value;
    }

    public boolean isFallThrough() {
        return this.fallThrough;
    }

    public String toString() {
        return isFallThrough() ? "FALL_THROUGH" : String.valueOf(this.value);
    }
}
