package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiod<T> extends defpackage.aioa<T> {
    public static final defpackage.aiob Companion = new defpackage.aiob(null);
    private java.lang.Object[] data;
    private int size;

    private aiod(java.lang.Object[] objArr, int i) {
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
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.data, length);
            objArrCopyOf.getClass();
            this.data = objArrCopyOf;
        }
    }

    @Override // defpackage.aioa
    public T get(int i) {
        return (T) defpackage.afga.bQ(this.data, i);
    }

    @Override // defpackage.aioa
    public int getSize() {
        return this.size;
    }

    @Override // defpackage.aioa, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new defpackage.aioc(this);
    }

    @Override // defpackage.aioa
    public void set(int i, T t) {
        t.getClass();
        ensureCapacity(i);
        java.lang.Object[] objArr = this.data;
        if (objArr[i] == null) {
            this.size = getSize() + 1;
        }
        objArr[i] = t;
    }

    public aiod() {
        this(new java.lang.Object[20], 0);
    }
}
