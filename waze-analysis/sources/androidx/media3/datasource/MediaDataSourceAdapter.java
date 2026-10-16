package androidx.media3.datasource;

import android.media.MediaDataSource;
import android.net.Uri;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MediaDataSourceAdapter extends BaseDataSource {
    private long bytesRemaining;
    private final MediaDataSource mediaDataSource;
    private boolean opened;
    private long position;
    private Uri uri;

    public MediaDataSourceAdapter(MediaDataSource mediaDataSource, boolean z) {
        super(z);
        this.mediaDataSource = mediaDataSource;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        long size;
        this.uri = dataSpec.uri;
        this.position = dataSpec.position;
        transferInitializing(dataSpec);
        if (this.mediaDataSource.getSize() != -1 && this.position > this.mediaDataSource.getSize()) {
            throw new DataSourceException(2008);
        }
        if (this.mediaDataSource.getSize() == -1) {
            this.bytesRemaining = -1L;
            size = -1;
        } else {
            size = this.mediaDataSource.getSize() - this.position;
            this.bytesRemaining = size;
        }
        long jMin = dataSpec.length;
        if (jMin != -1) {
            if (size != -1) {
                jMin = Math.min(size, jMin);
            }
            this.bytesRemaining = jMin;
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j2 = dataSpec.length;
        return j2 != -1 ? j2 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.bytesRemaining;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            i3 = (int) Math.min(j2, i3);
        }
        try {
            int at = this.mediaDataSource.readAt(this.position, bArr, i2, i3);
            if (at == -1) {
                return -1;
            }
            long j3 = at;
            this.position += j3;
            long j4 = this.bytesRemaining;
            if (j4 != -1) {
                this.bytesRemaining = j4 - j3;
            }
            bytesTransferred(at);
            return at;
        } catch (IOException e2) {
            throw new DataSourceException(e2, 2000);
        }
    }
}
