package androidx.media3.datasource;

import android.net.Uri;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;
    private byte[] data;
    private boolean opened;
    private int readPosition;
    private Uri uri;
    private final UriResolver uriResolver;

    /* compiled from: WazeSource */
    public interface UriResolver {
        byte[] resolve(Uri uri);
    }

    public ByteArrayDataSource(final byte[] bArr) {
        this(new UriResolver() { // from class: androidx.media3.datasource.ByteArrayDataSource$$ExternalSyntheticLambda0
            @Override // androidx.media3.datasource.ByteArrayDataSource.UriResolver
            public final byte[] resolve(Uri uri) {
                return bArr;
            }
        });
        an.l(bArr.length > 0);
    }

    static /* synthetic */ byte[] lambda$new$0(byte[] bArr, Uri uri) {
        return bArr;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
        this.data = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws DataSourceException {
        transferInitializing(dataSpec);
        Uri uri = dataSpec.uri;
        this.uri = uri;
        this.data = this.uriResolver.resolve(uri);
        long j2 = dataSpec.position;
        int length = this.data.length;
        if (j2 > length) {
            throw new DataSourceException(2008);
        }
        int i2 = (int) j2;
        this.readPosition = i2;
        int i3 = length - i2;
        this.bytesRemaining = i3;
        long j3 = dataSpec.length;
        if (j3 != -1) {
            this.bytesRemaining = (int) Math.min(i3, j3);
        }
        this.opened = true;
        transferStarted(dataSpec);
        long j4 = dataSpec.length;
        return j4 != -1 ? j4 : this.bytesRemaining;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.bytesRemaining;
        if (i4 == 0) {
            return -1;
        }
        int iMin = Math.min(i3, i4);
        byte[] bArr2 = this.data;
        an.B(bArr2);
        System.arraycopy(bArr2, this.readPosition, bArr, i2, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }

    public ByteArrayDataSource(UriResolver uriResolver) {
        super(false);
        an.B(uriResolver);
        this.uriResolver = uriResolver;
    }
}
