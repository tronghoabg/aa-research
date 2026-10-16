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
public abstract class DoubleList {
    public int _size;
    public double[] content;

    private DoubleList(int i2) {
        this.content = i2 == 0 ? DoubleSetKt.getEmptyDoubleArray() : new double[i2];
    }

    public static /* synthetic */ int binarySearch$default(DoubleList doubleList, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = doubleList._size;
        }
        return doubleList.binarySearch(i2, i3, i4);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
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
        double[] dArr = doubleList.content;
        int i4 = doubleList._size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            double d2 = dArr[i5];
            if (i5 != 0) {
                sb.append(charSequence);
            }
            if (i5 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append((CharSequence) lVar.invoke(Double.valueOf(d2)));
            i5++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final boolean any(l<? super Double, Boolean> lVar) {
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(Double.valueOf(dArr[i3])).booleanValue()) {
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
            double d2 = this.content[i6];
            double d3 = i2;
            if (d2 < d3) {
                i3 = i6 + 1;
            } else {
                if (d2 <= d3) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public final boolean contains(double d2) {
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (dArr[i3] == d2) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(DoubleList doubleList) {
        x.f(doubleList, "elements");
        j jVarU = n.u(0, doubleList._size);
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return true;
        }
        while (contains(doubleList.get(iA))) {
            if (iA == iB) {
                return true;
            }
            iA++;
        }
        return false;
    }

    public final int count(l<? super Double, Boolean> lVar) {
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (lVar.invoke(Double.valueOf(dArr[i4])).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final double elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[i2];
    }

    public final double elementAtOrElse(int i2, l<? super Integer, Double> lVar) {
        x.f(lVar, "defaultValue");
        return (i2 < 0 || i2 >= this._size) ? lVar.invoke(Integer.valueOf(i2)).doubleValue() : this.content[i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof DoubleList) {
            DoubleList doubleList = (DoubleList) obj;
            int i2 = doubleList._size;
            int i3 = this._size;
            if (i2 == i3) {
                double[] dArr = this.content;
                double[] dArr2 = doubleList.content;
                j jVarU = n.u(0, i3);
                int iA = jVarU.a();
                int iB = jVarU.b();
                if (iA > iB) {
                    return true;
                }
                while (dArr[iA] == dArr2[iA]) {
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

    public final double first(l<? super Double, Boolean> lVar) {
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            double d2 = dArr[i3];
            if (lVar.invoke(Double.valueOf(d2)).booleanValue()) {
                return d2;
            }
        }
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    public final <R> R fold(R r, p<? super R, ? super Double, ? extends R> pVar) {
        x.f(pVar, "operation");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r = pVar.invoke(r, Double.valueOf(dArr[i3]));
        }
        return r;
    }

    public final <R> R foldIndexed(R r, q<? super Integer, ? super R, ? super Double, ? extends R> qVar) {
        x.f(qVar, "operation");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            R r2 = r;
            r = qVar.invoke(Integer.valueOf(i3), r2, Double.valueOf(dArr[i3]));
        }
        return r;
    }

    public final <R> R foldRight(R r, p<? super Double, ? super R, ? extends R> pVar) {
        x.f(pVar, "operation");
        double[] dArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = pVar.invoke(Double.valueOf(dArr[i2]), r);
        }
    }

    public final <R> R foldRightIndexed(R r, q<? super Integer, ? super Double, ? super R, ? extends R> qVar) {
        x.f(qVar, "operation");
        double[] dArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = qVar.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]), r);
        }
    }

    public final void forEach(l<? super Double, ab> lVar) {
        x.f(lVar, "block");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            lVar.invoke(Double.valueOf(dArr[i3]));
        }
    }

    public final void forEachIndexed(p<? super Integer, ? super Double, ab> pVar) {
        x.f(pVar, "block");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            pVar.invoke(Integer.valueOf(i3), Double.valueOf(dArr[i3]));
        }
    }

    public final void forEachReversed(l<? super Double, ab> lVar) {
        x.f(lVar, "block");
        double[] dArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                lVar.invoke(Double.valueOf(dArr[i2]));
            }
        }
    }

    public final void forEachReversedIndexed(p<? super Integer, ? super Double, ab> pVar) {
        x.f(pVar, "block");
        double[] dArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(i2), Double.valueOf(dArr[i2]));
            }
        }
    }

    public final double get(int i2) {
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
        double[] dArr = this.content;
        int i2 = this._size;
        int iM = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iM += DoubleList$$ExternalSyntheticBackport0.m(dArr[i3]) * 31;
        }
        return iM;
    }

    public final int indexOf(double d2) {
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (d2 == dArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfFirst(l<? super Double, Boolean> lVar) {
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(Double.valueOf(dArr[i3])).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(l<? super Double, Boolean> lVar) {
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (lVar.invoke(Double.valueOf(dArr[i2])).booleanValue()) {
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super Double, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            double d2 = dArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append(lVar.invoke(Double.valueOf(d2)));
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final double last(l<? super Double, Boolean> lVar) {
        double d2;
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
            }
            d2 = dArr[i2];
        } while (!lVar.invoke(Double.valueOf(d2)).booleanValue());
        return d2;
    }

    public final int lastIndexOf(double d2) {
        double[] dArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (dArr[i2] == d2) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(l<? super Double, Boolean> lVar) {
        x.f(lVar, "predicate");
        double[] dArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                return false;
            }
        } while (!lVar.invoke(Double.valueOf(dArr[i2])).booleanValue());
        return true;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public /* synthetic */ DoubleList(int i2, o oVar) {
        this(i2);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return this._size;
    }

    public final double last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final double first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
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
        double[] dArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            double d2 = dArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            sb.append(d2);
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, l<? super Double, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            double d2 = dArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Double.valueOf(d2)));
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, l<? super Double, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            double d2 = dArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Double.valueOf(d2)));
            i3++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, l<? super Double, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            double d2 = dArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Double.valueOf(d2)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(CharSequence charSequence, l<? super Double, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            double d2 = dArr[i3];
            if (i3 != 0) {
                sb.append(charSequence);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Double.valueOf(d2)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public final String joinToString(l<? super Double, ? extends CharSequence> lVar) {
        x.f(lVar, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        double[] dArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            double d2 = dArr[i3];
            if (i3 != 0) {
                sb.append((CharSequence) str);
            }
            if (i3 == -1) {
                sb.append((CharSequence) str);
                break;
            }
            sb.append(lVar.invoke(Double.valueOf(d2)));
            i3++;
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return doubleList.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }
}
