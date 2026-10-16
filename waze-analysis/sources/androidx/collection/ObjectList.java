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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    private ObjectList(int i2) {
        this.content = i2 == 0 ? ObjectListKt.EmptyArray : new Object[i2];
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
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
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return objectList.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence5, lVar2);
    }

    static final CharSequence toString$lambda$0(ObjectList objectList, Object obj) {
        return obj == objectList ? "(this)" : String.valueOf(obj);
    }

    public final boolean any(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(objArr[i3]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public abstract List<E> asList();

    public final boolean contains(E e2) {
        return indexOf(e2) >= 0;
    }

    public final boolean containsAll(List<? extends E> list) {
        x.f(list, "elements");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!contains(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final int count(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (lVar.invoke(objArr[i4]).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final E elementAt(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i2);
        }
        return (E) this.content[i2];
    }

    public final E elementAtOrElse(int i2, l<? super Integer, ? extends E> lVar) {
        x.f(lVar, "defaultValue");
        return (i2 < 0 || i2 >= this._size) ? lVar.invoke(Integer.valueOf(i2)) : (E) this.content[i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i2 = objectList._size;
            int i3 = this._size;
            if (i2 == i3) {
                Object[] objArr = this.content;
                Object[] objArr2 = objectList.content;
                j jVarU = n.u(0, i3);
                int iA = jVarU.a();
                int iB = jVarU.b();
                if (iA > iB) {
                    return true;
                }
                while (x.n(objArr[iA], objArr2[iA])) {
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

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E first(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            ?? r2 = (Object) objArr[i3];
            if (lVar.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [E, java.lang.Object] */
    public final E firstOrNull(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            ?? r2 = (Object) objArr[i3];
            if (lVar.invoke(r2).booleanValue()) {
                return r2;
            }
        }
        return null;
    }

    public final <R> R fold(R r, p<? super R, ? super E, ? extends R> pVar) {
        x.f(pVar, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r = pVar.invoke(r, objArr[i3]);
        }
        return r;
    }

    public final <R> R foldIndexed(R r, q<? super Integer, ? super R, ? super E, ? extends R> qVar) {
        x.f(qVar, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r = qVar.invoke(Integer.valueOf(i3), r, objArr[i3]);
        }
        return r;
    }

    public final <R> R foldRight(R r, p<? super E, ? super R, ? extends R> pVar) {
        x.f(pVar, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = pVar.invoke(objArr[i2], r);
        }
    }

    public final <R> R foldRightIndexed(R r, q<? super Integer, ? super E, ? super R, ? extends R> qVar) {
        x.f(qVar, "operation");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return r;
            }
            r = qVar.invoke(Integer.valueOf(i2), objArr[i2], r);
        }
    }

    public final void forEach(l<? super E, ab> lVar) {
        x.f(lVar, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            lVar.invoke(objArr[i3]);
        }
    }

    public final void forEachIndexed(p<? super Integer, ? super E, ab> pVar) {
        x.f(pVar, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            pVar.invoke(Integer.valueOf(i3), objArr[i3]);
        }
    }

    public final void forEachReversed(l<? super E, ab> lVar) {
        x.f(lVar, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                lVar.invoke(objArr[i2]);
            }
        }
    }

    public final void forEachReversedIndexed(p<? super Integer, ? super E, ab> pVar) {
        x.f(pVar, "block");
        Object[] objArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(i2), objArr[i2]);
            }
        }
    }

    public final E get(int i2) {
        if (i2 < 0 || i2 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i2);
        }
        return (E) this.content[i2];
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
        Object[] objArr = this.content;
        int i2 = this._size;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(E e2) {
        Object[] objArr = this.content;
        int i2 = 0;
        int i3 = this._size;
        if (e2 == null) {
            while (i2 < i3) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < i3) {
            if (e2.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int indexOfFirst(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (lVar.invoke(objArr[i3]).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (lVar.invoke(objArr[i2]).booleanValue()) {
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

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super E, ? extends CharSequence> lVar) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        Object[] objArr = this.content;
        int i3 = this._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            Object obj = objArr[i4];
            if (i4 != 0) {
                sb.append(charSequence);
            }
            if (i4 == i2) {
                sb.append(charSequence4);
                break;
            }
            if (lVar == null) {
                sb.append(obj);
            } else {
                sb.append(lVar.invoke(obj));
            }
            i4++;
        }
        sb.append(charSequence3);
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E last(l<? super E, Boolean> lVar) {
        ?? r1;
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
            r1 = (Object) objArr[i2];
        } while (!lVar.invoke(r1).booleanValue());
        return r1;
    }

    public final int lastIndexOf(E e2) {
        Object[] objArr = this.content;
        int i2 = this._size - 1;
        if (e2 == null) {
            while (i2 >= 0) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2--;
            }
        } else {
            while (i2 >= 0) {
                if (e2.equals(objArr[i2])) {
                    return i2;
                }
                i2--;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E lastOrNull(l<? super E, Boolean> lVar) {
        ?? r1;
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
            r1 = (Object) objArr[i2];
        } while (!lVar.invoke(r1).booleanValue());
        return r1;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(l<? super E, Boolean> lVar) {
        x.f(lVar, "predicate");
        Object[] objArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (i2 < 0) {
                return false;
            }
        } while (!lVar.invoke(objArr[i2]).booleanValue());
        return true;
    }

    public final void throwIndexOutOfBoundsExclusiveException$collection(int i2) {
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i2 + " must be in 0.." + (this._size - 1));
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new l() { // from class: androidx.collection.ObjectList$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ObjectList.toString$lambda$0(this.f$0, obj);
            }
        }, 25, null);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public /* synthetic */ ObjectList(int i2, o oVar) {
        this(i2);
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean containsAll(Iterable<? extends E> iterable) {
        x.f(iterable, "elements");
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final int count() {
        return this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(ObjectList<E> objectList) {
        x.f(objectList, "elements");
        Object[] objArr = objectList.content;
        int i2 = objectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (!contains(objArr[i3])) {
                return false;
            }
        }
        return true;
    }

    public final E last() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[this._size - 1];
    }

    public final boolean containsAll(E[] eArr) {
        x.f(eArr, "elements");
        for (E e2 : eArr) {
            if (!contains(e2)) {
                return false;
            }
        }
        return true;
    }

    public final E first() {
        if (isEmpty()) {
            RuntimeHelpersKt.throwNoSuchElementException("ObjectList is empty.");
        }
        return (E) this.content[0];
    }

    public final String joinToString(CharSequence charSequence) {
        x.f(charSequence, "separator");
        return joinToString$default(this, charSequence, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i2, null, null, 48, null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4) {
        x.f(charSequence, "separator");
        x.f(charSequence2, "prefix");
        x.f(charSequence3, "postfix");
        x.f(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i2, charSequence4, null, 32, null);
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }
}
