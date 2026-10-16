package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import com.google.d.b.an;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class IcyDataSource implements DataSource {
    private int bytesUntilMetadata;
    private final Listener listener;
    private final int metadataIntervalBytes;
    private final byte[] metadataLengthByteHolder;
    private final DataSource upstream;

    /* compiled from: WazeSource */
    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    public IcyDataSource(DataSource dataSource, int i2, Listener listener) {
        an.l(i2 > 0);
        this.upstream = dataSource;
        this.metadataIntervalBytes = i2;
        this.listener = listener;
        this.metadataLengthByteHolder = new byte[1];
        this.bytesUntilMetadata = i2;
    }

    private boolean readMetadata() {
        if (this.upstream.read(this.metadataLengthByteHolder, 0, 1) == -1) {
            return false;
        }
        int i2 = (this.metadataLengthByteHolder[0] & 255) << 4;
        if (i2 == 0) {
            return true;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i4 = 0;
        while (i3 > 0) {
            int i5 = this.upstream.read(bArr, i4, i3);
            if (i5 == -1) {
                return false;
            }
            i4 += i5;
            i3 -= i5;
        }
        while (i2 > 0) {
            int i6 = i2 - 1;
            if (bArr[i6] != 0) {
                break;
            }
            i2 = i6;
        }
        if (i2 > 0) {
            this.listener.onIcyMetadata(new ParsableByteArray(bArr, i2));
        }
        return true;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        an.B(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = this.bytesUntilMetadata;
        if (i4 == 0) {
            if (!readMetadata()) {
                return -1;
            }
            i4 = this.metadataIntervalBytes;
            this.bytesUntilMetadata = i4;
        }
        int i5 = this.upstream.read(bArr, i2, Math.min(i4, i3));
        if (i5 != -1) {
            this.bytesUntilMetadata -= i5;
        }
        return i5;
    }
}
