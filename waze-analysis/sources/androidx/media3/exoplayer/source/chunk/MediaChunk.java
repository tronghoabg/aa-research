package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.Format;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class MediaChunk extends Chunk {
    public final long chunkIndex;

    public MediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i2, Object obj, long j2, long j3, long j4) {
        super(dataSource, dataSpec, 1, format, i2, obj, j2, j3);
        an.B(format);
        this.chunkIndex = j4;
    }

    public long getNextChunkIndex() {
        long j2 = this.chunkIndex;
        if (j2 != -1) {
            return j2 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();
}
