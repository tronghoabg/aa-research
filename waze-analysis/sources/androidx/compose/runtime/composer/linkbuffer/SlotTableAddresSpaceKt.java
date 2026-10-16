package androidx.compose.runtime.composer.linkbuffer;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilder;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import h.a.c;
import h.g.b.x;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SlotTableAddresSpaceKt {
    public static final int LAZY_ADDRESS = 0;
    public static final int NULL_ADDRESS = -1;
    private static final int SLOT_TABLE_GROUP_CHILD_OFFSET = 3;
    private static final int SLOT_TABLE_GROUP_FLAGS_OFFSET = 4;
    private static final int SLOT_TABLE_GROUP_KEY_OFFSET = 0;
    private static final int SLOT_TABLE_GROUP_NEXT_OFFSET = 1;
    private static final int SLOT_TABLE_GROUP_PARENT_OFFSET = 2;
    public static final int SLOT_TABLE_GROUP_SIZE = 6;
    private static final int SLOT_TABLE_GROUP_SLOTS_OFFSET = 5;
    private static final int SLOT_TABLE_INITIAL_GROUPS_SIZE = 768;
    private static final int SLOT_TABLE_INITIAL_SLOTS_SIZE = 256;
    private static final int SLOT_TABLE_SLOT_LARGE_SENTINEL = 15;
    public static final int SLOT_TABLE_SLOT_MAX_SMALL_SIZE = 15;
    private static final int SLOT_TABLE_SLOT_MOVE_BUFFER_SIZE = 8;
    public static final int SLOT_TABLE_SLOT_SHIFT = 4;
    private static final int SLOT_TABLE_SLOT_SMALL_SIZE_MASK = 15;
    private static final Object Unallocated = new Object() { // from class: androidx.compose.runtime.composer.linkbuffer.SlotTableAddresSpaceKt$Unallocated$1
        public String toString() {
            return "Unallocated";
        }
    };

    private static final boolean allUnallocated(Object[] objArr, int i2, int i3) {
        int i4 = i3 + i2;
        if (i4 >= objArr.length) {
            return false;
        }
        while (i2 < i4) {
            if (objArr[i2] != Unallocated) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static final List<ComposeStackTraceFrame> buildTrace(SlotTableAddressSpace slotTableAddressSpace, int i2, Object obj, ComposeStackTraceBuilder composeStackTraceBuilder) {
        int[] groups = slotTableAddressSpace.getGroups();
        int i3 = i2;
        while (i3 > 0) {
            int i4 = slotTableAddressSpace.getGroups()[i3 + 4];
            composeStackTraceBuilder.processEdge(slotTableAddressSpace.getGroups()[i3], (i4 & 16777216) == 16777216 ? slotTableAddressSpace.getSlots()[(slotTableAddressSpace.getGroups()[i3 + 5] >> 4) + Integer.bitCount(i4 & 8388608)] : null, slotTableAddressSpace.sourceInformationOf(i3), obj);
            obj = slotTableAddressSpace.anchorOfAddress(i3);
            i3 = groups[i3 + 2];
        }
        if (i3 == 0) {
            ComposerKt.composeImmediateRuntimeError(a.a(i2, "Traversing parent of group not in the slot table: "));
        }
        return composeStackTraceBuilder.trace();
    }

    private static final void clearRange(Object[] objArr, int i2, int i3) {
        if (i3 == i2 + 1) {
            objArr[i2] = Unallocated;
            return;
        }
        Object obj = Unallocated;
        x.f(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int groupAllocate(int[] iArr, int i2, int i3, int i4) {
        int length;
        if (iArr != null && (length = iArr.length) >= 6) {
            int i5 = iArr[3];
            if (i5 >= length) {
                i5 = iArr[1];
                if (i5 >= 0) {
                    iArr[1] = iArr[i5 + 1];
                }
            } else {
                iArr[3] = i5 + 6;
            }
            iArr[i5] = i2;
            iArr[i5 + 2] = i3;
            iArr[i5 + 1] = -1;
            iArr[i5 + 3] = -1;
            iArr[i5 + 4] = i4;
            iArr[i5 + 5] = -1;
            return i5;
        }
        return -1;
    }

    public static final int groupChild(int[] iArr, int i2) {
        return iArr[i2 + 3];
    }

    public static final int groupChildNodeCount(int[] iArr, int i2, int i3) {
        int i4 = i2 + 4;
        int i5 = i3 | (iArr[i4] & (-8388608));
        iArr[i4] = i5;
        return i5;
    }

    public static final int groupFlags(int[] iArr, int i2) {
        return iArr[i2 + 4];
    }

    public static final int groupKey(int[] iArr, int i2) {
        return iArr[i2];
    }

    public static final int groupNext(int[] iArr, int i2) {
        return iArr[i2 + 1];
    }

    public static final int groupNodeCount(int[] iArr, int i2) {
        int i3 = iArr[i2 + 4];
        if ((i3 & 8388608) == 8388608) {
            return 1;
        }
        return i3 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public static final int groupParent(int[] iArr, int i2) {
        return iArr[i2 + 2];
    }

    public static final int groupSlotRange(int[] iArr, int i2) {
        return iArr[i2 + 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initGroups(int[] iArr, int i2) {
        if (iArr == null) {
            return;
        }
        iArr[1] = -1;
        iArr[3] = i2;
    }

    public static final boolean isLargeSlotRangeSize(int i2) {
        return i2 > 15;
    }

    public static final boolean isUnallocated(Object obj) {
        return x.n(obj, Unallocated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] newGroupsArray(int i2) {
        int[] iArr = new int[i2];
        iArr[1] = -1;
        initGroups(iArr, 6);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] newSlotsArray(int i2) {
        Object[] objArr = new Object[i2];
        c.j(objArr, Unallocated, 0, objArr.length);
        return objArr;
    }

    public static final int slotAddressOf(int i2) {
        return i2 >> 4;
    }

    public static final int slotRangeFromAddressAndSize(int i2, int i3) {
        return (i2 << 4) | (i3 <= 15 ? i3 - 1 : 15);
    }

    public static final int slotSmallSizeOf(int i2) {
        return (i2 & 15) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int validateFreeList(int[] iArr) {
        int i2 = iArr[1];
        MutableIntSet mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
        while (i2 > 0) {
            if (!mutableIntSetMutableIntSetOf.contains(i2)) {
                mutableIntSetMutableIntSetOf.add(i2);
                int i3 = iArr[i2 + 1];
                if (i3 == -1) {
                    break;
                }
                if (i3 % 6 != 0 || i3 < 0) {
                    throw new IllegalStateException(a.a(i2, "Invalid free link at "));
                }
                i2 = i3;
            } else {
                throw new IllegalStateException(a.a(i2, "Loop at "));
            }
        }
        return mutableIntSetMutableIntSetOf.getSize();
    }

    public static final void groupKey(int[] iArr, int i2, int i3) {
        iArr[i2] = i3;
    }

    public static final void groupChild(int[] iArr, int i2, int i3) {
        iArr[i2 + 3] = i3;
    }

    public static final void groupFlags(int[] iArr, int i2, int i3) {
        iArr[i2 + 4] = i3;
    }

    public static final void groupNext(int[] iArr, int i2, int i3) {
        iArr[i2 + 1] = i3;
    }

    public static final void groupParent(int[] iArr, int i2, int i3) {
        iArr[i2 + 2] = i3;
    }

    public static final void groupSlotRange(int[] iArr, int i2, int i3) {
        iArr[i2 + 5] = i3;
    }

    public static final int groupChildNodeCount(int[] iArr, int i2) {
        return iArr[i2 + 4] & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }
}
