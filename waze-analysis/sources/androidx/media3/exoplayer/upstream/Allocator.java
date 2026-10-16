package androidx.media3.exoplayer.upstream;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Allocator {

    /* compiled from: WazeSource */
    public interface AllocationNode {
        Allocation getAllocation();

        AllocationNode next();
    }

    Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(Allocation allocation);

    void release(AllocationNode allocationNode);

    void trim();
}
