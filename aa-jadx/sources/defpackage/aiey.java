package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiey<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean fallThrough;
    private final T value;

    private aiey(T t, boolean z) {
        this.value = t;
        this.fallThrough = z;
    }

    public static <T> defpackage.aiey<T> fallThrough() {
        return new defpackage.aiey<>(null, true);
    }

    public static <T> defpackage.aiey<T> value(T t) {
        return new defpackage.aiey<>(t, false);
    }

    public T getValue() {
        return this.value;
    }

    public boolean isFallThrough() {
        return this.fallThrough;
    }

    public java.lang.String toString() {
        return isFallThrough() ? "FALL_THROUGH" : java.lang.String.valueOf(this.value);
    }
}
