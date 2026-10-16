package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aifg<T> {
    private final java.lang.Thread thread = java.lang.Thread.currentThread();
    private final T value;

    public aifg(T t) {
        this.value = t;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new java.lang.IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean hasValue() {
        return this.thread == java.lang.Thread.currentThread();
    }
}
