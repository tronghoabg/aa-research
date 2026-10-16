package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.Util;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public long getAndResetSeekPosition() {
        long j2 = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j2;
    }

    public long getLength() {
        return this.resourceLength;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public int read(byte[] bArr, int i2, int i3) {
        DataReader dataReader = this.dataReader;
        int i4 = Util.SDK_INT;
        int i5 = dataReader.read(bArr, i2, i3);
        this.currentPosition += i5;
        return i5;
    }

    public void seekToPosition(long j2) {
        this.lastSeekPosition = j2;
    }

    public void setCurrentPosition(long j2) {
        this.currentPosition = j2;
    }

    public void setDataReader(DataReader dataReader, long j2) {
        this.dataReader = dataReader;
        this.resourceLength = j2;
        this.lastSeekPosition = -1L;
    }
}
