package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import h.ab;
import h.g.a.l;
import h.g.a.s;
import h.g.b.o;
import h.g.b.x;
import h.k.h;
import h.k.n;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    /* compiled from: WazeSource */
    public final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i2) {
            this.node = trieNode;
            this.sizeDelta = i2;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final ModificationResult<K, V> replaceNode(l<? super TrieNode<K, V>, TrieNode<K, V>> lVar) {
            setNode(lVar.invoke(getNode()));
            return this;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }
    }

    public TrieNode(int i2, int i3, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i2;
        this.nodeMap = i3;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    private final void accept(s<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> sVar, int i2, int i3) {
        sVar.invoke(this, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i4 = this.nodeMap;
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            nodeAtIndex$runtime(nodeIndex$runtime(iLowestOneBit)).accept(sVar, (Integer.numberOfTrailingZeros(iLowestOneBit) << i3) + i2, i3 + 5);
            i4 -= iLowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int i2, int i3, int i4, K k2, V v, int i5, MutabilityOwnership mutabilityOwnership) {
        K kKeyAtIndex = keyAtIndex(i2);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, i2, nodeIndex$runtime(i3) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(i2), i4, k2, v, i5 + 5, mutabilityOwnership));
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length >> 1;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i2 = iBitCount + iBitCount; i2 < length; i2++) {
            iBitCount += nodeAtIndex$runtime(i2).calculateSize();
        }
        return iBitCount;
    }

    private final boolean collisionContainsKey(K k2) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (!x.n(k2, this.buffer[iA])) {
                if (iA != iB) {
                    iA += iC;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K k2) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC <= 0 || iA > iB) && (iC >= 0 || iB > iA)) {
            return null;
        }
        while (!x.n(k2, keyAtIndex(iA))) {
            if (iA == iB) {
                return null;
            }
            iA += iC;
        }
        return valueAtKeyIndex(iA);
    }

    private final ModificationResult<K, V> collisionPut(K k2, V v) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (!x.n(k2, keyAtIndex(iA))) {
                if (iA != iB) {
                    iA += iC;
                }
            }
            if (v == valueAtKeyIndex(iA)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            x.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iA + 1] = v;
            return new TrieNode(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k2, v)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K k2, V v) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (true) {
                if (!x.n(k2, keyAtIndex(iA)) || !x.n(v, valueAtKeyIndex(iA))) {
                    if (iA == iB) {
                        break;
                    }
                    iA += iC;
                } else {
                    return collisionRemoveEntryAtIndex(iA);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i2));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.nodeMap != trieNode.nodeMap || this.dataMap != trieNode.dataMap) {
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

    private final boolean hasNodeAt(int i2) {
        return (this.nodeMap & i2) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int i2, K k2, V v) {
        return new TrieNode<>(i2 | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime(i2), k2, v));
    }

    private final K keyAtIndex(int i2) {
        return (K) this.buffer[i2];
    }

    private final TrieNode<K, V> makeNode(int i2, K k2, V v, int i3, K k3, V v2, int i4, MutabilityOwnership mutabilityOwnership) {
        if (i4 > 30) {
            return new TrieNode<>(0, 0, new Object[]{k2, v, k3, v2}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i2, i4);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i3, i4);
        if (iIndexSegment == iIndexSegment2) {
            return new TrieNode<>(0, 1 << iIndexSegment, new Object[]{makeNode(i2, k2, v, i3, k3, v2, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
        }
        Object[] objArr = new Object[4];
        if (iIndexSegment < iIndexSegment2) {
            objArr[0] = k2;
            objArr[1] = v;
            objArr[2] = k3;
            objArr[3] = v2;
        } else {
            objArr[0] = k3;
            objArr[1] = v2;
            objArr[2] = k2;
            objArr[3] = v;
        }
        return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), 0, objArr, mutabilityOwnership);
    }

    private final TrieNode<K, V> moveEntryToNode(int i2, int i3, int i4, K k2, V v, int i5) {
        return new TrieNode<>(this.dataMap ^ i3, this.nodeMap | i3, bufferMoveEntryToNode(i2, i3, i4, k2, v, i5, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K k2, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (!x.n(k2, keyAtIndex(iA))) {
                if (iA != iB) {
                    iA += iC;
                }
            }
            int i2 = iA + 1;
            persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(iA));
            if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
                this.buffer[i2] = v;
                return this;
            }
            persistentHashMapBuilder.setModCount$runtime(persistentHashMapBuilder.getModCount$runtime() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            x.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i2] = v;
            return new TrieNode<>(0, 0, objArrCopyOf, persistentHashMapBuilder.getOwnership());
        }
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, k2, v), persistentHashMapBuilder.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        int i2 = trieNode.nodeMap;
        int i3 = trieNode.dataMap;
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        x.e(objArrCopyOf, "copyOf(...)");
        int length = this.buffer.length;
        h hVarT = n.t(n.u(0, trieNode.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (true) {
                if (collisionContainsKey(trieNode.buffer[iA])) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = trieNode.buffer;
                    objArrCopyOf[length] = objArr2[iA];
                    objArrCopyOf[length + 1] = objArr2[iA + 1];
                    length += 2;
                }
                if (iA == iB) {
                    break;
                }
                iA += iC;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == trieNode.buffer.length) {
            return trieNode;
        }
        if (length == objArrCopyOf.length) {
            return new TrieNode<>(0, 0, objArrCopyOf, mutabilityOwnership);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        x.e(objArrCopyOf2, "copyOf(...)");
        return new TrieNode<>(0, 0, objArrCopyOf2, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k2, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (true) {
                if (!x.n(k2, keyAtIndex(iA)) || !x.n(v, valueAtKeyIndex(iA))) {
                    if (iA == iB) {
                        break;
                    }
                    iA += iC;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(iA, persistentHashMapBuilder);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership = persistentHashMapBuilder.getOwnership();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership) {
            return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i2), persistentHashMapBuilder.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(objArr, i2);
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int i2, K k2, V v, MutabilityOwnership mutabilityOwnership) {
        MutabilityOwnership mutabilityOwnership2 = this.ownedBy;
        int iEntryKeyIndex$runtime = entryKeyIndex$runtime(i2);
        Object[] objArr = this.buffer;
        if (mutabilityOwnership2 != mutabilityOwnership) {
            return new TrieNode<>(i2 | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(objArr, iEntryKeyIndex$runtime, k2, v), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.insertEntryAtIndex(objArr, iEntryKeyIndex$runtime, k2, v);
        this.dataMap = i2 | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int i2, int i3, int i4, K k2, V v, int i5, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(this.dataMap ^ i3, this.nodeMap | i3, bufferMoveEntryToNode(i2, i3, i4, k2, v, i5, mutabilityOwnership), mutabilityOwnership);
        }
        this.buffer = bufferMoveEntryToNode(i2, i3, i4, k2, v, i5, mutabilityOwnership);
        this.dataMap ^= i3;
        this.nodeMap |= i3;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> trieNode, int i2, int i3, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (hasNodeAt(i2)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(i2));
            if (trieNode.hasNodeAt(i2)) {
                return trieNodeNodeAtIndex$runtime.mutablePutAll(trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(i2)), i3 + 5, deltaCounter, persistentHashMapBuilder);
            }
            if (!trieNode.hasEntryAt$runtime(i2)) {
                return trieNodeNodeAtIndex$runtime;
            }
            int i4 = i3 + 5;
            int iEntryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(i2);
            K kKeyAtIndex = trieNode.keyAtIndex(iEntryKeyIndex$runtime);
            V vValueAtKeyIndex = trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime);
            int size = persistentHashMapBuilder.size();
            TrieNode<K, V> trieNodeMutablePut = trieNodeNodeAtIndex$runtime.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, i4, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() == size) {
                deltaCounter.setCount(deltaCounter.getCount() + 1);
            }
            return trieNodeMutablePut;
        }
        if (!trieNode.hasNodeAt(i2)) {
            int i5 = i3 + 5;
            int iEntryKeyIndex$runtime2 = entryKeyIndex$runtime(i2);
            K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime2);
            V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime2);
            int iEntryKeyIndex$runtime3 = trieNode.entryKeyIndex$runtime(i2);
            K kKeyAtIndex3 = trieNode.keyAtIndex(iEntryKeyIndex$runtime3);
            return makeNode(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, vValueAtKeyIndex2, kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime3), i5, persistentHashMapBuilder.getOwnership());
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime2 = trieNode.nodeAtIndex$runtime(trieNode.nodeIndex$runtime(i2));
        if (!hasEntryAt$runtime(i2)) {
            return trieNodeNodeAtIndex$runtime2;
        }
        int i6 = i3 + 5;
        int iEntryKeyIndex$runtime4 = entryKeyIndex$runtime(i2);
        K kKeyAtIndex4 = keyAtIndex(iEntryKeyIndex$runtime4);
        if (!trieNodeNodeAtIndex$runtime2.containsKey(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, i6)) {
            return trieNodeNodeAtIndex$runtime2.mutablePut(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, valueAtKeyIndex(iEntryKeyIndex$runtime4), i6, persistentHashMapBuilder);
        }
        deltaCounter.setCount(deltaCounter.getCount() + 1);
        return trieNodeNodeAtIndex$runtime2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int i2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(i2));
        if (this.buffer.length == 2) {
            return null;
        }
        MutabilityOwnership mutabilityOwnership = this.ownedBy;
        MutabilityOwnership ownership = persistentHashMapBuilder.getOwnership();
        Object[] objArr = this.buffer;
        if (mutabilityOwnership != ownership) {
            return new TrieNode<>(i3 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, i2), persistentHashMapBuilder.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(objArr, i2);
        this.dataMap ^= i3;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != mutabilityOwnership) {
            return new TrieNode<>(this.dataMap, this.nodeMap ^ i3, TrieNodeKt.removeNodeAtIndex(objArr, i2), mutabilityOwnership);
        }
        this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, i2);
        this.nodeMap ^= i3;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        return trieNode2 == null ? mutableRemoveNodeAtIndex(i2, i3, mutabilityOwnership) : (this.ownedBy == mutabilityOwnership || trieNode != trieNode2) ? mutableUpdateNodeAtIndex(i2, trieNode2, mutabilityOwnership) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int i2, TrieNode<K, V> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = this.buffer;
        int length = objArr.length;
        if (length == 1) {
            if (trieNode.buffer.length == 2 && trieNode.nodeMap == 0) {
                trieNode.dataMap = this.nodeMap;
                return trieNode;
            }
            length = 1;
        }
        if (this.ownedBy == mutabilityOwnership) {
            objArr[i2] = trieNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int i2, V v, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int i3 = i2 + 1;
        if (this.ownedBy == persistentHashMapBuilder.getOwnership()) {
            this.buffer[i3] = v;
            return this;
        }
        persistentHashMapBuilder.setModCount$runtime(persistentHashMapBuilder.getModCount$runtime() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i3] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, persistentHashMapBuilder.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int i2, int i3) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(i3 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int i2, int i3) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, this.nodeMap ^ i3, TrieNodeKt.removeNodeAtIndex(objArr, i2));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> trieNode, TrieNode<K, V> trieNode2, int i2, int i3) {
        return trieNode2 == null ? removeNodeAtIndex(i2, i3) : trieNode != trieNode2 ? updateNodeAtIndex(i2, i3, trieNode2) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int i2, int i3, TrieNode<K, V> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length != 2 || trieNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            x.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i2] = trieNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            trieNode.dataMap = this.nodeMap;
            return trieNode;
        }
        return new TrieNode<>(this.dataMap ^ i3, this.nodeMap ^ i3, TrieNodeKt.replaceNodeWithEntry(this.buffer, i2, entryKeyIndex$runtime(i3), objArr[0], objArr[1]));
    }

    private final TrieNode<K, V> updateValueAtIndex(int i2, V v) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        x.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2 + 1] = v;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final V valueAtKeyIndex(int i2) {
        return (V) this.buffer[i2 + 1];
    }

    public final void accept$runtime(s<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ab> sVar) {
        accept(sVar, 0, 0);
    }

    public final boolean containsKey(int i2, K k2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            return x.n(k2, keyAtIndex(entryKeyIndex$runtime(iIndexSegment)));
        }
        if (!hasNodeAt(iIndexSegment)) {
            return false;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(iIndexSegment));
        return i3 == 30 ? trieNodeNodeAtIndex$runtime.collisionContainsKey(k2) : trieNodeNodeAtIndex$runtime.containsKey(i2, k2, i3 + 5);
    }

    public final int entryCount$runtime() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime(int i2) {
        int iBitCount = Integer.bitCount(this.dataMap & (i2 - 1));
        return iBitCount + iBitCount;
    }

    public final V get(int i2, K k2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (x.n(k2, keyAtIndex(iEntryKeyIndex$runtime))) {
                return valueAtKeyIndex(iEntryKeyIndex$runtime);
            }
            return null;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return null;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(iIndexSegment));
        return i3 == 30 ? trieNodeNodeAtIndex$runtime.collisionGet(k2) : trieNodeNodeAtIndex$runtime.get(i2, k2, i3 + 5);
    }

    public final Object[] getBuffer$runtime() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime(int i2) {
        return (this.dataMap & i2) != 0;
    }

    public final TrieNode<K, V> mutablePut(int i2, K k2, V v, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (x.n(k2, keyAtIndex(iEntryKeyIndex$runtime))) {
                persistentHashMapBuilder.setOperationResult$runtime(valueAtKeyIndex(iEntryKeyIndex$runtime));
                return valueAtKeyIndex(iEntryKeyIndex$runtime) == v ? this : mutableUpdateValueAtIndex(iEntryKeyIndex$runtime, v, persistentHashMapBuilder);
            }
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableMoveEntryToNode(iEntryKeyIndex$runtime, iIndexSegment, i2, k2, v, i3, persistentHashMapBuilder.getOwnership());
        }
        if (!hasNodeAt(iIndexSegment)) {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return mutableInsertEntryAt(iIndexSegment, k2, v, persistentHashMapBuilder.getOwnership());
        }
        int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
        TrieNode<K, V> trieNodeMutableCollisionPut = i3 == 30 ? trieNodeNodeAtIndex$runtime.mutableCollisionPut(k2, v, persistentHashMapBuilder) : trieNodeNodeAtIndex$runtime.mutablePut(i2, k2, v, i3 + 5, persistentHashMapBuilder);
        return trieNodeNodeAtIndex$runtime != trieNodeMutableCollisionPut ? mutableUpdateNodeAtIndex(iNodeIndex$runtime, trieNodeMutableCollisionPut, persistentHashMapBuilder.getOwnership()) : this;
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> trieNode, int i2, DeltaCounter deltaCounter, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        int i3 = i2;
        if (i3 > 30) {
            return mutableCollisionPutAll(trieNode, deltaCounter, persistentHashMapBuilder.getOwnership());
        }
        int i4 = this.nodeMap | trieNode.nodeMap;
        int i5 = this.dataMap;
        int i6 = trieNode.dataMap;
        int i7 = i5 ^ i6;
        int i8 = i5 & i6;
        int i9 = (~i4) & i7;
        while (i8 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i8);
            if (x.n(keyAtIndex(entryKeyIndex$runtime(iLowestOneBit)), trieNode.keyAtIndex(trieNode.entryKeyIndex$runtime(iLowestOneBit)))) {
                i9 |= iLowestOneBit;
            } else {
                i4 |= iLowestOneBit;
            }
            i8 ^= iLowestOneBit;
        }
        if ((i4 & i9) != 0) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        if (x.n(this.ownedBy, persistentHashMapBuilder.getOwnership()) && this.dataMap == i9 && this.nodeMap == i4) {
            trieNode2 = this;
        } else {
            int iBitCount = Integer.bitCount(i9);
            trieNode2 = new TrieNode<>(i9, i4, new Object[iBitCount + iBitCount + Integer.bitCount(i4)]);
        }
        int i10 = 0;
        int i11 = i4;
        int i12 = 0;
        while (i11 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i11);
            trieNode2.buffer[(r11.length - 1) - i12] = mutablePutAllFromOtherNodeCell(trieNode, iLowestOneBit2, i3, deltaCounter, persistentHashMapBuilder);
            i11 ^= iLowestOneBit2;
            i12++;
            i3 = i2;
        }
        while (i9 != 0) {
            int i13 = i10 + i10;
            int i14 = i13 + 1;
            int iLowestOneBit3 = Integer.lowestOneBit(i9);
            if (trieNode.hasEntryAt$runtime(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime = trieNode.entryKeyIndex$runtime(iLowestOneBit3);
                trieNode2.buffer[i13] = trieNode.keyAtIndex(iEntryKeyIndex$runtime);
                trieNode2.buffer[i14] = trieNode.valueAtKeyIndex(iEntryKeyIndex$runtime);
                if (hasEntryAt$runtime(iLowestOneBit3)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                }
            } else {
                int iEntryKeyIndex$runtime2 = entryKeyIndex$runtime(iLowestOneBit3);
                trieNode2.buffer[i13] = keyAtIndex(iEntryKeyIndex$runtime2);
                trieNode2.buffer[i14] = valueAtKeyIndex(iEntryKeyIndex$runtime2);
            }
            i9 ^= iLowestOneBit3;
            i10++;
        }
        return !elementsIdentityEquals(trieNode2) ? !trieNode.elementsIdentityEquals(trieNode2) ? trieNode2 : trieNode : this;
    }

    public final TrieNode<K, V> mutableRemove(int i2, K k2, V v, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder2;
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            return (x.n(k2, keyAtIndex(iEntryKeyIndex$runtime)) && x.n(v, valueAtKeyIndex(iEntryKeyIndex$runtime))) ? mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment, persistentHashMapBuilder) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
        if (i3 == 30) {
            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableCollisionRemove(k2, v, persistentHashMapBuilder);
            persistentHashMapBuilder2 = persistentHashMapBuilder;
        } else {
            persistentHashMapBuilder2 = persistentHashMapBuilder;
            trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableRemove(i2, k2, v, i3 + 5, persistentHashMapBuilder2);
        }
        return mutableReplaceNode(trieNodeNodeAtIndex$runtime, trieNodeMutableRemove, iNodeIndex$runtime, iIndexSegment, persistentHashMapBuilder2.getOwnership());
    }

    public final TrieNode<K, V> nodeAtIndex$runtime(int i2) {
        Object obj = this.buffer[i2];
        x.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime(int i2) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (i2 - 1));
    }

    public final ModificationResult<K, V> put(int i2, K k2, V v, int i3) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (!x.n(k2, keyAtIndex(iEntryKeyIndex$runtime))) {
                return moveEntryToNode(iEntryKeyIndex$runtime, iIndexSegment, i2, k2, v, i3).asInsertResult();
            }
            if (valueAtKeyIndex(iEntryKeyIndex$runtime) == v) {
                return null;
            }
            return updateValueAtIndex(iEntryKeyIndex$runtime, v).asUpdateResult();
        }
        if (!hasNodeAt(iIndexSegment)) {
            return insertEntryAt(iIndexSegment, k2, v).asInsertResult();
        }
        int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
        if (i3 == 30) {
            modificationResultPut = trieNodeNodeAtIndex$runtime.collisionPut(k2, v);
            if (modificationResultPut == null) {
                return null;
            }
        } else {
            modificationResultPut = trieNodeNodeAtIndex$runtime.put(i2, k2, v, i3 + 5);
            if (modificationResultPut == null) {
                return null;
            }
        }
        modificationResultPut.setNode(updateNodeAtIndex(iNodeIndex$runtime, iIndexSegment, modificationResultPut.getNode()));
        return modificationResultPut;
    }

    public final TrieNode<K, V> remove(int i2, K k2, V v, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            return (x.n(k2, keyAtIndex(iEntryKeyIndex$runtime)) && x.n(v, valueAtKeyIndex(iEntryKeyIndex$runtime))) ? removeEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
        return replaceNode(trieNodeNodeAtIndex$runtime, i3 == 30 ? trieNodeNodeAtIndex$runtime.collisionRemove(k2, v) : trieNodeNodeAtIndex$runtime.remove(i2, k2, v, i3 + 5), iNodeIndex$runtime, iIndexSegment);
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

    public TrieNode(int i2, int i3, Object[] objArr) {
        this(i2, i3, objArr, null);
    }

    private final TrieNode<K, V> collisionRemove(K k2) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (!x.n(k2, keyAtIndex(iA))) {
                if (iA != iB) {
                    iA += iC;
                }
            }
            return collisionRemoveEntryAtIndex(iA);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K k2, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        h hVarT = n.t(n.u(0, this.buffer.length), 2);
        int iA = hVarT.a();
        int iB = hVarT.b();
        int iC = hVarT.c();
        if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
            while (!x.n(k2, keyAtIndex(iA))) {
                if (iA != iB) {
                    iA += iC;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(iA, persistentHashMapBuilder);
        }
        return this;
    }

    public final TrieNode<K, V> remove(int i2, K k2, int i3) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            return x.n(k2, keyAtIndex(iEntryKeyIndex$runtime)) ? removeEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment) : this;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return this;
        }
        int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
        if (i3 == 30) {
            trieNodeRemove = trieNodeNodeAtIndex$runtime.collisionRemove(k2);
        } else {
            trieNodeRemove = trieNodeNodeAtIndex$runtime.remove(i2, k2, i3 + 5);
        }
        return replaceNode(trieNodeNodeAtIndex$runtime, trieNodeRemove, iNodeIndex$runtime, iIndexSegment);
    }

    public final TrieNode<K, V> mutableRemove(int i2, K k2, int i3, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (x.n(k2, keyAtIndex(iEntryKeyIndex$runtime))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment, persistentHashMapBuilder);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (i3 == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableCollisionRemove(k2, persistentHashMapBuilder);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableRemove(i2, k2, i3 + 5, persistentHashMapBuilder);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime, trieNodeMutableRemove, iNodeIndex$runtime, iIndexSegment, persistentHashMapBuilder.getOwnership());
        }
        return this;
    }
}
