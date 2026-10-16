package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableDoubleList extends DoubleList {
    public /* synthetic */ MutableDoubleList(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 16 : i2);
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i2);
    }

    public final void add(int i2, double d2) {
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i3 = this._size;
        if (i2 != i3) {
            c.ap(dArr, dArr, i2 + 1, i2, i3);
        }
        dArr[i2] = d2;
        this._size++;
    }

    public final boolean addAll(int i2, DoubleList doubleList) {
        x.f(doubleList, "elements");
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i3 = doubleList._size;
        if (i3 == 0) {
            return false;
        }
        ensureCapacity(this._size + i3);
        double[] dArr = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            c.ap(dArr, dArr, doubleList._size + i2, i2, i4);
        }
        c.ap(doubleList.content, dArr, i2, 0, doubleList._size);
        this._size += doubleList._size;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        double[] dArr = this.content;
        int length = dArr.length;
        if (length < i2) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, Math.max(i2, (length * 3) / 2));
            x.e(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(DoubleList doubleList) {
        x.f(doubleList, "elements");
        double[] dArr = doubleList.content;
        int i2 = doubleList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(dArr[i3]);
        }
    }

    public final void plusAssign(DoubleList doubleList) {
        x.f(doubleList, "elements");
        addAll(this._size, doubleList);
    }

    public final boolean remove(double d2) {
        int iIndexOf = indexOf(d2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(DoubleList doubleList) {
        x.f(doubleList, "elements");
        int i2 = this._size;
        int i3 = doubleList._size - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                remove(doubleList.get(i4));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i2 != this._size;
    }

    public final double removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d2 = dArr[i2];
        if (i2 != this._size - 1) {
            c.ap(dArr, dArr, i2, i2 + 1, this._size);
        }
        this._size--;
        return d2;
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
                double[] dArr = this.content;
                c.ap(dArr, dArr, i2, i3, i5);
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
    public final boolean retainAll(double[] r10) {
        /*
            r9 = this;
            java.lang.String r0 = "elements"
            h.g.b.x.f(r10, r0)
            int r0 = r9._size
            double[] r1 = r9.content
            r2 = r9
            androidx.collection.DoubleList r2 = (androidx.collection.DoubleList) r2
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableDoubleList.retainAll(double[]):boolean");
    }

    public final double set(int i2, double d2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d3 = dArr[i2];
        dArr[i2] = d2;
        return d3;
    }

    public final void sort() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        c.aF(this.content, i2);
    }

    public final void sortDescending() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        double[] dArr = this.content;
        x.f(dArr, "<this>");
        c.aF(dArr, i2);
        x.f(dArr, "<this>");
        c.c(0, i2, dArr.length);
        int i3 = i2 / 2;
        if (i3 != 0) {
            int i4 = i2 - 1;
            for (int i5 = 0; i5 < i3; i5++) {
                double d2 = dArr[i5];
                dArr[i5] = dArr[i4];
                dArr[i4] = d2;
                i4--;
            }
        }
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        double[] dArr = this.content;
        if (dArr.length > iMax) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, iMax);
            x.e(dArrCopyOf, "copyOf(...)");
            this.content = dArrCopyOf;
        }
    }

    public MutableDoubleList(int i2) {
        super(i2, null);
    }

    public MutableDoubleList() {
        this(0, 1, null);
    }

    public final void plusAssign(double d2) {
        add(d2);
    }

    public final void plusAssign(double[] dArr) {
        x.f(dArr, "elements");
        addAll(this._size, dArr);
    }

    public final void minusAssign(double d2) {
        remove(d2);
    }

    public final void minusAssign(double[] dArr) {
        x.f(dArr, "elements");
        for (double d2 : dArr) {
            remove(d2);
        }
    }

    public final void trim() {
        trim$default(this, 0, 1, null);
    }

    public final boolean removeAll(double[] dArr) {
        x.f(dArr, "elements");
        int i2 = this._size;
        for (double d2 : dArr) {
            remove(d2);
        }
        return i2 != this._size;
    }

    public final boolean add(double d2) {
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i2 = this._size;
        dArr[i2] = d2;
        this._size = i2 + 1;
        return true;
    }

    public final boolean retainAll(DoubleList doubleList) {
        x.f(doubleList, "elements");
        int i2 = this._size;
        double[] dArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!doubleList.contains(dArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean addAll(int i2, double[] dArr) {
        x.f(dArr, "elements");
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int length = dArr.length;
        if (length == 0) {
            return false;
        }
        ensureCapacity(this._size + length);
        double[] dArr2 = this.content;
        int i3 = this._size;
        if (i2 != i3) {
            c.ap(dArr2, dArr2, i2 + length, i2, i3);
        }
        c.ap(dArr, dArr2, i2, 0, length);
        this._size += length;
        return true;
    }

    public final boolean addAll(DoubleList doubleList) {
        x.f(doubleList, "elements");
        return addAll(this._size, doubleList);
    }

    public final boolean addAll(double[] dArr) {
        x.f(dArr, "elements");
        return addAll(this._size, dArr);
    }
}
