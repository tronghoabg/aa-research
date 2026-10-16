package androidx.tracing;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TraceAttributesImpl extends TraceAttributes {
    public TraceEvent event;
    public SliceTrack owner;

    private final AttributeEntry nextAttributeEntry() {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastAttributeIndex + 1;
        traceEvent.lastAttributeIndex = i2;
        if (i2 >= traceEvent.attributes.size()) {
            traceEvent.attributes.add(new AttributeEntry(null, null, null, 7, null));
        }
        return traceEvent.attributes.get(traceEvent.lastAttributeIndex);
    }

    @Override // androidx.tracing.TraceAttributes
    public void addAttribute(String str, long j2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastAttributeIndex + 1;
        traceEvent.lastAttributeIndex = i2;
        if (i2 >= traceEvent.attributes.size()) {
            traceEvent.attributes.add(new AttributeEntry(null, null, null, 7, null));
        }
        AttributeEntry attributeEntry = traceEvent.attributes.get(traceEvent.lastAttributeIndex);
        attributeEntry.name = str;
        attributeEntry.longValue = Long.valueOf(j2);
    }

    @Override // androidx.tracing.TraceAttributes
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

    @Override // androidx.tracing.TraceAttributes
    public void addAttribute(String str, String str2) {
        TraceEvent traceEvent = this.event;
        x.c(traceEvent);
        int i2 = traceEvent.lastAttributeIndex + 1;
        traceEvent.lastAttributeIndex = i2;
        if (i2 >= traceEvent.attributes.size()) {
            traceEvent.attributes.add(new AttributeEntry(null, null, null, 7, null));
        }
        AttributeEntry attributeEntry = traceEvent.attributes.get(traceEvent.lastAttributeIndex);
        attributeEntry.name = str;
        attributeEntry.stringValue = str2;
    }
}
