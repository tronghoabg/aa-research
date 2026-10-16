package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ContentCaptureEvent {
    private final int id;
    private final ViewStructureCompat structureCompat;
    private final long timestamp;
    private final ContentCaptureEventType type;

    public ContentCaptureEvent(int i2, long j2, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        this.id = i2;
        this.timestamp = j2;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i2, long j2, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = contentCaptureEvent.id;
        }
        if ((i3 & 2) != 0) {
            j2 = contentCaptureEvent.timestamp;
        }
        if ((i3 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        if ((i3 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i2, j2, contentCaptureEventType, viewStructureCompat);
    }

    public final int component1() {
        return this.id;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final ContentCaptureEventType component3() {
        return this.type;
    }

    public final ViewStructureCompat component4() {
        return this.structureCompat;
    }

    public final ContentCaptureEvent copy(int i2, long j2, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat) {
        return new ContentCaptureEvent(i2, j2, contentCaptureEventType, viewStructureCompat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.id == contentCaptureEvent.id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && x.n(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int getId() {
        return this.id;
    }

    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM = (((this.id * 31) + ContentCaptureEvent$$ExternalSyntheticBackport0.m(this.timestamp)) * 31) + this.type.hashCode();
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return (iM * 31) + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    public String toString() {
        return "ContentCaptureEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}
