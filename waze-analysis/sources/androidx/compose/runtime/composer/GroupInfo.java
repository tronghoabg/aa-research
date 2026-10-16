package androidx.compose.runtime.composer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class GroupInfo {
    public static final int $stable = 8;
    private int nodeCount;
    private int nodeIndex;
    private int slotIndex;

    public GroupInfo(int i2, int i3, int i4) {
        this.slotIndex = i2;
        this.nodeIndex = i3;
        this.nodeCount = i4;
    }

    public final int getNodeCount() {
        return this.nodeCount;
    }

    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void setNodeCount(int i2) {
        this.nodeCount = i2;
    }

    public final void setNodeIndex(int i2) {
        this.nodeIndex = i2;
    }

    public final void setSlotIndex(int i2) {
        this.slotIndex = i2;
    }
}
