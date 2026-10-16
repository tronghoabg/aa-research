package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.composer.GroupInfo;
import androidx.compose.runtime.composer.gapbuffer.BitVector;
import androidx.compose.runtime.composer.linkbuffer.GroupHandleKt;
import androidx.compose.runtime.composer.linkbuffer.KeyInfo;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LinkPending {
    private int groupIndex;
    private final MutableIntObjectMap<GroupInfo> groupInfos;
    private final List<KeyInfo> keyInfos;
    private final f keyMap$delegate;
    private final BitVector placedGroups = new BitVector();
    private final int startIndex;
    private final List<KeyInfo> usedKeys;

    public LinkPending(List<KeyInfo> list, int i2) {
        this.keyInfos = list;
        this.startIndex = i2;
        if (i2 < 0) {
            PreconditionsKt.throwIllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = new MutableIntObjectMap<>(0, 1, null);
        int size = this.keyInfos.size();
        int nodes = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = this.keyInfos.get(i3);
            mutableIntObjectMap.set(GroupHandleKt.getGroup(keyInfo.getHandle()), new GroupInfo(i3, nodes, keyInfo.getNodes()));
            nodes += keyInfo.getNodes();
        }
        this.groupInfos = mutableIntObjectMap;
        this.keyMap$delegate = g.a(new a<MultiValueMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.LinkPending$keyMap$2
            @Override // h.g.a.a
            public /* bridge */ /* synthetic */ MultiValueMap<Object, KeyInfo> invoke() {
                return MultiValueMap.m7357boximpl(m7309invokefVlnmYg());
            }

            /* renamed from: invoke-fVlnmYg, reason: not valid java name */
            public final MutableScatterMap<Object, Object> m7309invokefVlnmYg() {
                MutableScatterMap<Object, Object> mutableScatterMapMultiMap = LinkComposerKt.multiMap(this.this$0.getKeyInfos().size());
                LinkPending linkPending = this.this$0;
                int size2 = linkPending.getKeyInfos().size();
                for (int i4 = 0; i4 < size2; i4++) {
                    KeyInfo keyInfo2 = linkPending.getKeyInfos().get(i4);
                    MultiValueMap.m7356addimpl(mutableScatterMapMultiMap, keyInfo2.getJoinedKey(), keyInfo2);
                }
                return mutableScatterMapMultiMap;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<KeyInfo> getKeyInfos() {
        return this.keyInfos;
    }

    /* renamed from: getKeyMap-fVlnmYg, reason: not valid java name */
    public final MutableScatterMap<Object, Object> m7308getKeyMapfVlnmYg() {
        return ((MultiValueMap) this.keyMap$delegate.getValue()).m7375unboximpl();
    }

    public final KeyInfo getNext(int i2, Object obj) {
        return (KeyInfo) MultiValueMap.m7370removeFirstimpl(m7308getKeyMapfVlnmYg(), obj != null ? new JoinedKey(Integer.valueOf(i2), obj) : Integer.valueOf(i2));
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<KeyInfo> getUsed() {
        return this.usedKeys;
    }

    public final long groupHandleOfNextUnmovedGroup() {
        return this.keyInfos.get(this.placedGroups.nextClear(0)).getHandle();
    }

    public final void markGroupLocationReconciled(int i2) {
        this.placedGroups.set(i2, true);
    }

    public final int nodePositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(GroupHandleKt.getGroup(keyInfo.getHandle()));
        if (groupInfo != null) {
            return groupInfo.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(KeyInfo keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void registerInsert(KeyInfo keyInfo, int i2) {
        this.groupInfos.set(GroupHandleKt.getGroup(keyInfo.getHandle()), new GroupInfo(-1, i2, 0));
    }

    public final void registerMoveNode(int i2, int i3, int i4) {
        char c2;
        long j2;
        char c3;
        long j3;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        if (i2 > i3) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << c4) & j5 & j4) != j4) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            c3 = c4;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i5 << 3) + i7];
                            j3 = j4;
                            int nodeIndex = groupInfo.getNodeIndex();
                            if (i2 <= nodeIndex && nodeIndex < i2 + i4) {
                                groupInfo.setNodeIndex((nodeIndex - i2) + i3);
                            } else if (i3 <= nodeIndex && nodeIndex < i2) {
                                groupInfo.setNodeIndex(nodeIndex + i4);
                            }
                        } else {
                            c3 = c4;
                            j3 = j4;
                        }
                        j5 >>= 8;
                        i7++;
                        c4 = c3;
                        j4 = j3;
                    }
                    c2 = c4;
                    j2 = j4;
                    if (i6 != 8) {
                        return;
                    }
                } else {
                    c2 = c4;
                    j2 = j4;
                }
                if (i5 == length) {
                    return;
                }
                i5++;
                c4 = c2;
                j4 = j2;
            }
        } else {
            if (i3 <= i2) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                long j6 = jArr2[i8];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j6 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i8 << 3) + i10];
                            int nodeIndex2 = groupInfo2.getNodeIndex();
                            if (i2 <= nodeIndex2 && nodeIndex2 < i2 + i4) {
                                groupInfo2.setNodeIndex((nodeIndex2 - i2) + i3);
                            } else if (i2 + 1 <= nodeIndex2 && nodeIndex2 < i3) {
                                groupInfo2.setNodeIndex(nodeIndex2 - i4);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i9 != 8) {
                        return;
                    }
                }
                if (i8 == length2) {
                    return;
                } else {
                    i8++;
                }
            }
        }
    }

    public final void registerMoveSlot(int i2, int i3) {
        char c2;
        long j2;
        char c3;
        long j3;
        char c4 = 7;
        long j4 = -9187201950435737472L;
        if (i2 > i3) {
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
            Object[] objArr = mutableIntObjectMap.values;
            long[] jArr = mutableIntObjectMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << c4) & j5 & j4) != j4) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            c3 = c4;
                            GroupInfo groupInfo = (GroupInfo) objArr[(i4 << 3) + i6];
                            j3 = j4;
                            int slotIndex = groupInfo.getSlotIndex();
                            if (slotIndex == i2) {
                                groupInfo.setSlotIndex(i3);
                            } else if (i3 <= slotIndex && slotIndex < i2) {
                                groupInfo.setSlotIndex(slotIndex + 1);
                            }
                        } else {
                            c3 = c4;
                            j3 = j4;
                        }
                        j5 >>= 8;
                        i6++;
                        c4 = c3;
                        j4 = j3;
                    }
                    c2 = c4;
                    j2 = j4;
                    if (i5 != 8) {
                        return;
                    }
                } else {
                    c2 = c4;
                    j2 = j4;
                }
                if (i4 == length) {
                    return;
                }
                i4++;
                c4 = c2;
                j4 = j2;
            }
        } else {
            if (i3 <= i2) {
                return;
            }
            MutableIntObjectMap<GroupInfo> mutableIntObjectMap2 = this.groupInfos;
            Object[] objArr2 = mutableIntObjectMap2.values;
            long[] jArr2 = mutableIntObjectMap2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                long j6 = jArr2[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((j6 & 255) < 128) {
                            GroupInfo groupInfo2 = (GroupInfo) objArr2[(i7 << 3) + i9];
                            int slotIndex2 = groupInfo2.getSlotIndex();
                            if (slotIndex2 == i2) {
                                groupInfo2.setSlotIndex(i3);
                            } else if (i2 + 1 <= slotIndex2 && slotIndex2 < i3) {
                                groupInfo2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return;
                    }
                }
                if (i7 == length2) {
                    return;
                } else {
                    i7++;
                }
            }
        }
    }

    public final void setGroupIndex(int i2) {
        this.groupIndex = i2;
    }

    public final int slotPositionOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(GroupHandleKt.getGroup(keyInfo.getHandle()));
        if (groupInfo != null) {
            return groupInfo.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i2, int i3) {
        int i4;
        int nodeIndex;
        GroupInfo groupInfo = this.groupInfos.get(i2);
        if (groupInfo == null) {
            return false;
        }
        int nodeIndex2 = groupInfo.getNodeIndex();
        int nodeCount = i3 - groupInfo.getNodeCount();
        groupInfo.setNodeCount(i3);
        if (nodeCount == 0) {
            return true;
        }
        MutableIntObjectMap<GroupInfo> mutableIntObjectMap = this.groupInfos;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr[i5];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = i5 - length;
                int i7 = 0;
                while (true) {
                    i4 = 8 - ((~i6) >>> 31);
                    if (i7 >= i4) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i5 << 3) + i7];
                        if (groupInfo2.getNodeIndex() >= nodeIndex2 && !x.n(groupInfo2, groupInfo) && (nodeIndex = groupInfo2.getNodeIndex() + nodeCount) >= 0) {
                            groupInfo2.setNodeIndex(nodeIndex);
                        }
                    }
                    j2 >>= 8;
                    i7++;
                }
                if (i4 != 8) {
                    return true;
                }
            }
            if (i5 == length) {
                return true;
            }
            i5++;
        }
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo) {
        GroupInfo groupInfo = this.groupInfos.get(GroupHandleKt.getGroup(keyInfo.getHandle()));
        return groupInfo != null ? groupInfo.getNodeCount() : keyInfo.getNodes();
    }
}
