package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import h.a.c;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import j$.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E>, List<E> {
    private final Object[] buffer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
        int length = objArr.length;
    }

    private final Object[] bufferOfSize(int i2) {
        return new Object[i2];
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> add(int i2, E e2) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        if (i2 == size()) {
            return add((SmallPersistentVector<E>) e2);
        }
        int i3 = i2 + 1;
        if (size() < 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + 1);
            c.aL(this.buffer, objArrBufferOfSize, 0, 0, i2, 6);
            c.at(this.buffer, objArrBufferOfSize, i3, i2, size());
            objArrBufferOfSize[i2] = e2;
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        c.at(this.buffer, objArrCopyOf, i3, i2, size() - 1);
        objArrCopyOf[i2] = e2;
        return new PersistentVector(objArrCopyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> addAll(int i2, Collection<? extends E> collection) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        if (size() + collection.size() > 32) {
            PersistentList.Builder<E> builder = builder();
            builder.addAll(i2, collection);
            return builder.build();
        }
        Object[] objArrBufferOfSize = bufferOfSize(size() + collection.size());
        c.aL(this.buffer, objArrBufferOfSize, 0, 0, i2, 6);
        c.at(this.buffer, objArrBufferOfSize, collection.size() + i2, i2, size());
        Iterator<? extends E> it = collection.iterator();
        int i3 = i2;
        while (it.hasNext()) {
            objArrBufferOfSize[i3] = it.next();
            i3++;
        }
        return new SmallPersistentVector(objArrBufferOfSize);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // h.a.g, java.util.List
    public E get(int i2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        return (E) this.buffer[i2];
    }

    @Override // h.a.g, h.a.a
    public int getSize() {
        return this.buffer.length;
    }

    @Override // h.a.g, java.util.List
    public int indexOf(Object obj) {
        return c.C(this.buffer, obj);
    }

    @Override // h.a.g, java.util.List
    public int lastIndexOf(Object obj) {
        Object[] objArr = this.buffer;
        x.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i2 = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i2 < 0) {
                    return -1;
                }
                length = i2;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i3 = length2 - 1;
                if (x.n(obj, objArr[length2])) {
                    return length2;
                }
                if (i3 < 0) {
                    return -1;
                }
                length2 = i3;
            }
        }
    }

    @Override // h.a.g, java.util.List
    public ListIterator<E> listIterator(int i2) {
        ListImplementation.checkPositionIndex$runtime(i2, size());
        return new BufferIterator(this.buffer, i2, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> removeAll(l<? super E, Boolean> lVar) {
        int size = size();
        int size2 = size();
        Object[] objArr = this.buffer;
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = this.buffer[i2];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.buffer;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                    x.e(objArrCopyOf, "copyOf(...)");
                    z = true;
                    objArr = objArrCopyOf;
                    size = i2;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? EMPTY : new SmallPersistentVector(c.u(objArr, 0, size));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> removeAt(int i2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        x.e(objArrCopyOf, "copyOf(...)");
        c.at(this.buffer, objArrCopyOf, i2, i2 + 1, size());
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // h.a.g, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList<E> set(int i2, E e2) {
        ListImplementation.checkElementIndex$runtime(i2, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = e2;
        return new SmallPersistentVector(objArrCopyOf);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection addAll(Collection collection) {
        return addAll(collection);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> addAll(Collection<? extends E> collection) {
        if (size() + collection.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + collection.size());
            x.e(objArrCopyOf, "copyOf(...)");
            int size = size();
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(objArrCopyOf);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((SmallPersistentVector<E>) obj);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentList<E> add(E e2) {
        if (size() < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
            x.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[size()] = e2;
            return new SmallPersistentVector(objArrCopyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e2), size() + 1, 0);
    }
}
