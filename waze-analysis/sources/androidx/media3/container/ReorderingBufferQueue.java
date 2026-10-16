package androidx.media3.container;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ReorderingBufferQueue {
    private BuffersWithTimestamp lastQueuedBuffer;
    private final OutputConsumer outputConsumer;
    private final ArrayDeque<ParsableByteArray> unusedParsableByteArrays = new ArrayDeque<>();
    private final ArrayDeque<BuffersWithTimestamp> unusedBuffersWithTimestamp = new ArrayDeque<>();
    private final PriorityQueue<BuffersWithTimestamp> pendingBuffers = new PriorityQueue<>();
    private int reorderingQueueSize = -1;

    /* compiled from: WazeSource */
    final class BuffersWithTimestamp implements Comparable<BuffersWithTimestamp> {
        public long presentationTimeUs = C.TIME_UNSET;
        public final List<ParsableByteArray> nalBuffers = new ArrayList();

        @Override // java.lang.Comparable
        public int compareTo(BuffersWithTimestamp buffersWithTimestamp) {
            return Long.compare(this.presentationTimeUs, buffersWithTimestamp.presentationTimeUs);
        }

        public void init(long j2, ParsableByteArray parsableByteArray) {
            an.l(j2 != C.TIME_UNSET);
            an.u(this.nalBuffers.isEmpty());
            this.presentationTimeUs = j2;
            this.nalBuffers.add(parsableByteArray);
        }
    }

    /* compiled from: WazeSource */
    public interface OutputConsumer {
        void consume(long j2, ParsableByteArray parsableByteArray);
    }

    public ReorderingBufferQueue(OutputConsumer outputConsumer) {
        this.outputConsumer = outputConsumer;
    }

    private ParsableByteArray copy(ParsableByteArray parsableByteArray) {
        ParsableByteArray parsableByteArray2 = this.unusedParsableByteArrays.isEmpty() ? new ParsableByteArray() : this.unusedParsableByteArrays.pop();
        parsableByteArray2.reset(parsableByteArray.bytesLeft());
        System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray2.getData(), 0, parsableByteArray2.bytesLeft());
        return parsableByteArray2;
    }

    private void flushQueueDownToSize(int i2) {
        while (this.pendingBuffers.size() > i2) {
            BuffersWithTimestamp buffersWithTimestampPoll = this.pendingBuffers.poll();
            int i3 = Util.SDK_INT;
            for (int i4 = 0; i4 < buffersWithTimestampPoll.nalBuffers.size(); i4++) {
                this.outputConsumer.consume(buffersWithTimestampPoll.presentationTimeUs, buffersWithTimestampPoll.nalBuffers.get(i4));
                this.unusedParsableByteArrays.push(buffersWithTimestampPoll.nalBuffers.get(i4));
            }
            buffersWithTimestampPoll.nalBuffers.clear();
            BuffersWithTimestamp buffersWithTimestamp = this.lastQueuedBuffer;
            if (buffersWithTimestamp != null && buffersWithTimestamp.presentationTimeUs == buffersWithTimestampPoll.presentationTimeUs) {
                this.lastQueuedBuffer = null;
            }
            this.unusedBuffersWithTimestamp.push(buffersWithTimestampPoll);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r5 < r0.presentationTimeUs) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void add(long r5, androidx.media3.common.util.ParsableByteArray r7) {
        /*
            r4 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L6b
            int r0 = r4.reorderingQueueSize
            if (r0 == 0) goto L6b
            r1 = -1
            if (r0 == r1) goto L2e
            java.util.PriorityQueue<androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp> r0 = r4.pendingBuffers
            int r0 = r0.size()
            int r2 = r4.reorderingQueueSize
            if (r0 < r2) goto L2e
            java.util.PriorityQueue<androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp> r0 = r4.pendingBuffers
            java.lang.Object r0 = r0.peek()
            androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp r0 = (androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) r0
            int r2 = androidx.media3.common.util.Util.SDK_INT
            r2 = r0
            androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp r2 = (androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) r2
            long r2 = r0.presentationTimeUs
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2e
            goto L6b
        L2e:
            androidx.media3.common.util.ParsableByteArray r7 = r4.copy(r7)
            androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp r0 = r4.lastQueuedBuffer
            if (r0 == 0) goto L43
            long r2 = r0.presentationTimeUs
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L3d
            goto L43
        L3d:
            java.util.List<androidx.media3.common.util.ParsableByteArray> r4 = r0.nalBuffers
            r4.add(r7)
            return
        L43:
            java.util.ArrayDeque<androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp> r0 = r4.unusedBuffersWithTimestamp
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L51
            androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp r0 = new androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp
            r0.<init>()
            goto L59
        L51:
            java.util.ArrayDeque<androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp> r0 = r4.unusedBuffersWithTimestamp
            java.lang.Object r0 = r0.pop()
            androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp r0 = (androidx.media3.container.ReorderingBufferQueue.BuffersWithTimestamp) r0
        L59:
            r0.init(r5, r7)
            java.util.PriorityQueue<androidx.media3.container.ReorderingBufferQueue$BuffersWithTimestamp> r5 = r4.pendingBuffers
            r5.add(r0)
            r4.lastQueuedBuffer = r0
            int r5 = r4.reorderingQueueSize
            if (r5 == r1) goto L6a
            r4.flushQueueDownToSize(r5)
        L6a:
            return
        L6b:
            androidx.media3.container.ReorderingBufferQueue$OutputConsumer r4 = r4.outputConsumer
            r4.consume(r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.ReorderingBufferQueue.add(long, androidx.media3.common.util.ParsableByteArray):void");
    }

    public void clear() {
        this.pendingBuffers.clear();
    }

    public void flush() {
        flushQueueDownToSize(0);
    }

    public int getMaxSize() {
        return this.reorderingQueueSize;
    }

    public void setMaxSize(int i2) {
        an.u(i2 >= 0);
        this.reorderingQueueSize = i2;
        flushQueueDownToSize(i2);
    }
}
