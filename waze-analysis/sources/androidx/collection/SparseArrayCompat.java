package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat(int i2) {
        if (i2 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i2);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    public void append(int i2, E e2) {
        int i3 = this.size;
        if (i3 != 0 && i2 <= this.keys[i3 - 1]) {
            put(i2, e2);
            return;
        }
        if (this.garbage && i3 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i4 = this.size;
        int[] iArr = this.keys;
        if (i4 >= iArr.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iIdealIntArraySize);
            x.e(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            x.e(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i4] = i2;
        this.values[i4] = e2;
        this.size = i4 + 1;
    }

    public void clear() {
        int i2 = this.size;
        Object[] objArr = this.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m1697clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        x.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public boolean containsKey(int i2) {
        return indexOfKey(i2) >= 0;
    }

    public boolean containsValue(E e2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i2 = this.size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (this.values[i3] != e2) {
                i3++;
            } else if (i3 >= 0) {
                return true;
            }
        }
        return false;
    }

    public void delete(int i2) {
        remove(i2);
    }

    public E get(int i2) {
        return (E) SparseArrayCompatKt.commonGet(this, i2);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
    }

    public int indexOfValue(E e2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.values[i3] == e2) {
                return i3;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        if (i2 >= this.size || i2 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.keys[i2];
    }

    public void put(int i2, E e2) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = e2;
            return;
        }
        int i3 = ~iBinarySearch;
        int i4 = this.size;
        if (i3 < i4) {
            Object[] objArr = this.values;
            if (objArr[i3] == SparseArrayCompatKt.DELETED) {
                this.keys[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.garbage && i4 >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
        }
        int i5 = this.size;
        int[] iArr = this.keys;
        if (i5 >= iArr.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i5 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iIdealIntArraySize);
            x.e(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            x.e(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i6 = this.size;
        if (i6 - i3 != 0) {
            int[] iArr2 = this.keys;
            int i7 = i3 + 1;
            c.ar(iArr2, iArr2, i7, i3, i6);
            Object[] objArr2 = this.values;
            c.at(objArr2, objArr2, i7, i3, this.size);
        }
        this.keys[i3] = i2;
        this.values[i3] = e2;
        this.size++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putAll(androidx.collection.SparseArrayCompat<? extends E> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            h.g.b.x.f(r10, r0)
            int r0 = r10.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L97
            int r2 = r10.keyAt(r1)
            java.lang.Object r3 = r10.valueAt(r1)
            int[] r4 = r9.keys
            int r5 = r9.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            if (r4 < 0) goto L23
            java.lang.Object[] r2 = r9.values
            r2[r4] = r3
            goto L93
        L23:
            int r4 = ~r4
            int r5 = r9.size
            if (r4 >= r5) goto L39
            java.lang.Object[] r6 = r9.values
            r7 = r6[r4]
            java.lang.Object r8 = androidx.collection.SparseArrayCompatKt.access$getDELETED$p()
            if (r7 != r8) goto L39
            int[] r5 = r9.keys
            r5[r4] = r2
            r6[r4] = r3
            goto L93
        L39:
            boolean r6 = r9.garbage
            if (r6 == 0) goto L4e
            int[] r6 = r9.keys
            int r6 = r6.length
            if (r5 < r6) goto L4e
            androidx.collection.SparseArrayCompatKt.access$gc(r9)
            int[] r4 = r9.keys
            int r5 = r9.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            int r4 = ~r4
        L4e:
            int r5 = r9.size
            int[] r6 = r9.keys
            int r7 = r6.length
            if (r5 < r7) goto L71
            int r5 = r5 + 1
            int r5 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r5)
            int[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "copyOf(...)"
            h.g.b.x.e(r6, r7)
            r9.keys = r6
            java.lang.Object[] r6 = r9.values
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            h.g.b.x.e(r5, r7)
            r9.values = r5
        L71:
            int r5 = r9.size
            int r6 = r5 - r4
            if (r6 == 0) goto L85
            int[] r6 = r9.keys
            int r7 = r4 + 1
            h.a.c.ar(r6, r6, r7, r4, r5)
            java.lang.Object[] r5 = r9.values
            int r6 = r9.size
            h.a.c.at(r5, r5, r7, r4, r6)
        L85:
            int[] r5 = r9.keys
            r5[r4] = r2
            java.lang.Object[] r2 = r9.values
            r2[r4] = r3
            int r2 = r9.size
            int r2 = r2 + 1
            r9.size = r2
        L93:
            int r1 = r1 + 1
            goto La
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SparseArrayCompat.putAll(androidx.collection.SparseArrayCompat):void");
    }

    public E putIfAbsent(int i2, E e2) {
        E e3 = (E) SparseArrayCompatKt.commonGet(this, i2);
        if (e3 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = e2;
                return e3;
            }
            int i3 = ~iBinarySearch;
            int i4 = this.size;
            if (i3 < i4) {
                Object[] objArr = this.values;
                if (objArr[i3] == SparseArrayCompatKt.DELETED) {
                    this.keys[i3] = i2;
                    objArr[i3] = e2;
                    return e3;
                }
            }
            if (this.garbage && i4 >= this.keys.length) {
                SparseArrayCompatKt.gc(this);
                i3 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, i2);
            }
            int i5 = this.size;
            int[] iArr = this.keys;
            if (i5 >= iArr.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i5 + 1);
                int[] iArrCopyOf = Arrays.copyOf(iArr, iIdealIntArraySize);
                x.e(iArrCopyOf, "copyOf(...)");
                this.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                x.e(objArrCopyOf, "copyOf(...)");
                this.values = objArrCopyOf;
            }
            int i6 = this.size;
            if (i6 - i3 != 0) {
                int[] iArr2 = this.keys;
                int i7 = i3 + 1;
                c.ar(iArr2, iArr2, i7, i3, i6);
                Object[] objArr2 = this.values;
                c.at(objArr2, objArr2, i7, i3, this.size);
            }
            this.keys[i3] = i2;
            this.values[i3] = e2;
            this.size++;
        }
        return e3;
    }

    public boolean remove(int i2, Object obj) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0 || !x.n(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public void removeAt(int i2) {
        Object[] objArr = this.values;
        if (objArr[i2] != SparseArrayCompatKt.DELETED) {
            objArr[i2] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int i2, int i3) {
        int iMin = Math.min(i3, i2 + i3);
        while (i2 < iMin) {
            removeAt(i2);
            i2++;
        }
    }

    public boolean replace(int i2, E e2, E e3) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0 || !x.n(this.values[iIndexOfKey], e2)) {
            return false;
        }
        this.values[iIndexOfKey] = e3;
        return true;
    }

    public void setValueAt(int i2, E e2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[i2] = e2;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i3));
            sb.append('=');
            E eValueAt = valueAt(i3);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public E valueAt(int i2) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        if (i2 >= this.size || i2 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) this.values[i2];
    }

    public E get(int i2, E e2) {
        return (E) SparseArrayCompatKt.commonGet(this, i2, e2);
    }

    public void remove(int i2) {
        SparseArrayCompatKt.commonRemove(this, i2);
    }

    public E replace(int i2, E e2) {
        int iIndexOfKey = indexOfKey(i2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e3 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e2;
        return e3;
    }

    public SparseArrayCompat() {
        this(0, 1, null);
    }

    public /* synthetic */ SparseArrayCompat(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 10 : i2);
    }
}
