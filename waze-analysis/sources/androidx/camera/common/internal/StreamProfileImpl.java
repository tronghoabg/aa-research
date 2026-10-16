package androidx.camera.common.internal;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamProfileImpl extends StreamProfile {
    private final int format;
    private final StreamSize size;

    public StreamProfileImpl(int i2, StreamSize streamSize) {
        x.f(streamSize, "size");
        this.format = i2;
        this.size = streamSize;
    }

    public static /* synthetic */ StreamProfileImpl copy$default(StreamProfileImpl streamProfileImpl, int i2, StreamSize streamSize, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = streamProfileImpl.format;
        }
        if ((i3 & 2) != 0) {
            streamSize = streamProfileImpl.size;
        }
        return streamProfileImpl.copy(i2, streamSize);
    }

    public final int component1() {
        return this.format;
    }

    public final StreamSize component2() {
        return this.size;
    }

    public final StreamProfileImpl copy(int i2, StreamSize streamSize) {
        x.f(streamSize, "size");
        return new StreamProfileImpl(i2, streamSize);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamProfileImpl)) {
            return false;
        }
        StreamProfileImpl streamProfileImpl = (StreamProfileImpl) obj;
        return this.format == streamProfileImpl.format && x.n(this.size, streamProfileImpl.size);
    }

    @Override // androidx.camera.common.internal.StreamProfile
    public int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.common.internal.StreamProfile
    public StreamSize getSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.format * 31) + this.size.hashCode();
    }

    public String toString() {
        return "StreamProfileImpl(format=" + this.format + ", size=" + this.size + ")";
    }
}
