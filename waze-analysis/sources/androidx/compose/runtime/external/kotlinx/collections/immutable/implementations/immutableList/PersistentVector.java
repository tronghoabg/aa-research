package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import h.a.c;
import h.g.a.l;
import h.g.b.x;
import j$.util.List;
import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E>, List<E> {
    public static final int $stable = 8;
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    public PersistentVector(Object[] objArr, Object[] objArr2, int i2, int i3) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i2;
        this.rootShift = i3;
        if (size() <= 32) {
            PreconditionsKt.throwIllegalArgumentException("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        size();
        size();
        int length = objArr2.length;
    }

    private final Object[] bufferFor(int i2) {
        if (rootSize() <= i2) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i3 = this.rootShift; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i2, i3)];
            x.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                x.e(objArrCopyOf, "copyOf(...)");
            }
            c.at(objArr, objArrCopyOf, iIndexSegment + 1, iIndexSegment, 31);
            objectRef.setValue(objArr[31]);
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        x.e(objArrCopyOf2, "copyOf(...)");
        int i4 = i2 - 5;
        Object obj2 = objArr[iIndexSegment];
        x.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = insertIntoRoot((Object[]) obj2, i4, i3, obj, objectRef);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || objArrCopyOf2[iIndexSegment] == null) {
                break;
            }
            Object obj3 = objArr[iIndexSegment];
            x.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iIndexSegment] = insertIntoRoot((Object[]) obj3, i4, 0, objectRef.getValue(), objectRef);
        }
        return objArrCopyOf2;
    }

    private final PersistentVector<E> insertIntoTail(Object[] objArr, int i2, Object obj) {
        int size = size() - rootSize();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        x.e(objArrCopyOf, "copyOf(...)");
        int i3 = i2 + 1;
        Object[] objArr2 = this.tail;
        if (size < 32) {
            c.at(objArr2, objArrCopyOf, i3, i2, size);
            objArrCopyOf[i2] = obj;
            return new PersistentVector<>(objArr, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object obj2 = objArr2[31];
        c.at(objArr2, objArrCopyOf, i3, i2, size - 1);
        objArrCopyOf[i2] = obj;
        return pushFilledTail(objArr, objArrCopyOf, UtilsKt.presizedBufferWith(obj2));
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 5) {
            objectRef.setValue(objArr[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = objArr[iIndexSegment];
            x.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, i2 - 5, i3, objectRef);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iIndexSegment] = objArrPullLastBuffer;
        return objArrCopyOf;
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                x.e(objArr, "copyOf(...)");
            }
            return new SmallPersistentVector(objArr);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i3, i2 - 1, objectRef);
        x.c(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        x.d(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        if (objArrPullLastBuffer[1] != null) {
            return new PersistentVector(objArrPullLastBuffer, objArr2, i2, i3);
        }
        Object obj = objArrPullLastBuffer[0];
        x.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new PersistentVector((Object[]) obj, objArr2, i2, i3 - 5);
    }

    private final PersistentVector<E> pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size <= (1 << i2)) {
            return new PersistentVector<>(pushTail(objArr, i2, objArr2), objArr3, size() + 1, this.rootShift);
        }
        Object[] objArrPresizedBufferWith = UtilsKt.presizedBufferWith(objArr);
        int i3 = this.rootShift + 5;
        return new PersistentVector<>(pushTail(objArrPresizedBufferWith, i3, objArr2), objArr3, size() + 1, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            r1 = 32
            if (r4 == 0) goto L15
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(...)"
            h.g.b.x.e(r4, r2)
            if (r4 != 0) goto L17
        L15:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L17:
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(r0, r5)
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            return r4
        L21:
            r1 = r4[r0]
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r5 = r5 + (-5)
            java.lang.Object[] r3 = r3.pushTail(r1, r5, r6)
            r4[r0] = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector.pushTail(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            if (iIndexSegment == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                x.e(objArrCopyOf, "copyOf(...)");
            }
            c.at(objArr, objArrCopyOf, iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyOf[31] = objectRef.getValue();
            objectRef.setValue(objArr[iIndexSegment]);
            return objArrCopyOf;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i2) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        x.e(objArrCopyOf2, "copyOf(...)");
        int i4 = i2 - 5;
        int i5 = iIndexSegment + 1;
        if (i5 <= iIndexSegment2) {
            while (true) {
                Object obj = objArrCopyOf2[iIndexSegment2];
                x.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iIndexSegment2] = removeFromRootAt((Object[]) obj, i4, 0, objectRef);
                if (iIndexSegment2 == i5) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIndexSegment];
        x.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iIndexSegment] = removeFromRootAt((Object[]) obj2, i4, i3, objectRef);
        return objArrCopyOf2;
    }

    private final PersistentList<E> removeFromTailAt(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        if (size == 1) {
            return pullLastBufferFromRoot(objArr, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        x.e(objArrCopyOf, "copyOf(...)");
        int i5 = size - 1;
        if (i4 < i5) {
            c.at(this.tail, objArrCopyOf, i4, i4 + 1, size);
        }
        objArrCopyOf[i5] = null;
        return new PersistentVector(objArr, objArrCopyOf, (i2 + size) - 1, i3);
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i2, int i3, Object obj) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        x.e(objArrCopyOf, "copyOf(...)");
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 == 0) {
            objArrCopyOf[iIndexSegment] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iIndexSegment];
        x.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iIndexSegment] = setInRoot((Object[]) obj2, i2 - 5, i3, obj);
        return objArrCopyOf;
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        if (i2 == size()) {
            return add((PersistentVector<E>) e2);
        }
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            return insertIntoTail(this.root, i2 - iRootSize, e2);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, i2, e2, objectRef), 0, objectRef.getValue());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // h.a.g, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        return (E) bufferFor(i2)[i2 & 31];
    }

    @Override // h.a.g, h.a.a
    public int getSize() {
        return this.size;
    }

    @Override // h.a.g, java.util.List
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        int i3 = this.rootShift / 5;
        return new PersistentVectorIterator(this.root, this.tail, i2, size(), i3 + 1);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(l<? super E, Boolean> lVar) {
        PersistentVectorBuilder<E> persistentVectorBuilderBuilder = builder();
        persistentVectorBuilderBuilder.removeAllWithPredicate(lVar);
        return persistentVectorBuilderBuilder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        int iRootSize = rootSize();
        Object[] objArr = this.root;
        return i2 >= iRootSize ? removeFromTailAt(objArr, iRootSize, this.rootShift, i2 - iRootSize) : removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i2, new ObjectRef(this.tail[0])), iRootSize, this.rootShift, 0);
    }

    @Override // h.a.g, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        if (rootSize() > i2) {
            return new PersistentVector(setInRoot(this.root, this.rootShift, i2, e2), this.tail, size(), this.rootShift);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2 & 31] = e2;
        return new PersistentVector(this.root, objArrCopyOf, size(), this.rootShift);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((PersistentVector<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e2) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            x.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[size] = e2;
            return new PersistentVector(this.root, objArrCopyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(e2));
    }
}
