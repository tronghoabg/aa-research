package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    static {
        MediaLibraryInfo.registerModule("media3.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j2, long j3) {
        this.dataReader = dataReader;
        this.position = j2;
        this.streamLength = j3;
    }

    private void commitBytesRead(int i2) {
        if (i2 != -1) {
            this.position += i2;
        }
    }

    private void ensureSpaceForPeek(int i2) {
        int i3 = this.peekBufferPosition + i2;
        int length = this.peekBuffer.length;
        if (i3 > length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(length + length, 65536 + i3, i3 + 524288));
        }
    }

    private int readFromPeekBuffer(byte[] bArr, int i2, int i3) {
        int i4 = this.peekBufferLength;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.peekBuffer, 0, bArr, i2, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int readFromUpstream(byte[] bArr, int i2, int i3, int i4, boolean z) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i5 = this.dataReader.read(bArr, i2 + i4, i3 - i4);
        if (i5 != -1) {
            return i4 + i5;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private int skipFromPeekBuffer(int i2) {
        int iMin = Math.min(this.peekBufferLength, i2);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i2) {
        int i3 = this.peekBufferLength - i2;
        this.peekBufferLength = i3;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i3 < bArr.length + (-524288) ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.peekBuffer = bArr2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i2, boolean z) throws EOFException, InterruptedIOException {
        ensureSpaceForPeek(i2);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i2) {
            DefaultExtractorInput defaultExtractorInput = this;
            int i3 = i2;
            boolean z2 = z;
            fromUpstream = defaultExtractorInput.readFromUpstream(this.peekBuffer, this.peekBufferPosition, i3, fromUpstream, z2);
            if (fromUpstream == -1) {
                return false;
            }
            defaultExtractorInput.peekBufferLength = defaultExtractorInput.peekBufferPosition + fromUpstream;
            this = defaultExtractorInput;
            i2 = i3;
            z = z2;
        }
        this.peekBufferPosition += i2;
        return true;
    }

    public DataReader getDataReader() {
        return this.dataReader;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iMin;
        ensureSpaceForPeek(i3);
        int i4 = this.peekBufferLength;
        int i5 = this.peekBufferPosition;
        int i6 = i4 - i5;
        if (i6 == 0) {
            defaultExtractorInput = this;
            iMin = defaultExtractorInput.readFromUpstream(this.peekBuffer, i5, i3, 0, true);
            if (iMin == -1) {
                return -1;
            }
            defaultExtractorInput.peekBufferLength += iMin;
        } else {
            defaultExtractorInput = this;
            iMin = Math.min(i3, i6);
        }
        System.arraycopy(defaultExtractorInput.peekBuffer, defaultExtractorInput.peekBufferPosition, bArr, i2, iMin);
        defaultExtractorInput.peekBufferPosition += iMin;
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i2, int i3, boolean z) {
        if (!advancePeekPosition(i3, z)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i3, bArr, i2, i3);
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
    public int read(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int fromPeekBuffer = readFromPeekBuffer(bArr, i2, i3);
        if (fromPeekBuffer == 0) {
            defaultExtractorInput = this;
            fromPeekBuffer = defaultExtractorInput.readFromUpstream(bArr, i2, i3, 0, true);
        } else {
            defaultExtractorInput = this;
        }
        defaultExtractorInput.commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i2, int i3, boolean z) throws EOFException, InterruptedIOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i2, i3);
        while (fromPeekBuffer < i3 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i2, i3, fromPeekBuffer, z);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // androidx.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j2, E e2) throws E {
        an.l(j2 >= 0);
        this.position = j2;
        throw e2;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i2) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i2);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            defaultExtractorInput = this;
            iSkipFromPeekBuffer = defaultExtractorInput.readFromUpstream(bArr, 0, Math.min(i2, bArr.length), 0, true);
        } else {
            defaultExtractorInput = this;
        }
        defaultExtractorInput.commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i2, boolean z) throws EOFException, InterruptedIOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i2);
        while (iSkipFromPeekBuffer < i2 && iSkipFromPeekBuffer != -1) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, -iSkipFromPeekBuffer, Math.min(i2, bArr.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i2, int i3) {
        peekFully(bArr, i2, i3, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i2, int i3) throws EOFException, InterruptedIOException {
        readFully(bArr, i2, i3, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i2) throws EOFException, InterruptedIOException {
        skipFully(i2, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i2) throws EOFException, InterruptedIOException {
        advancePeekPosition(i2, false);
    }
}
