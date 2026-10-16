package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(dataSource, dataSpec, format, i2, obj, j2, j3, j6);
        this.clippedStartTimeUs = j4;
        this.clippedEndTimeUs = j5;
    }

    public final int getFirstSampleIndex(int i2) {
        int[] iArr = this.firstSampleIndices;
        an.B(iArr);
        return iArr[i2];
    }

    protected final BaseMediaChunkOutput getOutput() {
        BaseMediaChunkOutput baseMediaChunkOutput = this.output;
        an.B(baseMediaChunkOutput);
        return baseMediaChunkOutput;
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
