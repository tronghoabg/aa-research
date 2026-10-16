package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    public TrieNode(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i2;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    private final TrieNode<E> addElementAt(int i2, E e2) {
        return new TrieNode<>(this.bitmap | i2, TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime(i2), e2));
    }

    private final int calculateSize() {
        int i2 = this.bitmap;
        Object[] objArr = this.buffer;
        if (i2 == 0) {
            return objArr.length;
        }
        int iCalculateSize = 0;
        for (Object obj : objArr) {
            iCalculateSize += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return iCalculateSize;
    }

    private final TrieNode<E> collisionAdd(E e2) {
        return collisionContainsElement(e2) ? this : new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e2));
    }

    private final boolean collisionContainsElement(E e2) {
        return c.aj(this.buffer, e2);
    }

    private final TrieNode<E> collisionRemove(E e2) {
        int iC = c.C(this.buffer, e2);
        return iC != -1 ? collisionRemoveElementAtIndex(iC) : this;
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i2) {
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i2));
    }

    private final E elementAtIndex(int i2) {
        return (E) this.buffer[i2];
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.buffer[i2] != trieNode.buffer[i2]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNoCellAt(int i2) {
        return (this.bitmap & i2) == 0;
    }

    private final TrieNode<E> makeNode(int i2, E e2, int i3, E e3, int i4, MutabilityOwnership mutabilityOwnership) {
        if (i4 > 30) {
            return new TrieNode<>(0, new Object[]{e2, e3}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i2, i4);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i3, i4);
        if (iIndexSegment == iIndexSegment2) {
            return new TrieNode<>(1 << iIndexSegment, new Object[]{makeNode(i2, e2, i3, e3, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
        }
        Object[] objArr = new Object[2];
        if (iIndexSegment < iIndexSegment2) {
            objArr[0] = e2;
            objArr[1] = e3;
        } else {
            objArr[0] = e3;
            objArr[1] = e2;
        }
        return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), objArr, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i2, int i3, E e2, int i4, MutabilityOwnership mutabilityOwnership) {
        E eElementAtIndex = elementAtIndex(i2);
        return makeNode(eElementAtIndex != null ? eElementAtIndex.hashCode() : 0, eElementAtIndex, i3, e2, i4 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i2, int i3, E e2, int i4) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = makeNodeAtIndex(i2, i3, e2, i4, null);
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableAddElementAt(int i2, E e2, MutabilityOwnership mutabilityOwnership) {
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(i2);
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode<>(this.bitmap | i2, TrieNodeKt.addElementAtIndex(objArr, iIndexOfCellAt$runtime, e2), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.addElementAtIndex(objArr, iIndexOfCellAt$runtime, e2);
        this.bitmap = i2 | this.bitmap;
        return this;
    }

    private final TrieNode<E> mutableCollisionAdd(E e2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e2)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership$runtime = persistentHashSetBuilder.getOwnership$runtime();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership$runtime) {
            return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(objArr, 0, e2), persistentHashSetBuilder.getOwnership$runtime());
        }
        this.buffer = TrieNodeKt.addElementAtIndex(objArr, 0, e2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (this == trieNode) {
            deltaCounter.plusAssign(objArr.length);
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        x.e(objArrCopyOf, "copyOf(...)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr2.length; i3++) {
            if (!collisionContainsElement(objArr2[i3])) {
                objArrCopyOf[length + i2] = objArr2[i3];
                int length2 = objArrCopyOf.length;
                i2++;
            }
        }
        int length3 = i2 + this.buffer.length;
        int length4 = objArrCopyOf.length;
        deltaCounter.plusAssign(length4 - length3);
        if (length3 == this.buffer.length) {
            return this;
        }
        if (length3 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length3 != length4) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length3);
            x.e(objArrCopyOf, "copyOf(...)");
        }
        if (!x.n(this.ownedBy, mutabilityOwnership)) {
            return new TrieNode<>(0, objArrCopyOf, mutabilityOwnership);
        }
        this.buffer = objArrCopyOf;
        return this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iC = c.C(this.buffer, e2);
        if (iC == -1) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableCollisionRemoveElementAtIndex(iC, persistentHashSetBuilder.getOwnership$runtime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        boolean zN = x.n(mutabilityOwnership, this.ownedBy);
        Object[] objArr = this.buffer;
        Object[] objArr2 = zN ? objArr : new Object[objArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            if (!trieNode.collisionContainsElement(objArr[i3])) {
                objArr2[i2] = objArr[i3];
                int length = objArr2.length;
                i2++;
            }
        }
        deltaCounter.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr2[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr2.length) {
            return new TrieNode(0, objArr2, mutabilityOwnership);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, i2);
        x.e(objArrCopyOf, "copyOf(...)");
        return new TrieNode(0, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i2, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(objArr, i2), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(objArr, i2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        boolean zN = x.n(mutabilityOwnership, this.ownedBy);
        Object[] objArr = this.buffer;
        if (!zN) {
            objArr = new Object[Math.min(objArr.length, trieNode.buffer.length)];
        }
        Object[] objArr2 = this.buffer;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr2.length; i3++) {
            if (trieNode.collisionContainsElement(objArr2[i3])) {
                objArr[i2] = objArr2[i3];
                int length = objArr.length;
                i2++;
            }
        }
        deltaCounter.plusAssign(i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
        x.e(objArrCopyOf, "copyOf(...)");
        return new TrieNode(0, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i2, int i3, E e2, int i4, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 == mutabilityOwnership) {
            objArr[i2] = makeNodeAtIndex(i2, i3, e2, i4, mutabilityOwnership);
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = makeNodeAtIndex(i2, i3, e2, i4, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode<>(this.bitmap ^ i3, TrieNodeKt.removeCellAtIndex(objArr, i2), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeCellAtIndex(objArr, i2);
        this.bitmap ^= i3;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final TrieNode<E> mutableUpdateNodeAtIndex(int i2, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> nodeAtIndex(int i2) {
        Object obj = this.buffer[i2];
        x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> removeCellAtIndex(int i2, int i3) {
        return new TrieNode<>(this.bitmap ^ i3, TrieNodeKt.removeCellAtIndex(this.buffer, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v3 */
    private final TrieNode<E> updateNodeAtIndex(int i2, TrieNode<E> trieNode) {
        ?? r0 = trieNode.buffer;
        if (r0.length == 1) {
            ?? r02 = r0[0];
            if (!(r02 instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = r02;
            }
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    public final TrieNode<E> add(int i2, E e2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return addElementAt(iIndexSegment, e2);
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return !x.n(e2, obj) ? moveElementToNode(iIndexOfCellAt$runtime, i2, e2, i3) : this;
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
        TrieNode<E> trieNodeCollisionAdd = i3 == 30 ? trieNodeNodeAtIndex.collisionAdd(e2) : trieNodeNodeAtIndex.add(i2, e2, i3 + 5);
        return trieNodeNodeAtIndex == trieNodeCollisionAdd ? this : updateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeCollisionAdd);
    }

    public final boolean contains(int i2, E e2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return x.n(e2, obj);
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
        return i3 == 30 ? trieNodeNodeAtIndex.collisionContainsElement(e2) : trieNodeNodeAtIndex.contains(i2, e2, i3 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> trieNode, int i2) {
        if (this == trieNode) {
            return true;
        }
        if (i2 > 30) {
            for (Object obj : trieNode.buffer) {
                if (!c.aj(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.bitmap;
        int i4 = trieNode.bitmap;
        int i5 = i3 & i4;
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(iLowestOneBit);
            Object obj2 = this.buffer[iIndexOfCellAt$runtime];
            Object obj3 = trieNode.buffer[iIndexOfCellAt$runtime2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                x.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                TrieNode trieNode2 = (TrieNode) obj2;
                x.d(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!trieNode2.containsAll((TrieNode) obj3, i2 + 5)) {
                    return false;
                }
            } else if (z) {
                int i6 = i2 + 5;
                x.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i6)) {
                    return false;
                }
            } else if (z2 || !x.n(obj2, obj3)) {
                return false;
            }
            i5 ^= iLowestOneBit;
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final int indexOfCellAt$runtime(int i2) {
        return Integer.bitCount(this.bitmap & (i2 - 1));
    }

    public final TrieNode<E> mutableAdd(int i2, E e2, int i3, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(iIndexSegment, e2, persistentHashSetBuilder.getOwnership$runtime());
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
            TrieNode<E> trieNodeMutableCollisionAdd = i3 == 30 ? trieNodeNodeAtIndex.mutableCollisionAdd(e2, persistentHashSetBuilder) : trieNodeNodeAtIndex.mutableAdd(i2, e2, i3 + 5, persistentHashSetBuilder);
            if (trieNodeNodeAtIndex != trieNodeMutableCollisionAdd) {
                return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeMutableCollisionAdd, persistentHashSetBuilder.getOwnership$runtime());
            }
        } else if (!x.n(e2, obj)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableMoveElementToNode(iIndexOfCellAt$runtime, i2, e2, i3, persistentHashSetBuilder.getOwnership$runtime());
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    public final TrieNode<E> mutableAddAll(TrieNode<E> trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iHashCode;
        E e2;
        int iHashCode2;
        E e3;
        Object[] objArr;
        TrieNode<E> trieNodeMakeNode;
        int iHashCode3;
        E e4;
        int iHashCode4;
        E e5;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i2 > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime());
        }
        int i3 = this.bitmap;
        int i4 = trieNode.bitmap | i3;
        TrieNode<E> trieNode2 = (i4 == i3 && x.n(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime())) ? this : new TrieNode<>(i4, new Object[Integer.bitCount(i4)], persistentHashSetBuilder.getOwnership$runtime());
        int i5 = i4;
        int i6 = 0;
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(iLowestOneBit);
            Object[] objArr2 = trieNode2.buffer;
            if (hasNoCellAt(iLowestOneBit)) {
                trieNodeMakeNode = (TrieNode<E>) trieNode.buffer[iIndexOfCellAt$runtime2];
            } else {
                boolean zHasNoCellAt = trieNode.hasNoCellAt(iLowestOneBit);
                ?? r5 = this.buffer;
                if (zHasNoCellAt) {
                    trieNodeMakeNode = r5[iIndexOfCellAt$runtime];
                } else {
                    ?? r1 = r5[iIndexOfCellAt$runtime];
                    ?? r2 = trieNode.buffer[iIndexOfCellAt$runtime2];
                    boolean z = r1 instanceof TrieNode;
                    boolean z2 = r2 instanceof TrieNode;
                    if (z && z2) {
                        x.d(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        x.d(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        trieNodeMakeNode = ((TrieNode) r1).mutableAddAll((TrieNode) r2, i2 + 5, deltaCounter, persistentHashSetBuilder);
                    } else if (z) {
                        int i7 = i2 + 5;
                        x.d(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        TrieNode trieNode3 = (TrieNode) r1;
                        int size = persistentHashSetBuilder.size();
                        if (r2 != 0) {
                            iHashCode4 = r2.hashCode();
                            e5 = r2;
                        } else {
                            iHashCode4 = 0;
                            e5 = null;
                        }
                        TrieNode<E> trieNodeMutableAdd = trieNode3.mutableAdd(iHashCode4, e5, i7, persistentHashSetBuilder);
                        trieNodeMakeNode = trieNodeMutableAdd;
                        if (persistentHashSetBuilder.size() == size) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                            trieNodeMakeNode = trieNodeMutableAdd;
                        }
                    } else if (z2) {
                        int i8 = i2 + 5;
                        x.d(r2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                        TrieNode trieNode4 = (TrieNode) r2;
                        int size2 = persistentHashSetBuilder.size();
                        if (r1 != 0) {
                            iHashCode3 = r1.hashCode();
                            e4 = r1;
                        } else {
                            iHashCode3 = 0;
                            e4 = null;
                        }
                        TrieNode<E> trieNodeMutableAdd2 = trieNode4.mutableAdd(iHashCode3, e4, i8, persistentHashSetBuilder);
                        trieNodeMakeNode = trieNodeMutableAdd2;
                        if (persistentHashSetBuilder.size() == size2) {
                            deltaCounter.setCount(deltaCounter.getCount() + 1);
                            trieNodeMakeNode = trieNodeMutableAdd2;
                        }
                    } else if (x.n(r1, r2)) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                        trieNodeMakeNode = r1;
                    } else {
                        int i9 = i2 + 5;
                        if (r1 != 0) {
                            iHashCode = r1.hashCode();
                            e2 = r1;
                        } else {
                            iHashCode = 0;
                            e2 = null;
                        }
                        if (r2 != 0) {
                            iHashCode2 = r2.hashCode();
                            e3 = r2;
                        } else {
                            iHashCode2 = 0;
                            e3 = null;
                        }
                        objArr = objArr2;
                        trieNodeMakeNode = makeNode(iHashCode, e2, iHashCode2, e3, i9, persistentHashSetBuilder.getOwnership$runtime());
                        objArr[i6] = trieNodeMakeNode;
                        i5 ^= iLowestOneBit;
                        i6++;
                    }
                }
            }
            objArr = objArr2;
            objArr[i6] = trieNodeMakeNode;
            i5 ^= iLowestOneBit;
            i6++;
        }
        return !elementsIdentityEquals(trieNode2) ? !trieNode.elementsIdentityEquals(trieNode2) ? trieNode2 : trieNode : this;
    }

    public final TrieNode<E> mutableRemove(int i2, E e2, int i3, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
            TrieNode<E> trieNodeMutableCollisionRemove = i3 == 30 ? trieNodeNodeAtIndex.mutableCollisionRemove(e2, persistentHashSetBuilder) : trieNodeNodeAtIndex.mutableRemove(i2, e2, i3 + 5, persistentHashSetBuilder);
            return (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime() || trieNodeNodeAtIndex != trieNodeMutableCollisionRemove) ? mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeMutableCollisionRemove, persistentHashSetBuilder.getOwnership$runtime()) : this;
        }
        if (!x.n(e2, obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableRemoveCellAtIndex(iIndexOfCellAt$runtime, iIndexSegment, persistentHashSetBuilder.getOwnership$runtime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r19, int r20, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r21, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r22) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int i3;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i2 > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime());
        }
        int i4 = this.bitmap & trieNode.bitmap;
        if (i4 == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode2 = (x.n(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime()) && i4 == this.bitmap) ? this : new TrieNode<>(i4, new Object[Integer.bitCount(i4)], persistentHashSetBuilder.getOwnership$runtime());
        int i5 = i4;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i3 = 1;
            if (i5 == 0) {
                break;
            }
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = trieNode.indexOfCellAt$runtime(iLowestOneBit);
            Object objMutableRetainAll = this.buffer[iIndexOfCellAt$runtime];
            Object obj = trieNode.buffer[iIndexOfCellAt$runtime2];
            boolean z = objMutableRetainAll instanceof TrieNode;
            boolean z2 = obj instanceof TrieNode;
            if (z && z2) {
                x.d(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                objMutableRetainAll = ((TrieNode) objMutableRetainAll).mutableRetainAll((TrieNode) obj, i2 + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z) {
                int i8 = i2 + 5;
                x.d(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, i8)) {
                    deltaCounter.plusAssign(1);
                    objMutableRetainAll = obj;
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (z2) {
                int i9 = i2 + 5;
                x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
                if (((TrieNode) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, i9)) {
                    deltaCounter.plusAssign(1);
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (x.n(objMutableRetainAll, obj)) {
                deltaCounter.plusAssign(1);
            } else {
                objMutableRetainAll = EMPTY;
            }
            if (objMutableRetainAll != EMPTY) {
                i6 |= iLowestOneBit;
            }
            trieNode2.buffer[i7] = objMutableRetainAll;
            i5 ^= iLowestOneBit;
            i7++;
        }
        int i10 = 0;
        int iBitCount = Integer.bitCount(i6);
        if (i6 == 0) {
            return EMPTY;
        }
        if (i6 == i4) {
            return !trieNode2.elementsIdentityEquals(this) ? !trieNode2.elementsIdentityEquals(trieNode) ? trieNode2 : trieNode : this;
        }
        if (iBitCount != 1) {
            i3 = iBitCount;
        } else if (i2 != 0) {
            Object obj2 = trieNode2.buffer[trieNode2.indexOfCellAt$runtime(i6)];
            return obj2 instanceof TrieNode ? new TrieNode(i6, new Object[]{obj2}, persistentHashSetBuilder.getOwnership$runtime()) : obj2;
        }
        Object[] objArr = new Object[i3];
        Object[] objArr2 = trieNode2.buffer;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (objArr2[i11] != Companion.getEMPTY$runtime()) {
                objArr[i10] = objArr2[i11];
                i10++;
            }
        }
        return new TrieNode(i6, objArr, persistentHashSetBuilder.getOwnership$runtime());
    }

    public final TrieNode<E> remove(int i2, E e2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (!(obj instanceof TrieNode)) {
            return x.n(e2, obj) ? removeCellAtIndex(iIndexOfCellAt$runtime, iIndexSegment) : this;
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
        TrieNode<E> trieNodeCollisionRemove = i3 == 30 ? trieNodeNodeAtIndex.collisionRemove(e2) : trieNodeNodeAtIndex.remove(i2, e2, i3 + 5);
        return trieNodeNodeAtIndex != trieNodeCollisionRemove ? updateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeCollisionRemove) : this;
    }

    public final void setBitmap(int i2) {
        this.bitmap = i2;
    }

    public final void setBuffer(Object[] objArr) {
        this.buffer = objArr;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public TrieNode(int i2, Object[] objArr) {
        this(i2, objArr, null);
    }
}
