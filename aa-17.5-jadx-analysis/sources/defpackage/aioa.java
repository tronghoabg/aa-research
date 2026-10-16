package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aioa<T> extends aina<T> {
    private final int index;
    private final T value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aioa(T t, int i) {
        super(null);
        t.getClass();
        this.value = t;
        this.index = i;
    }

    @Override // defpackage.aina
    public T get(int i) {
        if (i == this.index) {
            return this.value;
        }
        return null;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // defpackage.aina
    public int getSize() {
        return 1;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // defpackage.aina, java.lang.Iterable
    public Iterator<T> iterator() {
        return new ainz(this);
    }

    @Override // defpackage.aina
    public void set(int i, T t) {
        t.getClass();
        throw new IllegalStateException();
    }
}
