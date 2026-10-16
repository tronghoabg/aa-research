package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import h.a.c;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i2, K k2, V v) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 2];
        c.aL(objArr, objArr2, 0, 0, i2, 6);
        c.at(objArr, objArr2, i2 + 2, i2, length);
        objArr2[i2] = k2;
        objArr2[i2 + 1] = v;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeEntryAtIndex(Object[] objArr, int i2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 2];
        c.aL(objArr, objArr2, 0, 0, i2, 6);
        c.at(objArr, objArr2, i2, i2 + 2, length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeNodeAtIndex(Object[] objArr, int i2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        c.aL(objArr, objArr2, 0, 0, i2, 6);
        c.at(objArr, objArr2, i2, i2 + 1, length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] replaceEntryWithNode(Object[] objArr, int i2, int i3, TrieNode<?, ?> trieNode) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        c.aL(objArr, objArr2, 0, 0, i2, 6);
        c.at(objArr, objArr2, i2, i2 + 2, i3);
        objArr2[i3 - 2] = trieNode;
        c.at(objArr, objArr2, i3 - 1, i3, length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i2, int i3, K k2, V v) {
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        x.e(objArrCopyOf, "copyOf(...)");
        c.at(objArrCopyOf, objArrCopyOf, i2 + 2, i2 + 1, length);
        c.at(objArrCopyOf, objArrCopyOf, i3 + 2, i3, i2);
        objArrCopyOf[i3] = k2;
        objArrCopyOf[i3 + 1] = v;
        return objArrCopyOf;
    }
}
