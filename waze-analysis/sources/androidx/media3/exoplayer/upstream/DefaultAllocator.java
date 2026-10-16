package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.Allocator;
import com.google.d.b.an;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultAllocator implements Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z, int i2, int i3) {
        an.l(i2 > 0);
        an.l(i3 >= 0);
        this.trimOnReset = z;
        this.individualAllocationSize = i2;
        this.availableCount = i3;
        this.availableAllocations = new Allocation[i3 + 100];
        if (i3 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i3 * i2];
        for (int i4 = 0; i4 < i3; i4++) {
            this.availableAllocations[i4] = new Allocation(this.initialAllocationBlock, i4 * i2);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        this.allocatedCount++;
        int i2 = this.availableCount;
        if (i2 > 0) {
            Allocation[] allocationArr = this.availableAllocations;
            int i3 = i2 - 1;
            this.availableCount = i3;
            allocation = allocationArr[i3];
            an.B(allocation);
            this.availableAllocations[this.availableCount] = null;
        } else {
            Allocation allocation2 = new Allocation(new byte[this.individualAllocationSize], 0);
            int i4 = this.allocatedCount;
            Allocation[] allocationArr2 = this.availableAllocations;
            int length = allocationArr2.length;
            if (i4 > length) {
                this.availableAllocations = (Allocation[]) Arrays.copyOf(allocationArr2, length + length);
                return allocation2;
            }
            allocation = allocation2;
        }
        return allocation;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    public synchronized int getUnusedBytesAllocated() {
        return this.availableCount * this.individualAllocationSize;
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            Allocation[] allocationArr = this.availableAllocations;
            int i2 = this.availableCount;
            this.availableCount = i2 + 1;
            allocationArr[i2] = allocationNode.getAllocation();
            this.allocatedCount--;
            allocationNode = allocationNode.next();
        }
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i2) {
        int i3 = this.targetBufferSize;
        this.targetBufferSize = i2;
        if (i2 < i3) {
            trim();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r0 < r2) goto L22;
     */
    @Override // androidx.media3.exoplayer.upstream.Allocator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void trim() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.targetBufferSize     // Catch: java.lang.Throwable -> L65
            int r1 = r8.individualAllocationSize     // Catch: java.lang.Throwable -> L65
            int r0 = androidx.media3.common.util.Util.ceilDivide(r0, r1)     // Catch: java.lang.Throwable -> L65
            int r1 = r8.allocatedCount     // Catch: java.lang.Throwable -> L65
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L65
            int r2 = r8.availableCount     // Catch: java.lang.Throwable -> L65
            if (r0 < r2) goto L16
            goto L59
        L16:
            byte[] r3 = r8.initialAllocationBlock     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L5b
            int r2 = r2 + (-1)
        L1c:
            if (r1 > r2) goto L50
            androidx.media3.exoplayer.upstream.Allocation[] r3 = r8.availableAllocations     // Catch: java.lang.Throwable -> L65
            r3 = r3[r1]     // Catch: java.lang.Throwable -> L65
            com.google.d.b.an.B(r3)     // Catch: java.lang.Throwable -> L65
            r4 = r3
            androidx.media3.exoplayer.upstream.Allocation r4 = (androidx.media3.exoplayer.upstream.Allocation) r4     // Catch: java.lang.Throwable -> L65
            byte[] r4 = r3.data     // Catch: java.lang.Throwable -> L65
            byte[] r5 = r8.initialAllocationBlock     // Catch: java.lang.Throwable -> L65
            if (r4 != r5) goto L31
            int r1 = r1 + 1
            goto L1c
        L31:
            int r4 = r2 + (-1)
            androidx.media3.exoplayer.upstream.Allocation[] r5 = r8.availableAllocations     // Catch: java.lang.Throwable -> L65
            r5 = r5[r2]     // Catch: java.lang.Throwable -> L65
            com.google.d.b.an.B(r5)     // Catch: java.lang.Throwable -> L65
            r6 = r5
            androidx.media3.exoplayer.upstream.Allocation r6 = (androidx.media3.exoplayer.upstream.Allocation) r6     // Catch: java.lang.Throwable -> L65
            byte[] r6 = r5.data     // Catch: java.lang.Throwable -> L65
            byte[] r7 = r8.initialAllocationBlock     // Catch: java.lang.Throwable -> L65
            if (r6 == r7) goto L45
            r2 = r4
            goto L1c
        L45:
            int r6 = r1 + 1
            androidx.media3.exoplayer.upstream.Allocation[] r7 = r8.availableAllocations     // Catch: java.lang.Throwable -> L65
            r7[r1] = r5     // Catch: java.lang.Throwable -> L65
            r7[r2] = r3     // Catch: java.lang.Throwable -> L65
            r2 = r4
            r1 = r6
            goto L1c
        L50:
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L65
            int r2 = r8.availableCount     // Catch: java.lang.Throwable -> L65
            if (r0 >= r2) goto L59
            goto L5b
        L59:
            monitor-exit(r8)
            return
        L5b:
            androidx.media3.exoplayer.upstream.Allocation[] r1 = r8.availableAllocations     // Catch: java.lang.Throwable -> L65
            r3 = 0
            java.util.Arrays.fill(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L65
            r8.availableCount = r0     // Catch: java.lang.Throwable -> L65
            monitor-exit(r8)
            return
        L65:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L65
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.upstream.DefaultAllocator.trim():void");
    }

    @Override // androidx.media3.exoplayer.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.availableAllocations;
        int i2 = this.availableCount;
        this.availableCount = i2 + 1;
        allocationArr[i2] = allocation;
        this.allocatedCount--;
    }

    public DefaultAllocator(boolean z, int i2) {
        this(z, i2, 0);
    }
}
