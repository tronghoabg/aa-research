package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i2, Format format, int i3, Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i2, format, i3, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.data = bArr == null ? Util.EMPTY_BYTE_ARRAY : bArr;
    }

    private void maybeExpandData(int i2) {
        byte[] bArr = this.data;
        int length = bArr.length;
        if (length < i2 + 16384) {
            this.data = Arrays.copyOf(bArr, length + 16384);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    protected abstract void consume(byte[] bArr, int i2);

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        try {
            this.dataSource.open(this.dataSpec);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.loadCanceled) {
                maybeExpandData(i3);
                i2 = this.dataSource.read(this.data, i3, 16384);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i3);
            }
        } finally {
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }
}
