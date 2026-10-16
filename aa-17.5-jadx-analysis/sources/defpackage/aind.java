package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aind<T> extends aina<T> {
    public static final ainb Companion = new ainb(null);
    private Object[] data;
    private int size;

    private aind(Object[] objArr, int i) {
        super(null);
        this.data = objArr;
        this.size = i;
    }

    private final void ensureCapacity(int i) {
        int length = this.data.length;
        if (length <= i) {
            do {
                length += length;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.data, length);
            objArrCopyOf.getClass();
            this.data = objArrCopyOf;
        }
    }

    @Override // defpackage.aina
    public T get(int i) {
        return (T) woy.cW(this.data, i);
    }

    @Override // defpackage.aina
    public int getSize() {
        return this.size;
    }

    @Override // defpackage.aina, java.lang.Iterable
    public Iterator<T> iterator() {
        return new ainc(this);
    }

    @Override // defpackage.aina
    public void set(int i, T t) {
        t.getClass();
        ensureCapacity(i);
        Object[] objArr = this.data;
        if (objArr[i] == null) {
            this.size = getSize() + 1;
        }
        objArr[i] = t;
    }

    public aind() {
        this(new Object[20], 0);
    }
}
