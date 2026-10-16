package androidx.media3.exoplayer.upstream.experimental;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface BandwidthStatistic {
    void addSample(long j2, long j3);

    long getBandwidthEstimate();

    void reset();
}
