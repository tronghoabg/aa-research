package androidx.media3.muxer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BufferInfo {
    public final int flags;
    public final long presentationTimeUs;
    public final int size;

    public BufferInfo(long j2, int i2, int i3) {
        this.presentationTimeUs = j2;
        this.size = i2;
        this.flags = i3;
    }
}
