package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public /* synthetic */ MutableLongList(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 16 : i2);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableLongList._size;
        }
        mutableLongList.trim(i2);
    }

    public final void add(int i2, long j2) {
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i3 = this._size;
        if (i2 != i3) {
            c.as(jArr, jArr, i2 + 1, i2, i3);
        }
        jArr[i2] = j2;
        this._size++;
    }

    public final boolean addAll(int i2, LongList longList) {
        x.f(longList, "elements");
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i3 = longList._size;
        if (i3 == 0) {
            return false;
        }
        ensureCapacity(this._size + i3);
        long[] jArr = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            c.as(jArr, jArr, longList._size + i2, i2, i4);
        }
        c.as(longList.content, jArr, i2, 0, longList._size);
        this._size += longList._size;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        long[] jArr = this.content;
        int length = jArr.length;
        if (length < i2) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i2, (length * 3) / 2));
            x.e(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(LongList longList) {
        x.f(longList, "elements");
        long[] jArr = longList.content;
        int i2 = longList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(jArr[i3]);
        }
    }

    public final void plusAssign(LongList longList) {
        x.f(longList, "elements");
        addAll(this._size, longList);
    }

    public final boolean remove(long j2) {
        int iIndexOf = indexOf(j2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(LongList longList) {
        x.f(longList, "elements");
        int i2 = this._size;
        int i3 = longList._size - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                remove(longList.get(i4));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i2 != this._size;
    }

    public final long removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j2 = jArr[i2];
        if (i2 != this._size - 1) {
            c.as(jArr, jArr, i2, i2 + 1, this._size);
        }
        this._size--;
        return j2;
    }

    public final void removeRange(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > (i4 = this._size) || i3 < 0 || i3 > i4) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i3 < i2) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (i3 != i2) {
            int i5 = this._size;
            if (i3 < i5) {
                long[] jArr = this.content;
                c.as(jArr, jArr, i2, i3, i5);
            }
            this._size -= i3 - i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        removeAt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(long[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "elements"
            h.g.b.x.f(r10, r0)
            int r0 = r9._size
            long[] r1 = r9.content
            r2 = r9
            androidx.collection.LongList r2 = (androidx.collection.LongList) r2
            int r2 = r2._size
        Le:
            int r2 = r2 + (-1)
            r3 = 0
            if (r2 < 0) goto L28
            r4 = r1[r2]
            int r6 = r10.length
        L16:
            if (r3 >= r6) goto L24
            r7 = r10[r3]
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L21
            if (r3 >= 0) goto Le
            goto L24
        L21:
            int r3 = r3 + 1
            goto L16
        L24:
            r9.removeAt(r2)
            goto Le
        L28:
            int r9 = r9._size
            if (r0 == r9) goto L2e
            r9 = 1
            return r9
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongList.retainAll(long[]):boolean");
    }

    public final long set(int i2, long j2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    public final void sort() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        c.aI(this.content, i2);
    }

    public final void sortDescending() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        long[] jArr = this.content;
        x.f(jArr, "<this>");
        c.aI(jArr, i2);
        x.f(jArr, "<this>");
        c.c(0, i2, jArr.length);
        int i3 = i2 / 2;
        if (i3 != 0) {
            int i4 = i2 - 1;
            for (int i5 = 0; i5 < i3; i5++) {
                long j2 = jArr[i5];
                jArr[i5] = jArr[i4];
                jArr[i4] = j2;
                i4--;
            }
        }
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        long[] jArr = this.content;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            x.e(jArrCopyOf, "copyOf(...)");
            this.content = jArrCopyOf;
        }
    }

    public MutableLongList(int i2) {
        super(i2, null);
    }

    public MutableLongList() {
        this(0, 1, null);
    }

    public final void plusAssign(long j2) {
        add(j2);
    }

    public final void plusAssign(long[] jArr) {
        x.f(jArr, "elements");
        addAll(this._size, jArr);
    }

    public final void minusAssign(long j2) {
        remove(j2);
    }

    public final void minusAssign(long[] jArr) {
        x.f(jArr, "elements");
        for (long j2 : jArr) {
            remove(j2);
        }
    }

    public final void trim() {
        trim$default(this, 0, 1, null);
    }

    public final boolean removeAll(long[] jArr) {
        x.f(jArr, "elements");
        int i2 = this._size;
        for (long j2 : jArr) {
            remove(j2);
        }
        return i2 != this._size;
    }

    public final boolean add(long j2) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i2 = this._size;
        jArr[i2] = j2;
        this._size = i2 + 1;
        return true;
    }

    public final boolean retainAll(LongList longList) {
        x.f(longList, "elements");
        int i2 = this._size;
        long[] jArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!longList.contains(jArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean addAll(int i2, long[] jArr) {
        x.f(jArr, "elements");
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int length = jArr.length;
        if (length == 0) {
            return false;
        }
        ensureCapacity(this._size + length);
        long[] jArr2 = this.content;
        int i3 = this._size;
        if (i2 != i3) {
            c.as(jArr2, jArr2, i2 + length, i2, i3);
        }
        c.av(jArr, jArr2, i2);
        this._size += length;
        return true;
    }

    public final boolean addAll(LongList longList) {
        x.f(longList, "elements");
        return addAll(this._size, longList);
    }

    public final boolean addAll(long[] jArr) {
        x.f(jArr, "elements");
        return addAll(this._size, jArr);
    }
}
