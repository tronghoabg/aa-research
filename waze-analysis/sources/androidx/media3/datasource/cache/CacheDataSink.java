package androidx.media3.datasource.cache;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import com.google.d.b.an;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CacheDataSink implements DataSink {
    public static final int DEFAULT_BUFFER_SIZE = 20480;
    public static final long DEFAULT_FRAGMENT_SIZE = 5242880;
    private static final long MIN_RECOMMENDED_FRAGMENT_SIZE = 2097152;
    private static final String TAG = "CacheDataSink";
    private final int bufferSize;
    private ReusableBufferedOutputStream bufferedOutputStream;
    private final Cache cache;
    private DataSpec dataSpec;
    private long dataSpecBytesWritten;
    private long dataSpecFragmentSize;
    private File file;
    private final long fragmentSize;
    private OutputStream outputStream;
    private long outputStreamBytesWritten;

    /* compiled from: WazeSource */
    public final class CacheDataSinkException extends Cache.CacheException {
        public CacheDataSinkException(IOException iOException) {
            super(iOException);
        }
    }

    /* compiled from: WazeSource */
    public final class Factory implements DataSink.Factory {
        private Cache cache;
        private long fragmentSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
        private int bufferSize = CacheDataSink.DEFAULT_BUFFER_SIZE;

        @Override // androidx.media3.datasource.DataSink.Factory
        public DataSink createDataSink() {
            Cache cache = this.cache;
            an.B(cache);
            return new CacheDataSink(cache, this.fragmentSize, this.bufferSize);
        }

        public Factory setBufferSize(int i2) {
            this.bufferSize = i2;
            return this;
        }

        public Factory setCache(Cache cache) {
            this.cache = cache;
            return this;
        }

        public Factory setFragmentSize(long j2) {
            this.fragmentSize = j2;
            return this;
        }
    }

    public CacheDataSink(Cache cache, long j2, int i2) {
        boolean z = true;
        if (j2 <= 0) {
            if (j2 == -1) {
                j2 = -1;
            } else {
                z = false;
            }
        }
        an.v(z, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j2 != -1 && j2 < MIN_RECOMMENDED_FRAGMENT_SIZE) {
            Log.w(TAG, "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        an.B(cache);
        this.cache = cache;
        this.fragmentSize = j2 == -1 ? Long.MAX_VALUE : j2;
        this.bufferSize = i2;
    }

    private void closeCurrentOutputStream() throws IOException {
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.flush();
                Util.closeQuietly(this.outputStream);
                this.outputStream = null;
                File file = this.file;
                this.file = null;
                this.cache.commitFile(file, this.outputStreamBytesWritten);
            } catch (Throwable th) {
                Util.closeQuietly(this.outputStream);
                this.outputStream = null;
                File file2 = this.file;
                this.file = null;
                file2.delete();
                throw th;
            }
        }
    }

    private void openNextOutputStream(DataSpec dataSpec) {
        long j2 = dataSpec.length;
        long jMin = j2 != -1 ? Math.min(j2 - this.dataSpecBytesWritten, this.dataSpecFragmentSize) : -1L;
        Cache cache = this.cache;
        String str = dataSpec.key;
        int i2 = Util.SDK_INT;
        this.file = cache.startFile(str, dataSpec.position + this.dataSpecBytesWritten, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.file);
        int i3 = this.bufferSize;
        if (i3 > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream = this.bufferedOutputStream;
            if (reusableBufferedOutputStream == null) {
                this.bufferedOutputStream = new ReusableBufferedOutputStream(fileOutputStream, i3);
            } else {
                reusableBufferedOutputStream.reset(fileOutputStream);
            }
            this.outputStream = this.bufferedOutputStream;
        } else {
            this.outputStream = fileOutputStream;
        }
        this.outputStreamBytesWritten = 0L;
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() throws CacheDataSinkException {
        if (this.dataSpec == null) {
            return;
        }
        try {
            closeCurrentOutputStream();
        } catch (IOException e2) {
            throw new CacheDataSinkException(e2);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(DataSpec dataSpec) throws CacheDataSinkException {
        an.B(dataSpec.key);
        if (dataSpec.length == -1 && dataSpec.isFlagSet(2)) {
            this.dataSpec = null;
            return;
        }
        this.dataSpec = dataSpec;
        this.dataSpecFragmentSize = dataSpec.isFlagSet(4) ? this.fragmentSize : Long.MAX_VALUE;
        this.dataSpecBytesWritten = 0L;
        try {
            openNextOutputStream(dataSpec);
        } catch (IOException e2) {
            throw new CacheDataSinkException(e2);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            int i4 = 0;
            while (i4 < i3) {
                try {
                    if (this.outputStreamBytesWritten == this.dataSpecFragmentSize) {
                        closeCurrentOutputStream();
                        openNextOutputStream(dataSpec);
                    }
                    int iMin = (int) Math.min(i3 - i4, this.dataSpecFragmentSize - this.outputStreamBytesWritten);
                    OutputStream outputStream = this.outputStream;
                    int i5 = Util.SDK_INT;
                    outputStream.write(bArr, i2 + i4, iMin);
                    i4 += iMin;
                    long j2 = iMin;
                    this.outputStreamBytesWritten += j2;
                    this.dataSpecBytesWritten += j2;
                } catch (IOException e2) {
                    throw new CacheDataSinkException(e2);
                }
            }
        }
    }

    public CacheDataSink(Cache cache, long j2) {
        this(cache, j2, DEFAULT_BUFFER_SIZE);
    }
}
