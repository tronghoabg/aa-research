package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace;
import androidx.compose.runtime.composer.linkbuffer.SlotTableReader;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkComposerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final LinkComposer asLinkComposer(Composer composer) {
        LinkComposer linkComposer = composer instanceof LinkComposer ? (LinkComposer) composer : null;
        if (linkComposer != null) {
            return linkComposer;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }

    public static final LinkRememberObserverHolder asLinkRememberObserverHolder(RememberObserverHolder rememberObserverHolder) {
        LinkRememberObserverHolder linkRememberObserverHolder = rememberObserverHolder instanceof LinkRememberObserverHolder ? (LinkRememberObserverHolder) rememberObserverHolder : null;
        if (linkRememberObserverHolder != null) {
            return linkRememberObserverHolder;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }

    private static final <T> ScatterSet<T> buildScatterSet(l<? super MutableScatterSet<T>, ab> lVar) {
        MutableScatterSet mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
        lVar.invoke(mutableScatterSetMutableScatterSetOf);
        return mutableScatterSetMutableScatterSetOf;
    }

    private static final boolean childOf(SlotTableAddressSpace slotTableAddressSpace, int i2, int i3) {
        int[] groups = slotTableAddressSpace.getGroups();
        int i4 = i3;
        while (i4 > 0) {
            if (i4 == i2) {
                return true;
            }
            i4 = groups[i4 + 2];
        }
        if (i4 != 0) {
            return false;
        }
        ComposerKt.composeImmediateRuntimeError("Traversing parent of group not in the slot table: " + i3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList = new ArrayList();
        SlotTableReader slotTableReaderOpenReader = slotTable.openReader();
        try {
            SlotTableAddressSpace slotTableAddressSpace = slotTableReaderOpenReader.addressSpace;
            if (i2 >= 0) {
                IntStack intStack = new IntStack();
                int[] groups = slotTableAddressSpace.getGroups();
                int iPop = i2;
                while (true) {
                    if (slotTableReaderOpenReader.isNode(iPop)) {
                        arrayList.add(slotTableReaderOpenReader.node(iPop));
                        z = false;
                    } else {
                        z = true;
                    }
                    if (iPop != i2 && (i3 = groups[iPop + 1]) >= 0) {
                        intStack.push(i3);
                    }
                    iPop = groups[iPop + 3];
                    if (!z || iPop < 0) {
                        if (intStack.tos == 0) {
                            break;
                        }
                        iPop = intStack.pop();
                    }
                }
            }
            return arrayList;
        } finally {
            slotTableReaderOpenReader.close();
        }
    }

    private static final int findFirstSibling(SlotTableAddressSpace slotTableAddressSpace, int i2, int i3, int i4) {
        if (i3 != -1) {
            if (i4 != -1) {
                int[] groups = slotTableAddressSpace.getGroups();
                for (int i5 = groups[i2 + 3]; i5 > 0; i5 = groups[i5 + 1]) {
                    if (i5 != i3) {
                        if (i5 != i4) {
                        }
                    }
                }
                ComposerKt.composeRuntimeError("Unexpected slot table structure");
                throw new e();
            }
            return i3;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* renamed from: findInvalidations-Vpaz1Sg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<h.k<androidx.compose.runtime.RecomposeScopeImpl, java.lang.Object>> m7307findInvalidationsVpaz1Sg(androidx.compose.runtime.composer.linkbuffer.SlotTableReader r18, int r19, androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r20) {
        /*
            r0 = r19
            boolean r1 = androidx.compose.runtime.collection.ScopeMap.m7393isEmptyimpl(r20)
            if (r1 == 0) goto Ld
            java.util.List r0 = h.a.i.h()
            return r0
        Ld:
            java.util.List r1 = h.a.i.b()
            androidx.collection.MutableScatterSet r2 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            androidx.compose.runtime.composer.linkbuffer.SlotTable r3 = r18.getTable()
            androidx.compose.runtime.composer.linkbuffer.SlotTableAddressSpace r3 = r3.getAddressSpace()
            if (r0 < 0) goto L4f
            androidx.compose.runtime.IntStack r4 = new androidx.compose.runtime.IntStack
            r4.<init>()
            int[] r3 = r3.getGroups()
            r5 = r18
            r6 = r0
        L2b:
            androidx.compose.runtime.RecomposeScopeImpl r7 = getRecomposeScopeOrNull(r5, r6)
            if (r7 == 0) goto L34
            r2.add(r7)
        L34:
            if (r6 == r0) goto L3f
            int r7 = r6 + 1
            r7 = r3[r7]
            if (r7 < 0) goto L3f
            r4.push(r7)
        L3f:
            int r6 = r6 + 3
            r6 = r3[r6]
            if (r6 >= 0) goto L2b
            int r6 = r4.tos
            if (r6 != 0) goto L4a
            goto L4f
        L4a:
            int r6 = r4.pop()
            goto L2b
        L4f:
            androidx.collection.ScatterSet r2 = (androidx.collection.ScatterSet) r2
            r0 = r20
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r3 = r0.keys
            java.lang.Object[] r4 = r0.values
            long[] r0 = r0.metadata
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto Lae
            r6 = 0
            r7 = r6
        L62:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto La9
            int r10 = r7 - r5
            r11 = r6
        L75:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto La7
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto La3
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r12 = r4[r12]
            java.lang.String r15 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"
            h.g.b.x.d(r14, r15)
            androidx.compose.runtime.RecomposeScopeImpl r14 = (androidx.compose.runtime.RecomposeScopeImpl) r14
            boolean r15 = r2.contains(r14)
            if (r15 == 0) goto La3
            h.k r15 = new h.k
            r15.<init>(r14, r12)
            r1.add(r15)
        La3:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L75
        La7:
            if (r12 != r13) goto Lae
        La9:
            if (r7 == r5) goto Lae
            int r7 = r7 + 1
            goto L62
        Lae:
            java.util.List r0 = h.a.i.a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.LinkComposerKt.m7307findInvalidationsVpaz1Sg(androidx.compose.runtime.composer.linkbuffer.SlotTableReader, int, androidx.collection.MutableScatterMap):java.util.List");
    }

    public static final Integer findSubcompositionContextGroup(SlotTable slotTable, CompositionContext compositionContext) {
        int i2;
        SlotTableReader slotTableReaderOpenReader = slotTable.openReader();
        try {
            int root = slotTable.getRoot();
            int iFirstChildOf = slotTableReaderOpenReader.firstChildOf(root);
            loop0: while (iFirstChildOf != -1) {
                if ((slotTable.groupFlags$runtime(iFirstChildOf) & 1073741824) == 1073741824 && (i2 = slotTable.getGroups()[iFirstChildOf + 5]) != -1) {
                    SlotTableAddressSpace addressSpace = slotTable.getAddressSpace();
                    int i3 = i2 & 15;
                    int i4 = i2 >> 4;
                    int i5 = i3 + 1;
                    if (i5 > 15) {
                        i5 = addressSpace.getLargeSizes().get(i4);
                    }
                    for (int i6 = 0; i6 < i5; i6++) {
                        Object obj = slotTable.getSlots()[i4 + i6];
                        if (x.n(obj, Composer.Companion.getEmpty())) {
                            break;
                        }
                        RememberObserverHolder rememberObserverHolder = obj instanceof RememberObserverHolder ? (RememberObserverHolder) obj : null;
                        RememberObserver wrapped = rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null;
                        LinkComposer.CompositionContextHolder compositionContextHolder = wrapped instanceof LinkComposer.CompositionContextHolder ? (LinkComposer.CompositionContextHolder) wrapped : null;
                        if (compositionContextHolder != null && x.n(compositionContextHolder.getRef(), compositionContext)) {
                            return Integer.valueOf(iFirstChildOf);
                        }
                    }
                }
                int iFirstChildOf2 = slotTableReaderOpenReader.firstChildOf(iFirstChildOf);
                if (iFirstChildOf2 == -1 || (slotTable.groupFlags$runtime(iFirstChildOf) & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    int iParentOf = iFirstChildOf;
                    iFirstChildOf = slotTableReaderOpenReader.nextSiblingOf(iFirstChildOf);
                    while (iFirstChildOf == -1) {
                        iParentOf = slotTableReaderOpenReader.parentOf(iParentOf);
                        if (iParentOf == -1 || iParentOf == root) {
                            break loop0;
                        }
                        iFirstChildOf = slotTableReaderOpenReader.nextSiblingOf(iParentOf);
                    }
                } else {
                    iFirstChildOf = iFirstChildOf2;
                }
            }
            return null;
        } finally {
            slotTableReaderOpenReader.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r2 != r3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        if (r3 == r2) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long firstGroupInTopologicalOrder(androidx.compose.runtime.composer.linkbuffer.SlotTable r10, long r11, long r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.LinkComposerKt.firstGroupInTopologicalOrder(androidx.compose.runtime.composer.linkbuffer.SlotTable, long, long):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (x.n(joinedKey.getLeft(), obj2) && x.n(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    public static final RecomposeScopeImpl getRecomposeScopeOrNull(SlotTableReader slotTableReader, int i2) {
        Object orNull = slotTableReader.getOrNull(i2, 0);
        if (orNull instanceof RecomposeScopeImpl) {
            return (RecomposeScopeImpl) orNull;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isInsertHandle(long j2) {
        return GroupHandleKt.getGroup(j2) < -8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> MutableScatterMap<Object, Object> multiMap(int i2) {
        return new MutableScatterMap<>(i2);
    }

    private static final long toGroupHandle(int i2) {
        return i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toInsertAddress(long j2) {
        return (((-10) - GroupHandleKt.getGroup(j2)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (GroupHandleKt.getContext(j2) << 32);
    }

    private static final long toGroupHandle(long j2) {
        return j2;
    }

    public static final ReusableLinkRememberObserverHolder asLinkRememberObserverHolder(ReusableRememberObserverHolder reusableRememberObserverHolder) {
        ReusableLinkRememberObserverHolder reusableLinkRememberObserverHolder = reusableRememberObserverHolder instanceof ReusableLinkRememberObserverHolder ? (ReusableLinkRememberObserverHolder) reusableRememberObserverHolder : null;
        if (reusableLinkRememberObserverHolder != null) {
            return reusableLinkRememberObserverHolder;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        throw new e();
    }
}
