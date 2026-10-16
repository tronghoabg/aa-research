package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public /* synthetic */ MutableFloatList(int i2, int i3, o oVar) {
        this(1 == (i3 & 1) ? 16 : i2);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = mutableFloatList._size;
        }
        mutableFloatList.trim(i2);
    }

    public final void add(int i2, float f2) {
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i3 = this._size;
        if (i2 != i3) {
            c.aq(fArr, fArr, i2 + 1, i2, i3);
        }
        fArr[i2] = f2;
        this._size++;
    }

    public final boolean addAll(int i2, FloatList floatList) {
        x.f(floatList, "elements");
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i3 = floatList._size;
        if (i3 == 0) {
            return false;
        }
        ensureCapacity(this._size + i3);
        float[] fArr = this.content;
        int i4 = this._size;
        if (i2 != i4) {
            c.aq(fArr, fArr, floatList._size + i2, i2, i4);
        }
        c.aq(floatList.content, fArr, i2, 0, floatList._size);
        this._size += floatList._size;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i2) {
        float[] fArr = this.content;
        int length = fArr.length;
        if (length < i2) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i2, (length * 3) / 2));
            x.e(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(FloatList floatList) {
        x.f(floatList, "elements");
        float[] fArr = floatList.content;
        int i2 = floatList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(fArr[i3]);
        }
    }

    public final void plusAssign(FloatList floatList) {
        x.f(floatList, "elements");
        addAll(this._size, floatList);
    }

    public final boolean remove(float f2) {
        int iIndexOf = indexOf(f2);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final boolean removeAll(FloatList floatList) {
        x.f(floatList, "elements");
        int i2 = this._size;
        int i3 = floatList._size - 1;
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                remove(floatList.get(i4));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return i2 != this._size;
    }

    public final float removeAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f2 = fArr[i2];
        if (i2 != this._size - 1) {
            c.aq(fArr, fArr, i2, i2 + 1, this._size);
        }
        this._size--;
        return f2;
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
                float[] fArr = this.content;
                c.aq(fArr, fArr, i2, i3, i5);
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
    public final boolean retainAll(float[] r8) {
        /*
            r7 = this;
            java.lang.String r0 = "elements"
            h.g.b.x.f(r8, r0)
            int r0 = r7._size
            float[] r1 = r7.content
            r2 = r7
            androidx.collection.FloatList r2 = (androidx.collection.FloatList) r2
            int r2 = r2._size
        Le:
            int r2 = r2 + (-1)
            r3 = 0
            if (r2 < 0) goto L28
            r4 = r1[r2]
            int r5 = r8.length
        L16:
            if (r3 >= r5) goto L24
            r6 = r8[r3]
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L21
            if (r3 >= 0) goto Le
            goto L24
        L21:
            int r3 = r3 + 1
            goto L16
        L24:
            r7.removeAt(r2)
            goto Le
        L28:
            int r7 = r7._size
            if (r0 == r7) goto L2e
            r7 = 1
            return r7
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatList.retainAll(float[]):boolean");
    }

    public final float set(int i2, float f2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }

    public final void sort() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        c.aG(this.content, i2);
    }

    public final void sortDescending() {
        int i2 = this._size;
        if (i2 == 0) {
            return;
        }
        float[] fArr = this.content;
        x.f(fArr, "<this>");
        c.aG(fArr, i2);
        x.f(fArr, "<this>");
        c.c(0, i2, fArr.length);
        int i3 = i2 / 2;
        if (i3 != 0) {
            int i4 = i2 - 1;
            for (int i5 = 0; i5 < i3; i5++) {
                float f2 = fArr[i5];
                fArr[i5] = fArr[i4];
                fArr[i4] = f2;
                i4--;
            }
        }
    }

    public final void trim(int i2) {
        int iMax = Math.max(i2, this._size);
        float[] fArr = this.content;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            x.e(fArrCopyOf, "copyOf(...)");
            this.content = fArrCopyOf;
        }
    }

    public MutableFloatList(int i2) {
        super(i2, null);
    }

    public MutableFloatList() {
        this(0, 1, null);
    }

    public final void plusAssign(float f2) {
        add(f2);
    }

    public final void plusAssign(float[] fArr) {
        x.f(fArr, "elements");
        addAll(this._size, fArr);
    }

    public final void minusAssign(float f2) {
        remove(f2);
    }

    public final void minusAssign(float[] fArr) {
        x.f(fArr, "elements");
        for (float f2 : fArr) {
            remove(f2);
        }
    }

    public final void trim() {
        trim$default(this, 0, 1, null);
    }

    public final boolean removeAll(float[] fArr) {
        x.f(fArr, "elements");
        int i2 = this._size;
        for (float f2 : fArr) {
            remove(f2);
        }
        return i2 != this._size;
    }

    public final boolean add(float f2) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i2 = this._size;
        fArr[i2] = f2;
        this._size = i2 + 1;
        return true;
    }

    public final boolean retainAll(FloatList floatList) {
        x.f(floatList, "elements");
        int i2 = this._size;
        float[] fArr = this.content;
        int i3 = this._size;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            if (!floatList.contains(fArr[i3])) {
                removeAt(i3);
            }
        }
        return i2 != this._size;
    }

    public final boolean addAll(int i2, float[] fArr) {
        x.f(fArr, "elements");
        if (i2 < 0 || i2 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int length = fArr.length;
        if (length == 0) {
            return false;
        }
        ensureCapacity(this._size + length);
        float[] fArr2 = this.content;
        int i3 = this._size;
        if (i2 != i3) {
            c.aq(fArr2, fArr2, i2 + length, i2, i3);
        }
        c.aK(fArr, fArr2, i2, 0, 12);
        this._size += length;
        return true;
    }

    public final boolean addAll(FloatList floatList) {
        x.f(floatList, "elements");
        return addAll(this._size, floatList);
    }

    public final boolean addAll(float[] fArr) {
        x.f(fArr, "elements");
        return addAll(this._size, fArr);
    }
}
