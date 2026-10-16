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
public abstract class IntList {
    public int _size;
    public int[] content;

    private IntList(int i2) {
        this.content = i2 == 0 ? IntSetKt.getEmptyIntArray() : new int[i2];
    }

    public static /* synthetic */ int binarySearch$default(IntList intList, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = intList._size;
        }
        return intList.binarySearch(i2, i3, i4);
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
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
        int[] iArr = intList.content;
        int i4 = intList._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            int i6 = iArr[i5];
            if (i5 != 0) {
                sb.append(charSequence);
            }
            if (i5 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append((CharSequence) lVar.invoke(Integer.valueOf(i6)));
            i5++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final boolean any(l<? super Integer, Boolean> lVar) {
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
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
            int i7 = this.content[i6];
            if (i7 < i2) {
                i3 = i6 + 1;
            } else {
                if (i7 <= i2) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final boolean contains(int i2) {
        int[] iArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] == i2) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList intList) {
        x.f(intList, "elements");
        j jVarU = n.u(0, intList._size);
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return true;
        }
        while (contains(intList.get(iA))) {
            if (iA == iB) {
                return true;
            }
            iA++;
        }
        return false;
    }

    public final int count(l<? super Integer, Boolean> lVar) {
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (lVar.invoke(Integer.valueOf(iArr[i4])).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final int elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i2];
    }

    public final int elementAtOrElse(int i2, l<? super Integer, Integer> lVar) {
        x.f(lVar, "defaultValue");
        return (i2 < 0 || i2 >= this._size) ? lVar.invoke(Integer.valueOf(i2)).intValue() : this.content[i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntList) {
            IntList intList = (IntList) obj;
            int i2 = intList._size;
            int i3 = this._size;
            if (i2 == i3) {
                int[] iArr = this.content;
                int[] iArr2 = intList.content;
                j jVarU = n.u(0, i3);
                int iA = jVarU.a();
                int iB = jVarU.b();
                if (iA > iB) {
                    return true;
                }
                while (iArr[iA] == iArr2[iA]) {
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

    public final int first(l<? super Integer, Boolean> lVar) {
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (lVar.invoke(Integer.valueOf(i4)).booleanValue()) {
                return i4;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R fold(R r, p<? super R, ? super Integer, ? extends R> pVar) {
        x.f(pVar, "operation");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r = pVar.invoke(r, Integer.valueOf(iArr[i3]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, q<? super Integer, ? super R, ? super Integer, ? extends R> qVar) {
        x.f(qVar, "operation");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            R r2 = r;
            r = qVar.invoke(Integer.valueOf(i3), r2, Integer.valueOf(iArr[i3]));
        }
        return r;
    }

    public final <R> R foldRight(R r, p<? super Integer, ? super R, ? extends R> pVar) {
        x.f(pVar, "operation");
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = pVar.invoke(Integer.valueOf(iArr[i2]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, q<? super Integer, ? super Integer, ? super R, ? extends R> qVar) {
        x.f(qVar, "operation");
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = qVar.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]), r);
        }
    }

    public final void forEach(l<? super Integer, ab> lVar) {
        x.f(lVar, "block");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            lVar.invoke(Integer.valueOf(iArr[i3]));
        }
    }

    public final void forEachIndexed(p<? super Integer, ? super Integer, ab> pVar) {
        x.f(pVar, "block");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            pVar.invoke(Integer.valueOf(i3), Integer.valueOf(iArr[i3]));
        }
    }

    public final void forEachReversed(l<? super Integer, ab> lVar) {
        x.f(lVar, "block");
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                lVar.invoke(Integer.valueOf(iArr[i2]));
            }
        }
    }

    public final void forEachReversedIndexed(p<? super Integer, ? super Integer, ab> pVar) {
        x.f(pVar, "block");
        int[] iArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i2]));
            }
        }
    }

    public final int get(int i2) {
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
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4] * 31;
        }
        return i3;
    }

    public final int indexOf(int i2) {
        int[] iArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i2 == iArr[i4]) {
                return i4;
            }
        }
        return -1;
    }

    public final int indexOfFirst(l<? super Integer, Boolean> lVar) {
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(Integer.valueOf(iArr[i3])).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(l<? super Integer, Boolean> lVar) {
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (lVar.invoke(Integer.valueOf(iArr[i2])).booleanValue()) {
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super Integer, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = iArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append(lVar.invoke(Integer.valueOf(i5)));
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final int last(l<? super Integer, Boolean> lVar) {
        int i2;
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        int i3 = this._size;
        do {
            i3--;
            if (i3 < 0) {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
            i2 = iArr[i3];
        } while (!lVar.invoke(Integer.valueOf(i2)).booleanValue());
        return i2;
    }

    public final int lastIndexOf(int i2) {
        int[] iArr = this.content;
        for (int i3 = this._size - 1; i3 >= 0; i3--) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(l<? super Integer, Boolean> lVar) {
        x.f(lVar, "predicate");
        int[] iArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                return false;
            }
        } while (!lVar.invoke(Integer.valueOf(iArr[i2])).booleanValue());
        return true;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public /* synthetic */ IntList(int i2, o oVar) {
        this(i2);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return this._size;
    }

    public final int binarySearch(int i2, int i3) {
        return binarySearch$default(this, i2, i3, 0, 4, null);
    }

    public final int last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int binarySearch(int i2) {
        return binarySearch$default(this, i2, 0, 0, 6, null);
    }

    public final int first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("IntList is empty.");
        }
        return this.content[0];
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
        int[] iArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = iArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append(i5);
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, l<? super Integer, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i5 = iArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Integer.valueOf(i5)));
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, l<? super Integer, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = iArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Integer.valueOf(i4)));
            i3++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, l<? super Integer, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = iArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Integer.valueOf(i4)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, l<? super Integer, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = iArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Integer.valueOf(i4)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(l<? super Integer, ? extends CharSequence> lVar) {
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int[] iArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = iArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) str);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Integer.valueOf(i4)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return intList.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }
}
