package androidx.tracing;

import androidx.camera.video.AudioStats;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TraceEventScope extends EventMetadata {
    public TraceEvent event;
    public SliceTrack owner;

    private final Frame nextCallStackEntry() {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastFrameIndex + 1;
        traceEvent.lastFrameIndex = i2;
        if (i2 >= traceEvent.frames.size()) {
            traceEvent.frames.add(new Frame(null, null, 0, 7, null));
        }
        return traceEvent.frames.get(traceEvent.lastFrameIndex);
    }

    private final MetadataEntry nextMetadataEntry() {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastMetadataEntryIndex + 1;
        traceEvent.lastMetadataEntryIndex = i2;
        if (i2 >= traceEvent.metadataEntries.size()) {
            traceEvent.metadataEntries.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        return traceEvent.metadataEntries.get(traceEvent.lastMetadataEntryIndex);
    }

    @Override // androidx.tracing.EventMetadata
    public void addCallStackEntry(String str, String str2, int i2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i3 = traceEvent.lastFrameIndex + 1;
        traceEvent.lastFrameIndex = i3;
        if (i3 >= traceEvent.frames.size()) {
            traceEvent.frames.add(new Frame(null, null, 0, 7, null));
        }
        Frame frame = traceEvent.frames.get(traceEvent.lastFrameIndex);
        frame.name = str;
        frame.sourceFile = str2;
        frame.lineNumber = i2;
    }

    @Override // androidx.tracing.EventMetadata
    public void addCategory(String str) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastCategoryIndex + 1;
        traceEvent.lastCategoryIndex = i2;
        if (i2 >= traceEvent.categories.size()) {
            traceEvent.categories.add("");
        }
        traceEvent.categories.set(traceEvent.lastCategoryIndex, str);
    }

    @Override // androidx.tracing.EventMetadata
    public void addCorrelationId(long j2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        traceEvent.correlationId = Long.valueOf(j2);
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, double d2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastMetadataEntryIndex + 1;
        traceEvent.lastMetadataEntryIndex = i2;
        if (i2 >= traceEvent.metadataEntries.size()) {
            traceEvent.metadataEntries.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        MetadataEntry metadataEntry = traceEvent.metadataEntries.get(traceEvent.lastMetadataEntryIndex);
        metadataEntry.name = str;
        metadataEntry.type = 3;
        metadataEntry.doubleValue = d2;
    }

    @Override // androidx.tracing.EventMetadata
    @DelicateTracingApi
    public void dispatchToTraceSink() {
        PooledTracePacketArray pooledTracePacketArray;
        ProtoPool protoPool;
        TraceEvent[] traceEventArr;
        SliceTrack sliceTrack = this.owner;
        x.c(sliceTrack);
        SliceTrack sliceTrack2 = sliceTrack;
        if (this.event == null || (pooledTracePacketArray = sliceTrack2.currentPacketArray) == null) {
            return;
        }
        PooledTracePacketArray pooledTracePacketArray2 = sliceTrack2.currentPacketArray;
        Integer numValueOf = null;
        if (pooledTracePacketArray2 != null && (traceEventArr = pooledTracePacketArray2.packets) != null) {
            numValueOf = Integer.valueOf(traceEventArr.length);
        }
        pooledTracePacketArray.fillCount++;
        int i2 = pooledTracePacketArray.fillCount;
        if (numValueOf == null || i2 != numValueOf.intValue()) {
            return;
        }
        sliceTrack2.context.sink.enqueue(pooledTracePacketArray);
        ProtoPool protoPool2 = sliceTrack2.pool;
        if (protoPool2 == null) {
            synchronized (sliceTrack2.lock) {
                protoPool = sliceTrack2.pool;
                if (protoPool == null) {
                    protoPool = new ProtoPool(sliceTrack2.context.isDebug);
                    sliceTrack2.pool = protoPool;
                }
            }
            protoPool2 = protoPool;
        }
        sliceTrack2.currentPacketArray = protoPool2.obtainTracePacketArray();
    }

    @Override // androidx.tracing.EventMetadata
    public void addCorrelationId(String str) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        traceEvent.correlationIdString = str;
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, long j2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastMetadataEntryIndex + 1;
        traceEvent.lastMetadataEntryIndex = i2;
        if (i2 >= traceEvent.metadataEntries.size()) {
            traceEvent.metadataEntries.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        MetadataEntry metadataEntry = traceEvent.metadataEntries.get(traceEvent.lastMetadataEntryIndex);
        metadataEntry.name = str;
        metadataEntry.type = 2;
        metadataEntry.longValue = j2;
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, String str2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastMetadataEntryIndex + 1;
        traceEvent.lastMetadataEntryIndex = i2;
        if (i2 >= traceEvent.metadataEntries.size()) {
            traceEvent.metadataEntries.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        MetadataEntry metadataEntry = traceEvent.metadataEntries.get(traceEvent.lastMetadataEntryIndex);
        metadataEntry.name = str;
        metadataEntry.type = 4;
        metadataEntry.stringValue = str2;
    }

    @Override // androidx.tracing.EventMetadata
    public void addMetadataEntry(String str, boolean z) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastMetadataEntryIndex + 1;
        traceEvent.lastMetadataEntryIndex = i2;
        if (i2 >= traceEvent.metadataEntries.size()) {
            traceEvent.metadataEntries.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        MetadataEntry metadataEntry = traceEvent.metadataEntries.get(traceEvent.lastMetadataEntryIndex);
        metadataEntry.name = str;
        metadataEntry.type = 1;
        metadataEntry.booleanValue = z;
    }
}
