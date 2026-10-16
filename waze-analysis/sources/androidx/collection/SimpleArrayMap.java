package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap(int i2) {
        this.hashes = i2 == 0 ? ContainerHelpersKt.EMPTY_INTS : new int[i2];
        this.array = i2 == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (T) this.array[iIndexOfKey + iIndexOfKey + 1] : t;
    }

    private final int indexOf(K k2, int i2) {
        int i3 = this.size;
        if (i3 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i3, i2);
        if (iBinarySearch < 0 || x.n(k2, this.array[iBinarySearch + iBinarySearch])) {
            return iBinarySearch;
        }
        int i4 = iBinarySearch + 1;
        while (i4 < i3 && this.hashes[i4] == i2) {
            if (x.n(k2, this.array[i4 + i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iBinarySearch - 1; i5 >= 0 && this.hashes[i5] == i2; i5--) {
            if (x.n(k2, this.array[i5 + i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private final int indexOfNull() {
        int i2 = this.size;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i2, 0);
        if (iBinarySearch < 0 || this.array[iBinarySearch + iBinarySearch] == null) {
            return iBinarySearch;
        }
        int i3 = iBinarySearch + 1;
        while (i3 < i2 && this.hashes[i3] == 0) {
            if (this.array[i3 + i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearch - 1; i4 >= 0 && this.hashes[i4] == 0; i4--) {
            if (this.array[i4 + i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int __restricted$indexOfValue(V v) {
        int i2 = this.size;
        int i3 = i2 + i2;
        Object[] objArr = this.array;
        if (v == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (x.n(v, objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
    }

    public boolean containsKey(K k2) {
        return indexOfKey(k2) >= 0;
    }

    public boolean containsValue(V v) {
        return __restricted$indexOfValue(v) >= 0;
    }

    public void ensureCapacity(int i2) {
        int i3 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            x.e(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i2 + i2);
            x.e(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                if (size() != simpleArrayMap.size()) {
                    return false;
                }
                int i2 = this.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    K kKeyAt = keyAt(i3);
                    V vValueAt = valueAt(i3);
                    Object obj2 = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!x.n(vValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.size;
            for (int i5 = 0; i5 < i4; i5++) {
                K kKeyAt2 = keyAt(i5);
                V vValueAt2 = valueAt(i5);
                Map map = (Map) obj;
                Object obj3 = map.get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj3 != null || !map.containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!x.n(vValueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public V get(K k2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return (V) this.array[iIndexOfKey + iIndexOfKey + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object obj, V v) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.array[iIndexOfKey + iIndexOfKey + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i2 = this.size;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(K k2) {
        return k2 == null ? indexOfNull() : indexOf(k2, k2.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        return (K) this.array[i2 + i2];
    }

    public V put(K k2, V v) {
        int i2 = this.size;
        int iHashCode = k2 != null ? k2.hashCode() : 0;
        int iIndexOf = k2 != null ? indexOf(k2, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i3 = iIndexOf + iIndexOf + 1;
            Object[] objArr = this.array;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            x.e(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i5 + i5);
            x.e(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i2 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.hashes;
            int i6 = i4 + 1;
            c.ar(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.array;
            int i7 = this.size;
            c.at(objArr2, objArr2, i6 + i6, i4 + i4, i7 + i7);
        }
        int i8 = this.size;
        if (i2 == i8) {
            int[] iArr3 = this.hashes;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.array;
                int i9 = i4 + i4;
                objArr3[i9] = k2;
                objArr3[i9 + 1] = v;
                this.size = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        x.f(simpleArrayMap, "map");
        int i2 = simpleArrayMap.size;
        ensureCapacity(this.size + i2);
        if (this.size != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(simpleArrayMap.keyAt(i3), simpleArrayMap.valueAt(i3));
            }
        } else if (i2 > 0) {
            c.ar(simpleArrayMap.hashes, this.hashes, 0, 0, i2);
            c.at(simpleArrayMap.array, this.array, 0, 0, i2 + i2);
            this.size = i2;
        }
    }

    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    public boolean remove(K k2, V v) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey < 0 || !x.n(v, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public V removeAt(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        Object[] objArr = this.array;
        int i3 = i2 + i2;
        V v = (V) objArr[i3 + 1];
        int i4 = this.size;
        if (i4 <= 1) {
            clear();
            return v;
        }
        int i5 = i4 - 1;
        int[] iArr = this.hashes;
        int length = iArr.length;
        if (length <= 8 || i4 >= length / 3) {
            if (i2 < i5) {
                int i6 = i2 + 1;
                c.ar(iArr, iArr, i2, i6, i4);
                Object[] objArr2 = this.array;
                c.at(objArr2, objArr2, i3, i6 + i6, i4 + i4);
            }
            Object[] objArr3 = this.array;
            int i7 = i5 + i5;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            x.e(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i8 + i8);
            x.e(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i4 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (i2 > 0) {
                c.ar(iArr, this.hashes, 0, 0, i2);
                c.at(objArr, this.array, 0, 0, i3);
            }
            if (i2 < i5) {
                int i9 = i2 + 1;
                c.ar(iArr, this.hashes, i2, i9, i4);
                c.at(objArr, this.array, i3, i9 + i9, i4 + i4);
            }
        }
        if (i4 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i5;
        return v;
    }

    public boolean replace(K k2, V v, V v2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey < 0 || !x.n(v, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, v2);
        return true;
    }

    public V setValueAt(int i2, V v) {
        if (i2 < 0 || i2 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        Object[] objArr = this.array;
        int i3 = i2 + i2 + 1;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i3);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i3);
            if (vValueAt != sb) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i2) {
        if (i2 < 0 || i2 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was " + i2);
        }
        return (V) this.array[i2 + i2 + 1];
    }

    public SimpleArrayMap() {
        this(0, 1, null);
    }

    public V remove(K k2) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V replace(K k2, V v) {
        int iIndexOfKey = indexOfKey(k2);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v);
        }
        return null;
    }

    public /* synthetic */ SimpleArrayMap(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 0 : i2);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
