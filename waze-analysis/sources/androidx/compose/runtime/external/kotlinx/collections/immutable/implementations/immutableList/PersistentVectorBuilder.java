package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import h.a.c;
import h.a.o;
import h.g.a.l;
import h.g.b.x;
import h.k.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PersistentVectorBuilder<E> extends o<E> implements PersistentList.Builder<E> {
    public static final int $stable = 8;
    private MutabilityOwnership ownership = new MutabilityOwnership();
    private Object[] root;
    private int rootShift;
    private int size;
    private Object[] tail;
    private PersistentList<? extends E> vector;
    private Object[] vectorRoot;
    private Object[] vectorTail;

    public PersistentVectorBuilder(PersistentList<? extends E> persistentList, Object[] objArr, Object[] objArr2, int i2) {
        this.vector = persistentList;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i2;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] bufferFor(int i2) {
        if (rootSize() <= i2) {
            return this.tail;
        }
        Object[] objArr = this.root;
        x.c(objArr);
        for (int i3 = this.rootShift; i3 > 0; i3 -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(i2, i3)];
            x.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] copyToBuffer(Object[] objArr, int i2, Iterator<? extends Object> it) {
        while (i2 < 32 && it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return objArr;
    }

    private final Object[] insertIntoRoot(Object[] objArr, int i2, int i3, Object obj, ObjectRef objectRef) {
        Object obj2;
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        int i4 = iIndexSegment + 1;
        if (i2 == 0) {
            objectRef.setValue(objArr[31]);
            Object[] objArrMakeMutable = makeMutable(objArr);
            c.at(objArr, objArrMakeMutable, i4, iIndexSegment, 31);
            objArrMakeMutable[iIndexSegment] = obj;
            return objArrMakeMutable;
        }
        Object[] objArrMakeMutable2 = makeMutable(objArr);
        int i5 = i2 - 5;
        Object obj3 = objArrMakeMutable2[iIndexSegment];
        x.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable2[iIndexSegment] = insertIntoRoot((Object[]) obj3, i5, i3, obj, objectRef);
        while (i4 < 32 && (obj2 = objArrMakeMutable2[i4]) != null) {
            objArrMakeMutable2[i4] = insertIntoRoot((Object[]) obj2, i5, 0, objectRef.getValue(), objectRef);
            i4++;
        }
        return objArrMakeMutable2;
    }

    private final void insertIntoTail(Object[] objArr, int i2, E e2) {
        int iTailSize = tailSize();
        Object[] objArrMakeMutable = makeMutable(this.tail);
        int i3 = i2 + 1;
        Object[] objArr2 = this.tail;
        if (iTailSize >= 32) {
            Object obj = objArr2[31];
            c.at(objArr2, objArrMakeMutable, i3, i2, 31);
            objArrMakeMutable[i2] = e2;
            pushFilledTail(objArr, objArrMakeMutable, mutableBufferWith(obj));
            return;
        }
        c.at(objArr2, objArrMakeMutable, i3, i2, iTailSize);
        objArrMakeMutable[i2] = e2;
        this.root = objArr;
        this.tail = objArrMakeMutable;
        this.size = size() + 1;
    }

    private final boolean isMutable(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.ownership;
    }

    private final ListIterator<Object[]> leafBufferIterator(int i2) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iRootSize = rootSize() >> 5;
        ListImplementation.checkPositionIndex$runtime(i2, iRootSize);
        int i3 = this.rootShift;
        return i3 == 0 ? new SingleElementListIterator(objArr, i2) : new TrieIterator(objArr, i2, iRootSize, i3 / 5);
    }

    private final Object[] makeMutable(Object[] objArr) {
        if (objArr == null) {
            return mutableBuffer();
        }
        if (isMutable(objArr)) {
            return objArr;
        }
        Object[] objArrMutableBuffer = mutableBuffer();
        c.aL(objArr, objArrMutableBuffer, 0, 0, n.i(objArr.length, 32), 6);
        return objArrMutableBuffer;
    }

    private final Object[] makeMutableShiftingRight(Object[] objArr, int i2) {
        int i3 = 32 - i2;
        if (isMutable(objArr)) {
            c.at(objArr, objArr, i2, 0, i3);
            return objArr;
        }
        Object[] objArrMutableBuffer = mutableBuffer();
        c.at(objArr, objArrMutableBuffer, i2, 0, i3);
        return objArrMutableBuffer;
    }

    private final Object[] mutableBuffer() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] mutableBufferWith(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] nullifyAfter(Object[] objArr, int i2, int i3) {
        if (i3 < 0) {
            PreconditionsKt.throwIllegalArgumentException("shift should be positive");
        }
        if (i3 == 0) {
            return objArr;
        }
        int iIndexSegment = UtilsKt.indexSegment(i2, i3);
        Object obj = objArr[iIndexSegment];
        x.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objNullifyAfter = nullifyAfter((Object[]) obj, i2, i3 - 5);
        if (iIndexSegment < 31) {
            int i4 = iIndexSegment + 1;
            if (objArr[i4] != null) {
                if (isMutable(objArr)) {
                    c.j(objArr, null, i4, 32);
                }
                Object[] objArrMutableBuffer = mutableBuffer();
                c.at(objArr, objArrMutableBuffer, 0, 0, i4);
                objArr = objArrMutableBuffer;
            }
        }
        if (objNullifyAfter == objArr[iIndexSegment]) {
            return objArr;
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objNullifyAfter;
        return objArrMakeMutable;
    }

    private final Object[] pullLastBuffer(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(i3 - 1, i2);
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
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArrMakeMutable[iIndexSegment] = objArrPullLastBuffer;
        return objArrMakeMutable;
    }

    private final void pullLastBufferFromRoot(Object[] objArr, int i2, int i3) {
        if (i3 == 0) {
            this.root = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.tail = objArr;
            this.size = i2;
            this.rootShift = 0;
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        x.c(objArr);
        Object[] objArrPullLastBuffer = pullLastBuffer(objArr, i3, i2, objectRef);
        x.c(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        x.d(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = i2;
        if (objArrPullLastBuffer[1] == null) {
            this.root = (Object[]) objArrPullLastBuffer[0];
            this.rootShift = i3 - 5;
        } else {
            this.root = objArrPullLastBuffer;
            this.rootShift = i3;
        }
    }

    private final Object[] pushBuffers(Object[] objArr, int i2, int i3, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            PreconditionsKt.throwIllegalArgumentException("invalid buffersIterator");
        }
        if (i3 < 0) {
            PreconditionsKt.throwIllegalArgumentException("negative shift");
        }
        if (i3 == 0) {
            return it.next();
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        int iIndexSegment = UtilsKt.indexSegment(i2, i3);
        int i4 = i3 - 5;
        objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], i2, i4, it);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || !it.hasNext()) {
                break;
            }
            objArrMakeMutable[iIndexSegment] = pushBuffers((Object[]) objArrMakeMutable[iIndexSegment], 0, i4, it);
        }
        return objArrMakeMutable;
    }

    private final Object[] pushBuffersIncreasingHeightIfNeeded(Object[] objArr, int i2, Object[][] objArr2) {
        Iterator<Object[]> itV = h.g.b.o.v(objArr2);
        int i3 = this.rootShift;
        Object[] objArrPushBuffers = (i2 >> 5) < (1 << i3) ? pushBuffers(objArr, i2, i3, itV) : makeMutable(objArr);
        while (itV.hasNext()) {
            this.rootShift += 5;
            objArrPushBuffers = mutableBufferWith(objArrPushBuffers);
            int i4 = this.rootShift;
            pushBuffers(objArrPushBuffers, 1 << i4, i4, itV);
        }
        return objArrPushBuffers;
    }

    private final void pushFilledTail(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i2 = this.rootShift;
        if (size > (1 << i2)) {
            this.root = pushTail(mutableBufferWith(objArr), objArr2, this.rootShift + 5);
            this.tail = objArr3;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (objArr == null) {
            this.root = objArr2;
            this.tail = objArr3;
            this.size = size() + 1;
        } else {
            this.root = pushTail(objArr, objArr2, i2);
            this.tail = objArr3;
            this.size = size() + 1;
        }
    }

    private final Object[] pushTail(Object[] objArr, Object[] objArr2, int i2) {
        int size = size() - 1;
        Object[] objArrMakeMutable = makeMutable(objArr);
        int iIndexSegment = UtilsKt.indexSegment(size, i2);
        if (i2 == 5) {
            objArrMakeMutable[iIndexSegment] = objArr2;
            return objArrMakeMutable;
        }
        objArrMakeMutable[iIndexSegment] = pushTail((Object[]) objArrMakeMutable[iIndexSegment], objArr2, i2 - 5);
        return objArrMakeMutable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int recyclableRemoveAll(l<? super E, Boolean> lVar, Object[] objArr, int i2, int i3, ObjectRef objectRef, List<Object[]> list, List<Object[]> list2) {
        if (isMutable(objArr)) {
            list.add(objArr);
        }
        Object value = objectRef.getValue();
        x.d(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) value;
        Object[] objArrRemove = objArr2;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i3 == 32) {
                    objArrRemove = !list.isEmpty() ? list.remove(list.size() - 1) : mutableBuffer();
                    i3 = 0;
                }
                objArrRemove[i3] = obj;
                i3++;
            }
        }
        objectRef.setValue(objArrRemove);
        if (objArr2 != objectRef.getValue()) {
            list2.add(objArr2);
        }
        return i3;
    }

    private final boolean removeAll(l<? super E, Boolean> lVar) {
        int iTailSize = tailSize();
        ObjectRef objectRef = new ObjectRef(null);
        if (this.root == null) {
            return removeAllFromTail(lVar, iTailSize, objectRef) != iTailSize;
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(0);
        int iRemoveAll = 32;
        while (true) {
            if (iRemoveAll == 32) {
                if (!listIteratorLeafBufferIterator.hasNext()) {
                    iRemoveAll = 32;
                    break;
                }
                iRemoveAll = removeAll(lVar, listIteratorLeafBufferIterator.next(), 32, objectRef);
            } else {
                break;
            }
        }
        if (iRemoveAll == 32) {
            listIteratorLeafBufferIterator.hasNext();
            int iRemoveAllFromTail = removeAllFromTail(lVar, iTailSize, objectRef);
            if (iRemoveAllFromTail == 0) {
                pullLastBufferFromRoot(this.root, size(), this.rootShift);
                iRemoveAllFromTail = 0;
            }
            return iRemoveAllFromTail != iTailSize;
        }
        int iPreviousIndex = listIteratorLeafBufferIterator.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iRecyclableRemoveAll = iRemoveAll;
        while (listIteratorLeafBufferIterator.hasNext()) {
            iRecyclableRemoveAll = recyclableRemoveAll(lVar, listIteratorLeafBufferIterator.next(), 32, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        }
        int iRecyclableRemoveAll2 = recyclableRemoveAll(lVar, this.tail, iTailSize, iRecyclableRemoveAll, objectRef, arrayList2, arrayList);
        Object value = objectRef.getValue();
        x.d(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        c.j(objArr, null, iRecyclableRemoveAll2, 32);
        boolean zIsEmpty = arrayList.isEmpty();
        Object[] objArrPushBuffers = this.root;
        if (zIsEmpty) {
            x.c(objArrPushBuffers);
        } else {
            objArrPushBuffers = pushBuffers(objArrPushBuffers, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = retainFirst(objArrPushBuffers, size);
        this.tail = objArr;
        this.size = size + iRecyclableRemoveAll2;
        return true;
    }

    private final int removeAllFromTail(l<? super E, Boolean> lVar, int i2, ObjectRef objectRef) {
        int iRemoveAll = removeAll(lVar, this.tail, i2, objectRef);
        if (iRemoveAll == i2) {
            objectRef.getValue();
            return i2;
        }
        Object value = objectRef.getValue();
        x.d(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        c.j(objArr, null, iRemoveAll, i2);
        this.tail = objArr;
        this.size = size() - (i2 - iRemoveAll);
        return iRemoveAll;
    }

    private final Object[] removeFromRootAt(Object[] objArr, int i2, int i3, ObjectRef objectRef) {
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        int i4 = iIndexSegment + 1;
        if (i2 == 0) {
            Object obj = objArr[iIndexSegment];
            Object[] objArrMakeMutable = makeMutable(objArr);
            c.at(objArr, objArrMakeMutable, iIndexSegment, i4, 32);
            objArrMakeMutable[31] = objectRef.getValue();
            objectRef.setValue(obj);
            return objArrMakeMutable;
        }
        int iIndexSegment2 = objArr[31] == null ? UtilsKt.indexSegment(rootSize() - 1, i2) : 31;
        Object[] objArrMakeMutable2 = makeMutable(objArr);
        int i5 = i2 - 5;
        if (i4 <= iIndexSegment2) {
            while (true) {
                Object obj2 = objArrMakeMutable2[iIndexSegment2];
                x.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrMakeMutable2[iIndexSegment2] = removeFromRootAt((Object[]) obj2, i5, 0, objectRef);
                if (iIndexSegment2 == i4) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj3 = objArrMakeMutable2[iIndexSegment];
        x.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMakeMutable2[iIndexSegment] = removeFromRootAt((Object[]) obj3, i5, i3, objectRef);
        return objArrMakeMutable2;
    }

    private final Object removeFromTailAt(Object[] objArr, int i2, int i3, int i4) {
        int size = size() - i2;
        Object[] objArr2 = this.tail;
        if (size == 1) {
            Object obj = objArr2[0];
            pullLastBufferFromRoot(objArr, i2, i3);
            return obj;
        }
        Object obj2 = objArr2[i4];
        Object[] objArrMakeMutable = makeMutable(objArr2);
        c.at(objArr2, objArrMakeMutable, i4, i4 + 1, size);
        objArrMakeMutable[size - 1] = null;
        this.root = objArr;
        this.tail = objArrMakeMutable;
        this.size = (i2 + size) - 1;
        this.rootShift = i3;
        return obj2;
    }

    private final Object[] retainFirst(Object[] objArr, int i2) {
        if ((i2 & 31) != 0) {
            PreconditionsKt.throwIllegalArgumentException("invalid size");
        }
        if (i2 == 0) {
            this.rootShift = 0;
            return null;
        }
        int i3 = i2 - 1;
        while (true) {
            int i4 = this.rootShift;
            if ((i3 >> i4) != 0) {
                return nullifyAfter(objArr, i3, i4);
            }
            this.rootShift = i4 - 5;
            Object[] objArr2 = objArr[0];
            x.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int rootSize() {
        if (size() <= 32) {
            return 0;
        }
        return UtilsKt.rootSize(size());
    }

    private final Object[] setInRoot(Object[] objArr, int i2, int i3, E e2, ObjectRef objectRef) {
        Object[] objArrMakeMutable = makeMutable(objArr);
        int iIndexSegment = UtilsKt.indexSegment(i3, i2);
        if (i2 != 0) {
            Object obj = objArrMakeMutable[iIndexSegment];
            x.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMakeMutable[iIndexSegment] = setInRoot((Object[]) obj, i2 - 5, i3, e2, objectRef);
            return objArrMakeMutable;
        }
        if (objArrMakeMutable != objArr) {
            this.modCount++;
        }
        objectRef.setValue(objArrMakeMutable[iIndexSegment]);
        objArrMakeMutable[iIndexSegment] = e2;
        return objArrMakeMutable;
    }

    private final Object[] shiftLeafBuffers(int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorLeafBufferIterator = leafBufferIterator(rootSize() >> 5);
        while (listIteratorLeafBufferIterator.previousIndex() != i2) {
            Object[] objArrPrevious = listIteratorLeafBufferIterator.previous();
            c.at(objArrPrevious, objArr2, 0, 32 - i3, 32);
            objArr2 = makeMutableShiftingRight(objArrPrevious, i3);
            i4--;
            objArr[i4] = objArr2;
        }
        return listIteratorLeafBufferIterator.previous();
    }

    private final void splitToBuffers(Collection<? extends E> collection, int i2, Object[] objArr, int i3, Object[][] objArr2, int i4, Object[] objArr3) {
        Object[] objArrMutableBuffer;
        if (i4 <= 0) {
            PreconditionsKt.throwIllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] objArrMakeMutable = makeMutable(objArr);
        objArr2[0] = objArrMakeMutable;
        int i5 = i2 & 31;
        int size = ((i2 + collection.size()) - 1) & 31;
        int i6 = (i3 - i5) + size;
        int i7 = size + 1;
        if (i6 < 32) {
            c.at(objArrMakeMutable, objArr3, i7, i5, i3);
        } else {
            int i8 = i6 - 31;
            if (i4 == 1) {
                objArrMutableBuffer = objArrMakeMutable;
            } else {
                objArrMutableBuffer = mutableBuffer();
                i4--;
                objArr2[i4] = objArrMutableBuffer;
            }
            int i9 = i3 - i8;
            c.at(objArrMakeMutable, objArr3, 0, i9, i3);
            c.at(objArrMakeMutable, objArrMutableBuffer, i7, i5, i9);
            objArr3 = objArrMutableBuffer;
        }
        Iterator<? extends E> it = collection.iterator();
        copyToBuffer(objArrMakeMutable, i5, it);
        for (int i10 = 1; i10 < i4; i10++) {
            Object[] objArrMutableBuffer2 = mutableBuffer();
            copyToBuffer(objArrMutableBuffer2, 0, it);
            objArr2[i10] = objArrMutableBuffer2;
        }
        copyToBuffer(objArr3, 0, it);
    }

    private final int tailSize(int i2) {
        return i2 <= 32 ? i2 : i2 - UtilsKt.rootSize(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.a.o, java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        if (i2 == size()) {
            add(e2);
            return;
        }
        this.modCount++;
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            insertIntoTail(this.root, i2 - iRootSize, e2);
            return;
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArr = this.root;
        x.c(objArr);
        insertIntoTail(insertIntoRoot(objArr, this.rootShift, i2, e2, objectRef), 0, objectRef.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Collection<? extends E> collection2;
        Object[] objArrMutableBuffer;
        Object[][] objArr;
        ListImplementation.checkPositionIndex$runtime(i2, size());
        if (i2 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i3 = (i2 >> 5) << 5;
        int size = (((size() - i3) + collection.size()) - 1) / 32;
        if (size == 0) {
            rootSize();
            int i4 = i2 & 31;
            int size2 = (i2 + collection.size()) - 1;
            Object[] objArr2 = this.tail;
            Object[] objArrMakeMutable = makeMutable(objArr2);
            c.at(objArr2, objArrMakeMutable, (size2 & 31) + 1, i4, tailSize());
            copyToBuffer(objArrMakeMutable, i4, collection.iterator());
            this.tail = objArrMakeMutable;
            this.size = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iTailSize = tailSize();
        int iTailSize2 = tailSize(size() + collection.size());
        if (i2 >= rootSize()) {
            objArrMutableBuffer = mutableBuffer();
            objArr = objArr3;
            persistentVectorBuilder = this;
            collection2 = collection;
            persistentVectorBuilder.splitToBuffers(collection2, i2, this.tail, iTailSize, objArr, size, objArrMutableBuffer);
        } else {
            persistentVectorBuilder = this;
            collection2 = collection;
            Object[] objArr4 = persistentVectorBuilder.tail;
            if (iTailSize2 > iTailSize) {
                int i5 = iTailSize2 - iTailSize;
                Object[] objArrMakeMutableShiftingRight = persistentVectorBuilder.makeMutableShiftingRight(objArr4, i5);
                persistentVectorBuilder.insertIntoRoot(collection2, i2, i5, objArr3, size, objArrMakeMutableShiftingRight);
                objArr = objArr3;
                objArrMutableBuffer = objArrMakeMutableShiftingRight;
            } else {
                objArrMutableBuffer = persistentVectorBuilder.mutableBuffer();
                int i6 = iTailSize - iTailSize2;
                c.at(objArr4, objArrMutableBuffer, 0, i6, iTailSize);
                int i7 = 32 - i6;
                Object[] objArrMakeMutableShiftingRight2 = persistentVectorBuilder.makeMutableShiftingRight(persistentVectorBuilder.tail, i7);
                int i8 = size - 1;
                objArr3[i8] = objArrMakeMutableShiftingRight2;
                persistentVectorBuilder.insertIntoRoot(collection2, i2, i7, objArr3, i8, objArrMakeMutableShiftingRight2);
                collection2 = collection2;
                objArr = objArr3;
                persistentVectorBuilder = persistentVectorBuilder;
            }
        }
        persistentVectorBuilder.root = persistentVectorBuilder.pushBuffersIncreasingHeightIfNeeded(persistentVectorBuilder.root, i3, objArr);
        persistentVectorBuilder.tail = objArrMutableBuffer;
        persistentVectorBuilder.size = persistentVectorBuilder.size() + collection2.size();
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    public PersistentList<E> build() {
        PersistentVector persistentVector;
        Object[] objArr = this.root;
        if (objArr == this.vectorRoot && this.tail == this.vectorTail) {
            persistentVector = this.vector;
        } else {
            this.ownership = new MutabilityOwnership();
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                persistentVector = new PersistentVector(objArr, objArr2, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                persistentVector = UtilsKt.persistentVectorOf();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                x.e(objArrCopyOf, "copyOf(...)");
                persistentVector = new SmallPersistentVector(objArrCopyOf);
            }
        }
        this.vector = persistentVector;
        return (PersistentList<E>) persistentVector;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        return (E) bufferFor(i2)[i2 & 31];
    }

    public final int getModCount$runtime() {
        return this.modCount;
    }

    public final Object[] getRoot$runtime() {
        return this.root;
    }

    public final int getRootShift$runtime() {
        return this.rootShift;
    }

    @Override // h.a.o
    public int getSize() {
        return this.size;
    }

    public final Object[] getTail$runtime() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        return new PersistentVectorMutableIterator(this, i2);
    }

    public final boolean removeAllWithPredicate(l<? super E, Boolean> lVar) {
        boolean zRemoveAll = removeAll(lVar);
        if (zRemoveAll) {
            this.modCount++;
        }
        return zRemoveAll;
    }

    @Override // h.a.o
    public E removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        this.modCount++;
        int iRootSize = rootSize();
        if (i2 >= iRootSize) {
            return (E) removeFromTailAt(this.root, iRootSize, this.rootShift, i2 - iRootSize);
        }
        ObjectRef objectRef = new ObjectRef(this.tail[0]);
        Object[] objArr = this.root;
        x.c(objArr);
        removeFromTailAt(removeFromRootAt(objArr, this.rootShift, i2, objectRef), iRootSize, this.rootShift, 0);
        return (E) objectRef.getValue();
    }

    @Override // h.a.o, java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        if (rootSize() > i2) {
            ObjectRef objectRef = new ObjectRef(null);
            Object[] objArr = this.root;
            x.c(objArr);
            this.root = setInRoot(objArr, this.rootShift, i2, e2, objectRef);
            return (E) objectRef.getValue();
        }
        Object[] objArrMakeMutable = makeMutable(this.tail);
        if (objArrMakeMutable != this.tail) {
            this.modCount++;
        }
        int i3 = i2 & 31;
        E e3 = (E) objArrMakeMutable[i3];
        objArrMakeMutable[i3] = e2;
        this.tail = objArrMakeMutable;
        return e3;
    }

    public final void setRootShift$runtime(int i2) {
        this.rootShift = i2;
    }

    private final int tailSize() {
        return tailSize(size());
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        this.modCount++;
        int iTailSize = tailSize();
        if (iTailSize < 32) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            objArrMakeMutable[iTailSize] = e2;
            this.tail = objArrMakeMutable;
            this.size = size() + 1;
        } else {
            pushFilledTail(this.root, this.tail, mutableBufferWith(e2));
        }
        return true;
    }

    private final void insertIntoRoot(Collection<? extends E> collection, int i2, int i3, Object[][] objArr, int i4, Object[] objArr2) {
        Object[] objArr3;
        if (this.root != null) {
            int i5 = i2 >> 5;
            Object[] objArrShiftLeafBuffers = shiftLeafBuffers(i5, i3, objArr, i4, objArr2);
            int iRootSize = i4 - (((rootSize() >> 5) - 1) - i5);
            if (iRootSize < i4) {
                Object[] objArr4 = objArr[iRootSize];
                x.c(objArr4);
                objArr3 = objArr4;
            } else {
                objArr3 = objArr2;
            }
            splitToBuffers(collection, i2, objArrShiftLeafBuffers, 32, objArr, iRootSize, objArr3);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<?> collection) {
        return removeAllWithPredicate(new l() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    private final int removeAll(l<? super E, Boolean> lVar, Object[] objArr, int i2, ObjectRef objectRef) {
        Object[] objArrMakeMutable = objArr;
        int i3 = i2;
        boolean z = false;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrMakeMutable = makeMutable(objArr);
                    z = true;
                    i3 = i4;
                }
            } else if (z) {
                objArrMakeMutable[i3] = obj;
                i3++;
            }
        }
        objectRef.setValue(objArrMakeMutable);
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iTailSize = tailSize();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iTailSize >= collection.size()) {
            Object[] objArrMakeMutable = makeMutable(this.tail);
            copyToBuffer(objArrMakeMutable, iTailSize, it);
            this.tail = objArrMakeMutable;
            this.size = size() + collection.size();
        } else {
            int size = ((collection.size() + iTailSize) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrMakeMutable2 = makeMutable(this.tail);
            copyToBuffer(objArrMakeMutable2, iTailSize, it);
            objArr[0] = objArrMakeMutable2;
            for (int i2 = 1; i2 < size; i2++) {
                Object[] objArrMutableBuffer = mutableBuffer();
                copyToBuffer(objArrMutableBuffer, 0, it);
                objArr[i2] = objArrMutableBuffer;
            }
            this.root = pushBuffersIncreasingHeightIfNeeded(this.root, rootSize(), objArr);
            Object[] objArrMutableBuffer2 = mutableBuffer();
            copyToBuffer(objArrMutableBuffer2, 0, it);
            this.tail = objArrMutableBuffer2;
            this.size = size() + collection.size();
        }
        return true;
    }
}
