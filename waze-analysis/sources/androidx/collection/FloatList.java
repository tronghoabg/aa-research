package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class FloatList {
    public int _size;
    public float[] content;

    private FloatList(int i2) {
        this.content = i2 == 0 ? FloatSetKt.getEmptyFloatArray() : new float[i2];
    }

    public static /* synthetic */ int binarySearch$default(FloatList floatList, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = floatList._size;
        }
        return floatList.binarySearch(i2, i3, i4);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = floatList.content;
        int i4 = floatList._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            float f2 = fArr[i5];
            if (i5 != 0) {
                sb.append(charSequence);
            }
            if (i5 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append((CharSequence) lVar.invoke(Float.valueOf(f2)));
            i5++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final boolean any(l<? super Float, Boolean> lVar) {
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int binarySearch(int i2, int i3, int i4) {
        if (i3 < 0 || i3 >= i4 || i4 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            float f2 = this.content[i6];
            float f3 = i2;
            if (f2 < f3) {
                i3 = i6 + 1;
            } else {
                if (f2 <= f3) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final boolean contains(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (fArr[i3] == f2) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(FloatList floatList) {
        x.f(floatList, "elements");
        j jVarU = n.u(0, floatList._size);
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return true;
        }
        while (contains(floatList.get(iA))) {
            if (iA == iB) {
                return true;
            }
            iA++;
        }
        return false;
    }

    public final int count(l<? super Float, Boolean> lVar) {
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (lVar.invoke(Float.valueOf(fArr[i4])).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final float elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i2];
    }

    public final float elementAtOrElse(int i2, l<? super Integer, Float> lVar) {
        x.f(lVar, "defaultValue");
        return (i2 < 0 || i2 >= this._size) ? lVar.invoke(Integer.valueOf(i2)).floatValue() : this.content[i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof FloatList) {
            FloatList floatList = (FloatList) obj;
            int i2 = floatList._size;
            int i3 = this._size;
            if (i2 == i3) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                j jVarU = n.u(0, i3);
                int iA = jVarU.a();
                int iB = jVarU.b();
                if (iA > iB) {
                    return true;
                }
                while (fArr[iA] == fArr2[iA]) {
                    if (iA == iB) {
                        return true;
                    }
                    iA++;
                }
                return false;
            }
        }
        return false;
    }

    public final float first(l<? super Float, Boolean> lVar) {
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (lVar.invoke(Float.valueOf(f2)).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final <R> R fold(R r, p<? super R, ? super Float, ? extends R> pVar) {
        x.f(pVar, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r = pVar.invoke(r, Float.valueOf(fArr[i3]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, q<? super Integer, ? super R, ? super Float, ? extends R> qVar) {
        x.f(qVar, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            R r2 = r;
            r = qVar.invoke(Integer.valueOf(i3), r2, Float.valueOf(fArr[i3]));
        }
        return r;
    }

    public final <R> R foldRight(R r, p<? super Float, ? super R, ? extends R> pVar) {
        x.f(pVar, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = pVar.invoke(Float.valueOf(fArr[i2]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, q<? super Integer, ? super Float, ? super R, ? extends R> qVar) {
        x.f(qVar, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = qVar.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), r);
        }
    }

    public final void forEach(l<? super Float, ab> lVar) {
        x.f(lVar, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            lVar.invoke(Float.valueOf(fArr[i3]));
        }
    }

    public final void forEachIndexed(p<? super Integer, ? super Float, ab> pVar) {
        x.f(pVar, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            pVar.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i3]));
        }
    }

    public final void forEachReversed(l<? super Float, ab> lVar) {
        x.f(lVar, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                lVar.invoke(Float.valueOf(fArr[i2]));
            }
        }
    }

    public final void forEachReversedIndexed(p<? super Integer, ? super Float, ab> pVar) {
        x.f(pVar, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]));
            }
        }
    }

    public final float get(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i2];
    }

    public final j getIndices() {
        return n.u(0, this._size);
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.content;
        int i2 = this._size;
        int iFloatToIntBits = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iFloatToIntBits += Float.floatToIntBits(fArr[i3]) * 31;
        }
        return iFloatToIntBits;
    }

    public final int indexOf(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (f2 == fArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfFirst(l<? super Float, Boolean> lVar) {
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(l<? super Float, Boolean> lVar) {
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (lVar.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super Float, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            float f2 = fArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append(lVar.invoke(Float.valueOf(f2)));
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final float last(l<? super Float, Boolean> lVar) {
        float f2;
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
            f2 = fArr[i2];
        } while (!lVar.invoke(Float.valueOf(f2)).booleanValue());
        return f2;
    }

    public final int lastIndexOf(float f2) {
        float[] fArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (fArr[i2] == f2) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(l<? super Float, Boolean> lVar) {
        x.f(lVar, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                return false;
            }
        } while (!lVar.invoke(Float.valueOf(fArr[i2])).booleanValue());
        return true;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public /* synthetic */ FloatList(int i2, o oVar) {
        this(i2);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return this._size;
    }

    public final float last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final float first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final int binarySearch(int i2, int i3) {
        return binarySearch$default(this, i2, i3, 0, 4, null);
    }

    public final int binarySearch(int i2) {
        return binarySearch$default(this, i2, 0, 0, 6, null);
    }

    public final String joinToString(CharSequence charSequence) {
        x.f(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i2, null, 16, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            float f2 = fArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append(f2);
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, l<? super Float, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            float f2 = fArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Float.valueOf(f2)));
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, l<? super Float, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f2 = fArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Float.valueOf(f2)));
            i3++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, l<? super Float, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f2 = fArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Float.valueOf(f2)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, l<? super Float, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f2 = fArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Float.valueOf(f2)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(l<? super Float, ? extends CharSequence> lVar) {
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            float f2 = fArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) str);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Float.valueOf(f2)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return floatList.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }
}
