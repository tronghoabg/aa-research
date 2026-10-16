package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aipa<T> extends defpackage.aioa<T> {
    private final int index;
    private final T value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aipa(T t, int i) {
        super(null);
        t.getClass();
        this.value = t;
        this.index = i;
    }

    @Override // defpackage.aioa
    public T get(int i) {
        if (i == this.index) {
            return this.value;
        }
        return null;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // defpackage.aioa
    public int getSize() {
        return 1;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // defpackage.aioa, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new defpackage.aioz(this);
    }

    @Override // defpackage.aioa
    public void set(int i, T t) {
        t.getClass();
        throw new java.lang.IllegalStateException();
    }
}
