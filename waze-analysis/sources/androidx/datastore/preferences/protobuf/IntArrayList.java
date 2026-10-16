package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final int[] EMPTY_ARRAY;
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        int[] iArr = new int[0];
        EMPTY_ARRAY = iArr;
        EMPTY_LIST = new IntArrayList(iArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    IntArrayList(IntArrayList intArrayList, boolean z) {
        int i2 = intArrayList.size;
        this(i2 == 0 ? EMPTY_ARRAY : Arrays.copyOf(intArrayList.array, i2), intArrayList.size, z);
    }

    private void addInt(int i2, int i3) {
        int i4;
        ensureIsMutable();
        if (i2 < 0 || i2 > (i4 = this.size)) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i2));
        }
        int i5 = i2 + 1;
        int[] iArr = this.array;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i2, iArr, i5, i4 - i2);
        } else {
            int[] iArr2 = new int[growSize(length)];
            System.arraycopy(this.array, 0, iArr2, 0, i2);
            System.arraycopy(this.array, i2, iArr2, i5, this.size - i2);
            this.array = iArr2;
        }
        this.array[i2] = i3;
        this.size++;
        this.modCount++;
    }

    public static IntArrayList emptyList() {
        return EMPTY_LIST;
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

    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i2 = intArrayList.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArrCopyOf = this.array;
        if (i4 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
            this.array = iArrCopyOf;
        }
        System.arraycopy(intArrayList.array, 0, iArrCopyOf, this.size, intArrayList.size);
        this.size = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    void ensureCapacity(int i2) {
        int length = this.array.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.array = new int[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = growSize(length);
        }
        this.array = Arrays.copyOf(this.array, length);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i2 = 0; i2 < this.size; i2++) {
            if (this.array[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i2) {
        return Integer.valueOf(getInt(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int getInt(int i2) {
        ensureIndexInRange(i2);
        return this.array[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            i2 = (i2 * 31) + this.array[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.array[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i2) {
        if (i2 >= this.size) {
            return new IntArrayList(i2 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i2), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i2) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        int[] iArr = this.array;
        int i3 = iArr[i2];
        if (i2 < this.size - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i2, int i3) {
        ensureIsMutable();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.array;
        System.arraycopy(iArr, i3, iArr, i2, this.size - i3);
        this.size -= i3 - i2;
        this.modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i2, Integer num) {
        return Integer.valueOf(setInt(i2, num.intValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public int setInt(int i2, int i3) {
        ensureIsMutable();
        ensureIndexInRange(i2);
        int[] iArr = this.array;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i2, Integer num) {
        addInt(i2, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        add((Integer) obj);
        return true;
    }

    IntArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    private IntArrayList(int[] iArr, int i2, boolean z) {
        super(z);
        this.array = iArr;
        this.size = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.IntList
    public void addInt(int i2) {
        ensureIsMutable();
        int i3 = this.size;
        int[] iArr = this.array;
        int length = iArr.length;
        if (i3 == length) {
            iArr = new int[growSize(length)];
            System.arraycopy(this.array, 0, iArr, 0, this.size);
            this.array = iArr;
        }
        int i4 = this.size;
        this.size = i4 + 1;
        iArr[i4] = i2;
    }
}
