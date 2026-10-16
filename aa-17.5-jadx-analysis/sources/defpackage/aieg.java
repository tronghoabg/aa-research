package defpackage;

/* loaded from: classes3.dex */
final class aieg<T> {
    private final Thread thread = Thread.currentThread();
    private final T value;

    public aieg(T t) {
        this.value = t;
    }

    public T getValue() {
        if (hasValue()) {
            return this.value;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean hasValue() {
        return this.thread == Thread.currentThread();
    }
}
