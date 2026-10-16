package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import h.a.c;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i2, E e2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 1];
        c.aL(objArr, objArr2, 0, 0, i2, 6);
        c.at(objArr, objArr2, i2 + 1, i2, length);
        objArr2[i2] = e2;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i2, l<Object, Boolean> lVar) {
        int i3 = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            if (lVar.invoke(objArr[i4]).booleanValue()) {
                objArr2[i2 + i3] = objArr[i4];
                int length = objArr2.length;
                i3++;
            }
        }
        return i3;
    }

    static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i2, l lVar, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            lVar = new l<Object, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // h.g.a.l
                public final Boolean invoke(Object obj2) {
                    return Boolean.valueOf(obj2 != TrieNode.Companion.getEMPTY$runtime());
                }
            };
        }
        int i4 = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (((Boolean) lVar.invoke(objArr[i5])).booleanValue()) {
                objArr2[((i3 & 2) != 0 ? 0 : i2) + i4] = objArr[i5];
                int length = objArr2.length;
                i4++;
            }
        }
        return i4;
    }

    public static final int indexSegment(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i2) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        c.aL(objArr, objArr2, 0, 0, i2, 6);
        c.at(objArr, objArr2, i2, i2 + 1, length);
        return objArr2;
    }
}
