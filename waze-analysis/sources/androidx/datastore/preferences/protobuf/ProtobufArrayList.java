package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final Object[] EMPTY_ARRAY;
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private E[] array;
    private int size;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY_LIST = new ProtobufArrayList<>(objArr, 0, false);
    }

    ProtobufArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    private static <E> E[] createArray(int i2) {
        return (E[]) new Object[i2];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
    }

    private void ensureIndexInRange(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
        }
    }

    private static int growSize(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private String makeOutOfBoundsExceptionMessage(int i2) {
        return "Index:" + i2 + ", Size:" + this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        ensureIsMutable();
        if (i2 < 0 || i2 > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
        }
        int i4 = i2 + 1;
        E[] eArr = this.array;
        int length = eArr.length;
        if (i3 < length) {
            System.arraycopy(eArr, i2, eArr, i4, i3 - i2);
        } else {
            E[] eArr2 = (E[]) createArray(growSize(length));
            System.arraycopy(this.array, 0, eArr2, 0, i2);
            System.arraycopy(this.array, i2, eArr2, i4, this.size - i2);
            this.array = eArr2;
        }
        this.array[i2] = e2;
        this.size++;
        this.modCount++;
    }

    void ensureCapacity(int i2) {
        int length = this.array.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.array = (E[]) new Object[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = growSize(length);
        }
        this.array = (E[]) Arrays.copyOf(this.array, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        ensureIndexInRange(i2);
        return this.array[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public ProtobufArrayList<E> mutableCopyWithCapacity(int i2) {
        if (i2 >= this.size) {
            return new ProtobufArrayList<>(i2 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i2), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int i2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        E[] eArr = this.array;
        E e2 = eArr[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return e2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        E[] eArr = this.array;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] eArr, int i2, boolean z) {
        super(z);
        this.array = eArr;
        this.size = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        ensureIsMutable();
        int i2 = this.size;
        E[] eArr = this.array;
        int length = eArr.length;
        if (i2 == length) {
            eArr = (E[]) Arrays.copyOf(this.array, growSize(length));
            this.array = eArr;
        }
        int i3 = this.size;
        this.size = i3 + 1;
        eArr[i3] = e2;
        this.modCount++;
        return true;
    }
}
