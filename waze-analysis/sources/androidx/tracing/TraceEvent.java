package androidx.tracing;

import androidx.camera.video.AudioStats;
import h.a.i;
import h.ab;
import h.g.a.l;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
@DelicateTracingApi
/* loaded from: classes4.dex */
public final class TraceEvent {
    public List<AttributeEntry> attributes;
    public List<String> categories;
    public Long correlationId;
    public String correlationIdString;
    public Double counterDoubleValue;
    public Long counterLongValue;
    public List<Long> flowIds;
    public List<Frame> frames;
    public int lastAttributeIndex;
    public int lastCategoryIndex;
    public int lastFrameIndex;
    public int lastMetadataEntryIndex;
    public List<MetadataEntry> metadataEntries;
    public String name;
    public String primaryCategory;
    public long timestamp;
    public TrackDescriptor trackDescriptor;
    public long trackUuid;
    public int type;

    public TraceEvent() {
        List listH = i.h();
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(4);
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList3.add("");
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(4);
        for (int i4 = 0; i4 < 4; i4++) {
            arrayList5.add(new Frame(null, null, 0, 7, null));
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(4);
        for (int i5 = 0; i5 < 4; i5++) {
            arrayList7.add(new AttributeEntry(null, null, null, 7, null));
        }
        this(0, 0L, 0L, null, null, null, null, null, listH, null, "", arrayList2, -1, arrayList4, 0, arrayList6, -1, arrayList7, -1);
    }

    public final void copyFrom(TraceEvent traceEvent) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.type = traceEvent.type;
        this.trackUuid = traceEvent.trackUuid;
        this.timestamp = traceEvent.timestamp;
        this.name = traceEvent.name;
        this.counterDoubleValue = traceEvent.counterDoubleValue;
        this.counterLongValue = traceEvent.counterLongValue;
        this.correlationId = traceEvent.correlationId;
        this.correlationIdString = traceEvent.correlationIdString;
        this.flowIds = traceEvent.flowIds;
        this.trackDescriptor = traceEvent.trackDescriptor;
        this.primaryCategory = traceEvent.primaryCategory;
        this.lastMetadataEntryIndex = traceEvent.lastMetadataEntryIndex;
        while (true) {
            int size = this.metadataEntries.size();
            i2 = this.lastMetadataEntryIndex;
            if (size > i2) {
                break;
            }
            this.metadataEntries.add(new MetadataEntry(null, 0, false, 0L, AudioStats.AUDIO_AMPLITUDE_NONE, null, 63, null));
        }
        int i6 = 0;
        if (i2 >= 0) {
            int i7 = 0;
            while (true) {
                MetadataEntry metadataEntry = traceEvent.metadataEntries.get(i7);
                MetadataEntry metadataEntry2 = this.metadataEntries.get(i7);
                metadataEntry2.name = metadataEntry.name;
                metadataEntry2.type = metadataEntry.type;
                metadataEntry2.booleanValue = metadataEntry.booleanValue;
                metadataEntry2.longValue = metadataEntry.longValue;
                metadataEntry2.doubleValue = metadataEntry.doubleValue;
                metadataEntry2.stringValue = metadataEntry.stringValue;
                if (i7 == i2) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        int size2 = this.metadataEntries.size();
        for (int i8 = this.lastMetadataEntryIndex + 1; i8 < size2; i8++) {
            this.metadataEntries.get(i8).reset();
        }
        this.lastCategoryIndex = traceEvent.lastCategoryIndex;
        while (true) {
            int size3 = this.categories.size();
            i3 = this.lastCategoryIndex;
            if (size3 > i3) {
                break;
            } else {
                this.categories.add("");
            }
        }
        if (i3 >= 0) {
            int i9 = 0;
            while (true) {
                this.categories.set(i9, traceEvent.categories.get(i9));
                if (i9 == i3) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        int size4 = this.categories.size();
        for (int i10 = this.lastCategoryIndex + 1; i10 < size4; i10++) {
            this.categories.set(i10, "");
        }
        this.lastFrameIndex = traceEvent.lastFrameIndex;
        while (true) {
            int size5 = this.frames.size();
            i4 = this.lastFrameIndex;
            if (size5 > i4) {
                break;
            }
            this.frames.add(new Frame(null, null, 0, 7, null));
        }
        if (i4 >= 0) {
            int i11 = 0;
            while (true) {
                Frame frame = traceEvent.frames.get(i11);
                Frame frame2 = this.frames.get(i11);
                frame2.name = frame.name;
                frame2.sourceFile = frame.sourceFile;
                frame2.lineNumber = frame.lineNumber;
                if (i11 == i4) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        int size6 = this.frames.size();
        for (int i12 = this.lastFrameIndex + 1; i12 < size6; i12++) {
            this.frames.get(i12).reset();
        }
        this.lastAttributeIndex = traceEvent.lastAttributeIndex;
        while (true) {
            int size7 = this.attributes.size();
            i5 = this.lastAttributeIndex;
            if (size7 > i5) {
                break;
            }
            this.attributes.add(new AttributeEntry(null, null, null, 7, null));
        }
        if (i5 >= 0) {
            while (true) {
                AttributeEntry attributeEntry = traceEvent.attributes.get(i6);
                AttributeEntry attributeEntry2 = this.attributes.get(i6);
                attributeEntry2.name = attributeEntry.name;
                attributeEntry2.longValue = attributeEntry.longValue;
                attributeEntry2.stringValue = attributeEntry.stringValue;
                if (i6 == i5) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        int size8 = this.attributes.size();
        for (int i13 = this.lastAttributeIndex + 1; i13 < size8; i13++) {
            this.attributes.get(i13).reset();
        }
    }

    public final void forEachMetadataEntry(l<? super MetadataEntry, ab> lVar) {
        int i2 = this.lastMetadataEntryIndex + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            lVar.invoke(this.metadataEntries.get(i3));
        }
    }

    public final void reset() {
        this.type = 0;
        this.trackUuid = 0L;
        this.timestamp = 0L;
        this.name = null;
        this.counterDoubleValue = null;
        this.counterLongValue = null;
        this.correlationId = null;
        this.correlationIdString = null;
        this.flowIds = i.h();
        this.trackDescriptor = null;
        this.primaryCategory = "";
        int i2 = this.lastMetadataEntryIndex;
        if (i2 >= 0) {
            int i3 = i2 + 1;
            for (int i4 = 0; i4 < i3; i4++) {
                this.metadataEntries.get(i4).reset();
            }
            if (this.lastMetadataEntryIndex >= 4) {
                this.metadataEntries = this.metadataEntries.subList(0, 4);
            }
            this.lastMetadataEntryIndex = -1;
        }
        int i5 = this.lastCategoryIndex;
        if (i5 > 0) {
            int i6 = i5 + 1;
            for (int i7 = 0; i7 < i6; i7++) {
                this.categories.set(i7, "");
            }
            if (this.lastCategoryIndex >= 4) {
                this.categories = this.categories.subList(0, 4);
            }
            this.lastCategoryIndex = 0;
        }
        int i8 = this.lastFrameIndex;
        if (i8 >= 0) {
            int i9 = i8 + 1;
            for (int i10 = 0; i10 < i9; i10++) {
                this.frames.get(i10).reset();
            }
            if (this.lastFrameIndex >= 4) {
                this.frames = this.frames.subList(0, 4);
            }
            this.lastFrameIndex = -1;
        }
        int i11 = this.lastAttributeIndex;
        if (i11 >= 0) {
            int i12 = i11 + 1;
            for (int i13 = 0; i13 < i12; i13++) {
                this.attributes.get(i13).reset();
            }
            if (this.lastAttributeIndex >= 4) {
                this.attributes = this.attributes.subList(0, 4);
            }
            this.lastAttributeIndex = -1;
        }
    }

    public final void setBeginSection(long j2, String str) {
        this.type = 1;
        this.trackUuid = j2;
        this.timestamp = System.nanoTime();
        this.name = str;
    }

    public final void setBeginSectionWithFlows(long j2, String str, List<Long> list) {
        this.type = 1;
        this.trackUuid = j2;
        this.timestamp = System.nanoTime();
        this.flowIds = list;
        this.name = str;
    }

    public final void setCounterDouble(long j2, double d2) {
        this.type = 4;
        this.trackUuid = j2;
        this.timestamp = System.nanoTime();
        this.counterDoubleValue = Double.valueOf(d2);
    }

    public final void setCounterLong(long j2, long j3) {
        this.type = 4;
        this.trackUuid = j2;
        this.timestamp = System.nanoTime();
        this.counterLongValue = Long.valueOf(j3);
    }

    public final void setEndSection(long j2) {
        this.type = 2;
        this.trackUuid = j2;
        this.timestamp = System.nanoTime();
    }

    public final void setInstant(long j2, String str) {
        this.type = 3;
        this.trackUuid = j2;
        this.timestamp = System.nanoTime();
        this.name = str;
    }

    public final void setPreamble$tracing(TrackDescriptor trackDescriptor) {
        this.trackDescriptor = trackDescriptor;
        this.timestamp = System.nanoTime();
    }

    public TraceEvent(int i2, long j2, long j3, String str, Double d2, Long l2, Long l3, String str2, List<Long> list, TrackDescriptor trackDescriptor, String str3, List<MetadataEntry> list2, int i3, List<String> list3, int i4, List<Frame> list4, int i5, List<AttributeEntry> list5, int i6) {
        this.type = i2;
        this.trackUuid = j2;
        this.timestamp = j3;
        this.name = str;
        this.counterDoubleValue = d2;
        this.counterLongValue = l2;
        this.correlationId = l3;
        this.correlationIdString = str2;
        this.flowIds = list;
        this.trackDescriptor = trackDescriptor;
        this.primaryCategory = str3;
        this.metadataEntries = list2;
        this.lastMetadataEntryIndex = i3;
        this.categories = list3;
        this.lastCategoryIndex = i4;
        this.frames = list4;
        this.lastFrameIndex = i5;
        this.attributes = list5;
        this.lastAttributeIndex = i6;
    }
}
