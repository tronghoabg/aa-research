package androidx.compose.runtime.composer.linkbuffer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GroupFlagsKt {
    public static final int HasAuxSlotFlag = 33554432;
    public static final int HasMarkFlags = -1476395008;
    public static final int HasMovableContentFlag = 536870912;
    public static final int HasObjectKeyFlag = 16777216;
    public static final int HasRecompositionRequiredFlag = 134217728;
    public static final int HasSubcompositionContextFlag = Integer.MIN_VALUE;
    public static final int IsMarkFlags = 1409286144;
    public static final int IsMovableContentFlag = 268435456;
    public static final int IsNodeFlag = 8388608;
    public static final int IsRecompositionRequiredFlag = 67108864;
    public static final int IsSubcompositionContextFlag = 1073741824;
    public static final int UtilitySlotsMask = 58720256;

    public static final int auxSlotIndex(int i2) {
        return Integer.bitCount(i2 & 25165824);
    }

    public static final int groupFlagsChildNodeCount(int i2) {
        return i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public static final boolean groupFlagsIsMarkedDeleted(int i2) {
        return (i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK) == 8388607;
    }

    public static final int groupFlagsNodeCount(int i2) {
        if ((i2 & 8388608) == 8388608) {
            return 1;
        }
        return i2 & GroupFlagsSpec.CHILD_NODE_COUNT_MASK;
    }

    public static final int nodeSlotIndex(int i2) {
        return 0;
    }

    public static final int objectKeySlotIndex(int i2) {
        return Integer.bitCount(i2 & 8388608);
    }

    public static final int propagatingFlagsOf(int i2) {
        int i3 = 1409286144 & i2;
        return (i2 & HasMarkFlags) | (i3 + i3);
    }

    public static final int utilitySlotsCountForFlags(int i2) {
        return Integer.bitCount(i2 & UtilitySlotsMask);
    }

    public static final int groupFlagsChildNodeCount(int i2, int i3) {
        return (i2 & (-8388608)) | i3;
    }
}
