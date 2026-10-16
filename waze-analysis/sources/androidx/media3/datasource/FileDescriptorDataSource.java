package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.google.d.d.fo;
import j$.nio.channels.DesugarChannels;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class FileDescriptorDataSource extends BaseDataSource {
    private static final Set<FileDescriptor> inUseFileDescriptors = fo.f();
    private long bytesRemaining;
    private final FileDescriptor fileDescriptor;
    private FileInputStream inputStream;
    private final long length;
    private final long offset;
    private boolean opened;
    private Uri uri;

    public FileDescriptorDataSource(FileDescriptor fileDescriptor, long j2, long j3) {
        super(false);
        an.B(fileDescriptor);
        this.fileDescriptor = fileDescriptor;
        this.offset = j2;
        this.length = j3;
    }

    private static void seekFileDescriptor(FileDescriptor fileDescriptor, long j2) throws DataSourceException, ErrnoException {
        try {
            Os.lseek(fileDescriptor, j2, OsConstants.SEEK_SET);
        } catch (ErrnoException e2) {
            throw new DataSourceException(e2, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        this.uri = null;
        inUseFileDescriptors.remove(this.fileDescriptor);
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            } catch (IOException e2) {
                throw new DataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException, ErrnoException {
        long jPosition;
        try {
            this.uri = dataSpec.uri;
            transferInitializing(dataSpec);
            if (!inUseFileDescriptors.add(this.fileDescriptor)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            long j2 = this.length;
            if (j2 != -1 && dataSpec.position > j2) {
                throw new DataSourceException(2008);
            }
            seekFileDescriptor(this.fileDescriptor, this.offset + dataSpec.position);
            FileInputStream fileInputStream = new FileInputStream(this.fileDescriptor);
            this.inputStream = fileInputStream;
            long j3 = this.length;
            if (j3 == -1) {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                long size = fileChannelConvertMaybeLegacyFileChannelFromLibrary.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                    jPosition = -1;
                } else {
                    jPosition = size - fileChannelConvertMaybeLegacyFileChannelFromLibrary.position();
                    this.bytesRemaining = jPosition;
                    if (jPosition < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            } else {
                jPosition = j3 - dataSpec.position;
                this.bytesRemaining = jPosition;
                if (jPosition < 0) {
                    throw new DataSourceException(2008);
                }
            }
            long jMin = dataSpec.length;
            if (jMin != -1) {
                if (jPosition != -1) {
                    jMin = Math.min(jPosition, jMin);
                }
                this.bytesRemaining = jMin;
            }
            this.opened = true;
            transferStarted(dataSpec);
            long j4 = dataSpec.length;
            return j4 != -1 ? j4 : this.bytesRemaining;
        } catch (DataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new DataSourceException(e3, true != (e3 instanceof FileNotFoundException) ? 2000 : 2005);
        }
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
            FileInputStream fileInputStream = this.inputStream;
            int i4 = Util.SDK_INT;
            int i5 = fileInputStream.read(bArr, i2, i3);
            if (i5 == -1) {
                return -1;
            }
            long j3 = this.bytesRemaining;
            if (j3 != -1) {
                this.bytesRemaining = j3 - i5;
            }
            bytesTransferred(i5);
            return i5;
        } catch (IOException e2) {
            throw new DataSourceException(e2, 2000);
        }
    }
}
